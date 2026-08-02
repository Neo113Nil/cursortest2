package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class c {
    public static AuthByQrProperties a(Bundle bundle) {
        AuthByQrProperties authByQrProperties = (AuthByQrProperties) bundle.getParcelable("auth_by_qr_properties");
        if (authByQrProperties != null) {
            return authByQrProperties;
        }
        ny61.r("No auth_by_qr_properties in bundle");
        return null;
    }
}
