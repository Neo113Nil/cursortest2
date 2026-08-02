package com.yandex.div.evaluable.function;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i) throws IllegalArgumentException {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return i / 255.0f;
    }

    public static final int toColorIntComponentValue(double d) throws IllegalArgumentException {
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d * 255.0f) + 0.5f);
    }
}
