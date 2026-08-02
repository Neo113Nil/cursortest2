package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DiscoverMediaInitDecorationsAction.kt */
/* loaded from: classes4.dex */
public final class n3n extends gux {
    public final RecyclerView a;
    public final r3n b;

    public n3n(RecyclerView recyclerView, r3n r3nVar) {
        this.a = recyclerView;
        this.b = r3nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gux
    public final void a() {
        r3n r3nVar = this.b;
        o3n o3nVar = (o3n) r3nVar.h.getValue();
        RecyclerView recyclerView = this.a;
        recyclerView.addItemDecoration(o3nVar);
        recyclerView.addItemDecoration(r3nVar.b());
    }
}
