package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Result;
import xsna.bwq0;
import xsna.ds60;
import xsna.jm50;
import xsna.lwq0;
import xsna.qn60;
import xsna.qr60;

/* compiled from: UserProfileMainWallMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class esq0 extends evg0<dwq0, on50, mwq0, lwq0, bwq0, svq0> {
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public esq0(es60 es60Var, h0b h0bVar, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        qn60 qn60Var = es60Var.a;
        this.f = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, es60Var.e, aVar, new eht(this, h0bVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((mwq0) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.w;
        bwq0.a.c cVar2 = bwq0.a.c.a;
        kq60 kq60Var = this.h;
        if (z) {
            kq60Var.s(bVar);
            e(cVar2);
            return null;
        }
        boolean z2 = cVar instanceof NewsfeedExternalAction.c.r;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z2) {
            kq60Var.s(bVar);
            if (epx.f(k9q0.o(((NewsfeedExternalAction.c.r) cVar).a), ((dwq0) nn50Var.getCurrentState()).b)) {
                e(cVar2);
                return null;
            }
        } else {
            boolean z3 = cVar instanceof NewsfeedExternalAction.c.b;
            lwq0.c.e eVar = lwq0.c.e.b;
            if (z3) {
                a(eVar);
                return null;
            }
            if (cVar instanceof NewsfeedExternalAction.c.e0) {
                a(eVar);
                return null;
            }
            if (!(cVar instanceof NewsfeedExternalAction.c.b0)) {
                if (!(cVar instanceof NewsfeedExternalAction.c.m)) {
                    kq60Var.s(bVar);
                    return null;
                }
                NewsEntry newsEntry = ((NewsfeedExternalAction.c.m) cVar).a;
                dwq0 dwq0Var = (dwq0) nn50Var.getCurrentState();
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                if (post != null) {
                    Flags flags = post.l;
                    if (epx.f(post.m, dwq0Var.b) && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        if (dwq0Var.l == null) {
                            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(this.f.f(new z3x(post, null, dwq0Var.q.c, this.g)));
                            if (!(b instanceof Result.Failure)) {
                                qn60.c cVar3 = (qn60.c) b;
                                nn50Var.e(new awq0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
                            }
                            Throwable a = Result.a(b);
                            if (a != null) {
                                com.vk.metrics.eventtracking.b.a.a(a);
                            }
                        } else {
                            a(eVar);
                        }
                    }
                    if (!flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        e(new bwq0.a.C2629a(1));
                    }
                }
            }
        }
        return null;
    }
}
