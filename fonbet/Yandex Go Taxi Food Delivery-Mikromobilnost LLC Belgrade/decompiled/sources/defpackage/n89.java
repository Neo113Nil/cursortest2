package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.analyzer.h;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class n89 extends h {
    public final ArrayList k;
    public int l;

    public n89(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ConstraintWidget constraintWidget3 = this.b;
        ConstraintWidget o = constraintWidget3.o(i);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = o;
            if (constraintWidget3 == null) {
                break;
            } else {
                o = constraintWidget3.o(this.f);
            }
        }
        this.b = constraintWidget2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? constraintWidget2.d : i2 == 1 ? constraintWidget2.e : null);
        ConstraintWidget n = constraintWidget2.n(this.f);
        while (n != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? n.d : i3 == 1 ? n.e : null);
            n = n.n(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                hVar.b.b = this;
            } else if (i4 == 1) {
                hVar.b.c = this;
            }
        }
        if (this.f == 0 && ((d) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((h) unr0.k(1, arrayList)).b;
        }
        int i5 = this.f;
        ConstraintWidget constraintWidget4 = this.b;
        this.l = i5 == 0 ? constraintWidget4.l0 : constraintWidget4.m0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x039b, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    @Override // defpackage.xwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xwi xwiVar) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        a aVar = this.h;
        if (aVar.j) {
            a aVar2 = this.i;
            if (aVar2.j) {
                ConstraintWidget constraintWidget = this.b.V;
                boolean z3 = constraintWidget instanceof d ? ((d) constraintWidget).z0 : false;
                int i13 = aVar2.g - aVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((h) arrayList.get(i14)).b.i0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                int i16 = i15;
                while (true) {
                    if (i16 < 0) {
                        break;
                    }
                    if (((h) arrayList.get(i16)).b.i0 != 8) {
                        i = i16;
                        break;
                    }
                    i16--;
                }
                int i17 = 0;
                while (i17 < 2) {
                    f = 0.0f;
                    i4 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f2 = 0.0f;
                    while (i18 < size) {
                        h hVar = (h) arrayList.get(i18);
                        ConstraintWidget constraintWidget2 = hVar.b;
                        boolean z4 = z3;
                        if (constraintWidget2.i0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i4 += hVar.h.f;
                            }
                            b bVar = hVar.e;
                            int i21 = bVar.g;
                            int i22 = i4;
                            boolean z5 = hVar.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !constraintWidget2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !constraintWidget2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (hVar.a == 1 && i17 == 0) {
                                    i12 = bVar.m;
                                    i19++;
                                } else if (bVar.j) {
                                    i12 = i21;
                                }
                                z2 = true;
                                if (z2) {
                                    i19++;
                                    float f4 = constraintWidget2.n0[this.f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                    i4 = i22;
                                } else {
                                    i4 = i22 + i12;
                                }
                                if (i18 < i15 && i18 < i) {
                                    i4 += -hVar.i.f;
                                }
                            }
                            i12 = i21;
                            if (z2) {
                            }
                            if (i18 < i15) {
                                i4 += -hVar.i.f;
                            }
                        }
                        i18++;
                        z3 = z4;
                        i2 = 8;
                    }
                    z = z3;
                    if (i4 < i13 || i19 == 0) {
                        i3 = i19;
                        i5 = i20;
                        break;
                    } else {
                        i17++;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i24 = aVar.g;
                if (z) {
                    i24 = aVar2.g;
                }
                float f5 = 0.5f;
                if (i4 > i13) {
                    i24 = z ? i24 + ((int) (((i4 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i4 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f6 = i13 - i4;
                    int i25 = (int) ((f6 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f7 = f5;
                        h hVar2 = (h) arrayList.get(i26);
                        int i28 = i24;
                        ConstraintWidget constraintWidget3 = hVar2.b;
                        int i29 = i3;
                        b bVar2 = hVar2.e;
                        int i30 = i4;
                        float f8 = f6;
                        if (constraintWidget3.i0 == 8 || hVar2.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || bVar2.j) {
                            i11 = i25;
                        } else {
                            int i31 = f2 > f ? (int) (((constraintWidget3.n0[this.f] * f8) / f2) + f7) : i25;
                            if (this.f == 0) {
                                i9 = constraintWidget3.v;
                                i10 = constraintWidget3.u;
                            } else {
                                i9 = constraintWidget3.y;
                                i10 = constraintWidget3.x;
                            }
                            i11 = i25;
                            int max = Math.max(i10, hVar2.a == 1 ? Math.min(i31, bVar2.m) : i31);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i31) {
                                i27++;
                                i31 = max;
                            }
                            bVar2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f5 = f7;
                        i3 = i29;
                        i4 = i30;
                        f6 = f8;
                        i25 = i11;
                    }
                    i6 = i24;
                    f3 = f5;
                    int i32 = i3;
                    int i33 = i4;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i4 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            h hVar3 = (h) arrayList.get(i34);
                            if (hVar3.b.i0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i4 += hVar3.h.f;
                                }
                                i4 += hVar3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i4 += -hVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                        i4 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f3 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i13) {
                    this.l = i8;
                }
                if (i5 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i13 - i4) / (i5 - 1) : i5 == 1 ? (i13 - i4) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        h hVar4 = (h) arrayList.get(z ? size - (i38 + 1) : i38);
                        ConstraintWidget constraintWidget4 = hVar4.b;
                        a aVar3 = hVar4.i;
                        a aVar4 = hVar4.h;
                        if (constraintWidget4.i0 == 8) {
                            aVar4.d(i37);
                            aVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - aVar4.f : i37 + aVar4.f;
                            }
                            if (z) {
                                aVar3.d(i37);
                            } else {
                                aVar4.d(i37);
                            }
                            b bVar3 = hVar4.e;
                            int i39 = bVar3.g;
                            if (hVar4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && hVar4.a == 1) {
                                i39 = bVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                aVar4.d(i37);
                            } else {
                                aVar3.d(i37);
                            }
                            hVar4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-aVar3.f) : i37 + (-aVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        h hVar5 = (h) arrayList.get(z ? size - (i42 + 1) : i42);
                        ConstraintWidget constraintWidget5 = hVar5.b;
                        a aVar5 = hVar5.i;
                        a aVar6 = hVar5.h;
                        if (constraintWidget5.i0 == 8) {
                            aVar6.d(i41);
                            aVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - aVar6.f : i43 + aVar6.f;
                            }
                            if (z) {
                                aVar5.d(i43);
                            } else {
                                aVar6.d(i43);
                            }
                            b bVar4 = hVar5.e;
                            int i44 = bVar4.g;
                            if (hVar5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && hVar5.a == 1) {
                                i44 = Math.min(i44, bVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                aVar6.d(i41);
                            } else {
                                aVar5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-aVar5.f) : i41 + (-aVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    ConstraintWidget constraintWidget6 = this.b;
                    float f9 = i45 == 0 ? constraintWidget6.f0 : constraintWidget6.g0;
                    if (z) {
                        f9 = 1.0f - f9;
                    }
                    int i46 = (int) (((i13 - i4) * f9) + f3);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        h hVar6 = (h) arrayList.get(z ? size - (i48 + 1) : i48);
                        ConstraintWidget constraintWidget7 = hVar6.b;
                        a aVar7 = hVar6.i;
                        a aVar8 = hVar6.h;
                        if (constraintWidget7.i0 == 8) {
                            aVar8.d(i47);
                            aVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i14) {
                                i47 = z ? i47 - aVar8.f : i47 + aVar8.f;
                            }
                            if (z) {
                                aVar7.d(i47);
                            } else {
                                aVar8.d(i47);
                            }
                            b bVar5 = hVar6.e;
                            int i49 = bVar5.g;
                            if (hVar6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && hVar6.a == 1) {
                                i49 = bVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                aVar8.d(i47);
                            } else {
                                aVar7.d(i47);
                            }
                            if (i48 < i15 && i48 < i) {
                                i47 = z ? i47 - (-aVar7.f) : i47 + (-aVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((h) arrayList.get(0)).b;
        ConstraintWidget constraintWidget2 = ((h) arrayList.get(size - 1)).b;
        int i = this.f;
        a aVar = this.i;
        a aVar2 = this.h;
        if (i == 0) {
            b7e b7eVar = constraintWidget.J;
            b7e b7eVar2 = constraintWidget2.L;
            a i2 = h.i(b7eVar, 0);
            int e = b7eVar.e();
            ConstraintWidget m = m();
            if (m != null) {
                e = m.J.e();
            }
            if (i2 != null) {
                h.b(aVar2, i2, e);
            }
            a i3 = h.i(b7eVar2, 0);
            int e2 = b7eVar2.e();
            ConstraintWidget n = n();
            if (n != null) {
                e2 = n.L.e();
            }
            if (i3 != null) {
                h.b(aVar, i3, -e2);
            }
        } else {
            b7e b7eVar3 = constraintWidget.K;
            b7e b7eVar4 = constraintWidget2.M;
            a i4 = h.i(b7eVar3, 1);
            int e3 = b7eVar3.e();
            ConstraintWidget m2 = m();
            if (m2 != null) {
                e3 = m2.K.e();
            }
            if (i4 != null) {
                h.b(aVar2, i4, e3);
            }
            a i5 = h.i(b7eVar4, 1);
            int e4 = b7eVar4.e();
            ConstraintWidget n2 = n();
            if (n2 != null) {
                e4 = n2.M.e();
            }
            if (i5 != null) {
                h.b(aVar, i5, -e4);
            }
        }
        aVar2.a = this;
        aVar.a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((h) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((h) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((h) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((h) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((h) arrayList.get(i)).b;
            if (constraintWidget.i0 != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((h) arrayList.get(size)).b;
            if (constraintWidget.i0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            sb.append("<");
            sb.append(hVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
