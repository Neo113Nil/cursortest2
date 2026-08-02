package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.m5u;

/* compiled from: GoodPreviewPagingScrollListener.kt */
/* loaded from: classes18.dex */
public final class x6u extends RecyclerView.t {
    public final sop b;

    public x6u(sop sopVar) {
        this.b = sopVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int w = gridLayoutManager.w();
        n5u n5uVar = (n5u) recyclerView.getAdapter();
        boolean z = w > -1;
        boolean z2 = w == gridLayoutManager.getItemCount() - 1;
        if (z && z2 && !(n5uVar.h.get(w) instanceof r6u)) {
            this.b.invoke(m5u.l.b);
        }
    }
}
