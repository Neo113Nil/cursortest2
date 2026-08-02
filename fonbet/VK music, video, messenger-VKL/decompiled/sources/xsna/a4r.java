package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.hux;

/* compiled from: FeedRecyclerViewHolder.kt */
/* loaded from: classes4.dex */
public final class a4r implements kb80 {
    public RecyclerView c;
    public RecyclerView.l d;
    public i6k0 e;
    public iux f;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final int[] b = {0, 0};
    public final dui g = new dui();

    @Override // xsna.kb80
    public final void a(jb80 jb80Var) {
        this.g.b.add(jb80Var);
    }

    public final void b() {
        iux iuxVar = this.f;
        if (iuxVar != null) {
            iuxVar.a(hux.e.a.a);
        }
        iux iuxVar2 = this.f;
        if (iuxVar2 != null) {
            iuxVar2.a(hux.d.a.a);
        }
        i6k0 i6k0Var = this.e;
        if (i6k0Var != null) {
            i6k0Var.d.removeCallbacksAndMessages(null);
        }
        this.a.removeCallbacksAndMessages(null);
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.g);
        }
    }

    public final void c() {
        this.c = null;
        this.e = null;
    }

    public final void d(gzs<s3q0> gzsVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            return;
        }
        this.a.postDelayed(new r0a(this, recyclerView.getItemAnimator(), gzsVar, 3), 100L);
    }

    public final void e(boolean z) {
        RecyclerView.l itemAnimator;
        final x3r x3rVar = new x3r(this, z);
        RecyclerView recyclerView = this.c;
        if (recyclerView == null || (itemAnimator = recyclerView.getItemAnimator()) == null) {
            x3rVar.invoke();
        } else {
            itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.y3r
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    x3r.this.invoke();
                }
            });
        }
    }

    public final int f() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.v();
        }
        return 0;
    }

    public final void g(hux huxVar) {
        iux iuxVar = this.f;
        if (iuxVar != null) {
            iuxVar.a(huxVar);
        }
    }

    public final void h(RecyclerView recyclerView) {
        RecyclerView.l itemAnimator;
        this.c = recyclerView;
        this.e = new i6k0(recyclerView);
        recyclerView.addOnScrollListener(this.g);
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 != null && (itemAnimator = recyclerView2.getItemAnimator()) != null) {
            this.d = itemAnimator;
            if (itemAnimator instanceof androidx.recyclerview.widget.n0) {
                ((androidx.recyclerview.widget.n0) itemAnimator).g = false;
            }
        }
        RecyclerView recyclerView3 = this.c;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
    }

    public final void i(gzs<s3q0> gzsVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            wjf0.c(recyclerView, gzsVar);
        }
    }

    public final void j(int i, int i2, View view) {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            return;
        }
        int[] iArr = this.b;
        recyclerView.getLocationOnScreen(iArr);
        int a0 = rl3.a0(iArr);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.K(i, (((view != null ? view.getBottom() : iah0.f().heightPixels) - ify.d(3, null)) - i2) - a0);
    }
}
