package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;

/* loaded from: classes.dex */
public abstract class e1 extends RecyclerView.f {
    public RecyclerView a;
    public Scroller b;
    public final c1 c = new c1(this);

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean a(int i, int i2) {
        RecyclerView.j d;
        int f;
        RecyclerView.e layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof u0) || (d = d(layoutManager)) == null || (f = f(layoutManager, i, i2)) == -1) {
            return false;
        }
        d.a = f;
        layoutManager.v(d);
        return true;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        c1 c1Var = this.c;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c1Var);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                ny61.r("An instance of OnFlingListener already set.");
                return;
            }
            this.a.addOnScrollListener(c1Var);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(RecyclerView.e eVar, View view);

    public RecyclerView.j d(RecyclerView.e eVar) {
        if (eVar instanceof u0) {
            return new d1(this, this.a.getContext());
        }
        return null;
    }

    public abstract View e(RecyclerView.e eVar);

    public abstract int f(RecyclerView.e eVar, int i, int i2);

    public final void g() {
        RecyclerView.e layoutManager;
        View e;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e = e(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, e);
        int i = c[0];
        if (i == 0 && c[1] == 0) {
            return;
        }
        this.a.smoothScrollBy(i, c[1]);
    }
}
