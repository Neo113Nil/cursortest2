package xsna;

import androidx.compose.animation.core.RepeatMode;
import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class dmr0<V extends wq2> implements xlr0<V> {
    public final int a;
    public final wlr0<V> b;
    public final RepeatMode c;
    public final long d;
    public final long e;

    public dmr0(int i, wlr0 wlr0Var, RepeatMode repeatMode, long j) {
        this.a = i;
        this.b = wlr0Var;
        this.c = repeatMode;
        if (i < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.d = (wlr0Var.b() + wlr0Var.f()) * 1000000;
        this.e = j * 1000000;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        return (this.a * this.d) - this.e;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        return this.b.d(h(j), v, v2, i(j, v, v3, v2));
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        return this.b.g(h(j), v, v2, i(j, v, v3, v2));
    }

    public final long h(long j) {
        long j2 = this.e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.d;
        long min = Math.min(j3 / j4, this.a - 1);
        return (this.c == RepeatMode.Restart || min % ((long) 2) == 0) ? j3 - (min * j4) : ((min + 1) * j4) - j3;
    }

    public final V i(long j, V v, V v2, V v3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? d(j4 - j2, v, v2, v3) : v2;
    }
}
