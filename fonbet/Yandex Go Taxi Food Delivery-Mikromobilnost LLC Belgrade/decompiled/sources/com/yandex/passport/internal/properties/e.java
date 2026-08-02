package com.yandex.passport.internal.properties;

import android.os.Bundle;
import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.n0;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.Filter;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes15.dex */
public final class e {
    public static AutoLoginProperties a(Bundle bundle) {
        AutoLoginProperties autoLoginProperties = (AutoLoginProperties) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-auto-login-properties");
        if (autoLoginProperties != null) {
            return autoLoginProperties;
        }
        ny61.r("Bundle has no AutoLoginProperties");
        return null;
    }

    public static AutoLoginProperties b(com.yandex.passport.api.a0 a0Var) {
        Credentials credentials;
        com.yandex.passport.internal.entities.f fVar = Filter.Companion;
        z0 filter = a0Var.getFilter();
        fVar.getClass();
        Filter a = com.yandex.passport.internal.entities.f.a(filter);
        PassportTheme theme = a0Var.getTheme();
        PassportAutoLoginMode mode = a0Var.getMode();
        String message = a0Var.getMessage();
        boolean setAsCurrent = a0Var.getSetAsCurrent();
        n0 credentials2 = a0Var.getCredentials();
        if (credentials2 != null) {
            ClientCredentials.Factory.getClass();
            credentials = new Credentials(credentials2.getEncryptedId(), credentials2.getEncryptedSecret());
        } else {
            credentials = null;
        }
        return new AutoLoginProperties(a, theme, mode, message, setAsCurrent, credentials, com.yandex.passport.common.util.a.e(a0Var.getPhoneNumber()));
    }
}
