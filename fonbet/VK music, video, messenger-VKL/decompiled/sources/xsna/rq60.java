package xsna;

import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.d4c0;
import xsna.ds60;
import xsna.qn60;
import xsna.qr60;
import xsna.yo60;

/* compiled from: NewsfeedListItemTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class rq60 extends evg0<ur60, on50, ds60.c, ds60, qr60, yo60> {
    public final qn60 f;
    public final pn60 g;
    public final com.vk.channels.impl.channel_screen.send_msg.c h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final a l;

    /* compiled from: NewsfeedListItemTaskExecutor.kt */
    public static final class a implements bq60 {
        public a() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            rq60.this.c(yo60Var);
        }
    }

    public rq60(qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy<? extends BridgeComponent> lazy, Lazy<? extends NewsFeedComponent> lazy2, Lazy<? extends NewsFeedBridgeComponent> lazy3, jm50 jm50Var, nn50<ur60, on50, ds60, qr60, yo60> nn50Var) {
        super(jm50Var, nn50Var);
        this.f = qn60Var;
        this.g = pn60Var;
        this.h = cVar;
        this.i = lazy;
        this.j = lazy2;
        this.k = lazy3;
        this.l = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000a->B:20:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[EDGE_INSN: B:9:0x0037->B:10:0x0037 BREAK  A[LOOP:0: B:2:0x000a->B:20:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(ur60 ur60Var, Post post) {
        Object obj;
        u1c0 u1c0Var;
        boolean equals;
        Iterator<T> it = ur60Var.b.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ol60 ol60Var = (ol60) obj;
            if (ol60Var instanceof z1c0) {
                NewsEntry newsEntry = ((z1c0) ol60Var).h.a;
                Post post2 = newsEntry instanceof Post ? (Post) newsEntry : null;
                if (post2 != null) {
                    equals = post2.equals(post);
                    if (!equals) {
                        break;
                    }
                }
            }
            equals = false;
            if (!equals) {
            }
        }
        ol60 ol60Var2 = (ol60) obj;
        z1c0 z1c0Var = ol60Var2 instanceof z1c0 ? (z1c0) ol60Var2 : null;
        if (z1c0Var == null || (u1c0Var = z1c0Var.h) == null) {
            return 0;
        }
        return u1c0Var.k;
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.mn50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zvg0 d(ds60.c cVar) {
        ArrayList<Comment> arrayList;
        List<AdHideReason> list;
        final l6z h;
        boolean z = cVar instanceof ds60.c.j;
        int i = 2;
        a aVar = this.l;
        int i2 = 0;
        int i3 = 1;
        if (z) {
            ds60.c.j jVar = (ds60.c.j) cVar;
            NewsEntry newsEntry = jVar.b;
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                Flags flags = post.l;
                UserId userId = post.m;
                boolean zb = flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                Lazy lazy = this.i;
                boolean z2 = ((BridgeComponent) lazy.getValue()).s().a(post.p) || ((BridgeComponent) lazy.getValue()).s().a(userId);
                if (zb && !z2) {
                    UiTracker uiTracker = UiTracker.a;
                    return g(wdq.c(t().h(post, new z6c0(false, null, UiTracker.d(), 2)).e(new com.vk.newsfeed.impl.helpers.a().a(fkq0.e(userId), post.o.b, true).K()), aVar), new tk40(this, 4), new nex(post, 8));
                }
            }
            UiTracker uiTracker2 = UiTracker.a;
            return h(wdq.b(t().h(newsEntry, new z6c0(false, null, UiTracker.d(), 2)), aVar), new ff3(this, 27), new osn(3, this, jVar));
        }
        boolean z3 = cVar instanceof ds60.c.l;
        Lazy lazy2 = this.k;
        com.vk.channels.impl.channel_screen.send_msg.c cVar2 = this.h;
        if (z3) {
            ds60.c.l lVar = (ds60.c.l) cVar;
            d4c0 t = t();
            Post post2 = lVar.b;
            String str = lVar.c;
            ObsceneTextFilter t2 = ((NewsFeedBridgeComponent) lazy2.getValue()).Ad().a().t();
            cVar2.getClass();
            UiTracker uiTracker3 = UiTracker.a;
            return g(t.a(post2, str, t2, UiTracker.d()), new uxr(i3, this, lVar), new hu50(this, i));
        }
        int i4 = 7;
        if (cVar instanceof ds60.c.i) {
            d4c0 t3 = t();
            Post post3 = ((ds60.c.i) cVar).b;
            cVar2.getClass();
            UiTracker uiTracker4 = UiTracker.a;
            return g(wdq.c(t3.u(UiTracker.d(), post3), aVar), new m3y(this, i4), new qg60(this, i3));
        }
        boolean z4 = cVar instanceof ds60.c.a;
        Lazy lazy3 = this.j;
        if (z4) {
            ds60.c.a aVar2 = (ds60.c.a) cVar;
            return h(wdq.b(((NewsFeedComponent) lazy3.getValue()).Aa().e(aVar2.b, aVar2.c, cVar2.a(), NewsfeedAddBanTypeDto.ALWAYS), aVar), new cc20(this, i4), new x6w(this, aVar2, i3));
        }
        if (cVar instanceof ds60.c.h) {
            ds60.c.h hVar = (ds60.c.h) cVar;
            Parcelable parcelable = hVar.b;
            c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
            if (c6zVar != null) {
                String a2 = cVar2.a();
                NewsEntry newsEntry2 = hVar.c;
                vou vouVar = new vou();
                vouVar.b = a2;
                if (newsEntry2 instanceof DiscoverMediaBlock) {
                    DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry2;
                    if (!(c6zVar instanceof NewsEntry)) {
                        vouVar.h(c6zVar);
                    }
                    DiscoverGridItem Eb = discoverMediaBlock.Eb((NewsEntry) c6zVar);
                    if (Eb instanceof VideoDiscoverGridItem) {
                        c6zVar = ((VideoDiscoverGridItem) Eb).j.k.Pa();
                    }
                    h = vouVar.h(c6zVar);
                } else {
                    h = vouVar.h(c6zVar);
                }
                io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new m6z(t(), h, ((NewsFeedBridgeComponent) lazy2.getValue()).Ad().w()));
                asu0.a.getClass();
                io.reactivex.rxjava3.core.x q = bVar.q(asu0.p());
                c6z c6zVar2 = h.a;
                VideoFile videoFile = c6zVar2 instanceof VideoFile ? (VideoFile) c6zVar2 : null;
                if (videoFile != null) {
                    q = new io.reactivex.rxjava3.internal.operators.single.o(q, new m5y(new b140(videoFile, 5), 10));
                }
                return g(q, new a960(this, i3), new io.reactivex.rxjava3.functions.f() { // from class: xsna.oq60
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        c6z c6zVar3 = l6z.this.a;
                        if (((d4c0.a) obj).d && c6zVar3.J() && (c6zVar3 instanceof NewsEntry)) {
                            this.c(new yo60.e.k((NewsEntry) c6zVar3));
                        }
                    }
                });
            }
        } else {
            if (cVar instanceof ds60.c.C2748c) {
                ((ds60.c.C2748c) cVar).getClass();
                throw null;
            }
            if (cVar instanceof ds60.c.d) {
                ds60.c.d dVar = (ds60.c.d) cVar;
                Parcelable parcelable2 = dVar.b;
                aw0 aw0Var = dVar.c;
                if (parcelable2 instanceof DeprecatedStatisticInterface) {
                    AdSource adSource = aw0Var.d;
                    int i5 = aw0Var.b;
                    int i6 = aw0Var.a;
                    List<AdHideReason> list2 = aw0Var.e;
                    AdSource.Companion.getClass();
                    if (!AdSource.a.b(adSource) || (list = list2) == null || list.isEmpty()) {
                        DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) parcelable2;
                        ahn.g(deprecatedStatisticInterface, 0, i6, i5, "closed_by_user");
                        ahn.g(deprecatedStatisticInterface, 0, i6, i5, "hide");
                    } else {
                        ahn.g((DeprecatedStatisticInterface) parcelable2, 0, i6, i5, "closed_by_user");
                    }
                }
                return h(wdq.b(((NewsFeedComponent) lazy3.getValue()).B4().a(new cw0(aw0Var.c, null)), aVar), new le50(com.vk.metrics.eventtracking.b.a, 25), new che(1, parcelable2, this));
            }
            if (cVar instanceof ds60.c.f) {
                NewsEntry newsEntry3 = ((ds60.c.f) cVar).b;
                newsEntry3.d = true;
                a(new ds60.b(new NewsfeedExternalAction.c.f0(newsEntry3)));
                return null;
            }
            if (cVar instanceof ds60.c.e) {
                MyTargetNativeAdEntry myTargetNativeAdEntry = ((ds60.c.e) cVar).b;
                myTargetNativeAdEntry.d = true;
                a(new ds60.b(new NewsfeedExternalAction.c.f0(myTargetNativeAdEntry)));
                return null;
            }
            if (!(cVar instanceof ds60.c.g)) {
                if (cVar instanceof ds60.c.k) {
                    Post post4 = ((ds60.c.k) cVar).b;
                    return g(wdq.c(t().j(fkq0.e(post4.m), post4.o.b), aVar), new pq60(i2), new vk40(post4, i4));
                }
                if (!(cVar instanceof ds60.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                final Post post5 = ((ds60.c.b) cVar).b;
                return g(wdq.c(t().v(fkq0.e(post5.m), post5.o.b), aVar), new nq60(i2, this, post5), new io.reactivex.rxjava3.functions.f() { // from class: xsna.qq60
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        VKList vKList = (VKList) obj;
                        UserProfile userProfile = new UserProfile();
                        Post post6 = post5;
                        Owner owner = post6.o;
                        UserId userId2 = post6.m;
                        userProfile.c = owner.b;
                        userProfile.e = owner.c;
                        userProfile.h = owner.e;
                        boolean isEmpty = vKList.isEmpty();
                        rq60 rq60Var = rq60.this;
                        if (isEmpty) {
                            rq60Var.c(new yo60.f.C4120f(fkq0.e(userId2), userProfile));
                            return;
                        }
                        UserProfile userProfile2 = (UserProfile) j5g.Y(vKList);
                        if (fkq0.c(userProfile2.c)) {
                            rq60Var.c(new yo60.f.C4120f(fkq0.e(userId2), userProfile2));
                            return;
                        }
                        UserId e = fkq0.e(userId2);
                        userProfile.s.putAll(userProfile2.s);
                        s3q0 s3q0Var = s3q0.a;
                        rq60Var.c(new yo60.f.C4120f(e, userProfile));
                    }
                });
            }
            ds60.c.g gVar = (ds60.c.g) cVar;
            boolean z5 = gVar instanceof ds60.c.g.b;
            nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
            pn60 pn60Var = this.g;
            qn60 qn60Var = this.f;
            if (z5) {
                Post post6 = ((ds60.c.g.b) gVar).b;
                Object f = qn60Var.f(new gij0(post6), new s8q0(Collections.singletonList(post6), pn60Var));
                if (!(f instanceof Result.Failure)) {
                    qn60.c cVar3 = (qn60.c) f;
                    e(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24));
                }
                Throwable a3 = Result.a(f);
                if (a3 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a3);
                }
                Activity activity = post6.C;
                CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
                if (commentsActivity != null && (arrayList = commentsActivity.d) != null) {
                    int v = v((ur60) nn50Var.getCurrentState(), post6);
                    Comment comment = (Comment) j5g.a0(arrayList);
                    Integer valueOf = comment != null ? Integer.valueOf(comment.b) : null;
                    String valueOf2 = String.valueOf(System.currentTimeMillis());
                    new yzw();
                    yzw.a(post6, v, valueOf2, valueOf2, valueOf, null);
                    return null;
                }
            } else {
                if (gVar instanceof ds60.c.g.d) {
                    Post post7 = ((ds60.c.g.d) gVar).b;
                    Object f2 = qn60Var.f(new jij0(post7), new s8q0(Collections.singletonList(post7), pn60Var));
                    if (!(f2 instanceof Result.Failure)) {
                        qn60.c cVar4 = (qn60.c) f2;
                        e(new qr60.a.c(cVar4.a, cVar4.b, false, null, 24));
                    }
                    Throwable a4 = Result.a(f2);
                    if (a4 != null) {
                        com.vk.metrics.eventtracking.b.a.a(a4);
                    }
                    ur60 ur60Var = (ur60) nn50Var.getCurrentState();
                    String valueOf3 = String.valueOf(System.currentTimeMillis());
                    int v2 = v(ur60Var, post7);
                    new yzw();
                    yzw.b(post7, v2, valueOf3, valueOf3);
                    return null;
                }
                if (gVar instanceof ds60.c.g.C2749c) {
                    ds60.c.g.C2749c c2749c = (ds60.c.g.C2749c) gVar;
                    Post post8 = c2749c.b;
                    Object obj = ((ur60) nn50Var.getCurrentState()).c.a.get(new Pair(Long.valueOf(post8.m.b), Integer.valueOf(post8.n)));
                    CommentsActivity commentsActivity2 = obj instanceof CommentsActivity ? (CommentsActivity) obj : null;
                    if (commentsActivity2 != null && commentsActivity2.h == CommentsActivity.Position.DEFAULT) {
                        c(yo60.b.a);
                        Object f3 = qn60Var.f(new gij0(post8), new zk0(pn60Var, post8, commentsActivity2));
                        if (!(f3 instanceof Result.Failure)) {
                            qn60.c cVar5 = (qn60.c) f3;
                            e(new qr60.a.c(cVar5.a, cVar5.b, false, null, 24));
                        }
                        Throwable a5 = Result.a(f3);
                        if (a5 != null) {
                            com.vk.metrics.eventtracking.b.a.a(a5);
                        }
                        Post post9 = c2749c.b;
                        ArrayList<Comment> arrayList2 = commentsActivity2.d;
                        if (arrayList2 != null) {
                            Comment comment2 = (Comment) j5g.a0(arrayList2);
                            if (commentsActivity2.e.get(comment2 != null ? comment2.c : null) != null) {
                                int v3 = v((ur60) nn50Var.getCurrentState(), post9);
                                String valueOf4 = String.valueOf(System.currentTimeMillis());
                                new yzw();
                                yzw.a(post9, v3, valueOf4, valueOf4, comment2 != null ? Integer.valueOf(comment2.b) : null, Boolean.TRUE);
                                return null;
                            }
                        }
                    }
                } else if (gVar instanceof ds60.c.g.e) {
                    Post post10 = ((ds60.c.g.e) gVar).b;
                    Object obj2 = ((ur60) nn50Var.getCurrentState()).c.a.get(new Pair(Long.valueOf(post10.m.b), Integer.valueOf(post10.n)));
                    CommentsActivity commentsActivity3 = obj2 instanceof CommentsActivity ? (CommentsActivity) obj2 : null;
                    if (commentsActivity3 != null && commentsActivity3.g) {
                        c(yo60.b.a);
                        Object f4 = qn60Var.f(new jij0(post10), new zk0(pn60Var, post10, commentsActivity3));
                        if (!(f4 instanceof Result.Failure)) {
                            qn60.c cVar6 = (qn60.c) f4;
                            e(new qr60.a.c(cVar6.a, cVar6.b, false, null, 24));
                        }
                        Throwable a6 = Result.a(f4);
                        if (a6 != null) {
                            com.vk.metrics.eventtracking.b.a.a(a6);
                        }
                        ur60 ur60Var2 = (ur60) nn50Var.getCurrentState();
                        String valueOf5 = String.valueOf(System.currentTimeMillis());
                        int v4 = v(ur60Var2, post10);
                        new yzw();
                        yzw.b(post10, v4, valueOf5, valueOf5);
                        return null;
                    }
                } else {
                    if (!(gVar instanceof ds60.c.g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ds60.c.g.a aVar3 = (ds60.c.g.a) gVar;
                    Object f5 = qn60Var.f(new o3x(aVar3.b, aVar3.c, aVar3.d, pn60Var));
                    if (!(f5 instanceof Result.Failure)) {
                        qn60.c cVar7 = (qn60.c) f5;
                        e(new qr60.a.c(cVar7.a, cVar7.b, false, null, 24));
                    }
                    Throwable a7 = Result.a(f5);
                    if (a7 != null) {
                        com.vk.metrics.eventtracking.b.a.a(a7);
                    }
                }
            }
        }
        return null;
    }

    public final d4c0 t() {
        return ((NewsFeedComponent) this.j.getValue()).ze();
    }
}
