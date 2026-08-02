package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.ae5;
import defpackage.b7e;
import defpackage.be5;
import defpackage.g151;
import defpackage.g3u;
import defpackage.ijy;
import defpackage.n89;
import defpackage.oc20;
import defpackage.wkj;
import defpackage.zd5;
import defpackage.zwi;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends g151 {
    public oc20 A0;
    public final ijy B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public c[] G0;
    public c[] H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public WeakReference L0;
    public WeakReference M0;
    public WeakReference N0;
    public WeakReference O0;
    public final HashSet P0;
    public final zd5 Q0;
    public final be5 v0 = new be5(this);
    public final zwi w0;
    public int x0;
    public ae5 y0;
    public boolean z0;

    public d() {
        zwi zwiVar = new zwi();
        zwiVar.b = true;
        zwiVar.c = true;
        zwiVar.e = new ArrayList();
        new ArrayList();
        zwiVar.f = null;
        zwiVar.g = new zd5();
        zwiVar.h = new ArrayList();
        zwiVar.a = this;
        zwiVar.d = this;
        this.w0 = zwiVar;
        this.y0 = null;
        this.z0 = false;
        this.B0 = new ijy();
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = new c[4];
        this.H0 = new c[4];
        this.I0 = 257;
        this.J0 = false;
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = new HashSet();
        this.Q0 = new zd5();
    }

    public static void X(ConstraintWidget constraintWidget, ae5 ae5Var, zd5 zd5Var) {
        int i;
        int i2;
        if (ae5Var == null) {
            return;
        }
        int i3 = constraintWidget.i0;
        int[] iArr = constraintWidget.t;
        if (i3 == 8 || (constraintWidget instanceof g) || (constraintWidget instanceof a)) {
            zd5Var.e = 0;
            zd5Var.f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        zd5Var.a = dimensionBehaviourArr[0];
        zd5Var.b = dimensionBehaviourArr[1];
        zd5Var.c = constraintWidget.s();
        zd5Var.d = constraintWidget.m();
        zd5Var.i = false;
        zd5Var.j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = zd5Var.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = zd5Var.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Y > 0.0f;
        boolean z4 = z2 && constraintWidget.Y > 0.0f;
        if (z && constraintWidget.v(0) && constraintWidget.r == 0 && !z3) {
            zd5Var.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.s == 0) {
                zd5Var.a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.v(1) && constraintWidget.s == 0 && !z4) {
            zd5Var.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.r == 0) {
                zd5Var.b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.C()) {
            zd5Var.a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.D()) {
            zd5Var.b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                zd5Var.a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = zd5Var.b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i2 = zd5Var.d;
                } else {
                    zd5Var.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    ((androidx.constraintlayout.widget.b) ae5Var).b(constraintWidget, zd5Var);
                    i2 = zd5Var.f;
                }
                zd5Var.a = dimensionBehaviour4;
                zd5Var.c = (int) (constraintWidget.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                zd5Var.b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = zd5Var.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i = zd5Var.c;
                } else {
                    zd5Var.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    ((androidx.constraintlayout.widget.b) ae5Var).b(constraintWidget, zd5Var);
                    i = zd5Var.e;
                }
                zd5Var.b = dimensionBehaviour6;
                int i4 = constraintWidget.Z;
                float f = constraintWidget.Y;
                if (i4 == -1) {
                    zd5Var.d = (int) (i / f);
                } else {
                    zd5Var.d = (int) (f * i);
                }
            }
        }
        ((androidx.constraintlayout.widget.b) ae5Var).b(constraintWidget, zd5Var);
        constraintWidget.Q(zd5Var.e);
        constraintWidget.N(zd5Var.f);
        constraintWidget.E = zd5Var.h;
        constraintWidget.K(zd5Var.g);
        zd5Var.j = 0;
    }

    @Override // defpackage.g151, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void E() {
        this.B0.t();
        this.C0 = 0;
        this.D0 = 0;
        super.E();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void R(boolean z, boolean z2) {
        super.R(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.u0.get(i)).R(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0446 A[LOOP:13: B:290:0x0444->B:291:0x0446, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x041e  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.g151
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        b7e b7eVar;
        boolean[] zArr;
        boolean z4;
        int max;
        int max2;
        ?? r9;
        int i3;
        int i4;
        int max3;
        int max4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i5;
        int i6;
        this.a0 = 0;
        this.b0 = 0;
        this.J0 = false;
        this.K0 = false;
        int size = this.u0.size();
        int max5 = Math.max(0, s());
        int max6 = Math.max(0, m());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        int i7 = this.x0;
        b7e b7eVar2 = this.K;
        b7e b7eVar3 = this.J;
        if (i7 == 0 && h.b(this.I0, 1)) {
            ae5 ae5Var = this.y0;
            zd5 zd5Var = wkj.a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[1];
            G();
            ArrayList arrayList = this.u0;
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((ConstraintWidget) arrayList.get(i8)).G();
            }
            boolean z5 = this.z0;
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                L(0, s());
            } else {
                b7eVar3.l(0);
                this.a0 = 0;
            }
            boolean z6 = false;
            int i9 = 0;
            boolean z7 = false;
            while (i9 < size2) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i9);
                boolean z8 = z6;
                if (constraintWidget instanceof g) {
                    g gVar = (g) constraintWidget;
                    i6 = i9;
                    if (gVar.y0 == 1) {
                        int i10 = gVar.v0;
                        if (i10 != -1) {
                            gVar.T(i10);
                        } else if (gVar.w0 != -1 && C()) {
                            gVar.T(s() - gVar.w0);
                        } else if (C()) {
                            gVar.T((int) ((gVar.u0 * s()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    i6 = i9;
                    if ((constraintWidget instanceof a) && ((a) constraintWidget).W() == 0) {
                        z6 = z8;
                        z7 = true;
                        i9 = i6 + 1;
                    }
                }
                z6 = z8;
                i9 = i6 + 1;
            }
            if (z6) {
                for (int i11 = 0; i11 < size2; i11 = i5 + 1) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayList.get(i11);
                    if (constraintWidget2 instanceof g) {
                        g gVar2 = (g) constraintWidget2;
                        i5 = i11;
                        if (gVar2.y0 == 1) {
                            wkj.b(0, ae5Var, gVar2, z5);
                        }
                    } else {
                        i5 = i11;
                    }
                }
            }
            wkj.b(0, ae5Var, this, z5);
            if (z7) {
                for (int i12 = 0; i12 < size2; i12++) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayList.get(i12);
                    if (constraintWidget3 instanceof a) {
                        a aVar = (a) constraintWidget3;
                        if (aVar.W() == 0 && aVar.V()) {
                            wkj.b(1, ae5Var, aVar, z5);
                        }
                    }
                }
            }
            if (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED) {
                M(0, m());
            } else {
                b7eVar2.l(0);
                this.b0 = 0;
            }
            int i13 = 0;
            boolean z9 = false;
            boolean z10 = false;
            while (i13 < size2) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayList.get(i13);
                int i14 = i13;
                if (constraintWidget4 instanceof g) {
                    g gVar3 = (g) constraintWidget4;
                    if (gVar3.y0 == 0) {
                        int i15 = gVar3.v0;
                        if (i15 != -1) {
                            gVar3.T(i15);
                        } else if (gVar3.w0 != -1 && D()) {
                            gVar3.T(m() - gVar3.w0);
                        } else if (D()) {
                            gVar3.T((int) ((gVar3.u0 * m()) + 0.5f));
                        }
                        z9 = true;
                    }
                } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).W() == 1) {
                    z10 = true;
                }
                i13 = i14 + 1;
            }
            if (z9) {
                for (int i16 = 0; i16 < size2; i16++) {
                    ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList.get(i16);
                    if (constraintWidget5 instanceof g) {
                        g gVar4 = (g) constraintWidget5;
                        if (gVar4.y0 == 0) {
                            wkj.g(1, ae5Var, gVar4);
                        }
                    }
                }
            }
            wkj.g(0, ae5Var, this);
            if (z10) {
                for (int i17 = 0; i17 < size2; i17++) {
                    ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList.get(i17);
                    if (constraintWidget6 instanceof a) {
                        a aVar2 = (a) constraintWidget6;
                        if (aVar2.W() == 1 && aVar2.V()) {
                            wkj.g(1, ae5Var, aVar2);
                        }
                    }
                }
            }
            for (int i18 = 0; i18 < size2; i18++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayList.get(i18);
                if (constraintWidget7.B() && wkj.a(constraintWidget7)) {
                    X(constraintWidget7, ae5Var, wkj.a);
                    if (!(constraintWidget7 instanceof g)) {
                        wkj.b(0, ae5Var, constraintWidget7, z5);
                        wkj.g(0, ae5Var, constraintWidget7);
                    } else if (((g) constraintWidget7).y0 == 0) {
                        wkj.g(0, ae5Var, constraintWidget7);
                    } else {
                        wkj.b(0, ae5Var, constraintWidget7, z5);
                    }
                }
            }
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget8 = (ConstraintWidget) this.u0.get(i19);
                if (constraintWidget8.B() && !(constraintWidget8 instanceof g) && !(constraintWidget8 instanceof a) && !(constraintWidget8 instanceof i) && !constraintWidget8.G) {
                    ConstraintWidget.DimensionBehaviour l = constraintWidget8.l(0);
                    ConstraintWidget.DimensionBehaviour l2 = constraintWidget8.l(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (l != dimensionBehaviour7 || constraintWidget8.r == 1 || l2 != dimensionBehaviour7 || constraintWidget8.s == 1) {
                        X(constraintWidget8, this.y0, new zd5());
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour2) && h.b(this.I0, 1024) && g3u.b(this, this.y0))) {
            i = max6;
            i2 = max5;
            z = false;
        } else {
            if (dimensionBehaviour4 == dimensionBehaviour2) {
                if (max5 >= s() || max5 <= 0) {
                    max5 = s();
                } else {
                    Q(max5);
                    this.J0 = true;
                }
            }
            if (dimensionBehaviour3 == dimensionBehaviour2) {
                if (max6 >= m() || max6 <= 0) {
                    max6 = m();
                } else {
                    N(max6);
                    this.K0 = true;
                }
            }
            i = max6;
            i2 = max5;
            z = true;
        }
        boolean z11 = Y(64) || Y(128);
        ijy ijyVar = this.B0;
        ijyVar.getClass();
        ijyVar.h = false;
        if (this.I0 == 0 || !z11) {
            z2 = true;
        } else {
            z2 = true;
            ijyVar.h = true;
        }
        ArrayList arrayList2 = this.u0;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr3[0];
        boolean z12 = z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z13 = dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviourArr3[z12 ? 1 : 0] == dimensionBehaviour9;
        this.E0 = 0;
        this.F0 = 0;
        for (int i20 = 0; i20 < size; i20++) {
            ConstraintWidget constraintWidget9 = (ConstraintWidget) this.u0.get(i20);
            if (constraintWidget9 instanceof g151) {
                ((g151) constraintWidget9).T();
            }
        }
        boolean Y = Y(64);
        boolean z14 = z;
        int i21 = 0;
        boolean z15 = true;
        while (z15) {
            int i22 = i21 + 1;
            try {
                ijyVar.t();
                z3 = z13;
            } catch (Exception e) {
                e = e;
                z3 = z13;
            }
            try {
                this.E0 = 0;
                this.F0 = 0;
                i(ijyVar);
                for (int i23 = 0; i23 < size; i23++) {
                    ((ConstraintWidget) this.u0.get(i23)).i(ijyVar);
                }
                V(ijyVar);
                try {
                    WeakReference weakReference = this.L0;
                    if (weakReference == null || weakReference.get() == null) {
                        b7eVar = b7eVar2;
                    } else {
                        b7eVar = b7eVar2;
                        try {
                            ijyVar.f(ijyVar.k((b7e) this.L0.get()), ijyVar.k(b7eVar2), 0, 5);
                            this.L0 = null;
                        } catch (Exception e2) {
                            e = e2;
                            z15 = true;
                            PrintStream printStream = System.out;
                            e.toString();
                            printStream.getClass();
                            boolean[] zArr2 = h.a;
                            if (z15) {
                            }
                            if (z3) {
                            }
                            max = Math.max(this.d0, s());
                            if (max > s()) {
                            }
                            max2 = Math.max(this.e0, m());
                            if (max2 > m()) {
                            }
                            if (!z14) {
                            }
                            i3 = 8;
                            if (i22 <= i3) {
                            }
                            i21 = i22;
                            z13 = z3;
                            b7eVar2 = b7eVar;
                        }
                    }
                    WeakReference weakReference2 = this.N0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ijyVar.f(ijyVar.k(this.M), ijyVar.k((b7e) this.N0.get()), 0, 5);
                        this.N0 = null;
                    }
                    WeakReference weakReference3 = this.M0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        ijyVar.f(ijyVar.k((b7e) this.M0.get()), ijyVar.k(b7eVar3), 0, 5);
                        this.M0 = null;
                    }
                    WeakReference weakReference4 = this.O0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        ijyVar.f(ijyVar.k(this.L), ijyVar.k((b7e) this.O0.get()), 0, 5);
                        this.O0 = null;
                    }
                    ijyVar.p();
                    z15 = true;
                } catch (Exception e3) {
                    e = e3;
                    b7eVar = b7eVar2;
                }
            } catch (Exception e4) {
                e = e4;
                b7eVar = b7eVar2;
                PrintStream printStream2 = System.out;
                e.toString();
                printStream2.getClass();
                boolean[] zArr22 = h.a;
                if (z15) {
                }
                if (z3) {
                    int i24 = 0;
                    int i25 = 0;
                    while (i4 < size) {
                    }
                    max3 = Math.max(this.d0, i25);
                    max4 = Math.max(this.e0, i24);
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        Q(max3);
                        this.U[0] = dimensionBehaviour;
                        z14 = true;
                        z4 = true;
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        N(max4);
                        this.U[1] = dimensionBehaviour;
                        z14 = true;
                        z4 = true;
                    }
                }
                max = Math.max(this.d0, s());
                if (max > s()) {
                }
                max2 = Math.max(this.e0, m());
                if (max2 > m()) {
                }
                if (!z14) {
                }
                i3 = 8;
                if (i22 <= i3) {
                }
                i21 = i22;
                z13 = z3;
                b7eVar2 = b7eVar;
            }
            boolean[] zArr222 = h.a;
            if (z15) {
                zArr222[2] = false;
                boolean Y2 = Y(64);
                S(ijyVar, Y2);
                int size3 = this.u0.size();
                int i26 = 0;
                z4 = false;
                while (i26 < size3) {
                    boolean[] zArr3 = zArr222;
                    ConstraintWidget constraintWidget10 = (ConstraintWidget) this.u0.get(i26);
                    constraintWidget10.S(ijyVar, Y2);
                    int i27 = i26;
                    boolean z16 = Y2;
                    if (constraintWidget10.h != -1 || constraintWidget10.i != -1) {
                        z4 = true;
                    }
                    i26 = i27 + 1;
                    zArr222 = zArr3;
                    Y2 = z16;
                }
                zArr = zArr222;
            } else {
                zArr = zArr222;
                S(ijyVar, Y);
                for (int i28 = 0; i28 < size; i28++) {
                    ((ConstraintWidget) this.u0.get(i28)).S(ijyVar, Y);
                }
                z4 = false;
            }
            if (z3 && i22 < 8 && zArr[2]) {
                int i242 = 0;
                int i252 = 0;
                for (i4 = 0; i4 < size; i4++) {
                    ConstraintWidget constraintWidget11 = (ConstraintWidget) this.u0.get(i4);
                    i252 = Math.max(i252, constraintWidget11.s() + constraintWidget11.a0);
                    i242 = Math.max(i242, constraintWidget11.m() + constraintWidget11.b0);
                }
                max3 = Math.max(this.d0, i252);
                max4 = Math.max(this.e0, i242);
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour4 == dimensionBehaviour && s() < max3) {
                    Q(max3);
                    this.U[0] = dimensionBehaviour;
                    z14 = true;
                    z4 = true;
                }
                if (dimensionBehaviour3 == dimensionBehaviour && m() < max4) {
                    N(max4);
                    this.U[1] = dimensionBehaviour;
                    z14 = true;
                    z4 = true;
                }
            }
            max = Math.max(this.d0, s());
            if (max > s()) {
                Q(max);
                this.U[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z14 = true;
                z4 = true;
            }
            max2 = Math.max(this.e0, m());
            if (max2 > m()) {
                N(max2);
                r9 = 1;
                this.U[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                z14 = true;
                z4 = true;
            } else {
                r9 = 1;
            }
            if (!z14) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = this.U[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour10 == dimensionBehaviour11 && i2 > 0 && s() > i2) {
                    this.J0 = r9;
                    this.U[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    Q(i2);
                    z14 = r9;
                    z4 = z14;
                }
                if (this.U[r9] == dimensionBehaviour11 && i > 0 && m() > i) {
                    this.K0 = r9;
                    this.U[r9] = ConstraintWidget.DimensionBehaviour.FIXED;
                    N(i);
                    i3 = 8;
                    z14 = true;
                    z4 = true;
                    z15 = i22 <= i3 ? false : z4;
                    i21 = i22;
                    z13 = z3;
                    b7eVar2 = b7eVar;
                }
            }
            i3 = 8;
            if (i22 <= i3) {
            }
            i21 = i22;
            z13 = z3;
            b7eVar2 = b7eVar;
        }
        this.u0 = arrayList2;
        if (z14) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = this.U;
            dimensionBehaviourArr4[0] = dimensionBehaviour4;
            dimensionBehaviourArr4[1] = dimensionBehaviour3;
        }
        H(ijyVar.m);
    }

    public final void U(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.E0 + 1;
            c[] cVarArr = this.H0;
            if (i2 >= cVarArr.length) {
                this.H0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.H0;
            int i3 = this.E0;
            cVarArr2[i3] = new c(constraintWidget, 0, this.z0);
            this.E0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.F0 + 1;
            c[] cVarArr3 = this.G0;
            if (i4 >= cVarArr3.length) {
                this.G0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.G0;
            int i5 = this.F0;
            cVarArr4[i5] = new c(constraintWidget, 1, this.z0);
            this.F0 = i5 + 1;
        }
    }

    public final void V(ijy ijyVar) {
        d dVar;
        ijy ijyVar2;
        boolean Y = Y(64);
        c(ijyVar, Y);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.u0.get(i);
            boolean[] zArr = constraintWidget.T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.u0.get(i2);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i3 = 0; i3 < aVar.v0; i3++) {
                        ConstraintWidget constraintWidget3 = aVar.u0[i3];
                        if (aVar.x0 || constraintWidget3.d()) {
                            int i4 = aVar.w0;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.P0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.u0.get(i5);
            constraintWidget4.getClass();
            boolean z2 = constraintWidget4 instanceof i;
            if (z2 || (constraintWidget4 instanceof g)) {
                if (z2) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.c(ijyVar, Y);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) ((ConstraintWidget) it.next());
                for (int i6 = 0; i6 < iVar.v0; i6++) {
                    if (hashSet.contains(iVar.u0[i6])) {
                        iVar.c(ijyVar, Y);
                        hashSet.remove(iVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).c(ijyVar, Y);
                }
                hashSet.clear();
            }
        }
        if (ijy.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.u0.get(i7);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof i) && !(constraintWidget5 instanceof g)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            dVar = this;
            ijyVar2 = ijyVar;
            dVar.b(this, ijyVar2, hashSet2, this.U[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it3.next();
                h.a(dVar, ijyVar2, constraintWidget6);
                constraintWidget6.c(ijyVar2, Y);
            }
        } else {
            dVar = this;
            ijyVar2 = ijyVar;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) dVar.u0.get(i8);
                if (constraintWidget7 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.O(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.P(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.c(ijyVar2, Y);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.O(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.P(dimensionBehaviour2);
                    }
                } else {
                    h.a(dVar, ijyVar2, constraintWidget7);
                    if (!(constraintWidget7 instanceof i) && !(constraintWidget7 instanceof g)) {
                        constraintWidget7.c(ijyVar2, Y);
                    }
                }
            }
        }
        if (dVar.E0 > 0) {
            b.a(dVar, ijyVar2, null, 0);
        }
        if (dVar.F0 > 0) {
            b.a(dVar, ijyVar2, null, 1);
        }
    }

    public final boolean W(int i, boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        zwi zwiVar = this.w0;
        ArrayList arrayList = zwiVar.e;
        d dVar = zwiVar.a;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour l = dVar.l(0);
        ConstraintWidget.DimensionBehaviour l2 = dVar.l(1);
        int t = dVar.t();
        int u = dVar.u();
        if (z && (l == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || l2 == dimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.constraintlayout.core.widgets.analyzer.h hVar = (androidx.constraintlayout.core.widgets.analyzer.h) it.next();
                if (hVar.f == i && !hVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && l == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    dVar.O(ConstraintWidget.DimensionBehaviour.FIXED);
                    dVar.Q(zwiVar.d(dVar, 0));
                    dVar.d.e.d(dVar.s());
                }
            } else if (z && l2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                dVar.P(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.N(zwiVar.d(dVar, 1));
                dVar.e.e.d(dVar.m());
            }
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar.U;
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int s = dVar.s() + t;
                dVar.d.i.d(s);
                dVar.d.e.d(s - t);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int m = dVar.m() + u;
                dVar.e.i.d(m);
                dVar.e.e.d(m - u);
                z2 = true;
            }
            z2 = false;
        }
        zwiVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.h hVar2 = (androidx.constraintlayout.core.widgets.analyzer.h) it2.next();
            if (hVar2.f == i && (hVar2.b != dVar || hVar2.g)) {
                hVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            androidx.constraintlayout.core.widgets.analyzer.h hVar3 = (androidx.constraintlayout.core.widgets.analyzer.h) it3.next();
            if (hVar3.f == i && (z2 || hVar3.b != dVar)) {
                if (!hVar3.h.j) {
                    break;
                }
                if (!hVar3.i.j) {
                    break;
                }
                if (!(hVar3 instanceof n89) && !hVar3.e.j) {
                    break;
                }
            }
        }
        dVar.O(l);
        dVar.P(l2);
        return z3;
    }

    public final boolean Y(int i) {
        return (this.I0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void p(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((ConstraintWidget) it.next()).p(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
