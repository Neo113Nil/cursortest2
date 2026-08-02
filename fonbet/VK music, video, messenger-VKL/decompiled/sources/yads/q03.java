package yads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class q03 implements ic0 {
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public final v9 a;

    public q03(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // yads.ic0
    public final long a() {
        Long l = this.a.s;
        return l != null ? l.longValue() : b;
    }
}
