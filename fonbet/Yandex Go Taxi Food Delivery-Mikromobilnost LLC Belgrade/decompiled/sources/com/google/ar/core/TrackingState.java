package com.google.ar.core;

import defpackage.yx61;

/* loaded from: classes11.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);

    final int nativeCode;

    TrackingState(int i) {
        this.nativeCode = i;
    }

    public static TrackingState forNumber(int i) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        yx61.f(a0.a((byte) 49, i, "Unexpected value for native TrackingState, value="));
        return null;
    }
}
