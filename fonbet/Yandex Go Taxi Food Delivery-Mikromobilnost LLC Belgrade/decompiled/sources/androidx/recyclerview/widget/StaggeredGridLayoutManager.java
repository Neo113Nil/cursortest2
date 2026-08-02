package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.emr;
import defpackage.h3s0;
import defpackage.ny61;
import defpackage.uh;
import defpackage.unr0;
import defpackage.wh;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.e implements u0 {
    public int J;
    public g1[] K;
    public final d0 L;
    public final d0 M;
    public final int N;
    public int O;
    public final t P;
    public boolean Q;
    public boolean R;
    public BitSet S;
    public int T;
    public int U;
    public final f1 V;
    public final int W;
    public boolean Z;
    public boolean a0;
    public SavedState b0;
    public int c0;
    public final Rect d0;
    public final emr e0;
    public boolean f0;
    public final boolean g0;
    public int[] h0;
    public final h3s0 i0;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.J = -1;
        this.Q = false;
        this.R = false;
        this.T = -1;
        this.U = Integer.MIN_VALUE;
        this.V = new f1();
        this.W = 2;
        this.d0 = new Rect();
        this.e0 = new emr(this);
        this.f0 = false;
        this.g0 = true;
        this.i0 = new h3s0(2, this);
        RecyclerView.e.a s0 = RecyclerView.e.s0(context, attributeSet, i, i2);
        int i3 = s0.a;
        if (i3 != 0 && i3 != 1) {
            ny61.g("invalid orientation.");
            throw null;
        }
        H(null);
        if (i3 != this.N) {
            this.N = i3;
            d0 d0Var = this.L;
            this.L = this.M;
            this.M = d0Var;
            i1();
        }
        X1(s0.b);
        boolean z = s0.c;
        H(null);
        SavedState savedState = this.b0;
        if (savedState != null && savedState.mReverseLayout != z) {
            savedState.mReverseLayout = z;
        }
        this.Q = z;
        i1();
        this.P = new t();
        this.L = d0.a(this, this.N);
        this.M = d0.a(this, 1 - this.N);
    }

    public static int b2(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.b(kVar, this.L, D1(z), C1(z), this, this.g0, this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int B1(r0 r0Var, t tVar, RecyclerView.k kVar) {
        g1 g1Var;
        t tVar2;
        int i;
        int i2;
        int J1;
        int c;
        int i3;
        int i4;
        boolean M1;
        d0 d0Var;
        int k;
        int c2;
        LayoutParams layoutParams;
        boolean z;
        t tVar3;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        int i8;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        r0 r0Var2 = r0Var;
        int i9 = 0;
        int i10 = 1;
        staggeredGridLayoutManager.S.set(0, staggeredGridLayoutManager.J, true);
        t tVar4 = staggeredGridLayoutManager.P;
        int i11 = tVar4.i ? tVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : tVar.e == 1 ? tVar.g + tVar.b : tVar.f - tVar.b;
        staggeredGridLayoutManager.Y1(tVar.e, i11);
        boolean z4 = staggeredGridLayoutManager.R;
        d0 d0Var2 = staggeredGridLayoutManager.L;
        int g = z4 ? d0Var2.g() : d0Var2.k();
        boolean z5 = false;
        while (tVar.a(kVar) && (tVar4.i || !staggeredGridLayoutManager.S.isEmpty())) {
            View b = tVar.b(r0Var2);
            LayoutParams layoutParams2 = (LayoutParams) b.getLayoutParams();
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            f1 f1Var = staggeredGridLayoutManager.V;
            int g2 = f1Var.g(viewLayoutPosition);
            int i12 = g2 == -1 ? i10 : i9;
            if (i12 != 0) {
                if (layoutParams2.mFullSpan) {
                    g1Var = staggeredGridLayoutManager.K[i9];
                } else {
                    boolean P1 = staggeredGridLayoutManager.P1(tVar.e);
                    int i13 = staggeredGridLayoutManager.J;
                    if (P1) {
                        i8 = i13 - 1;
                        i7 = -1;
                        i6 = -1;
                    } else {
                        i6 = i10;
                        i7 = i13;
                        i8 = i9;
                    }
                    g1 g1Var2 = null;
                    if (tVar.e == i10) {
                        int k2 = d0Var2.k();
                        int i14 = Integer.MAX_VALUE;
                        while (i8 != i7) {
                            g1 g1Var3 = staggeredGridLayoutManager.K[i8];
                            int i15 = i8;
                            int k3 = g1Var3.k(k2);
                            if (k3 < i14) {
                                g1Var2 = g1Var3;
                                i14 = k3;
                            }
                            i8 = i15 + i6;
                        }
                    } else {
                        int g3 = d0Var2.g();
                        int i16 = Integer.MIN_VALUE;
                        while (i8 != i7) {
                            g1 g1Var4 = staggeredGridLayoutManager.K[i8];
                            int i17 = i7;
                            int o = g1Var4.o(g3);
                            if (o > i16) {
                                g1Var2 = g1Var4;
                                i16 = o;
                            }
                            i8 += i6;
                            i7 = i17;
                        }
                    }
                    g1Var = g1Var2;
                }
                f1Var.k(viewLayoutPosition, g1Var);
            } else {
                g1Var = staggeredGridLayoutManager.K[g2];
            }
            layoutParams2.mSpan = g1Var;
            if (tVar.e == 1) {
                staggeredGridLayoutManager.F(b);
            } else {
                staggeredGridLayoutManager.G(0, b, false);
            }
            boolean z6 = layoutParams2.mFullSpan;
            int i18 = staggeredGridLayoutManager.N;
            if (!z6) {
                tVar2 = tVar4;
                i = i11;
                i2 = 1;
                if (i18 == 1) {
                    staggeredGridLayoutManager.N1(RecyclerView.e.e0(staggeredGridLayoutManager.O, staggeredGridLayoutManager.F, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false), RecyclerView.e.e0(staggeredGridLayoutManager.I, staggeredGridLayoutManager.G, staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), b);
                } else {
                    staggeredGridLayoutManager.N1(RecyclerView.e.e0(staggeredGridLayoutManager.H, staggeredGridLayoutManager.F, staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), RecyclerView.e.e0(staggeredGridLayoutManager.O, staggeredGridLayoutManager.G, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false), b);
                }
            } else if (i18 == 1) {
                i = i11;
                tVar2 = tVar4;
                i2 = 1;
                staggeredGridLayoutManager.N1(staggeredGridLayoutManager.c0, RecyclerView.e.e0(staggeredGridLayoutManager.I, staggeredGridLayoutManager.G, staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), b);
            } else {
                tVar2 = tVar4;
                i = i11;
                i2 = 1;
                staggeredGridLayoutManager.N1(RecyclerView.e.e0(staggeredGridLayoutManager.H, staggeredGridLayoutManager.F, staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), staggeredGridLayoutManager.c0, b);
            }
            int i19 = tVar.e;
            boolean z7 = layoutParams2.mFullSpan;
            if (i19 == i2) {
                c = z7 ? staggeredGridLayoutManager.I1(g) : g1Var.k(g);
                J1 = d0Var2.c(b) + c;
                if (i12 != 0 && layoutParams2.mFullSpan) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan = new int[staggeredGridLayoutManager.J];
                    for (int i20 = 0; i20 < staggeredGridLayoutManager.J; i20++) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan[i20] = c - staggeredGridLayoutManager.K[i20].k(c);
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir = -1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition = viewLayoutPosition;
                    f1Var.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
            } else {
                J1 = z7 ? staggeredGridLayoutManager.J1(g) : g1Var.o(g);
                c = J1 - d0Var2.c(b);
                if (i12 != 0 && layoutParams2.mFullSpan) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapPerSpan = new int[staggeredGridLayoutManager.J];
                    for (int i21 = 0; i21 < staggeredGridLayoutManager.J; i21++) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapPerSpan[i21] = staggeredGridLayoutManager.K[i21].o(J1) - J1;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapDir = 1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mPosition = viewLayoutPosition;
                    f1Var.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2);
                }
            }
            if (!layoutParams2.mFullSpan || tVar.d != -1) {
                i3 = 1;
            } else if (i12 != 0) {
                staggeredGridLayoutManager.f0 = true;
                i3 = 1;
            } else {
                int i22 = tVar.e;
                g1[] g1VarArr = staggeredGridLayoutManager.K;
                if (i22 != 1) {
                    int o2 = g1VarArr[0].o(Integer.MIN_VALUE);
                    int i23 = 1;
                    while (true) {
                        if (i23 >= staggeredGridLayoutManager.J) {
                            z3 = true;
                            break;
                        }
                        if (staggeredGridLayoutManager.K[i23].o(Integer.MIN_VALUE) != o2) {
                            z3 = false;
                            break;
                        }
                        i23++;
                    }
                } else {
                    int k4 = g1VarArr[0].k(Integer.MIN_VALUE);
                    int i24 = 1;
                    while (true) {
                        if (i24 >= staggeredGridLayoutManager.J) {
                            z3 = true;
                            break;
                        }
                        if (staggeredGridLayoutManager.K[i24].k(Integer.MIN_VALUE) != k4) {
                            z3 = false;
                            break;
                        }
                        i24++;
                    }
                }
                i3 = 1;
                if (!z3) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f = f1Var.f(viewLayoutPosition);
                    if (f != null) {
                        f.mHasUnwantedGapAfter = true;
                    }
                    staggeredGridLayoutManager.f0 = true;
                }
                i4 = tVar.e;
                boolean z8 = layoutParams2.mFullSpan;
                if (i4 != i3) {
                    if (z8) {
                        for (int i25 = staggeredGridLayoutManager.J - i3; i25 >= 0; i25--) {
                            staggeredGridLayoutManager.K[i25].a(b);
                        }
                    } else {
                        layoutParams2.mSpan.a(b);
                    }
                } else if (z8) {
                    for (int i26 = staggeredGridLayoutManager.J - 1; i26 >= 0; i26--) {
                        staggeredGridLayoutManager.K[i26].s(b);
                    }
                } else {
                    layoutParams2.mSpan.s(b);
                }
                M1 = staggeredGridLayoutManager.M1();
                d0Var = staggeredGridLayoutManager.M;
                if (M1 || i18 != 1) {
                    k = !layoutParams2.mFullSpan ? d0Var.k() : d0Var.k() + (g1Var.e * staggeredGridLayoutManager.O);
                    c2 = d0Var.c(b) + k;
                } else {
                    int g4 = layoutParams2.mFullSpan ? d0Var.g() : d0Var.g() - (((staggeredGridLayoutManager.J - 1) - g1Var.e) * staggeredGridLayoutManager.O);
                    int c3 = g4 - d0Var.c(b);
                    c2 = g4;
                    k = c3;
                }
                if (i18 != 1) {
                    int i27 = J1;
                    layoutParams = layoutParams2;
                    staggeredGridLayoutManager.C0(k, c, c2, i27, b);
                    staggeredGridLayoutManager = this;
                } else {
                    int i28 = J1;
                    layoutParams = layoutParams2;
                    staggeredGridLayoutManager.C0(c, k, i28, c2, b);
                }
                z = layoutParams.mFullSpan;
                tVar3 = tVar2;
                int i29 = tVar3.e;
                if (z) {
                    i5 = i;
                    staggeredGridLayoutManager.a2(g1Var, i29, i5);
                } else {
                    i5 = i;
                    staggeredGridLayoutManager.Y1(i29, i5);
                }
                staggeredGridLayoutManager.R1(r0Var, tVar3);
                if (tVar3.h && b.hasFocusable()) {
                    z2 = layoutParams.mFullSpan;
                    BitSet bitSet = staggeredGridLayoutManager.S;
                    if (z2) {
                        bitSet.set(g1Var.e, false);
                    } else {
                        bitSet.clear();
                    }
                }
                tVar4 = tVar3;
                r0Var2 = r0Var;
                z5 = true;
                i10 = 1;
                i11 = i5;
                i9 = 0;
            }
            i4 = tVar.e;
            boolean z82 = layoutParams2.mFullSpan;
            if (i4 != i3) {
            }
            M1 = staggeredGridLayoutManager.M1();
            d0Var = staggeredGridLayoutManager.M;
            if (M1) {
            }
            if (!layoutParams2.mFullSpan) {
            }
            c2 = d0Var.c(b) + k;
            if (i18 != 1) {
            }
            z = layoutParams.mFullSpan;
            tVar3 = tVar2;
            int i292 = tVar3.e;
            if (z) {
            }
            staggeredGridLayoutManager.R1(r0Var, tVar3);
            if (tVar3.h) {
                z2 = layoutParams.mFullSpan;
                BitSet bitSet2 = staggeredGridLayoutManager.S;
                if (z2) {
                }
            }
            tVar4 = tVar3;
            r0Var2 = r0Var;
            z5 = true;
            i10 = 1;
            i11 = i5;
            i9 = 0;
        }
        r0 r0Var3 = r0Var2;
        t tVar5 = tVar4;
        if (!z5) {
            staggeredGridLayoutManager.R1(r0Var3, tVar5);
        }
        int k5 = tVar5.e == -1 ? d0Var2.k() - staggeredGridLayoutManager.J1(d0Var2.k()) : staggeredGridLayoutManager.I1(d0Var2.g()) - d0Var2.g();
        if (k5 > 0) {
            return Math.min(tVar.b, k5);
        }
        return 0;
    }

    public final View C1(boolean z) {
        d0 d0Var = this.L;
        int k = d0Var.k();
        int g = d0Var.g();
        View view = null;
        for (int d0 = d0() - 1; d0 >= 0; d0--) {
            View c0 = c0(d0);
            int e = d0Var.e(c0);
            int b = d0Var.b(c0);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return c0;
                }
                if (view == null) {
                    view = c0;
                }
            }
        }
        return view;
    }

    public final View D1(boolean z) {
        d0 d0Var = this.L;
        int k = d0Var.k();
        int g = d0Var.g();
        int d0 = d0();
        View view = null;
        for (int i = 0; i < d0; i++) {
            View c0 = c0(i);
            int e = d0Var.e(c0);
            if (d0Var.b(c0) > k && e < g) {
                if (e >= k || !z) {
                    return c0;
                }
                if (view == null) {
                    view = c0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void E0(int i) {
        super.E0(i);
        for (int i2 = 0; i2 < this.J; i2++) {
            this.K[i2].p(i);
        }
    }

    public final void E1(r0 r0Var, RecyclerView.k kVar, boolean z) {
        int g;
        int I1 = I1(Integer.MIN_VALUE);
        if (I1 != Integer.MIN_VALUE && (g = this.L.g() - I1) > 0) {
            int i = g - (-V1(-g, r0Var, kVar));
            if (!z || i <= 0) {
                return;
            }
            this.L.p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void F0(int i) {
        super.F0(i);
        for (int i2 = 0; i2 < this.J; i2++) {
            this.K[i2].p(i);
        }
    }

    public final void F1(r0 r0Var, RecyclerView.k kVar, boolean z) {
        int k;
        int J1 = J1(Integer.MAX_VALUE);
        if (J1 != Integer.MAX_VALUE && (k = J1 - this.L.k()) > 0) {
            int V1 = k - V1(k, r0Var, kVar);
            if (!z || V1 <= 0) {
                return;
            }
            this.L.p(-V1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.V.b();
        for (int i = 0; i < this.J; i++) {
            this.K[i].e();
        }
    }

    public final int G1() {
        if (d0() == 0) {
            return 0;
        }
        return RecyclerView.e.r0(c0(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H(String str) {
        if (this.b0 == null) {
            super.H(str);
        }
    }

    public final int H1() {
        int d0 = d0();
        if (d0 == 0) {
            return 0;
        }
        return RecyclerView.e.r0(c0(d0 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return this.N == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void I0(RecyclerView recyclerView, r0 r0Var) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.i0);
        }
        for (int i = 0; i < this.J; i++) {
            this.K[i].e();
        }
        recyclerView.requestLayout();
    }

    public final int I1(int i) {
        int k = this.K[0].k(i);
        for (int i2 = 1; i2 < this.J; i2++) {
            int k2 = this.K[i2].k(i);
            if (k2 > k) {
                k = k2;
            }
        }
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.N == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0036, code lost:
    
        if (r0 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x003a, code lost:
    
        if (r0 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0044, code lost:
    
        if (M1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x004e, code lost:
    
        if (M1() == false) goto L26;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        View W;
        int i2;
        View l;
        if (d0() == 0 || (W = W(view)) == null) {
            return null;
        }
        U1();
        int i3 = this.N;
        if (i == 1) {
            if (i3 != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (i3 != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) W.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        g1 g1Var = layoutParams.mSpan;
        int H1 = i2 == 1 ? H1() : G1();
        Z1(H1, kVar);
        W1(i2);
        t tVar = this.P;
        tVar.c = tVar.d + H1;
        tVar.b = (int) (this.L.l() * 0.33333334f);
        tVar.h = true;
        tVar.a = false;
        B1(r0Var, tVar, kVar);
        this.Z = this.R;
        if (!z && (l = g1Var.l(H1, i2)) != null && l != W) {
            return l;
        }
        if (P1(i2)) {
            for (int i4 = this.J - 1; i4 >= 0; i4--) {
                View l2 = this.K[i4].l(H1, i2);
                if (l2 != null && l2 != W) {
                    return l2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.J; i5++) {
                View l3 = this.K[i5].l(H1, i2);
                if (l3 != null && l3 != W) {
                    return l3;
                }
            }
        }
        boolean z2 = (this.Q ^ true) == (i2 == -1);
        if (!z) {
            View X = X(z2 ? g1Var.f() : g1Var.g());
            if (X != null && X != W) {
                return X;
            }
        }
        if (P1(i2)) {
            for (int i6 = this.J - 1; i6 >= 0; i6--) {
                if (i6 != g1Var.e) {
                    g1[] g1VarArr = this.K;
                    View X2 = X(z2 ? g1VarArr[i6].f() : g1VarArr[i6].g());
                    if (X2 != null && X2 != W) {
                        return X2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.J; i7++) {
                g1[] g1VarArr2 = this.K;
                View X3 = X(z2 ? g1VarArr2[i7].f() : g1VarArr2[i7].g());
                if (X3 != null && X3 != W) {
                    return X3;
                }
            }
        }
        return null;
    }

    public final int J1(int i) {
        int o = this.K[0].o(i);
        for (int i2 = 1; i2 < this.J; i2++) {
            int o2 = this.K[i2].o(i);
            if (o2 < o) {
                o = o2;
            }
        }
        return o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean K(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (d0() > 0) {
            View D1 = D1(false);
            View C1 = C1(false);
            if (D1 == null || C1 == null) {
                return;
            }
            int viewLayoutPosition = ((RecyclerView.LayoutParams) D1.getLayoutParams()).getViewLayoutPosition();
            int viewLayoutPosition2 = ((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition < viewLayoutPosition2) {
                accessibilityEvent.setFromIndex(viewLayoutPosition);
                accessibilityEvent.setToIndex(viewLayoutPosition2);
            } else {
                accessibilityEvent.setFromIndex(viewLayoutPosition2);
                accessibilityEvent.setToIndex(viewLayoutPosition);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i, int i2, int i3) {
        int i4;
        int i5;
        int H1 = this.R ? H1() : G1();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                f1 f1Var = this.V;
                f1Var.h(i5);
                if (i3 != 1) {
                    f1Var.i(i, i2);
                } else if (i3 == 2) {
                    f1Var.j(i, i2);
                } else if (i3 == 8) {
                    f1Var.j(i, 1);
                    f1Var.i(i2, 1);
                }
                if (i4 > H1) {
                    return;
                }
                if (i5 <= (this.R ? G1() : H1())) {
                    i1();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        f1 f1Var2 = this.V;
        f1Var2.h(i5);
        if (i3 != 1) {
        }
        if (i4 > H1) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void L0(r0 r0Var, RecyclerView.k kVar, wh whVar) {
        super.L0(r0Var, kVar, whVar);
        whVar.p("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View L1() {
        int i;
        boolean z;
        boolean z2;
        int d0 = d0();
        int i2 = d0 - 1;
        BitSet bitSet = new BitSet(this.J);
        bitSet.set(0, this.J, true);
        char c = (this.N == 1 && M1()) ? (char) 1 : (char) 65535;
        if (this.R) {
            d0 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < d0 ? 1 : -1;
        while (i2 != d0) {
            View c0 = c0(i2);
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            boolean z3 = bitSet.get(layoutParams.mSpan.e);
            d0 d0Var = this.L;
            if (z3) {
                g1 g1Var = layoutParams.mSpan;
                if (this.R) {
                    if (g1Var.j() < d0Var.g()) {
                        z = g1.m((View) unr0.k(1, g1Var.a)).mFullSpan;
                        z2 = !z;
                    }
                    z2 = false;
                } else {
                    if (g1Var.n() > d0Var.k()) {
                        z = g1.m((View) g1Var.a.get(0)).mFullSpan;
                        z2 = !z;
                    }
                    z2 = false;
                }
                if (z2) {
                    return c0;
                }
                bitSet.clear(layoutParams.mSpan.e);
            }
            if (!layoutParams.mFullSpan && (i = i2 + i3) != d0) {
                View c02 = c0(i);
                if (this.R) {
                    int b = d0Var.b(c0);
                    int b2 = d0Var.b(c02);
                    if (b >= b2) {
                        if (b != b2) {
                            continue;
                        }
                        if ((layoutParams.mSpan.e - ((LayoutParams) c02.getLayoutParams()).mSpan.e >= 0) == (c >= 0)) {
                        }
                    }
                } else {
                    int e = d0Var.e(c0);
                    int e2 = d0Var.e(c02);
                    if (e <= e2) {
                        if (e != e2) {
                            continue;
                        }
                        if ((layoutParams.mSpan.e - ((LayoutParams) c02.getLayoutParams()).mSpan.e >= 0) == (c >= 0)) {
                        }
                    }
                }
                return c0;
            }
            i2 += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void M(int i, int i2, RecyclerView.k kVar, o oVar) {
        t tVar;
        int k;
        int i3;
        if (this.N != 0) {
            i = i2;
        }
        if (d0() == 0 || i == 0) {
            return;
        }
        Q1(i, kVar);
        int[] iArr = this.h0;
        if (iArr == null || iArr.length < this.J) {
            this.h0 = new int[this.J];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.J;
            tVar = this.P;
            if (i4 >= i6) {
                break;
            }
            if (tVar.d == -1) {
                k = tVar.f;
                i3 = this.K[i4].o(k);
            } else {
                k = this.K[i4].k(tVar.g);
                i3 = tVar.g;
            }
            int i7 = k - i3;
            if (i7 >= 0) {
                this.h0[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.h0, 0, i5);
        for (int i8 = 0; i8 < i5 && tVar.a(kVar); i8++) {
            oVar.a(tVar.c, this.h0[i8]);
            tVar.c += tVar.d;
        }
    }

    public final boolean M1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void N0(r0 r0Var, RecyclerView.k kVar, View view, wh whVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            M0(view, whVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.N == 0) {
            whVar.s(uh.a(layoutParams2.getSpanIndex(), layoutParams2.mFullSpan ? this.J : 1, -1, -1, false, false));
        } else {
            whVar.s(uh.a(-1, -1, layoutParams2.getSpanIndex(), layoutParams2.mFullSpan ? this.J : 1, false, false));
        }
    }

    public final void N1(int i, int i2, View view) {
        Rect rect = this.d0;
        m(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int b2 = b2(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int b22 = b2(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (u1(view, b2, b22, layoutParams)) {
            view.measure(b2, b22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int O(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.a(kVar, this.L, D1(z), C1(z), this, this.g0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        K1(i, i2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        if ((r7 < G1()) != r11.R) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0388, code lost:
    
        if (z1() != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0170, code lost:
    
        if (r11.R != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0180, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(r0 r0Var, RecyclerView.k kVar, boolean z) {
        SavedState savedState;
        g1[] g1VarArr;
        int i;
        int i2;
        boolean z2;
        SavedState savedState2 = this.b0;
        emr emrVar = this.e0;
        if (!(savedState2 == null && this.T == -1) && kVar.b() == 0) {
            c1(r0Var);
            emrVar.c();
            return;
        }
        boolean z3 = true;
        boolean z4 = (emrVar.f && this.T == -1 && this.b0 == null) ? false : true;
        f1 f1Var = this.V;
        if (z4) {
            emrVar.c();
            SavedState savedState3 = this.b0;
            d0 d0Var = this.L;
            if (savedState3 != null) {
                int i3 = savedState3.mSpanOffsetsSize;
                if (i3 > 0) {
                    if (i3 == this.J) {
                        for (int i4 = 0; i4 < this.J; i4++) {
                            this.K[i4].e();
                            SavedState savedState4 = this.b0;
                            int i5 = savedState4.mSpanOffsets[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += savedState4.mAnchorLayoutFromEnd ? d0Var.g() : d0Var.k();
                            }
                            this.K[i4].t(i5);
                        }
                    } else {
                        savedState3.invalidateSpanInfo();
                        SavedState savedState5 = this.b0;
                        savedState5.mAnchorPosition = savedState5.mVisibleAnchorPosition;
                    }
                }
                SavedState savedState6 = this.b0;
                this.a0 = savedState6.mLastLayoutRTL;
                boolean z5 = savedState6.mReverseLayout;
                H(null);
                SavedState savedState7 = this.b0;
                if (savedState7 != null && savedState7.mReverseLayout != z5) {
                    savedState7.mReverseLayout = z5;
                }
                this.Q = z5;
                i1();
                U1();
                SavedState savedState8 = this.b0;
                int i6 = savedState8.mAnchorPosition;
                if (i6 != -1) {
                    this.T = i6;
                    emrVar.d = savedState8.mAnchorLayoutFromEnd;
                } else {
                    emrVar.d = this.R;
                }
                if (savedState8.mSpanLookupSize > 1) {
                    f1Var.a = savedState8.mSpanLookup;
                    f1Var.b = savedState8.mFullSpanItems;
                }
            } else {
                U1();
                emrVar.d = this.R;
            }
            if (!kVar.g && (i2 = this.T) != -1) {
                if (i2 < 0 || i2 >= kVar.b()) {
                    this.T = -1;
                    this.U = Integer.MIN_VALUE;
                } else {
                    SavedState savedState9 = this.b0;
                    if (savedState9 == null || savedState9.mAnchorPosition == -1 || savedState9.mSpanOffsetsSize < 1) {
                        View X = X(this.T);
                        if (X != null) {
                            emrVar.b = this.R ? H1() : G1();
                            if (this.U != Integer.MIN_VALUE) {
                                if (emrVar.d) {
                                    emrVar.c = (d0Var.g() - this.U) - d0Var.b(X);
                                } else {
                                    emrVar.c = (d0Var.k() + this.U) - d0Var.e(X);
                                }
                            } else if (d0Var.c(X) > d0Var.l()) {
                                emrVar.c = emrVar.d ? d0Var.g() : d0Var.k();
                            } else {
                                int e = d0Var.e(X) - d0Var.k();
                                if (e < 0) {
                                    emrVar.c = -e;
                                } else {
                                    int g = d0Var.g() - d0Var.b(X);
                                    if (g < 0) {
                                        emrVar.c = g;
                                    } else {
                                        emrVar.c = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.T;
                            emrVar.b = i7;
                            int i8 = this.U;
                            if (i8 == Integer.MIN_VALUE) {
                                if (d0() == 0) {
                                }
                                emrVar.d = z2;
                                emrVar.a();
                            } else {
                                emrVar.b(i8);
                            }
                            emrVar.e = true;
                        }
                    } else {
                        emrVar.c = Integer.MIN_VALUE;
                        emrVar.b = this.T;
                    }
                    emrVar.f = true;
                }
            }
            if (this.Z) {
                int b = kVar.b();
                for (int d0 = d0() - 1; d0 >= 0; d0--) {
                    i = RecyclerView.e.r0(c0(d0));
                    if (i >= 0 && i < b) {
                        break;
                    }
                }
                i = 0;
                emrVar.b = i;
                emrVar.c = Integer.MIN_VALUE;
                emrVar.f = true;
            } else {
                int b2 = kVar.b();
                int d02 = d0();
                for (int i9 = 0; i9 < d02; i9++) {
                    int r0 = RecyclerView.e.r0(c0(i9));
                    if (r0 >= 0 && r0 < b2) {
                        i = r0;
                        break;
                    }
                }
                i = 0;
                emrVar.b = i;
                emrVar.c = Integer.MIN_VALUE;
                emrVar.f = true;
            }
        }
        if (this.b0 == null && this.T == -1 && (emrVar.d != this.Z || M1() != this.a0)) {
            f1Var.b();
            emrVar.e = true;
        }
        if (d0() > 0 && ((savedState = this.b0) == null || savedState.mSpanOffsetsSize < 1)) {
            if (emrVar.e) {
                for (int i10 = 0; i10 < this.J; i10++) {
                    this.K[i10].e();
                    int i11 = emrVar.c;
                    if (i11 != Integer.MIN_VALUE) {
                        this.K[i10].t(i11);
                    }
                }
            } else if (z4 || emrVar.g == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.J;
                    g1VarArr = this.K;
                    if (i12 >= i13) {
                        break;
                    }
                    g1VarArr[i12].b(emrVar.c, this.R);
                    i12++;
                }
                emrVar.d(g1VarArr);
            } else {
                for (int i14 = 0; i14 < this.J; i14++) {
                    g1 g1Var = this.K[i14];
                    g1Var.e();
                    g1Var.t(emrVar.g[i14]);
                }
            }
        }
        U(r0Var);
        t tVar = this.P;
        tVar.a = false;
        this.f0 = false;
        d0 d0Var2 = this.M;
        int l = d0Var2.l();
        this.O = l / this.J;
        this.c0 = View.MeasureSpec.makeMeasureSpec(l, d0Var2.i());
        Z1(emrVar.b, kVar);
        if (emrVar.d) {
            W1(-1);
            B1(r0Var, tVar, kVar);
            W1(1);
            tVar.c = emrVar.b + tVar.d;
            B1(r0Var, tVar, kVar);
        } else {
            W1(1);
            B1(r0Var, tVar, kVar);
            W1(-1);
            tVar.c = emrVar.b + tVar.d;
            B1(r0Var, tVar, kVar);
        }
        if (d0Var2.i() != 1073741824) {
            int d03 = d0();
            float f = 0.0f;
            for (int i15 = 0; i15 < d03; i15++) {
                View c0 = c0(i15);
                float c = d0Var2.c(c0);
                if (c >= f) {
                    if (((LayoutParams) c0.getLayoutParams()).isFullSpan()) {
                        c = (c * 1.0f) / this.J;
                    }
                    f = Math.max(f, c);
                }
            }
            int i16 = this.O;
            int round = Math.round(f * this.J);
            if (d0Var2.i() == Integer.MIN_VALUE) {
                round = Math.min(round, d0Var2.l());
            }
            this.O = round / this.J;
            this.c0 = View.MeasureSpec.makeMeasureSpec(round, d0Var2.i());
            if (this.O != i16) {
                for (int i17 = 0; i17 < d03; i17++) {
                    View c02 = c0(i17);
                    LayoutParams layoutParams = (LayoutParams) c02.getLayoutParams();
                    if (!layoutParams.mFullSpan) {
                        boolean M1 = M1();
                        int i18 = this.N;
                        if (M1 && i18 == 1) {
                            int i19 = -((this.J - 1) - layoutParams.mSpan.e);
                            c02.offsetLeftAndRight((this.O * i19) - (i19 * i16));
                        } else {
                            int i20 = layoutParams.mSpan.e;
                            int i21 = this.O * i20;
                            int i22 = i20 * i16;
                            if (i18 == 1) {
                                c02.offsetLeftAndRight(i21 - i22);
                            } else {
                                c02.offsetTopAndBottom(i21 - i22);
                            }
                        }
                    }
                }
            }
        }
        if (d0() > 0) {
            if (this.R) {
                E1(r0Var, kVar, true);
                F1(r0Var, kVar, false);
            } else {
                F1(r0Var, kVar, true);
                E1(r0Var, kVar, false);
            }
        }
        if (z && !kVar.g && this.W != 0 && d0() > 0 && (this.f0 || L1() != null)) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.i0);
            }
        }
        z3 = false;
        if (kVar.g) {
            emrVar.c();
        }
        this.Z = emrVar.d;
        this.a0 = M1();
        if (z3) {
            emrVar.c();
            O1(r0Var, kVar, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int P(RecyclerView.k kVar) {
        return A1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        this.V.b();
        i1();
    }

    public final boolean P1(int i) {
        if (this.N == 0) {
            return (i == -1) != this.R;
        }
        return ((i == -1) == this.R) == M1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int Q(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.c(kVar, this.L, D1(z), C1(z), this, this.g0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        K1(i, i2, 8);
    }

    public final void Q1(int i, RecyclerView.k kVar) {
        int G1;
        int i2;
        if (i > 0) {
            G1 = H1();
            i2 = 1;
        } else {
            G1 = G1();
            i2 = -1;
        }
        t tVar = this.P;
        tVar.a = true;
        Z1(G1, kVar);
        W1(i2);
        tVar.c = G1 + tVar.d;
        tVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.a(kVar, this.L, D1(z), C1(z), this, this.g0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        K1(i, i2, 2);
    }

    public final void R1(r0 r0Var, t tVar) {
        if (!tVar.a || tVar.i) {
            return;
        }
        int i = tVar.b;
        int i2 = tVar.e;
        if (i == 0) {
            if (i2 == -1) {
                S1(r0Var, tVar.g);
                return;
            } else {
                T1(r0Var, tVar.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = tVar.f;
            int o = this.K[0].o(i4);
            while (i3 < this.J) {
                int o2 = this.K[i3].o(i4);
                if (o2 > o) {
                    o = o2;
                }
                i3++;
            }
            int i5 = i4 - o;
            int i6 = tVar.g;
            if (i5 >= 0) {
                i6 -= Math.min(i5, tVar.b);
            }
            S1(r0Var, i6);
            return;
        }
        int i7 = tVar.g;
        int k = this.K[0].k(i7);
        while (i3 < this.J) {
            int k2 = this.K[i3].k(i7);
            if (k2 < k) {
                k = k2;
            }
            i3++;
        }
        int i8 = k - tVar.g;
        int i9 = tVar.f;
        if (i8 >= 0) {
            i9 += Math.min(i8, tVar.b);
        }
        T1(r0Var, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        return A1(kVar);
    }

    public final void S1(r0 r0Var, int i) {
        for (int d0 = d0() - 1; d0 >= 0; d0--) {
            View c0 = c0(d0);
            d0 d0Var = this.L;
            if (d0Var.e(c0) < i || d0Var.o(c0) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            if (layoutParams.mFullSpan) {
                for (int i2 = 0; i2 < this.J; i2++) {
                    if (this.K[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.J; i3++) {
                    this.K[i3].q();
                }
            } else if (layoutParams.mSpan.a.size() == 1) {
                return;
            } else {
                layoutParams.mSpan.q();
            }
            e1(c0, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.c(kVar, this.L, D1(z), C1(z), this, this.g0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
        K1(i, i2, 4);
    }

    public final void T1(r0 r0Var, int i) {
        while (d0() > 0) {
            View c0 = c0(0);
            d0 d0Var = this.L;
            if (d0Var.b(c0) > i || d0Var.n(c0) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            if (layoutParams.mFullSpan) {
                for (int i2 = 0; i2 < this.J; i2++) {
                    if (this.K[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.J; i3++) {
                    this.K[i3].r();
                }
            } else if (layoutParams.mSpan.a.size() == 1) {
                return;
            } else {
                layoutParams.mSpan.r();
            }
            e1(c0, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        O1(r0Var, kVar, true);
    }

    public final void U1() {
        if (this.N == 1 || !M1()) {
            this.R = this.Q;
        } else {
            this.R = !this.Q;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void V0(RecyclerView.k kVar) {
        this.T = -1;
        this.U = Integer.MIN_VALUE;
        this.b0 = null;
        this.e0.c();
    }

    public final int V1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (d0() == 0 || i == 0) {
            return 0;
        }
        Q1(i, kVar);
        t tVar = this.P;
        int B1 = B1(r0Var, tVar, kVar);
        if (tVar.b >= B1) {
            i = i < 0 ? -B1 : B1;
        }
        this.L.p(-i);
        this.Z = this.R;
        tVar.b = 0;
        R1(r0Var, tVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.b0 = savedState;
            if (this.T != -1) {
                savedState.invalidateAnchorPositionInfo();
                this.b0.invalidateSpanInfo();
            }
            i1();
        }
    }

    public final void W1(int i) {
        t tVar = this.P;
        tVar.e = i;
        tVar.d = this.R != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        int o;
        int k;
        int[] iArr;
        if (this.b0 != null) {
            return new SavedState(this.b0);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.Q;
        savedState.mAnchorLayoutFromEnd = this.Z;
        savedState.mLastLayoutRTL = this.a0;
        f1 f1Var = this.V;
        if (f1Var == null || (iArr = f1Var.a) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = f1Var.b;
        }
        if (d0() <= 0) {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
            return savedState;
        }
        savedState.mAnchorPosition = this.Z ? H1() : G1();
        View C1 = this.R ? C1(true) : D1(true);
        savedState.mVisibleAnchorPosition = C1 != null ? ((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition() : -1;
        int i = this.J;
        savedState.mSpanOffsetsSize = i;
        savedState.mSpanOffsets = new int[i];
        for (int i2 = 0; i2 < this.J; i2++) {
            boolean z = this.Z;
            g1[] g1VarArr = this.K;
            d0 d0Var = this.L;
            if (z) {
                o = g1VarArr[i2].k(Integer.MIN_VALUE);
                if (o != Integer.MIN_VALUE) {
                    k = d0Var.g();
                    o -= k;
                    savedState.mSpanOffsets[i2] = o;
                } else {
                    savedState.mSpanOffsets[i2] = o;
                }
            } else {
                o = g1VarArr[i2].o(Integer.MIN_VALUE);
                if (o != Integer.MIN_VALUE) {
                    k = d0Var.k();
                    o -= k;
                    savedState.mSpanOffsets[i2] = o;
                } else {
                    savedState.mSpanOffsets[i2] = o;
                }
            }
        }
        return savedState;
    }

    public final void X1(int i) {
        H(null);
        if (i != this.J) {
            this.V.b();
            i1();
            this.J = i;
            this.S = new BitSet(this.J);
            this.K = new g1[this.J];
            for (int i2 = 0; i2 < this.J; i2++) {
                this.K[i2] = new g1(this, i2);
            }
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return this.N == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Y0(int i) {
        if (i == 0) {
            z1();
        }
    }

    public final void Y1(int i, int i2) {
        for (int i3 = 0; i3 < this.J; i3++) {
            if (!this.K[i3].a.isEmpty()) {
                a2(this.K[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Z(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final void Z1(int i, RecyclerView.k kVar) {
        int i2;
        int i3;
        int i4;
        t tVar = this.P;
        boolean z = false;
        tVar.b = 0;
        tVar.c = i;
        boolean A0 = A0();
        d0 d0Var = this.L;
        if (!A0 || (i4 = kVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.R == (i4 < i)) {
                i2 = d0Var.l();
                i3 = 0;
            } else {
                i3 = d0Var.l();
                i2 = 0;
            }
        }
        if (f0()) {
            tVar.f = d0Var.k() - i3;
            tVar.g = d0Var.g() + i2;
        } else {
            tVar.g = d0Var.f() + i2;
            tVar.f = -i3;
        }
        tVar.h = false;
        tVar.a = true;
        if (d0Var.i() == 0 && d0Var.f() == 0) {
            z = true;
        }
        tVar.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void a2(g1 g1Var, int i, int i2) {
        int i3 = g1Var.i();
        int i4 = g1Var.e;
        if (i == -1) {
            if (g1Var.n() + i3 <= i2) {
                this.S.set(i4, false);
            }
        } else if (g1Var.j() - i3 >= i2) {
            this.S.set(i4, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < G1()) != r3.R) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.R != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF d(int i) {
        int i2 = -1;
        if (d0() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.N == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g0(r0 r0Var, RecyclerView.k kVar) {
        if (this.N == 1) {
            return Math.min(this.J, kVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        return V1(i, r0Var, kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        SavedState savedState = this.b0;
        if (savedState != null && savedState.mAnchorPosition != i) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.T = i;
        this.U = Integer.MIN_VALUE;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        return V1(i, r0Var, kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r1(Rect rect, int i, int i2) {
        int L;
        int L2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.N == 1) {
            L2 = RecyclerView.e.L(i2, rect.height() + paddingBottom, p0());
            L = RecyclerView.e.L(i, (this.O * this.J) + paddingRight, q0());
        } else {
            L = RecyclerView.e.L(i, rect.width() + paddingRight, q0());
            L2 = RecyclerView.e.L(i2, (this.O * this.J) + paddingBottom, p0());
        }
        q1(L, L2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int u0(r0 r0Var, RecyclerView.k kVar) {
        if (this.N == 0) {
            return Math.min(this.J, kVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: x0 */
    public final boolean getK() {
        return this.W != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.a = i;
        v(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean y0() {
        return this.Q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean y1() {
        return this.b0 == null;
    }

    public final boolean z1() {
        int G1;
        int H1;
        if (d0() != 0 && this.W != 0 && this.z) {
            if (this.R) {
                G1 = H1();
                H1 = G1();
            } else {
                G1 = G1();
                H1 = H1();
            }
            f1 f1Var = this.V;
            if (G1 == 0 && L1() != null) {
                f1Var.b();
                this.y = true;
                i1();
                return true;
            }
            if (this.f0) {
                int i = this.R ? -1 : 1;
                int i2 = H1 + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e = f1Var.e(G1, i2, i);
                if (e == null) {
                    this.f0 = false;
                    f1Var.d(i2);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e2 = f1Var.e(G1, e.mPosition, i * (-1));
                if (e2 == null) {
                    f1Var.d(e.mPosition);
                } else {
                    f1Var.d(e2.mPosition + 1);
                }
                this.y = true;
                i1();
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes10.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        g1 mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            g1 g1Var = this.mSpan;
            if (g1Var == null) {
                return -1;
            }
            return g1Var.e;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes10.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.mSpanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.mSpanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        public SavedState() {
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.J = -1;
        this.Q = false;
        this.R = false;
        this.T = -1;
        this.U = Integer.MIN_VALUE;
        this.V = new f1();
        this.W = 2;
        this.d0 = new Rect();
        this.e0 = new emr(this);
        this.f0 = false;
        this.g0 = true;
        this.i0 = new h3s0(2, this);
        this.N = i2;
        X1(i);
        this.P = new t();
        this.L = d0.a(this, this.N);
        this.M = d0.a(this, 1 - this.N);
    }
}
