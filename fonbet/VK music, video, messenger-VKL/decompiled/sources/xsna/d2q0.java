package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UiViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class d2q0 implements RecyclerView.q {
    public final /* synthetic */ c2q0<Object> b;

    public d2q0(c2q0<Object> c2q0Var) {
        this.b = c2q0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
        c2q0<Object> c2q0Var = this.b;
        c2q0<Object> remove = c2q0Var.n.remove(view);
        if (remove != null) {
            remove.b();
            RecyclerView recyclerView = remove.b;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(remove.q);
            }
            recyclerView.removeOnScrollListener(remove.p);
            recyclerView.removeOnAttachStateChangeListener(remove.t);
            d2q0 d2q0Var = remove.m;
            if (d2q0Var != null) {
                recyclerView.removeOnChildAttachStateChangeListener(d2q0Var);
            }
        }
        if (c2q0Var.o.remove(view) == null) {
            return;
        }
        System.currentTimeMillis();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        this.b.j(view, view);
    }
}
