package com.yandex.go.flex.screens.common.flexible.layout.manager;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutState;
import defpackage.scc;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class b {
    public final int a;
    public int c;
    public final /* synthetic */ FlexibleGridLayoutManager f;
    public final ArrayList b = new ArrayList();
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    public b(FlexibleGridLayoutManager flexibleGridLayoutManager, int i) {
        this.f = flexibleGridLayoutManager;
        this.a = i;
    }

    public final void a(View view) {
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutParams.getSpan() == null) {
            layoutParams.setSpan(this);
        }
        ArrayList arrayList = this.b;
        arrayList.add(view);
        this.e = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.d = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.c = ((d0) this.f.e0.a.getValue()).c(view) + this.c;
        }
    }

    public final void b() {
        FlexibleGridLayoutManager.LazySpanLookup.FullSpanItem b;
        View view = (View) kotlin.collections.a.Z(this.b);
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        FlexibleGridLayoutManager flexibleGridLayoutManager = this.f;
        this.e = ((d0) flexibleGridLayoutManager.e0.a.getValue()).b(view);
        if (layoutParams.getIsFullSpan() && (b = flexibleGridLayoutManager.l0.b(layoutParams.getViewLayoutPosition())) != null && b.getGapDirection() == LayoutState.LayoutDirection.END) {
            this.e = b.getGapForSpan(this.a) + this.e;
        }
    }

    public final void c() {
        View view = (View) this.b.get(0);
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        FlexibleGridLayoutManager flexibleGridLayoutManager = this.f;
        this.d = ((d0) flexibleGridLayoutManager.e0.a.getValue()).e(view);
        FlexibleGridLayoutManager.LazySpanLookup.FullSpanItem b = flexibleGridLayoutManager.l0.b(layoutParams.getViewLayoutPosition());
        if ((b != null ? b.getGapDirection() : null) == LayoutState.LayoutDirection.END) {
            this.d -= b.getGapForSpan(this.a);
        }
    }

    public final void d() {
        this.b.clear();
        if (this.d == 0 || this.f.r0.b == 0) {
            this.d = Integer.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
        }
        this.c = 0;
    }

    public final int e() {
        boolean z = this.f.g0;
        ArrayList arrayList = this.b;
        return z ? g(scc.f(arrayList), -1) : g(0, arrayList.size());
    }

    public final int f() {
        boolean z = this.f.g0;
        ArrayList arrayList = this.b;
        return z ? g(0, arrayList.size()) : g(scc.f(arrayList), -1);
    }

    public final int g(int i, int i2) {
        d0 d0Var = (d0) this.f.e0.a.getValue();
        int k = d0Var.k();
        int g = d0Var.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.b.get(i);
            int e = d0Var.e(view);
            int b = d0Var.b(view);
            boolean z = e <= g;
            boolean z2 = b >= k;
            if (z && z2 && (e < k || b > g)) {
                return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
            }
            i += i3;
        }
        return -1;
    }

    public final int h(Integer num) {
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.b.isEmpty()) {
            return num.intValue();
        }
        b();
        return this.e;
    }

    public final View i(int i, LayoutState.LayoutDirection layoutDirection) {
        LayoutState.LayoutDirection layoutDirection2 = LayoutState.LayoutDirection.START;
        FlexibleGridLayoutManager flexibleGridLayoutManager = this.f;
        View view = null;
        ArrayList arrayList = this.b;
        if (layoutDirection == layoutDirection2) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                View view2 = (View) arrayList.get(i2);
                int r0 = RecyclerView.e.r0(view2);
                boolean z = flexibleGridLayoutManager.g0;
                if ((z && r0 <= i) || ((!z && r0 >= i) || !view2.hasFocusable())) {
                    break;
                }
                i2++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                View view3 = (View) arrayList.get(size2);
                int r02 = RecyclerView.e.r0(view3);
                boolean z2 = flexibleGridLayoutManager.g0;
                if ((z2 && r02 >= i) || ((!z2 && r02 <= i) || !view3.hasFocusable())) {
                    break;
                }
                if (i3 < 0) {
                    return view3;
                }
                view = view3;
                size2 = i3;
            }
        }
        return view;
    }

    public final int j(Integer num) {
        int i = this.d;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.b.isEmpty()) {
            return num.intValue();
        }
        c();
        return this.d;
    }

    public final void k() {
        View view;
        Object removeLast;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (Build.VERSION.SDK_INT >= 35) {
            removeLast = arrayList.removeLast();
            view = (View) removeLast;
        } else {
            view = (View) arrayList.remove(size - 1);
        }
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.setSpan(null);
        layoutParams.setSpanCount(null);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.c -= ((d0) this.f.e0.a.getValue()).c(view);
        }
        if (size == 1) {
            this.d = Integer.MIN_VALUE;
        }
        this.e = Integer.MIN_VALUE;
    }

    public final void l() {
        View view;
        Object removeFirst;
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.b;
        if (i >= 35) {
            removeFirst = arrayList.removeFirst();
            view = (View) removeFirst;
        } else {
            view = (View) arrayList.remove(0);
        }
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.setSpan(null);
        layoutParams.setSpanCount(null);
        if (arrayList.isEmpty()) {
            this.e = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.c -= ((d0) this.f.e0.a.getValue()).c(view);
        }
        this.d = Integer.MIN_VALUE;
    }

    public final void m(View view) {
        FlexibleGridLayoutManager.LayoutParams layoutParams = (FlexibleGridLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutParams.getSpan() == null) {
            layoutParams.setSpan(this);
        }
        ArrayList arrayList = this.b;
        arrayList.add(0, view);
        this.d = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.e = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.c = ((d0) this.f.e0.a.getValue()).c(view) + this.c;
        }
    }
}
