package com.yandex.div.internal.util;

import java.lang.Number;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.qcy;
import xsna.zcl;

/* compiled from: Utils.kt */
/* loaded from: classes7.dex */
public final class PositiveNumberDelegate<T extends Number> {
    private final T fallbackValue;
    private T value;

    public PositiveNumberDelegate(T t, T t2) {
        this.value = t;
        this.fallbackValue = t2;
    }

    public final T getValue(Object obj, qcy<?> qcyVar) {
        return this.value;
    }

    public final void setValue(Object obj, qcy<?> qcyVar, T t) {
        if (t.doubleValue() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            t = this.fallbackValue;
        }
        this.value = t;
    }

    public /* synthetic */ PositiveNumberDelegate(Number number, Number number2, int i, zcl zclVar) {
        this(number, (i & 2) != 0 ? 1 : number2);
    }
}
