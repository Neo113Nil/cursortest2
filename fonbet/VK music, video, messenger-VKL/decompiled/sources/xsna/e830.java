package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: MonotonicClock.java */
/* loaded from: classes.dex */
public interface e830 {
    @zsn
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @zsn
    long nowNanos();
}
