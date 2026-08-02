package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Lazy;
import kotlin.Result;
import xsna.bwq0;
import xsna.ds60;
import xsna.jm50;
import xsna.lwq0;
import xsna.qn60;
import xsna.qr60;
import xsna.svq0;

/* compiled from: UserProfileWallMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class vvq0 extends evg0<dwq0, on50, mwq0, lwq0, bwq0, svq0> {
    public final qn60 f;
    public final pn60 g;
    public final Lazy h;
    public final kq60 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vvq0(es60 es60Var, h0b h0bVar, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        qn60 qn60Var = es60Var.a;
        this.f = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.g = pn60Var;
        this.h = es60Var.k;
        this.i = new kq60(qn60Var, pn60Var, es60Var.e, aVar, new eht(this, h0bVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        boolean b;
        boolean b2;
        qn60 qn60Var = this.f;
        kq60 kq60Var = this.i;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        ds60.b bVar = ((mwq0) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        if (cVar instanceof NewsfeedExternalAction.c.w) {
            kq60Var.s(bVar);
            NewsfeedExternalAction.c.w wVar = (NewsfeedExternalAction.c.w) cVar;
            dwq0 dwq0Var = (dwq0) nn50Var.getCurrentState();
            if (wVar.c) {
                t(dwq0Var.g - 1, dwq0Var.b);
            }
            if (wVar.e) {
                e(bwq0.a.b.a);
            }
            if (s(dwq0Var.b) && (!wVar.c || wVar.d)) {
                int i = dwq0Var.e - 1;
                if (i < 0) {
                    i = 0;
                }
                e(bwq0.a.c.a);
                if (dwq0Var.c == WallGetMode.ARCHIVED && i == 0) {
                    c(new svq0.b.p(false, false));
                    return null;
                }
            }
        } else if (cVar instanceof NewsfeedExternalAction.c.r) {
            kq60Var.s(bVar);
            NewsEntry newsEntry = ((NewsfeedExternalAction.c.r) cVar).a;
            dwq0 dwq0Var2 = (dwq0) nn50Var.getCurrentState();
            if (newsEntry instanceof Post) {
                Flags flags = ((Post) newsEntry).l;
                if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                    t(dwq0Var2.g - 1, dwq0Var2.b);
                }
                if (flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    e(bwq0.a.b.a);
                }
                if (s(dwq0Var2.b) && (!flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM))) {
                    int i2 = dwq0Var2.e - 1;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    e(bwq0.a.c.a);
                    if (dwq0Var2.c == WallGetMode.ARCHIVED && i2 == 0) {
                        c(new svq0.b.p(false, false));
                        return null;
                    }
                }
            }
        } else if (cVar instanceof NewsfeedExternalAction.c.b) {
            Post post = ((NewsfeedExternalAction.c.b) cVar).a;
            dwq0 dwq0Var3 = (dwq0) nn50Var.getCurrentState();
            if (dwq0Var3.c != WallGetMode.ARCHIVED && s(dwq0Var3.b)) {
                synchronized (qn60Var) {
                    b2 = qn60Var.b.b.b(post);
                }
                kq60Var.s(bVar);
                if (b2) {
                    e(bwq0.a.c.a);
                }
                c(new svq0.b.p(true, false));
                return null;
            }
        } else if (cVar instanceof NewsfeedExternalAction.c.e0) {
            Post post2 = ((NewsfeedExternalAction.c.e0) cVar).a;
            dwq0 dwq0Var4 = (dwq0) nn50Var.getCurrentState();
            if (dwq0Var4.c == WallGetMode.ARCHIVED && s(dwq0Var4.b)) {
                synchronized (qn60Var) {
                    b = qn60Var.b.b.b(post2);
                }
                if (b) {
                    kq60Var.s(new ds60.b(new NewsfeedExternalAction.c.r(post2)));
                    int i3 = dwq0Var4.e - 1;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    e(bwq0.a.c.a);
                    if (i3 == 0) {
                        c(new svq0.b.p(false, true));
                        return null;
                    }
                }
            }
        } else {
            if (cVar instanceof NewsfeedExternalAction.c.b0) {
                a(new lwq0.c.d(((NewsfeedExternalAction.c.b0) cVar).a));
                return null;
            }
            if (!(cVar instanceof NewsfeedExternalAction.c.m)) {
                kq60Var.s(bVar);
                return null;
            }
            NewsEntry newsEntry2 = ((NewsfeedExternalAction.c.m) cVar).a;
            dwq0 dwq0Var5 = (dwq0) nn50Var.getCurrentState();
            Post post3 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
            if (post3 != null) {
                Flags flags2 = post3.l;
                UserId userId = post3.m;
                UserId userId2 = dwq0Var5.b;
                WallGetMode wallGetMode = dwq0Var5.c;
                if (epx.f(userId, userId2) && wallGetMode != WallGetMode.ARCHIVED) {
                    if (flags2.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                        t(dwq0Var5.g + 1, userId2);
                    } else if (flags2.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        e(bwq0.a.d.a);
                    } else if (wallGetMode != WallGetMode.OWNER || epx.f(post3.o.b, userId2)) {
                        Object b3 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new z3x(post3, dwq0Var5.l, dwq0Var5.q.c, this.g)));
                        if (!(b3 instanceof Result.Failure)) {
                            qn60.c cVar2 = (qn60.c) b3;
                            nn50Var.e(new awq0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                        }
                        Throwable a = Result.a(b3);
                        if (a != null) {
                            com.vk.metrics.eventtracking.b.a.a(a);
                        }
                    }
                }
                if (!flags2.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags2.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags2.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    e(new bwq0.a.C2629a(1));
                }
                if (!flags2.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags2.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) && s(dwq0Var5.b) && post3.Fb()) {
                    c(svq0.b.k.a);
                    c(svq0.b.j.a);
                }
                if (!post3.oc()) {
                    return null;
                }
                a(new lwq0.c.f(post3.r));
                return null;
            }
        }
        return null;
    }

    public final boolean s(UserId userId) {
        Lazy lazy = this.h;
        return ((AuthBridgeComponent) lazy.getValue()).s().b() && ((AuthBridgeComponent) lazy.getValue()).s().a(userId);
    }

    public final void t(int i, UserId userId) {
        if (s(userId)) {
            Preference.l().edit().putInt("postponed_count", i).commit();
        }
        e(new bwq0.a.k(i));
    }
}
