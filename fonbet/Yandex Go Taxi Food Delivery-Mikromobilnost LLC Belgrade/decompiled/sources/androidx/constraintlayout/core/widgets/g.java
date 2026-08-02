package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.i63;
import defpackage.ijy;
import defpackage.m4u;
import defpackage.z7t0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g extends ConstraintWidget {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public b7e x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public g() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean C() {
        return this.z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean D() {
        return this.z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void S(ijy ijyVar, boolean z) {
        if (this.V == null) {
            return;
        }
        b7e b7eVar = this.x0;
        ijyVar.getClass();
        int n = ijy.n(b7eVar);
        if (this.y0 == 1) {
            this.a0 = n;
            this.b0 = 0;
            N(this.V.m());
            Q(0);
            return;
        }
        this.a0 = 0;
        this.b0 = n;
        Q(this.V.s());
        N(0);
    }

    public final void T(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void U(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            this.x0 = this.J;
        } else {
            this.x0 = this.K;
        }
        arrayList.add(this.x0);
        b7e[] b7eVarArr = this.R;
        int length = b7eVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            b7eVarArr[i2] = this.x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(ijy ijyVar, boolean z) {
        d dVar = (d) this.V;
        if (dVar == null) {
            return;
        }
        Object k = dVar.k(ConstraintAnchor$Type.LEFT);
        Object k2 = dVar.k(ConstraintAnchor$Type.RIGHT);
        ConstraintWidget constraintWidget = this.V;
        boolean z2 = constraintWidget != null && constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.y0 == 0) {
            k = dVar.k(ConstraintAnchor$Type.TOP);
            k2 = dVar.k(ConstraintAnchor$Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.V;
            z2 = constraintWidget2 != null && constraintWidget2.U[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.z0) {
            b7e b7eVar = this.x0;
            if (b7eVar.c) {
                z7t0 k3 = ijyVar.k(b7eVar);
                ijyVar.d(k3, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        ijyVar.f(ijyVar.k(k2), k3, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    z7t0 k4 = ijyVar.k(k2);
                    ijyVar.f(k3, ijyVar.k(k), 0, 5);
                    ijyVar.f(k4, k3, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            z7t0 k5 = ijyVar.k(this.x0);
            ijyVar.e(k5, ijyVar.k(k), this.v0, 8);
            if (z2) {
                ijyVar.f(ijyVar.k(k2), k5, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            z7t0 k6 = ijyVar.k(this.x0);
            z7t0 k7 = ijyVar.k(k2);
            ijyVar.e(k6, k7, -this.w0, 8);
            if (z2) {
                ijyVar.f(k6, ijyVar.k(k), 0, 5);
                ijyVar.f(k7, k6, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            z7t0 k8 = ijyVar.k(this.x0);
            z7t0 k9 = ijyVar.k(k2);
            float f = this.u0;
            i63 l = ijyVar.l();
            l.d.g(k8, -1.0f);
            l.d.g(k9, f);
            ijyVar.c(l);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void h(ConstraintWidget constraintWidget, HashMap hashMap) {
        super.h(constraintWidget, hashMap);
        g gVar = (g) constraintWidget;
        this.u0 = gVar.u0;
        this.v0 = gVar.v0;
        this.w0 = gVar.w0;
        U(gVar.y0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final b7e k(ConstraintAnchor$Type constraintAnchor$Type) {
        int i = m4u.a[constraintAnchor$Type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.y0 == 1) {
                return this.x0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.y0 == 0) {
            return this.x0;
        }
        return null;
    }
}
