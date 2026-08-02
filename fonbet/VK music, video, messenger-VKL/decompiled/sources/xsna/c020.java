package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: MediaTimeline.kt */
/* loaded from: classes3.dex */
public final class c020 {
    public long a;
    public long b;
    public boolean c;

    public final long a() {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long j = this.b - this.a;
        if (j < 0) {
            j = 0;
        }
        return timeUnit.toMillis(j);
    }

    public final String toString() {
        return c020.class.getSimpleName() + "[d=" + (a() * 0.001f) + "s]";
    }
}
