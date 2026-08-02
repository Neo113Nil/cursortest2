package com.google.ar.core;

import defpackage.yx61;

/* loaded from: classes11.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);

    final int nativeCode;

    TrackingFailureReason(int i) {
        this.nativeCode = i;
    }

    public static TrackingFailureReason forNumber(int i) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        yx61.f(a0.a((byte) 57, i, "Unexpected value for native TrackingFailureReason, value="));
        return null;
    }
}
