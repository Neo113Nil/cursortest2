package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.lfu;
import defpackage.sd5;
import defpackage.xwi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends h {
    public final a k;
    public sd5 l;

    public g(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        a aVar = new a(this);
        this.k = aVar;
        this.l = null;
        this.h.e = DependencyNode$Type.TOP;
        this.i.e = DependencyNode$Type.BOTTOM;
        aVar.e = DependencyNode$Type.BASELINE;
        this.f = 1;
    }

    @Override // defpackage.xwi
    public final void a(xwi xwiVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (f.a[this.j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.K, constraintWidget.M, 1);
            return;
        }
        b bVar = this.e;
        if (bVar.c && !bVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.s;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.e.e.j) {
                        bVar.d((int) ((r1.g * constraintWidget2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                b bVar2 = constraintWidget2.d.e;
                if (bVar2.j) {
                    int i3 = constraintWidget2.Z;
                    if (i3 == -1) {
                        f = bVar2.g;
                        f2 = constraintWidget2.Y;
                    } else if (i3 == 0) {
                        f3 = bVar2.g * constraintWidget2.Y;
                        i = (int) (f3 + 0.5f);
                        bVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        bVar.d(i);
                    } else {
                        f = bVar2.g;
                        f2 = constraintWidget2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    bVar.d(i);
                }
            }
        }
        a aVar = this.h;
        boolean z = aVar.c;
        ArrayList arrayList = aVar.l;
        if (z) {
            a aVar2 = this.i;
            boolean z2 = aVar2.c;
            ArrayList arrayList2 = aVar2.l;
            if (z2) {
                if (aVar.j && aVar2.j && bVar.j) {
                    return;
                }
                if (!bVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.r == 0 && !constraintWidget4.A()) {
                        a aVar3 = (a) arrayList.get(0);
                        a aVar4 = (a) arrayList2.get(0);
                        int i4 = aVar3.g + aVar.f;
                        int i5 = aVar4.g + aVar2.f;
                        aVar.d(i4);
                        aVar2.d(i5);
                        bVar.d(i5 - i4);
                        return;
                    }
                }
                if (!bVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a aVar5 = (a) arrayList.get(0);
                    int i6 = (((a) arrayList2.get(0)).g + aVar2.f) - (aVar5.g + aVar.f);
                    int i7 = bVar.m;
                    if (i6 < i7) {
                        bVar.d(i6);
                    } else {
                        bVar.d(i7);
                    }
                }
                if (bVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a aVar6 = (a) arrayList.get(0);
                    a aVar7 = (a) arrayList2.get(0);
                    int i8 = aVar6.g;
                    int i9 = aVar.f + i8;
                    int i10 = aVar7.g;
                    int i11 = aVar2.f + i10;
                    float f4 = this.b.g0;
                    if (aVar6 == aVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    aVar.d((int) ((((i10 - i8) - bVar.g) * f4) + i8 + 0.5f));
                    aVar2.d(aVar.g + bVar.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        b bVar = this.e;
        if (z) {
            bVar.d(constraintWidget5.m());
        }
        boolean z2 = bVar.j;
        ArrayList arrayList = bVar.k;
        ArrayList arrayList2 = bVar.l;
        a aVar = this.i;
        a aVar2 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            this.d = constraintWidget6.U[1];
            if (constraintWidget6.E) {
                this.l = new sd5(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.b.V) != null && constraintWidget4.U[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int m = (constraintWidget4.m() - this.b.K.e()) - this.b.M.e();
                    h.b(aVar2, constraintWidget4.e.h, this.b.K.e());
                    h.b(aVar, constraintWidget4.e.i, -this.b.M.e());
                    bVar.d(m);
                    return;
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    bVar.d(this.b.m());
                }
            }
        } else if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.b).V) != null && constraintWidget2.U[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            h.b(aVar2, constraintWidget2.e.h, constraintWidget.K.e());
            h.b(aVar, constraintWidget2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = bVar.j;
        a aVar3 = this.k;
        if (z3) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                b7e[] b7eVarArr = constraintWidget7.R;
                b7e b7eVar = b7eVarArr[2];
                b7e b7eVar2 = b7eVar.f;
                if (b7eVar2 != null && b7eVarArr[3].f != null) {
                    boolean A = constraintWidget7.A();
                    ConstraintWidget constraintWidget8 = this.b;
                    if (A) {
                        aVar2.f = constraintWidget8.R[2].e();
                        aVar.f = -this.b.R[3].e();
                    } else {
                        a h = h.h(constraintWidget8.R[2]);
                        if (h != null) {
                            h.b(aVar2, h, this.b.R[2].e());
                        }
                        a h2 = h.h(this.b.R[3]);
                        if (h2 != null) {
                            h.b(aVar, h2, -this.b.R[3].e());
                        }
                        aVar2.b = true;
                        aVar.b = true;
                    }
                    ConstraintWidget constraintWidget9 = this.b;
                    if (constraintWidget9.E) {
                        h.b(aVar3, aVar2, constraintWidget9.c0);
                        return;
                    }
                    return;
                }
                if (b7eVar2 != null) {
                    a h3 = h.h(b7eVar);
                    if (h3 != null) {
                        h.b(aVar2, h3, this.b.R[2].e());
                        h.b(aVar, aVar2, bVar.g);
                        ConstraintWidget constraintWidget10 = this.b;
                        if (constraintWidget10.E) {
                            h.b(aVar3, aVar2, constraintWidget10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                b7e b7eVar3 = b7eVarArr[3];
                if (b7eVar3.f != null) {
                    a h4 = h.h(b7eVar3);
                    if (h4 != null) {
                        h.b(aVar, h4, -this.b.R[3].e());
                        h.b(aVar2, aVar, -bVar.g);
                    }
                    ConstraintWidget constraintWidget11 = this.b;
                    if (constraintWidget11.E) {
                        h.b(aVar3, aVar2, constraintWidget11.c0);
                        return;
                    }
                    return;
                }
                b7e b7eVar4 = b7eVarArr[4];
                if (b7eVar4.f != null) {
                    a h5 = h.h(b7eVar4);
                    if (h5 != null) {
                        h.b(aVar3, h5, 0);
                        h.b(aVar2, aVar3, -this.b.c0);
                        h.b(aVar, aVar2, bVar.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof lfu) || constraintWidget7.V == null || constraintWidget7.k(ConstraintAnchor$Type.CENTER).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget12 = this.b;
                h.b(aVar2, constraintWidget12.V.e.h, constraintWidget12.u());
                h.b(aVar, aVar2, bVar.g);
                ConstraintWidget constraintWidget13 = this.b;
                if (constraintWidget13.E) {
                    h.b(aVar3, aVar2, constraintWidget13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            bVar.b(this);
        } else {
            ConstraintWidget constraintWidget14 = this.b;
            int i = constraintWidget14.s;
            if (i == 2) {
                ConstraintWidget constraintWidget15 = constraintWidget14.V;
                if (constraintWidget15 != null) {
                    b bVar2 = constraintWidget15.e.e;
                    arrayList2.add(bVar2);
                    bVar2.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            } else if (i == 3 && !constraintWidget14.A()) {
                ConstraintWidget constraintWidget16 = this.b;
                if (constraintWidget16.r != 3) {
                    b bVar3 = constraintWidget16.d.e;
                    arrayList2.add(bVar3);
                    bVar3.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            }
        }
        ConstraintWidget constraintWidget17 = this.b;
        b7e[] b7eVarArr2 = constraintWidget17.R;
        b7e b7eVar5 = b7eVarArr2[2];
        b7e b7eVar6 = b7eVar5.f;
        if (b7eVar6 != null && b7eVarArr2[3].f != null) {
            boolean A2 = constraintWidget17.A();
            ConstraintWidget constraintWidget18 = this.b;
            if (A2) {
                aVar2.f = constraintWidget18.R[2].e();
                aVar.f = -this.b.R[3].e();
            } else {
                a h6 = h.h(constraintWidget18.R[2]);
                a h7 = h.h(this.b.R[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = WidgetRun$RunType.CENTER;
            }
            if (this.b.E) {
                c(aVar3, aVar2, 1, this.l);
            }
        } else if (b7eVar6 != null) {
            a h8 = h.h(b7eVar5);
            if (h8 != null) {
                h.b(aVar2, h8, this.b.R[2].e());
                c(aVar, aVar2, 1, bVar);
                if (this.b.E) {
                    c(aVar3, aVar2, 1, this.l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget19 = this.b;
                    if (constraintWidget19.Y > 0.0f) {
                        e eVar = constraintWidget19.d;
                        if (eVar.d == dimensionBehaviour3) {
                            eVar.e.k.add(bVar);
                            arrayList2.add(this.b.d.e);
                            bVar.a = this;
                        }
                    }
                }
            }
        } else {
            b7e b7eVar7 = b7eVarArr2[3];
            if (b7eVar7.f != null) {
                a h9 = h.h(b7eVar7);
                if (h9 != null) {
                    h.b(aVar, h9, -this.b.R[3].e());
                    c(aVar2, aVar, -1, bVar);
                    if (this.b.E) {
                        c(aVar3, aVar2, 1, this.l);
                    }
                }
            } else {
                b7e b7eVar8 = b7eVarArr2[4];
                if (b7eVar8.f != null) {
                    a h10 = h.h(b7eVar8);
                    if (h10 != null) {
                        h.b(aVar3, h10, 0);
                        c(aVar2, aVar3, -1, this.l);
                        c(aVar, aVar2, 1, bVar);
                    }
                } else if (!(constraintWidget17 instanceof lfu) && (constraintWidget3 = constraintWidget17.V) != null) {
                    h.b(aVar2, constraintWidget3.e.h, constraintWidget17.u());
                    c(aVar, aVar2, 1, bVar);
                    if (this.b.E) {
                        c(aVar3, aVar2, 1, this.l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        ConstraintWidget constraintWidget20 = this.b;
                        if (constraintWidget20.Y > 0.0f) {
                            e eVar2 = constraintWidget20.d;
                            if (eVar2.d == dimensionBehaviour5) {
                                eVar2.e.k.add(bVar);
                                arrayList2.add(this.b.d.e);
                                bVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            bVar.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void e() {
        a aVar = this.h;
        if (aVar.j) {
            this.b.b0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        a aVar = this.h;
        aVar.c();
        aVar.j = false;
        a aVar2 = this.i;
        aVar2.c();
        aVar2.j = false;
        a aVar3 = this.k;
        aVar3.c();
        aVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
