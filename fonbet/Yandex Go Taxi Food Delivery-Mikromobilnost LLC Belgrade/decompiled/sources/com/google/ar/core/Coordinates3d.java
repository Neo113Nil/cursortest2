package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public enum Coordinates3d {
    EIS_TEXTURE_NORMALIZED(0),
    EIS_NORMALIZED_DEVICE_COORDINATES(1);

    final int nativeCode;

    Coordinates3d(int i) {
        this.nativeCode = i;
    }

    public static Coordinates3d forNumber(int i) {
        for (Coordinates3d coordinates3d : values()) {
            if (coordinates3d.nativeCode == i) {
                return coordinates3d;
            }
        }
        yx61.f(a0.a(Alerts.alert_decrypt_error, i, "Unexpected value for native Coordinates3d, value = "));
        return null;
    }
}
