package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import java.util.HashSet;

/* compiled from: InitFeedDecorationsAction.kt */
/* loaded from: classes4.dex */
public final class myw extends gux {
    public final RecyclerView a;
    public final z0r b;

    public myw(RecyclerView recyclerView, z0r z0rVar) {
        this.a = recyclerView;
        this.b = z0rVar;
    }

    @Override // xsna.gux
    public final void a() {
        RecyclerView.n d;
        RecyclerView recyclerView = this.a;
        Context context = recyclerView.getContext();
        HashSet hashSet = iah0.a;
        boolean d2 = fnj.d(context);
        z0r z0rVar = this.b;
        recyclerView.addItemDecoration(z0rVar.h());
        recyclerView.addItemDecoration(z0rVar.f());
        recyclerView.addItemDecoration(z0rVar.b());
        j2c0 g = z0rVar.g();
        if (g != null) {
            recyclerView.addItemDecoration(g);
        }
        recyclerView.addItemDecoration(z0rVar.a());
        if (d2) {
            recyclerView.addItemDecoration(z0rVar.i());
        }
        recyclerView.addItemDecoration(z0rVar.e());
        if (com.vk.toggle.d.i() && (d = z0rVar.d()) != null) {
            recyclerView.addItemDecoration(d);
        }
        recyclerView.getContext();
        b2r c = z0rVar.c();
        if (c != null) {
            recyclerView.addItemDecoration(c);
        }
        new c7o((FeedRecyclerView) recyclerView, z0rVar.a()).a();
    }
}
