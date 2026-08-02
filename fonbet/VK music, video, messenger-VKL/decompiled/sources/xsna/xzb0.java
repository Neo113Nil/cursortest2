package xsna;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.api.likes.LikesGetList;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import kotlin.LazyThreadSafetyMode;
import xsna.qr80;
import xsna.wlc;

/* compiled from: PostActionPerformDelegate.kt */
/* loaded from: classes4.dex */
public final class xzb0 implements w8i {
    public static final String A = qjg.a(new a());
    public final bin0<String> b;
    public final o2u0 c;
    public final izs<NewsEntry, s3q0> d;
    public final id60 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final Object u;
    public final bpn0 v;
    public final p960 w;
    public final utx x;
    public final mtx y;
    public final Object z;

    /* compiled from: PostActionPerformDelegate.kt */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xzb0(bin0<String> bin0Var, bin0<String> bin0Var2, o2u0 o2u0Var, izs<? super NewsEntry, s3q0> izsVar, id60 id60Var) {
        this.b = bin0Var2;
        this.c = o2u0Var;
        this.d = izsVar;
        this.e = id60Var;
        cf00 cf00Var = new cf00(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, cf00Var);
        this.g = msy.a(lazyThreadSafetyMode, new yu60(this, 9));
        this.h = msy.a(lazyThreadSafetyMode, new u110(this, 10));
        this.i = msy.a(lazyThreadSafetyMode, new b290(this, 6));
        this.j = msy.a(lazyThreadSafetyMode, new dv2(28));
        this.k = msy.a(lazyThreadSafetyMode, new lva0(this, 3));
        this.l = msy.a(lazyThreadSafetyMode, new su80(this, 7));
        this.m = msy.a(lazyThreadSafetyMode, new wm80(this, 6));
        this.n = new bpn0(new c950(this, 15));
        this.o = new bpn0(new jaa0(this, 2));
        this.p = new bpn0(new dj60(this, 11));
        bpn0 bpn0Var = new bpn0(new ln20(this, 12));
        this.q = bpn0Var;
        this.r = new bpn0(new i440(this, 16));
        this.s = new bpn0(new zf20(this, 18));
        this.t = new bpn0(new hj60(this, 8));
        this.u = msy.a(lazyThreadSafetyMode, new f550(this, 14));
        this.v = new bpn0(new wzb0(this, 0));
        this.w = new p960(bpn0Var);
        this.x = new utx(null);
        this.y = new mtx();
        this.z = msy.a(lazyThreadSafetyMode, new cm(24, bin0Var, this));
    }

    public static void d(Context context, Post post) {
        VideoAttachment i;
        if (post.gc()) {
            Post R = di60.R(post);
            if ((R != null ? di60.i(R) : null) != null) {
                Post R2 = di60.R(post);
                if (R2 == null || (i = di60.i(R2)) == null) {
                    return;
                }
                g620.f().m().b(context, i.k.I0(), i.k.a1(), false);
                return;
            }
        }
        hd60.a().i1(post.n, context, post.m);
    }

    public final String a() {
        return this.b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NewsfeedRouter b() {
        return (NewsfeedRouter) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final c1c0 c() {
        return (c1c0) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(Context context, NewsfeedExternalAction newsfeedExternalAction) {
        Integer N;
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.b.a) {
            NewsfeedExternalAction.b.a aVar = (NewsfeedExternalAction.b.a) newsfeedExternalAction;
            p960.d(this.w, context, aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, 64);
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.Navigation) {
            ((hu60) this.z.getValue()).b(context, (NewsfeedExternalAction.Navigation) newsfeedExternalAction);
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.c.a) {
            this.y.getClass();
            this.x.a(mtx.a((NewsfeedExternalAction.c.a) newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.c.n) {
            NewsfeedRouter b = b();
            NewsfeedExternalAction.c.n nVar = (NewsfeedExternalAction.c.n) newsfeedExternalAction;
            NewsEntry newsEntry = nVar.a;
            Comment comment = nVar.b;
            String str = nVar.c;
            int i = comment.b;
            qr80 qr80Var = nVar.d;
            if (qr80Var == null) {
                qr80Var = new qr80.a(i);
            }
            b.i(context, newsEntry, comment, str, qr80Var);
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.c.o) {
            NewsfeedExternalAction.c.o oVar = (NewsfeedExternalAction.c.o) newsfeedExternalAction;
            Post post = oVar.a;
            Comment comment2 = oVar.b;
            int[] iArr = comment2.l;
            int intValue = (iArr == null || (N = rl3.N(iArr)) == null) ? comment2.b : N.intValue();
            NewsfeedRouter b2 = b();
            UserId userId = post.m;
            Flags flags = post.l;
            b2.k(context, userId, post.n, new NewsfeedRouter.a(intValue, comment2.b, flags.zb(2L), flags.zb(1L), flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI), LikesGetList.Type.POST));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.c.p) {
            b().M(context, ((NewsfeedExternalAction.c.p) newsfeedExternalAction).a);
            return;
        }
        boolean z = newsfeedExternalAction instanceof NewsfeedExternalAction.d.a;
        o2u0 o2u0Var = this.c;
        if (z) {
            NewsfeedExternalAction.d.a aVar2 = (NewsfeedExternalAction.d.a) newsfeedExternalAction;
            if (aVar2.c == PostActions.ACTION_IGNORE.h()) {
                o2u0Var.fg(aVar2.a, aVar2.b, aVar2.d);
                return;
            }
            return;
        }
        if ((newsfeedExternalAction instanceof NewsfeedExternalAction.e.b) || (newsfeedExternalAction instanceof NewsfeedExternalAction.e.a) || !(newsfeedExternalAction instanceof NewsfeedExternalAction.c.c0)) {
            return;
        }
        o2u0Var.a(this.w.g(a(), ((NewsfeedExternalAction.c.c0) newsfeedExternalAction).a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r1v145, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v172, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(Context context, jc60 jc60Var) {
        String str;
        UserId c;
        Owner s;
        UserId userId;
        io.reactivex.rxjava3.disposables.c subscribe;
        VideoAttachment Nb;
        VideoAttachment i;
        String str2;
        VideoAttachment Nb2;
        UserId userId2 = jc60Var.f;
        NewsEntry newsEntry = jc60Var.b;
        NewsEntry newsEntry2 = jc60Var.c;
        int i2 = jc60Var.d;
        int i3 = jc60Var.a;
        if (i3 == PostActions.ACTION_COPY_LINK.h()) {
            c().B(newsEntry, Integer.valueOf(i2));
            return;
        }
        if (i3 == PostActions.ACTION_WRITE_OWNER.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.MESSAGE_AUTHOR);
            b().a(context, newsEntry);
            return;
        }
        int h = PostActions.ACTION_IGNORE.h();
        o2u0 o2u0Var = this.c;
        if (i3 == h) {
            o2u0Var.fg(newsEntry, newsEntry2, i2);
            return;
        }
        int i4 = 1;
        if (i3 == PostActions.ACTION_PUSH_SUBSCRIBE.h()) {
            c().U(context, newsEntry, true);
            return;
        }
        boolean z = false;
        if (i3 == PostActions.ACTION_PUSH_UNSUBSCRIBE.h()) {
            c().U(context, newsEntry, false);
            return;
        }
        if (i3 == PostActions.ACTION_BAN_SOURCE.h()) {
            PostInteract Ab = PostInteract.Ab(a(), newsEntry);
            if (Ab != null) {
                Ab.n = i2;
                Ab.zb(PostInteract.Type.hide);
            }
            c().N(context, newsEntry, a(), NewsfeedAddBanTypeDto.ALWAYS);
            return;
        }
        if (i3 == PostActions.ACTION_BAN_POST_SOURCE.h()) {
            PostInteract Ab2 = PostInteract.Ab(a(), newsEntry);
            if (Ab2 != null) {
                Ab2.n = i2;
                Ab2.zb(PostInteract.Type.hide);
            }
            c().j(context, (Post) newsEntry, a(), NewsfeedAddBanTypeDto.ALWAYS);
            return;
        }
        if (i3 == PostActions.ACTION_HIDE_AD.h()) {
            PostInteract Ab3 = PostInteract.Ab(a(), newsEntry);
            if (Ab3 != null) {
                Ab3.n = i2;
                Ab3.zb(PostInteract.Type.hide);
            }
            c().J(context, (ShitAttachment) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_HIDE_AD_OPTIONAL_NATIVE_AD.h()) {
            c().K(newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_HIDE_AD_HTML.h()) {
            PostInteract Ab4 = PostInteract.Ab(a(), newsEntry);
            if (Ab4 != null) {
                Ab4.n = i2;
                Ab4.zb(PostInteract.Type.hide);
            }
            c().u(context, (Html5Entry) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_HIDE_AD_PROMO_POST.h()) {
            PostInteract Ab5 = PostInteract.Ab(a(), newsEntry);
            if (Ab5 != null) {
                Ab5.n = i2;
                Ab5.zb(PostInteract.Type.hide);
            }
            c().m(context, (PromoPost) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_OPEN_ORIGINAL_POST.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.OPEN_ORIGINAL);
            c().w(context, (Post) newsEntry);
            return;
        }
        int h2 = PostActions.ACTION_EDIT.h();
        int i5 = 7;
        bpn0 bpn0Var = this.v;
        int i6 = 2;
        r15 = null;
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint = null;
        if (i3 == h2) {
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                g(post, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.EDIT_POST);
                UserId userId3 = post.m;
                c().c(i2, context, post, (post.oc() && fkq0.d(userId3)) ? PostingCreationEntryPoint.ProfilePostponedPostsThreePoints : (post.oc() && fkq0.b(userId3)) ? PostingCreationEntryPoint.GroupPostponedPostsThreePoints : post.Z1() ? PostingCreationEntryPoint.FeedEditDraftThreeDots : PostingCreationEntryPoint.PostThreeDotMenuEditItem);
                return;
            }
            if (newsEntry instanceof Videos) {
                Videos videos = (Videos) newsEntry;
                ComFeatures comFeatures = ComFeatures.COM_MAIN_CARDS_ACTION;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures) && (Nb2 = videos.Nb()) != null) {
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    if (videos.Ea() && b != null) {
                        ((xlc) bpn0Var.getValue()).g(b, new wlc.b(Nb2.k, false, new vi0(i5)));
                        return;
                    }
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(Nb2.k.o0()), Long.valueOf(Nb2.k.I0().b), null, null, null, 56, null), BuildInfo.q() & Nb2.k.Z1() ? new MobileOfficialAppsVideoStat$TypeVideoDraftClick(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.EDIT_DRAFT, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype.DRAFT) : new MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick(MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick.EventType.EDIT_VIDEO, r15, i6, r15), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c2, b2, uzp0Var.a).q();
                    fxc0.B().S(context, Nb2.k);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_REMOVE.h()) {
            boolean z2 = jc60Var.e;
            ComFeatures comFeatures2 = ComFeatures.COM_MAIN_CARDS_ACTION;
            comFeatures2.getClass();
            if (com.vk.toggle.b.A.a(comFeatures2) && (newsEntry instanceof Videos)) {
                Videos videos2 = (Videos) newsEntry;
                c63 c63Var2 = c63.a;
                Activity b3 = c63.b();
                VideoAttachment Nb3 = videos2.Nb();
                if (b3 == null || Nb3 == null) {
                    return;
                }
                int i7 = 8;
                if (videos2.Ea()) {
                    ((xlc) bpn0Var.getValue()).f(b3, new wlc.d(Nb3.k, false, new com.vk.movika.sdk.android.defaultplayer.interactive.b(7), new g53(i7)));
                    return;
                } else {
                    bfs0.d(b3, R.string.video_confirm_remove, null, new v43(16, b3, Nb3), 8);
                    return;
                }
            }
            boolean z3 = newsEntry instanceof Post;
            if (z3) {
                Post post2 = (Post) newsEntry;
                boolean zb = post2.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                if (!o25.a().a(post2.p) && !o25.a().a(post2.m)) {
                    i4 = 0;
                }
                if (zb && i4 == 0) {
                    g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.DECLINE_SUGGESTED_POST);
                }
                z = zb;
            } else {
                i4 = 0;
            }
            MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint2 = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT_THREE_DOTS;
            if (z3 && ((Post) newsEntry).Z1()) {
                creationEntryPoint = creationEntryPoint2;
            }
            if (z && i4 == 0) {
                c().t(context, (Post) newsEntry, z2);
                return;
            } else {
                c().H(context, newsEntry, z2, creationEntryPoint);
                return;
            }
        }
        if (i3 == PostActions.ACTION_REPORT.h()) {
            c().R(context, newsEntry, a(), 1234, i2);
            return;
        }
        int h3 = PostActions.ACTION_LIKE.h();
        p960 p960Var = this.w;
        if (i3 == h3) {
            String a2 = a();
            if (!(newsEntry2 instanceof DiscoverMediaBlock)) {
                p960Var.a(context, newsEntry, a2);
                return;
            }
            p960Var.getClass();
            DiscoverGridItem Eb = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
            if (Eb instanceof VideoDiscoverGridItem) {
                w1s0.e(context, ((VideoDiscoverGridItem) Eb).j.k, a2, null, null);
                return;
            } else {
                p960Var.a(context, newsEntry, a2);
                return;
            }
        }
        if (i3 == PostActions.ACTION_OPEN_PROFILE.h()) {
            this.w.b(context, newsEntry, newsEntry2, a(), MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.MENU_OPTION);
            return;
        }
        if (i3 == PostActions.ACTION_SHARE.h()) {
            p960Var.e(context, newsEntry, newsEntry2, a());
            return;
        }
        if (i3 == PostActions.ACTION_PUBLISH_POSTPONED.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.PUBLISH_DELAYED_POST);
            c().Z(context, (Post) newsEntry, null);
            return;
        }
        if (i3 == PostActions.ACTION_PUBLISH_DRAFT.h()) {
            ?? r4 = this.k;
            z6c0 z6c0Var = new z6c0(false, ((ibc0) r4.getValue()).b(), ((ibc0) r4.getValue()).f(), 1);
            Post post3 = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post3 != null) {
                c().G(context, post3, z6c0Var, null);
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_TOGGLE_FAVE.h()) {
            boolean z4 = newsEntry instanceof FaveEntry;
            NewsEntry newsEntry3 = newsEntry;
            if (z4) {
                Object obj = ((FaveEntry) newsEntry).i.f;
                newsEntry3 = newsEntry;
                if (obj instanceof NewsEntry) {
                    newsEntry3 = (NewsEntry) obj;
                }
            }
            c().P(context, newsEntry3, a(), null);
            if (newsEntry3 instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) newsEntry3;
                if (shitAttachment.Gb()) {
                    ((rv0) this.i.getValue()).e(shitAttachment);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_TOGGLE_PINNED.h()) {
            io.reactivex.rxjava3.disposables.c subscribe2 = c().L(context, (Post) newsEntry).subscribe(new l6r(i6, this, newsEntry), new a8v(new pey(18), 10));
            if (subscribe2 != null) {
                o2u0Var.a(subscribe2);
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_TOGGLE_COMMENTS.h()) {
            Post post4 = (Post) newsEntry;
            io.reactivex.rxjava3.disposables.c subscribe3 = c().O(context, post4).subscribe(new y6w(i4, this, post4), new tk40(new k990(5), 11));
            if (subscribe3 != null) {
                o2u0Var.a(subscribe3);
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_SHOW_AD_DEBUG_INFO.h()) {
            if (newsEntry instanceof PromoPost) {
                c().e(context, ((PromoPost) newsEntry).r);
                return;
            } else {
                if (!(newsEntry instanceof ShitAttachment) || (str2 = ((ShitAttachment) newsEntry).P) == null) {
                    return;
                }
                c().e(context, str2);
                return;
            }
        }
        if (i3 == PostActions.ACTION_ADD_TO_ARCHIVE.h()) {
            c().r(context, (Post) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_REMOVE_FROM_ARCHIVE.h()) {
            c().M(context, (Post) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_DOUBT_CATEGORY.h()) {
            c1c0 c3 = c();
            Post post5 = newsEntry instanceof Post ? (Post) newsEntry : null;
            a();
            c3.a(post5);
            return;
        }
        if (i3 == PostActions.ACTION_PUBLISH_SUGGESTED_NOW.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.POST_SUGGESTED_POST);
            c().C(context, newsEntry instanceof Post ? (Post) newsEntry : null);
            return;
        }
        if (i3 == PostActions.ACTION_PUBLISH_FREE_COPY.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.MAKE_DONUT_POST_PUBLIC);
            if (newsEntry instanceof Post) {
                Post post6 = (Post) newsEntry;
                if (post6.Sb()) {
                    c().b(context, new aq3(this, context, newsEntry, 3));
                    return;
                } else {
                    c().x(context, post6);
                    return;
                }
            }
            return;
        }
        if (i3 == PostActions.ACTION_EDIT_BEST_FRIENDS.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.EDIT_BEST_FRIENDS_LIST);
            NewsfeedRouter.D(b(), context, FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.POST);
            ((jbc0) this.h.getValue()).a(MobileOfficialAppsCoreNavStat$EventScreen.FEED);
            return;
        }
        if (i3 == PostActions.ACTION_SHOW_ADVERTISER_INFO.h()) {
            c().p(context, newsEntry, Integer.valueOf(i2));
            return;
        }
        if (i3 == PostActions.ACTION_COPY_AD_MARKER.h()) {
            c().h(newsEntry, Integer.valueOf(i2));
            return;
        }
        if (i3 == PostActions.ACTION_UNIGNORE.h()) {
            c().a0(newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_OPEN_DISCOVER_MEDIA.h()) {
            o2u0Var.F2(m3n.a().b);
            return;
        }
        if (i3 == PostActions.ACTION_OPEN_NEWS_TAB.h()) {
            Object obj2 = m3n.a;
            o2u0Var.F2("discover_category_trends/trends");
            return;
        }
        if (i3 == PostActions.ACTION_LAZY_LOAD_RETRY.h()) {
            this.d.invoke(newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_SEND_BADGE.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.SEND_DONUT);
            if (newsEntry instanceof Badgeable) {
                b().v(context, (Badgeable) newsEntry);
                return;
            }
            return;
        }
        PostActions postActions = PostActions.ACTION_MARKET_CTA_CHAT_WITH_OWNER;
        if (i3 == postActions.h() || i3 == PostActions.ACTION_MARKET_CTA_ADD_TO_CART.h() || i3 == PostActions.ACTION_MARKET_CTA_LINK.h() || i3 == PostActions.ACTION_MARKET_CTA_CALL_TO_OWNER.h() || i3 == PostActions.ACTION_MARKET_CTA_OPEN_CART.h()) {
            if (newsEntry instanceof FaveEntry) {
                gmq gmqVar = ((FaveEntry) newsEntry).i.f;
                r15 = gmqVar instanceof FaveMarketItem ? (FaveMarketItem) gmqVar : 0;
                if (r15 == 0) {
                    return;
                }
                CallProducerButton callProducerButton = r15.c;
                Good good = r15.b;
                int h4 = postActions.h();
                ?? r6 = this.m;
                if (i3 == h4) {
                    ((com.vk.ecomm.fave.api.di.a) r6.getValue()).e(context, good);
                    return;
                }
                if (i3 == PostActions.ACTION_MARKET_CTA_ADD_TO_CART.h()) {
                    ((com.vk.ecomm.fave.api.di.a) r6.getValue()).a(good, newsEntry, context);
                    return;
                }
                if (i3 == PostActions.ACTION_MARKET_CTA_LINK.h()) {
                    com.vk.ecomm.fave.api.di.a aVar = (com.vk.ecomm.fave.api.di.a) r6.getValue();
                    if (callProducerButton == null || (str = callProducerButton.k) == null) {
                        str = "";
                    }
                    aVar.d(good, str, context);
                    return;
                }
                if (i3 == PostActions.ACTION_MARKET_CTA_CALL_TO_OWNER.h()) {
                    ((com.vk.ecomm.fave.api.di.a) r6.getValue()).b(callProducerButton, good, context);
                    return;
                } else {
                    if (i3 == PostActions.ACTION_MARKET_CTA_OPEN_CART.h()) {
                        ((com.vk.ecomm.fave.api.di.a) r6.getValue()).c(context, good);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i3 == PostActions.ACTION_SHOW_STATS.h()) {
            g(newsEntry, Integer.valueOf(i2), MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.POST_STAT);
            if (!(newsEntry instanceof Post)) {
                if (newsEntry instanceof Videos) {
                    Videos videos3 = (Videos) newsEntry;
                    if (videos3.Ea()) {
                        ComFeatures comFeatures3 = ComFeatures.COM_MAIN_CARDS_ACTION;
                        comFeatures3.getClass();
                        if (!com.vk.toggle.b.A.a(comFeatures3) || (Nb = videos3.Nb()) == null) {
                            return;
                        }
                        ((xlc) bpn0Var.getValue()).b(context, new wlc.e(Nb.k));
                        return;
                    }
                    return;
                }
                return;
            }
            b25 a3 = o25.a();
            Post post7 = (Post) newsEntry;
            UserId userId4 = post7.m;
            if (!a3.a(userId4)) {
                d(context, post7);
                return;
            }
            boolean gc = post7.gc();
            bpn0 bpn0Var2 = this.t;
            if (gc) {
                Post R = di60.R(post7);
                if ((R != null ? di60.i(R) : null) != null) {
                    Post R2 = di60.R(post7);
                    if (R2 == null || (i = di60.i(R2)) == null) {
                        return;
                    }
                    ((syk0) bpn0Var2.getValue()).b(userId4, Integer.valueOf(i.k.o0()));
                    return;
                }
            }
            ComFeatures comFeatures4 = ComFeatures.COM_POST_STATISTICS;
            comFeatures4.getClass();
            if (com.vk.toggle.b.A.a(comFeatures4)) {
                ((syk0) bpn0Var2.getValue()).a(post7.n, userId4);
                return;
            } else {
                d(context, post7);
                return;
            }
        }
        if (i3 == PostActions.ACTION_OPEN_RECOMMENDATION_URL.h()) {
            c().q(context, newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_COPY_ADS_URL.h()) {
            c().s(newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_REMOVE_FROM_MAIN_TAB.h()) {
            if (userId2 == null) {
                return;
            }
            if (newsEntry instanceof Post) {
                c().A(context, userId2, (Post) newsEntry);
                return;
            } else {
                if (newsEntry instanceof Videos) {
                    c().Q(context, userId2, (Videos) newsEntry);
                    return;
                }
                return;
            }
        }
        if (i3 == PostActions.ACTION_ADD_TO_MAIN_TAB.h()) {
            if ((newsEntry instanceof Post) && userId2 != null) {
                c().o(context, userId2, (Post) newsEntry);
                return;
            }
            return;
        }
        if (i3 == PostActions.ACTION_TOGGLE_PINNED_ON_MAIN_TAB.h()) {
            if (!na60.e(newsEntry) || userId2 == null || (subscribe = c().b0(context, userId2, newsEntry).subscribe(new z6w(i4, this, newsEntry), new uk40(new pqz(14), 9))) == null) {
                return;
            }
            o2u0Var.a(subscribe);
            return;
        }
        if (i3 == PostActions.ACTION_BAN_USER.h()) {
            c().S(context, (Post) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_UNBAN_USER.h()) {
            c().F(context, (Post) newsEntry);
            return;
        }
        if (i3 == PostActions.ACTION_ADS_EASY_PROMOTE.h()) {
            String Bb = newsEntry.Bb();
            if (Bb == null) {
                return;
            }
            boolean d = fkq0.d(k9q0.o(newsEntry));
            boolean z5 = newsEntry instanceof Post;
            ?? r62 = this.u;
            if (z5) {
                hd60.a().G(context, InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, ((WallAdsEasyPromoteUrlBuilder) r62.getValue()).a(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_POST_ACTION_MENU : WallAdsEasyPromoteUrlBuilder.From.COM_POST_ACTION_MENU));
                return;
            } else {
                if (newsEntry instanceof Videos) {
                    hd60.a().G(context, InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, ((WallAdsEasyPromoteUrlBuilder) r62.getValue()).b(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_CLIP_ACTION_MENU : WallAdsEasyPromoteUrlBuilder.From.COM_CLIP_ACTION_MENU));
                    return;
                }
                return;
            }
        }
        if (i3 != PostActions.ACTION_ADD_TO_PLAYLIST.h()) {
            if (i3 == PostActions.ACTION_EDIT_PLAYLIST.h()) {
                Videos videos4 = (Videos) newsEntry;
                c63 c63Var3 = c63.a;
                Activity b4 = c63.b();
                VideoAttachment Nb4 = videos4.Nb();
                if (b4 == null || Nb4 == null || !videos4.Ea()) {
                    return;
                }
                ((xlc) bpn0Var.getValue()).e(b4, new wlc.c(Nb4.k, false));
                return;
            }
            return;
        }
        Videos videos5 = (Videos) newsEntry;
        c63 c63Var4 = c63.a;
        Activity b5 = c63.b();
        VideoAttachment Nb5 = videos5.Nb();
        if (b5 == null || Nb5 == null) {
            return;
        }
        if (videos5.Ea()) {
            ((xlc) bpn0Var.getValue()).a(b5, new wlc.a(Nb5.k, false));
            return;
        }
        VideoFile videoFile = Nb5.k;
        if (fxc0.B().J().i1() && (s = videoFile.s()) != null && (userId = s.b) != null && fkq0.b(userId) && videoFile.t0()) {
            g7s0 B = fxc0.B();
            VideoFile videoFile2 = Nb5.k;
            if (videoFile2.t0()) {
                Owner s2 = videoFile2.s();
                if (s2 == null || s2.b == null) {
                    UserId.b bVar = UserId.c;
                }
            } else {
                o25.a().c();
            }
            B.getClass();
            return;
        }
        g7s0 B2 = fxc0.B();
        VideoFile videoFile3 = Nb5.k;
        if (videoFile3.t0()) {
            Owner s3 = videoFile3.s();
            if (s3 == null || (c = s3.b) == null) {
                c = UserId.d;
            }
        } else {
            c = o25.a().c();
        }
        B2.k0(b5, videoFile3, false, c, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(NewsEntry newsEntry, Integer num, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action) {
        p4r p4rVar = (p4r) this.j.getValue();
        UserId o = k9q0.o(newsEntry);
        int n = di60.n(newsEntry);
        String str = newsEntry.Cb().b;
        Integer valueOf = Integer.valueOf(n);
        p4rVar.getClass();
        p4r.d(action, o, valueOf, str, num);
    }
}
