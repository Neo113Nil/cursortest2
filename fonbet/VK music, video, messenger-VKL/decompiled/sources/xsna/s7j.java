package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConsumingRecyclerViewScroller.kt */
/* loaded from: classes2.dex */
public final class s7j extends RecyclerView.t {
    public final RecyclerView b;
    public int c;
    public int d;

    public s7j(RecyclerView recyclerView) {
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
