package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;

/* compiled from: PostExternalTaskMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class x2c0 extends evg0<m5c0, on50, u5c0, t5c0, h5c0, d5c0> {
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x2c0(es60 es60Var, g5c0 g5c0Var, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        qn60 qn60Var = es60Var.a;
        this.f = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, es60Var.e, aVar, new eht(this, g5c0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((u5c0) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.l0;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new com.vk.newsfeed.impl.presentation.newsfeed.editor.actions.a(((NewsfeedExternalAction.c.l0) cVar).a, pn60Var)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar2 = (qn60.c) b;
                nn50Var.e(new j5c0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a == null) {
                return null;
            }
            com.vk.metrics.eventtracking.b.a.a(a);
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.k0) {
            Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new com.vk.newsfeed.impl.presentation.newsfeed.editor.actions.a(((NewsfeedExternalAction.c.k0) cVar).a, pn60Var)));
            if (!(b2 instanceof Result.Failure)) {
                qn60.c cVar3 = (qn60.c) b2;
                nn50Var.e(new j5c0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
            }
            Throwable a2 = Result.a(b2);
            if (a2 == null) {
                return null;
            }
            com.vk.metrics.eventtracking.b.a.a(a2);
            return null;
        }
        boolean z2 = cVar instanceof NewsfeedExternalAction.c.f0;
        kq60 kq60Var = this.h;
        if (z2) {
            NewsEntry newsEntry = ((NewsfeedExternalAction.c.f0) cVar).a;
            m5c0 m5c0Var = (m5c0) nn50Var.getCurrentState();
            if (epx.f(newsEntry, m5c0Var.i)) {
                if (newsEntry.d) {
                    c(new a5c0());
                } else {
                    e(new i5c0(newsEntry, m5c0Var.l, m5c0Var.e));
                    c(new b5c0(newsEntry));
                }
            }
            kq60Var.s(bVar);
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.r) {
            if (epx.f(((NewsfeedExternalAction.c.r) cVar).a, ((m5c0) nn50Var.getCurrentState()).i)) {
                c(new a5c0());
            }
            kq60Var.s(bVar);
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.b) {
            s(((NewsfeedExternalAction.c.b) cVar).a);
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.e0) {
            s(((NewsfeedExternalAction.c.e0) cVar).a);
            return null;
        }
        kq60Var.s(bVar);
        return null;
    }

    public final void s(Post post) {
        m5c0 m5c0Var = (m5c0) this.b.getCurrentState();
        if (epx.f(post, m5c0Var.i)) {
            e(new i5c0(post, m5c0Var.l, m5c0Var.e));
            c(new b5c0(post));
            this.h.s(new ds60.b(new NewsfeedExternalAction.c.f0(post)));
        }
    }
}
