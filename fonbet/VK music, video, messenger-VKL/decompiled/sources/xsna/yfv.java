package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import xsna.pnx0;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class yfv extends pnx0 {
    public static final int[] k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[pnx0.b.values().length];
            a = iArr;
            try {
                iArr[pnx0.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[pnx0.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[pnx0.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
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
    @Override // xsna.pnx0, xsna.hzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hzl hzlVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (a.a[this.j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.K, constraintWidget.M, 0);
            return;
        }
        azm azmVar = this.e;
        boolean z = azmVar.j;
        mzl mzlVar = this.h;
        mzl mzlVar2 = this.i;
        if (!z && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.s;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.W;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.d.e.j) {
                        azmVar.d((int) ((r3.g * constraintWidget2.x) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = constraintWidget2.t;
                if (i3 == 0 || i3 == 3) {
                    fpr0 fpr0Var = constraintWidget2.e;
                    mzl mzlVar3 = fpr0Var.h;
                    mzl mzlVar4 = fpr0Var.i;
                    boolean z2 = constraintWidget2.K.f != null;
                    boolean z3 = constraintWidget2.L.f != null;
                    boolean z4 = constraintWidget2.M.f != null;
                    boolean z5 = constraintWidget2.N.f != null;
                    int i4 = constraintWidget2.a0;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = constraintWidget2.Z;
                        boolean z6 = mzlVar3.j;
                        ArrayList arrayList = mzlVar3.l;
                        int[] iArr = k;
                        if (z6 && mzlVar4.j) {
                            if (mzlVar.c && mzlVar2.c) {
                                m(iArr, ((mzl) mzlVar.l.get(0)).g + mzlVar.f, ((mzl) mzlVar2.l.get(0)).g - mzlVar2.f, mzlVar3.g + mzlVar3.f, mzlVar4.g - mzlVar4.f, f4, i4);
                                azmVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (mzlVar.j && mzlVar2.j) {
                            if (!mzlVar3.c || !mzlVar4.c) {
                                return;
                            }
                            m(iArr, mzlVar.g + mzlVar.f, mzlVar2.g - mzlVar2.f, ((mzl) arrayList.get(0)).g + mzlVar3.f, ((mzl) mzlVar4.l.get(0)).g - mzlVar4.f, f4, i4);
                            azmVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!mzlVar.c || !mzlVar2.c || !mzlVar3.c || !mzlVar4.c) {
                            return;
                        }
                        m(iArr, ((mzl) mzlVar.l.get(0)).g + mzlVar.f, ((mzl) mzlVar2.l.get(0)).g - mzlVar2.f, ((mzl) arrayList.get(0)).g + mzlVar3.f, ((mzl) mzlVar4.l.get(0)).g - mzlVar4.f, f4, i4);
                        azmVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!mzlVar.c || !mzlVar2.c) {
                            return;
                        }
                        float f5 = constraintWidget2.Z;
                        int i5 = ((mzl) mzlVar.l.get(0)).g + mzlVar.f;
                        int i6 = ((mzl) mzlVar2.l.get(0)).g - mzlVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f5) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f5) + 0.5f);
                            }
                            azmVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f5) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f5) + 0.5f);
                            }
                            azmVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z3 && z5) {
                        if (!mzlVar3.c || !mzlVar4.c) {
                            return;
                        }
                        float f6 = constraintWidget2.Z;
                        int i9 = ((mzl) mzlVar3.l.get(0)).g + mzlVar3.f;
                        int i10 = ((mzl) mzlVar4.l.get(0)).g - mzlVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f6) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f6) + 0.5f);
                                }
                                azmVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f6) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f6) + 0.5f);
                        }
                        azmVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = constraintWidget2.a0;
                    if (i13 == -1) {
                        f = constraintWidget2.e.e.g;
                        f2 = constraintWidget2.Z;
                    } else if (i13 == 0) {
                        f3 = constraintWidget2.e.e.g / constraintWidget2.Z;
                        i = (int) (f3 + 0.5f);
                        azmVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        azmVar.d(i);
                    } else {
                        f = constraintWidget2.e.e.g;
                        f2 = constraintWidget2.Z;
                    }
                    f3 = f * f2;
                    i = (int) (f3 + 0.5f);
                    azmVar.d(i);
                }
            }
        }
        if (mzlVar.c && mzlVar2.c) {
            if (mzlVar.j && mzlVar2.j && azmVar.j) {
                return;
            }
            if (!azmVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget4 = this.b;
                if (constraintWidget4.s == 0 && !constraintWidget4.C()) {
                    mzl mzlVar5 = (mzl) mzlVar.l.get(0);
                    mzl mzlVar6 = (mzl) mzlVar2.l.get(0);
                    int i14 = mzlVar5.g + mzlVar.f;
                    int i15 = mzlVar6.g + mzlVar2.f;
                    mzlVar.d(i14);
                    mzlVar2.d(i15);
                    azmVar.d(i15 - i14);
                    return;
                }
            }
            if (!azmVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && mzlVar.l.size() > 0 && mzlVar2.l.size() > 0) {
                int min = Math.min((((mzl) mzlVar2.l.get(0)).g + mzlVar2.f) - (((mzl) mzlVar.l.get(0)).g + mzlVar.f), azmVar.m);
                ConstraintWidget constraintWidget5 = this.b;
                int i16 = constraintWidget5.w;
                int max = Math.max(constraintWidget5.v, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                azmVar.d(max);
            }
            if (azmVar.j) {
                mzl mzlVar7 = (mzl) mzlVar.l.get(0);
                mzl mzlVar8 = (mzl) mzlVar2.l.get(0);
                int i17 = mzlVar7.g;
                int i18 = mzlVar.f + i17;
                int i19 = mzlVar8.g;
                int i20 = mzlVar2.f + i19;
                float f7 = this.b.g0;
                if (mzlVar7 == mzlVar8) {
                    f7 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                mzlVar.d((int) ((((i19 - i17) - azmVar.g) * f7) + i17 + 0.5f));
                mzlVar2.d(mzlVar.g + azmVar.g);
            }
        }
    }

    @Override // xsna.pnx0
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        azm azmVar = this.e;
        if (z) {
            azmVar.d(constraintWidget5.v());
        }
        boolean z2 = azmVar.j;
        mzl mzlVar = this.i;
        mzl mzlVar2 = this.h;
        if (z2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget2 = (constraintWidget = this.b).W) != null && ((dimensionBehaviour = constraintWidget2.V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == dimensionBehaviour4)) {
                pnx0.b(mzlVar2, constraintWidget2.d.h, constraintWidget.K.e());
                pnx0.b(mzlVar, constraintWidget2.d.i, -this.b.M.e());
                return;
            }
        } else {
            ConstraintWidget constraintWidget6 = this.b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidget6.V[0];
            this.d = dimensionBehaviour5;
            if (dimensionBehaviour5 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour5 == dimensionBehaviour6 && (constraintWidget4 = constraintWidget6.W) != null && ((dimensionBehaviour2 = constraintWidget4.V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == dimensionBehaviour6)) {
                    int v = (constraintWidget4.v() - this.b.K.e()) - this.b.M.e();
                    pnx0.b(mzlVar2, constraintWidget4.d.h, this.b.K.e());
                    pnx0.b(mzlVar, constraintWidget4.d.i, -this.b.M.e());
                    azmVar.d(v);
                    return;
                }
                if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    azmVar.d(constraintWidget6.v());
                }
            }
        }
        if (azmVar.j) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f != null) {
                    if (constraintWidget7.C()) {
                        mzlVar2.f = this.b.S[0].e();
                        mzlVar.f = -this.b.S[1].e();
                        return;
                    }
                    mzl h = pnx0.h(this.b.S[0]);
                    if (h != null) {
                        pnx0.b(mzlVar2, h, this.b.S[0].e());
                    }
                    mzl h2 = pnx0.h(this.b.S[1]);
                    if (h2 != null) {
                        pnx0.b(mzlVar, h2, -this.b.S[1].e());
                    }
                    mzlVar2.b = true;
                    mzlVar.b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    mzl h3 = pnx0.h(constraintAnchor);
                    if (h3 != null) {
                        pnx0.b(mzlVar2, h3, this.b.S[0].e());
                        pnx0.b(mzlVar, mzlVar2, azmVar.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f != null) {
                    mzl h4 = pnx0.h(constraintAnchor3);
                    if (h4 != null) {
                        pnx0.b(mzlVar, h4, -this.b.S[1].e());
                        pnx0.b(mzlVar2, mzlVar, -azmVar.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof a2v) || constraintWidget7.W == null || constraintWidget7.n(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.b;
                pnx0.b(mzlVar2, constraintWidget8.W.d.h, constraintWidget8.w());
                pnx0.b(mzlVar, mzlVar2, azmVar.g);
                return;
            }
        }
        if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget9 = this.b;
            int i = constraintWidget9.s;
            if (i == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.W;
                if (constraintWidget10 != null) {
                    azm azmVar2 = constraintWidget10.e.e;
                    azmVar.l.add(azmVar2);
                    azmVar2.k.add(azmVar);
                    azmVar.b = true;
                    azmVar.k.add(mzlVar2);
                    azmVar.k.add(mzlVar);
                }
            } else if (i == 3) {
                if (constraintWidget9.t == 3) {
                    mzlVar2.a = this;
                    mzlVar.a = this;
                    fpr0 fpr0Var = constraintWidget9.e;
                    fpr0Var.h.a = this;
                    fpr0Var.i.a = this;
                    azmVar.a = this;
                    if (constraintWidget9.D()) {
                        azmVar.l.add(this.b.e.e);
                        this.b.e.e.k.add(azmVar);
                        fpr0 fpr0Var2 = this.b.e;
                        fpr0Var2.e.a = this;
                        azmVar.l.add(fpr0Var2.h);
                        azmVar.l.add(this.b.e.i);
                        this.b.e.h.k.add(azmVar);
                        this.b.e.i.k.add(azmVar);
                    } else if (this.b.C()) {
                        this.b.e.e.l.add(azmVar);
                        azmVar.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(azmVar);
                    }
                } else {
                    azm azmVar3 = constraintWidget9.e.e;
                    azmVar.l.add(azmVar3);
                    azmVar3.k.add(azmVar);
                    this.b.e.h.k.add(azmVar);
                    this.b.e.i.k.add(azmVar);
                    azmVar.b = true;
                    azmVar.k.add(mzlVar2);
                    azmVar.k.add(mzlVar);
                    mzlVar2.l.add(azmVar);
                    mzlVar.l.add(azmVar);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f != null) {
            if (constraintWidget11.C()) {
                mzlVar2.f = this.b.S[0].e();
                mzlVar.f = -this.b.S[1].e();
                return;
            }
            mzl h5 = pnx0.h(this.b.S[0]);
            mzl h6 = pnx0.h(this.b.S[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = pnx0.b.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            mzl h7 = pnx0.h(constraintAnchor4);
            if (h7 != null) {
                pnx0.b(mzlVar2, h7, this.b.S[0].e());
                c(mzlVar, mzlVar2, 1, azmVar);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f != null) {
            mzl h8 = pnx0.h(constraintAnchor6);
            if (h8 != null) {
                pnx0.b(mzlVar, h8, -this.b.S[1].e());
                c(mzlVar2, mzlVar, -1, azmVar);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof a2v) || (constraintWidget3 = constraintWidget11.W) == null) {
            return;
        }
        pnx0.b(mzlVar2, constraintWidget3.d.h, constraintWidget11.w());
        c(mzlVar, mzlVar2, 1, azmVar);
    }

    @Override // xsna.pnx0
    public final void e() {
        mzl mzlVar = this.h;
        if (mzlVar.j) {
            this.b.b0 = mzlVar.g;
        }
    }

    @Override // xsna.pnx0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // xsna.pnx0
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        mzl mzlVar = this.h;
        mzlVar.c();
        mzlVar.j = false;
        mzl mzlVar2 = this.i;
        mzlVar2.c();
        mzlVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.l0;
    }
}
