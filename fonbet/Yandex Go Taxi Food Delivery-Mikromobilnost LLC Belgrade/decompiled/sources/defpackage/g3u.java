package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class g3u {
    public static c351 a(ConstraintWidget constraintWidget, int i, ArrayList arrayList, c351 c351Var) {
        int i2;
        int i3 = i == 0 ? constraintWidget.s0 : constraintWidget.t0;
        if (i3 != -1 && (c351Var == null || i3 != c351Var.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                c351 c351Var2 = (c351) arrayList.get(i4);
                if (c351Var2.b == i3) {
                    if (c351Var != null) {
                        c351Var.d(i, c351Var2);
                        arrayList.remove(c351Var);
                    }
                    c351Var = c351Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c351Var;
        }
        if (c351Var == null) {
            if (constraintWidget instanceof nfu) {
                nfu nfuVar = (nfu) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= nfuVar.v0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = nfuVar.u0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.s0) != -1) || (i == 1 && (i2 = constraintWidget2.t0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        c351 c351Var3 = (c351) arrayList.get(i6);
                        if (c351Var3.b == i2) {
                            c351Var = c351Var3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c351Var == null) {
                c351Var = new c351();
                c351Var.a = new ArrayList();
                c351Var.d = null;
                c351Var.e = -1;
                int i7 = c351.f;
                c351.f = i7 + 1;
                c351Var.b = i7;
                c351Var.c = i;
            }
            arrayList.add(c351Var);
        }
        if (c351Var.a(constraintWidget)) {
            if (constraintWidget instanceof g) {
                g gVar = (g) constraintWidget;
                gVar.x0.c(gVar.y0 == 0 ? 1 : 0, c351Var, arrayList);
            }
            int i8 = c351Var.b;
            if (i == 0) {
                constraintWidget.s0 = i8;
                constraintWidget.J.c(i, c351Var, arrayList);
                constraintWidget.L.c(i, c351Var, arrayList);
            } else {
                constraintWidget.t0 = i8;
                constraintWidget.K.c(i, c351Var, arrayList);
                constraintWidget.N.c(i, c351Var, arrayList);
                constraintWidget.M.c(i, c351Var, arrayList);
            }
            constraintWidget.Q.c(i, c351Var, arrayList);
        }
        return c351Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x038f, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x038c A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(d dVar, ae5 ae5Var) {
        int i;
        c351 c351Var;
        c351 c351Var2;
        int c;
        int c2;
        c351 c351Var3;
        c351 c351Var4;
        boolean z;
        ArrayList arrayList = dVar.u0;
        ijy ijyVar = dVar.B0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                int i4 = 0;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (i4 < size) {
                    ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i4);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar.U;
                    int i5 = i2;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i5];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i3];
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.U;
                    int i6 = i3;
                    if (!c(dimensionBehaviour, dimensionBehaviour2, dimensionBehaviourArr2[i5], dimensionBehaviourArr2[i6])) {
                        d.X(constraintWidget, ae5Var, dVar.Q0);
                    }
                    boolean z2 = constraintWidget instanceof g;
                    if (z2) {
                        g gVar = (g) constraintWidget;
                        if (gVar.y0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(gVar);
                        }
                        z = z2;
                        if (gVar.y0 == i6) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(gVar);
                        }
                    } else {
                        z = z2;
                    }
                    if (constraintWidget instanceof nfu) {
                        if (constraintWidget instanceof a) {
                            a aVar = (a) constraintWidget;
                            if (aVar.W() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                            }
                            if (aVar.W() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(aVar);
                            }
                        } else {
                            nfu nfuVar = (nfu) constraintWidget;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(nfuVar);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(nfuVar);
                        }
                    }
                    if (constraintWidget.J.f == null && constraintWidget.L.f == null && !z && !(constraintWidget instanceof a)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(constraintWidget);
                    }
                    if (constraintWidget.K.f == null && constraintWidget.M.f == null && constraintWidget.N.f == null && !z && !(constraintWidget instanceof a)) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(constraintWidget);
                    }
                    i4++;
                    i2 = i5;
                    i3 = 1;
                }
                int i7 = i2;
                ArrayList arrayList8 = new ArrayList();
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        a((g) it.next(), i7, arrayList8, null);
                    }
                }
                int i8 = i7;
                c351 c351Var5 = null;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        nfu nfuVar2 = (nfu) it2.next();
                        c351 a = a(nfuVar2, i8, arrayList8, c351Var5);
                        nfuVar2.U(i8, a, arrayList8);
                        a.b(arrayList8);
                        c351Var5 = null;
                        i8 = 0;
                    }
                }
                HashSet hashSet = dVar.k(ConstraintAnchor$Type.LEFT).a;
                if (hashSet != null) {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        a(((b7e) it3.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet2 = dVar.k(ConstraintAnchor$Type.RIGHT).a;
                if (hashSet2 != null) {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        a(((b7e) it4.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet3 = dVar.k(ConstraintAnchor$Type.CENTER).a;
                if (hashSet3 != null) {
                    Iterator it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        a(((b7e) it5.next()).d, 0, arrayList8, null);
                    }
                }
                c351 c351Var6 = null;
                if (arrayList6 != null) {
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        a((ConstraintWidget) it6.next(), 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        a((g) it7.next(), 1, arrayList8, null);
                    }
                }
                int i9 = 1;
                if (arrayList5 != null) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        nfu nfuVar3 = (nfu) it8.next();
                        c351 a2 = a(nfuVar3, i9, arrayList8, c351Var6);
                        nfuVar3.U(i9, a2, arrayList8);
                        a2.b(arrayList8);
                        c351Var6 = null;
                        i9 = 1;
                    }
                }
                HashSet hashSet4 = dVar.k(ConstraintAnchor$Type.TOP).a;
                if (hashSet4 != null) {
                    Iterator it9 = hashSet4.iterator();
                    while (it9.hasNext()) {
                        a(((b7e) it9.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet5 = dVar.k(ConstraintAnchor$Type.BASELINE).a;
                if (hashSet5 != null) {
                    Iterator it10 = hashSet5.iterator();
                    while (it10.hasNext()) {
                        a(((b7e) it10.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet6 = dVar.k(ConstraintAnchor$Type.BOTTOM).a;
                if (hashSet6 != null) {
                    Iterator it11 = hashSet6.iterator();
                    while (it11.hasNext()) {
                        a(((b7e) it11.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet7 = dVar.k(ConstraintAnchor$Type.CENTER).a;
                if (hashSet7 != null) {
                    Iterator it12 = hashSet7.iterator();
                    while (it12.hasNext()) {
                        a(((b7e) it12.next()).d, 1, arrayList8, null);
                    }
                }
                if (arrayList7 != null) {
                    Iterator it13 = arrayList7.iterator();
                    while (it13.hasNext()) {
                        a((ConstraintWidget) it13.next(), 1, arrayList8, null);
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayList.get(i10);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidget2.U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr3[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviourArr3[1] == dimensionBehaviour4) {
                        int i11 = constraintWidget2.s0;
                        int size2 = arrayList8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                c351Var3 = null;
                                break;
                            }
                            c351Var3 = (c351) arrayList8.get(i12);
                            if (i11 == c351Var3.b) {
                                break;
                            }
                            i12++;
                        }
                        int i13 = constraintWidget2.t0;
                        int size3 = arrayList8.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                c351Var4 = null;
                                break;
                            }
                            c351Var4 = (c351) arrayList8.get(i14);
                            if (i13 == c351Var4.b) {
                                break;
                            }
                            i14++;
                        }
                        if (c351Var3 != null && c351Var4 != null) {
                            c351Var3.d(0, c351Var4);
                            c351Var4.c = 2;
                            arrayList8.remove(c351Var3);
                        }
                    }
                }
                if (arrayList8.size() > 1) {
                    if (dVar.U[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        Iterator it14 = arrayList8.iterator();
                        c351Var = null;
                        int i15 = 0;
                        while (it14.hasNext()) {
                            c351 c351Var7 = (c351) it14.next();
                            if (c351Var7.c != 1 && (c2 = c351Var7.c(ijyVar, 0)) > i15) {
                                c351Var = c351Var7;
                                i15 = c2;
                            }
                        }
                        if (c351Var != null) {
                            dVar.O(ConstraintWidget.DimensionBehaviour.FIXED);
                            dVar.Q(i15);
                            if (dVar.U[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                Iterator it15 = arrayList8.iterator();
                                c351 c351Var8 = null;
                                int i16 = 0;
                                while (it15.hasNext()) {
                                    c351 c351Var9 = (c351) it15.next();
                                    if (c351Var9.c != 0 && (c = c351Var9.c(ijyVar, 1)) > i16) {
                                        c351Var8 = c351Var9;
                                        i16 = c;
                                    }
                                }
                                if (c351Var8 != null) {
                                    dVar.P(ConstraintWidget.DimensionBehaviour.FIXED);
                                    dVar.N(i16);
                                    c351Var2 = c351Var8;
                                    if (c351Var != null || c351Var2 != null) {
                                    }
                                }
                            }
                            c351Var2 = null;
                            return c351Var != null ? true : true;
                        }
                    }
                    c351Var = null;
                    if (dVar.U[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    }
                    c351Var2 = null;
                    if (c351Var != null) {
                    }
                }
                return false;
            }
            ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayList.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = dVar.U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr4[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr4[1];
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget3.U;
            i = (c(dimensionBehaviour5, dimensionBehaviour6, dimensionBehaviourArr5[0], dimensionBehaviourArr5[1]) && !(constraintWidget3 instanceof f)) ? i + 1 : 0;
        }
    }

    public static boolean c(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
