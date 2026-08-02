package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ReplaceItemDecorationAction.kt */
/* loaded from: classes4.dex */
public final class y0g0 extends gux {
    public final RecyclerView a;
    public final RecyclerView.n b;

    public y0g0(RecyclerView recyclerView, RecyclerView.n nVar) {
        this.a = recyclerView;
        this.b = nVar;
    }

    @Override // xsna.gux
    public final void a() {
        RecyclerView recyclerView = this.a;
        RecyclerView.n nVar = this.b;
        recyclerView.removeItemDecoration(nVar);
        recyclerView.addItemDecoration(nVar);
    }
}
