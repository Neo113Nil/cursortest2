package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.i;

/* loaded from: classes10.dex */
public class p3c0 extends i {
    @Override // androidx.constraintlayout.core.widgets.i
    public final void V(int i, int i2, int i3, int i4) {
        int i5 = this.A0 + this.B0;
        int i6 = this.w0 + this.x0;
        if (this.v0 > 0) {
            i5 += this.u0[0].s();
            i6 += this.u0[0].m();
        }
        int max = Math.max(this.d0, i5);
        int max2 = Math.max(this.e0, i6);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        this.D0 = i2;
        this.E0 = i4;
        Q(i2);
        N(i4);
        this.C0 = this.v0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(ijy ijyVar, boolean z) {
        super.c(ijyVar, z);
        if (this.v0 > 0) {
            ConstraintWidget constraintWidget = this.u0[0];
            constraintWidget.F();
            constraintWidget.g0 = 0.5f;
            constraintWidget.f0 = 0.5f;
            ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.LEFT;
            constraintWidget.g(constraintAnchor$Type, this, constraintAnchor$Type, 0);
            ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.RIGHT;
            constraintWidget.g(constraintAnchor$Type2, this, constraintAnchor$Type2, 0);
            ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.TOP;
            constraintWidget.g(constraintAnchor$Type3, this, constraintAnchor$Type3, 0);
            ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.BOTTOM;
            constraintWidget.g(constraintAnchor$Type4, this, constraintAnchor$Type4, 0);
        }
    }
}
