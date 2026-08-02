package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.i63;
import defpackage.ijy;
import defpackage.o53;
import defpackage.z7t0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0295, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (r4.d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06f1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0649 A[EDGE_INSN: B:410:0x0649->B:411:0x0649 BREAK  A[LOOP:6: B:365:0x05a4->B:398:0x0644], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(d dVar, ijy ijyVar, ArrayList arrayList, int i) {
        int i2;
        c[] cVarArr;
        int i3;
        int i4;
        b7e[] b7eVarArr;
        float f;
        float f2;
        boolean z;
        boolean z2;
        ConstraintWidget constraintWidget;
        boolean z3;
        boolean z4;
        int i5;
        ArrayList arrayList2;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ijy ijyVar2;
        b7e b7eVar;
        b7e b7eVar2;
        b7e b7eVar3;
        ConstraintWidget constraintWidget5;
        z7t0 z7t0Var;
        b7e b7eVar4;
        z7t0 z7t0Var2;
        ConstraintWidget constraintWidget6;
        int i6;
        b7e[] b7eVarArr2;
        b7e b7eVar5;
        b7e b7eVar6;
        z7t0 z7t0Var3;
        z7t0 z7t0Var4;
        ConstraintWidget constraintWidget7;
        ConstraintWidget constraintWidget8;
        int i7;
        b7e b7eVar7;
        b7e[] b7eVarArr3;
        int i8;
        b7e b7eVar8;
        z7t0 z7t0Var5;
        z7t0 z7t0Var6;
        int size;
        int i9;
        ArrayList arrayList3;
        int i10;
        ConstraintWidget constraintWidget9;
        float f3;
        float f4;
        int i11;
        float f5;
        int i12;
        ConstraintWidget constraintWidget10;
        int i13;
        int i14;
        int i15;
        b7e[] b7eVarArr4;
        b7e b7eVar9;
        ConstraintWidget constraintWidget11;
        float f6;
        d dVar2 = dVar;
        ijy ijyVar3 = ijyVar;
        ArrayList arrayList4 = arrayList;
        if (i == 0) {
            i2 = dVar2.E0;
            cVarArr = dVar2.H0;
            i3 = 0;
        } else {
            i2 = dVar2.F0;
            cVarArr = dVar2.G0;
            i3 = 2;
        }
        int i16 = i2;
        c[] cVarArr2 = cVarArr;
        int i17 = 0;
        while (i17 < i16) {
            c cVar = cVarArr2[i17];
            boolean z5 = cVar.q;
            ConstraintWidget constraintWidget12 = cVar.a;
            b7e[] b7eVarArr5 = constraintWidget12.R;
            int i18 = 8;
            if (z5) {
                i4 = i17;
                b7eVarArr = b7eVarArr5;
                f = 0.0f;
            } else {
                int i19 = cVar.l;
                int i20 = i19 * 2;
                ConstraintWidget constraintWidget13 = constraintWidget12;
                ConstraintWidget constraintWidget14 = constraintWidget13;
                boolean z6 = false;
                f = 0.0f;
                while (!z6) {
                    cVar.i++;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget13.p0;
                    b7e[] b7eVarArr6 = constraintWidget13.R;
                    constraintWidgetArr[i19] = null;
                    constraintWidget13.o0[i19] = null;
                    if (constraintWidget13.i0 != i18) {
                        constraintWidget13.l(i19);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        b7eVarArr6[i20].e();
                        int i21 = i20 + 1;
                        b7eVarArr6[i21].e();
                        b7eVarArr6[i20].e();
                        b7eVarArr6[i21].e();
                        if (cVar.b == null) {
                            cVar.b = constraintWidget13;
                        }
                        cVar.d = constraintWidget13;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget13.U[i19];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            i14 = i17;
                            int i22 = constraintWidget13.t[i19];
                            i15 = i19;
                            if (i22 == 0 || i22 == 3 || i22 == 2) {
                                cVar.j++;
                                float f7 = constraintWidget13.n0[i15];
                                if (f7 > 0.0f) {
                                    f6 = f7;
                                    cVar.k += f6;
                                } else {
                                    f6 = f7;
                                }
                                b7eVarArr4 = b7eVarArr5;
                                if (constraintWidget13.i0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i22 == 0 || i22 == 3)) {
                                    if (f6 < 0.0f) {
                                        cVar.n = true;
                                    } else {
                                        cVar.o = true;
                                    }
                                    if (cVar.h == null) {
                                        cVar.h = new ArrayList();
                                    }
                                    cVar.h.add(constraintWidget13);
                                }
                                if (cVar.f == null) {
                                    cVar.f = constraintWidget13;
                                }
                                ConstraintWidget constraintWidget15 = cVar.g;
                                if (constraintWidget15 != null) {
                                    constraintWidget15.o0[i15] = constraintWidget13;
                                }
                                cVar.g = constraintWidget13;
                            } else {
                                b7eVarArr4 = b7eVarArr5;
                            }
                            if (i15 == 0) {
                                if (constraintWidget13.r == 0 && constraintWidget13.u == 0) {
                                    int i23 = constraintWidget13.v;
                                }
                            } else if (constraintWidget13.s == 0 && constraintWidget13.x == 0) {
                                int i24 = constraintWidget13.y;
                            }
                            if (constraintWidget14 != constraintWidget13) {
                                constraintWidget14.p0[i15] = constraintWidget13;
                            }
                            b7eVar9 = b7eVarArr6[i20 + 1].f;
                            if (b7eVar9 != null) {
                                constraintWidget11 = b7eVar9.d;
                                b7e b7eVar10 = constraintWidget11.R[i20].f;
                                if (b7eVar10 != null) {
                                }
                            }
                            constraintWidget11 = null;
                            if (constraintWidget11 != null) {
                                constraintWidget11 = constraintWidget13;
                                z6 = true;
                            }
                            constraintWidget14 = constraintWidget13;
                            i19 = i15;
                            b7eVarArr5 = b7eVarArr4;
                            i18 = 8;
                            constraintWidget13 = constraintWidget11;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i19;
                    b7eVarArr4 = b7eVarArr5;
                    if (constraintWidget14 != constraintWidget13) {
                    }
                    b7eVar9 = b7eVarArr6[i20 + 1].f;
                    if (b7eVar9 != null) {
                    }
                    constraintWidget11 = null;
                    if (constraintWidget11 != null) {
                    }
                    constraintWidget14 = constraintWidget13;
                    i19 = i15;
                    b7eVarArr5 = b7eVarArr4;
                    i18 = 8;
                    constraintWidget13 = constraintWidget11;
                    i17 = i14;
                }
                i4 = i17;
                int i25 = i19;
                b7eVarArr = b7eVarArr5;
                ConstraintWidget constraintWidget16 = cVar.b;
                if (constraintWidget16 != null) {
                    constraintWidget16.R[i20].e();
                }
                ConstraintWidget constraintWidget17 = cVar.d;
                if (constraintWidget17 != null) {
                    constraintWidget17.R[i20 + 1].e();
                }
                cVar.c = constraintWidget13;
                if (i25 == 0 && cVar.m) {
                    cVar.e = constraintWidget13;
                } else {
                    cVar.e = constraintWidget12;
                }
                cVar.p = cVar.o && cVar.n;
            }
            cVar.q = true;
            if (arrayList4 == null || arrayList4.contains(constraintWidget12)) {
                ConstraintWidget constraintWidget18 = cVar.c;
                ConstraintWidget constraintWidget19 = cVar.b;
                ConstraintWidget constraintWidget20 = cVar.d;
                ConstraintWidget constraintWidget21 = cVar.e;
                float f8 = cVar.k;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar2.U;
                b7e[] b7eVarArr7 = dVar2.R;
                boolean z7 = dimensionBehaviourArr[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i26 = constraintWidget21.l0;
                    boolean z8 = i26 == 0;
                    f2 = f8;
                    z = i26 == 1;
                    z2 = i26 == 2;
                    constraintWidget = constraintWidget12;
                    z3 = z7;
                    z4 = z8;
                } else {
                    f2 = f8;
                    int i27 = constraintWidget21.m0;
                    boolean z9 = i27 == 0;
                    z = i27 == 1;
                    z2 = i27 == 2;
                    constraintWidget = constraintWidget12;
                    z3 = z7;
                    z4 = z9;
                }
                boolean z10 = false;
                while (!z10) {
                    b7e[] b7eVarArr8 = constraintWidget.R;
                    b7e b7eVar11 = b7eVarArr8[i3];
                    int i28 = z2 ? 1 : 4;
                    int e = b7eVar11.e();
                    b7e[] b7eVarArr9 = b7eVarArr7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget.U[i];
                    boolean z11 = z2;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget.t[i] == 0;
                    b7e b7eVar12 = b7eVar11.f;
                    if (b7eVar12 != null && constraintWidget != constraintWidget12) {
                        e = b7eVar12.e() + e;
                    }
                    int i29 = e;
                    if (z11 && constraintWidget != constraintWidget12 && constraintWidget != constraintWidget19) {
                        i28 = 8;
                    }
                    ConstraintWidget constraintWidget22 = constraintWidget12;
                    b7e b7eVar13 = b7eVar11.f;
                    if (b7eVar13 != null) {
                        z7t0 z7t0Var7 = b7eVar11.i;
                        z7t0 z7t0Var8 = b7eVar13.i;
                        if (constraintWidget == constraintWidget19) {
                            i12 = i16;
                            ijyVar3.f(z7t0Var7, z7t0Var8, i29, 6);
                        } else {
                            i12 = i16;
                            ijyVar3.f(z7t0Var7, z7t0Var8, i29, 8);
                        }
                        if (z12 && !z11) {
                            i28 = 5;
                        }
                        ijyVar3.e(b7eVar11.i, b7eVar11.f.i, i29, (constraintWidget == constraintWidget19 && z11 && constraintWidget.T[i]) ? 5 : i28);
                    } else {
                        i12 = i16;
                    }
                    if (z3) {
                        if (constraintWidget.i0 == 8 || constraintWidget.U[i] != dimensionBehaviour4) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            ijyVar3.f(b7eVarArr8[i3 + 1].i, b7eVarArr8[i3].i, 0, 5);
                        }
                        ijyVar3.f(b7eVarArr8[i3].i, b7eVarArr9[i3].i, i13, 8);
                    }
                    b7e b7eVar14 = b7eVarArr8[i3 + 1].f;
                    if (b7eVar14 != null) {
                        constraintWidget10 = b7eVar14.d;
                        b7e b7eVar15 = constraintWidget10.R[i3].f;
                        if (b7eVar15 != null) {
                        }
                    }
                    constraintWidget10 = null;
                    if (constraintWidget10 != null) {
                        constraintWidget = constraintWidget10;
                    } else {
                        z10 = true;
                    }
                    constraintWidget12 = constraintWidget22;
                    b7eVarArr7 = b7eVarArr9;
                    z2 = z11;
                    i16 = i12;
                }
                b7e[] b7eVarArr10 = b7eVarArr7;
                boolean z13 = z2;
                i5 = i16;
                if (constraintWidget20 != null) {
                    int i30 = i3 + 1;
                    if (constraintWidget18.R[i30].f != null) {
                        b7e b7eVar16 = constraintWidget20.R[i30];
                        if (constraintWidget20.U[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget20.t[i] == 0 && !z13) {
                            b7e b7eVar17 = b7eVar16.f;
                            if (b7eVar17.d == dVar2) {
                                ijyVar3.e(b7eVar16.i, b7eVar17.i, -b7eVar16.e(), 5);
                                ijyVar3.g(b7eVar16.i, constraintWidget18.R[i30].f.i, -b7eVar16.e(), 6);
                                if (z3) {
                                    int i31 = i3 + 1;
                                    z7t0 z7t0Var9 = b7eVarArr10[i31].i;
                                    b7e b7eVar18 = constraintWidget18.R[i31];
                                    ijyVar3.f(z7t0Var9, b7eVar18.i, b7eVar18.e(), 8);
                                }
                                arrayList2 = cVar.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    if (cVar.n && !cVar.p) {
                                        f2 = cVar.j;
                                    }
                                    ConstraintWidget constraintWidget23 = null;
                                    float f9 = f;
                                    i9 = 0;
                                    while (i9 < size) {
                                        ConstraintWidget constraintWidget24 = (ConstraintWidget) arrayList2.get(i9);
                                        float[] fArr = constraintWidget24.n0;
                                        b7e[] b7eVarArr11 = constraintWidget24.R;
                                        float f10 = fArr[i];
                                        if (f10 < f) {
                                            if (cVar.p) {
                                                arrayList3 = arrayList2;
                                                ijyVar3.e(b7eVarArr11[i3 + 1].i, b7eVarArr11[i3].i, 0, 4);
                                                f5 = f9;
                                                i10 = size;
                                                f4 = f;
                                                f9 = f5;
                                                i11 = i9;
                                                i9 = i11 + 1;
                                                arrayList2 = arrayList3;
                                                size = i10;
                                                f = f4;
                                            } else {
                                                f10 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        if (f10 == f) {
                                            f5 = f9;
                                            ijyVar3.e(b7eVarArr11[i3 + 1].i, b7eVarArr11[i3].i, 0, 8);
                                            i10 = size;
                                            f4 = f;
                                            f9 = f5;
                                            i11 = i9;
                                            i9 = i11 + 1;
                                            arrayList2 = arrayList3;
                                            size = i10;
                                            f = f4;
                                        } else {
                                            float f11 = f9;
                                            if (constraintWidget23 != null) {
                                                b7e[] b7eVarArr12 = constraintWidget23.R;
                                                z7t0 z7t0Var10 = b7eVarArr12[i3].i;
                                                int i32 = i3 + 1;
                                                z7t0 z7t0Var11 = b7eVarArr12[i32].i;
                                                z7t0 z7t0Var12 = b7eVarArr11[i3].i;
                                                z7t0 z7t0Var13 = b7eVarArr11[i32].i;
                                                i10 = size;
                                                i63 l = ijyVar3.l();
                                                constraintWidget9 = constraintWidget24;
                                                float f12 = f;
                                                l.b = f12;
                                                f4 = f12;
                                                if (f2 == f12 || f11 == f10) {
                                                    i11 = i9;
                                                    f3 = f10;
                                                    l.d.g(z7t0Var10, 1.0f);
                                                    l.d.g(z7t0Var11, -1.0f);
                                                    l.d.g(z7t0Var13, 1.0f);
                                                    l.d.g(z7t0Var12, -1.0f);
                                                } else {
                                                    o53 o53Var = l.d;
                                                    if (f11 == f4) {
                                                        i11 = i9;
                                                        o53Var.g(z7t0Var10, 1.0f);
                                                        l.d.g(z7t0Var11, -1.0f);
                                                        f3 = f10;
                                                    } else {
                                                        i11 = i9;
                                                        f3 = f10;
                                                        if (f10 == f) {
                                                            o53Var.g(z7t0Var12, 1.0f);
                                                            l.d.g(z7t0Var13, -1.0f);
                                                        } else {
                                                            float f13 = (f11 / f2) / (f3 / f2);
                                                            o53Var.g(z7t0Var10, 1.0f);
                                                            l.d.g(z7t0Var11, -1.0f);
                                                            l.d.g(z7t0Var13, f13);
                                                            l.d.g(z7t0Var12, -f13);
                                                        }
                                                    }
                                                }
                                                ijyVar3.c(l);
                                            } else {
                                                i10 = size;
                                                constraintWidget9 = constraintWidget24;
                                                f3 = f10;
                                                f4 = f;
                                                i11 = i9;
                                            }
                                            constraintWidget23 = constraintWidget9;
                                            f9 = f3;
                                            i9 = i11 + 1;
                                            arrayList2 = arrayList3;
                                            size = i10;
                                            f = f4;
                                        }
                                    }
                                }
                                if (constraintWidget19 != null || (constraintWidget19 != constraintWidget20 && !z13)) {
                                    constraintWidget2 = constraintWidget20;
                                    if (!z4 && constraintWidget19 != null) {
                                        int i33 = cVar.j;
                                        boolean z14 = i33 > 0 && cVar.i == i33;
                                        ConstraintWidget constraintWidget25 = constraintWidget19;
                                        ConstraintWidget constraintWidget26 = constraintWidget25;
                                        while (true) {
                                            b7e[] b7eVarArr13 = constraintWidget26.R;
                                            if (constraintWidget25 == null) {
                                                break;
                                            }
                                            b7e[] b7eVarArr14 = constraintWidget25.R;
                                            ConstraintWidget constraintWidget27 = constraintWidget25.p0[i];
                                            while (true) {
                                                if (constraintWidget27 == null) {
                                                    i6 = 8;
                                                    break;
                                                }
                                                i6 = 8;
                                                if (constraintWidget27.i0 != 8) {
                                                    break;
                                                } else {
                                                    constraintWidget27 = constraintWidget27.p0[i];
                                                }
                                            }
                                            if (constraintWidget27 != null || constraintWidget25 == constraintWidget2) {
                                                b7e b7eVar19 = b7eVarArr14[i3];
                                                z7t0 z7t0Var14 = b7eVar19.i;
                                                b7e b7eVar20 = b7eVar19.f;
                                                z7t0 z7t0Var15 = b7eVar20 != null ? b7eVar20.i : null;
                                                if (constraintWidget26 != constraintWidget25) {
                                                    z7t0Var15 = b7eVarArr13[i3 + 1].i;
                                                } else if (constraintWidget25 == constraintWidget19) {
                                                    b7e b7eVar21 = b7eVarArr[i3].f;
                                                    z7t0Var15 = b7eVar21 != null ? b7eVar21.i : null;
                                                }
                                                int e2 = b7eVar19.e();
                                                int i34 = i3 + 1;
                                                int e3 = b7eVarArr14[i34].e();
                                                if (constraintWidget27 != null) {
                                                    b7eVar5 = constraintWidget27.R[i3];
                                                    b7eVarArr2 = b7eVarArr13;
                                                    z7t0Var4 = b7eVar5.i;
                                                } else {
                                                    b7eVarArr2 = b7eVarArr13;
                                                    b7eVar5 = constraintWidget18.R[i34].f;
                                                    if (b7eVar5 != null) {
                                                        z7t0Var4 = b7eVar5.i;
                                                    } else {
                                                        b7eVar6 = b7eVar5;
                                                        z7t0Var3 = null;
                                                        z7t0 z7t0Var16 = b7eVarArr14[i34].i;
                                                        if (b7eVar6 != null) {
                                                            e3 += b7eVar6.e();
                                                        }
                                                        int e4 = b7eVarArr2[i34].e() + e2;
                                                        if (z7t0Var14 != null || z7t0Var15 == null || z7t0Var3 == null || z7t0Var16 == null) {
                                                            constraintWidget7 = constraintWidget27;
                                                            constraintWidget8 = constraintWidget26;
                                                            i7 = 8;
                                                        } else {
                                                            if (constraintWidget25 == constraintWidget19) {
                                                                e4 = constraintWidget19.R[i3].e();
                                                            }
                                                            int i35 = e4;
                                                            if (constraintWidget25 == constraintWidget2) {
                                                                e3 = constraintWidget2.R[i34].e();
                                                            }
                                                            constraintWidget7 = constraintWidget27;
                                                            constraintWidget8 = constraintWidget26;
                                                            i7 = 8;
                                                            ijyVar.b(z7t0Var14, z7t0Var15, i35, 0.5f, z7t0Var3, z7t0Var16, e3, z14 ? 8 : 5);
                                                        }
                                                    }
                                                }
                                                b7e b7eVar22 = b7eVar5;
                                                z7t0Var3 = z7t0Var4;
                                                b7eVar6 = b7eVar22;
                                                z7t0 z7t0Var162 = b7eVarArr14[i34].i;
                                                if (b7eVar6 != null) {
                                                }
                                                int e42 = b7eVarArr2[i34].e() + e2;
                                                if (z7t0Var14 != null) {
                                                }
                                                constraintWidget7 = constraintWidget27;
                                                constraintWidget8 = constraintWidget26;
                                                i7 = 8;
                                            } else {
                                                constraintWidget7 = constraintWidget27;
                                                constraintWidget8 = constraintWidget26;
                                                i7 = i6;
                                            }
                                            if (constraintWidget25.i0 != i7) {
                                                constraintWidget8 = constraintWidget25;
                                            }
                                            constraintWidget25 = constraintWidget7;
                                            constraintWidget26 = constraintWidget8;
                                        }
                                    } else {
                                        int i36 = 8;
                                        if (z && constraintWidget19 != null) {
                                            int i37 = cVar.j;
                                            boolean z15 = i37 <= 0 && cVar.i == i37;
                                            constraintWidget3 = constraintWidget19;
                                            constraintWidget4 = constraintWidget3;
                                            while (true) {
                                                b7e[] b7eVarArr15 = constraintWidget3.R;
                                                if (constraintWidget4 != null) {
                                                    break;
                                                }
                                                b7e[] b7eVarArr16 = constraintWidget4.R;
                                                ConstraintWidget constraintWidget28 = constraintWidget4.p0[i];
                                                while (constraintWidget28 != null && constraintWidget28.i0 == i36) {
                                                    constraintWidget28 = constraintWidget28.p0[i];
                                                }
                                                if (constraintWidget4 == constraintWidget19 || constraintWidget4 == constraintWidget2 || constraintWidget28 == null) {
                                                    constraintWidget5 = constraintWidget3;
                                                } else {
                                                    if (constraintWidget28 == constraintWidget2) {
                                                        constraintWidget28 = null;
                                                    }
                                                    b7e b7eVar23 = b7eVarArr16[i3];
                                                    z7t0 z7t0Var17 = b7eVar23.i;
                                                    int i38 = i3 + 1;
                                                    z7t0 z7t0Var18 = b7eVarArr15[i38].i;
                                                    int e5 = b7eVar23.e();
                                                    int e6 = b7eVarArr16[i38].e();
                                                    if (constraintWidget28 != null) {
                                                        b7eVar4 = constraintWidget28.R[i3];
                                                        z7t0Var = b7eVar4.i;
                                                        constraintWidget5 = constraintWidget3;
                                                        b7e b7eVar24 = b7eVar4.f;
                                                        z7t0Var2 = b7eVar24 != null ? b7eVar24.i : null;
                                                    } else {
                                                        constraintWidget5 = constraintWidget3;
                                                        b7e b7eVar25 = constraintWidget2.R[i3];
                                                        z7t0Var = b7eVar25 != null ? b7eVar25.i : null;
                                                        z7t0 z7t0Var19 = b7eVarArr16[i38].i;
                                                        b7eVar4 = b7eVar25;
                                                        z7t0Var2 = z7t0Var19;
                                                    }
                                                    if (b7eVar4 != null) {
                                                        e6 += b7eVar4.e();
                                                    }
                                                    int e7 = b7eVarArr15[i38].e() + e5;
                                                    int i39 = z15 ? 8 : 4;
                                                    if (z7t0Var17 == null || z7t0Var18 == null || z7t0Var == null || z7t0Var2 == null) {
                                                        constraintWidget6 = constraintWidget28;
                                                    } else {
                                                        z7t0 z7t0Var20 = z7t0Var;
                                                        constraintWidget6 = constraintWidget28;
                                                        ijyVar.b(z7t0Var17, z7t0Var18, e7, 0.5f, z7t0Var20, z7t0Var2, e6, i39);
                                                    }
                                                    constraintWidget28 = constraintWidget6;
                                                }
                                                i36 = 8;
                                                if (constraintWidget4.i0 != 8) {
                                                    constraintWidget5 = constraintWidget4;
                                                }
                                                constraintWidget4 = constraintWidget28;
                                                constraintWidget3 = constraintWidget5;
                                            }
                                            ijyVar2 = ijyVar;
                                            b7e b7eVar26 = constraintWidget19.R[i3];
                                            b7eVar = b7eVarArr[i3].f;
                                            int i40 = i3 + 1;
                                            b7eVar2 = constraintWidget2.R[i40];
                                            b7eVar3 = constraintWidget18.R[i40].f;
                                            if (b7eVar != null) {
                                                if (constraintWidget19 != constraintWidget2) {
                                                    ijyVar2.e(b7eVar26.i, b7eVar.i, b7eVar26.e(), 5);
                                                } else if (b7eVar3 != null) {
                                                    ijyVar2.b(b7eVar26.i, b7eVar.i, b7eVar26.e(), 0.5f, b7eVar2.i, b7eVar3.i, b7eVar2.e(), 5);
                                                }
                                            }
                                            if (b7eVar3 != null && constraintWidget19 != constraintWidget2) {
                                                ijyVar2.e(b7eVar2.i, b7eVar3.i, -b7eVar2.e(), 5);
                                            }
                                            if ((!z4 || z) && constraintWidget19 != null && constraintWidget19 != constraintWidget2) {
                                                b7e[] b7eVarArr17 = constraintWidget19.R;
                                                b7eVar7 = b7eVarArr17[i3];
                                                if (constraintWidget2 == null) {
                                                    constraintWidget2 = constraintWidget19;
                                                }
                                                b7eVarArr3 = constraintWidget2.R;
                                                i8 = i3 + 1;
                                                b7eVar8 = b7eVarArr3[i8];
                                                b7e b7eVar27 = b7eVar7.f;
                                                z7t0Var5 = b7eVar27 != null ? b7eVar27.i : null;
                                                b7e b7eVar28 = b7eVar8.f;
                                                z7t0Var6 = b7eVar28 != null ? b7eVar28.i : null;
                                                if (constraintWidget18 != constraintWidget2) {
                                                    b7e b7eVar29 = constraintWidget18.R[i8].f;
                                                    z7t0Var6 = b7eVar29 != null ? b7eVar29.i : null;
                                                }
                                                if (constraintWidget19 == constraintWidget2) {
                                                    b7eVar8 = b7eVarArr17[i8];
                                                }
                                                if (z7t0Var5 == null && z7t0Var6 != null) {
                                                    ijyVar2.b(b7eVar7.i, z7t0Var5, b7eVar7.e(), 0.5f, z7t0Var6, b7eVar8.i, b7eVarArr3[i8].e(), 5);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    b7e b7eVar30 = b7eVarArr[i3];
                                    int i41 = i3 + 1;
                                    b7e b7eVar31 = constraintWidget18.R[i41];
                                    b7e b7eVar32 = b7eVar30.f;
                                    z7t0 z7t0Var21 = b7eVar32 != null ? b7eVar32.i : null;
                                    b7e b7eVar33 = b7eVar31.f;
                                    z7t0 z7t0Var22 = b7eVar33 != null ? b7eVar33.i : null;
                                    b7e b7eVar34 = constraintWidget19.R[i3];
                                    if (constraintWidget20 != null) {
                                        b7eVar31 = constraintWidget20.R[i41];
                                    }
                                    if (z7t0Var21 == null || z7t0Var22 == null) {
                                        constraintWidget2 = constraintWidget20;
                                    } else {
                                        float f14 = i == 0 ? constraintWidget21.f0 : constraintWidget21.g0;
                                        int e8 = b7eVar34.e();
                                        int e9 = b7eVar31.e();
                                        z7t0 z7t0Var23 = b7eVar34.i;
                                        z7t0 z7t0Var24 = b7eVar31.i;
                                        z7t0 z7t0Var25 = z7t0Var21;
                                        constraintWidget2 = constraintWidget20;
                                        ijyVar3.b(z7t0Var23, z7t0Var25, e8, f14, z7t0Var22, z7t0Var24, e9, 7);
                                    }
                                }
                                ijyVar2 = ijyVar;
                                if (!z4) {
                                }
                                b7e[] b7eVarArr172 = constraintWidget19.R;
                                b7eVar7 = b7eVarArr172[i3];
                                if (constraintWidget2 == null) {
                                }
                                b7eVarArr3 = constraintWidget2.R;
                                i8 = i3 + 1;
                                b7eVar8 = b7eVarArr3[i8];
                                b7e b7eVar272 = b7eVar7.f;
                                if (b7eVar272 != null) {
                                }
                                b7e b7eVar282 = b7eVar8.f;
                                if (b7eVar282 != null) {
                                }
                                if (constraintWidget18 != constraintWidget2) {
                                }
                                if (constraintWidget19 == constraintWidget2) {
                                }
                                if (z7t0Var5 == null) {
                                    ijyVar2.b(b7eVar7.i, z7t0Var5, b7eVar7.e(), 0.5f, z7t0Var6, b7eVar8.i, b7eVarArr3[i8].e(), 5);
                                }
                            }
                        }
                        if (z13) {
                            b7e b7eVar35 = b7eVar16.f;
                            if (b7eVar35.d == dVar2) {
                                ijyVar3.e(b7eVar16.i, b7eVar35.i, -b7eVar16.e(), 4);
                            }
                        }
                        ijyVar3.g(b7eVar16.i, constraintWidget18.R[i30].f.i, -b7eVar16.e(), 6);
                        if (z3) {
                        }
                        arrayList2 = cVar.h;
                        if (arrayList2 != null) {
                            if (cVar.n) {
                                f2 = cVar.j;
                            }
                            ConstraintWidget constraintWidget232 = null;
                            float f92 = f;
                            i9 = 0;
                            while (i9 < size) {
                            }
                        }
                        if (constraintWidget19 != null) {
                        }
                        constraintWidget2 = constraintWidget20;
                        if (!z4) {
                        }
                        int i362 = 8;
                        if (z) {
                            int i372 = cVar.j;
                            if (i372 <= 0) {
                            }
                            constraintWidget3 = constraintWidget19;
                            constraintWidget4 = constraintWidget3;
                            while (true) {
                                b7e[] b7eVarArr152 = constraintWidget3.R;
                                if (constraintWidget4 != null) {
                                }
                                constraintWidget4 = constraintWidget28;
                                constraintWidget3 = constraintWidget5;
                            }
                            ijyVar2 = ijyVar;
                            b7e b7eVar262 = constraintWidget19.R[i3];
                            b7eVar = b7eVarArr[i3].f;
                            int i402 = i3 + 1;
                            b7eVar2 = constraintWidget2.R[i402];
                            b7eVar3 = constraintWidget18.R[i402].f;
                            if (b7eVar != null) {
                            }
                            if (b7eVar3 != null) {
                                ijyVar2.e(b7eVar2.i, b7eVar3.i, -b7eVar2.e(), 5);
                            }
                            if (!z4) {
                            }
                            b7e[] b7eVarArr1722 = constraintWidget19.R;
                            b7eVar7 = b7eVarArr1722[i3];
                            if (constraintWidget2 == null) {
                            }
                            b7eVarArr3 = constraintWidget2.R;
                            i8 = i3 + 1;
                            b7eVar8 = b7eVarArr3[i8];
                            b7e b7eVar2722 = b7eVar7.f;
                            if (b7eVar2722 != null) {
                            }
                            b7e b7eVar2822 = b7eVar8.f;
                            if (b7eVar2822 != null) {
                            }
                            if (constraintWidget18 != constraintWidget2) {
                            }
                            if (constraintWidget19 == constraintWidget2) {
                            }
                            if (z7t0Var5 == null) {
                            }
                        }
                        ijyVar2 = ijyVar;
                        if (!z4) {
                        }
                        b7e[] b7eVarArr17222 = constraintWidget19.R;
                        b7eVar7 = b7eVarArr17222[i3];
                        if (constraintWidget2 == null) {
                        }
                        b7eVarArr3 = constraintWidget2.R;
                        i8 = i3 + 1;
                        b7eVar8 = b7eVarArr3[i8];
                        b7e b7eVar27222 = b7eVar7.f;
                        if (b7eVar27222 != null) {
                        }
                        b7e b7eVar28222 = b7eVar8.f;
                        if (b7eVar28222 != null) {
                        }
                        if (constraintWidget18 != constraintWidget2) {
                        }
                        if (constraintWidget19 == constraintWidget2) {
                        }
                        if (z7t0Var5 == null) {
                        }
                    }
                }
                if (z3) {
                }
                arrayList2 = cVar.h;
                if (arrayList2 != null) {
                }
                if (constraintWidget19 != null) {
                }
                constraintWidget2 = constraintWidget20;
                if (!z4) {
                }
                int i3622 = 8;
                if (z) {
                }
                ijyVar2 = ijyVar;
                if (!z4) {
                }
                b7e[] b7eVarArr172222 = constraintWidget19.R;
                b7eVar7 = b7eVarArr172222[i3];
                if (constraintWidget2 == null) {
                }
                b7eVarArr3 = constraintWidget2.R;
                i8 = i3 + 1;
                b7eVar8 = b7eVarArr3[i8];
                b7e b7eVar272222 = b7eVar7.f;
                if (b7eVar272222 != null) {
                }
                b7e b7eVar282222 = b7eVar8.f;
                if (b7eVar282222 != null) {
                }
                if (constraintWidget18 != constraintWidget2) {
                }
                if (constraintWidget19 == constraintWidget2) {
                }
                if (z7t0Var5 == null) {
                }
            } else {
                i5 = i16;
            }
            i17 = i4 + 1;
            dVar2 = dVar;
            ijyVar3 = ijyVar;
            arrayList4 = arrayList;
            i16 = i5;
        }
    }
}
