package com.yandex.passport.internal.properties;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m3;

/* loaded from: classes15.dex */
public final class f {
    public static BindPhoneProperties a(com.yandex.passport.api.c0 c0Var) {
        WebAmProperties webAmProperties;
        PassportTheme theme = c0Var.getTheme();
        k2 uid = c0Var.getUid();
        PassportUidImpl.Companion.getClass();
        PassportUidImpl a = l2.a(uid);
        String phoneNumber = c0Var.getPhoneNumber();
        boolean isPhoneEditable = c0Var.isPhoneEditable();
        m3 webAmProperties2 = c0Var.getWebAmProperties();
        if (webAmProperties2 != null) {
            WebAmProperties.Companion.getClass();
            webAmProperties = d0.a(webAmProperties2);
        } else {
            webAmProperties = null;
        }
        return new BindPhoneProperties(theme, a, phoneNumber, isPhoneEditable, webAmProperties, c0Var.getPartitions(), c0Var.getHeaders());
    }
}
