package xsna;

import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.hux;

/* compiled from: DefaultItemDecorationsManager.kt */
/* loaded from: classes4.dex */
public final class ghl implements iux {
    public final RecyclerView a;
    public final RecyclerPaginatedView b;
    public final fhl c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new jpf(this, 10));

    public ghl(RecyclerView recyclerView, RecyclerPaginatedView recyclerPaginatedView, fhl fhlVar) {
        this.a = recyclerView;
        this.b = recyclerPaginatedView;
        this.c = fhlVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iux
    public final void a(hux huxVar) {
        gux hicVar;
        gux yyi0Var;
        ArrayList o;
        boolean z = huxVar instanceof hux.c;
        fhl fhlVar = this.c;
        RecyclerView recyclerView = this.a;
        if (z) {
            hux.c cVar = (hux.c) huxVar;
            if (epx.f(cVar, hux.c.C3024c.a)) {
                hicVar = new myw(recyclerView, fhlVar);
            } else if (epx.f(cVar, hux.c.d.a)) {
                hicVar = new yyw(recyclerView, fhlVar);
            } else if (epx.f(cVar, hux.c.b.a)) {
                hicVar = new jyw(recyclerView, fhlVar);
            } else {
                if (!epx.f(cVar, hux.c.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hicVar = new jxw(recyclerView);
            }
        } else {
            PointF pointF = null;
            if (huxVar instanceof hux.f) {
                hux.f fVar = (hux.f) huxVar;
                boolean z2 = recyclerView instanceof FeedRecyclerView;
                ?? r6 = this.d;
                RecyclerPaginatedView recyclerPaginatedView = this.b;
                if (!z2) {
                    if (recyclerView instanceof UsableRecyclerView) {
                        boolean z3 = fVar instanceof hux.f.b;
                        if (z3) {
                            o = e43.o(new y0g0(recyclerView, fhlVar.f()), new y0g0(recyclerView, fhlVar.b()), new y0g0(recyclerView, fhlVar.e()), new m1z(new x0z((UsableRecyclerView) recyclerView, fhlVar.a()), new y0g0(recyclerView, fhlVar.a())), new p1z(recyclerPaginatedView, ((Boolean) r6.getValue()).booleanValue()));
                        } else if (fVar instanceof hux.f.c) {
                            o = e43.o(new y0g0(recyclerView, fhlVar.f()), new y0g0(recyclerView, fhlVar.b()), new y0g0(recyclerView, fhlVar.e()), new m1z(new x0z((UsableRecyclerView) recyclerView, fhlVar.a()), new y0g0(recyclerView, fhlVar.a())), new o1z(recyclerPaginatedView, ((Boolean) r6.getValue()).booleanValue()));
                        } else {
                            if (!(fVar instanceof hux.f.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o = e43.o(new y0g0(recyclerView, fhlVar.b()), new n1z(new u8q0(recyclerPaginatedView), new y0g0(recyclerView, (o3n) fhlVar.j.getValue())));
                        }
                        if (z3 || (fVar instanceof hux.f.c)) {
                            o.add(new y0g0(recyclerView, fhlVar.g()));
                        }
                        hicVar = new tsi(o);
                    }
                    hicVar = null;
                } else if (fVar instanceof hux.f.b) {
                    hicVar = new w8q0(recyclerPaginatedView.getRecyclerView(), ((Boolean) r6.getValue()).booleanValue());
                } else if (fVar instanceof hux.f.c) {
                    hicVar = new v8q0(recyclerView);
                } else {
                    if (!(fVar instanceof hux.f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hicVar = new u8q0(recyclerPaginatedView);
                }
            } else {
                if (huxVar instanceof hux.b) {
                    hux.b bVar = (hux.b) huxVar;
                    if (!(bVar instanceof hux.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g7o a = fhlVar.a();
                    hux.b.a aVar = (hux.b.a) bVar;
                    NewsEntry newsEntry = aVar.a;
                    String str = aVar.b;
                    if (recyclerView instanceof FeedRecyclerView) {
                        pointF = ((FeedRecyclerView) recyclerView).getLastTouchPoint();
                    } else if (recyclerView instanceof UsableRecyclerView) {
                        pointF = ((UsableRecyclerView) recyclerView).getLastTouchPoint();
                    }
                    yyi0Var = new d7o(a, newsEntry, str, pointF);
                } else if (huxVar instanceof hux.a) {
                    hux.a aVar2 = (hux.a) huxVar;
                    if (epx.f(aVar2, hux.a.C3023a.a)) {
                        hicVar = new a0n(fhlVar.b());
                    } else if (epx.f(aVar2, hux.a.b.a)) {
                        hicVar = new iip(fhlVar.b());
                    } else {
                        if (!(aVar2 instanceof hux.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yyi0Var = new yyi0(fhlVar.b(), ((hux.a.c) aVar2).a);
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
