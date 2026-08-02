package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.unr0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class n {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ FlexStaggeredGridLayoutManager f;

    public n(FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager, int i) {
        this.f = flexStaggeredGridLayoutManager;
        this.e = i;
    }

    public final void a(View view) {
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = this;
        ArrayList arrayList = this.a;
        arrayList.add(view);
        this.c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d = this.f.L.c(view) + this.d;
        }
    }

    public final void b() {
        FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = (View) unr0.k(1, this.a);
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = this.f;
        this.c = flexStaggeredGridLayoutManager.L.b(view);
        if (layoutParams.isFullSpan() && (f = flexStaggeredGridLayoutManager.V.f(layoutParams.getViewLayoutPosition())) != null && f.mGapDir == 1) {
            this.c += f.getGapForSpan(this.e);
        }
    }

    public final void c() {
        FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = (View) this.a.get(0);
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = this.f;
        this.b = flexStaggeredGridLayoutManager.L.e(view);
        if (layoutParams.isFullSpan() && (f = flexStaggeredGridLayoutManager.V.f(layoutParams.getViewLayoutPosition())) != null && f.mGapDir == -1) {
            this.b -= f.getGapForSpan(this.e);
        }
    }

    public final void d() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int e() {
        return this.f.Q ? g(r1.size() - 1, -1) : g(0, this.a.size());
    }

    public final int f() {
        return this.f.Q ? g(0, this.a.size()) : g(r1.size() - 1, -1);
    }

    public final int g(int i, int i2) {
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = this.f;
        int k = flexStaggeredGridLayoutManager.L.k();
        int g = flexStaggeredGridLayoutManager.L.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int e = flexStaggeredGridLayoutManager.L.e(view);
            int b = flexStaggeredGridLayoutManager.L.b(view);
            boolean z = e <= g;
            boolean z2 = b >= k;
            if (z && z2 && (e < k || b > g)) {
                return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
            }
            i += i3;
        }
        return -1;
    }

    public final int h(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public final View i(int i, int i2) {
        FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((flexStaggeredGridLayoutManager.Q && RecyclerView.e.r0(view2) >= i) || ((!flexStaggeredGridLayoutManager.Q && RecyclerView.e.r0(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((flexStaggeredGridLayoutManager.Q && RecyclerView.e.r0(view3) <= i) || ((!flexStaggeredGridLayoutManager.Q && RecyclerView.e.r0(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public final void k() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = null;
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d -= this.f.L.c(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void l() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.remove(0);
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = null;
        if (arrayList.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d -= this.f.L.c(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void m(View view) {
        FlexStaggeredGridLayoutManager.LayoutParams layoutParams = (FlexStaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = this;
        ArrayList arrayList = this.a;
        arrayList.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d = this.f.L.c(view) + this.d;
        }
    }
}
