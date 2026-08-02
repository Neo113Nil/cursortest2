package defpackage;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;

/* loaded from: classes10.dex */
public final class mre extends lqh implements gnq0 {
    public boolean A;
    public iv60 B;
    public j C;
    public eiv D;
    public yur E;
    public vw01 c;
    public hoy0 w;
    public oay x;
    public boolean y;
    public boolean z;

    public static void H0(oay oayVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        xpy0 xpy0Var = oayVar.e;
        cre creVar = oayVar.v;
        if (xpy0Var == null) {
            int length = str.length();
            creVar.invoke(new hoy0(str, eja1.c(length, length), 4));
        } else {
            hoy0 a = oayVar.d.a(scc.g(new crh(), new fnc(str, 1)));
            xpy0Var.a(null, a);
            creVar.invoke(a);
        }
    }

    @Override // defpackage.gnq0
    public final boolean T() {
        return true;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        boolean z = this.A;
        kk2 kk2Var = this.w.a;
        kgx[] kgxVarArr = f.a;
        g gVar = d.F;
        kgx[] kgxVarArr2 = f.a;
        kgx kgxVar = kgxVarArr2[18];
        mnq0Var.a(gVar, kk2Var);
        kk2 kk2Var2 = this.c.a;
        g gVar2 = d.G;
        kgx kgxVar2 = kgxVarArr2[19];
        mnq0Var.a(gVar2, kk2Var2);
        long j = this.w.b;
        g gVar3 = d.H;
        kgx kgxVar3 = kgxVarArr2[20];
        mnq0Var.a(gVar3, new asy0(j));
        w82 w82Var = qtb1.z;
        g gVar4 = d.s;
        kgx kgxVar4 = kgxVarArr2[9];
        mnq0Var.a(gVar4, w82Var);
        k92 k92Var = new k92(AutofillValue.forText(this.w.a));
        g gVar5 = d.t;
        kgx kgxVar5 = kgxVarArr2[10];
        mnq0Var.a(gVar5, k92Var);
        boolean z2 = false;
        f.g(mnq0Var, new lre(this, 0));
        int i = this.D.d;
        if (i == 6) {
            aie.a.getClass();
            x82 x82Var = zhe.c;
            g gVar6 = d.r;
            kgx kgxVar6 = kgxVarArr2[8];
            mnq0Var.a(gVar6, x82Var);
        } else if (i == 7 || i == 8) {
            aie.a.getClass();
            x82 x82Var2 = zhe.b;
            g gVar7 = d.r;
            kgx kgxVar7 = kgxVarArr2[8];
            mnq0Var.a(gVar7, x82Var2);
        } else if (i == 4) {
            aie.a.getClass();
            x82 x82Var3 = zhe.d;
            g gVar8 = d.r;
            kgx kgxVar8 = kgxVarArr2[8];
            mnq0Var.a(gVar8, x82Var3);
        }
        if (!this.z) {
            f.a(mnq0Var);
        }
        if (z) {
            mnq0Var.a(d.L, zy11.a);
        }
        if (this.z && !this.y) {
            z2 = true;
        }
        g gVar9 = d.O;
        kgx kgxVar9 = kgxVarArr2[28];
        mnq0Var.a(gVar9, Boolean.valueOf(z2));
        f.c(mnq0Var, new lre(this, 1));
        if (z2) {
            mnq0Var.a(a.k, new ag(null, new lre(this, 2)));
            mnq0Var.a(a.o, new ag(null, new lre(this, mnq0Var)));
        }
        mnq0Var.a(a.j, new ag(null, new ota(10, this)));
        int i2 = this.D.e;
        kre kreVar = new kre(this, 6);
        mnq0Var.a(d.I, new div(i2));
        mnq0Var.a(a.p, new ag(null, kreVar));
        f.f(mnq0Var, null, new kre(this, 7));
        f.h(mnq0Var, null, new kre(this, 1));
        if (!asy0.c(this.w.b) && !z) {
            mnq0Var.a(a.q, new ag(null, new kre(this, 2)));
            if (this.z && !this.y) {
                mnq0Var.a(a.r, new ag(null, new kre(this, 3)));
            }
        }
        if (!this.z || this.y) {
            return;
        }
        mnq0Var.a(a.s, new ag(null, new kre(this, 5)));
    }
}
