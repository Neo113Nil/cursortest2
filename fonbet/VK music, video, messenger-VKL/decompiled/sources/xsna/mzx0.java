package xsna;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
final class mzx0 extends d730<nzx0> {
    public final Direction a;
    public final boolean b;
    public final wzs<q9x, LayoutDirection, h9x> c;
    public final Object d;

    public mzx0(Direction direction, boolean z, wzs wzsVar, Object obj) {
        this.a = direction;
        this.b = z;
        this.c = wzsVar;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mzx0.class != obj.getClass()) {
            return false;
        }
        mzx0 mzx0Var = (mzx0) obj;
        return this.a == mzx0Var.a && this.b == mzx0Var.b && epx.f(this.d, mzx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // xsna.d730
    public final nzx0 r() {
        nzx0 nzx0Var = new nzx0();
        nzx0Var.p = this.a;
        nzx0Var.q = this.b;
        nzx0Var.r = this.c;
        return nzx0Var;
    }

    @Override // xsna.d730
    public final void s(nzx0 nzx0Var) {
        nzx0 nzx0Var2 = nzx0Var;
        nzx0Var2.p = this.a;
        nzx0Var2.q = this.b;
        nzx0Var2.r = this.c;
    }
}
