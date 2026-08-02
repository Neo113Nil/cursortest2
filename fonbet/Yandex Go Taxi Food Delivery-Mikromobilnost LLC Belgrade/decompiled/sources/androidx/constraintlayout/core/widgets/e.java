package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;

/* loaded from: classes10.dex */
public final class e {
    public int a;
    public b7e d;
    public b7e e;
    public b7e f;
    public b7e g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ f r;
    public ConstraintWidget b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public e(f fVar, int i, b7e b7eVar, b7e b7eVar2, b7e b7eVar3, b7e b7eVar4, int i2) {
        this.r = fVar;
        this.a = i;
        this.d = b7eVar;
        this.e = b7eVar2;
        this.f = b7eVar3;
        this.g = b7eVar4;
        this.h = fVar.A0;
        this.i = fVar.w0;
        this.j = fVar.B0;
        this.k = fVar.x0;
        this.q = i2;
    }

    public final void a(ConstraintWidget constraintWidget) {
        int i = this.a;
        int i2 = this.q;
        f fVar = this.r;
        if (i == 0) {
            int Y = fVar.Y(constraintWidget, i2);
            if (constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.p++;
                Y = 0;
            }
            this.l = Y + (constraintWidget.i0 != 8 ? fVar.T0 : 0) + this.l;
            int X = fVar.X(constraintWidget, this.q);
            if (this.b == null || this.c < X) {
                this.b = constraintWidget;
                this.c = X;
                this.m = X;
            }
        } else {
            int Y2 = fVar.Y(constraintWidget, i2);
            int X2 = fVar.X(constraintWidget, this.q);
            if (constraintWidget.U[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.p++;
                X2 = 0;
            }
            this.m = X2 + (constraintWidget.i0 != 8 ? fVar.U0 : 0) + this.m;
            if (this.b == null || this.c < Y2) {
                this.b = constraintWidget;
                this.c = Y2;
                this.l = Y2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        f fVar;
        int i2;
        int i3;
        int i4;
        ConstraintWidget constraintWidget;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            fVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= fVar.f1) {
                break;
            }
            ConstraintWidget constraintWidget2 = fVar.e1[i8];
            if (constraintWidget2 != null) {
                constraintWidget2.F();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= fVar.f1) {
                break;
            }
            ConstraintWidget constraintWidget3 = fVar.e1[i14];
            if (constraintWidget3 != null && constraintWidget3.i0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        ConstraintWidget constraintWidget4 = this.b;
        if (i15 == 0) {
            constraintWidget4.m0 = fVar.I0;
            b7e b7eVar = constraintWidget4.M;
            b7e b7eVar2 = constraintWidget4.K;
            int i16 = this.i;
            if (i > 0) {
                i16 += fVar.U0;
            }
            b7eVar2.a(this.e, i16);
            if (z2) {
                b7eVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(b7eVar2, 0);
            }
            if (fVar.W0 == 3 && !constraintWidget4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= fVar.f1) {
                        break;
                    }
                    constraintWidget = fVar.e1[i18];
                    if (constraintWidget.E) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget4;
            int i19 = 0;
            ConstraintWidget constraintWidget5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= fVar.f1) {
                    return;
                }
                ConstraintWidget constraintWidget6 = fVar.e1[i21];
                if (constraintWidget6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    b7e b7eVar3 = constraintWidget6.K;
                    b7e b7eVar4 = constraintWidget6.M;
                    b7e b7eVar5 = constraintWidget6.J;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        constraintWidget6.f(b7eVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = fVar.H0;
                        float f3 = fVar.N0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = fVar.J0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = fVar.P0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = fVar.L0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = fVar.R0;
                        }
                        constraintWidget6.l0 = i7;
                        constraintWidget6.f0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        constraintWidget6.f(constraintWidget6.L, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (constraintWidget5 != null) {
                        b7e b7eVar6 = constraintWidget5.L;
                        b7eVar5.a(b7eVar6, fVar.T0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (b7eVar5.h()) {
                                b7eVar5.h = i23;
                            }
                        }
                        b7eVar6.a(b7eVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (b7eVar6.h()) {
                                b7eVar6.h = i24;
                            }
                        }
                    }
                    if (constraintWidget6 != constraintWidget4) {
                        int i25 = fVar.W0;
                        c = 3;
                        if (i25 == 3 && constraintWidget.E && constraintWidget6 != constraintWidget && constraintWidget6.E) {
                            constraintWidget6.N.a(constraintWidget.N, 0);
                        } else if (i25 == 0) {
                            b7eVar3.a(b7eVar2, 0);
                        } else if (i25 == 1) {
                            b7eVar4.a(b7eVar, 0);
                        } else if (z3) {
                            b7eVar3.a(this.e, this.i);
                            b7eVar4.a(this.g, this.k);
                        } else {
                            b7eVar3.a(b7eVar2, 0);
                            b7eVar4.a(b7eVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    constraintWidget5 = constraintWidget6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        constraintWidget4.l0 = fVar.H0;
        b7e b7eVar7 = constraintWidget4.J;
        b7e b7eVar8 = constraintWidget4.L;
        int i28 = this.h;
        if (i > 0) {
            i28 += fVar.T0;
        }
        if (z) {
            b7eVar8.a(this.f, i28);
            if (z2) {
                b7eVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(b7eVar8, 0);
            }
        } else {
            b7eVar7.a(this.d, i28);
            if (z2) {
                b7eVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(b7eVar7, 0);
            }
        }
        int i29 = 0;
        ConstraintWidget constraintWidget7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= fVar.f1) {
                return;
            }
            ConstraintWidget constraintWidget8 = fVar.e1[i2];
            if (constraintWidget8 == null) {
                i26 = i30;
            } else {
                b7e b7eVar9 = constraintWidget8.J;
                b7e b7eVar10 = constraintWidget8.K;
                b7e b7eVar11 = constraintWidget8.L;
                if (i29 == 0) {
                    constraintWidget8.f(b7eVar10, this.e, this.i);
                    int i31 = fVar.I0;
                    float f4 = fVar.O0;
                    if (this.n == 0) {
                        i4 = fVar.K0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = fVar.Q0;
                            i31 = i4;
                            constraintWidget8.m0 = i31;
                            constraintWidget8.g0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = fVar.M0) != i3) {
                        f4 = fVar.S0;
                        i31 = i4;
                    }
                    constraintWidget8.m0 = i31;
                    constraintWidget8.g0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    constraintWidget8.f(constraintWidget8.M, this.g, this.k);
                }
                if (constraintWidget7 != null) {
                    b7e b7eVar12 = constraintWidget7.M;
                    b7eVar10.a(b7eVar12, fVar.U0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (b7eVar10.h()) {
                            b7eVar10.h = i32;
                        }
                    }
                    b7eVar12.a(b7eVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (b7eVar12.h()) {
                            b7eVar12.h = i33;
                        }
                    }
                }
                if (constraintWidget8 != constraintWidget4) {
                    int i34 = fVar.V0;
                    if (!z) {
                        if (i34 == 0) {
                            b7eVar9.a(b7eVar7, 0);
                        } else if (i34 == 1) {
                            b7eVar11.a(b7eVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                b7eVar9.a(this.d, this.h);
                                b7eVar11.a(this.f, this.j);
                            } else {
                                b7eVar9.a(b7eVar7, 0);
                                b7eVar11.a(b7eVar8, 0);
                            }
                        }
                        constraintWidget7 = constraintWidget8;
                    } else if (i34 == 0) {
                        b7eVar11.a(b7eVar8, 0);
                    } else if (i34 == 1) {
                        b7eVar9.a(b7eVar7, 0);
                    } else if (i34 == 2) {
                        b7eVar9.a(b7eVar7, 0);
                        b7eVar11.a(b7eVar8, 0);
                    }
                }
                constraintWidget7 = constraintWidget8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.U0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.T0 : i2;
    }

    public final void e(int i) {
        f fVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            fVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= fVar.f1) {
                break;
            }
            ConstraintWidget constraintWidget = fVar.e1[i2];
            if (this.a == 0) {
                if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
                    if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.r == 0) {
                        fVar.W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i5, dimensionBehaviourArr[1], constraintWidget.m());
                    }
                }
            } else if (constraintWidget != null) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.U;
                if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.s == 0) {
                    int i7 = i5;
                    fVar.W(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.s(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= fVar.f1) {
                return;
            }
            ConstraintWidget constraintWidget2 = fVar.e1[i10];
            if (this.a == 0) {
                int s = constraintWidget2.s();
                int i11 = fVar.T0;
                if (constraintWidget2.i0 == 8) {
                    i11 = 0;
                }
                this.l = s + i11 + this.l;
                int X = fVar.X(constraintWidget2, this.q);
                if (this.b == null || this.c < X) {
                    this.b = constraintWidget2;
                    this.c = X;
                    this.m = X;
                }
            } else {
                int Y = fVar.Y(constraintWidget2, this.q);
                int X2 = fVar.X(constraintWidget2, this.q);
                int i12 = fVar.U0;
                if (constraintWidget2.i0 == 8) {
                    i12 = 0;
                }
                this.m = X2 + i12 + this.m;
                if (this.b == null || this.c < Y) {
                    this.b = constraintWidget2;
                    this.c = Y;
                    this.l = Y;
                }
            }
        }
    }

    public final void f(int i, b7e b7eVar, b7e b7eVar2, b7e b7eVar3, b7e b7eVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = b7eVar;
        this.e = b7eVar2;
        this.f = b7eVar3;
        this.g = b7eVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
