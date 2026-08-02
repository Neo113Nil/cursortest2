package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.wq2;

/* compiled from: AnimatorAnimationSpecs.kt */
/* loaded from: classes11.dex */
public final class emr0<V extends wq2> implements xlr0<V> {
    public final xlr0<V> a;
    public final long b;

    public emr0(xlr0<V> xlr0Var, long j) {
        this.a = xlr0Var;
        this.b = j;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        return this.b;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        V d = this.a.d(this.b - j, v2, v, v3);
        if (d instanceof sq2) {
            return new sq2(((sq2) d).a * (-1));
        }
        if (d instanceof tq2) {
            tq2 tq2Var = (tq2) d;
            float f = -1;
            return new tq2(tq2Var.a * f, tq2Var.b * f);
        }
        if (d instanceof uq2) {
            uq2 uq2Var = (uq2) d;
            float f2 = -1;
            return new uq2(uq2Var.a * f2, uq2Var.b * f2, uq2Var.c * f2);
        }
        if (!(d instanceof vq2)) {
            throw new NoWhenBranchMatchedException();
        }
        vq2 vq2Var = (vq2) d;
        float f3 = -1;
        return new vq2(vq2Var.a * f3, vq2Var.b * f3, vq2Var.c * f3, vq2Var.d * f3);
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        return this.a.g(this.b - j, v2, v, v3);
    }
}
