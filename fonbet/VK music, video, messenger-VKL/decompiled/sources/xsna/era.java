package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes11.dex */
public final class era extends pnx0 {
    public final ArrayList<pnx0> k;
    public int l;

    public era(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        ArrayList<pnx0> arrayList = new ArrayList<>();
        this.k = arrayList;
        this.f = i;
        ConstraintWidget constraintWidget3 = this.b;
        ConstraintWidget r = constraintWidget3.r(i);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = r;
            if (constraintWidget3 == null) {
                break;
            } else {
                r = constraintWidget3.r(this.f);
            }
        }
        this.b = constraintWidget2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? constraintWidget2.d : i2 == 1 ? constraintWidget2.e : null);
        ConstraintWidget q = constraintWidget2.q(this.f);
        while (q != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? q.d : i3 == 1 ? q.e : null);
            q = q.q(this.f);
        }
        Iterator<pnx0> it = arrayList.iterator();
        while (it.hasNext()) {
            pnx0 next = it.next();
            int i4 = this.f;
            if (i4 == 0) {
                next.b.b = this;
            } else if (i4 == 1) {
                next.b.c = this;
            }
        }
        if (this.f == 0 && ((androidx.constraintlayout.core.widgets.d) this.b.W).A0 && arrayList.size() > 1) {
            this.b = ((pnx0) xy9.b(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.m0 : this.b.n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x039d, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    @Override // xsna.pnx0, xsna.hzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hzl hzlVar) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f3;
        boolean z2;
        int i11;
        mzl mzlVar = this.h;
        if (mzlVar.j) {
            mzl mzlVar2 = this.i;
            if (mzlVar2.j) {
                ConstraintWidget constraintWidget = this.b.W;
                boolean z3 = constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? ((androidx.constraintlayout.core.widgets.d) constraintWidget).A0 : false;
                int i12 = mzlVar2.g - mzlVar.g;
                ArrayList<pnx0> arrayList = this.k;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (arrayList.get(i13).b.j0 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                int i15 = i14;
                while (true) {
                    if (i15 < 0) {
                        break;
                    }
                    if (arrayList.get(i15).b.j0 != 8) {
                        i = i15;
                        break;
                    }
                    i15--;
                }
                int i16 = 0;
                while (i16 < 2) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    i4 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (i17 < size) {
                        pnx0 pnx0Var = arrayList.get(i17);
                        ConstraintWidget constraintWidget2 = pnx0Var.b;
                        boolean z4 = z3;
                        if (constraintWidget2.j0 != i2) {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i4 += pnx0Var.h.f;
                            }
                            azm azmVar = pnx0Var.e;
                            int i20 = azmVar.g;
                            int i21 = i4;
                            boolean z5 = pnx0Var.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z5) {
                                int i22 = this.f;
                                if (i22 == 0 && !constraintWidget2.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !constraintWidget2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (pnx0Var.a == 1 && i16 == 0) {
                                    i11 = azmVar.m;
                                    i18++;
                                } else if (azmVar.j) {
                                    i11 = i20;
                                }
                                z2 = true;
                                if (z2) {
                                    i18++;
                                    float f5 = constraintWidget2.o0[this.f];
                                    if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f4 += f5;
                                    }
                                    i4 = i21;
                                } else {
                                    i4 = i21 + i11;
                                }
                                if (i17 < i14 && i17 < i) {
                                    i4 += -pnx0Var.i.f;
                                }
                            }
                            i11 = i20;
                            if (z2) {
                            }
                            if (i17 < i14) {
                                i4 += -pnx0Var.i.f;
                            }
                        }
                        i17++;
                        z3 = z4;
                        i2 = 8;
                    }
                    z = z3;
                    if (i4 < i12 || i18 == 0) {
                        i3 = i18;
                        i5 = i19;
                        f2 = f4;
                        break;
                    } else {
                        i16++;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i23 = mzlVar.g;
                if (z) {
                    i23 = mzlVar2.g;
                }
                if (i4 > i12) {
                    i23 = z ? i23 + ((int) (((i4 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i4 - i12) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f6 = i12 - i4;
                    int i24 = (int) ((f6 / i3) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        pnx0 pnx0Var2 = arrayList.get(i25);
                        int i27 = i23;
                        ConstraintWidget constraintWidget3 = pnx0Var2.b;
                        int i28 = i3;
                        azm azmVar2 = pnx0Var2.e;
                        int i29 = i4;
                        int i30 = i24;
                        if (constraintWidget3.j0 == 8 || pnx0Var2.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || azmVar2.j) {
                            f3 = f2;
                        } else {
                            int a = f2 > f ? (int) uq.a(constraintWidget3.o0[this.f], f6, f2, 0.5f) : i30;
                            if (this.f == 0) {
                                i9 = constraintWidget3.w;
                                i10 = constraintWidget3.v;
                            } else {
                                i9 = constraintWidget3.z;
                                i10 = constraintWidget3.y;
                            }
                            f3 = f2;
                            int max = Math.max(i10, pnx0Var2.a == 1 ? Math.min(a, azmVar2.m) : a);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != a) {
                                i26++;
                                a = max;
                            }
                            azmVar2.d(a);
                        }
                        i25++;
                        i23 = i27;
                        i3 = i28;
                        i4 = i29;
                        i24 = i30;
                        f2 = f3;
                    }
                    i6 = i23;
                    int i31 = i3;
                    int i32 = i4;
                    if (i26 > 0) {
                        i3 = i31 - i26;
                        i4 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            pnx0 pnx0Var3 = arrayList.get(i33);
                            if (pnx0Var3.b.j0 != 8) {
                                if (i33 > 0 && i33 >= i13) {
                                    i4 += pnx0Var3.h.f;
                                }
                                i4 += pnx0Var3.e.g;
                                if (i33 < i14 && i33 < i) {
                                    i4 += -pnx0Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i31;
                        i4 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i26 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i23;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i12) {
                    this.l = i8;
                }
                if (i5 > 0 && i3 == 0 && i13 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i5 > 1 ? (i12 - i4) / (i5 - 1) : i5 == 1 ? (i12 - i4) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        pnx0 pnx0Var4 = arrayList.get(z ? size - (i37 + 1) : i37);
                        ConstraintWidget constraintWidget4 = pnx0Var4.b;
                        mzl mzlVar3 = pnx0Var4.i;
                        mzl mzlVar4 = pnx0Var4.h;
                        if (constraintWidget4.j0 == 8) {
                            mzlVar4.d(i36);
                            mzlVar3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i13) {
                                i36 = z ? i36 - mzlVar4.f : i36 + mzlVar4.f;
                            }
                            if (z) {
                                mzlVar3.d(i36);
                            } else {
                                mzlVar4.d(i36);
                            }
                            azm azmVar3 = pnx0Var4.e;
                            int i38 = azmVar3.g;
                            if (pnx0Var4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && pnx0Var4.a == 1) {
                                i38 = azmVar3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                mzlVar4.d(i36);
                            } else {
                                mzlVar3.d(i36);
                            }
                            pnx0Var4.g = true;
                            if (i37 < i14 && i37 < i) {
                                i36 = z ? i36 - (-mzlVar3.f) : i36 + (-mzlVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i12 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        pnx0 pnx0Var5 = arrayList.get(z ? size - (i41 + 1) : i41);
                        ConstraintWidget constraintWidget5 = pnx0Var5.b;
                        mzl mzlVar5 = pnx0Var5.i;
                        mzl mzlVar6 = pnx0Var5.h;
                        if (constraintWidget5.j0 == 8) {
                            mzlVar6.d(i40);
                            mzlVar5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i13) {
                                i42 = z ? i42 - mzlVar6.f : i42 + mzlVar6.f;
                            }
                            if (z) {
                                mzlVar5.d(i42);
                            } else {
                                mzlVar6.d(i42);
                            }
                            azm azmVar4 = pnx0Var5.e;
                            int i43 = azmVar4.g;
                            if (pnx0Var5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && pnx0Var5.a == 1) {
                                i43 = Math.min(i43, azmVar4.m);
                            }
                            i40 = z ? i42 - i43 : i42 + i43;
                            if (z) {
                                mzlVar6.d(i40);
                            } else {
                                mzlVar5.d(i40);
                            }
                            if (i41 < i14 && i41 < i) {
                                i40 = z ? i40 - (-mzlVar5.f) : i40 + (-mzlVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    float f7 = this.f == 0 ? this.b.g0 : this.b.h0;
                    if (z) {
                        f7 = 1.0f - f7;
                    }
                    int i44 = (int) (((i12 - i4) * f7) + 0.5f);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        pnx0 pnx0Var6 = arrayList.get(z ? size - (i46 + 1) : i46);
                        ConstraintWidget constraintWidget6 = pnx0Var6.b;
                        mzl mzlVar7 = pnx0Var6.i;
                        mzl mzlVar8 = pnx0Var6.h;
                        if (constraintWidget6.j0 == 8) {
                            mzlVar8.d(i45);
                            mzlVar7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i13) {
                                i45 = z ? i45 - mzlVar8.f : i45 + mzlVar8.f;
                            }
                            if (z) {
                                mzlVar7.d(i45);
                            } else {
                                mzlVar8.d(i45);
                            }
                            azm azmVar5 = pnx0Var6.e;
                            int i47 = azmVar5.g;
                            if (pnx0Var6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && pnx0Var6.a == 1) {
                                i47 = azmVar5.m;
                            }
                            i45 += i47;
                            if (z) {
                                mzlVar8.d(i45);
                            } else {
                                mzlVar7.d(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-mzlVar7.f) : i45 + (-mzlVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // xsna.pnx0
    public final void d() {
        ArrayList<pnx0> arrayList = this.k;
        Iterator<pnx0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).b;
        int i = this.f;
        mzl mzlVar = this.i;
        mzl mzlVar2 = this.h;
        if (i == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
            mzl i2 = pnx0.i(constraintAnchor, 0);
            int e = constraintAnchor.e();
            ConstraintWidget m = m();
            if (m != null) {
                e = m.K.e();
            }
            if (i2 != null) {
                pnx0.b(mzlVar2, i2, e);
            }
            mzl i3 = pnx0.i(constraintAnchor2, 0);
            int e2 = constraintAnchor2.e();
            ConstraintWidget n = n();
            if (n != null) {
                e2 = n.M.e();
            }
            if (i3 != null) {
                pnx0.b(mzlVar, i3, -e2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.N;
            mzl i4 = pnx0.i(constraintAnchor3, 1);
            int e3 = constraintAnchor3.e();
            ConstraintWidget m2 = m();
            if (m2 != null) {
                e3 = m2.L.e();
            }
            if (i4 != null) {
                pnx0.b(mzlVar2, i4, e3);
            }
            mzl i5 = pnx0.i(constraintAnchor4, 1);
            int e4 = constraintAnchor4.e();
            ConstraintWidget n2 = n();
            if (n2 != null) {
                e4 = n2.N.e();
            }
            if (i5 != null) {
                pnx0.b(mzlVar, i5, -e4);
            }
        }
        mzlVar2.a = this;
        mzlVar.a = this;
    }

    @Override // xsna.pnx0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<pnx0> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // xsna.pnx0
    public final void f() {
        this.c = null;
        Iterator<pnx0> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // xsna.pnx0
    public final long j() {
        ArrayList<pnx0> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + arrayList.get(i).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // xsna.pnx0
    public final boolean k() {
        ArrayList<pnx0> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i = 0;
        while (true) {
            ArrayList<pnx0> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i).b;
            if (constraintWidget.j0 != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList<pnx0> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).b;
            if (constraintWidget.j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator<pnx0> it = this.k.iterator();
        while (it.hasNext()) {
            pnx0 next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }
}
