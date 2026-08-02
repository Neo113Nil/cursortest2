package xsna;

import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.hux;

/* compiled from: NewsfeedItemDecorationsManager.kt */
/* loaded from: classes4.dex */
public final class sm60 implements iux {
    public final RecyclerView a;
    public final rm60 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new lo10(this, 7));

    public sm60(RecyclerView recyclerView, rm60 rm60Var) {
        this.a = recyclerView;
        this.b = rm60Var;
    }

    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iux
    public final void a(hux huxVar) {
        gux oicVar;
        gux mm0Var;
        boolean z = huxVar instanceof hux.c;
        rm60 rm60Var = this.b;
        gux guxVar = null;
        guxVar = null;
        guxVar = null;
        guxVar = null;
        guxVar = null;
        guxVar = null;
        guxVar = null;
        PointF lastTouchPoint = null;
        RecyclerView recyclerView = this.a;
        if (z) {
            hux.c cVar = (hux.c) huxVar;
            if (epx.f(cVar, hux.c.C3024c.a)) {
                guxVar = new myw(recyclerView, rm60Var);
            } else if (!epx.f(cVar, hux.c.d.a) && !epx.f(cVar, hux.c.b.a) && !epx.f(cVar, hux.c.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (huxVar instanceof hux.f) {
            hux.f fVar = (hux.f) huxVar;
            if (recyclerView instanceof FeedRecyclerView) {
                if (fVar instanceof hux.f.b) {
                    guxVar = new w8q0(recyclerView, ((Boolean) this.c.getValue()).booleanValue());
                } else if (!(fVar instanceof hux.f.c) && !(fVar instanceof hux.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (huxVar instanceof hux.b) {
                hux.b bVar = (hux.b) huxVar;
                if (!(bVar instanceof hux.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                g7o a = rm60Var.a();
                hux.b.a aVar = (hux.b.a) bVar;
                NewsEntry newsEntry = aVar.a;
                String str = aVar.b;
                if (recyclerView instanceof FeedRecyclerView) {
                    lastTouchPoint = ((FeedRecyclerView) recyclerView).getLastTouchPoint();
                } else if (recyclerView instanceof UsableRecyclerView) {
                    lastTouchPoint = ((UsableRecyclerView) recyclerView).getLastTouchPoint();
                }
                mm0Var = new d7o(a, newsEntry, str, lastTouchPoint);
            } else if (huxVar instanceof hux.a) {
                hux.a aVar2 = (hux.a) huxVar;
                if (epx.f(aVar2, hux.a.C3023a.a)) {
                    oicVar = new a0n(rm60Var.b());
                } else if (epx.f(aVar2, hux.a.b.a)) {
                    oicVar = new iip(rm60Var.b());
                } else {
                    if (!(aVar2 instanceof hux.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mm0Var = new yyi0(rm60Var.b(), ((hux.a.c) aVar2).a);
                }
                guxVar = oicVar;
            } else if (huxVar instanceof hux.e) {
                if (!epx.f((hux.e) huxVar, hux.e.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (recyclerView instanceof UsableRecyclerView) {
                    guxVar = new hic((UsableRecyclerView) recyclerView);
                }
            } else {
                if (!(huxVar instanceof hux.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                hux.d dVar = (hux.d) huxVar;
                if (dVar instanceof hux.d.b) {
                    mm0Var = new mm0(rm60Var.c(), ((hux.d.b) dVar).a);
                } else {
                    if (!(dVar instanceof hux.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oicVar = new oic(rm60Var.c());
                    guxVar = oicVar;
                }
            }
            guxVar = mm0Var;
        }
        if (guxVar == null) {
            return;
        }
        new rzg0(recyclerView, guxVar).a();
    }
}
