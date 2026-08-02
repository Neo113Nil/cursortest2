package xsna;

import androidx.compose.foundation.text.selection.CrossStatus;
import xsna.obi0;

/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class yvj0 implements ndi0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final obi0 d;
    public final jai0 e;

    public yvj0(boolean z, int i, int i2, obi0 obi0Var, jai0 jai0Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = obi0Var;
        this.e = jai0Var;
    }

    @Override // xsna.ndi0
    public final boolean a() {
        return this.a;
    }

    @Override // xsna.ndi0
    public final jai0 b() {
        return this.e;
    }

    @Override // xsna.ndi0
    public final xg50 c(obi0 obi0Var) {
        boolean z = obi0Var.c;
        obi0.a aVar = obi0Var.b;
        obi0.a aVar2 = obi0Var.a;
        if ((!z && aVar2.b > aVar.b) || (z && aVar2.b <= aVar.b)) {
            obi0Var = obi0.a(obi0Var, null, null, !z, 3);
        }
        long j = this.e.a;
        xg50 xg50Var = t300.a;
        xg50 xg50Var2 = new xg50();
        xg50Var2.i(j, obi0Var);
        return xg50Var2;
    }

    @Override // xsna.ndi0
    public final CrossStatus d() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : this.e.b();
    }

    @Override // xsna.ndi0
    public final boolean e(ndi0 ndi0Var) {
        if (this.d == null || ndi0Var == null || !(ndi0Var instanceof yvj0)) {
            return true;
        }
        yvj0 yvj0Var = (yvj0) ndi0Var;
        if (this.b != yvj0Var.b || this.c != yvj0Var.c || this.a != yvj0Var.a) {
            return true;
        }
        jai0 jai0Var = yvj0Var.e;
        jai0 jai0Var2 = this.e;
        return (jai0Var2.a == jai0Var.a && jai0Var2.c == jai0Var.c && jai0Var2.d == jai0Var.d) ? false : true;
    }

    @Override // xsna.ndi0
    public final jai0 g() {
        return this.e;
    }

    @Override // xsna.ndi0
    public final int getSize() {
        return 1;
    }

    @Override // xsna.ndi0
    public final int h() {
        return this.c;
    }

    @Override // xsna.ndi0
    public final obi0 i() {
        return this.d;
    }

    @Override // xsna.ndi0
    public final jai0 j() {
        return this.e;
    }

    @Override // xsna.ndi0
    public final jai0 k() {
        return this.e;
    }

    @Override // xsna.ndi0
    public final int l() {
        return this.b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + d() + ", info=\n\t" + this.e + ')';
    }

    @Override // xsna.ndi0
    public final void f(izs<? super jai0, s3q0> izsVar) {
    }
}
