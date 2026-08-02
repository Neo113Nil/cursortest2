package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes8.dex */
public final class s {
    public static SetCurrentAccountPropertiesImpl a(Bundle bundle) {
        SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl = (SetCurrentAccountPropertiesImpl) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-set-current-account-properties");
        if (setCurrentAccountPropertiesImpl != null) {
            return setCurrentAccountPropertiesImpl;
        }
        ny61.r("Bundle has no SetCurrentAccountPropertiesImpl");
        return null;
    }
}
