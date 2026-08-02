package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.hux;

/* compiled from: DiscoverMediaItemDecorationsManager.kt */
/* loaded from: classes4.dex */
public final class s3n implements iux {
    public final RecyclerView a;
    public final r3n b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new bzj(this, 6));

    public s3n(RecyclerView recyclerView, r3n r3nVar) {
        this.a = recyclerView;
        this.b = r3nVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iux
    public final void a(hux huxVar) {
        gux hicVar;
        gux yyi0Var;
        boolean z = huxVar instanceof hux.c;
        r3n r3nVar = this.b;
        RecyclerView recyclerView = this.a;
        if (z) {
            hicVar = new n3n(recyclerView, r3nVar);
        } else {
            if (huxVar instanceof hux.f) {
                hux.f fVar = (hux.f) huxVar;
                if (recyclerView instanceof FeedRecyclerView) {
                    if ((fVar instanceof hux.f.b) || (fVar instanceof hux.f.c)) {
                        hicVar = new w8q0(recyclerView, ((Boolean) this.c.getValue()).booleanValue());
                    } else {
                        if (!(fVar instanceof hux.f.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hicVar = new z5n(recyclerView);
                    }
                }
                hicVar = null;
            } else {
                if (huxVar instanceof hux.b) {
                    hux.b bVar = (hux.b) huxVar;
                    if (!(bVar instanceof hux.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hux.b.a aVar = (hux.b.a) bVar;
                    yyi0Var = new d7o(r3nVar.a(), aVar.a, aVar.b, recyclerView instanceof FeedRecyclerView ? ((FeedRecyclerView) recyclerView).getLastTouchPoint() : null);
                } else if (huxVar instanceof hux.a) {
                    hux.a aVar2 = (hux.a) huxVar;
                    if (epx.f(aVar2, hux.a.C3023a.a)) {
                        hicVar = new a0n(r3nVar.b());
                    } else if (epx.f(aVar2, hux.a.b.a)) {
                        hicVar = new iip(r3nVar.b());
                    } else {
                        if (!(aVar2 instanceof hux.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yyi0Var = new yyi0(r3nVar.b(), ((hux.a.c) aVar2).a);
                    }
                } else {
                    if (huxVar instanceof hux.e) {
                        if (!epx.f((hux.e) huxVar, hux.e.a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (recyclerView instanceof UsableRecyclerView) {
                            hicVar = new hic((UsableRecyclerView) recyclerView);
                        }
                    } else if (!(huxVar instanceof hux.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hicVar = null;
                }
                hicVar = yyi0Var;
            }
        }
        if (hicVar == null) {
            return;
        }
        new rzg0(recyclerView, hicVar).a();
    }
}
