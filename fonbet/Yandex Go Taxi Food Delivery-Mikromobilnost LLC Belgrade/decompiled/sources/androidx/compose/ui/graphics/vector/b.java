package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.b64;
import defpackage.cjs0;
import defpackage.cot;
import defpackage.nfh;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.qam;
import defpackage.sls;
import defpackage.wec;
import defpackage.x4c;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class b extends pa90 {
    public final a A;
    public final oz40 B;
    public float C;
    public wec D;
    public final oz40 y;
    public final oz40 z;

    public b(GroupComponent groupComponent) {
        this.y = f.j(new cjs0(0L));
        this.z = f.j(Boolean.FALSE);
        a aVar = new a(groupComponent);
        aVar.f = new sls() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oz40 oz40Var = b.this.B;
                zy11 zy11Var = zy11.a;
                oz40Var.setValue(zy11Var);
                return zy11Var;
            }
        };
        this.A = aVar;
        this.B = f.i(zy11.a, x4c.Q);
        this.C = 1.0f;
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.D = wecVar;
        return true;
    }

    @Override // defpackage.pa90
    public final long i() {
        return ((cjs0) this.y.getValue()).a;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        wec wecVar = this.D;
        a aVar = this.A;
        if (wecVar == null) {
            wecVar = (wec) aVar.g.getValue();
        }
        if (((Boolean) this.z.getValue()).booleanValue() && qamVar.getLayoutDirection() == LayoutDirection.Rtl) {
            long P = qamVar.P();
            nfh N = qamVar.N();
            long v = N.v();
            N.q().save();
            try {
                ((cot) N.a).m(-1.0f, 1.0f, P);
                aVar.e(qamVar, this.C, wecVar);
            } finally {
                b64.C(N, v);
            }
        } else {
            aVar.e(qamVar, this.C, wecVar);
        }
        this.B.getValue();
    }

    public b() {
        this(new GroupComponent());
    }
}
