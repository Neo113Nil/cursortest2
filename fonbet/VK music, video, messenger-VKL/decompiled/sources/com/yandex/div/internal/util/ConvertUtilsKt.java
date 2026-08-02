package com.yandex.div.internal.util;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ConvertUtils.kt */
/* loaded from: classes7.dex */
public final class ConvertUtilsKt {
    public static final Boolean toBoolean(Number number) {
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }

    public static final Boolean toBoolean(int i) {
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final Boolean toBoolean(double d) {
        if (d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return Boolean.FALSE;
        }
        if (d == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }
}
