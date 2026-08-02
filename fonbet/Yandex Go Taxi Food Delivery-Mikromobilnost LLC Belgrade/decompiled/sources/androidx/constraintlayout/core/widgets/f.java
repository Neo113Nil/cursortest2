package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.ae5;
import defpackage.b7e;
import defpackage.ijy;
import defpackage.zd5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class f extends i {
    public ConstraintWidget[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList a1 = new ArrayList();
    public ConstraintWidget[] b1 = null;
    public ConstraintWidget[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06cd  */
    @Override // androidx.constraintlayout.core.widgets.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        e eVar;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        ConstraintWidget constraintWidget;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.v0 > 0) {
            ConstraintWidget constraintWidget2 = this.V;
            ae5 ae5Var = constraintWidget2 != null ? ((d) constraintWidget2).y0 : null;
            if (ae5Var == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i18 = 0; i18 < this.v0; i18++) {
                ConstraintWidget constraintWidget3 = this.u0[i18];
                if (constraintWidget3 != null && !(constraintWidget3 instanceof g)) {
                    ConstraintWidget.DimensionBehaviour l = constraintWidget3.l(0);
                    ConstraintWidget.DimensionBehaviour l2 = constraintWidget3.l(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (l != dimensionBehaviour || constraintWidget3.r == 1 || l2 != dimensionBehaviour || constraintWidget3.s == 1) {
                        if (l == dimensionBehaviour) {
                            l = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        }
                        if (l2 == dimensionBehaviour) {
                            l2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        }
                        zd5 zd5Var = this.F0;
                        zd5Var.a = l;
                        zd5Var.b = l2;
                        zd5Var.c = constraintWidget3.s();
                        zd5Var.d = constraintWidget3.m();
                        ((androidx.constraintlayout.widget.b) ae5Var).b(constraintWidget3, zd5Var);
                        constraintWidget3.Q(zd5Var.e);
                        constraintWidget3.N(zd5Var.f);
                        constraintWidget3.K(zd5Var.g);
                    }
                }
            }
        }
        int i19 = this.A0;
        int i20 = this.B0;
        int i21 = this.w0;
        int i22 = this.x0;
        int[] iArr2 = new int[2];
        int i23 = (i2 - i19) - i20;
        int i24 = this.Z0;
        if (i24 == 1) {
            i23 = (i4 - i21) - i22;
        }
        int i25 = i23;
        int i26 = this.H0;
        if (i24 == 0) {
            if (i26 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (i26 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.u0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i5 = this.v0;
            if (i27 >= i5) {
                break;
            }
            if (this.u0[i27].i0 == 8) {
                i28++;
            }
            i27++;
        }
        if (i28 > 0) {
            constraintWidgetArr = new ConstraintWidget[i5 - i28];
            int i30 = 0;
            for (int i31 = 0; i31 < this.v0; i31++) {
                ConstraintWidget constraintWidget4 = this.u0[i31];
                if (constraintWidget4.i0 != 8) {
                    constraintWidgetArr[i30] = constraintWidget4;
                    i30++;
                }
            }
            i5 = i30;
        }
        ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        this.e1 = constraintWidgetArr2;
        this.f1 = i5;
        int i32 = this.X0;
        ArrayList arrayList = this.a1;
        if (i32 == 0) {
            i6 = i21;
            i7 = i22;
            iArr = iArr2;
            i8 = i19;
            i9 = i20;
            int i33 = this.Z0;
            if (i5 != 0) {
                if (arrayList.size() == 0) {
                    eVar = new e(this, i33, this.J, this.K, this.L, this.M, i25);
                    arrayList.add(eVar);
                } else {
                    e eVar2 = (e) arrayList.get(0);
                    eVar2.c = 0;
                    eVar2.b = null;
                    eVar2.l = 0;
                    eVar2.m = 0;
                    eVar2.n = 0;
                    eVar2.o = 0;
                    eVar2.p = 0;
                    eVar2.f(i33, this.J, this.K, this.L, this.M, this.A0, this.w0, this.B0, this.x0, i25);
                    eVar = eVar2;
                }
                for (int i34 = 0; i34 < i5; i34++) {
                    eVar.a(constraintWidgetArr2[i34]);
                }
                i29 = 0;
                iArr[0] = eVar.d();
                c = 1;
                iArr[1] = eVar.c();
                int i35 = iArr[i29] + i8 + i9;
                int i36 = iArr[c] + i6 + i7;
                if (i != 1073741824) {
                }
                if (i3 != 1073741824) {
                }
                this.D0 = i35;
                this.E0 = i36;
                Q(i35);
                N(i36);
                this.C0 = this.v0 <= 0 ? c : i29;
            }
            c = 1;
            int i352 = iArr[i29] + i8 + i9;
            int i362 = iArr[c] + i6 + i7;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            this.D0 = i352;
            this.E0 = i362;
            Q(i352);
            N(i362);
            this.C0 = this.v0 <= 0 ? c : i29;
        }
        b7e b7eVar = this.K;
        b7e b7eVar2 = this.J;
        i8 = i19;
        b7e b7eVar3 = this.L;
        b7e b7eVar4 = this.M;
        if (i32 == 1) {
            i7 = i22;
            iArr = iArr2;
            i9 = i20;
            i6 = i21;
            int i37 = this.Z0;
            if (i5 != 0) {
                arrayList.clear();
                e eVar3 = new e(this, i37, this.J, this.K, this.L, this.M, i25);
                arrayList.add(eVar3);
                if (i37 == 0) {
                    i10 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    while (i39 < i5) {
                        ConstraintWidget constraintWidget5 = constraintWidgetArr2[i39];
                        int Y = Y(constraintWidget5, i25);
                        if (constraintWidget5.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i40 = i10;
                        boolean z = (i38 == i25 || (this.T0 + i38) + Y > i25) && eVar3.b != null;
                        if (!z && i39 > 0 && (i12 = this.Y0) > 0 && i39 % i12 == 0) {
                            z = true;
                        }
                        if (z) {
                            eVar3 = new e(this, i37, this.J, this.K, this.L, this.M, i25);
                            eVar3.n = i39;
                            arrayList.add(eVar3);
                        } else if (i39 > 0) {
                            i38 = this.T0 + Y + i38;
                            eVar3.a(constraintWidget5);
                            i39++;
                            i10 = i40;
                        }
                        i38 = Y;
                        eVar3.a(constraintWidget5);
                        i39++;
                        i10 = i40;
                    }
                } else {
                    i10 = 0;
                    int i41 = 0;
                    int i42 = 0;
                    while (i42 < i5) {
                        ConstraintWidget constraintWidget6 = constraintWidgetArr2[i42];
                        int X = X(constraintWidget6, i25);
                        if (constraintWidget6.U[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i43 = i10;
                        boolean z2 = (i41 == i25 || (this.U0 + i41) + X > i25) && eVar3.b != null;
                        if (!z2 && i42 > 0 && (i11 = this.Y0) > 0 && i42 % i11 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            eVar3 = new e(this, i37, this.J, this.K, this.L, this.M, i25);
                            eVar3.n = i42;
                            arrayList.add(eVar3);
                        } else if (i42 > 0) {
                            i41 = this.U0 + X + i41;
                            eVar3.a(constraintWidget6);
                            i42++;
                            i10 = i43;
                        }
                        i41 = X;
                        eVar3.a(constraintWidget6);
                        i42++;
                        i10 = i43;
                    }
                }
                int size = arrayList.size();
                int i44 = this.A0;
                int i45 = this.w0;
                int i46 = this.B0;
                int i47 = this.x0;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.U;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z3 = dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviourArr[1] == dimensionBehaviour3;
                if (i10 > 0 && z3) {
                    for (int i48 = 0; i48 < size; i48++) {
                        e eVar4 = (e) arrayList.get(i48);
                        if (i37 == 0) {
                            eVar4.e(i25 - eVar4.d());
                        } else {
                            eVar4.e(i25 - eVar4.c());
                        }
                    }
                }
                int i49 = i44;
                int i50 = i45;
                int i51 = i46;
                int i52 = i47;
                b7e b7eVar5 = b7eVar2;
                b7e b7eVar6 = b7eVar;
                int i53 = 0;
                int i54 = 0;
                b7e b7eVar7 = b7eVar3;
                b7e b7eVar8 = b7eVar4;
                for (int i55 = 0; i55 < size; i55++) {
                    e eVar5 = (e) arrayList.get(i55);
                    if (i37 == 0) {
                        if (i55 < size - 1) {
                            b7eVar8 = ((e) arrayList.get(i55 + 1)).b.K;
                            i52 = 0;
                        } else {
                            i52 = this.x0;
                            b7eVar8 = b7eVar4;
                        }
                        b7e b7eVar9 = eVar5.b.M;
                        eVar5.f(i37, b7eVar5, b7eVar6, b7eVar7, b7eVar8, i49, i50, i51, i52, i25);
                        i53 = Math.max(i53, eVar5.d());
                        int c2 = eVar5.c() + i54;
                        if (i55 > 0) {
                            c2 += this.U0;
                        }
                        i54 = c2;
                        b7eVar6 = b7eVar9;
                        i50 = 0;
                    } else {
                        if (i55 < size - 1) {
                            b7eVar7 = ((e) arrayList.get(i55 + 1)).b.J;
                            i51 = 0;
                        } else {
                            i51 = this.B0;
                            b7eVar7 = b7eVar3;
                        }
                        b7e b7eVar10 = eVar5.b.L;
                        eVar5.f(i37, b7eVar5, b7eVar6, b7eVar7, b7eVar8, i49, i50, i51, i52, i25);
                        int d = eVar5.d() + i53;
                        int max = Math.max(i54, eVar5.c());
                        if (i55 > 0) {
                            d += this.T0;
                        }
                        i54 = max;
                        i53 = d;
                        b7eVar5 = b7eVar10;
                        i49 = 0;
                    }
                }
                iArr[0] = i53;
                iArr[1] = i54;
            }
        } else {
            if (i32 == 2) {
                i7 = i22;
                iArr = iArr2;
                i9 = i20;
                i6 = i21;
                int i56 = this.Z0;
                int i57 = this.Y0;
                if (i56 == 0) {
                    if (i57 <= 0) {
                        int i58 = 0;
                        i13 = 0;
                        for (int i59 = 0; i59 < i5; i59++) {
                            if (i59 > 0) {
                                i58 += this.T0;
                            }
                            ConstraintWidget constraintWidget7 = constraintWidgetArr2[i59];
                            if (constraintWidget7 != null) {
                                int Y2 = Y(constraintWidget7, i25) + i58;
                                if (Y2 > i25) {
                                    break;
                                }
                                i13++;
                                i58 = Y2;
                            }
                        }
                    } else {
                        i13 = i57;
                    }
                    i57 = 0;
                } else {
                    if (i57 <= 0) {
                        int i60 = 0;
                        int i61 = 0;
                        for (int i62 = 0; i62 < i5; i62++) {
                            if (i62 > 0) {
                                i60 += this.U0;
                            }
                            ConstraintWidget constraintWidget8 = constraintWidgetArr2[i62];
                            if (constraintWidget8 != null) {
                                int X2 = X(constraintWidget8, i25) + i60;
                                if (X2 > i25) {
                                    break;
                                }
                                i61++;
                                i60 = X2;
                            }
                        }
                        i57 = i61;
                    }
                    i13 = 0;
                }
                if (this.d1 == null) {
                    this.d1 = new int[2];
                }
                boolean z4 = (i57 == 0 && i56 == 1) || (i13 == 0 && i56 == 0);
                while (!z4) {
                    if (i56 == 0) {
                        i57 = (int) Math.ceil(i5 / i13);
                    } else {
                        i13 = (int) Math.ceil(i5 / i57);
                    }
                    ConstraintWidget[] constraintWidgetArr3 = this.c1;
                    if (constraintWidgetArr3 == null || constraintWidgetArr3.length < i13) {
                        obj = null;
                        this.c1 = new ConstraintWidget[i13];
                    } else {
                        obj = null;
                        Arrays.fill(constraintWidgetArr3, (Object) null);
                    }
                    ConstraintWidget[] constraintWidgetArr4 = this.b1;
                    if (constraintWidgetArr4 == null || constraintWidgetArr4.length < i57) {
                        this.b1 = new ConstraintWidget[i57];
                    } else {
                        Arrays.fill(constraintWidgetArr4, obj);
                    }
                    for (int i63 = 0; i63 < i13; i63++) {
                        for (int i64 = 0; i64 < i57; i64++) {
                            int i65 = (i64 * i13) + i63;
                            if (i56 == 1) {
                                i65 = (i63 * i57) + i64;
                            }
                            if (i65 < constraintWidgetArr2.length && (constraintWidget = constraintWidgetArr2[i65]) != null) {
                                int Y3 = Y(constraintWidget, i25);
                                ConstraintWidget constraintWidget9 = this.c1[i63];
                                if (constraintWidget9 == null || constraintWidget9.s() < Y3) {
                                    this.c1[i63] = constraintWidget;
                                }
                                int X3 = X(constraintWidget, i25);
                                ConstraintWidget constraintWidget10 = this.b1[i64];
                                if (constraintWidget10 == null || constraintWidget10.m() < X3) {
                                    this.b1[i64] = constraintWidget;
                                }
                            }
                        }
                    }
                    int i66 = 0;
                    for (int i67 = 0; i67 < i13; i67++) {
                        ConstraintWidget constraintWidget11 = this.c1[i67];
                        if (constraintWidget11 != null) {
                            if (i67 > 0) {
                                i66 += this.T0;
                            }
                            i66 = Y(constraintWidget11, i25) + i66;
                        }
                    }
                    int i68 = 0;
                    for (int i69 = 0; i69 < i57; i69++) {
                        ConstraintWidget constraintWidget12 = this.b1[i69];
                        if (constraintWidget12 != null) {
                            if (i69 > 0) {
                                i68 += this.U0;
                            }
                            i68 = X(constraintWidget12, i25) + i68;
                        }
                    }
                    iArr[0] = i66;
                    iArr[1] = i68;
                    if (i56 == 0) {
                        if (i66 > i25 && i13 > 1) {
                            i13--;
                        }
                        z4 = true;
                    } else {
                        if (i68 > i25 && i57 > 1) {
                            i57--;
                        }
                        z4 = true;
                    }
                }
                int[] iArr3 = this.d1;
                iArr3[0] = i13;
                iArr3[1] = i57;
                c = 1;
                int i3522 = iArr[i29] + i8 + i9;
                int i3622 = iArr[c] + i6 + i7;
                if (i != 1073741824) {
                    i3522 = i2;
                } else if (i == Integer.MIN_VALUE) {
                    i3522 = Math.min(i3522, i2);
                } else if (i != 0) {
                    i3522 = i29;
                }
                if (i3 != 1073741824) {
                    i3622 = i4;
                } else if (i3 == Integer.MIN_VALUE) {
                    i3622 = Math.min(i3622, i4);
                } else if (i3 != 0) {
                    i3622 = i29;
                }
                this.D0 = i3522;
                this.E0 = i3622;
                Q(i3522);
                N(i3622);
                this.C0 = this.v0 <= 0 ? c : i29;
            }
            if (i32 == 3) {
                int i70 = this.Z0;
                if (i5 != 0) {
                    arrayList.clear();
                    iArr = iArr2;
                    i6 = i21;
                    i7 = i22;
                    e eVar6 = new e(this, i70, this.J, this.K, this.L, this.M, i25);
                    arrayList.add(eVar6);
                    if (i70 == 0) {
                        int i71 = 0;
                        int i72 = 0;
                        i14 = 0;
                        int i73 = 0;
                        while (i71 < i5) {
                            i72++;
                            int i74 = i20;
                            ConstraintWidget constraintWidget13 = constraintWidgetArr2[i71];
                            int Y4 = Y(constraintWidget13, i25);
                            int i75 = i70;
                            int i76 = i71;
                            if (constraintWidget13.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i14++;
                            }
                            int i77 = i14;
                            boolean z5 = (i73 == i25 || (this.T0 + i73) + Y4 > i25) && eVar6.b != null;
                            if (!z5 && i76 > 0 && (i17 = this.Y0) > 0 && i72 > i17) {
                                z5 = true;
                            }
                            if (z5) {
                                i70 = i75;
                                i16 = i76;
                                eVar6 = new e(this, i70, this.J, this.K, this.L, this.M, i25);
                                eVar6.n = i16;
                                arrayList.add(eVar6);
                                i73 = Y4;
                                i72 = 1;
                            } else {
                                i70 = i75;
                                i16 = i76;
                                i73 = i16 > 0 ? this.T0 + Y4 + i73 : Y4;
                            }
                            eVar6.a(constraintWidget13);
                            i71 = i16 + 1;
                            i14 = i77;
                            i20 = i74;
                        }
                        i9 = i20;
                    } else {
                        i9 = i20;
                        int i78 = 0;
                        int i79 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        while (i81 < i5) {
                            i78++;
                            ConstraintWidget constraintWidget14 = constraintWidgetArr2[i81];
                            int X4 = X(constraintWidget14, i25);
                            int i82 = i70;
                            if (constraintWidget14.U[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i79++;
                            }
                            int i83 = i79;
                            boolean z6 = (i80 == i25 || (this.U0 + i80) + X4 > i25) && eVar6.b != null;
                            if (!z6 && i81 > 0 && (i15 = this.Y0) > 0 && i78 > i15) {
                                z6 = true;
                            }
                            if (z6) {
                                i70 = i82;
                                eVar6 = new e(this, i70, this.J, this.K, this.L, this.M, i25);
                                eVar6.n = i81;
                                arrayList.add(eVar6);
                                i80 = X4;
                                i78 = 1;
                            } else {
                                i70 = i82;
                                i80 = i81 > 0 ? this.U0 + X4 + i80 : X4;
                            }
                            eVar6.a(constraintWidget14);
                            i81++;
                            i79 = i83;
                        }
                        i14 = i79;
                    }
                    int size2 = arrayList.size();
                    int i84 = this.A0;
                    int i85 = this.w0;
                    int i86 = this.B0;
                    int i87 = this.x0;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr2[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    boolean z7 = dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviourArr2[1] == dimensionBehaviour5;
                    if (i14 > 0 && z7) {
                        for (int i88 = 0; i88 < size2; i88++) {
                            e eVar7 = (e) arrayList.get(i88);
                            if (i70 == 0) {
                                eVar7.e(i25 - eVar7.d());
                            } else {
                                eVar7.e(i25 - eVar7.c());
                            }
                        }
                    }
                    int i89 = i84;
                    int i90 = i85;
                    int i91 = i86;
                    int i92 = i87;
                    b7e b7eVar11 = b7eVar2;
                    b7e b7eVar12 = b7eVar;
                    int i93 = 0;
                    int i94 = 0;
                    b7e b7eVar13 = b7eVar3;
                    b7e b7eVar14 = b7eVar4;
                    for (int i95 = 0; i95 < size2; i95++) {
                        e eVar8 = (e) arrayList.get(i95);
                        if (i70 == 0) {
                            if (i95 < size2 - 1) {
                                b7eVar14 = ((e) arrayList.get(i95 + 1)).b.K;
                                i92 = 0;
                            } else {
                                i92 = this.x0;
                                b7eVar14 = b7eVar4;
                            }
                            b7e b7eVar15 = eVar8.b.M;
                            eVar8.f(i70, b7eVar11, b7eVar12, b7eVar13, b7eVar14, i89, i90, i91, i92, i25);
                            i93 = Math.max(i93, eVar8.d());
                            int c3 = eVar8.c() + i94;
                            if (i95 > 0) {
                                c3 += this.U0;
                            }
                            i94 = c3;
                            b7eVar12 = b7eVar15;
                            i90 = 0;
                        } else {
                            if (i95 < size2 - 1) {
                                b7eVar13 = ((e) arrayList.get(i95 + 1)).b.J;
                                i91 = 0;
                            } else {
                                i91 = this.B0;
                                b7eVar13 = b7eVar3;
                            }
                            b7e b7eVar16 = eVar8.b.L;
                            eVar8.f(i70, b7eVar11, b7eVar12, b7eVar13, b7eVar14, i89, i90, i91, i92, i25);
                            int d2 = eVar8.d() + i93;
                            int max2 = Math.max(i94, eVar8.c());
                            if (i95 > 0) {
                                d2 += this.T0;
                            }
                            i94 = max2;
                            i93 = d2;
                            b7eVar11 = b7eVar16;
                            i89 = 0;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i94;
                }
            }
            i7 = i22;
            iArr = iArr2;
            i9 = i20;
            i6 = i21;
        }
        c = 1;
        int i35222 = iArr[i29] + i8 + i9;
        int i36222 = iArr[c] + i6 + i7;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        this.D0 = i35222;
        this.E0 = i36222;
        Q(i35222);
        N(i36222);
        this.C0 = this.v0 <= 0 ? c : i29;
    }

    public final int X(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.U[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.z * i);
                if (i3 != constraintWidget.m()) {
                    constraintWidget.g = true;
                    W(constraintWidget, constraintWidget.U[0], constraintWidget.s(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.m();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.s() * constraintWidget2.Y) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.m();
    }

    public final int Y(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.w * i);
                if (i3 != constraintWidget.s()) {
                    constraintWidget.g = true;
                    W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.U[1], constraintWidget.m());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.s();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.m() * constraintWidget2.Y) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.s();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(ijy ijyVar, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        super.c(ijyVar, z);
        ConstraintWidget constraintWidget2 = this.V;
        boolean z2 = constraintWidget2 != null && ((d) constraintWidget2).z0;
        int i2 = this.X0;
        ArrayList arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((e) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((e) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].F();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                ConstraintWidget constraintWidget3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.c1[i];
                    if (constraintWidget4 != null) {
                        b7e b7eVar = constraintWidget4.J;
                        if (constraintWidget4.i0 != 8) {
                            if (i8 == 0) {
                                constraintWidget4.f(b7eVar, this.J, this.A0);
                                constraintWidget4.l0 = this.H0;
                                constraintWidget4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                constraintWidget4.f(constraintWidget4.L, this.L, this.B0);
                            }
                            if (i8 > 0 && constraintWidget3 != null) {
                                b7e b7eVar2 = constraintWidget3.L;
                                constraintWidget4.f(b7eVar, b7eVar2, this.T0);
                                constraintWidget3.f(b7eVar2, b7eVar, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.b1[i9];
                    if (constraintWidget5 != null) {
                        b7e b7eVar3 = constraintWidget5.K;
                        if (constraintWidget5.i0 != 8) {
                            if (i9 == 0) {
                                constraintWidget5.f(b7eVar3, this.K, this.w0);
                                constraintWidget5.m0 = this.I0;
                                constraintWidget5.g0 = this.O0;
                            }
                            if (i9 == i7 - 1) {
                                constraintWidget5.f(constraintWidget5.M, this.M, this.x0);
                            }
                            if (i9 > 0 && constraintWidget3 != null) {
                                b7e b7eVar4 = constraintWidget3.M;
                                constraintWidget5.f(b7eVar3, b7eVar4, this.U0);
                                constraintWidget3.f(b7eVar4, b7eVar3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.e1;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.i0 != 8) {
                            ConstraintWidget constraintWidget6 = this.c1[i10];
                            ConstraintWidget constraintWidget7 = this.b1[i11];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.f(constraintWidget.J, constraintWidget6.J, 0);
                                constraintWidget.f(constraintWidget.L, constraintWidget6.L, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.f(constraintWidget.K, constraintWidget7.K, 0);
                                constraintWidget.f(constraintWidget.M, constraintWidget7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((e) arrayList.get(0)).b(0, z2, true);
        }
        this.C0 = false;
    }

    @Override // defpackage.nfu, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void h(ConstraintWidget constraintWidget, HashMap hashMap) {
        super.h(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.H0 = fVar.H0;
        this.I0 = fVar.I0;
        this.J0 = fVar.J0;
        this.K0 = fVar.K0;
        this.L0 = fVar.L0;
        this.M0 = fVar.M0;
        this.N0 = fVar.N0;
        this.O0 = fVar.O0;
        this.P0 = fVar.P0;
        this.Q0 = fVar.Q0;
        this.R0 = fVar.R0;
        this.S0 = fVar.S0;
        this.T0 = fVar.T0;
        this.U0 = fVar.U0;
        this.V0 = fVar.V0;
        this.W0 = fVar.W0;
        this.X0 = fVar.X0;
        this.Y0 = fVar.Y0;
        this.Z0 = fVar.Z0;
    }
}
