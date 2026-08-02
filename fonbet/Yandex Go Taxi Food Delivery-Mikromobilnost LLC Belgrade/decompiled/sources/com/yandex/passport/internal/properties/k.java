package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes2.dex */
public final class k {
    public static PassportDeleteAccountPropertiesImpl a(Bundle bundle) {
        PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = (PassportDeleteAccountPropertiesImpl) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-delete-account-properties");
        if (passportDeleteAccountPropertiesImpl != null) {
            return passportDeleteAccountPropertiesImpl;
        }
        ny61.r("Bundle has no PassportDeleteAccountPropertiesImpl");
        return null;
    }
}
