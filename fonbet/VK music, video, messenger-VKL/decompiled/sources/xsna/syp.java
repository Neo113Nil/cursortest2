package xsna;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: EventDebouncer.kt */
/* loaded from: classes17.dex */
public final class syp {
    public long a;
    public Object b;

    public mx90 a() {
        return new mx90((al20) this.b, this.a, Executors.newScheduledThreadPool(1, new ask()));
    }

    public void b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        myc0.c("interval must be positive", j > 0);
        this.a = timeUnit.toNanos(j);
    }
}
