package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.ae5;
import defpackage.nfu;
import defpackage.zd5;

/* loaded from: classes.dex */
public class i extends nfu {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final zd5 F0 = new zd5();
    public ae5 G0 = null;

    public void V(int i, int i2, int i3, int i4) {
    }

    public final void W(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        ae5 ae5Var;
        ConstraintWidget constraintWidget2;
        while (true) {
            ae5Var = this.G0;
            if (ae5Var != null || (constraintWidget2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((d) constraintWidget2).y0;
            }
        }
        zd5 zd5Var = this.F0;
        zd5Var.a = dimensionBehaviour;
        zd5Var.b = dimensionBehaviour2;
        zd5Var.c = i;
        zd5Var.d = i2;
        ((androidx.constraintlayout.widget.b) ae5Var).b(constraintWidget, zd5Var);
        constraintWidget.Q(zd5Var.e);
        constraintWidget.N(zd5Var.f);
        constraintWidget.E = zd5Var.h;
        constraintWidget.K(zd5Var.g);
    }

    @Override // defpackage.nfu, defpackage.lfu
    public final void a() {
        for (int i = 0; i < this.v0; i++) {
            ConstraintWidget constraintWidget = this.u0[i];
            if (constraintWidget != null) {
                constraintWidget.G = true;
            }
        }
    }
}
