package xsna;

import androidx.compose.animation.core.RepeatMode;
import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class amr0<V extends wq2> implements tlr0<V> {
    public final wlr0<V> a;
    public final RepeatMode b;
    public final long c;
    public final long d;

    public amr0(wlr0 wlr0Var, RepeatMode repeatMode, long j) {
        this.a = wlr0Var;
        this.b = repeatMode;
        this.c = (wlr0Var.b() + wlr0Var.f()) * 1000000;
        this.d = j * 1000000;
    }

    @Override // xsna.tlr0
    public final boolean a() {
        return true;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        return this.a.d(h(j), v, v2, i(j, v, v3, v2));
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        return this.a.g(h(j), v, v2, i(j, v, v3, v2));
    }

    public final long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (this.b == RepeatMode.Restart || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final V i(long j, V v, V v2, V v3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.a.d(j4 - j2, v, v3, v2) : v2;
    }
}
