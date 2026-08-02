package ru.ok.android.webrtc.utils;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class TimedEvent {
    public volatile long a;
    public final Ema b;
    public volatile boolean c = false;

    public TimedEvent(double d) {
        this.b = new Ema(d);
    }

    public synchronized void fire() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (this.a == 0) {
            this.a = elapsedRealtimeNanos;
            return;
        }
        long j = elapsedRealtimeNanos - this.a;
        if (this.c) {
            this.b.submit(j);
        } else {
            this.b.set(j);
            this.c = true;
        }
        this.a = elapsedRealtimeNanos;
    }

    public double perSecond() {
        return TimeUnit.SECONDS.toNanos(1L) / rateNs();
    }

    public long rate(TimeUnit timeUnit) {
        return timeUnit.convert((long) this.b.get(), TimeUnit.NANOSECONDS);
    }

    public double rateNs() {
        return this.b.get();
    }
}
