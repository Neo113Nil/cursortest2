package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewExt.kt */
/* loaded from: classes17.dex */
public final class wjf0 {
    public static final RecyclerView.e0 a(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(i)) == null || recyclerView.getLayoutParams() == null) {
            return null;
        }
        return recyclerView.getChildViewHolder(findViewByPosition);
    }

    public static final ujf0 b(RecyclerView.Adapter adapter, gzs gzsVar) {
        ujf0 ujf0Var = new ujf0(new Object(), gzsVar);
        adapter.registerAdapterDataObserver(ujf0Var);
        return ujf0Var;
    }

    public static final void c(RecyclerView recyclerView, gzs<s3q0> gzsVar) {
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new e50(6, recyclerView, gzsVar));
        } else {
            gzsVar.invoke();
        }
    }

    public static final void d(RecyclerView recyclerView) {
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new nf0(recyclerView, 11));
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
