package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public enum VpsAvailability {
    UNKNOWN(0),
    AVAILABLE(1),
    UNAVAILABLE(2),
    ERROR_INTERNAL(-1),
    ERROR_NETWORK_CONNECTION(-2),
    ERROR_NOT_AUTHORIZED(-3),
    ERROR_RESOURCE_EXHAUSTED(-4);

    final int nativeCode;

    VpsAvailability(int i) {
        this.nativeCode = i;
    }

    public static VpsAvailability forNumber(int i) {
        for (VpsAvailability vpsAvailability : values()) {
            if (vpsAvailability.nativeCode == i) {
                return vpsAvailability;
            }
        }
        yx61.f(a0.a(Alerts.alert_decrypt_error, i, "Unexpected value for native VpsAvailability, value="));
        return null;
    }
}
