package com.yandex.passport.internal.properties;

import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.u1;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes15.dex */
public final class l {
    public static PassportLogoutPropertiesImpl a(Bundle bundle) {
        PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-logout-properties");
        if (passportLogoutPropertiesImpl != null) {
            return passportLogoutPropertiesImpl;
        }
        ny61.r("Bundle has no PassportLogoutPropertiesImpl");
        return null;
    }

    public static PassportLogoutPropertiesImpl b(f1 f1Var) {
        k2 uid = f1Var.getUid();
        PassportUidImpl.Companion.getClass();
        PassportUidImpl a = l2.a(uid);
        PassportTheme theme = f1Var.getTheme();
        String source = f1Var.getSource();
        boolean canLogoutOnDevice = f1Var.getCanLogoutOnDevice();
        u1 progressProperties = f1Var.getProgressProperties();
        ProgressPropertiesImpl.Companion.getClass();
        return new PassportLogoutPropertiesImpl(a, theme, source, canLogoutOnDevice, m.b(progressProperties), f1Var.getHeaders());
    }
}
