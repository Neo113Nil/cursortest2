package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: EventHubRateLimiter.kt */
/* loaded from: classes3.dex */
public final class pzp {
    public final wwe0 a;
    public final ReentrantLock b = new ReentrantLock(true);
    public final ArrayDeque<Long> c;

    public pzp(wwe0 wwe0Var) {
        this.a = wwe0Var;
        this.c = new ArrayDeque<>(wwe0Var.a);
    }
}
