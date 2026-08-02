package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import xsna.tra0;

/* compiled from: LazyLayoutMeasureScope.kt */
/* loaded from: classes11.dex */
public final class qty implements pty, ep10 {
    public final hty b;
    public final ztm0 c;
    public final androidx.compose.foundation.lazy.layout.b d;
    public final pg50<List<zo10>> e;

    public qty(hty htyVar, ztm0 ztm0Var) {
        this.b = htyVar;
        this.c = ztm0Var;
        this.d = (androidx.compose.foundation.lazy.layout.b) htyVar.b.invoke();
        g9x.a();
        this.e = g9x.a();
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.c.E(j);
    }

    @Override // xsna.ep10
    public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
        return this.c.F1(i, i2, map, izsVar, izsVar2);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.c.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.c.I0(f);
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.c.J(f);
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.c.O0(j);
    }

    @Override // xsna.ep10
    public final dp10 Q(int i, int i2, Map<gt1, Integer> map, izs<? super tra0.a, s3q0> izsVar) {
        return this.c.Q(i, i2, map, izsVar);
    }

    public final List<zo10> c(int i) {
        pg50<List<zo10>> pg50Var = this.e;
        List<zo10> b = pg50Var.b(i);
        if (b != null) {
            return b;
        }
        androidx.compose.foundation.lazy.layout.b bVar = this.d;
        Object h = bVar.h(i);
        List<zo10> t1 = this.c.t1(h, this.b.a(i, h, bVar.g(i)));
        pg50Var.k(i, t1);
        return t1;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.c.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.c.getFontScale();
    }

    @Override // xsna.apx
    public final LayoutDirection getLayoutDirection() {
        return this.c.getLayoutDirection();
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return this.c.i0(f);
    }

    @Override // xsna.azl
    public final float j1(int i) {
        return this.c.j1(i);
    }

    @Override // xsna.azl
    public final float k1(float f) {
        return this.c.k1(f);
    }

    @Override // xsna.azl
    public final long p1(long j) {
        return this.c.p1(j);
    }

    @Override // xsna.azl
    public final int r0(float f) {
        return this.c.r0(f);
    }

    @Override // xsna.azl
    public final float u0(long j) {
        return this.c.u0(j);
    }

    @Override // xsna.apx
    public final boolean z1() {
        return this.c.z1();
    }
}
