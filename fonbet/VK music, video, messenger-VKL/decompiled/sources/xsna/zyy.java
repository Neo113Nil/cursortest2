package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: RateLimitInterceptor.kt */
/* loaded from: classes2.dex */
public final class zyy {
    public final int a;
    public final long b;
    public final gzs<Long> c;
    public final long d;
    public long e;
    public final ReentrantLock f;

    public zyy(int i, long j, dgc0 dgc0Var) {
        this.a = i;
        this.b = j;
        this.c = dgc0Var;
        long j2 = i;
        this.d = (1 > j2 || j2 > j) ? 0L : j / j2;
        this.f = new ReentrantLock();
    }
}
