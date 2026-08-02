package com.yandex.passport.internal.properties;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;

/* loaded from: classes15.dex */
public final class w {
    public static SocialRegistrationProperties a() {
        return new SocialRegistrationProperties(null, null, 3, null);
    }

    public static SocialRegistrationProperties b(f2 f2Var) {
        PassportUidImpl passportUidImpl;
        k2 uid = f2Var.getUid();
        if (uid != null) {
            PassportUidImpl.Companion.getClass();
            passportUidImpl = l2.a(uid);
        } else {
            passportUidImpl = null;
        }
        return new SocialRegistrationProperties(passportUidImpl, f2Var.getMessage());
    }
}
