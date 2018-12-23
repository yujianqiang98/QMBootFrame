package com.qm.code.sercurity;

import com.qm.frame.qmsecurity.entity.QmPermissions;
import com.qm.frame.qmsecurity.basic.QmSecurityRealm;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2018浅梦工作室}. All rights reserved.
 *
 * @author 浅梦
 * @date 2018/12/23 2:20
 * @Description: 自定义realm
 */
public class MyRealm implements QmSecurityRealm {

    @Override
    public QmPermissions authorizationPermissions(int roleId) {
        QmPermissions qmPermissions = new QmPermissions();
        List<String> permission = new ArrayList<>();
        permission.add("/**");
        qmPermissions.setRoleId(roleId);
        qmPermissions.setMatchUrls(permission);
        return qmPermissions;
    }
}