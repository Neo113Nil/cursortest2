package com.yandex.passport.internal.properties;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;

/* loaded from: classes15.dex */
public final class d {
    public static AuthorizationUrlProperties a(com.yandex.passport.api.y yVar) {
        k2 uid = yVar.getUid();
        PassportUidImpl.Companion.getClass();
        return new AuthorizationUrlProperties(l2.a(uid), yVar.getReturnUrl(), yVar.getTld(), yVar.getAnalyticsParams());
    }
}
