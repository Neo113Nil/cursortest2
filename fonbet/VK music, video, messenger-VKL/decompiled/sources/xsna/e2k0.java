package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: RateLimitInterceptor.kt */
/* loaded from: classes2.dex */
public final class e2k0 {
    public final int a;
    public final long b;
    public final gzs<Long> c;
    public final ArrayDeque<Long> d = new ArrayDeque<>();
    public final ReentrantLock e = new ReentrantLock();

    public e2k0(int i, long j, dgc0 dgc0Var) {
        this.a = i;
        this.b = j;
        this.c = dgc0Var;
    }
}
