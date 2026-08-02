package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.kt6;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class lzl {
    public final androidx.constraintlayout.core.widgets.d a;
    public final androidx.constraintlayout.core.widgets.d d;
    public kt6.b f;
    public final kt6.a g;
    public final ArrayList<xrg0> h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList<pnx0> e = new ArrayList<>();

    public lzl(androidx.constraintlayout.core.widgets.d dVar) {
        new ArrayList();
        this.f = null;
        this.g = new kt6.a();
        this.h = new ArrayList<>();
        this.a = dVar;
        this.d = dVar;
    }

    public final void a(mzl mzlVar, int i, ArrayList arrayList, xrg0 xrg0Var) {
        pnx0 pnx0Var = mzlVar.d;
        xrg0 xrg0Var2 = pnx0Var.c;
        mzl mzlVar2 = pnx0Var.i;
        mzl mzlVar3 = pnx0Var.h;
        if (xrg0Var2 == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            if (pnx0Var == dVar.d || pnx0Var == dVar.e) {
                return;
            }
            if (xrg0Var == null) {
                xrg0Var = new xrg0(pnx0Var);
                arrayList.add(xrg0Var);
            }
            pnx0Var.c = xrg0Var;
            xrg0Var.a(pnx0Var);
            Iterator it = mzlVar3.k.iterator();
            while (it.hasNext()) {
                hzl hzlVar = (hzl) it.next();
                if (hzlVar instanceof mzl) {
                    a((mzl) hzlVar, i, arrayList, xrg0Var);
                }
            }
            Iterator it2 = mzlVar2.k.iterator();
            while (it2.hasNext()) {
                hzl hzlVar2 = (hzl) it2.next();
                if (hzlVar2 instanceof mzl) {
                    a((mzl) hzlVar2, i, arrayList, xrg0Var);
                }
            }
            if (i == 1 && (pnx0Var instanceof fpr0)) {
                Iterator it3 = ((fpr0) pnx0Var).k.k.iterator();
                while (it3.hasNext()) {
                    hzl hzlVar3 = (hzl) it3.next();
                    if (hzlVar3 instanceof mzl) {
                        a((mzl) hzlVar3, i, arrayList, xrg0Var);
                    }
                }
            }
            Iterator it4 = mzlVar3.l.iterator();
            while (it4.hasNext()) {
                a((mzl) it4.next(), i, arrayList, xrg0Var);
            }
            Iterator it5 = mzlVar2.l.iterator();
            while (it5.hasNext()) {
                a((mzl) it5.next(), i, arrayList, xrg0Var);
            }
            if (i == 1 && (pnx0Var instanceof fpr0)) {
                Iterator it6 = ((fpr0) pnx0Var).k.l.iterator();
                while (it6.hasNext()) {
                    a((mzl) it6.next(), i, arrayList, xrg0Var);
                }
            }
        }
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar) {
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator<ConstraintWidget> it = dVar.v0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
            ConstraintAnchor[] constraintAnchorArr = next.S;
            ConstraintAnchor constraintAnchor = next.N;
            ConstraintAnchor constraintAnchor2 = next.L;
            ConstraintAnchor constraintAnchor3 = next.M;
            ConstraintAnchor constraintAnchor4 = next.K;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (next.j0 == 8) {
                next.a = true;
            } else {
                float f = next.x;
                if (f < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.s = 2;
                }
                float f2 = next.A;
                if (f2 < 1.0f) {
                    c = 0;
                    if (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.t = 2;
                    }
                } else {
                    c = 0;
                }
                if (next.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.s = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.t = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (next.s == 0) {
                            next.s = 3;
                        }
                        if (next.t == 0) {
                            next.t = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && next.s == 1 && (constraintAnchor4.f == null || constraintAnchor3.f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour6 == dimensionBehaviour8 && next.t == 1 && (constraintAnchor2.f == null || constraintAnchor.f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                yfv yfvVar = next.d;
                yfvVar.d = dimensionBehaviour5;
                int i = next.s;
                yfvVar.a = i;
                fpr0 fpr0Var = next.e;
                fpr0Var.d = dimensionBehaviour6;
                int i2 = next.t;
                fpr0Var.a = i2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                Iterator<ConstraintWidget> it2 = it;
                if ((dimensionBehaviour5 == dimensionBehaviour9 || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour6 == dimensionBehaviour9 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                    int v = next.v();
                    if (dimensionBehaviour5 == dimensionBehaviour9) {
                        v = (dVar.v() - constraintAnchor4.g) - constraintAnchor3.g;
                        dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int p = next.p();
                    if (dimensionBehaviour10 == dimensionBehaviour9) {
                        p = (dVar.p() - constraintAnchor2.g) - constraintAnchor.g;
                        dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    f(next, dimensionBehaviour5, v, dimensionBehaviour10, p);
                    next.d.e.d(next.v());
                    next.e.e.d(next.p());
                    next.a = true;
                } else {
                    if (dimensionBehaviour5 != dimensionBehaviour8 || (dimensionBehaviour6 != (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour6 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour = dimensionBehaviour6;
                    } else if (i == 3) {
                        if (dimensionBehaviour6 == dimensionBehaviour4) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        int p2 = next.p();
                        int i3 = (int) ((p2 * next.Z) + 0.5f);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                        f(next, dimensionBehaviour11, i3, dimensionBehaviour11, p2);
                        next.d.e.d(next.v());
                        next.e.e.d(next.p());
                        next.a = true;
                    } else if (i == 1) {
                        f(next, dimensionBehaviour4, 0, dimensionBehaviour6, 0);
                        next.d.e.m = next.v();
                    } else {
                        dimensionBehaviour = dimensionBehaviour6;
                        if (i == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dVar.V[c];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour12 == dimensionBehaviour13 || dimensionBehaviour12 == dimensionBehaviour9) {
                                f(next, dimensionBehaviour13, (int) ((f * dVar.v()) + 0.5f), dimensionBehaviour, next.p());
                                next.d.e.d(next.v());
                                next.e.e.d(next.p());
                                next.a = true;
                            }
                        } else if (constraintAnchorArr[c].f == null || constraintAnchorArr[1].f == null) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour, 0);
                            next.d.e.d(next.v());
                            next.e.e.d(next.p());
                            next.a = true;
                        }
                    }
                    if (dimensionBehaviour != dimensionBehaviour8 || (dimensionBehaviour5 != (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour5 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour2 = dimensionBehaviour;
                    } else if (i2 == 3) {
                        if (dimensionBehaviour5 == dimensionBehaviour3) {
                            f(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                        }
                        int v2 = next.v();
                        float f3 = next.Z;
                        if (next.a0 == -1) {
                            f3 = 1.0f / f3;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                        f(next, dimensionBehaviour14, v2, dimensionBehaviour14, (int) ((v2 * f3) + 0.5f));
                        next.d.e.d(next.v());
                        next.e.e.d(next.p());
                        next.a = true;
                    } else if (i2 == 1) {
                        f(next, dimensionBehaviour5, 0, dimensionBehaviour3, 0);
                        next.e.e.m = next.p();
                    } else {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviour5;
                        if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.V[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour18 || dimensionBehaviour16 == dimensionBehaviour9) {
                                f(next, dimensionBehaviour15, next.v(), dimensionBehaviour18, (int) ((f2 * dVar.p()) + 0.5f));
                                next.d.e.d(next.v());
                                next.e.e.d(next.p());
                                next.a = true;
                            } else {
                                dimensionBehaviour2 = dimensionBehaviour17;
                                dimensionBehaviour5 = dimensionBehaviour15;
                            }
                        } else {
                            dimensionBehaviour5 = dimensionBehaviour15;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour;
                            if (constraintAnchorArr[2].f == null || constraintAnchorArr[3].f == null) {
                                f(next, dimensionBehaviour3, 0, dimensionBehaviour19, 0);
                                next.d.e.d(next.v());
                                next.e.e.d(next.p());
                                next.a = true;
                            } else {
                                dimensionBehaviour2 = dimensionBehaviour19;
                            }
                        }
                    }
                    if (dimensionBehaviour5 == dimensionBehaviour8 && dimensionBehaviour2 == dimensionBehaviour8) {
                        if (i == 1 || i2 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            f(next, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            next.d.e.m = next.v();
                            next.e.e.m = next.p();
                        } else if (i2 == 2 && i == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.V;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviourArr2[c];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour21 == dimensionBehaviour22 && dimensionBehaviourArr2[1] == dimensionBehaviour22) {
                                f(next, dimensionBehaviour22, (int) ((f * dVar.v()) + 0.5f), dimensionBehaviour22, (int) ((f2 * dVar.p()) + 0.5f));
                                next.d.e.d(next.v());
                                next.e.e.d(next.p());
                                next.a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<pnx0> arrayList = this.e;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.d dVar = this.d;
        dVar.d.f();
        dVar.e.f();
        arrayList.add(dVar.d);
        arrayList.add(dVar.e);
        Iterator<ConstraintWidget> it = dVar.v0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new wru((androidx.constraintlayout.core.widgets.f) next));
            } else {
                if (next.C()) {
                    if (next.b == null) {
                        next.b = new era(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.D()) {
                    if (next.c == null) {
                        next.c = new era(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof e2v) {
                    arrayList.add(new c2v(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<pnx0> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<pnx0> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            pnx0 next2 = it3.next();
            if (next2.b != dVar) {
                next2.d();
            }
        }
        ArrayList<xrg0> arrayList2 = this.h;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.d dVar2 = this.a;
        e(dVar2.d, 0, arrayList2);
        e(dVar2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(androidx.constraintlayout.core.widgets.d dVar, int i) {
        ArrayList<xrg0> arrayList = this.h;
        int size = arrayList.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, arrayList.get(i2).b(dVar, i));
        }
        return (int) j;
    }

    public final void e(pnx0 pnx0Var, int i, ArrayList<xrg0> arrayList) {
        mzl mzlVar = pnx0Var.h;
        mzl mzlVar2 = pnx0Var.i;
        Iterator it = mzlVar.k.iterator();
        while (it.hasNext()) {
            hzl hzlVar = (hzl) it.next();
            if (hzlVar instanceof mzl) {
                a((mzl) hzlVar, i, arrayList, null);
            } else if (hzlVar instanceof pnx0) {
                a(((pnx0) hzlVar).h, i, arrayList, null);
            }
        }
        Iterator it2 = mzlVar2.k.iterator();
        while (it2.hasNext()) {
            hzl hzlVar2 = (hzl) it2.next();
            if (hzlVar2 instanceof mzl) {
                a((mzl) hzlVar2, i, arrayList, null);
            } else if (hzlVar2 instanceof pnx0) {
                a(((pnx0) hzlVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((fpr0) pnx0Var).k.k.iterator();
            while (it3.hasNext()) {
                hzl hzlVar3 = (hzl) it3.next();
                if (hzlVar3 instanceof mzl) {
                    a((mzl) hzlVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        kt6.a aVar = this.g;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.f.a(constraintWidget, aVar);
        constraintWidget.W(aVar.e);
        constraintWidget.R(aVar.f);
        constraintWidget.F = aVar.h;
        constraintWidget.N(aVar.g);
    }

    public final void g() {
        dt6 dt6Var;
        Iterator<ConstraintWidget> it = this.a.v0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.s;
                int i2 = next.t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                azm azmVar = next.d.e;
                boolean z3 = azmVar.j;
                azm azmVar2 = next.e.e;
                boolean z4 = azmVar2.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    f(next, dimensionBehaviour4, azmVar.g, dimensionBehaviour4, azmVar2.g);
                    next.a = true;
                } else if (z3 && z) {
                    f(next, ConstraintWidget.DimensionBehaviour.FIXED, azmVar.g, dimensionBehaviour3, azmVar2.g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.e.e.m = next.p();
                    } else {
                        next.e.e.d(next.p());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    f(next, dimensionBehaviour3, azmVar.g, ConstraintWidget.DimensionBehaviour.FIXED, azmVar2.g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.d.e.m = next.v();
                    } else {
                        next.d.e.d(next.v());
                        next.a = true;
                    }
                }
                if (next.a && (dt6Var = next.e.l) != null) {
                    dt6Var.d(next.d0);
                }
            }
        }
    }
}
