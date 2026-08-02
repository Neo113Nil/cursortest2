package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.i63;
import defpackage.ijy;
import defpackage.nfu;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.z7t0;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class a extends nfu {
    public int w0 = 0;
    public boolean x0 = true;
    public int y0 = 0;
    public boolean z0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean C() {
        return this.z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean D() {
        return this.z0;
    }

    public final boolean V() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.v0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.u0[i4];
            if ((this.x0 || constraintWidget.d()) && ((((i2 = this.w0) == 0 || i2 == 1) && !constraintWidget.C()) || (((i3 = this.w0) == 2 || i3 == 3) && !constraintWidget.D()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.v0; i6++) {
            ConstraintWidget constraintWidget2 = this.u0[i6];
            if (this.x0 || constraintWidget2.d()) {
                if (!z2) {
                    int i7 = this.w0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.k(ConstraintAnchor$Type.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.k(ConstraintAnchor$Type.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.k(ConstraintAnchor$Type.TOP).d();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.k(ConstraintAnchor$Type.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.w0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.k(ConstraintAnchor$Type.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.k(ConstraintAnchor$Type.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.k(ConstraintAnchor$Type.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.k(ConstraintAnchor$Type.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.y0;
        int i10 = this.w0;
        if (i10 == 0 || i10 == 1) {
            L(i9, i9);
        } else {
            M(i9, i9);
        }
        this.z0 = true;
        return true;
    }

    public final int W() {
        int i = this.w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(ijy ijyVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        b7e[] b7eVarArr = this.R;
        b7e b7eVar = this.J;
        b7eVarArr[0] = b7eVar;
        int i3 = 2;
        b7e b7eVar2 = this.K;
        b7eVarArr[2] = b7eVar2;
        b7e b7eVar3 = this.L;
        b7eVarArr[1] = b7eVar3;
        b7e b7eVar4 = this.M;
        b7eVarArr[3] = b7eVar4;
        for (b7e b7eVar5 : b7eVarArr) {
            b7eVar5.i = ijyVar.k(b7eVar5);
        }
        int i4 = this.w0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        b7e b7eVar6 = b7eVarArr[i4];
        if (!this.z0) {
            V();
        }
        if (this.z0) {
            this.z0 = false;
            int i5 = this.w0;
            if (i5 == 0 || i5 == 1) {
                ijyVar.d(b7eVar.i, this.a0);
                ijyVar.d(b7eVar3.i, this.a0);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    ijyVar.d(b7eVar2.i, this.b0);
                    ijyVar.d(b7eVar4.i, this.b0);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.v0; i6++) {
            ConstraintWidget constraintWidget = this.u0[i6];
            if ((this.x0 || constraintWidget.d()) && ((((i2 = this.w0) == 0 || i2 == 1) && constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.J.f != null && constraintWidget.L.f != null) || ((i2 == 2 || i2 == 3) && constraintWidget.U[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.K.f != null && constraintWidget.M.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = b7eVar.g() || b7eVar3.g();
        boolean z4 = b7eVar2.g() || b7eVar4.g();
        int i7 = !(!z2 && (((i = this.w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.v0) {
            ConstraintWidget constraintWidget2 = this.u0[i8];
            if (this.x0 || constraintWidget2.d()) {
                z7t0 k = ijyVar.k(constraintWidget2.R[this.w0]);
                b7e[] b7eVarArr2 = constraintWidget2.R;
                int i9 = this.w0;
                b7e b7eVar7 = b7eVarArr2[i9];
                b7eVar7.i = k;
                b7e b7eVar8 = b7eVar7.f;
                int i10 = (b7eVar8 == null || b7eVar8.d != this) ? 0 : b7eVar7.g;
                if (i9 == 0 || i9 == i3) {
                    z7t0 z7t0Var = b7eVar6.i;
                    int i11 = this.y0 - i10;
                    i63 l = ijyVar.l();
                    z7t0 m = ijyVar.m();
                    m.w = 0;
                    l.c(z7t0Var, k, m, i11);
                    ijyVar.c(l);
                } else {
                    z7t0 z7t0Var2 = b7eVar6.i;
                    int i12 = this.y0 + i10;
                    i63 l2 = ijyVar.l();
                    z7t0 m2 = ijyVar.m();
                    m2.w = 0;
                    l2.b(z7t0Var2, k, m2, i12);
                    ijyVar.c(l2);
                }
                ijyVar.e(b7eVar6.i, k, this.y0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.w0;
        if (i13 == 0) {
            ijyVar.e(b7eVar3.i, b7eVar.i, 0, 8);
            ijyVar.e(b7eVar.i, this.V.L.i, 0, 4);
            ijyVar.e(b7eVar.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ijyVar.e(b7eVar.i, b7eVar3.i, 0, 8);
            ijyVar.e(b7eVar.i, this.V.J.i, 0, 4);
            ijyVar.e(b7eVar.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            ijyVar.e(b7eVar4.i, b7eVar2.i, 0, 8);
            ijyVar.e(b7eVar2.i, this.V.M.i, 0, 4);
            ijyVar.e(b7eVar2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            ijyVar.e(b7eVar2.i, b7eVar4.i, 0, 8);
            ijyVar.e(b7eVar2.i, this.V.K.i, 0, 4);
            ijyVar.e(b7eVar2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    @Override // defpackage.nfu, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void h(ConstraintWidget constraintWidget, HashMap hashMap) {
        super.h(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.w0 = aVar.w0;
        this.x0 = aVar.x0;
        this.y0 = aVar.y0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String t = oyr.t(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.v0; i++) {
            ConstraintWidget constraintWidget = this.u0[i];
            if (i > 0) {
                t = t.concat(Extension.FIX_SPACE);
            }
            StringBuilder t2 = qv10.t(t);
            t2.append(constraintWidget.k0);
            t = t2.toString();
        }
        return t.concat("}");
    }
}
