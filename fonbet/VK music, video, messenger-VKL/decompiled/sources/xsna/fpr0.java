package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import xsna.pnx0;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class fpr0 extends pnx0 {
    public mzl k;
    public dt6 l;

    /* compiled from: VerticalWidgetRun.java */
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

    @Override // xsna.pnx0, xsna.hzl
    public final void a(hzl hzlVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (a.a[this.j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.L, constraintWidget.N, 1);
            return;
        }
        azm azmVar = this.e;
        if (azmVar.c && !azmVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.t;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.W;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.e.e.j) {
                        azmVar.d((int) ((r1.g * constraintWidget2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                azm azmVar2 = constraintWidget2.d.e;
                if (azmVar2.j) {
                    int i3 = constraintWidget2.a0;
                    if (i3 == -1) {
                        f = azmVar2.g;
                        f2 = constraintWidget2.Z;
                    } else if (i3 == 0) {
                        f3 = azmVar2.g * constraintWidget2.Z;
                        i = (int) (f3 + 0.5f);
                        azmVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        azmVar.d(i);
                    } else {
                        f = azmVar2.g;
                        f2 = constraintWidget2.Z;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    azmVar.d(i);
                }
            }
        }
        mzl mzlVar = this.h;
        if (mzlVar.c) {
            mzl mzlVar2 = this.i;
            if (mzlVar2.c) {
                if (mzlVar.j && mzlVar2.j && azmVar.j) {
                    return;
                }
                if (!azmVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.s == 0 && !constraintWidget4.D()) {
                        mzl mzlVar3 = (mzl) mzlVar.l.get(0);
                        mzl mzlVar4 = (mzl) mzlVar2.l.get(0);
                        int i4 = mzlVar3.g + mzlVar.f;
                        int i5 = mzlVar4.g + mzlVar2.f;
                        mzlVar.d(i4);
                        mzlVar2.d(i5);
                        azmVar.d(i5 - i4);
                        return;
                    }
                }
                if (!azmVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && mzlVar.l.size() > 0 && mzlVar2.l.size() > 0) {
                    mzl mzlVar5 = (mzl) mzlVar.l.get(0);
                    int i6 = (((mzl) mzlVar2.l.get(0)).g + mzlVar2.f) - (mzlVar5.g + mzlVar.f);
                    int i7 = azmVar.m;
                    if (i6 < i7) {
                        azmVar.d(i6);
                    } else {
                        azmVar.d(i7);
                    }
                }
                if (azmVar.j && mzlVar.l.size() > 0 && mzlVar2.l.size() > 0) {
                    mzl mzlVar6 = (mzl) mzlVar.l.get(0);
                    mzl mzlVar7 = (mzl) mzlVar2.l.get(0);
                    int i8 = mzlVar6.g;
                    int i9 = mzlVar.f + i8;
                    int i10 = mzlVar7.g;
                    int i11 = mzlVar2.f + i10;
                    float f4 = this.b.h0;
                    if (mzlVar6 == mzlVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    mzlVar.d((int) ((((i10 - i8) - azmVar.g) * f4) + i8 + 0.5f));
                    mzlVar2.d(mzlVar.g + azmVar.g);
                }
            }
        }
    }

    @Override // xsna.pnx0
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        mzl mzlVar = this.k;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        azm azmVar = this.e;
        if (z) {
            azmVar.d(constraintWidget5.p());
        }
        boolean z2 = azmVar.j;
        mzl mzlVar2 = this.i;
        mzl mzlVar3 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            this.d = constraintWidget6.V[1];
            if (constraintWidget6.F) {
                this.l = new dt6(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.b.W) != null && constraintWidget4.V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int p = (constraintWidget4.p() - this.b.L.e()) - this.b.N.e();
                    pnx0.b(mzlVar3, constraintWidget4.e.h, this.b.L.e());
                    pnx0.b(mzlVar2, constraintWidget4.e.i, -this.b.N.e());
                    azmVar.d(p);
                    return;
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    azmVar.d(this.b.p());
                }
            }
        } else if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.b).W) != null && constraintWidget2.V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            pnx0.b(mzlVar3, constraintWidget2.e.h, constraintWidget.L.e());
            pnx0.b(mzlVar2, constraintWidget2.e.i, -this.b.N.e());
            return;
        }
        boolean z3 = azmVar.j;
        if (z3) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget7.D()) {
                        mzlVar3.f = this.b.S[2].e();
                        mzlVar2.f = -this.b.S[3].e();
                    } else {
                        mzl h = pnx0.h(this.b.S[2]);
                        if (h != null) {
                            pnx0.b(mzlVar3, h, this.b.S[2].e());
                        }
                        mzl h2 = pnx0.h(this.b.S[3]);
                        if (h2 != null) {
                            pnx0.b(mzlVar2, h2, -this.b.S[3].e());
                        }
                        mzlVar3.b = true;
                        mzlVar2.b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.b;
                    if (constraintWidget8.F) {
                        pnx0.b(mzlVar, mzlVar3, constraintWidget8.d0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    mzl h3 = pnx0.h(constraintAnchor);
                    if (h3 != null) {
                        pnx0.b(mzlVar3, h3, this.b.S[2].e());
                        pnx0.b(mzlVar2, mzlVar3, azmVar.g);
                        ConstraintWidget constraintWidget9 = this.b;
                        if (constraintWidget9.F) {
                            pnx0.b(mzlVar, mzlVar3, constraintWidget9.d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f != null) {
                    mzl h4 = pnx0.h(constraintAnchor3);
                    if (h4 != null) {
                        pnx0.b(mzlVar2, h4, -this.b.S[3].e());
                        pnx0.b(mzlVar3, mzlVar2, -azmVar.g);
                    }
                    ConstraintWidget constraintWidget10 = this.b;
                    if (constraintWidget10.F) {
                        pnx0.b(mzlVar, mzlVar3, constraintWidget10.d0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f != null) {
                    mzl h5 = pnx0.h(constraintAnchor4);
                    if (h5 != null) {
                        pnx0.b(mzlVar, h5, 0);
                        pnx0.b(mzlVar3, mzlVar, -this.b.d0);
                        pnx0.b(mzlVar2, mzlVar3, azmVar.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof a2v) || constraintWidget7.W == null || constraintWidget7.n(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.b;
                pnx0.b(mzlVar3, constraintWidget11.W.e.h, constraintWidget11.x());
                pnx0.b(mzlVar2, mzlVar3, azmVar.g);
                ConstraintWidget constraintWidget12 = this.b;
                if (constraintWidget12.F) {
                    pnx0.b(mzlVar, mzlVar3, constraintWidget12.d0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            azmVar.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.b;
            int i = constraintWidget13.t;
            if (i == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.W;
                if (constraintWidget14 != null) {
                    azm azmVar2 = constraintWidget14.e.e;
                    azmVar.l.add(azmVar2);
                    azmVar2.k.add(azmVar);
                    azmVar.b = true;
                    azmVar.k.add(mzlVar3);
                    azmVar.k.add(mzlVar2);
                }
            } else if (i == 3 && !constraintWidget13.D()) {
                ConstraintWidget constraintWidget15 = this.b;
                if (constraintWidget15.s != 3) {
                    azm azmVar3 = constraintWidget15.d.e;
                    azmVar.l.add(azmVar3);
                    azmVar3.k.add(azmVar);
                    azmVar.b = true;
                    azmVar.k.add(mzlVar3);
                    azmVar.k.add(mzlVar2);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget16.D()) {
                mzlVar3.f = this.b.S[2].e();
                mzlVar2.f = -this.b.S[3].e();
            } else {
                mzl h6 = pnx0.h(this.b.S[2]);
                mzl h7 = pnx0.h(this.b.S[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = pnx0.b.CENTER;
            }
            if (this.b.F) {
                c(mzlVar, mzlVar3, 1, this.l);
            }
        } else if (constraintAnchor6 != null) {
            mzl h8 = pnx0.h(constraintAnchor5);
            if (h8 != null) {
                pnx0.b(mzlVar3, h8, this.b.S[2].e());
                c(mzlVar2, mzlVar3, 1, azmVar);
                if (this.b.F) {
                    c(mzlVar, mzlVar3, 1, this.l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.b;
                    if (constraintWidget17.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        yfv yfvVar = constraintWidget17.d;
                        if (yfvVar.d == dimensionBehaviour3) {
                            yfvVar.e.k.add(azmVar);
                            azmVar.l.add(this.b.d.e);
                            azmVar.a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f != null) {
                mzl h9 = pnx0.h(constraintAnchor7);
                if (h9 != null) {
                    pnx0.b(mzlVar2, h9, -this.b.S[3].e());
                    c(mzlVar3, mzlVar2, -1, azmVar);
                    if (this.b.F) {
                        c(mzlVar, mzlVar3, 1, this.l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f != null) {
                    mzl h10 = pnx0.h(constraintAnchor8);
                    if (h10 != null) {
                        pnx0.b(mzlVar, h10, 0);
                        c(mzlVar3, mzlVar, -1, this.l);
                        c(mzlVar2, mzlVar3, 1, azmVar);
                    }
                } else if (!(constraintWidget16 instanceof a2v) && (constraintWidget3 = constraintWidget16.W) != null) {
                    pnx0.b(mzlVar3, constraintWidget3.e.h, constraintWidget16.x());
                    c(mzlVar2, mzlVar3, 1, azmVar);
                    if (this.b.F) {
                        c(mzlVar, mzlVar3, 1, this.l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        ConstraintWidget constraintWidget18 = this.b;
                        if (constraintWidget18.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            yfv yfvVar2 = constraintWidget18.d;
                            if (yfvVar2.d == dimensionBehaviour5) {
                                yfvVar2.e.k.add(azmVar);
                                azmVar.l.add(this.b.d.e);
                                azmVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (azmVar.l.size() == 0) {
            azmVar.c = true;
        }
    }

    @Override // xsna.pnx0
    public final void e() {
        mzl mzlVar = this.h;
        if (mzlVar.j) {
            this.b.c0 = mzlVar.g;
        }
    }

    @Override // xsna.pnx0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // xsna.pnx0
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        mzl mzlVar = this.h;
        mzlVar.c();
        mzlVar.j = false;
        mzl mzlVar2 = this.i;
        mzlVar2.c();
        mzlVar2.j = false;
        mzl mzlVar3 = this.k;
        mzlVar3.c();
        mzlVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.l0;
    }
}
