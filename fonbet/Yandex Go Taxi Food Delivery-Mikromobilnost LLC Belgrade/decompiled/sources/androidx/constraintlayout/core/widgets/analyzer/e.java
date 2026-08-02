package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.lfu;
import defpackage.xwi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends h {
    public static final int[] k = new int[2];

    public e(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode$Type.LEFT;
        this.i.e = DependencyNode$Type.RIGHT;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x023f, code lost:
    
        if (r15 != 1) goto L124;
     */
    @Override // defpackage.xwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xwi xwiVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (d.a[this.j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.J, constraintWidget.L, 0);
            return;
        }
        b bVar = this.e;
        boolean z = bVar.j;
        a aVar = this.h;
        a aVar2 = this.i;
        if (!z && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.r;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.d.e.j) {
                        bVar.d((int) ((r3.g * constraintWidget2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = constraintWidget2.s;
                if (i3 == 0 || i3 == 3) {
                    g gVar = constraintWidget2.e;
                    a aVar3 = gVar.h;
                    a aVar4 = gVar.i;
                    boolean z2 = constraintWidget2.J.f != null;
                    boolean z3 = constraintWidget2.K.f != null;
                    boolean z4 = constraintWidget2.L.f != null;
                    boolean z5 = constraintWidget2.M.f != null;
                    int i4 = constraintWidget2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = constraintWidget2.Y;
                        boolean z6 = aVar3.j;
                        ArrayList arrayList = aVar3.l;
                        int[] iArr = k;
                        if (z6 && aVar4.j) {
                            if (aVar.c && aVar2.c) {
                                m(iArr, ((a) aVar.l.get(0)).g + aVar.f, ((a) aVar2.l.get(0)).g - aVar2.f, aVar3.g + aVar3.f, aVar4.g - aVar4.f, f4, i4);
                                bVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (aVar.j && aVar2.j) {
                            if (!aVar3.c || !aVar4.c) {
                                return;
                            }
                            m(iArr, aVar.g + aVar.f, aVar2.g - aVar2.f, ((a) arrayList.get(0)).g + aVar3.f, ((a) aVar4.l.get(0)).g - aVar4.f, f4, i4);
                            bVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!aVar.c || !aVar2.c || !aVar3.c || !aVar4.c) {
                            return;
                        }
                        m(iArr, ((a) aVar.l.get(0)).g + aVar.f, ((a) aVar2.l.get(0)).g - aVar2.f, ((a) arrayList.get(0)).g + aVar3.f, ((a) aVar4.l.get(0)).g - aVar4.f, f4, i4);
                        bVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!aVar.c || !aVar2.c) {
                            return;
                        }
                        float f5 = constraintWidget2.Y;
                        int i5 = ((a) aVar.l.get(0)).g + aVar.f;
                        int i6 = ((a) aVar2.l.get(0)).g - aVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f5) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f5) + 0.5f);
                            }
                            bVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f5) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f5) + 0.5f);
                            }
                            bVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z3 && z5) {
                        if (!aVar3.c || !aVar4.c) {
                            return;
                        }
                        float f6 = constraintWidget2.Y;
                        int i9 = ((a) aVar3.l.get(0)).g + aVar3.f;
                        int i10 = ((a) aVar4.l.get(0)).g - aVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f6) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f6) + 0.5f);
                                }
                                bVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f6) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f6) + 0.5f);
                        }
                        bVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = constraintWidget2.Z;
                    if (i13 == -1) {
                        f = constraintWidget2.e.e.g;
                        f2 = constraintWidget2.Y;
                    } else if (i13 == 0) {
                        f3 = constraintWidget2.e.e.g / constraintWidget2.Y;
                        i = (int) (f3 + 0.5f);
                        bVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        bVar.d(i);
                    } else {
                        f = constraintWidget2.e.e.g;
                        f2 = constraintWidget2.Y;
                    }
                    f3 = f * f2;
                    i = (int) (f3 + 0.5f);
                    bVar.d(i);
                }
            }
        }
        boolean z7 = aVar.c;
        ArrayList arrayList2 = aVar.l;
        if (z7) {
            boolean z8 = aVar2.c;
            ArrayList arrayList3 = aVar2.l;
            if (z8) {
                if (aVar.j && aVar2.j && bVar.j) {
                    return;
                }
                if (!bVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.r == 0 && !constraintWidget4.z()) {
                        a aVar5 = (a) arrayList2.get(0);
                        a aVar6 = (a) arrayList3.get(0);
                        int i14 = aVar5.g + aVar.f;
                        int i15 = aVar6.g + aVar2.f;
                        aVar.d(i14);
                        aVar2.d(i15);
                        bVar.d(i15 - i14);
                        return;
                    }
                }
                if (!bVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((a) arrayList3.get(0)).g + aVar2.f) - (((a) arrayList2.get(0)).g + aVar.f), bVar.m);
                    ConstraintWidget constraintWidget5 = this.b;
                    int i16 = constraintWidget5.v;
                    int max = Math.max(constraintWidget5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    bVar.d(max);
                }
                if (bVar.j) {
                    a aVar7 = (a) arrayList2.get(0);
                    a aVar8 = (a) arrayList3.get(0);
                    int i17 = aVar7.g;
                    int i18 = aVar.f + i17;
                    int i19 = aVar8.g;
                    int i20 = aVar2.f + i19;
                    float f7 = this.b.f0;
                    if (aVar7 == aVar8) {
                        f7 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    aVar.d((int) ((((i19 - i17) - bVar.g) * f7) + i17 + 0.5f));
                    aVar2.d(aVar.g + bVar.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        b bVar = this.e;
        if (z) {
            bVar.d(constraintWidget5.s());
        }
        boolean z2 = bVar.j;
        ArrayList arrayList = bVar.k;
        ArrayList arrayList2 = bVar.l;
        a aVar = this.i;
        a aVar2 = this.h;
        if (z2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget2 = (constraintWidget = this.b).V) != null && ((dimensionBehaviour = constraintWidget2.U[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == dimensionBehaviour4)) {
                h.b(aVar2, constraintWidget2.d.h, constraintWidget.J.e());
                h.b(aVar, constraintWidget2.d.i, -this.b.L.e());
                return;
            }
        } else {
            ConstraintWidget constraintWidget6 = this.b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidget6.U[0];
            this.d = dimensionBehaviour5;
            if (dimensionBehaviour5 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour5 == dimensionBehaviour6 && (constraintWidget4 = constraintWidget6.V) != null && ((dimensionBehaviour2 = constraintWidget4.U[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == dimensionBehaviour6)) {
                    int s = (constraintWidget4.s() - this.b.J.e()) - this.b.L.e();
                    h.b(aVar2, constraintWidget4.d.h, this.b.J.e());
                    h.b(aVar, constraintWidget4.d.i, -this.b.L.e());
                    bVar.d(s);
                    return;
                }
                if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    bVar.d(constraintWidget6.s());
                }
            }
        }
        if (bVar.j) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                b7e[] b7eVarArr = constraintWidget7.R;
                b7e b7eVar = b7eVarArr[0];
                b7e b7eVar2 = b7eVar.f;
                if (b7eVar2 != null && b7eVarArr[1].f != null) {
                    boolean z3 = constraintWidget7.z();
                    ConstraintWidget constraintWidget8 = this.b;
                    if (z3) {
                        aVar2.f = constraintWidget8.R[0].e();
                        aVar.f = -this.b.R[1].e();
                        return;
                    }
                    a h = h.h(constraintWidget8.R[0]);
                    if (h != null) {
                        h.b(aVar2, h, this.b.R[0].e());
                    }
                    a h2 = h.h(this.b.R[1]);
                    if (h2 != null) {
                        h.b(aVar, h2, -this.b.R[1].e());
                    }
                    aVar2.b = true;
                    aVar.b = true;
                    return;
                }
                if (b7eVar2 != null) {
                    a h3 = h.h(b7eVar);
                    if (h3 != null) {
                        h.b(aVar2, h3, this.b.R[0].e());
                        h.b(aVar, aVar2, bVar.g);
                        return;
                    }
                    return;
                }
                b7e b7eVar3 = b7eVarArr[1];
                if (b7eVar3.f != null) {
                    a h4 = h.h(b7eVar3);
                    if (h4 != null) {
                        h.b(aVar, h4, -this.b.R[1].e());
                        h.b(aVar2, aVar, -bVar.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof lfu) || constraintWidget7.V == null || constraintWidget7.k(ConstraintAnchor$Type.CENTER).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget9 = this.b;
                h.b(aVar2, constraintWidget9.V.d.h, constraintWidget9.t());
                h.b(aVar, aVar2, bVar.g);
                return;
            }
        }
        if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget10 = this.b;
            int i = constraintWidget10.r;
            if (i == 2) {
                ConstraintWidget constraintWidget11 = constraintWidget10.V;
                if (constraintWidget11 != null) {
                    b bVar2 = constraintWidget11.e.e;
                    arrayList2.add(bVar2);
                    bVar2.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            } else if (i == 3) {
                if (constraintWidget10.s == 3) {
                    aVar2.a = this;
                    aVar.a = this;
                    g gVar = constraintWidget10.e;
                    gVar.h.a = this;
                    gVar.i.a = this;
                    bVar.a = this;
                    if (constraintWidget10.A()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(bVar);
                        g gVar2 = this.b.e;
                        gVar2.e.a = this;
                        arrayList2.add(gVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(bVar);
                        this.b.e.i.k.add(bVar);
                    } else {
                        boolean z4 = this.b.z();
                        ConstraintWidget constraintWidget12 = this.b;
                        if (z4) {
                            constraintWidget12.e.e.l.add(bVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            constraintWidget12.e.e.l.add(bVar);
                        }
                    }
                } else {
                    b bVar3 = constraintWidget10.e.e;
                    arrayList2.add(bVar3);
                    bVar3.k.add(bVar);
                    this.b.e.h.k.add(bVar);
                    this.b.e.i.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                    aVar2.l.add(bVar);
                    aVar.l.add(bVar);
                }
            }
        }
        ConstraintWidget constraintWidget13 = this.b;
        b7e[] b7eVarArr2 = constraintWidget13.R;
        b7e b7eVar4 = b7eVarArr2[0];
        b7e b7eVar5 = b7eVar4.f;
        if (b7eVar5 != null && b7eVarArr2[1].f != null) {
            boolean z5 = constraintWidget13.z();
            ConstraintWidget constraintWidget14 = this.b;
            if (z5) {
                aVar2.f = constraintWidget14.R[0].e();
                aVar.f = -this.b.R[1].e();
                return;
            }
            a h5 = h.h(constraintWidget14.R[0]);
            a h6 = h.h(this.b.R[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = WidgetRun$RunType.CENTER;
            return;
        }
        if (b7eVar5 != null) {
            a h7 = h.h(b7eVar4);
            if (h7 != null) {
                h.b(aVar2, h7, this.b.R[0].e());
                c(aVar, aVar2, 1, bVar);
                return;
            }
            return;
        }
        b7e b7eVar6 = b7eVarArr2[1];
        if (b7eVar6.f != null) {
            a h8 = h.h(b7eVar6);
            if (h8 != null) {
                h.b(aVar, h8, -this.b.R[1].e());
                c(aVar2, aVar, -1, bVar);
                return;
            }
            return;
        }
        if ((constraintWidget13 instanceof lfu) || (constraintWidget3 = constraintWidget13.V) == null) {
            return;
        }
        h.b(aVar2, constraintWidget3.d.h, constraintWidget13.t());
        c(aVar, aVar2, 1, bVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void e() {
        a aVar = this.h;
        if (aVar.j) {
            this.b.a0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        a aVar = this.h;
        aVar.c();
        aVar.j = false;
        a aVar2 = this.i;
        aVar2.c();
        aVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
