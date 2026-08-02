package xsna;

import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: DefaultCommentsListThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class pcl extends nfg {
    public final boolean i;
    public boolean j;

    public pcl(ListDataSet<cbg> listDataSet, dbg dbgVar, d9c0 d9c0Var, boolean z) {
        super(listDataSet, dbgVar, d9c0Var);
        this.i = z;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.nfg
    public final void c(int i, iag iagVar) {
        if (this.j) {
            return;
        }
        this.j = true;
        NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
        if (newsComment == null) {
            return;
        }
        CommentThread commentThread = ((NewsComment) iagVar).L;
        String str = commentThread != null ? commentThread.h : null;
        int b = b(newsComment);
        if (b >= 0) {
            this.a.c(b).d = Boolean.TRUE;
        }
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.d, this.e, i, this.f, true, this.g, false, this.h, true, true, 2);
        aVar.E = str;
        aVar.I = Integer.valueOf(newsComment.i);
        aVar.L = 0;
        aVar.K = Boolean.valueOf(this.i);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        a2b a2bVar = new a2b(this, 1);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        this.c.a(new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, a2bVar), lVar, new g66(this, 3)).subscribe(new h60(new qb6(10, this, newsComment), 20), new xf1(new gb(13, this, newsComment), 17)));
    }
}
