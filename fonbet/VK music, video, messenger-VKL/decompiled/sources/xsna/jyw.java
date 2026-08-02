package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InitDiscoverMediaDecorationsAction.kt */
/* loaded from: classes4.dex */
public final class jyw extends gux {
    public final RecyclerView a;
    public final fhl b;

    public jyw(RecyclerView recyclerView, fhl fhlVar) {
        this.a = recyclerView;
        this.b = fhlVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gux
    public final void a() {
        fhl fhlVar = this.b;
        o3n o3nVar = (o3n) fhlVar.j.getValue();
        RecyclerView recyclerView = this.a;
        recyclerView.addItemDecoration(o3nVar);
        recyclerView.addItemDecoration(fhlVar.b());
    }
}
