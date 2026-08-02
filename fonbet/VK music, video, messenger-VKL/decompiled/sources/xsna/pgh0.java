package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollToTopDataObserver.kt */
/* loaded from: classes7.dex */
public final class pgh0 extends RecyclerView.i {
    public final RecyclerView a;

    public pgh0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && i == 0 && linearLayoutManager.v() == 0) {
            recyclerView.post(new tsk(this, 8));
        }
    }
}
