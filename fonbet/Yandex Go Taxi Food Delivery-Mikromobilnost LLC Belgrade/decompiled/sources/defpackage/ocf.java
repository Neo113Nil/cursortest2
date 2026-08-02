package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class ocf extends pa90 {
    public final nhe A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public boolean G;
    public pa90 y;
    public final pa90 z;
    public final yx40 E = f.g(0);
    public long F = -1;
    public final tx40 H = f.f(1.0f);
    public final oz40 I = f.j(null);

    public ocf(pa90 pa90Var, pa90 pa90Var2, nhe nheVar, int i, boolean z, boolean z2) {
        this.y = pa90Var;
        this.z = pa90Var2;
        this.A = nheVar;
        this.B = i;
        this.C = z;
        this.D = z2;
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.H.setFloatValue(f);
        return true;
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.I.setValue(wecVar);
        return true;
    }

    @Override // defpackage.pa90
    public final long i() {
        pa90 pa90Var = this.y;
        long i = pa90Var != null ? pa90Var.i() : 0L;
        pa90 pa90Var2 = this.z;
        long i2 = pa90Var2 != null ? pa90Var2.i() : 0L;
        boolean z = i != 9205357640488583168L;
        boolean z2 = i2 != 9205357640488583168L;
        if (z && z2) {
            return cma1.a(Math.max(cjs0.d(i), cjs0.d(i2)), Math.max(cjs0.b(i), cjs0.b(i2)));
        }
        if (this.D) {
            if (z) {
                return i;
            }
            if (z2) {
                return i2;
            }
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        boolean z = this.G;
        pa90 pa90Var = this.z;
        tx40 tx40Var = this.H;
        if (z) {
            k(qamVar, pa90Var, tx40Var.getFloatValue());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.F == -1) {
            this.F = uptimeMillis;
        }
        float f = (uptimeMillis - this.F) / this.B;
        float floatValue = tx40Var.getFloatValue() * y6i0.c(f, 0.0f, 1.0f);
        float floatValue2 = this.C ? tx40Var.getFloatValue() - floatValue : tx40Var.getFloatValue();
        this.G = f >= 1.0f;
        k(qamVar, this.y, floatValue2);
        k(qamVar, pa90Var, floatValue);
        if (this.G) {
            this.y = null;
        } else {
            yx40 yx40Var = this.E;
            yx40Var.setIntValue(yx40Var.getIntValue() + 1);
        }
    }

    public final void k(qam qamVar, pa90 pa90Var, float f) {
        if (pa90Var == null || f <= 0.0f) {
            return;
        }
        long c = qamVar.c();
        long i = pa90Var.i();
        long J = (i == 9205357640488583168L || cjs0.e(i) || c == 9205357640488583168L || cjs0.e(c)) ? c : sb2.J(i, this.A.j(i, c));
        oz40 oz40Var = this.I;
        if (c == 9205357640488583168L || cjs0.e(c)) {
            pa90Var.g(qamVar, J, f, (wec) oz40Var.getValue());
            return;
        }
        float d = (cjs0.d(c) - cjs0.d(J)) / 2.0f;
        float b = (cjs0.b(c) - cjs0.b(J)) / 2.0f;
        ((cot) qamVar.N().a).h(d, b, d, b);
        pa90Var.g(qamVar, J, f, (wec) oz40Var.getValue());
        cot cotVar = (cot) qamVar.N().a;
        float f2 = -d;
        float f3 = -b;
        cotVar.h(f2, f3, f2, f3);
    }
}
