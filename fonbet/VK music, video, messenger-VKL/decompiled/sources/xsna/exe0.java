package xsna;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RateLimiter.java */
/* loaded from: classes8.dex */
public final class exe0 {
    public final double a;
    public final long b;
    public final AtomicLong c;

    public exe0(double d, double d2) {
        double d3 = d / 1.0E9d;
        this.a = d3;
        long j = (long) (d2 / d3);
        this.b = j;
        this.c = new AtomicLong(System.nanoTime() - j);
    }

    public final boolean a(double d) {
        AtomicLong atomicLong;
        long j;
        long nanoTime;
        long j2;
        long j3 = (long) (d / this.a);
        do {
            atomicLong = this.c;
            j = atomicLong.get();
            nanoTime = System.nanoTime();
            long j4 = nanoTime - j;
            long j5 = this.b;
            if (j4 > j5) {
                j4 = j5;
            }
            j2 = j4 - j3;
            if (j2 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j, nanoTime - j2));
        return true;
    }
}
