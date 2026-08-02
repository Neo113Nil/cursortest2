package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div2.DivSizeUnit;
import defpackage.bql;
import defpackage.oj91;
import defpackage.w511;
import defpackage.w890;
import defpackage.ypl;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public class a extends oj91 {
    public final DivRecyclerView b;
    public final Direction c;
    public final DisplayMetrics d;

    public a(DivRecyclerView divRecyclerView, Direction direction) {
        this.b = divRecyclerView;
        this.c = direction;
        this.d = divRecyclerView.getResources().getDisplayMetrics();
    }

    @Override // defpackage.oj91
    public final int c() {
        int H1;
        DivRecyclerView divRecyclerView = this.b;
        LinearLayoutManager b = d.b(divRecyclerView);
        Direction direction = this.c;
        if (b == null) {
            H1 = -1;
        } else {
            int i = bql.a[direction.ordinal()];
            if (i == 1) {
                H1 = b.H1();
            } else {
                if (i != 2) {
                    w511.b();
                    return 0;
                }
                LinearLayoutManager b2 = d.b(divRecyclerView);
                Integer valueOf = b2 != null ? Integer.valueOf(b2.J) : null;
                H1 = (valueOf != null && valueOf.intValue() == 0) ? divRecyclerView.canScrollHorizontally(1) : (valueOf != null && valueOf.intValue() == 1) ? divRecyclerView.canScrollVertically(1) : false ? b.H1() : b.L1();
            }
        }
        Integer valueOf2 = H1 != -1 ? Integer.valueOf(H1) : null;
        if (valueOf2 != null) {
            return valueOf2.intValue();
        }
        LinearLayoutManager b3 = d.b(divRecyclerView);
        if (b3 == null) {
            return -1;
        }
        int i2 = bql.a[direction.ordinal()];
        if (i2 == 1) {
            return b3.M1();
        }
        if (i2 == 2) {
            return b3.K1();
        }
        w511.b();
        return 0;
    }

    @Override // defpackage.oj91
    public final List d(String str) {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        com.yandex.div.core.view2.divs.gallery.a aVar = adapter instanceof com.yandex.div.core.view2.divs.gallery.a ? (com.yandex.div.core.view2.divs.gallery.a) adapter : null;
        return aVar == null ? EmptyList.a : d.a(aVar.g(), str, DivViewWithItems$Gallery$getIndicesOfItemWithId$1.w);
    }

    @Override // defpackage.oj91
    public final int e() {
        RecyclerView.e layoutManager = this.b.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.getItemCount();
        }
        return 0;
    }

    @Override // defpackage.oj91
    public final DisplayMetrics f() {
        return this.d;
    }

    @Override // defpackage.oj91
    public final int g() {
        DivRecyclerView divRecyclerView = this.b;
        LinearLayoutManager b = d.b(divRecyclerView);
        Integer valueOf = b != null ? Integer.valueOf(b.J) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? divRecyclerView.computeHorizontalScrollOffset() : divRecyclerView.computeVerticalScrollOffset();
    }

    @Override // defpackage.oj91
    public final int h() {
        return d.c(this.b);
    }

    @Override // defpackage.oj91
    public final void i(int i, DivSizeUnit divSizeUnit, boolean z) {
        d.d(this.b, i, divSizeUnit, this.d, z);
    }

    @Override // defpackage.oj91
    public final void j(boolean z) {
        DivRecyclerView divRecyclerView = this.b;
        d.d(divRecyclerView, d.c(divRecyclerView), DivSizeUnit.PX, this.d, z);
    }

    @Override // defpackage.oj91
    public final void k(int i) {
        int e = e();
        if (i < 0 || i >= e) {
            return;
        }
        RecyclerView.j n = n();
        n.a = i;
        RecyclerView.e layoutManager = this.b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.v(n);
        }
    }

    @Override // defpackage.oj91
    public final void l(int i) {
        zy11 zy11Var;
        int e = e();
        if (i < 0 || i >= e) {
            return;
        }
        DivRecyclerView divRecyclerView = this.b;
        w890 pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
        if (pagerSnapStartHelper != null) {
            o(pagerSnapStartHelper, i, true);
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            divRecyclerView.scrollToPosition(i);
        }
    }

    public RecyclerView.j n() {
        return new ypl(this.b.getContext());
    }

    public final void o(final w890 w890Var, final int i, boolean z) {
        DivRecyclerView divRecyclerView = this.b;
        RecyclerView.e layoutManager = divRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        View X = layoutManager.X(i);
        if (X != null) {
            int[] c = w890Var.c(layoutManager, X);
            divRecyclerView.scrollBy(c[0], c[1]);
        } else if (z) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$snapToPosition$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    a.this.o(w890Var, i, false);
                }
            });
            divRecyclerView.scrollToPosition(i);
        }
    }
}
