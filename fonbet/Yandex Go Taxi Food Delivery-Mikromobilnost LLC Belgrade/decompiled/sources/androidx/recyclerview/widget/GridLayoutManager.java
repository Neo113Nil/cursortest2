package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b64;
import defpackage.ejy;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ph;
import defpackage.uh;
import defpackage.w511;
import defpackage.wh;
import defpackage.wya1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set m0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean b0;
    public int c0;
    public int[] d0;
    public View[] e0;
    public final SparseIntArray f0;
    public final SparseIntArray g0;
    public b h0;
    public final Rect i0;
    public int j0;
    public int k0;
    public int l0;

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int b(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int c(int i) {
            return 1;
        }
    }

    public static abstract class b {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;

        public final int a(int i, int i2) {
            int c = c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int c2 = c(i5);
                i3 += c2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = c2;
                }
            }
            return i3 + c > i2 ? i4 + 1 : i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:18:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0051 -> B:18:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:18:0x0054). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int b(int i, int i2) {
            int i3;
            int i4;
            int c = c(i);
            if (c != i2) {
                if (this.c) {
                    SparseIntArray sparseIntArray = this.a;
                    int size = sparseIntArray.size() - 1;
                    int i5 = 0;
                    while (i5 <= size) {
                        int i6 = (i5 + size) >>> 1;
                        if (sparseIntArray.keyAt(i6) < i) {
                            i5 = i6 + 1;
                        } else {
                            size = i6 - 1;
                        }
                    }
                    int i7 = i5 - 1;
                    i3 = (i7 < 0 || i7 >= sparseIntArray.size()) ? -1 : sparseIntArray.keyAt(i7);
                    if (i3 >= 0) {
                        i4 = c(i3) + sparseIntArray.get(i3);
                        i3++;
                        if (i3 >= i) {
                            int c2 = c(i3);
                            i4 += c2;
                            if (i4 == i2) {
                                i4 = 0;
                            } else if (i4 > i2) {
                                i4 = c2;
                            }
                            i3++;
                            if (i3 >= i) {
                                if (c + i4 <= i2) {
                                    return i4;
                                }
                            }
                        }
                    }
                }
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                }
            }
            return 0;
        }

        public abstract int c(int i);

        public final void d() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b0 = false;
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new SparseIntArray();
        this.h0 = new a();
        this.i0 = new Rect();
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        s2(RecyclerView.e.s0(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1(RecyclerView.k kVar, v vVar, o oVar) {
        int i;
        int i2 = this.c0;
        for (int i3 = 0; i3 < this.c0 && (i = vVar.d) >= 0 && i < kVar.b() && i2 > 0; i3++) {
            int i4 = vVar.d;
            oVar.a(i4, Math.max(0, vVar.g));
            i2 -= this.h0.c(i4);
            vVar.d += vVar.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:
    
        if (r13 == (r2 > r8)) goto L72;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        int d0;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        r0 r0Var2 = r0Var;
        RecyclerView.k kVar2 = kVar;
        View W = W(view);
        if (W != null) {
            LayoutParams layoutParams = (LayoutParams) W.getLayoutParams();
            int i6 = layoutParams.mSpanIndex;
            int i7 = layoutParams.mSpanSize + i6;
            if (super.J0(view, i, r0Var, kVar) != null) {
                if ((E1(i) == 1) != this.O) {
                    i3 = d0() - 1;
                    d0 = -1;
                    i2 = -1;
                } else {
                    d0 = d0();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.J == 1 && U1();
                int o2 = o2(i3, r0Var2, kVar2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == d0) {
                        break;
                    }
                    int o22 = o2(i11, r0Var2, kVar2);
                    View c0 = c0(i11);
                    if (c0 == W) {
                        break;
                    }
                    if (!c0.hasFocusable() || o22 == o2) {
                        LayoutParams layoutParams2 = (LayoutParams) c0.getLayoutParams();
                        int i13 = layoutParams2.mSpanIndex;
                        view3 = W;
                        int i14 = layoutParams2.mSpanSize + i13;
                        if (c0.hasFocusable() && i13 == i6 && i14 == i7) {
                            return c0;
                        }
                        if (!(c0.hasFocusable() && view4 == null) && (c0.hasFocusable() || view2 != null)) {
                            i4 = d0;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (c0.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!(this.c.i(c0) && this.w.i(c0))) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = d0;
                        }
                        boolean hasFocusable = c0.hasFocusable();
                        int i15 = layoutParams2.mSpanIndex;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = c0;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = c0;
                        }
                        i11 += i2;
                        r0Var2 = r0Var;
                        kVar2 = kVar;
                        W = view3;
                        d0 = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = W;
                        i5 = i10;
                        i4 = d0;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    r0Var2 = r0Var;
                    kVar2 = kVar;
                    W = view3;
                    d0 = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean K(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void L0(r0 r0Var, RecyclerView.k kVar, wh whVar) {
        super.L0(r0Var, kVar, whVar);
        whVar.p(GridView.class.getName());
        RecyclerView.Adapter adapter = this.b.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        whVar.b(ph.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void N0(r0 r0Var, RecyclerView.k kVar, View view, wh whVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            M0(view, whVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int o2 = o2(layoutParams2.getViewLayoutPosition(), r0Var, kVar);
        if (this.J == 0) {
            whVar.s(uh.a(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), o2, 1, false, false));
        } else {
            whVar.s(uh.a(o2, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        this.h0.d();
        this.h0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int P(RecyclerView.k kVar) {
        return C1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        this.h0.d();
        this.h0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P1(r0 r0Var, RecyclerView.k kVar, boolean z, boolean z2) {
        int i;
        int i2;
        int d0 = d0();
        int i3 = 1;
        if (z2) {
            i2 = d0() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = d0;
            i2 = 0;
        }
        int b2 = kVar.b();
        F1();
        int k = this.L.k();
        int g = this.L.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View c0 = c0(i2);
            int r0 = RecyclerView.e.r0(c0);
            if (r0 >= 0 && r0 < b2 && p2(r0, r0Var, kVar) == 0) {
                if (((RecyclerView.LayoutParams) c0.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = c0;
                    }
                } else {
                    if (this.L.e(c0) < g && this.L.b(c0) >= k) {
                        return c0;
                    }
                    if (view == null) {
                        view = c0;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int Q(RecyclerView.k kVar) {
        return D1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        this.h0.d();
        this.h0.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        this.h0.d();
        this.h0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        return C1(kVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        return D1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.h0.d();
        this.h0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public void U0(r0 r0Var, RecyclerView.k kVar) {
        boolean z = kVar.g;
        SparseIntArray sparseIntArray = this.g0;
        SparseIntArray sparseIntArray2 = this.f0;
        if (z) {
            int d0 = d0();
            for (int i = 0; i < d0; i++) {
                LayoutParams layoutParams = (LayoutParams) c0(i).getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                sparseIntArray2.put(viewLayoutPosition, layoutParams.getSpanSize());
                sparseIntArray.put(viewLayoutPosition, layoutParams.getSpanIndex());
            }
        }
        super.U0(r0Var, kVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public void V0(RecyclerView.k kVar) {
        View X;
        super.V0(kVar);
        this.b0 = false;
        int i = this.j0;
        if (i == -1 || (X = X(i)) == null) {
            return;
        }
        X.sendAccessibilityEvent(SelfTester_JCP.DECRYPT_CBC);
        this.j0 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1(r0 r0Var, RecyclerView.k kVar, v vVar, ejy ejyVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int e0;
        int i7;
        boolean z;
        int i8;
        View b2;
        GridLayoutManager gridLayoutManager = this;
        int j = gridLayoutManager.L.j();
        boolean z2 = j != 1073741824;
        int i9 = gridLayoutManager.d0() > 0 ? gridLayoutManager.d0[gridLayoutManager.c0] : 0;
        if (z2) {
            gridLayoutManager.t2();
        }
        boolean z3 = vVar.e == 1;
        int i10 = gridLayoutManager.c0;
        if (!z3) {
            i10 = gridLayoutManager.p2(vVar.d, r0Var, kVar) + gridLayoutManager.q2(vVar.d, r0Var, kVar);
        }
        int i11 = 0;
        while (i11 < gridLayoutManager.c0 && (i8 = vVar.d) >= 0 && i8 < kVar.b() && i10 > 0) {
            int i12 = vVar.d;
            int q2 = gridLayoutManager.q2(i12, r0Var, kVar);
            if (q2 > gridLayoutManager.c0) {
                ny61.g(oyr.m(gridLayoutManager.c0, " spans.", b64.s(i12, q2, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            i10 -= q2;
            if (i10 < 0 || (b2 = vVar.b(r0Var)) == null) {
                break;
            }
            gridLayoutManager.e0[i11] = b2;
            i11++;
        }
        if (z3) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = gridLayoutManager.e0[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int q22 = gridLayoutManager.q2(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), r0Var, kVar);
            layoutParams.mSpanSize = q22;
            layoutParams.mSpanIndex = i13;
            i13 += q22;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = gridLayoutManager.e0[i15];
            if (vVar.k != null) {
                z = false;
                if (z3) {
                    gridLayoutManager.G(-1, view2, true);
                } else {
                    gridLayoutManager.G(0, view2, true);
                }
            } else if (z3) {
                gridLayoutManager.F(view2);
                z = false;
            } else {
                z = false;
                gridLayoutManager.G(0, view2, false);
            }
            gridLayoutManager.m(view2, gridLayoutManager.i0);
            gridLayoutManager.r2(j, view2, z);
            int c = gridLayoutManager.L.c(view2);
            if (c > i14) {
                i14 = c;
            }
            float d = (gridLayoutManager.L.d(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).mSpanSize;
            if (d > f) {
                f = d;
            }
        }
        if (z2) {
            gridLayoutManager.h2(Math.max(Math.round(f * gridLayoutManager.c0), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = gridLayoutManager.e0[i16];
                gridLayoutManager.r2(1073741824, view3, true);
                int c2 = gridLayoutManager.L.c(view3);
                if (c2 > i14) {
                    i14 = c2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = gridLayoutManager.e0[i17];
            if (gridLayoutManager.L.c(view4) != i14) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.mDecorInsets;
                int i18 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i19 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int n2 = gridLayoutManager.n2(layoutParams2.mSpanIndex, layoutParams2.mSpanSize);
                if (gridLayoutManager.J == 1) {
                    i7 = RecyclerView.e.e0(n2, 1073741824, i19, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    e0 = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    e0 = RecyclerView.e.e0(n2, 1073741824, i18, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    i7 = makeMeasureSpec;
                }
                if (gridLayoutManager.w1(view4, i7, e0, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i7, e0);
                }
            }
        }
        int i20 = 0;
        ejyVar.a = i14;
        int i21 = gridLayoutManager.J;
        int i22 = vVar.f;
        int i23 = vVar.b;
        if (i21 != 1) {
            if (i22 == -1) {
                i5 = i23 - i14;
                i4 = i23;
            } else {
                i4 = i23 + i14;
                i5 = i23;
            }
            i6 = 0;
            i23 = 0;
        } else if (i22 == -1) {
            i6 = i23 - i14;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = i23;
            i4 = 0;
            i23 += i14;
            i5 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.e0;
            if (i20 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i20];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (gridLayoutManager.J != 1) {
                i6 = gridLayoutManager.getPaddingTop() + gridLayoutManager.d0[layoutParams3.mSpanIndex];
                i23 = gridLayoutManager.L.d(view5) + i6;
            } else if (gridLayoutManager.U1()) {
                i4 = gridLayoutManager.d0[gridLayoutManager.c0 - layoutParams3.mSpanIndex] + gridLayoutManager.getPaddingLeft();
                i5 = i4 - gridLayoutManager.L.d(view5);
            } else {
                i5 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.d0[layoutParams3.mSpanIndex];
                i4 = gridLayoutManager.L.d(view5) + i5;
            }
            int i24 = i6;
            int i25 = i4;
            int i26 = i23;
            gridLayoutManager.C0(i5, i24, i25, i26, view5);
            i6 = i24;
            i4 = i25;
            i23 = i26;
            if (layoutParams3.isItemRemoved() || layoutParams3.isItemChanged()) {
                ejyVar.c = true;
            }
            ejyVar.d |= view5.hasFocusable();
            i20++;
            gridLayoutManager = this;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W1(r0 r0Var, RecyclerView.k kVar, u uVar, int i) {
        t2();
        if (kVar.b() > 0 && !kVar.g) {
            boolean z = i == 1;
            int p2 = p2(uVar.b, r0Var, kVar);
            if (z) {
                while (p2 > 0) {
                    int i2 = uVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    uVar.b = i3;
                    p2 = p2(i3, r0Var, kVar);
                }
            } else {
                int b2 = kVar.b() - 1;
                int i4 = uVar.b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int p22 = p2(i5, r0Var, kVar);
                    if (p22 <= p2) {
                        break;
                    }
                    i4 = i5;
                    p2 = p22;
                }
                uVar.b = i4;
            }
        }
        i2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return this.J == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Z(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z0(int i, Bundle bundle) {
        View view;
        x0 childViewHolder;
        int i2;
        int i3;
        if (i == ph.v.a() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= d0()) {
                    view = null;
                    break;
                }
                View c0 = c0(i4);
                Objects.requireNonNull(c0);
                if (wya1.b(c0)) {
                    view = c0(i4);
                    break;
                }
                i4++;
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (m0.contains(Integer.valueOf(i5)) && (childViewHolder = this.b.getChildViewHolder(view)) != null) {
                    int E = childViewHolder.E();
                    int k2 = k2(E);
                    int j2 = j2(E);
                    if (k2 >= 0 && j2 >= 0) {
                        if (!l2(E).contains(Integer.valueOf(this.k0)) || !m2(j2(E), E).contains(Integer.valueOf(this.l0))) {
                            this.k0 = k2;
                            this.l0 = j2;
                        }
                        int i6 = this.k0;
                        if (i6 == -1) {
                            i6 = k2;
                        }
                        int i7 = this.l0;
                        if (i7 != -1) {
                            j2 = i7;
                        }
                        if (i5 == 17) {
                            i2 = E - 1;
                            while (i2 >= 0) {
                                int k22 = k2(i2);
                                int j22 = j2(i2);
                                if (k22 < 0 || j22 < 0) {
                                    break;
                                }
                                if (this.J != 1) {
                                    if (l2(i2).contains(Integer.valueOf(i6)) && j22 < j2) {
                                        this.l0 = j22;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if ((k22 == i6 && j22 < j2) || k22 < i6) {
                                        this.k0 = k22;
                                        this.l0 = j22;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 33) {
                            i2 = E - 1;
                            while (i2 >= 0) {
                                int k23 = k2(i2);
                                int j23 = j2(i2);
                                if (k23 < 0 || j23 < 0) {
                                    break;
                                }
                                if (this.J == 1) {
                                    if (k23 < i6 && m2(j2(i2), i2).contains(Integer.valueOf(j2))) {
                                        this.k0 = k23;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (k23 < i6 && j23 == j2) {
                                        this.k0 = ((Integer) Collections.max(l2(i2))).intValue();
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 66) {
                            i2 = E + 1;
                            while (i2 < getItemCount()) {
                                int k24 = k2(i2);
                                int j24 = j2(i2);
                                if (k24 < 0 || j24 < 0) {
                                    break;
                                }
                                if (this.J != 1) {
                                    if (j24 > j2 && l2(i2).contains(Integer.valueOf(i6))) {
                                        this.l0 = j24;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if ((k24 == i6 && j24 > j2) || k24 > i6) {
                                        this.k0 = k24;
                                        this.l0 = j24;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 130) {
                            i2 = E + 1;
                            while (i2 < getItemCount()) {
                                int k25 = k2(i2);
                                int j25 = j2(i2);
                                if (k25 < 0 || j25 < 0) {
                                    break;
                                }
                                if (this.J == 1) {
                                    if (k25 > i6 && (j25 == j2 || m2(j2(i2), i2).contains(Integer.valueOf(j2)))) {
                                        this.k0 = k25;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if (k25 > i6 && j25 == j2) {
                                        this.k0 = k2(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1 && (i3 = this.J) == 0) {
                                if (i5 != 17) {
                                    if (k2 >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= getItemCount()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < k2) {
                                                        i2 = ((Integer) treeMap.get(num)).intValue();
                                                        this.k0 = intValue;
                                                        this.l0 = j2(i2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = l2(i8).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                } else if (i5 == 66) {
                                    if (k2 >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= getItemCount()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > k2) {
                                                        i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.k0 = intValue2;
                                                        this.l0 = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = l2(i9).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            }
                            if (i2 != -1) {
                                l1(i2);
                                this.j0 = i2;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.Z0(i, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int itemCount = this.b.mAdapter.getItemCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= itemCount) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int p2 = p2(i12, recyclerView.mRecycler, recyclerView.mState);
                    RecyclerView recyclerView2 = this.b;
                    int o2 = o2(i12, recyclerView2.mRecycler, recyclerView2.mState);
                    if (this.J == 1) {
                        if (p2 == i11 && o2 == i10) {
                            break;
                        }
                        i12++;
                    } else {
                        if (p2 == i10 && o2 == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    r(i12, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d2(boolean z) {
        if (z) {
            w511.x("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.d2(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g0(r0 r0Var, RecyclerView.k kVar) {
        if (this.J == 1) {
            return Math.min(this.c0, getItemCount());
        }
        if (kVar.b() < 1) {
            return 0;
        }
        return o2(kVar.b() - 1, r0Var, kVar) + 1;
    }

    public final void h2(int i) {
        int i2;
        int[] iArr = this.d0;
        int i3 = this.c0;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.d0 = iArr;
    }

    public final void i2() {
        View[] viewArr = this.e0;
        if (viewArr == null || viewArr.length != this.c0) {
            this.e0 = new View[this.c0];
        }
    }

    public final int j2(int i) {
        int i2 = this.J;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? o2(i, recyclerView.mRecycler, recyclerView.mState) : p2(i, recyclerView.mRecycler, recyclerView.mState);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        t2();
        i2();
        return super.k1(i, r0Var, kVar);
    }

    public final int k2(int i) {
        int i2 = this.J;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? o2(i, recyclerView.mRecycler, recyclerView.mState) : p2(i, recyclerView.mRecycler, recyclerView.mState);
    }

    public final HashSet l2(int i) {
        return m2(k2(i), i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        t2();
        i2();
        return super.m1(i, r0Var, kVar);
    }

    public final HashSet m2(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int q2 = q2(i2, recyclerView.mRecycler, recyclerView.mState);
        for (int i3 = i; i3 < i + q2; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int n2(int i, int i2) {
        if (this.J != 1 || !U1()) {
            int[] iArr = this.d0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.d0;
        int i3 = this.c0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int o2(int i, r0 r0Var, RecyclerView.k kVar) {
        if (!kVar.g) {
            return this.h0.a(i, this.c0);
        }
        int c = r0Var.c(i);
        if (c == -1) {
            return 0;
        }
        return this.h0.a(c, this.c0);
    }

    public final int p2(int i, r0 r0Var, RecyclerView.k kVar) {
        if (!kVar.g) {
            b bVar = this.h0;
            int i2 = this.c0;
            SparseIntArray sparseIntArray = bVar.a;
            if (!bVar.c) {
                return bVar.b(i, i2);
            }
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int b2 = bVar.b(i, i2);
            sparseIntArray.put(i, b2);
            return b2;
        }
        int i4 = this.g0.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int c = r0Var.c(i);
        if (c == -1) {
            return 0;
        }
        b bVar2 = this.h0;
        int i5 = this.c0;
        SparseIntArray sparseIntArray2 = bVar2.a;
        if (!bVar2.c) {
            return bVar2.b(c, i5);
        }
        int i6 = sparseIntArray2.get(c, -1);
        if (i6 != -1) {
            return i6;
        }
        int b3 = bVar2.b(c, i5);
        sparseIntArray2.put(c, b3);
        return b3;
    }

    public final int q2(int i, r0 r0Var, RecyclerView.k kVar) {
        if (!kVar.g) {
            return this.h0.c(i);
        }
        int i2 = this.f0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c = r0Var.c(i);
        if (c == -1) {
            return 1;
        }
        return this.h0.c(c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r1(Rect rect, int i, int i2) {
        int L;
        int L2;
        if (this.d0 == null) {
            super.r1(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.J == 1) {
            L2 = RecyclerView.e.L(i2, rect.height() + paddingBottom, p0());
            int[] iArr = this.d0;
            L = RecyclerView.e.L(i, iArr[iArr.length - 1] + paddingRight, q0());
        } else {
            L = RecyclerView.e.L(i, rect.width() + paddingRight, q0());
            int[] iArr2 = this.d0;
            L2 = RecyclerView.e.L(i2, iArr2[iArr2.length - 1] + paddingBottom, p0());
        }
        q1(L, L2);
    }

    public final void r2(int i, View view, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int n2 = n2(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.J == 1) {
            i3 = RecyclerView.e.e0(n2, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.e.e0(this.L.l(), this.G, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int e0 = RecyclerView.e.e0(n2, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int e02 = RecyclerView.e.e0(this.L.l(), this.F, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = e0;
            i3 = e02;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? w1(view, i3, i2, layoutParams2) : u1(view, i3, i2, layoutParams2)) {
            view.measure(i3, i2);
        }
    }

    public final void s2(int i) {
        if (i == this.c0) {
            return;
        }
        this.b0 = true;
        if (i < 1) {
            ny61.g(oyr.i(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.c0 = i;
        this.h0.d();
        i1();
    }

    public final void t2() {
        int paddingBottom;
        int paddingTop;
        if (this.J == 1) {
            paddingBottom = this.H - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.I - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        h2(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int u0(r0 r0Var, RecyclerView.k kVar) {
        if (this.J == 0) {
            return Math.min(this.c0, getItemCount());
        }
        if (kVar.b() < 1) {
            return 0;
        }
        return o2(kVar.b() - 1, r0Var, kVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public boolean y1() {
        return this.U == null && !this.b0;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.b0 = false;
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new SparseIntArray();
        this.h0 = new a();
        this.i0 = new Rect();
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        s2(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.b0 = false;
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new SparseIntArray();
        this.h0 = new a();
        this.i0 = new Rect();
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        s2(i);
    }
}
