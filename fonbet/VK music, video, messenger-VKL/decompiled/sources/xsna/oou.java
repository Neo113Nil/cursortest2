package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.kt6;

/* compiled from: Grouping.java */
/* loaded from: classes11.dex */
public final class oou {
    public static cnx0 a(ConstraintWidget constraintWidget, int i, ArrayList<cnx0> arrayList, cnx0 cnx0Var) {
        int i2;
        int i3 = i == 0 ? constraintWidget.t0 : constraintWidget.u0;
        if (i3 != -1 && (cnx0Var == null || i3 != cnx0Var.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                cnx0 cnx0Var2 = arrayList.get(i4);
                if (cnx0Var2.b == i3) {
                    if (cnx0Var != null) {
                        cnx0Var.d(i, cnx0Var2);
                        arrayList.remove(cnx0Var);
                    }
                    cnx0Var = cnx0Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return cnx0Var;
        }
        if (cnx0Var == null) {
            if (constraintWidget instanceof e2v) {
                e2v e2vVar = (e2v) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= e2vVar.w0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = e2vVar.v0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.t0) != -1) || (i == 1 && (i2 = constraintWidget2.u0) != -1)) {
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
                        cnx0 cnx0Var3 = arrayList.get(i6);
                        if (cnx0Var3.b == i2) {
                            cnx0Var = cnx0Var3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (cnx0Var == null) {
                cnx0Var = new cnx0();
                cnx0Var.a = new ArrayList<>();
                cnx0Var.d = null;
                cnx0Var.e = -1;
                int i7 = cnx0.f;
                cnx0.f = i7 + 1;
                cnx0Var.b = i7;
                cnx0Var.c = i;
            }
            arrayList.add(cnx0Var);
        }
        int i8 = cnx0Var.b;
        if (cnx0Var.a(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.y0.c(fVar.z0 == 0 ? 1 : 0, arrayList, cnx0Var);
            }
            if (i == 0) {
                constraintWidget.t0 = i8;
                constraintWidget.K.c(i, arrayList, cnx0Var);
                constraintWidget.M.c(i, arrayList, cnx0Var);
            } else {
                constraintWidget.u0 = i8;
                constraintWidget.L.c(i, arrayList, cnx0Var);
                constraintWidget.O.c(i, arrayList, cnx0Var);
                constraintWidget.N.c(i, arrayList, cnx0Var);
            }
            constraintWidget.R.c(i, arrayList, cnx0Var);
        }
        return cnx0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0388, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0383 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0385 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(androidx.constraintlayout.core.widgets.d dVar, kt6.b bVar) {
        int i;
        cnx0 cnx0Var;
        cnx0 cnx0Var2;
        int c;
        int c2;
        cnx0 cnx0Var3;
        cnx0 cnx0Var4;
        boolean z;
        ArrayList<ConstraintWidget> arrayList = dVar.v0;
        androidx.constraintlayout.core.c cVar = dVar.B0;
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
                    ConstraintWidget constraintWidget = arrayList.get(i4);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar.V;
                    int i5 = i2;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i5];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i3];
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                    int i6 = i3;
                    if (!c(dimensionBehaviour, dimensionBehaviour2, dimensionBehaviourArr2[i5], dimensionBehaviourArr2[i6])) {
                        androidx.constraintlayout.core.widgets.d.e0(constraintWidget, bVar, dVar.Q0);
                    }
                    boolean z2 = constraintWidget instanceof androidx.constraintlayout.core.widgets.f;
                    if (z2) {
                        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                        if (fVar.z0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(fVar);
                        }
                        z = z2;
                        if (fVar.z0 == i6) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(fVar);
                        }
                    } else {
                        z = z2;
                    }
                    if (constraintWidget instanceof e2v) {
                        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
                            if (aVar.b0() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                            }
                            if (aVar.b0() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(aVar);
                            }
                        } else {
                            e2v e2vVar = (e2v) constraintWidget;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(e2vVar);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(e2vVar);
                        }
                    }
                    if (constraintWidget.K.f == null && constraintWidget.M.f == null && !z && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(constraintWidget);
                    }
                    if (constraintWidget.L.f == null && constraintWidget.N.f == null && constraintWidget.O.f == null && !z && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
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
                ArrayList<cnx0> arrayList8 = new ArrayList<>();
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        a((androidx.constraintlayout.core.widgets.f) it.next(), i7, arrayList8, null);
                    }
                }
                int i8 = i7;
                cnx0 cnx0Var5 = null;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        e2v e2vVar2 = (e2v) it2.next();
                        cnx0 a = a(e2vVar2, i8, arrayList8, cnx0Var5);
                        e2vVar2.Z(i8, arrayList8, a);
                        a.b(arrayList8);
                        cnx0Var5 = null;
                        i8 = 0;
                    }
                }
                HashSet<ConstraintAnchor> hashSet = dVar.n(ConstraintAnchor.Type.LEFT).a;
                if (hashSet != null) {
                    Iterator<ConstraintAnchor> it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        a(it3.next().d, 0, arrayList8, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet2 = dVar.n(ConstraintAnchor.Type.RIGHT).a;
                if (hashSet2 != null) {
                    Iterator<ConstraintAnchor> it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        a(it4.next().d, 0, arrayList8, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet3 = dVar.n(ConstraintAnchor.Type.CENTER).a;
                if (hashSet3 != null) {
                    Iterator<ConstraintAnchor> it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        a(it5.next().d, 0, arrayList8, null);
                    }
                }
                cnx0 cnx0Var6 = null;
                if (arrayList6 != null) {
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        a((ConstraintWidget) it6.next(), 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        a((androidx.constraintlayout.core.widgets.f) it7.next(), 1, arrayList8, null);
                    }
                }
                int i9 = 1;
                if (arrayList5 != null) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        e2v e2vVar3 = (e2v) it8.next();
                        cnx0 a2 = a(e2vVar3, i9, arrayList8, cnx0Var6);
                        e2vVar3.Z(i9, arrayList8, a2);
                        a2.b(arrayList8);
                        cnx0Var6 = null;
                        i9 = 1;
                    }
                }
                HashSet<ConstraintAnchor> hashSet4 = dVar.n(ConstraintAnchor.Type.TOP).a;
                if (hashSet4 != null) {
                    Iterator<ConstraintAnchor> it9 = hashSet4.iterator();
                    while (it9.hasNext()) {
                        a(it9.next().d, 1, arrayList8, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet5 = dVar.n(ConstraintAnchor.Type.BASELINE).a;
                if (hashSet5 != null) {
                    Iterator<ConstraintAnchor> it10 = hashSet5.iterator();
                    while (it10.hasNext()) {
                        a(it10.next().d, 1, arrayList8, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet6 = dVar.n(ConstraintAnchor.Type.BOTTOM).a;
                if (hashSet6 != null) {
                    Iterator<ConstraintAnchor> it11 = hashSet6.iterator();
                    while (it11.hasNext()) {
                        a(it11.next().d, 1, arrayList8, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet7 = dVar.n(ConstraintAnchor.Type.CENTER).a;
                if (hashSet7 != null) {
                    Iterator<ConstraintAnchor> it12 = hashSet7.iterator();
                    while (it12.hasNext()) {
                        a(it12.next().d, 1, arrayList8, null);
                    }
                }
                if (arrayList7 != null) {
                    Iterator it13 = arrayList7.iterator();
                    while (it13.hasNext()) {
                        a((ConstraintWidget) it13.next(), 1, arrayList8, null);
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    ConstraintWidget constraintWidget2 = arrayList.get(i10);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidget2.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr3[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviourArr3[1] == dimensionBehaviour4) {
                        int i11 = constraintWidget2.t0;
                        int size2 = arrayList8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                cnx0Var3 = null;
                                break;
                            }
                            cnx0Var3 = arrayList8.get(i12);
                            if (i11 == cnx0Var3.b) {
                                break;
                            }
                            i12++;
                        }
                        int i13 = constraintWidget2.u0;
                        int size3 = arrayList8.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                cnx0Var4 = null;
                                break;
                            }
                            cnx0Var4 = arrayList8.get(i14);
                            if (i13 == cnx0Var4.b) {
                                break;
                            }
                            i14++;
                        }
                        if (cnx0Var3 != null && cnx0Var4 != null) {
                            cnx0Var3.d(0, cnx0Var4);
                            cnx0Var4.c = 2;
                            arrayList8.remove(cnx0Var3);
                        }
                    }
                }
                if (arrayList8.size() > 1) {
                    if (dVar.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        Iterator<cnx0> it14 = arrayList8.iterator();
                        cnx0Var = null;
                        int i15 = 0;
                        while (it14.hasNext()) {
                            cnx0 next = it14.next();
                            if (next.c != 1 && (c2 = next.c(cVar, 0)) > i15) {
                                cnx0Var = next;
                                i15 = c2;
                            }
                        }
                        if (cnx0Var != null) {
                            dVar.S(ConstraintWidget.DimensionBehaviour.FIXED);
                            dVar.W(i15);
                            if (dVar.V[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                Iterator<cnx0> it15 = arrayList8.iterator();
                                cnx0 cnx0Var7 = null;
                                int i16 = 0;
                                while (it15.hasNext()) {
                                    cnx0 next2 = it15.next();
                                    if (next2.c != 0 && (c = next2.c(cVar, 1)) > i16) {
                                        cnx0Var7 = next2;
                                        i16 = c;
                                    }
                                }
                                if (cnx0Var7 != null) {
                                    dVar.U(ConstraintWidget.DimensionBehaviour.FIXED);
                                    dVar.R(i16);
                                    cnx0Var2 = cnx0Var7;
                                    if (cnx0Var != null || cnx0Var2 != null) {
                                    }
                                }
                            }
                            cnx0Var2 = null;
                            return cnx0Var != null ? true : true;
                        }
                    }
                    cnx0Var = null;
                    if (dVar.V[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    }
                    cnx0Var2 = null;
                    if (cnx0Var != null) {
                    }
                }
                return false;
            }
            ConstraintWidget constraintWidget3 = arrayList.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = dVar.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr4[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr4[1];
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget3.V;
            i = (c(dimensionBehaviour5, dimensionBehaviour6, dimensionBehaviourArr5[0], dimensionBehaviourArr5[1]) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.e)) ? i + 1 : 0;
        }
    }

    public static boolean c(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
