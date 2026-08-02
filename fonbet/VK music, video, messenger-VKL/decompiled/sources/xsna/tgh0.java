package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollToTopOnAdapterUpdateObserver.kt */
/* loaded from: classes17.dex */
public final class tgh0 extends RecyclerView.i {
    public final RecyclerView a;
    public final qgh0 b;

    public tgh0(RecyclerView recyclerView, qgh0 qgh0Var) {
        this.a = recyclerView;
        this.b = qgh0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        if (i == 0) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void f(int i, int i2) {
        if (i == 0 || i2 == 0) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void g(int i, int i2) {
        if (i == 0) {
            i();
        }
    }

    public final void i() {
        RecyclerView recyclerView = this.a;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.v() > 0) {
            return;
        }
        this.b.a(recyclerView);
    }
}
