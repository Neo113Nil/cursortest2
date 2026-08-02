package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import defpackage.unr0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class g1 {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public g1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static StaggeredGridLayoutManager.LayoutParams m(View view) {
        return (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
    }

    public final void a(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
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

    public final void b(int i, boolean z) {
        int k = z ? k(Integer.MIN_VALUE) : o(Integer.MIN_VALUE);
        e();
        if (k == Integer.MIN_VALUE) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        if (!z || k >= staggeredGridLayoutManager.L.g()) {
            if (z || k <= staggeredGridLayoutManager.L.k()) {
                if (i != Integer.MIN_VALUE) {
                    k += i;
                }
                this.c = k;
                this.b = k;
            }
        }
    }

    public final void c() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = (View) unr0.k(1, this.a);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.c = staggeredGridLayoutManager.L.b(view);
        if (layoutParams.mFullSpan && (f = staggeredGridLayoutManager.V.f(layoutParams.getViewLayoutPosition())) != null && f.mGapDir == 1) {
            this.c += f.getGapForSpan(this.e);
        }
    }

    public final void d() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = (View) this.a.get(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.b = staggeredGridLayoutManager.L.e(view);
        if (layoutParams.mFullSpan && (f = staggeredGridLayoutManager.V.f(layoutParams.getViewLayoutPosition())) != null && f.mGapDir == -1) {
            this.b -= f.getGapForSpan(this.e);
        }
    }

    public final void e() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int f() {
        return this.f.Q ? h(r1.size() - 1, -1, false, false, true) : h(0, this.a.size(), false, false, true);
    }

    public final int g() {
        return this.f.Q ? h(0, this.a.size(), false, false, true) : h(r1.size() - 1, -1, false, false, true);
    }

    public final int h(int i, int i2, boolean z, boolean z2, boolean z3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int k = staggeredGridLayoutManager.L.k();
        int g = staggeredGridLayoutManager.L.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int e = staggeredGridLayoutManager.L.e(view);
            int b = staggeredGridLayoutManager.L.b(view);
            boolean z4 = false;
            boolean z5 = !z3 ? e >= g : e > g;
            if (!z3 ? b > k : b >= k) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z && z2) {
                    if (e >= k && b <= g) {
                        return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
                    }
                } else {
                    if (z2) {
                        return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
                    }
                    if (e < k || b > g) {
                        return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
                    }
                }
            }
            i += i3;
        }
        return -1;
    }

    public final int i() {
        return this.d;
    }

    public final int j() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        c();
        return this.c;
    }

    public final int k(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        c();
        return this.c;
    }

    public final View l(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.Q && RecyclerView.e.r0(view2) >= i) || ((!staggeredGridLayoutManager.Q && RecyclerView.e.r0(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.Q && RecyclerView.e.r0(view3) <= i) || ((!staggeredGridLayoutManager.Q && RecyclerView.e.r0(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int n() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        d();
        return this.b;
    }

    public final int o(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        d();
        return this.b;
    }

    public final void p(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void q() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = null;
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d -= this.f.L.c(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void r() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.remove(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.mSpan = null;
        if (arrayList.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.d -= this.f.L.c(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void s(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
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

    public final void t(int i) {
        this.b = i;
        this.c = i;
    }
}
