package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.oo31;
import defpackage.xfo;

/* loaded from: classes15.dex */
public final class y {
    public static TurboAppAuthProperties a(Bundle bundle) {
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "turbo_app_auth_properties");
        if (e != null) {
            return (TurboAppAuthProperties) e;
        }
        xfo.g("can't get required parcelable turbo_app_auth_properties");
        return null;
    }
}
