package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PaginationScrollListener.kt */
/* loaded from: classes16.dex */
public final class ye90 extends RecyclerView.t {
    public final int b = 6;
    public final gzs<s3q0> c;

    public ye90(gzs gzsVar) {
        this.c = gzsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.x() > linearLayoutManager.getItemCount() - this.b) {
            this.c.invoke();
        }
    }
}
