package com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.r0;
import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutState;
import defpackage.amt0;
import defpackage.d6w;
import defpackage.kzt0;
import defpackage.lzt0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qnr;
import defpackage.uh;
import defpackage.wh;
import defpackage.xfo;
import defpackage.xkp0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/VerticalStaggeredGridLayoutManager;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutManager;", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public final c0 Z;
    public final b0 a0;

    public VerticalStaggeredGridLayoutManager(amt0 amt0Var) {
        super(amt0Var);
        this.Z = new c0(this);
        this.a0 = new b0(this);
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    public final LayoutState.LayoutDirection C1(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 33) {
                    if (i != 130) {
                        return null;
                    }
                }
            }
            return LayoutState.LayoutDirection.END;
        }
        return LayoutState.LayoutDirection.START;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void F0(int i) {
        int i2;
        super.F0(i);
        kzt0 kzt0Var = this.L;
        kzt0Var.getClass();
        if (i == 0) {
            return;
        }
        int i3 = 0;
        int i4 = new d6w(0, kzt0Var.c, 1).b;
        if (i4 < 0) {
            return;
        }
        while (true) {
            lzt0 lzt0Var = kzt0Var.b[i3];
            if (lzt0Var != null && (i2 = lzt0Var.d) != Integer.MIN_VALUE) {
                lzt0Var.d = i2 + i;
            }
            if (i3 == i4) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    public final int I1(lzt0 lzt0Var) {
        int i = lzt0Var.d;
        if (i == Integer.MIN_VALUE) {
            ny61.r("item.decoratedStart is invalid");
            return 0;
        }
        int i2 = lzt0Var.c;
        if (i2 >= 0) {
            return i + i2;
        }
        xfo.g(oyr.j(i2, "item.decoratedHeight = ", " "));
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.T;
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    public final int J1(lzt0 lzt0Var) {
        return lzt0Var.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void N0(r0 r0Var, RecyclerView.k kVar, View view, wh whVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        StaggeredGridLayoutParams staggeredGridLayoutParams = layoutParams instanceof StaggeredGridLayoutParams ? (StaggeredGridLayoutParams) layoutParams : null;
        lzt0 item = staggeredGridLayoutParams != null ? staggeredGridLayoutParams.getItem() : null;
        if (item == null) {
            super.N0(r0Var, kVar, view, whVar);
        } else {
            whVar.s(uh.a(-1, -1, item.b() ? 0 : item.a, item.b() ? this.M : 1, false, false));
        }
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    /* renamed from: P1, reason: from getter */
    public final c0 getZ() {
        return this.Z;
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    /* renamed from: Q1, reason: from getter */
    public final b0 getA0() {
        return this.a0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        View G1 = G1();
        View F1 = F1();
        if (d0() == 0 || kVar.b() == 0 || G1 == null || F1 == null) {
            return 0;
        }
        c0 c0Var = this.Z;
        return Math.min(c0Var.l(), c0Var.b(F1) - c0Var.e(G1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        return xkp0.a(kVar, this.Z, G1(), F1(), this);
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    public final void S1(View view, lzt0 lzt0Var) {
        if (!lzt0Var.d()) {
            ny61.g("item is not placed");
            return;
        }
        if (!lzt0Var.c()) {
            ny61.g("item is not measured");
        } else {
            if (!lzt0Var.a()) {
                ny61.g("item is not assigned to span");
                return;
            }
            int paddingLeft = getPaddingLeft() + (lzt0Var.b() ? 0 : lzt0Var.a * this.S);
            int i = lzt0Var.d;
            C0(paddingLeft, i, paddingLeft + lzt0Var.b, i + lzt0Var.c, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        View G1 = G1();
        View F1 = F1();
        if (d0() == 0 || kVar.b() == 0 || G1 == null || F1 == null) {
            return 0;
        }
        c0 c0Var = this.Z;
        return (int) (((c0Var.b(F1) - c0Var.e(G1)) / (Math.abs(((RecyclerView.LayoutParams) G1.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) F1.getLayoutParams()).getViewLayoutPosition()) + 1)) * kVar.b());
    }

    @Override // com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.StaggeredGridLayoutManager
    public final void U1(View view, lzt0 lzt0Var) {
        StaggeredGridLayoutParams staggeredGridLayoutParams = (StaggeredGridLayoutParams) view.getLayoutParams();
        Rect rect = this.R;
        m(view, rect);
        int i = ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).bottomMargin + rect.top + rect.bottom;
        int i2 = ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).rightMargin + rect.left + rect.right;
        int e0 = RecyclerView.e.e0(lzt0Var.b() ? this.H : this.S, this.F, (lzt0Var.b() ? getPaddingRight() + getPaddingLeft() : 0) + i2, ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).width, false);
        int e02 = RecyclerView.e.e0(this.I, this.G, getPaddingBottom() + getPaddingTop() + i, ((ViewGroup.MarginLayoutParams) staggeredGridLayoutParams).height, true);
        if (qnr.b(this, view, e0, e02, view.getLayoutParams())) {
            view.measure(e0, e02);
        }
        lzt0Var.e = false;
        lzt0Var.b = view.getMeasuredWidth() + i2;
        lzt0Var.c = view.getMeasuredHeight() + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return new StaggeredGridLayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.u0
    public final PointF d(int i) {
        int L1 = L1();
        return new PointF(0.0f, (L1 == -1 ? LayoutState.LayoutDirection.END : i < L1 ? LayoutState.LayoutDirection.START : LayoutState.LayoutDirection.END).getVector());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g0(r0 r0Var, RecyclerView.k kVar) {
        return Math.min(this.M, kVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        return Y1(i, r0Var, kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r1(Rect rect, int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        q1(RecyclerView.e.L(i, (this.S * this.M) + getPaddingRight() + getPaddingLeft(), q0()), RecyclerView.e.L(i2, rect.height() + paddingBottom, p0()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int u0(r0 r0Var, RecyclerView.k kVar) {
        return -1;
    }
}
