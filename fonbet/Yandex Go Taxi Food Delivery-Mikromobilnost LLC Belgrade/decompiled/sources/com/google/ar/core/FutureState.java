package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);

    final int nativeCode;

    FutureState(int i) {
        this.nativeCode = i;
    }

    public static FutureState forNumber(int i) {
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i) {
                return futureState;
            }
        }
        yx61.f(a0.a(Alerts.alert_illegal_parameter, i, "Unexpected value for native FutureState, value="));
        return null;
    }
}
