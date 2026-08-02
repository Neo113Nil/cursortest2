package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Lazy;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;

/* compiled from: PostponedPostsMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class zrc0 extends evg0<nsc0, on50, usc0, zsc0, lsc0, wrc0> {
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zrc0(qn60 qn60Var, pn60 pn60Var, Lazy lazy, esc0 esc0Var, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = qn60Var;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, lazy, aVar, new eht(this, esc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((usc0) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.m;
        qn60 qn60Var = this.f;
        kq60 kq60Var = this.h;
        if (z) {
            NewsEntry newsEntry = ((NewsfeedExternalAction.c.m) cVar).a;
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                if (post.Z1()) {
                    Object f = qn60Var.f(new pxf0(post.n, post.m));
                    if (!(f instanceof Result.Failure)) {
                        qn60.c cVar2 = (qn60.c) f;
                        e(new ksc0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                    }
                    Throwable a = Result.a(f);
                    if (a == null) {
                        return null;
                    }
                    com.vk.metrics.eventtracking.b.a.a(a);
                    return null;
                }
            }
            kq60Var.s(bVar);
            return null;
        }
        if (!(cVar instanceof NewsfeedExternalAction.c.f0)) {
            kq60Var.s(bVar);
            return null;
        }
        NewsEntry newsEntry2 = ((NewsfeedExternalAction.c.f0) cVar).a;
        if (newsEntry2 instanceof Post) {
            Post post2 = (Post) newsEntry2;
            if (post2.Z1()) {
                Object f2 = qn60Var.f(new pxf0(post2.n, post2.m));
                if (!(f2 instanceof Result.Failure)) {
                    qn60.c cVar3 = (qn60.c) f2;
                    e(new ksc0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
                }
                Throwable a2 = Result.a(f2);
                if (a2 == null) {
                    return null;
                }
                com.vk.metrics.eventtracking.b.a.a(a2);
                return null;
            }
        }
        kq60Var.s(bVar);
        Object f3 = qn60Var.f(new ffk0(this.g));
        if (!(f3 instanceof Result.Failure)) {
            qn60.c cVar4 = (qn60.c) f3;
            e(new ksc0(new qr60.a.c(cVar4.a, cVar4.b, false, null, 24)));
        }
        Throwable a3 = Result.a(f3);
        if (a3 == null) {
            return null;
        }
        com.vk.metrics.eventtracking.b.a.a(a3);
        return null;
    }
}
