package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: RateLimitInterceptor.kt */
/* loaded from: classes2.dex */
public final class azy {
    public final int a;
    public final long b;
    public final gzs<Long> c;
    public final long d;
    public long e;
    public int f;
    public final ReentrantLock g;

    public azy(int i, long j, dgc0 dgc0Var) {
        this.a = i;
        this.b = j;
        this.c = dgc0Var;
        long j2 = i;
        long j3 = (1 > j2 || j2 > j) ? 0L : j / j2;
        this.d = j3;
        this.f = j3 <= 0 ? 0 : i;
        this.g = new ReentrantLock();
    }
}
