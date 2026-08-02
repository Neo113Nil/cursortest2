package com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.w;
import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutManagerWithGridLayoutLookup;
import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutState;
import defpackage.amt0;
import defpackage.b6w;
import defpackage.d6w;
import defpackage.f73;
import defpackage.gki0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kzt0;
import defpackage.lzt0;
import defpackage.mhp0;
import defpackage.mta0;
import defpackage.mzt0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qnr;
import defpackage.tjd;
import defpackage.w511;
import defpackage.xfo;
import defpackage.y6i0;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutManagerWithGridLayoutLookup;", "Lgki0;", "Lmhp0;", "Landroidx/recyclerview/widget/u0;", "SavedState", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class StaggeredGridLayoutManager extends LayoutManagerWithGridLayoutLookup implements gki0, mhp0, u0 {
    public final amt0 J;
    public final boolean K;
    public final kzt0 L;
    public final int M;
    public final int[] N;
    public final BitSet O;
    public final LayoutState P;
    public final mta0 Q;
    public final Rect R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public int W;

    public StaggeredGridLayoutManager(amt0 amt0Var) {
        kzt0 kzt0Var = new kzt0(0);
        this.J = amt0Var;
        this.K = true;
        this.L = kzt0Var;
        int i = amt0Var.e;
        this.M = i;
        this.N = new int[i];
        this.O = new BitSet(i);
        this.P = new LayoutState();
        this.Q = new mta0();
        this.R = new Rect();
        this.T = true;
        this.U = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.W = Integer.MIN_VALUE;
    }

    @Override // defpackage.mhp0
    public final void A(boolean z) {
    }

    public final int A1(int i, int i2) {
        d6w n = y6i0.n(0, this.M);
        if (n.isEmpty()) {
            ny61.p();
            return 0;
        }
        int i3 = n.a;
        int i4 = n.b;
        int i5 = Integer.MIN_VALUE;
        if (i3 <= i4) {
            while (true) {
                lzt0 j = this.L.j(i3, i);
                int I1 = j != null ? I1(j) : Integer.MIN_VALUE;
                if (I1 > i5) {
                    i5 = I1;
                }
                if (i3 == i4) {
                    break;
                }
                i3++;
            }
        }
        return i5 != Integer.MIN_VALUE ? i5 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[LOOP:0: B:5:0x0017->B:23:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[EDGE_INSN: B:24:0x0055->B:32:0x0055 BREAK  A[LOOP:0: B:5:0x0017->B:23:0x0052], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int B1(int i, int i2) {
        lzt0 lzt0Var;
        int i3;
        d6w n = y6i0.n(0, this.M);
        if (n.isEmpty()) {
            ny61.p();
            return 0;
        }
        int i4 = n.a;
        int i5 = n.b;
        int i6 = Integer.MAX_VALUE;
        if (i4 <= i5) {
            while (true) {
                int i7 = i + 1;
                kzt0 kzt0Var = this.L;
                int i8 = kzt0Var.c;
                if (i7 <= i8) {
                    while (true) {
                        lzt0Var = kzt0Var.i(i7);
                        if (!lzt0Var.a()) {
                            xfo.g(oyr.i(i7, "index="));
                            return 0;
                        }
                        if (!lzt0Var.b() && lzt0Var.a != i4) {
                            if (i7 == i8) {
                                break;
                            }
                            i7++;
                        } else {
                            break;
                        }
                    }
                    lzt0Var.f = i7;
                    i3 = lzt0Var == null ? lzt0Var.d : Integer.MAX_VALUE;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    if (i4 != i5) {
                        break;
                    }
                    i4++;
                }
                lzt0Var = null;
                if (lzt0Var == null) {
                }
                if (i3 < i6) {
                }
                if (i4 != i5) {
                }
            }
        }
        return i6 != Integer.MAX_VALUE ? i6 : i2;
    }

    public abstract LayoutState.LayoutDirection C1(int i);

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (J1(r8) != getZ().c(r11)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(r0 r0Var, RecyclerView.k kVar, int i, int i2, boolean z) {
        int i3;
        LayoutState layoutState;
        String str;
        boolean z2;
        lzt0 i4;
        View b;
        int i5;
        LayoutState layoutState2;
        int i6;
        View view;
        RecyclerView.k kVar2 = kVar;
        LayoutState layoutState3 = this.P;
        int i7 = mzt0.a[layoutState3.e.ordinal()];
        if (i7 == 1) {
            i3 = layoutState3.i ? Integer.MIN_VALUE : layoutState3.f - layoutState3.b;
        } else {
            if (i7 != 2) {
                w511.b();
                return;
            }
            i3 = layoutState3.i ? Integer.MAX_VALUE : layoutState3.g + layoutState3.b;
        }
        String str2 = "item is not assigned to span";
        boolean z3 = this.K;
        kzt0 kzt0Var = this.L;
        int i8 = this.M;
        if (1 > i2 || i2 >= kVar2.b() || layoutState3.e != LayoutState.LayoutDirection.START) {
            layoutState = layoutState3;
            str = "item is not assigned to span";
            z2 = z3;
        } else {
            if (z) {
                d6w n = y6i0.n(0, i8);
                int i9 = n.a;
                int i10 = n.b;
                if (i9 > i10) {
                    return;
                }
                while (true) {
                    lzt0 c = kzt0Var.c(i9, i2 - 1);
                    if (c == null || !c.d() || c.d > i3) {
                        break;
                    } else if (i9 == i10) {
                        return;
                    } else {
                        i9++;
                    }
                }
            }
            lzt0 O1 = O1(i2);
            O1.d = i;
            View view2 = null;
            int i11 = i2;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = i11 - 1;
                while (true) {
                    if (-1 >= i13) {
                        i13 = -1;
                        break;
                    } else if (O1(i13).b()) {
                        break;
                    } else {
                        i13--;
                    }
                }
                if (i13 >= i11) {
                    xfo.g(oyr.h(i13, i11, "fullSpanItemPosition ", ", endPosition: "));
                    return;
                }
                int i14 = i13 != -1 ? i13 : 0;
                int[] iArr = this.N;
                lzt0 lzt0Var = O1;
                f73.o(0, iArr);
                int i15 = i14;
                while (i15 < i11) {
                    View view3 = view2;
                    lzt0 O12 = O1(i15);
                    String str3 = str2;
                    View e = r0Var.e(i15);
                    boolean z4 = z3;
                    ((StaggeredGridLayoutParams) e.getLayoutParams()).setItem(O12);
                    z1(e);
                    if (!O12.c() || O12.e || e.isLayoutRequested()) {
                        layoutState2 = layoutState3;
                    } else {
                        layoutState2 = layoutState3;
                    }
                    int J1 = J1(O12);
                    U1(e, O12);
                    if (!z4 && !O12.b() && J1(O12) != J1) {
                        kzt0Var.g(i15 + 1);
                    }
                    if (!A0() || kVar2.a != i15) {
                        j1(r0Var, this.a.j(e), e);
                        e = view3;
                    }
                    if (!O12.a()) {
                        if (z4) {
                            O12.a = l(i15);
                        } else {
                            d6w n2 = y6i0.n(0, i8);
                            int i16 = n2.a;
                            int i17 = n2.b;
                            if (i16 <= i17) {
                                i6 = i15;
                                view = e;
                                int i18 = Integer.MAX_VALUE;
                                while (true) {
                                    int i19 = iArr[i16];
                                    if (i19 < i18) {
                                        O12.a = i16;
                                        i18 = i19;
                                    }
                                    if (i16 == i17) {
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (O12.b()) {
                                    int i20 = O12.a;
                                    iArr[i20] = J1(O12) + iArr[i20];
                                } else {
                                    d6w n3 = y6i0.n(0, i8);
                                    int i21 = n3.a;
                                    int i22 = n3.b;
                                    if (i21 <= i22) {
                                        while (true) {
                                            iArr[i21] = J1(O12) + iArr[i21];
                                            if (i21 != i22) {
                                                i21++;
                                            }
                                        }
                                    }
                                }
                                i15 = i6 + 1;
                                view2 = view;
                                str2 = str3;
                                layoutState3 = layoutState2;
                                z3 = z4;
                            }
                        }
                    }
                    i6 = i15;
                    view = e;
                    if (O12.b()) {
                    }
                    i15 = i6 + 1;
                    view2 = view;
                    str2 = str3;
                    layoutState3 = layoutState2;
                    z3 = z4;
                }
                layoutState = layoutState3;
                View view4 = view2;
                str = str2;
                z2 = z3;
                i12 += lzt0Var.b() ? j73.Q(iArr) : z2 ? iArr[l(i2)] : j73.T(iArr);
                if (i == Integer.MIN_VALUE) {
                    ny61.g("anchor start is invalid");
                    return;
                }
                f73.o(i - i12, iArr);
                for (int i23 = i14; i23 < i11; i23++) {
                    lzt0 i24 = kzt0Var.i(i23);
                    if (!i24.a()) {
                        ny61.g(str);
                        return;
                    }
                    if (i24.b()) {
                        i24.d = j73.Q(iArr);
                        d6w n4 = y6i0.n(0, i8);
                        int i25 = n4.a;
                        int i26 = n4.b;
                        if (i25 <= i26) {
                            while (true) {
                                iArr[i25] = I1(i24);
                                if (i25 != i26) {
                                    i25++;
                                }
                            }
                        }
                    } else {
                        int i27 = i24.a;
                        i24.d = iArr[i27];
                        iArr[i27] = I1(i24);
                    }
                }
                if (i13 != -1) {
                    O1 = kzt0Var.i(i13);
                    if (O1.d > i3) {
                        i11 = i13;
                        view2 = view4;
                        str2 = str;
                        layoutState3 = layoutState;
                        z3 = z2;
                    }
                }
                view2 = view4;
                break;
            }
            layoutState = layoutState3;
            str = str2;
            z2 = z3;
            if (view2 != null) {
                S1(view2, ((StaggeredGridLayoutParams) view2.getLayoutParams()).requireItem());
                j1(r0Var, this.a.j(view2), view2);
            }
        }
        BitSet bitSet = this.O;
        bitSet.set(0, i8);
        LayoutState layoutState4 = layoutState;
        LayoutState.LayoutDirection layoutDirection = layoutState4.e;
        int i28 = layoutState4.c;
        int i29 = mzt0.a[layoutDirection.ordinal()];
        if (i29 == 1) {
            d6w n5 = y6i0.n(0, i8);
            int i30 = n5.a;
            int i31 = n5.b;
            if (i30 <= i31) {
                while (true) {
                    lzt0 j = kzt0Var.j(i30, i28 + 1);
                    if (j == null || I1(j) <= i3) {
                        bitSet.clear(i30);
                    }
                    if (i30 == i31) {
                        break;
                    } else {
                        i30++;
                    }
                }
            }
        } else {
            if (i29 != 2) {
                w511.b();
                return;
            }
            d6w n6 = y6i0.n(0, i8);
            int i32 = n6.a;
            int i33 = n6.b;
            if (i32 <= i33) {
                while (true) {
                    lzt0 j2 = kzt0Var.j(i32, i28);
                    if (j2 == null) {
                        break;
                    }
                    if (I1(j2) >= i3) {
                        bitSet.clear(i32);
                    }
                    if (i32 == i33) {
                        break;
                    } else {
                        i32++;
                    }
                }
            }
        }
        if (layoutState4.a(kVar2)) {
            bitSet.isEmpty();
        }
        while (layoutState4.a(kVar2)) {
            if (!layoutState4.i && bitSet.isEmpty()) {
                return;
            }
            int i34 = layoutState4.c;
            int i35 = mzt0.a[layoutState4.e.ordinal()];
            if (i35 == 1) {
                i4 = kzt0Var.i(i34);
                if (!i4.a()) {
                    ny61.r(str);
                    return;
                }
                if (!i4.c()) {
                    ny61.r("item is not measured");
                    return;
                } else if (!i4.d()) {
                    ny61.r("item is not placed");
                    return;
                } else {
                    b = layoutState4.b(r0Var);
                    z1(b);
                    T1(b, i4);
                }
            } else {
                if (i35 != 2) {
                    w511.b();
                    return;
                }
                i4 = O1(i34);
                b = layoutState4.b(r0Var);
                z1(b);
                if (!i4.c() || i4.e || b.isLayoutRequested() || getZ().c(b) != J1(i4)) {
                    int J12 = J1(i4);
                    U1(b, i4);
                    if (!z2 && !i4.b() && J1(i4) != J12) {
                        kzt0Var.g(i34 + 1);
                    }
                } else {
                    T1(b, i4);
                }
                if (i4.b()) {
                    d6w n7 = y6i0.n(0, i8);
                    int i36 = n7.a;
                    int i37 = n7.b;
                    int i38 = Integer.MIN_VALUE;
                    if (i36 <= i37) {
                        while (true) {
                            lzt0 j3 = kzt0Var.j(i36, i34);
                            int I1 = j3 != null ? I1(j3) : Integer.MIN_VALUE;
                            if (I1 > i38) {
                                i38 = I1;
                            }
                            if (i36 == i37) {
                                break;
                            } else {
                                i36++;
                            }
                        }
                    }
                    i4.d = i38;
                } else if (z2) {
                    amt0 amt0Var = this.J;
                    int b2 = amt0Var.b(i34, amt0Var.e);
                    i4.a = b2;
                    lzt0 j4 = kzt0Var.j(b2, i34);
                    i4.d = j4 != null ? I1(j4) : Integer.MIN_VALUE;
                } else {
                    d6w n8 = y6i0.n(0, i8);
                    int i39 = n8.a;
                    int i40 = n8.b;
                    if (i39 <= i40) {
                        int i41 = 0;
                        i5 = Integer.MAX_VALUE;
                        while (true) {
                            lzt0 j5 = kzt0Var.j(i39, i34);
                            if (j5 == null) {
                                i5 = Integer.MIN_VALUE;
                                break;
                            }
                            int I12 = I1(j5);
                            if (I12 < i5) {
                                i5 = I12;
                                i41 = i39;
                            }
                            if (i39 == i40) {
                                i39 = i41;
                                break;
                            }
                            i39++;
                        }
                    } else {
                        i39 = 0;
                        i5 = Integer.MAX_VALUE;
                    }
                    i4.a = i39;
                    i4.d = i5;
                }
                if (i4.d == Integer.MIN_VALUE && i2 == 0) {
                    if (!i4.a()) {
                        ny61.g(str);
                        return;
                    } else if (!i4.b() ? !(i34 < 0 || i34 >= i8 || i34 != i4.a) : i34 == 0) {
                        i4.d = i;
                    }
                }
                int i42 = i4.d;
                if (i42 == Integer.MIN_VALUE || i42 == Integer.MAX_VALUE) {
                    ny61.r("item.decoratedStart is invalid");
                    return;
                }
            }
            S1(b, i4);
            ((StaggeredGridLayoutParams) b.getLayoutParams()).setItem(i4);
            boolean b3 = i4.b();
            LayoutState.LayoutDirection layoutDirection2 = layoutState4.e;
            if (!b3) {
                b2(i4, layoutDirection2, i3, i4.a);
            } else {
                if (!i4.b()) {
                    ny61.g("item is not full span");
                    return;
                }
                d6w n9 = y6i0.n(0, i8);
                int i43 = n9.a;
                int i44 = n9.b;
                if (i43 <= i44) {
                    while (true) {
                        b2(i4, layoutDirection2, i3, i43);
                        if (i43 == i44) {
                            break;
                        } else {
                            i43++;
                        }
                    }
                }
            }
            if (z && layoutState4.a && !layoutState4.i && layoutState4.b >= 0) {
                int i45 = mzt0.a[layoutState4.e.ordinal()];
                if (i45 == 1) {
                    int B1 = B1(layoutState4.c, Integer.MAX_VALUE);
                    int i46 = layoutState4.f;
                    if (B1 < i46) {
                        V1(r0Var, layoutState4.g - Math.min(i46 - B1, layoutState4.b));
                    }
                } else {
                    if (i45 != 2) {
                        w511.b();
                        return;
                    }
                    int A1 = A1(layoutState4.c, Integer.MIN_VALUE);
                    int i47 = layoutState4.g;
                    if (A1 > i47) {
                        W1(r0Var, Math.min(A1 - i47, layoutState4.b) + layoutState4.f);
                    }
                }
            }
            if (layoutState4.h && b.hasFocusable()) {
                if (i4.b()) {
                    bitSet.clear();
                } else {
                    bitSet.clear(i4.a);
                }
            }
            kVar2 = kVar;
        }
    }

    public final View E1(int i) {
        if (i == 0) {
            return null;
        }
        int d0 = d0();
        for (int i2 = 0; i2 < d0; i2++) {
            View X1 = X1(i2);
            int viewLayoutPosition = ((RecyclerView.LayoutParams) X1.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition >= 0 && viewLayoutPosition < i) {
                return X1;
            }
        }
        return null;
    }

    public final View F1() {
        int paddingTop = getZ().a.getPaddingTop();
        int g = getZ().g();
        int d0 = d0();
        while (true) {
            d0--;
            if (-1 >= d0) {
                return null;
            }
            View c0 = c0(d0);
            int e = getZ().e(c0);
            if (getZ().b(c0) > paddingTop && e < g) {
                return c0;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        kzt0 kzt0Var = this.L;
        kzt0Var.f(0, kzt0Var.c + 1);
    }

    public final View G1() {
        int paddingTop = getZ().a.getPaddingTop();
        int g = getZ().g();
        int d0 = d0();
        for (int i = 0; i < d0; i++) {
            View c0 = c0(i);
            int e = getZ().e(c0);
            if (getZ().b(c0) > paddingTop && e < g) {
                return c0;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[LOOP:0: B:9:0x0035->B:18:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View H1(int i, int i2, LayoutState.LayoutDirection layoutDirection, boolean z) {
        b6w n;
        lzt0 requireItem;
        int i3 = mzt0.a[layoutDirection.ordinal()];
        if (i3 == 1) {
            n = y6i0.n(0, d0());
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            n = y6i0.i(d0() - 1, 0);
        }
        int i4 = n.a;
        int i5 = n.b;
        int i6 = n.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        View view = null;
        while (true) {
            View X1 = X1(i4);
            int viewLayoutPosition = ((RecyclerView.LayoutParams) X1.getLayoutParams()).getViewLayoutPosition();
            int i7 = mzt0.a[layoutDirection.ordinal()];
            if (i7 == 1) {
                if (viewLayoutPosition >= i) {
                    break;
                }
                requireItem = ((StaggeredGridLayoutParams) X1.getLayoutParams()).requireItem();
                if (requireItem.a != i2) {
                }
                if (!z) {
                }
                view = X1;
                if (i4 != i5) {
                }
            } else {
                if (i7 != 2) {
                    w511.b();
                    return null;
                }
                if (viewLayoutPosition <= i) {
                    break;
                }
                requireItem = ((StaggeredGridLayoutParams) X1.getLayoutParams()).requireItem();
                if (requireItem.a != i2 || requireItem.b()) {
                    if (!z && !X1.hasFocusable()) {
                        break;
                    }
                    view = X1;
                }
                if (i4 != i5) {
                    return view;
                }
                i4 += i6;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        kzt0 kzt0Var = this.L;
        int i = kzt0Var.a;
        int i2 = 16;
        if (i >= 16 && (i2 = Integer.highestOneBit(i)) != i) {
            i2 <<= 1;
        }
        kzt0Var.b = new lzt0[i2];
        kzt0Var.c = -1;
        recyclerView.requestLayout();
    }

    public abstract int I1(lzt0 lzt0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        View W;
        View K1;
        View H1;
        View H12;
        if (d0() != 0 && (W = W(view)) != null) {
            lzt0 requireItem = ((StaggeredGridLayoutParams) W.getLayoutParams()).requireItem();
            LayoutState.LayoutDirection C1 = C1(i);
            if (C1 != null) {
                int i2 = mzt0.a[C1.ordinal()];
                if (i2 == 1) {
                    K1 = K1();
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    K1 = M1();
                }
                if (K1 == null) {
                    ny61.g("anchorView is null");
                    return null;
                }
                int viewLayoutPosition = ((RecyclerView.LayoutParams) K1.getLayoutParams()).getViewLayoutPosition();
                int e = getZ().e(K1);
                Z1(C1);
                a2(viewLayoutPosition, kVar);
                LayoutState layoutState = this.P;
                layoutState.c = layoutState.d.getVector() + viewLayoutPosition;
                layoutState.b = (int) (getZ().l() * 0.33333334f);
                layoutState.h = true;
                layoutState.a = false;
                D1(r0Var, kVar, e, viewLayoutPosition, true);
                if (!requireItem.b() && (H12 = H1(viewLayoutPosition, requireItem.a, C1, true)) != null && !H12.equals(W)) {
                    return H12;
                }
                int i3 = this.M;
                d6w n = y6i0.n(0, i3);
                int i4 = n.a;
                int i5 = n.b;
                if (i4 <= i5) {
                    while (true) {
                        View H13 = H1(viewLayoutPosition, i4, C1, true);
                        if (H13 != null && !H13.equals(W)) {
                            return H13;
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (!requireItem.b() && (H1 = H1(viewLayoutPosition, requireItem.a, C1, false)) != null && !H1.equals(W)) {
                    return H1;
                }
                d6w n2 = y6i0.n(0, i3);
                int i6 = n2.a;
                int i7 = n2.b;
                if (i6 <= i7) {
                    while (true) {
                        View H14 = H1(viewLayoutPosition, i6, C1, false);
                        if (H14 != null && !H14.equals(W)) {
                            return H14;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        return null;
    }

    public abstract int J1(lzt0 lzt0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean K(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof StaggeredGridLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void K0(AccessibilityEvent accessibilityEvent) {
        View G1;
        View F1;
        super.K0(accessibilityEvent);
        if (d0() <= 0 || (G1 = G1()) == null || (F1 = F1()) == null) {
            return;
        }
        int viewLayoutPosition = ((RecyclerView.LayoutParams) G1.getLayoutParams()).getViewLayoutPosition();
        int viewLayoutPosition2 = ((RecyclerView.LayoutParams) F1.getLayoutParams()).getViewLayoutPosition();
        if (viewLayoutPosition < viewLayoutPosition2) {
            accessibilityEvent.setFromIndex(viewLayoutPosition);
            accessibilityEvent.setToIndex(viewLayoutPosition2);
        } else {
            accessibilityEvent.setFromIndex(viewLayoutPosition2);
            accessibilityEvent.setToIndex(viewLayoutPosition);
        }
    }

    public final View K1() {
        if (d0() > 0) {
            return X1(0);
        }
        return null;
    }

    public final int L1() {
        View K1 = K1();
        if (K1 != null) {
            return ((RecyclerView.LayoutParams) K1.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    public final View M1() {
        if (d0() > 0) {
            return X1(d0() - 1);
        }
        return null;
    }

    public final int N1() {
        View M1 = M1();
        if (M1 != null) {
            return ((RecyclerView.LayoutParams) M1.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        kzt0 kzt0Var = this.L;
        kzt0Var.a(i, i2);
        kzt0Var.g(i + i2);
    }

    public final lzt0 O1(int i) {
        if (i == -1) {
            ny61.g("adapterPosition is invalid");
            return null;
        }
        kzt0 kzt0Var = this.L;
        lzt0 e = kzt0Var.e(i);
        if (e == null) {
            e = new lzt0();
            kzt0Var.b(i + 1);
            kzt0Var.b[i] = e;
            kzt0Var.c = Math.max(kzt0Var.c, i);
        }
        if (!e.a()) {
            amt0 amt0Var = this.J;
            e.a = amt0Var.c(i) == amt0Var.e ? Integer.MAX_VALUE : -1;
        }
        return e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        kzt0 kzt0Var = this.L;
        kzt0Var.f(0, kzt0Var.c + 1);
    }

    /* renamed from: P1 */
    public abstract c0 getZ();

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        kzt0 kzt0Var = this.L;
        if (i != i2) {
            int i3 = kzt0Var.c;
            if (i <= i3 || i2 <= i3) {
                kzt0Var.b(Math.max(i, i2) + 1);
                lzt0 lzt0Var = kzt0Var.b[i];
                kzt0Var.h(i, 1);
                kzt0Var.a(i2, 1);
                kzt0Var.b[i2] = lzt0Var;
            }
        } else {
            kzt0Var.getClass();
        }
        kzt0Var.g(i);
        kzt0Var.g(i2);
    }

    /* renamed from: Q1 */
    public abstract b0 getA0();

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        kzt0 kzt0Var = this.L;
        kzt0Var.h(i, i2);
        kzt0Var.g(i);
    }

    public final void R1(r0 r0Var, RecyclerView.k kVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        View K1;
        int paddingTop;
        int e;
        if (kVar.b() == 0) {
            return;
        }
        if (i2 < 0 || i2 >= kVar.b()) {
            w511.f(oyr.h(i2, kVar.b(), "anchorPosition=", " is out of bounds for itemCount="));
            return;
        }
        LayoutState layoutState = this.P;
        if (i2 > 0) {
            Z1(LayoutState.LayoutDirection.START);
            layoutState.c = i2 - 1;
            D1(r0Var, kVar, i, i2, false);
            i3 = i;
            i4 = i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        Z1(LayoutState.LayoutDirection.END);
        layoutState.c = i4;
        D1(r0Var, kVar, i3, i4, false);
        if (z) {
            if (d0() == 0) {
                d6w n = y6i0.n(0, this.M);
                int i5 = n.a;
                int i6 = n.b;
                lzt0 lzt0Var = null;
                if (i5 <= i6) {
                    while (true) {
                        lzt0 j = this.L.j(i5, kVar.b());
                        if (j != null) {
                            if (!j.d()) {
                                ny61.r("item is not placed");
                                return;
                            } else if (lzt0Var == null || I1(lzt0Var) < I1(j)) {
                                lzt0Var = j;
                            }
                        }
                        if (i5 == i6) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                if (lzt0Var != null) {
                    R1(r0Var, kVar, getZ().g() - J1(lzt0Var), lzt0Var.f, false);
                    return;
                } else {
                    R1(r0Var, kVar, getZ().a.getPaddingTop(), 0, false);
                    return;
                }
            }
            if (kVar.g || (K1 = K1()) == null) {
                return;
            }
            int viewLayoutPosition = ((RecyclerView.LayoutParams) K1.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition == 0 && (e = getZ().e(K1)) > (paddingTop = getZ().a.getPaddingTop())) {
                int i7 = e - paddingTop;
                int Y1 = i7 - Y1(i7, r0Var, kVar);
                if (Y1 > 0) {
                    getZ().p(-Y1);
                    return;
                }
                return;
            }
            if (N1() == kVar.b() - 1) {
                int paddingTop2 = getZ().a.getPaddingTop();
                int g = getZ().g();
                boolean z2 = viewLayoutPosition > 0 || getZ().e(K1) < paddingTop2;
                int A1 = A1(kVar.b(), Integer.MIN_VALUE);
                if (A1 == Integer.MIN_VALUE || A1 >= g || !z2) {
                    return;
                }
                int i8 = g - A1;
                int i9 = i8 - (-Y1(-i8, r0Var, kVar));
                if (i9 > 0) {
                    getZ().p(i9);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void S0(RecyclerView recyclerView, int i, int i2) {
        T0(recyclerView, i, i2, null);
    }

    public abstract void S1(View view, lzt0 lzt0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
        int i3 = i2 + i;
        kzt0 kzt0Var = this.L;
        int i4 = kzt0Var.c + 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        while (i < i4) {
            lzt0 lzt0Var = kzt0Var.b[i];
            if (lzt0Var != null) {
                lzt0Var.e = true;
            }
            i++;
        }
        if (this.K || jl40.l(obj, tjd.a)) {
            return;
        }
        kzt0Var.g(i3);
    }

    public final void T1(View view, lzt0 lzt0Var) {
        if (!lzt0Var.c()) {
            ny61.g("item is not measured");
            return;
        }
        StaggeredGridLayoutParams staggeredGridLayoutParams = (StaggeredGridLayoutParams) view.getLayoutParams();
        Rect rect = this.R;
        m(view, rect);
        int i = lzt0Var.b - (((((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).rightMargin) + rect.left) + rect.right);
        if (i < 0) {
            i = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int i2 = lzt0Var.c - (((((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).bottomMargin) + rect.top) + rect.bottom);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2 >= 0 ? i2 : 0, 1073741824);
        if (qnr.b(this, view, makeMeasureSpec, makeMeasureSpec2, view.getLayoutParams())) {
            view.measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int e;
        lzt0 requireItem;
        int J1;
        if (kVar.g) {
            return;
        }
        mta0 mta0Var = this.Q;
        if (mta0Var.a != -1 && kVar.b() == 0) {
            c1(r0Var);
            return;
        }
        int b = kVar.b();
        int i = mta0Var.a;
        if (i < 0 || i >= b) {
            mta0Var.a = -1;
            mta0Var.b = Integer.MIN_VALUE;
        }
        int i2 = mta0Var.a;
        int i3 = 0;
        boolean z = this.K;
        kzt0 kzt0Var = this.L;
        if (i2 == -1) {
            View E1 = E1(kVar.b());
            int viewLayoutPosition = E1 != null ? ((RecyclerView.LayoutParams) E1.getLayoutParams()).getViewLayoutPosition() : 0;
            e = E1 != null ? getZ().e(E1) : getZ().a.getPaddingTop();
            i2 = viewLayoutPosition;
        } else if (mta0Var.b == Integer.MIN_VALUE) {
            int L1 = L1();
            int i4 = mzt0.a[(L1 == -1 ? LayoutState.LayoutDirection.END : i2 < L1 ? LayoutState.LayoutDirection.START : LayoutState.LayoutDirection.END).ordinal()];
            if (i4 == 1) {
                e = getZ().a.getPaddingTop();
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                View X = X(i2);
                if (X != null) {
                    J1 = getZ().c(X);
                } else {
                    lzt0 O1 = O1(i2);
                    View e2 = r0Var.e(i2);
                    F(e2);
                    int J12 = J1(O1);
                    U1(e2, O1);
                    if (!z && !O1.b() && J1(O1) != J12) {
                        kzt0Var.g(i2 + 1);
                    }
                    j1(r0Var, this.a.j(e2), e2);
                    J1 = J1(O1);
                }
                e = Math.max(getZ().a.getPaddingTop(), getZ().g() - J1);
            }
        } else {
            e = getZ().a.getPaddingTop() + mta0Var.b;
            int l = getZ().l();
            if (e > l) {
                e = l;
            }
        }
        int l2 = getA0().l();
        int i5 = this.M;
        int i6 = l2 / i5;
        if (this.S != i6) {
            this.S = i6;
            kzt0Var.f(0, kzt0Var.c + 1);
        }
        a2(i2, kVar);
        if (mta0Var.a == -1 && d0() > 0) {
            LayoutState layoutState = this.P;
            if (!layoutState.i && getZ().a.getPaddingTop() == this.U && getZ().g() == this.V && getZ().a.I == this.W) {
                int L12 = L1();
                int N1 = N1();
                if (L12 != -1 && N1 != -1 && L12 <= N1 && N1 < kVar.b()) {
                    int d0 = d0();
                    int i7 = L12;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= d0) {
                            d6w n = y6i0.n(i3, i5);
                            int i9 = n.a;
                            int i10 = n.b;
                            if (i9 <= i10) {
                                while (true) {
                                    lzt0 c = kzt0Var.c(i9, L12 - 1);
                                    if (c == null || !c.d() || !c.c() || c.d > layoutState.f) {
                                        break;
                                    } else if (i9 == i10) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            d6w n2 = y6i0.n(0, i5);
                            int i11 = n2.a;
                            int i12 = n2.b;
                            if (i11 <= i12) {
                                while (true) {
                                    lzt0 d = kzt0Var.d(i11, N1 + 1);
                                    if (d == null) {
                                        break;
                                    }
                                    if (!d.d()) {
                                        break;
                                    }
                                    if (!d.c()) {
                                        break;
                                    }
                                    if (I1(d) < layoutState.g) {
                                        if (d.b()) {
                                            break;
                                        }
                                        lzt0 c2 = kzt0Var.c(i11, d.f);
                                        if (c2 == null) {
                                            break;
                                        }
                                        if (c2.b()) {
                                            if (A1(c2.f, Integer.MIN_VALUE) <= layoutState.g) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (i11 == i12) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            int d02 = d0();
                            for (int i13 = 0; i13 < d02; i13++) {
                                View X1 = X1(i13);
                                int viewLayoutPosition2 = ((RecyclerView.LayoutParams) X1.getLayoutParams()).getViewLayoutPosition();
                                if (viewLayoutPosition2 != -1) {
                                    lzt0 requireItem2 = ((StaggeredGridLayoutParams) X1.getLayoutParams()).requireItem();
                                    if (requireItem2.e) {
                                        j1(r0Var, this.a.j(X1), X1);
                                        X1 = r0Var.e(viewLayoutPosition2);
                                        ((StaggeredGridLayoutParams) X1.getLayoutParams()).setItem(requireItem2);
                                        G(i13, X1, false);
                                    } else if (!X1.isLayoutRequested()) {
                                        continue;
                                    }
                                    int J13 = J1(requireItem2);
                                    U1(X1, requireItem2);
                                    if (J1(requireItem2) == J13) {
                                        S1(X1, requireItem2);
                                    } else if (!z && !requireItem2.b()) {
                                        kzt0Var.g(viewLayoutPosition2 + 1);
                                    }
                                }
                            }
                            return;
                        }
                        View X12 = X1(i8);
                        int viewLayoutPosition3 = ((RecyclerView.LayoutParams) X12.getLayoutParams()).getViewLayoutPosition();
                        if (viewLayoutPosition3 != i7 || (requireItem = ((StaggeredGridLayoutParams) X12.getLayoutParams()).requireItem()) != kzt0Var.e(viewLayoutPosition3) || !requireItem.c() || !requireItem.d() || !requireItem.a()) {
                            break;
                        }
                        i7++;
                        i8++;
                        i3 = 0;
                    }
                }
            }
        }
        U(r0Var);
        R1(r0Var, kVar, e, i2, true);
    }

    public abstract void U1(View view, lzt0 lzt0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        mta0 mta0Var = this.Q;
        mta0Var.a = -1;
        mta0Var.b = Integer.MIN_VALUE;
        this.U = getZ().a.getPaddingTop();
        this.V = getZ().g();
        this.W = getZ().a.I;
    }

    public final void V1(r0 r0Var, int i) {
        int d0 = d0();
        while (true) {
            d0--;
            if (-1 >= d0) {
                return;
            }
            View X1 = X1(d0);
            if (getZ().e(X1) < i) {
                return;
            }
            c0 z = getZ();
            RecyclerView.e eVar = z.a;
            Rect rect = z.c;
            eVar.w0(X1, rect);
            if (rect.top < i) {
                return;
            }
            ((StaggeredGridLayoutParams) X1.getLayoutParams()).reset();
            e1(X1, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            mta0 mta0Var = this.Q;
            if (mta0Var.a == -1) {
                SavedState savedState = (SavedState) parcelable;
                int anchorPosition = savedState.getAnchorPosition();
                int anchorStart = savedState.getAnchorStart();
                mta0Var.a = anchorPosition;
                mta0Var.b = anchorStart;
                i1();
            }
        }
    }

    public final void W1(r0 r0Var, int i) {
        while (d0() > 0) {
            View X1 = X1(0);
            if (getZ().b(X1) > i) {
                return;
            }
            c0 z = getZ();
            RecyclerView.e eVar = z.a;
            Rect rect = z.c;
            eVar.w0(X1, rect);
            if (rect.bottom > i) {
                return;
            }
            ((StaggeredGridLayoutParams) X1.getLayoutParams()).reset();
            e1(X1, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final View X(int i) {
        if (i != -1 && d0() != 0) {
            int L1 = L1();
            if (i <= N1() && L1 <= i) {
                return super.X(i);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        mta0 mta0Var = this.Q;
        if (mta0Var.a != -1) {
            return new SavedState(mta0Var.a, mta0Var.b);
        }
        View K1 = K1();
        return new SavedState(K1 != null ? ((RecyclerView.LayoutParams) K1.getLayoutParams()).getViewLayoutPosition() : -1, K1 != null ? getZ().e(K1) - getZ().a.getPaddingTop() : Integer.MIN_VALUE);
    }

    public final View X1(int i) {
        View c0 = c0(i);
        if (c0 != null) {
            return c0;
        }
        w511.f(oyr.i(i, "no child at index "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Y1(int i, r0 r0Var, RecyclerView.k kVar) {
        View E1;
        LayoutState.LayoutDirection layoutDirection;
        int B1;
        int min;
        int i2;
        if (i != 0 && d0() != 0) {
            if (d0() > 0 && i != 0) {
                if (i > 0) {
                    int b = kVar.b();
                    E1 = null;
                    if (b != 0) {
                        int d0 = d0() - 1;
                        while (true) {
                            if (-1 >= d0) {
                                break;
                            }
                            View X1 = X1(d0);
                            int viewLayoutPosition = ((RecyclerView.LayoutParams) X1.getLayoutParams()).getViewLayoutPosition();
                            if (viewLayoutPosition >= 0 && viewLayoutPosition < b) {
                                E1 = X1;
                                break;
                            }
                            d0--;
                        }
                    }
                    if (E1 == null) {
                        ny61.g("no last reference child");
                        return 0;
                    }
                    layoutDirection = LayoutState.LayoutDirection.END;
                } else {
                    E1 = E1(kVar.b());
                    if (E1 == null) {
                        ny61.g("no first reference child");
                        return 0;
                    }
                    layoutDirection = LayoutState.LayoutDirection.START;
                }
                int viewLayoutPosition2 = ((RecyclerView.LayoutParams) E1.getLayoutParams()).getViewLayoutPosition();
                if (viewLayoutPosition2 == -1) {
                    ny61.r("anchorPosition is invalid");
                    return 0;
                }
                a2(viewLayoutPosition2, kVar);
                Z1(layoutDirection);
                LayoutState layoutState = this.P;
                layoutState.a = true;
                layoutState.c = layoutState.d.getVector() + viewLayoutPosition2;
                layoutState.b = Math.abs(i);
                D1(r0Var, kVar, getZ().e(E1), ((RecyclerView.LayoutParams) E1.getLayoutParams()).getViewLayoutPosition(), true);
                LayoutState.LayoutDirection layoutDirection2 = layoutState.e;
                int[] iArr = mzt0.a;
                int i3 = iArr[layoutDirection2.ordinal()];
                if (i3 == 1) {
                    View K1 = K1();
                    if (K1 != null) {
                        int viewLayoutPosition3 = ((RecyclerView.LayoutParams) K1.getLayoutParams()).getViewLayoutPosition();
                        int paddingTop = getZ().a.getPaddingTop();
                        B1 = paddingTop - B1(viewLayoutPosition3 - 1, paddingTop);
                        if (B1 > 0) {
                        }
                    }
                    min = 0;
                    if (layoutState.b >= min) {
                    }
                    getZ().p(-i);
                    layoutState.b = 0;
                    if (layoutState.a) {
                    }
                    return i;
                }
                if (i3 != 2) {
                    w511.b();
                    return 0;
                }
                View M1 = M1();
                if (M1 != null) {
                    int viewLayoutPosition4 = ((RecyclerView.LayoutParams) M1.getLayoutParams()).getViewLayoutPosition();
                    int g = getZ().g();
                    B1 = A1(viewLayoutPosition4 + 1, g) - g;
                    if (B1 > 0) {
                        min = Math.min(layoutState.b, B1);
                        if (layoutState.b >= min) {
                            i = i > 0 ? min : -min;
                        }
                        getZ().p(-i);
                        layoutState.b = 0;
                        if (layoutState.a && !layoutState.i) {
                            i2 = iArr[layoutState.e.ordinal()];
                            if (i2 == 1) {
                                if (i2 == 2) {
                                    W1(r0Var, layoutState.f);
                                    return i;
                                }
                                w511.b();
                                return 0;
                            }
                            V1(r0Var, layoutState.g);
                        }
                        return i;
                    }
                }
                min = 0;
                if (layoutState.b >= min) {
                }
                getZ().p(-i);
                layoutState.b = 0;
                if (layoutState.a) {
                    i2 = iArr[layoutState.e.ordinal()];
                    if (i2 == 1) {
                    }
                }
                return i;
            }
            xfo.g(oyr.h(d0(), i, "childCount=", ", delta="));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Z(Context context, AttributeSet attributeSet) {
        return new StaggeredGridLayoutParams(context, attributeSet);
    }

    public final void Z1(LayoutState.LayoutDirection layoutDirection) {
        LayoutState.ItemDirection itemDirection;
        LayoutState layoutState = this.P;
        layoutState.e = layoutDirection;
        int i = mzt0.a[layoutDirection.ordinal()];
        if (i == 1) {
            itemDirection = LayoutState.ItemDirection.HEAD;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            itemDirection = LayoutState.ItemDirection.TAIL;
        }
        layoutState.d = itemDirection;
    }

    @Override // defpackage.gki0
    public final int a() {
        return L1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new StaggeredGridLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new StaggeredGridLayoutParams(layoutParams);
    }

    public final void a2(int i, RecyclerView.k kVar) {
        int i2;
        LayoutState layoutState = this.P;
        boolean z = false;
        layoutState.b = 0;
        if (f0()) {
            layoutState.f = getZ().a.getPaddingTop();
            layoutState.g = getZ().g();
        } else {
            layoutState.f = 0;
            layoutState.g = getZ().a.I;
        }
        if (A0() && (i2 = kVar.a) != -1) {
            if (i2 < i) {
                layoutState.f -= getZ().l();
            } else {
                layoutState.g = getZ().l() + layoutState.g;
            }
        }
        layoutState.h = false;
        layoutState.a = true;
        RecyclerView.e eVar = getZ().a;
        if (eVar.G == 0 && eVar.I == 0) {
            z = true;
        }
        layoutState.i = z;
    }

    @Override // defpackage.gki0
    public final int b() {
        return N1();
    }

    public final void b2(lzt0 lzt0Var, LayoutState.LayoutDirection layoutDirection, int i, int i2) {
        int i3 = mzt0.a[layoutDirection.ordinal()];
        BitSet bitSet = this.O;
        if (i3 == 1) {
            if (lzt0Var.d <= i) {
                bitSet.clear(i2);
            }
        } else if (i3 != 2) {
            w511.b();
        } else if (I1(lzt0Var) >= i) {
            bitSet.clear(i2);
        }
    }

    @Override // defpackage.j1u
    public final Integer f(int i) {
        lzt0 e;
        if (this.K) {
            return super.f(i);
        }
        kzt0 kzt0Var = this.L;
        if (i >= kzt0Var.c || (e = kzt0Var.e(i)) == null || !e.a()) {
            return null;
        }
        if (!e.b()) {
            lzt0 c = kzt0Var.c(e.a, i);
            if (c != null) {
                return Integer.valueOf(c.f);
            }
            return null;
        }
        int i2 = i + 1;
        lzt0 e2 = kzt0Var.e(i2);
        if (e2 == null || !e2.b()) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    @Override // defpackage.j1u
    public final Integer h(int i) {
        kzt0 kzt0Var;
        lzt0 e;
        if (this.K) {
            return super.h(i);
        }
        if (i <= 0 || (e = (kzt0Var = this.L).e(i)) == null || !e.a()) {
            return null;
        }
        if (!e.b()) {
            lzt0 d = kzt0Var.d(e.a, i);
            if (d != null) {
                return Integer.valueOf(d.f);
            }
            return null;
        }
        int i2 = i - 1;
        lzt0 e2 = kzt0Var.e(i2);
        if (e2 == null || !e2.b()) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    @Override // defpackage.j1u
    public final int l(int i) {
        if (this.K) {
            amt0 amt0Var = this.J;
            return amt0Var.b(i, amt0Var.e);
        }
        lzt0 e = this.L.e(i);
        if (e == null || e.b() || !e.a()) {
            return 0;
        }
        return e.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        mta0 mta0Var = this.Q;
        mta0Var.a = i;
        mta0Var.b = Integer.MIN_VALUE;
        i1();
    }

    @Override // defpackage.ylt0
    public final int o(int i) {
        return this.J.c(i);
    }

    @Override // defpackage.gki0
    public final void r(int i, int i2) {
        mta0 mta0Var = this.Q;
        mta0Var.a = i;
        mta0Var.b = i2;
        i1();
    }

    @Override // defpackage.j1u
    public final int u(int i) {
        if (!this.K) {
            return i * 2;
        }
        amt0 amt0Var = this.J;
        return amt0Var.a(i, amt0Var.e);
    }

    @Override // defpackage.mhp0
    public final void w(boolean z) {
        this.T = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.a = i;
        v(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean y1() {
        return false;
    }

    @Override // defpackage.ylt0
    /* renamed from: z, reason: from getter */
    public final int getM() {
        return this.M;
    }

    public final void z1(View view) {
        int i = mzt0.a[this.P.e.ordinal()];
        if (i == 1) {
            G(0, view, false);
        } else if (i == 2) {
            F(view);
        } else {
            w511.b();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager$SavedState;", "Landroid/os/Parcelable;", "", "anchorPosition", "anchorStart", "<init>", "(II)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getAnchorPosition", "setAnchorPosition", "(I)V", "getAnchorStart", "setAnchorStart", "CREATOR", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private int anchorPosition;
        private int anchorStart;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SavedState(Parcel parcel) {
            this(r2, r2, 3, null);
            int i = 0;
            this.anchorPosition = parcel.readInt();
            this.anchorStart = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getAnchorPosition() {
            return this.anchorPosition;
        }

        public final int getAnchorStart() {
            return this.anchorStart;
        }

        public final void setAnchorPosition(int i) {
            this.anchorPosition = i;
        }

        public final void setAnchorStart(int i) {
            this.anchorStart = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.anchorPosition);
            dest.writeInt(this.anchorStart);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager$SavedState;", "<init>", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager$SavedState;", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager$SavedState$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel source) {
                return new SavedState(source);
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public SavedState(int i, int i2) {
            this.anchorPosition = i;
            this.anchorStart = i2;
        }

        public /* synthetic */ SavedState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? Integer.MIN_VALUE : i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SavedState() {
            this(r2, r2, 3, null);
            int i = 0;
        }
    }
}
