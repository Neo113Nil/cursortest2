package yads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class k03 implements u2 {
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public final v9 a;

    public k03(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // yads.u2
    public final long a() {
        Long l = this.a.s;
        return l != null ? l.longValue() : b;
    }

    @Override // yads.u2
    public final long a(long j) {
        Long l = this.a.s;
        return l != null ? Math.min(j, l.longValue()) : j;
    }
}
