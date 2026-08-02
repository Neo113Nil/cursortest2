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
import defpackage.amt0;
import defpackage.emr;
import defpackage.gki0;
import defpackage.i8m;
import defpackage.j1u;
import defpackage.mhp0;
import defpackage.tjd;
import defpackage.uh;
import defpackage.unr0;
import defpackage.wh;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes10.dex */
public class FlexStaggeredGridLayoutManager extends RecyclerView.e implements u0, mhp0, gki0, j1u {
    public final int J;
    public final n[] K;
    public final d0 L;
    public final d0 M;
    public final int N;
    public int O;
    public final t P;
    public boolean Q;
    public boolean R;
    public final BitSet S;
    public int T;
    public int U;
    public final m V;
    public int W;
    public boolean Z;
    public boolean a0;
    public SavedState b0;
    public int c0;
    public final Rect d0;
    public final emr e0;
    public boolean f0;
    public final boolean g0;
    public int[] h0;
    public final i8m i0;
    public final amt0 j0;
    public final boolean k0;
    public boolean l0;
    public boolean m0;

    public FlexStaggeredGridLayoutManager(amt0 amt0Var, boolean z) {
        this.J = -1;
        this.Q = false;
        this.R = false;
        this.T = -1;
        this.U = Integer.MIN_VALUE;
        m mVar = new m();
        this.V = mVar;
        this.W = 2;
        this.d0 = new Rect();
        this.e0 = new emr(this);
        this.f0 = false;
        this.g0 = true;
        this.i0 = new i8m(9, this);
        this.l0 = true;
        this.m0 = true;
        this.N = 1;
        this.j0 = amt0Var;
        this.k0 = z;
        int i = amt0Var.e;
        H(null);
        if (i != this.J) {
            mVar.b();
            i1();
            this.J = i;
            this.S = new BitSet(this.J);
            this.K = new n[this.J];
            for (int i2 = 0; i2 < this.J; i2++) {
                this.K[i2] = new n(this, i2);
            }
            i1();
        }
        this.P = new t();
        int i3 = this.N;
        this.L = d0.a(this, i3);
        this.M = d0.a(this, 1 - i3);
    }

    public static int b2(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.mhp0
    public final void A(boolean z) {
        this.m0 = z;
    }

    public final int A1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        boolean z = !this.g0;
        return a1.b(kVar, this.L, D1(z), C1(z), this, this.g0, this.R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int B1(r0 r0Var, t tVar, RecyclerView.k kVar) {
        n[] nVarArr;
        BitSet bitSet;
        boolean z;
        n nVar;
        int i;
        t tVar2;
        int i2;
        int i3;
        d0 d0Var;
        int J1;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean M1;
        d0 d0Var2;
        int i7;
        int i8;
        LayoutParams layoutParams;
        View view;
        boolean isFullSpan;
        t tVar3;
        int i9;
        BitSet bitSet2;
        int i10;
        int i11;
        int i12;
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = this;
        r0 r0Var2 = r0Var;
        BitSet bitSet3 = flexStaggeredGridLayoutManager.S;
        boolean z3 = false;
        int i13 = flexStaggeredGridLayoutManager.J;
        bitSet3.set(0, i13, true);
        t tVar4 = flexStaggeredGridLayoutManager.P;
        int i14 = tVar4.i ? tVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : tVar.e == 1 ? tVar.g + tVar.b : tVar.f - tVar.b;
        flexStaggeredGridLayoutManager.Y1(tVar.e, i14);
        boolean z4 = flexStaggeredGridLayoutManager.R;
        d0 d0Var3 = flexStaggeredGridLayoutManager.L;
        int g = z4 ? d0Var3.g() : d0Var3.k();
        Object[] objArr = false;
        while (tVar.a(kVar) && (tVar4.i || !bitSet3.isEmpty())) {
            View b = tVar.b(r0Var2);
            LayoutParams layoutParams2 = (LayoutParams) b.getLayoutParams();
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            m mVar = flexStaggeredGridLayoutManager.V;
            boolean z5 = z3;
            int[] iArr = mVar.a;
            int i15 = (iArr == null || viewLayoutPosition >= iArr.length) ? -1 : iArr[viewLayoutPosition];
            boolean z6 = i15 == -1 ? true : z5 ? 1 : 0;
            n[] nVarArr2 = flexStaggeredGridLayoutManager.K;
            if (z6) {
                if (layoutParams2.isFullSpan()) {
                    nVar = nVarArr2[z5 ? 1 : 0];
                    nVarArr = nVarArr2;
                    bitSet = bitSet3;
                    z = z6;
                } else {
                    if (flexStaggeredGridLayoutManager.P1(tVar.e)) {
                        nVarArr = nVarArr2;
                        i11 = i13 - 1;
                        i10 = -1;
                        i12 = -1;
                    } else {
                        nVarArr = nVarArr2;
                        i10 = i13;
                        i11 = z5 ? 1 : 0;
                        i12 = 1;
                    }
                    n nVar2 = null;
                    z = z6;
                    if (tVar.e == 1) {
                        int k = d0Var3.k();
                        bitSet = bitSet3;
                        int i16 = i11;
                        int i17 = Integer.MAX_VALUE;
                        while (i16 != i10) {
                            int i18 = i16;
                            n nVar3 = nVarArr[i18];
                            int h = nVar3.h(k);
                            if (h < i17) {
                                i17 = h;
                                nVar2 = nVar3;
                            }
                            i16 = i18 + i12;
                        }
                    } else {
                        bitSet = bitSet3;
                        int g2 = d0Var3.g();
                        int i19 = i11;
                        int i20 = Integer.MIN_VALUE;
                        while (i19 != i10) {
                            n nVar4 = nVarArr[i19];
                            int i21 = i10;
                            int j = nVar4.j(g2);
                            if (j > i20) {
                                i20 = j;
                                nVar2 = nVar4;
                            }
                            i19 += i12;
                            i10 = i21;
                        }
                    }
                    nVar = nVar2;
                }
                mVar.c(viewLayoutPosition);
                mVar.a[viewLayoutPosition] = nVar.e;
            } else {
                nVarArr = nVarArr2;
                bitSet = bitSet3;
                z = z6;
                nVar = nVarArr[i15];
            }
            layoutParams2.mSpan = nVar;
            if (tVar.e == 1) {
                flexStaggeredGridLayoutManager.F(b);
            } else {
                flexStaggeredGridLayoutManager.G(z5 ? 1 : 0, b, z5);
            }
            boolean isFullSpan2 = layoutParams2.isFullSpan();
            int i22 = flexStaggeredGridLayoutManager.N;
            if (!isFullSpan2) {
                i = i13;
                tVar2 = tVar4;
                i2 = i14;
                if (i22 == 1) {
                    flexStaggeredGridLayoutManager.N1(RecyclerView.e.e0(flexStaggeredGridLayoutManager.O, flexStaggeredGridLayoutManager.F, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false), RecyclerView.e.e0(flexStaggeredGridLayoutManager.I, flexStaggeredGridLayoutManager.G, flexStaggeredGridLayoutManager.getPaddingBottom() + flexStaggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), b);
                } else {
                    flexStaggeredGridLayoutManager.N1(RecyclerView.e.e0(flexStaggeredGridLayoutManager.H, flexStaggeredGridLayoutManager.F, flexStaggeredGridLayoutManager.getPaddingRight() + flexStaggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), RecyclerView.e.e0(flexStaggeredGridLayoutManager.O, flexStaggeredGridLayoutManager.G, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false), b);
                }
            } else if (i22 == 1) {
                i2 = i14;
                tVar2 = tVar4;
                i = i13;
                flexStaggeredGridLayoutManager.N1(flexStaggeredGridLayoutManager.c0, RecyclerView.e.e0(flexStaggeredGridLayoutManager.I, flexStaggeredGridLayoutManager.G, flexStaggeredGridLayoutManager.getPaddingBottom() + flexStaggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), b);
            } else {
                i = i13;
                tVar2 = tVar4;
                i2 = i14;
                flexStaggeredGridLayoutManager.N1(RecyclerView.e.e0(flexStaggeredGridLayoutManager.H, flexStaggeredGridLayoutManager.F, flexStaggeredGridLayoutManager.getPaddingRight() + flexStaggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), flexStaggeredGridLayoutManager.c0, b);
            }
            int c = d0Var3.c(b);
            boolean z7 = flexStaggeredGridLayoutManager.k0;
            if (z7 && c == 0) {
                int[] iArr2 = mVar.a;
                if (iArr2 != null && viewLayoutPosition < iArr2.length) {
                    iArr2[viewLayoutPosition] = -1;
                }
                List list = mVar.b;
                if (list != null) {
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        if (((FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) mVar.b.get(size)).mPosition == viewLayoutPosition) {
                            mVar.b.remove(size);
                            break;
                        }
                        size--;
                    }
                }
            }
            if (tVar.e == 1) {
                i4 = layoutParams2.isFullSpan() ? flexStaggeredGridLayoutManager.I1(g) : nVar.h(g);
                J1 = i4 + c;
                if ((!z7 || c > 0) && z && layoutParams2.isFullSpan()) {
                    FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    i3 = i;
                    d0Var = d0Var3;
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan = new int[i3];
                    int i23 = 0;
                    while (i23 < i3) {
                        int i24 = i23;
                        flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan[i24] = i4 - nVarArr[i24].h(i4);
                        i23 = i24 + 1;
                    }
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir = -1;
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition = viewLayoutPosition;
                    mVar.a(flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                } else {
                    i3 = i;
                    d0Var = d0Var3;
                }
            } else {
                i3 = i;
                d0Var = d0Var3;
                J1 = layoutParams2.isFullSpan() ? flexStaggeredGridLayoutManager.J1(g) : nVar.j(g);
                i4 = J1 - c;
                if ((!z7 || c > 0) && z && layoutParams2.isFullSpan()) {
                    FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = new FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapPerSpan = new int[i3];
                    int i25 = 0;
                    while (i25 < i3) {
                        flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapPerSpan[i25] = nVarArr[i25].j(J1) - J1;
                        i25++;
                        g = g;
                    }
                    i5 = g;
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mGapDir = 1;
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mPosition = viewLayoutPosition;
                    mVar.a(flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2);
                    int i26 = i4;
                    if ((!z7 && c <= 0) || !layoutParams2.isFullSpan() || tVar.d != -1) {
                        i6 = 1;
                    } else if (z) {
                        if (tVar.e != 1) {
                            int j2 = nVarArr[0].j(Integer.MIN_VALUE);
                            int i27 = 1;
                            while (true) {
                                if (i27 >= i3) {
                                    z2 = true;
                                    break;
                                }
                                if (nVarArr[i27].j(Integer.MIN_VALUE) != j2) {
                                    z2 = false;
                                    break;
                                }
                                i27++;
                            }
                        } else {
                            int h2 = nVarArr[0].h(Integer.MIN_VALUE);
                            int i28 = 1;
                            while (true) {
                                if (i28 >= i3) {
                                    z2 = true;
                                    break;
                                }
                                if (nVarArr[i28].h(Integer.MIN_VALUE) != h2) {
                                    z2 = false;
                                    break;
                                }
                                i28++;
                            }
                        }
                        i6 = 1;
                        if (!z2) {
                            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f = mVar.f(viewLayoutPosition);
                            if (f != null) {
                                f.mHasUnwantedGapAfter = true;
                            }
                            flexStaggeredGridLayoutManager.f0 = true;
                        }
                    } else {
                        i6 = 1;
                        flexStaggeredGridLayoutManager.f0 = true;
                    }
                    if (tVar.e != i6) {
                        if (layoutParams2.isFullSpan()) {
                            for (int i29 = i3 - 1; i29 >= 0; i29--) {
                                nVarArr[i29].a(b);
                            }
                        } else {
                            layoutParams2.mSpan.a(b);
                        }
                    } else if (layoutParams2.isFullSpan()) {
                        for (int i30 = i3 - 1; i30 >= 0; i30--) {
                            nVarArr[i30].m(b);
                        }
                    } else {
                        layoutParams2.mSpan.m(b);
                    }
                    M1 = flexStaggeredGridLayoutManager.M1();
                    d0Var2 = flexStaggeredGridLayoutManager.M;
                    if (M1 || i22 != 1) {
                        int k2 = !layoutParams2.isFullSpan() ? d0Var2.k() : d0Var2.k() + (nVar.e * flexStaggeredGridLayoutManager.O);
                        int c2 = d0Var2.c(b) + k2;
                        i7 = k2;
                        i8 = c2;
                    } else {
                        i8 = layoutParams2.isFullSpan() ? d0Var2.g() : d0Var2.g() - (((i3 - 1) - nVar.e) * flexStaggeredGridLayoutManager.O);
                        i7 = i8 - d0Var2.c(b);
                    }
                    if (i22 != 1) {
                        int i31 = i7;
                        view = b;
                        layoutParams = layoutParams2;
                        flexStaggeredGridLayoutManager.C0(i31, i26, i8, J1, view);
                        flexStaggeredGridLayoutManager = this;
                    } else {
                        layoutParams = layoutParams2;
                        int i32 = i8;
                        int i33 = i7;
                        view = b;
                        flexStaggeredGridLayoutManager.C0(i26, i33, J1, i32, view);
                    }
                    isFullSpan = layoutParams.isFullSpan();
                    tVar3 = tVar2;
                    int i34 = tVar3.e;
                    if (isFullSpan) {
                        i9 = i2;
                        flexStaggeredGridLayoutManager.a2(nVar, i34, i9);
                    } else {
                        i9 = i2;
                        flexStaggeredGridLayoutManager.Y1(i34, i9);
                    }
                    flexStaggeredGridLayoutManager.R1(r0Var, tVar3);
                    if (tVar3.h && view.hasFocusable()) {
                        if (layoutParams.isFullSpan()) {
                            bitSet2 = bitSet;
                            bitSet2.set(nVar.e, false);
                            tVar4 = tVar3;
                            r0Var2 = r0Var;
                            bitSet3 = bitSet2;
                            objArr = true;
                            i13 = i3;
                            d0Var3 = d0Var;
                            z3 = false;
                            i14 = i9;
                            g = i5;
                        } else {
                            bitSet.clear();
                        }
                    }
                    bitSet2 = bitSet;
                    tVar4 = tVar3;
                    r0Var2 = r0Var;
                    bitSet3 = bitSet2;
                    objArr = true;
                    i13 = i3;
                    d0Var3 = d0Var;
                    z3 = false;
                    i14 = i9;
                    g = i5;
                }
            }
            i5 = g;
            int i262 = i4;
            if (!z7) {
            }
            if (z) {
            }
            if (tVar.e != i6) {
            }
            M1 = flexStaggeredGridLayoutManager.M1();
            d0Var2 = flexStaggeredGridLayoutManager.M;
            if (M1) {
            }
            if (!layoutParams2.isFullSpan()) {
            }
            int c22 = d0Var2.c(b) + k2;
            i7 = k2;
            i8 = c22;
            if (i22 != 1) {
            }
            isFullSpan = layoutParams.isFullSpan();
            tVar3 = tVar2;
            int i342 = tVar3.e;
            if (isFullSpan) {
            }
            flexStaggeredGridLayoutManager.R1(r0Var, tVar3);
            if (tVar3.h) {
                if (layoutParams.isFullSpan()) {
                }
            }
            bitSet2 = bitSet;
            tVar4 = tVar3;
            r0Var2 = r0Var;
            bitSet3 = bitSet2;
            objArr = true;
            i13 = i3;
            d0Var3 = d0Var;
            z3 = false;
            i14 = i9;
            g = i5;
        }
        d0 d0Var4 = d0Var3;
        r0 r0Var3 = r0Var2;
        t tVar5 = tVar4;
        if (objArr == false) {
            flexStaggeredGridLayoutManager.R1(r0Var3, tVar5);
        }
        int k3 = tVar5.e == -1 ? d0Var4.k() - flexStaggeredGridLayoutManager.J1(d0Var4.k()) : flexStaggeredGridLayoutManager.I1(d0Var4.g()) - d0Var4.g();
        if (k3 > 0) {
            return Math.min(tVar.b, k3);
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
            n nVar = this.K[i2];
            int i3 = nVar.b;
            if (i3 != Integer.MIN_VALUE) {
                nVar.b = i3 + i;
            }
            int i4 = nVar.c;
            if (i4 != Integer.MIN_VALUE) {
                nVar.c = i4 + i;
            }
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
            n nVar = this.K[i2];
            int i3 = nVar.b;
            if (i3 != Integer.MIN_VALUE) {
                nVar.b = i3 + i;
            }
            int i4 = nVar.c;
            if (i4 != Integer.MIN_VALUE) {
                nVar.c = i4 + i;
            }
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
            this.K[i].d();
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
        return this.m0 && this.N == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.i0);
        }
        for (int i = 0; i < this.J; i++) {
            this.K[i].d();
        }
        recyclerView.requestLayout();
    }

    public final int I1(int i) {
        int h = this.K[0].h(i);
        for (int i2 = 1; i2 < this.J; i2++) {
            int h2 = this.K[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.l0 && this.N == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0037, code lost:
    
        if (r3 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x003b, code lost:
    
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0045, code lost:
    
        if (M1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004f, code lost:
    
        if (M1() == false) goto L26;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        View W;
        int i2;
        View i3;
        if (d0() == 0 || (W = W(view)) == null) {
            return null;
        }
        U1();
        int i4 = this.N;
        if (i == 1) {
            if (i4 != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (i4 != 1) {
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
        boolean isFullSpan = layoutParams.isFullSpan();
        n nVar = layoutParams.mSpan;
        int H1 = i2 == 1 ? H1() : G1();
        Z1(H1, kVar);
        X1(i2);
        t tVar = this.P;
        tVar.c = tVar.d + H1;
        tVar.b = (int) (this.L.l() * 0.33333334f);
        tVar.h = true;
        tVar.a = false;
        B1(r0Var, tVar, kVar);
        this.Z = this.R;
        if (!isFullSpan && (i3 = nVar.i(H1, i2)) != null && i3 != W) {
            return i3;
        }
        boolean P1 = P1(i2);
        n[] nVarArr = this.K;
        int i5 = this.J;
        if (P1) {
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                View i7 = nVarArr[i6].i(H1, i2);
                if (i7 != null && i7 != W) {
                    return i7;
                }
            }
        } else {
            for (int i8 = 0; i8 < i5; i8++) {
                View i9 = nVarArr[i8].i(H1, i2);
                if (i9 != null && i9 != W) {
                    return i9;
                }
            }
        }
        boolean z = (this.Q ^ true) == (i2 == -1);
        if (!isFullSpan) {
            View X = X(z ? nVar.e() : nVar.f());
            if (X != null && X != W) {
                return X;
            }
        }
        if (!P1(i2)) {
            for (int i10 = 0; i10 < i5; i10++) {
                View X2 = X(z ? nVarArr[i10].e() : nVarArr[i10].f());
                if (X2 != null && X2 != W) {
                    return X2;
                }
            }
            return null;
        }
        for (int i11 = i5 - 1; i11 >= 0; i11--) {
            if (i11 != nVar.e) {
                View X3 = X(z ? nVarArr[i11].e() : nVarArr[i11].f());
                if (X3 != null && X3 != W) {
                    return X3;
                }
            }
        }
        return null;
    }

    public final int J1(int i) {
        int j = this.K[0].j(i);
        for (int i2 = 1; i2 < this.J; i2++) {
            int j2 = this.K[i2].j(i);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i, int i2, int i3) {
        int i4;
        int i5;
        m mVar;
        int H1 = this.R ? H1() : G1();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                mVar = this.V;
                if (i < H1 || i3 != 4) {
                    mVar.g(i5);
                }
                if (i3 != 1) {
                    mVar.h(i, i2);
                } else if (i3 == 2) {
                    mVar.i(i, i2);
                } else if (i3 == 8) {
                    mVar.i(i, 1);
                    mVar.h(i2, 1);
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
        mVar = this.V;
        if (i < H1) {
        }
        mVar.g(i5);
        if (i3 != 1) {
        }
        if (i4 > H1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View L1() {
        int i;
        boolean isFullSpan;
        boolean z;
        int d0 = d0();
        int i2 = d0 - 1;
        int i3 = this.J;
        BitSet bitSet = new BitSet(i3);
        bitSet.set(0, i3, true);
        char c = (this.N == 1 && M1()) ? (char) 1 : (char) 65535;
        if (this.R) {
            d0 = -1;
        } else {
            i2 = 0;
        }
        int i4 = i2 < d0 ? 1 : -1;
        while (i2 != d0) {
            View c0 = c0(i2);
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            boolean z2 = bitSet.get(layoutParams.mSpan.e);
            d0 d0Var = this.L;
            if (z2) {
                n nVar = layoutParams.mSpan;
                if (this.R) {
                    int i5 = nVar.c;
                    if (i5 == Integer.MIN_VALUE) {
                        nVar.b();
                        i5 = nVar.c;
                    }
                    if (i5 < d0Var.g()) {
                        isFullSpan = ((LayoutParams) ((View) unr0.k(1, nVar.a)).getLayoutParams()).isFullSpan();
                        z = !isFullSpan;
                    }
                    z = false;
                } else {
                    int i6 = nVar.b;
                    if (i6 == Integer.MIN_VALUE) {
                        nVar.c();
                        i6 = nVar.b;
                    }
                    if (i6 > d0Var.k()) {
                        isFullSpan = ((LayoutParams) ((View) nVar.a.get(0)).getLayoutParams()).isFullSpan();
                        z = !isFullSpan;
                    }
                    z = false;
                }
                if (z) {
                    return c0;
                }
                bitSet.clear(layoutParams.mSpan.e);
            }
            if (!layoutParams.isFullSpan() && (i = i2 + i4) != d0) {
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
            i2 += i4;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void M(int i, int i2, RecyclerView.k kVar, o oVar) {
        t tVar;
        int h;
        if (this.N != 0) {
            i = i2;
        }
        if (d0() == 0 || i == 0) {
            return;
        }
        Q1(i, kVar);
        int[] iArr = this.h0;
        int i3 = this.J;
        if (iArr == null || iArr.length < i3) {
            this.h0 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            tVar = this.P;
            if (i4 >= i3) {
                break;
            }
            int i6 = tVar.d;
            n[] nVarArr = this.K;
            if (i6 == -1) {
                int i7 = tVar.f;
                h = i7 - nVarArr[i4].j(i7);
            } else {
                h = nVarArr[i4].h(tVar.g) - tVar.g;
            }
            if (h >= 0) {
                this.h0[i5] = h;
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
        int i = this.N;
        int i2 = this.J;
        if (i == 0) {
            whVar.s(uh.a(layoutParams2.getSpanIndex(), layoutParams2.isFullSpan() ? i2 : 1, -1, -1, false, false));
        } else {
            whVar.s(uh.a(-1, -1, layoutParams2.getSpanIndex(), layoutParams2.isFullSpan() ? i2 : 1, false, false));
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

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0184, code lost:
    
        if ((r7 < G1()) != r16.R) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0176, code lost:
    
        if (r16.R != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0186, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(r0 r0Var, RecyclerView.k kVar, boolean z) {
        boolean z2;
        boolean z3;
        SavedState savedState;
        int i;
        int i2;
        int i3;
        boolean z4;
        SavedState savedState2 = this.b0;
        emr emrVar = this.e0;
        if (!(savedState2 == null && this.T == -1) && kVar.b() == 0) {
            c1(r0Var);
            emrVar.c();
            return;
        }
        boolean z5 = emrVar.f;
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = (FlexStaggeredGridLayoutManager) emrVar.h;
        boolean z6 = (z5 && this.T == -1 && this.b0 == null) ? false : true;
        n[] nVarArr = this.K;
        int i4 = this.J;
        m mVar = this.V;
        if (z6) {
            emrVar.c();
            SavedState savedState3 = this.b0;
            d0 d0Var = this.L;
            if (savedState3 != null) {
                int i5 = savedState3.mSpanOffsetsSize;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            nVarArr[i6].d();
                            SavedState savedState4 = this.b0;
                            int i7 = savedState4.mSpanOffsets[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += savedState4.mAnchorLayoutFromEnd ? d0Var.g() : d0Var.k();
                            }
                            n nVar = nVarArr[i6];
                            nVar.b = i7;
                            nVar.c = i7;
                        }
                    } else {
                        savedState3.invalidateSpanInfo();
                        SavedState savedState5 = this.b0;
                        savedState5.mAnchorPosition = savedState5.mVisibleAnchorPosition;
                    }
                }
                SavedState savedState6 = this.b0;
                this.a0 = savedState6.mLastLayoutRTL;
                boolean z7 = savedState6.mReverseLayout;
                H(null);
                SavedState savedState7 = this.b0;
                if (savedState7 != null && savedState7.mReverseLayout != z7) {
                    savedState7.mReverseLayout = z7;
                }
                this.Q = z7;
                i1();
                U1();
                SavedState savedState8 = this.b0;
                int i8 = savedState8.mAnchorPosition;
                if (i8 != -1) {
                    this.T = i8;
                    emrVar.d = savedState8.mAnchorLayoutFromEnd;
                } else {
                    emrVar.d = this.R;
                }
                if (savedState8.mSpanLookupSize > 1) {
                    mVar.a = savedState8.mSpanLookup;
                    mVar.b = savedState8.mFullSpanItems;
                }
            } else {
                U1();
                emrVar.d = this.R;
            }
            if (!kVar.g && (i3 = this.T) != -1) {
                if (i3 < 0 || i3 >= kVar.b()) {
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
                            int i9 = this.T;
                            emrVar.b = i9;
                            int i10 = this.U;
                            if (i10 == Integer.MIN_VALUE) {
                                if (d0() == 0) {
                                }
                                emrVar.d = z4;
                                d0 d0Var2 = flexStaggeredGridLayoutManager.L;
                                emrVar.c = z4 ? d0Var2.g() : d0Var2.k();
                            } else {
                                boolean z8 = emrVar.d;
                                d0 d0Var3 = flexStaggeredGridLayoutManager.L;
                                if (z8) {
                                    emrVar.c = d0Var3.g() - i10;
                                } else {
                                    emrVar.c = d0Var3.k() + i10;
                                }
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
                int d0 = d0() - 1;
                while (true) {
                    if (d0 < 0) {
                        i2 = 0;
                        break;
                    }
                    i2 = RecyclerView.e.r0(c0(d0));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    } else {
                        d0--;
                    }
                }
            } else {
                int b2 = kVar.b();
                int d02 = d0();
                int i11 = 0;
                while (true) {
                    if (i11 >= d02) {
                        i = 0;
                        break;
                    }
                    i = RecyclerView.e.r0(c0(i11));
                    if (i >= 0 && i < b2) {
                        break;
                    } else {
                        i11++;
                    }
                }
                i2 = i;
            }
            emrVar.b = i2;
            emrVar.c = Integer.MIN_VALUE;
            emrVar.f = true;
        }
        if (this.b0 == null && this.T == -1 && (emrVar.d != this.Z || M1() != this.a0)) {
            mVar.b();
            emrVar.e = true;
        }
        if (d0() > 0 && ((savedState = this.b0) == null || savedState.mSpanOffsetsSize < 1)) {
            if (emrVar.e) {
                for (int i12 = 0; i12 < i4; i12++) {
                    nVarArr[i12].d();
                    int i13 = emrVar.c;
                    if (i13 != Integer.MIN_VALUE) {
                        n nVar2 = nVarArr[i12];
                        nVar2.b = i13;
                        nVar2.c = i13;
                    }
                }
            } else if (z6 || emrVar.g == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    n nVar3 = nVarArr[i14];
                    boolean z9 = this.R;
                    int i15 = emrVar.c;
                    FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager2 = nVar3.f;
                    int h = z9 ? nVar3.h(Integer.MIN_VALUE) : nVar3.j(Integer.MIN_VALUE);
                    nVar3.d();
                    if (h != Integer.MIN_VALUE && ((!z9 || h >= flexStaggeredGridLayoutManager2.L.g()) && (z9 || h <= flexStaggeredGridLayoutManager2.L.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            h += i15;
                        }
                        nVar3.c = h;
                        nVar3.b = h;
                    }
                }
                int length = nVarArr.length;
                int[] iArr = emrVar.g;
                if (iArr == null || iArr.length < length) {
                    emrVar.g = new int[flexStaggeredGridLayoutManager.K.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    emrVar.g[i16] = nVarArr[i16].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    n nVar4 = nVarArr[i17];
                    nVar4.d();
                    int i18 = emrVar.g[i17];
                    nVar4.b = i18;
                    nVar4.c = i18;
                }
            }
        }
        U(r0Var);
        t tVar = this.P;
        tVar.a = false;
        this.f0 = false;
        d0 d0Var4 = this.M;
        int l = d0Var4.l();
        this.O = l / i4;
        this.c0 = View.MeasureSpec.makeMeasureSpec(l, d0Var4.i());
        Z1(emrVar.b, kVar);
        if (emrVar.d) {
            X1(-1);
            B1(r0Var, tVar, kVar);
            X1(1);
            tVar.c = emrVar.b + tVar.d;
            B1(r0Var, tVar, kVar);
        } else {
            X1(1);
            B1(r0Var, tVar, kVar);
            X1(-1);
            tVar.c = emrVar.b + tVar.d;
            B1(r0Var, tVar, kVar);
        }
        if (d0Var4.i() != 1073741824) {
            int d03 = d0();
            float f = 0.0f;
            for (int i19 = 0; i19 < d03; i19++) {
                View c0 = c0(i19);
                float c = d0Var4.c(c0);
                if (c >= f) {
                    if (((LayoutParams) c0.getLayoutParams()).isFullSpan()) {
                        c = (c * 1.0f) / i4;
                    }
                    f = Math.max(f, c);
                }
            }
            int i20 = this.O;
            int round = Math.round(f * i4);
            if (d0Var4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, d0Var4.l());
            }
            this.O = round / i4;
            this.c0 = View.MeasureSpec.makeMeasureSpec(round, d0Var4.i());
            if (this.O != i20) {
                for (int i21 = 0; i21 < d03; i21++) {
                    View c02 = c0(i21);
                    LayoutParams layoutParams = (LayoutParams) c02.getLayoutParams();
                    if (!layoutParams.isFullSpan()) {
                        boolean M1 = M1();
                        int i22 = this.N;
                        if (M1 && i22 == 1) {
                            int i23 = -((i4 - 1) - layoutParams.mSpan.e);
                            c02.offsetLeftAndRight((this.O * i23) - (i23 * i20));
                        } else {
                            int i24 = layoutParams.mSpan.e;
                            int i25 = this.O * i24;
                            int i26 = i24 * i20;
                            if (i22 == 1) {
                                c02.offsetLeftAndRight(i25 - i26);
                            } else {
                                c02.offsetTopAndBottom(i25 - i26);
                            }
                        }
                    }
                }
            }
        }
        if (d0() <= 0) {
            z2 = true;
        } else if (this.R) {
            z2 = true;
            E1(r0Var, kVar, true);
            F1(r0Var, kVar, false);
        } else {
            z2 = true;
            F1(r0Var, kVar, true);
            E1(r0Var, kVar, false);
        }
        if (z && !kVar.g && this.W != 0 && d0() > 0 && (this.f0 || L1() != null)) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.i0);
            }
            if (z1()) {
                z3 = z2;
                if (kVar.g) {
                    emrVar.c();
                }
                this.Z = emrVar.d;
                this.a0 = M1();
                if (z3) {
                    return;
                }
                emrVar.c();
                O1(r0Var, kVar, false);
                return;
            }
        }
        z3 = false;
        if (kVar.g) {
        }
        this.Z = emrVar.d;
        this.a0 = M1();
        if (z3) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P1(int i) {
        if (this.N == 0) {
            return (i == -1) != this.R;
        }
        if (((i == -1) == this.R) == M1()) {
        }
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
        X1(i2);
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
        int i3 = this.J;
        n[] nVarArr = this.K;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = tVar.f;
            int j = nVarArr[0].j(i5);
            while (i4 < i3) {
                int j2 = nVarArr[i4].j(i5);
                if (j2 > j) {
                    j = j2;
                }
                i4++;
            }
            int i6 = i5 - j;
            int i7 = tVar.g;
            if (i6 >= 0) {
                i7 -= Math.min(i6, tVar.b);
            }
            S1(r0Var, i7);
            return;
        }
        int i8 = tVar.g;
        int h = nVarArr[0].h(i8);
        while (i4 < i3) {
            int h2 = nVarArr[i4].h(i8);
            if (h2 < h) {
                h = h2;
            }
            i4++;
        }
        int i9 = h - tVar.g;
        int i10 = tVar.f;
        if (i9 >= 0) {
            i10 += Math.min(i9, tVar.b);
        }
        T1(r0Var, i10);
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
            if (layoutParams.isFullSpan()) {
                int i2 = 0;
                while (true) {
                    n[] nVarArr = this.K;
                    int i3 = this.J;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            nVarArr[i4].k();
                        }
                    } else if (nVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (layoutParams.mSpan.a.size() == 1) {
                return;
            } else {
                layoutParams.mSpan.k();
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
        if (obj instanceof tjd) {
            return;
        }
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
            if (layoutParams.isFullSpan()) {
                int i2 = 0;
                while (true) {
                    n[] nVarArr = this.K;
                    int i3 = this.J;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            nVarArr[i4].l();
                        }
                    } else if (nVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (layoutParams.mSpan.a.size() == 1) {
                return;
            } else {
                layoutParams.mSpan.l();
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
    public final void V0(RecyclerView.k kVar) {
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

    public final void W1() {
        H(null);
        if (this.W == 0) {
            return;
        }
        this.W = 0;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        int j;
        int k;
        int[] iArr;
        if (this.b0 != null) {
            return new SavedState(this.b0);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.Q;
        savedState.mAnchorLayoutFromEnd = this.Z;
        savedState.mLastLayoutRTL = this.a0;
        m mVar = this.V;
        if (mVar == null || (iArr = mVar.a) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = mVar.b;
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
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.Z;
            d0 d0Var = this.L;
            n[] nVarArr = this.K;
            if (z) {
                j = nVarArr[i2].h(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = d0Var.g();
                    j -= k;
                    savedState.mSpanOffsets[i2] = j;
                } else {
                    savedState.mSpanOffsets[i2] = j;
                }
            } else {
                j = nVarArr[i2].j(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = d0Var.k();
                    j -= k;
                    savedState.mSpanOffsets[i2] = j;
                } else {
                    savedState.mSpanOffsets[i2] = j;
                }
            }
        }
        return savedState;
    }

    public final void X1(int i) {
        t tVar = this.P;
        tVar.e = i;
        tVar.d = this.R != (i == -1) ? -1 : 1;
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

    @Override // defpackage.gki0
    public final int a() {
        return G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void a2(n nVar, int i, int i2) {
        int i3 = nVar.d;
        int i4 = nVar.e;
        BitSet bitSet = this.S;
        if (i == -1) {
            int i5 = nVar.b;
            if (i5 == Integer.MIN_VALUE) {
                nVar.c();
                i5 = nVar.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = nVar.c;
        if (i6 == Integer.MIN_VALUE) {
            nVar.b();
            i6 = nVar.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.gki0
    public final int b() {
        return H1();
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

    @Override // defpackage.j1u
    public final int l(int i) {
        int[] iArr = this.V.a;
        int i2 = (iArr == null || i >= iArr.length) ? -1 : iArr[i];
        if (i2 == -1) {
            return 0;
        }
        return i2;
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

    @Override // defpackage.ylt0
    public final int o(int i) {
        return this.j0.c(i);
    }

    @Override // defpackage.gki0
    public final void r(int i, int i2) {
        SavedState savedState = this.b0;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.T = i;
        this.U = i2;
        i1();
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

    @Override // defpackage.j1u
    public final int u(int i) {
        amt0 amt0Var = this.j0;
        int c = amt0Var.c(i);
        int i2 = amt0Var.e;
        if (c == i2) {
            return i;
        }
        int[] iArr = this.V.a;
        int i3 = (iArr == null || i >= iArr.length) ? -1 : iArr[i];
        int i4 = i - i3;
        return (i3 == -1 || amt0Var.c(i4 + (-1)) != i2) ? i * 2 : i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int u0(r0 r0Var, RecyclerView.k kVar) {
        if (this.N == 0) {
            return Math.min(this.J, kVar.b());
        }
        return -1;
    }

    @Override // defpackage.mhp0
    public final void w(boolean z) {
        this.l0 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: x0 */
    public final boolean getK() {
        return this.A || this.W != 0;
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

    @Override // defpackage.ylt0
    /* renamed from: z */
    public final int getB0() {
        return this.J;
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
            m mVar = this.V;
            if (G1 == 0 && L1() != null) {
                mVar.b();
                this.y = true;
                i1();
                return true;
            }
            if (this.f0) {
                int i = this.R ? -1 : 1;
                int i2 = H1 + 1;
                FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e = mVar.e(G1, i2, i);
                if (e == null) {
                    this.f0 = false;
                    mVar.d(i2);
                    return false;
                }
                FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e2 = mVar.e(G1, e.mPosition, i * (-1));
                if (e2 == null) {
                    mVar.d(e.mPosition);
                } else {
                    mVar.d(e2.mPosition + 1);
                }
                this.y = true;
                i1();
                return true;
            }
        }
        return false;
    }

    public class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        private boolean mLastFullSpan;
        n mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mLastFullSpan = false;
        }

        public final int getSpanIndex() {
            n nVar = this.mSpan;
            if (nVar == null) {
                return -1;
            }
            return nVar.e;
        }

        public boolean isFullSpan() {
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition != -1) {
                amt0 amt0Var = FlexStaggeredGridLayoutManager.this.j0;
                this.mLastFullSpan = amt0Var.c(bindingAdapterPosition) == amt0Var.e;
            }
            return this.mLastFullSpan;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mLastFullSpan = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mLastFullSpan = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mLastFullSpan = false;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mLastFullSpan = false;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.FlexStaggeredGridLayoutManager.SavedState.1
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
        List<FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> mFullSpanItems;
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
            this.mFullSpanItems = parcel.readArrayList(FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
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

    public FlexStaggeredGridLayoutManager(amt0 amt0Var) {
        this(amt0Var, false);
    }
}
