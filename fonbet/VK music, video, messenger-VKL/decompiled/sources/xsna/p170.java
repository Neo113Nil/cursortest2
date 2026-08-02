package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedWatcherScrollListener.kt */
/* loaded from: classes4.dex */
public final class p170 extends RecyclerView.t {
    public final ib60 b;

    public p170(ib60 ib60Var) {
        this.b = ib60Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.b.d(recyclerView, i);
    }
}
