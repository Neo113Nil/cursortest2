package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConsumingRecyclerViewScroller.kt */
/* loaded from: classes5.dex */
public final class r7j extends RecyclerView.t {
    public final RecyclerView b;
    public int c;
    public int d;

    public r7j(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.addOnScrollListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.c += i;
        this.d += i2;
    }
}
