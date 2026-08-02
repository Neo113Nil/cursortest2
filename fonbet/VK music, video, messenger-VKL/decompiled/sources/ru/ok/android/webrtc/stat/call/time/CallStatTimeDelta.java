package ru.ok.android.webrtc.stat.call.time;

import java.util.concurrent.TimeUnit;
import xsna.q500;

/* loaded from: classes9.dex */
public final class CallStatTimeDelta {
    public static final CallStatTimeDelta INSTANCE = new CallStatTimeDelta();
    public static final long TIME_DELTA_SECONDS = 5;
    public static final long a;
    public static final q500 b;

    static {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        a = millis;
        b = new q500(millis - 2000, millis + 4000);
    }

    public final boolean checkMeasuredTimeInRange(long j) {
        q500 q500Var = b;
        return j <= q500Var.c && q500Var.b <= j;
    }

    public final long getTIME_DELTA_MILLIS() {
        return a;
    }
}
