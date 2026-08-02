package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.ComFeatures;
import xsna.ds60;
import xsna.jm50;
import xsna.svq0;
import xsna.yo60;

/* compiled from: UserProfileOptionsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gtq0 extends evg0<dwq0, on50, pwq0, lwq0, bwq0, svq0> {
    public final bpn0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gtq0(es60 es60Var, h0b h0bVar, nn50 nn50Var) {
        super(r2, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new bpn0(new y2t(es60Var, aVar, h0bVar, this, 2));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        boolean z;
        ds60.e eVar = ((pwq0) hn50Var).b;
        if (!(eVar instanceof ds60.e.i0)) {
            if (eVar instanceof ds60.e.k0) {
                c(new svq0.b.l(((ds60.e.k0) eVar).b));
                return null;
            }
            if (eVar instanceof ds60.e.b) {
                c(new svq0.b.C3691b(((ds60.e.b) eVar).b));
                return null;
            }
            if (eVar instanceof ds60.e.t0) {
                c(new svq0.b.o(((ds60.e.t0) eVar).b));
                return null;
            }
            if (eVar instanceof ds60.e.d) {
                c(new svq0.b.d(((ds60.e.d) eVar).b));
                return null;
            }
            if (eVar instanceof ds60.e.c) {
                c(new svq0.b.c(((ds60.e.c) eVar).b));
                return null;
            }
            if (!(eVar instanceof ds60.e.o)) {
                return ((kr60) this.f.getValue()).d(eVar);
            }
            c(new svq0.b.f(((ds60.e.o) eVar).b));
            return null;
        }
        ds60.e.i0 i0Var = (ds60.e.i0) eVar;
        NewsEntry newsEntry = i0Var.b;
        ComFeatures comFeatures = ComFeatures.COM_MAIN_CARDS_ACTION;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures) && (newsEntry instanceof Videos)) {
            c(new svq0.b.l(newsEntry));
            return null;
        }
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            boolean zb = post.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            UserId userId = post.p;
            nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
            if (!epx.f(((dwq0) nn50Var.getCurrentState()).b, userId)) {
                if (!epx.f(((dwq0) nn50Var.getCurrentState()).b, post.m)) {
                    z = false;
                    if (zb && !z) {
                        c(new svq0.a(new ap60(newsEntry, Integer.valueOf(i0Var.c))));
                        a(new nwq0(new ds60.c.j(newsEntry)));
                        return null;
                    }
                }
            }
            z = true;
            if (zb) {
                c(new svq0.a(new ap60(newsEntry, Integer.valueOf(i0Var.c))));
                a(new nwq0(new ds60.c.j(newsEntry)));
                return null;
            }
        }
        c(new svq0.a(new yo60.e.i(i0Var.b)));
        return null;
    }
}
