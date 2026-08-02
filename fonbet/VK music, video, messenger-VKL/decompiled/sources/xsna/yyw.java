package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;

/* compiled from: InitWallDecorationsAction.kt */
/* loaded from: classes4.dex */
public final class yyw extends gux {
    public final RecyclerView a;
    public final fhl b;

    public yyw(RecyclerView recyclerView, fhl fhlVar) {
        this.a = recyclerView;
        this.b = fhlVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gux
    public final void a() {
        RecyclerView.n d;
        fhl fhlVar = this.b;
        ren h = fhlVar.h();
        RecyclerView recyclerView = this.a;
        recyclerView.addItemDecoration(h);
        recyclerView.addItemDecoration(fhlVar.f());
        recyclerView.addItemDecoration(fhlVar.b());
        j2c0 g = fhlVar.g();
        if (g != null) {
            recyclerView.addItemDecoration(g);
        }
        recyclerView.addItemDecoration(fhlVar.a());
        recyclerView.addItemDecoration((kzd0) fhlVar.h.getValue());
        recyclerView.addItemDecoration(fhlVar.e());
        if (com.vk.toggle.d.i() && (d = fhlVar.d()) != null) {
            recyclerView.addItemDecoration(d);
        }
        recyclerView.getContext();
        new c7o((FeedRecyclerView) recyclerView, fhlVar.a()).a();
    }
}
