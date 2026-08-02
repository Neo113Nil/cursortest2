package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.api.likes.LikesGetList;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.tags.Tag;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedInteractionItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c9x0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.k840;
import xsna.q8u;
import xsna.qr80;
import xsna.wty0;
import xsna.xqu;

/* compiled from: PostsController.kt */
/* loaded from: classes4.dex */
public final class iuc0 implements c1c0, w8i {
    public static final iuc0 b = new iuc0();
    public static final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public static final Object d;
    public static final Object e;
    public static final Object f;
    public static final Object g;
    public static final Object h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;
    public static final Object m;
    public static final Object n;
    public static final Object o;
    public static final Object p;
    public static final Object q;

    /* compiled from: PostsController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NewsfeedNewsfeedItemTypeDto.values().length];
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.INFO_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.values().length];
            try {
                iArr2[MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT_THREE_DOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_DELETE_DRAFT_THREE_DOTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: PostsController.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final b b = new b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: PostsController.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final c b = new c(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: PostsController.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    static {
        com.vk.movika.sdk.android.defaultplayer.interactive.b bVar = new com.vk.movika.sdk.android.defaultplayer.interactive.b(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        d = msy.a(lazyThreadSafetyMode, bVar);
        e = msy.a(lazyThreadSafetyMode, new h13(21));
        f = msy.a(lazyThreadSafetyMode, new ml7(23));
        g = msy.a(lazyThreadSafetyMode, new o2a0(4));
        h = msy.a(lazyThreadSafetyMode, new d2(29));
        i = msy.a(lazyThreadSafetyMode, new g2c0(2));
        j = msy.a(lazyThreadSafetyMode, new jo60(3));
        int i2 = 24;
        k = msy.a(lazyThreadSafetyMode, new c6(i2));
        l = msy.a(lazyThreadSafetyMode, new xs6(i2));
        m = msy.a(lazyThreadSafetyMode, new d2c0(3));
        n = msy.a(lazyThreadSafetyMode, new buc0(0));
        o = msy.a(lazyThreadSafetyMode, new cu1(25));
        p = msy.a(lazyThreadSafetyMode, new fd90(1));
        q = msy.a(lazyThreadSafetyMode, new ia90(3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void c0(Context context, NewsEntry newsEntry, UserId userId, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        c.b(hg1.l(((am60) e.getValue()).e(newsEntry, userId, str, newsfeedAddBanTypeDto).o(asu0.a.d()), context, 62).subscribe(new lhc(context, userId, newsEntry), new ux00(new n0w(context, 1), 15)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(int i2, Context context, Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
        q860 q860Var;
        io.reactivex.rxjava3.internal.operators.observable.f0 w0;
        CharSequence b2;
        if (post.D != null) {
            FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                Pattern pattern = n420.a;
                b2 = n420.b(post.s);
            } else {
                ej90 ej90Var = post.P;
                if (ej90Var != null) {
                    b2 = ej90Var.c;
                    if (b2 == null) {
                        b2 = "";
                    }
                } else {
                    Pattern pattern2 = n420.a;
                    b2 = n420.b(post.s);
                }
            }
            la60 e0 = e0();
            l6 l6Var = new l6(6, context, post);
            e0.getClass();
            la60.f(context, b2, l6Var);
            return;
        }
        String str = post.t;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1863356540) {
                if (hashCode != 95844769) {
                    if (hashCode == 108401386 && str.equals("reply")) {
                        int i3 = rfc0.a;
                        q860Var = new q860();
                        q860Var.f = epc0.EditPost;
                        q860Var.h = post;
                        q860Var.k = false;
                        q860Var.g = postingCreationEntryPoint;
                    }
                } else if (str.equals("draft")) {
                    int i4 = rfc0.a;
                    q860Var = new q860();
                    q860Var.f = epc0.EditRemoteDraft;
                    q860Var.h = post;
                    q860Var.k = !post.Pb();
                    q860Var.g = postingCreationEntryPoint;
                }
            } else if (str.equals("suggest")) {
                UserId e2 = fkq0.e(post.m);
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new c1e(e2, 3));
                ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures)) {
                    List singletonList = Collections.singletonList(fkq0.a(e2));
                    List<GroupsFieldsDto> list = fkg.a;
                    if ((4 & 2) != 0) {
                        list = null;
                    }
                    fz2 y = yfb.y(xqu.a.a(null, singletonList, list), new uuz(15));
                    ahn.D(y);
                    w0 = rsg0.w0(y);
                } else {
                    w0 = rsg0.w0(new rpu(e2));
                }
                io.reactivex.rxjava3.internal.operators.single.e0 n2 = vVar.n(w0);
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                n2.q(asu0.r()).m(asu0Var.d()).subscribe(new cl30(new guc0(i2, context, post, postingCreationEntryPoint), 9), new skz(new c220(14), 18));
                q860Var = null;
            }
            if (q860Var == null && post.l.zb(8388608L)) {
                la60 e02 = e0();
                xtc0 xtc0Var = new xtc0(context, q860Var, i2);
                e02.getClass();
                la60.h(context, xtc0Var);
                return;
            }
            if (q860Var != null) {
                return;
            }
            if (i2 != -1) {
                q860Var.d(xa4.L(context), i2);
                return;
            } else {
                q860Var.l(context);
                return;
            }
        }
        int i5 = rfc0.a;
        q860Var = new q860();
        q860Var.f = epc0.EditPost;
        q860Var.h = post;
        q860Var.k = !post.Pb();
        q860Var.g = postingCreationEntryPoint;
        if (q860Var == null) {
        }
        if (q860Var != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static la60 e0() {
        return (la60) d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static d0c0 f0() {
        return (d0c0) i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static d4c0 g0() {
        return (d4c0) f.getValue();
    }

    public static void h0(UserId userId, UserProfile userProfile, Context context) {
        Activity h2 = e3m.h(context);
        if (h2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("id", userId);
        bundle.putParcelable(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, userProfile);
        hd60.a().b1(h2, bundle);
    }

    public static boolean i0(UserId userId) {
        if (userId == null || !fkq0.b(userId)) {
            ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
            comFeatures.getClass();
            if (!com.vk.toggle.b.A.a(comFeatures)) {
                return false;
            }
        }
        return true;
    }

    public static void j0(Context context, boolean z) {
        if (!z) {
            cvk.u(R.string.wall_ok, false);
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(context.getString(R.string.wall_ok_redesigned), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    public static void k0(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Post) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Post) it.next()).Bb());
        }
        c.b(rsg0.y0(new i730(j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, null, 62)), null, null, 3).subscribe(new a960(new svz(19), 12), new n240(new y8m(26), 12)));
    }

    @Override // xsna.c1c0
    public final void A(Context context, UserId userId, Post post) {
        c.b(hg1.l(g0().i(post.Bb(), userId, OwnersRemoveFromMainTabItemTypeDto.POST).o(asu0.a.d()), context, 62).subscribe(new ya4(1, post, context), new fsq(new d4r(19), 21)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void B(NewsEntry newsEntry, Integer num) {
        try {
            String b2 = new mc0((b25) l.getValue(), ((LinksGeneratorComponent) m.getValue()).N7(), (com.vk.video.ui.share.api.b) o.getValue()).b(newsEntry);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            fvr.l(context, b2);
            cvk.u(R.string.link_copied, false);
        } catch (Exception e2) {
            cvk.u(R.string.error, false);
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
        p4r p4rVar = (p4r) j.getValue();
        UserId o2 = k9q0.o(newsEntry);
        int n2 = di60.n(newsEntry);
        String str = newsEntry.Cb().b;
        MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.COPY_LINK;
        Integer valueOf = Integer.valueOf(n2);
        p4rVar.getClass();
        p4r.d(action, o2, valueOf, str, num);
    }

    @Override // xsna.c1c0
    public final void C(Context context, Post post) {
        if (post == null) {
            return;
        }
        d4c0 g0 = g0();
        UiTracker uiTracker = UiTracker.a;
        c.b(bug0.e(g0.y(UiTracker.d(), post), context, null, 6).subscribe(new d750(new mm1(25, post, context), 8), new ox80(new euc0(context, 0), 5)));
    }

    @Override // xsna.c1c0
    public final void D(Context context, Post post) {
        UserId userId = post.m;
        int i2 = post.n;
        tfx tfxVar = new tfx("wall.restore", new d4r0(5), new e630(13));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "post_id", i2, 0, 0, 8);
        c.b(bug0.d(rsg0.y0(yfb.x(tfxVar), null, null, 3), context, null, 6).subscribe(new nex(new r9c0(post, 2), 16), new m5y(new rvq(22), 20)));
    }

    @Override // xsna.c1c0
    public final void E(Context context, Post post, UserId userId, UserId userId2) {
        c.b(hg1.l(g0().l(post.n, userId, userId2), context, 62).subscribe(new d9b(post, 3), new ttc0(c.b, 0)));
    }

    @Override // xsna.c1c0
    public final void F(Context context, Post post) {
        int i2 = 14;
        c.b(bug0.d(rsg0.y0(yfb.x(new zqu().t(fkq0.e(post.m), post.o.b)), null, null, 3), context, null, 6).subscribe(new q440(new rj60(post, 11), i2), new oo20(new e420(i2), 16)));
    }

    @Override // xsna.c1c0
    public final void G(Context context, Post post, z6c0 z6c0Var, b3m b3mVar) {
        c.b(bug0.e(g0().e(post, z6c0Var).m(asu0.a.d()), context, null, 6).subscribe(new m3y(new tol(post, context, b3mVar, 5), 15), new f2u(new uh40(context, 14), 13)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void H(final Context context, final NewsEntry newsEntry, final boolean z, final MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint) {
        la60 e0 = e0();
        UserId c2 = ((b25) l.getValue()).c();
        gzs gzsVar = new gzs() { // from class: xsna.huc0
            @Override // xsna.gzs
            public final Object invoke() {
                iuc0.b.d(context, newsEntry, z, creationEntryPoint);
                return s3q0.a;
            }
        };
        e0.getClass();
        la60.c(context, newsEntry, c2, z, gzsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c1c0
    public final void I(Context context, NewsEntry newsEntry, int i2) {
        aw0 aw0Var;
        d0c0 f0 = f0();
        f0.getClass();
        if (newsEntry instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            aw0Var = new aw0(shitAttachment.i, shitAttachment.j, shitAttachment.v, shitAttachment.X, shitAttachment.W);
        } else if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            aw0Var = new aw0(promoPost.i, promoPost.j, promoPost.l, promoPost.z, promoPost.y);
        } else {
            if (!(newsEntry instanceof Html5Entry)) {
                return;
            }
            Html5Entry html5Entry = (Html5Entry) newsEntry;
            aw0Var = new aw0(html5Entry.i, html5Entry.j, html5Entry.x, html5Entry.E, html5Entry.D);
        }
        if (newsEntry instanceof DeprecatedStatisticInterface) {
            DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) newsEntry;
            int i3 = aw0Var.a;
            int i4 = aw0Var.b;
            if (i2 == 0) {
                ahn.g(deprecatedStatisticInterface, i2, i3, i4, "closed_by_user");
            } else {
                ahn.g(deprecatedStatisticInterface, i2, i3, i4, "hide");
            }
        }
        f0.b.b(hg1.l(f0.a.a(new cw0(aw0Var.c, Integer.valueOf(i2))), context, 62).subscribe(new lm1(newsEntry, 4), new pd40(new n99(com.vk.metrics.eventtracking.b.a, 9), 9)));
    }

    @Override // xsna.c1c0
    public final void J(Context context, ShitAttachment shitAttachment) {
        d0c0 f0 = f0();
        f0.getClass();
        f0.a(context, shitAttachment, new aw0(shitAttachment.i, shitAttachment.j, shitAttachment.v, shitAttachment.X, shitAttachment.W));
    }

    @Override // xsna.c1c0
    public final void K(NewsEntry newsEntry) {
        newsEntry.d = true;
        qr.d(ce60.b, 101, newsEntry);
    }

    @Override // xsna.c1c0
    public final io.reactivex.rxjava3.core.a L(Context context, Post post) {
        return hg1.l((post.mc() ? g0().r(post) : g0().t(post)).o(asu0.a.d()), context, 62);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void M(Context context, Post post) {
        c.b(bug0.d(rsg0.y0(new com.vk.newsfeed.impl.requests.b((n9x0) q.getValue(), post.m, post.n), null, null, 3), context, null, 6).subscribe(new lav(new sux(17), 22), new pmu(new e810(context, 21), 15)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c1c0
    public final void N(Context context, NewsEntry newsEntry, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        Owner s;
        UserId userId;
        if (!(newsEntry instanceof l490) || (s = ((l490) newsEntry).s()) == null || (userId = s.b) == null) {
            return;
        }
        c0(context, newsEntry, userId, str, newsfeedAddBanTypeDto);
    }

    @Override // xsna.c1c0
    public final io.reactivex.rxjava3.core.a O(Context context, Post post) {
        return hg1.l((post.l.zb(33554432L) ? g0().g(post) : g0().d(post)).o(asu0.a.d()), context, 62);
    }

    @Override // xsna.c1c0
    public final void P(Context context, NewsEntry newsEntry, String str, String str2) {
        if (newsEntry instanceof Post) {
            new i08();
            i08.a(context, (Post) newsEntry, str, str2);
            return;
        }
        if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            hd60.a().w1(context, promoPost.n, str2, str, promoPost.r());
        } else if (!(newsEntry instanceof Videos)) {
            L.l("Can't add to fave " + newsEntry);
        } else {
            Videos videos = (Videos) newsEntry;
            VideoAttachment Nb = videos.Nb();
            if (Nb != null) {
                hd60.a().w1(context, Nb, str2, str, videos.r());
            }
        }
    }

    @Override // xsna.c1c0
    public final void Q(Context context, UserId userId, Videos videos) {
        String Bb = videos.Bb();
        if (Bb == null) {
            return;
        }
        c.b(hg1.l(g0().i(Bb, userId, videos.Ea() ? OwnersRemoveFromMainTabItemTypeDto.CLIP : OwnersRemoveFromMainTabItemTypeDto.VIDEO).o(asu0.a.d()), context, 62).subscribe(new fr60(1, videos, context), new sl30(new s6x(21), 15)));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void R(Context context, NewsEntry newsEntry, String str, int i2, int i3) {
        new p4r();
        p4r.f(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.REPORT_MENU_ITEM, newsEntry.Cb().b, newsEntry.Db(), i3, str);
        AdsChoices a2 = di60.a(newsEntry);
        String str2 = a2 != null ? a2.d : null;
        MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr = (MyTargetAdsComplainOptions[]) di60.c("complain", newsEntry).toArray(new MyTargetAdsComplainOptions[0]);
        if (str2 == null || myTargetAdsComplainOptionsArr.length == 0) {
            hd60.a().J0(context, newsEntry, str, i2);
        } else {
            ((NewsfeedRouter) k.getValue()).o(context, newsEntry, str2, myTargetAdsComplainOptionsArr);
        }
    }

    @Override // xsna.c1c0
    public final void S(Context context, Post post) {
        c.b(bug0.d(new com.vk.newsfeed.impl.helpers.a().a(fkq0.e(post.m), post.o.b, true), context, null, 6).subscribe(new k130(new hl1(28, post, context), 15), new f5y(new qb6(26, post, context), 18)));
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void T(Context context, NewsEntry newsEntry, NewsEntry newsEntry2, String str, int i2) {
        if (sl60.F0(newsEntry)) {
            PostInteract Ab = PostInteract.Ab(str, newsEntry);
            if (Ab != null) {
                Ab.n = i2;
                Ab.zb(PostInteract.Type.hide);
            }
            if (newsEntry instanceof Digest) {
                b.d dVar = new b.d("digest_hide");
                dVar.b(((Digest) newsEntry).o, "track_code");
                dVar.e();
            } else if (newsEntry instanceof PlaylistsCarousel) {
                PlaylistsCarousel playlistsCarousel = (PlaylistsCarousel) newsEntry;
                Integer num = playlistsCarousel.r;
                int intValue = num != null ? num.intValue() : 0;
                s750 s750Var = k840.a.e;
                if (s750Var == null) {
                    s750Var = null;
                }
                s750Var.b0(new iab0(playlistsCarousel.p, playlistsCarousel.q == AudioGetFeedPlaylistsBlockResponseDto.TypeDto.RECOMMENDED_PLAYLIST_OFFICIAL, String.valueOf(intValue), playlistsCarousel.l), true, null);
            }
            c.b(bug0.e(((am60) e.getValue()).i(newsEntry, newsEntry2, str), context, null, 6).subscribe(new fl30(new com.vk.movika.sdk.base.ui.s0(24, newsEntry, newsEntry2), 16), new hms(new dd60(context, 1), 28)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void U(Context context, final NewsEntry newsEntry, final boolean z) {
        UserId userId;
        Owner s = ((l490) newsEntry).s();
        if (s == null || (userId = s.b) == null) {
            userId = UserId.d;
        }
        if (!fkq0.c(userId) || ((b25) l.getValue()).a(userId)) {
            return;
        }
        c.b(hg1.l(z ? g0().k(userId, newsEntry.Cb().b) : g0().o(userId, newsEntry.Cb().b), context, 62).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.utc0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                NewsEntry newsEntry2 = NewsEntry.this;
                boolean z2 = newsEntry2 instanceof Post;
                boolean z3 = z;
                if (z2) {
                    ((Post) newsEntry2).l.Ab(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, z3);
                }
                qr.d(ce60.b, 104, newsEntry2);
                cvk.u(z3 ? R.string.subscribed_to_posts : R.string.unsubscribed_from_posts, false);
            }
        }, new lkz(new xd40(context, 12), 13)));
    }

    @Override // xsna.c1c0
    public final void V(Comment comment, Post post, boolean z, ReactionMeta reactionMeta, String str) {
        String str2 = (str == null || !brm0.B(str, "feed", false)) ? "discover_full".equals(str) ? "discover_inline" : "wall_inline" : "feed_inline";
        int i2 = comment.h;
        comment.h = (z ? 1 : -1) + i2;
        boolean z2 = comment.i;
        comment.i = z;
        comment.G2();
        if ((post.C instanceof CommentsActivity) && comment.p) {
            comment.r = comment.i;
        }
        ysg0.b.a(new b0x(post.m, post.n, comment.b));
        s9x0 s9x0Var = new s9x0(z, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null, post.m, comment.b, 4, 0, "", UserId.d, null);
        s9x0Var.s = comment.n;
        s9x0Var.j("ref", str2);
        c.b(rsg0.y0(s9x0Var, null, null, 3).subscribe(new o060(new isg(comment, reactionMeta, post, 6), 8), new w250(new cuc0(comment, i2, z2, post), 9)));
    }

    @Override // xsna.c1c0
    public final void W(Context context, TagsSuggestions tagsSuggestions, String str) {
        c.b(bug0.d(rsg0.y0(new hs(tagsSuggestions.k, str, 1), null, null, 3), context, null, 6).subscribe(new l8w(new fh1(19, tagsSuggestions, context), 17), new b8v(new kn20(context, 28), 19)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void X(Context context, NewsEntry newsEntry, String str) {
        gjx gjxVar;
        MyTargetNativeAdEntry myTargetNativeAdEntry = newsEntry instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry : null;
        if (myTargetNativeAdEntry == null || (gjxVar = myTargetNativeAdEntry.B) == null) {
            return;
        }
        ajx c2 = up50.c(gjxVar, str);
        if (c2 != null) {
            ((yix) p.getValue()).b(gjxVar);
            if (c2 instanceof ufy0) {
                ufy0 ufy0Var = (ufy0) c2;
                wty0.a aVar = ufy0Var.a;
                String str2 = aVar.a;
                if (!TextUtils.isEmpty(str2)) {
                    h8z0.b(str2);
                }
                if ("copy".equals(ufy0Var.getType())) {
                    String str3 = aVar.c;
                    if (str3 != null) {
                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str3));
                    }
                } else {
                    String str4 = aVar.b;
                    if (!TextUtils.isEmpty(str4)) {
                        de.L(str4, null, null, null, context);
                    }
                }
            }
        }
        f0().getClass();
        qr.d(ce60.b, 100, newsEntry);
    }

    @Override // xsna.c1c0
    public final void Y(Context context, Tag tag, h4 h4Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar) {
        e0().getClass();
        q8u.a aVar2 = new q8u.a(context, tag);
        aVar2.f = h4Var;
        aVar2.g = aVar;
        aVar2.I0(null);
    }

    @Override // xsna.c1c0
    public final void Z(Context context, Post post, b3m b3mVar) {
        UiTracker uiTracker = UiTracker.a;
        io.reactivex.rxjava3.core.x e2 = bug0.e(g0().p(UiTracker.d(), post).m(asu0.a.d()), context, null, 6);
        pps ppsVar = new pps(post, context, b3mVar);
        int i2 = 20;
        c.b(e2.subscribe(new c2y(ppsVar, i2), new xk30(new d2y(context, i2), 15)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void a(Post post) {
        if (post == null) {
            return;
        }
        c.b(((am60) e.getValue()).a(post).subscribe(new duc0(), new r7a0(new y160(6), 5)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void a0(NewsEntry newsEntry) {
        c.b(((am60) e.getValue()).j(newsEntry).subscribe(new n1r(new av70(4), 17), new amt(new d0k(24), 23)));
    }

    @Override // xsna.c1c0
    public final void b(Context context, aq3 aq3Var) {
        e0().getClass();
        la60.b(context, aq3Var);
    }

    @Override // xsna.c1c0
    public final io.reactivex.rxjava3.core.a b0(Context context, UserId userId, final NewsEntry newsEntry) {
        io.reactivex.rxjava3.core.a kVar;
        if (!na60.e(newsEntry)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        boolean f2 = na60.f(newsEntry);
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            return new io.reactivex.rxjava3.internal.operators.completable.k(new io.reactivex.rxjava3.functions.n() { // from class: xsna.wtc0
                @Override // io.reactivex.rxjava3.functions.n
                public final Object get() {
                    StringBuilder sb = new StringBuilder("getShortObjectString() returns null on ");
                    NewsEntry newsEntry2 = NewsEntry.this;
                    sb.append(fpf0.a(newsEntry2.getClass()).l());
                    sb.append(", postId = ");
                    sb.append(di60.n(newsEntry2));
                    sb.append(" while trying to toggle pin on MainTab");
                    return new IllegalStateException(sb.toString());
                }
            });
        }
        OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto = null;
        r2 = null;
        OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto = null;
        ownersPinToMainTabItemTypeDto = null;
        if (f2) {
            if (newsEntry instanceof Post) {
                ownersUnpinFromMainTabItemTypeDto = OwnersUnpinFromMainTabItemTypeDto.POST;
            } else if (newsEntry instanceof Videos) {
                if (((Videos) newsEntry).Qb()) {
                    ownersUnpinFromMainTabItemTypeDto = OwnersUnpinFromMainTabItemTypeDto.CLIP;
                } else if (di60.L(newsEntry)) {
                    ownersUnpinFromMainTabItemTypeDto = OwnersUnpinFromMainTabItemTypeDto.VIDEO;
                }
            }
            kVar = ownersUnpinFromMainTabItemTypeDto == null ? new io.reactivex.rxjava3.internal.operators.completable.k(new ytc0()) : g0().c(Bb, userId, ownersUnpinFromMainTabItemTypeDto).g(new f3a(newsEntry, 4));
        } else {
            if (newsEntry instanceof Post) {
                ownersPinToMainTabItemTypeDto = OwnersPinToMainTabItemTypeDto.POST;
            } else if (newsEntry instanceof Videos) {
                if (((Videos) newsEntry).Qb()) {
                    ownersPinToMainTabItemTypeDto = OwnersPinToMainTabItemTypeDto.CLIP;
                } else if (di60.L(newsEntry)) {
                    ownersPinToMainTabItemTypeDto = OwnersPinToMainTabItemTypeDto.VIDEO;
                }
            }
            kVar = ownersPinToMainTabItemTypeDto == null ? new io.reactivex.rxjava3.internal.operators.completable.k(new ztc0()) : g0().b(Bb, userId, ownersPinToMainTabItemTypeDto).g(new jf1(newsEntry, 6));
        }
        return hg1.l(kVar.o(asu0.a.d()), context, 62);
    }

    @Override // xsna.c1c0
    public final void c(int i2, Context context, Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
        if (!myc0.f(post.Z)) {
            d0(i2, context, post, postingCreationEntryPoint);
        } else {
            c.b(bug0.d(rsg0.y0(new i730(post.Bb()), null, null, 3), context, null, 6).subscribe(new jsb0(new dwa(context, i2, postingCreationEntryPoint, 1), 4), new d120(new q520(15), 11)));
        }
    }

    @Override // xsna.c1c0
    public final void d(Context context, NewsEntry newsEntry, boolean z, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint) {
        String a2;
        String lowerCase = creationEntryPoint != null ? creationEntryPoint.name().toLowerCase(Locale.ROOT) : null;
        int i2 = creationEntryPoint == null ? -1 : a.$EnumSwitchMapping$1[creationEntryPoint.ordinal()];
        if (i2 == 1 || i2 == 2) {
            a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DRAFTS_FEED);
        } else if (i2 != 3) {
            UiTracker uiTracker = UiTracker.a;
            a2 = UiTracker.d();
        } else {
            a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DRAFTS_LIST);
        }
        c.b(hg1.l(g0().h(newsEntry, new z6c0(z, lowerCase, a2)).o(asu0.a.d()), context, 62).subscribe(new sbb(newsEntry, 4), new pdw(new vtc0(context, 0), 18)));
    }

    @Override // xsna.c1c0
    public final void e(Context context, String str) {
        e0().getClass();
        la60.a(context, str);
    }

    @Override // xsna.c1c0
    @ozl
    public final void f(Context context, l6z l6zVar, izs izsVar, udl udlVar) {
        jmb jmbVar = new jmb(context.getApplicationContext(), 1);
        io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new m6z(g0(), l6zVar, hd60.a().w()));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        c.b(bVar.q(asu0.k()).m(asu0Var.d()).subscribe(new cp50(new jl6(l6zVar, jmbVar, izsVar, 9), 10), new zyu(new qt5(24, jmbVar, udlVar), 21)));
    }

    @Override // xsna.c1c0
    public final void g(NewsEntry newsEntry, Post post, String str) {
        c.b(rsg0.y0(new sl60(post.n, post.m, "caption", str, post.L.b), null, null, 3).subscribe(new c120(new zb60(newsEntry, 14), 19), new x150(new d(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 7)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void h(NewsEntry newsEntry, Integer num) {
        p4r p4rVar = (p4r) j.getValue();
        UserId o2 = k9q0.o(newsEntry);
        int n2 = di60.n(newsEntry);
        String str = newsEntry.Cb().b;
        MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.COPY_ERID;
        Integer valueOf = Integer.valueOf(n2);
        p4rVar.getClass();
        p4r.d(action, o2, valueOf, str, num);
        String b2 = di60.b(newsEntry);
        if (b2 == null) {
            return;
        }
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            fvr.l(context, b2);
            cvk.u(R.string.ad_marker_copied, false);
        } catch (Exception e2) {
            cvk.u(R.string.error, false);
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
    }

    @Override // xsna.c1c0
    public final void i(Context context, Post post) {
        hd60.a().J0(context, post, null, 0);
    }

    @Override // xsna.c1c0
    public final void j(Context context, Post post, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        LinkedHashMap t = fvr.t(post);
        if (t.size() < 2) {
            c0(context, post, post.m, str, newsfeedAddBanTypeDto);
            return;
        }
        la60 e0 = e0();
        String[] strArr = (String[]) t.values().toArray(new String[0]);
        UserId[] userIdArr = (UserId[]) t.keySet().toArray(new UserId[0]);
        sps spsVar = new sps(context, post, str, newsfeedAddBanTypeDto);
        e0.getClass();
        int i2 = h7u0.p;
        h7u0.a a2 = h7u0.b.a(context);
        a2.g0(R.string.hide_from_newsfeed);
        a2.T(strArr, new b10(1, spsVar, userIdArr));
        a2.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void k(Context context, c6z c6zVar, boolean z) {
        ModalReactionsFragment.a aVar;
        String Ab;
        Photo photo;
        VideoFile videoFile;
        ModalReactionsFragment.a aVar2;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        ItemReactions K = o2f0Var != null ? o2f0Var.K() : null;
        int T9 = c6zVar.T9() - (c6zVar.J() ? 1 : 0);
        int i7 = c6zVar.i7() - (c6zVar.x1() ? 1 : 0);
        if ((o2f0Var == null || !o2f0Var.T8()) && T9 == 0 && i7 == 0 && (K == null || K.c == 0)) {
            return;
        }
        boolean z2 = BuildInfo.q() && (c6zVar instanceof Videos);
        if ((c6zVar instanceof NewsEntry) && !z2) {
            NewsEntry newsEntry = (NewsEntry) c6zVar;
            ((NewsfeedRouter) k.getValue()).b0(context, newsEntry, ModalPostDestination.REACTIONS_ALL, z, null, null, newsEntry.Cb().b, qr80.h.a);
            return;
        }
        if (c6zVar instanceof Post) {
            Post post = (Post) c6zVar;
            aVar = new ModalReactionsFragment.a(post.m, post.n);
            LikesGetList.Type type = post.hc() ? LikesGetList.Type.COMMENT : (post.dc() || post.F) ? LikesGetList.Type.POST_ADS : LikesGetList.Type.POST;
            Bundle bundle = aVar.j;
            bundle.putSerializable("ltype", type);
            bundle.putParcelable("news_entry", post);
            Ab = post.Ab();
        } else if (c6zVar instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) c6zVar;
            Post post2 = promoPost.n;
            aVar = new ModalReactionsFragment.a(post2.m, post2.n);
            LikesGetList.Type type2 = LikesGetList.Type.POST_ADS;
            Bundle bundle2 = aVar.j;
            bundle2.putSerializable("ltype", type2);
            bundle2.putParcelable("news_entry", promoPost);
            Ab = post2.Ab();
        } else if (c6zVar instanceof Videos) {
            Videos videos = (Videos) c6zVar;
            VideoAttachment Nb = videos.Nb();
            if (Nb == null || (videoFile = Nb.k) == null) {
                aVar = null;
            } else {
                if (g620.f().d(videoFile)) {
                    aVar2 = new ModalReactionsFragment.a(videoFile);
                    dhr0.a.getClass();
                    aVar2.w(dhr0.u().c);
                } else {
                    aVar2 = new ModalReactionsFragment.a(videoFile);
                }
                aVar = aVar2;
            }
            Ab = videos.Ab();
        } else {
            if (!(c6zVar instanceof Photos)) {
                return;
            }
            Photos photos = (Photos) c6zVar;
            PhotoAttachment Mb = photos.Mb();
            if (Mb == null || (photo = Mb.l) == null) {
                aVar = null;
            } else {
                ModalReactionsFragment.a aVar3 = new ModalReactionsFragment.a(photo.e, photo.c);
                aVar3.j.putSerializable("ltype", LikesGetList.Type.PHOTO);
                aVar = aVar3;
            }
            Ab = photos.Ab();
        }
        if (aVar == null) {
            return;
        }
        Activity h2 = e3m.h(context);
        FragmentActivity fragmentActivity = h2 instanceof FragmentActivity ? (FragmentActivity) h2 : null;
        if (fragmentActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        aVar.j().Ab().Td(supportFragmentManager, "ModalReactionsFragment_" + Ab);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void l(String str, NewsEntry newsEntry) {
        ((rv0) n.getValue()).a(str);
        f0().getClass();
        qr.d(ce60.b, 100, newsEntry);
    }

    @Override // xsna.c1c0
    public final void m(Context context, PromoPost promoPost) {
        d0c0 f0 = f0();
        f0.getClass();
        f0.a(context, promoPost, new aw0(promoPost.i, promoPost.j, promoPost.l, promoPost.z, promoPost.y));
    }

    @Override // xsna.c1c0
    public final void n(Context context, Post post, UserId userId, UserId userId2) {
        c.b(hg1.l(g0().n(post.n, userId, userId2), context, 62).subscribe(new u00(post, 5), new k2y(b.b, 12)));
    }

    @Override // xsna.c1c0
    public final void o(Context context, UserId userId, Post post) {
        c.b(hg1.l(g0().f(post.Bb(), userId, OwnersAddToMainTabItemTypeDto.POST).o(asu0.a.d()), context, 62).subscribe(new my10(1, post, context), new d750(new dl70(10), 7)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void p(Context context, NewsEntry newsEntry, Integer num) {
        p4r p4rVar = (p4r) j.getValue();
        UserId o2 = k9q0.o(newsEntry);
        int n2 = di60.n(newsEntry);
        String str = newsEntry.Cb().b;
        MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.OPEN_ADVERTISER_INFO;
        Integer valueOf = Integer.valueOf(n2);
        p4rVar.getClass();
        p4r.d(action, o2, valueOf, str, num);
        String e2 = di60.e(newsEntry);
        if (e2 == null) {
            return;
        }
        maz.c(xwk.d().e(), context, e2, LaunchContext.A, null, null, 24);
    }

    @Override // xsna.c1c0
    public final void q(Context context, NewsEntry newsEntry) {
        String t = di60.t(newsEntry);
        if (t == null) {
            return;
        }
        maz.c(xwk.d().e(), context, t, LaunchContext.A, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void r(Context context, Post post) {
        c.b(bug0.d(rsg0.y0(new e9x0((n9x0) q.getValue(), post.m, post.n), null, null, 3), context, null, 6).subscribe(new tl30(new amp(21), 15), new wmz(new kb40(context, 16), 17)));
    }

    @Override // xsna.c1c0
    public final void s(NewsEntry newsEntry) {
        String d2 = di60.d(newsEntry);
        if (d2 == null) {
            return;
        }
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            fvr.l(context, d2);
            cvk.u(R.string.ads_url_copied, false);
        } catch (Exception e2) {
            cvk.u(R.string.error, false);
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
    }

    @Override // xsna.c1c0
    public final void t(Context context, Post post, boolean z) {
        UiTracker uiTracker = UiTracker.a;
        io.reactivex.rxjava3.core.a h2 = g0().h(post, new z6c0(z, null, UiTracker.d(), 2));
        b1e b1eVar = new b1e(1);
        h2.getClass();
        c.b(bug0.e(io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.completable.c0(h2, b1eVar, null), new com.vk.newsfeed.impl.helpers.a().a(fkq0.e(post.m), post.o.b, true).K(), new ck70(3, new vv7(7))).m(asu0.a.d()), context, null, 6).subscribe(new zk30(new fuc0(post, 0), 13), new pdw(new vtc0(context, 1), 19)));
    }

    @Override // xsna.c1c0
    public final void u(Context context, Html5Entry html5Entry) {
        d0c0 f0 = f0();
        f0.getClass();
        f0.a(context, html5Entry, new aw0(html5Entry.i, html5Entry.j, html5Entry.x, html5Entry.E, html5Entry.D));
    }

    @Override // xsna.c1c0
    public final void v(Context context, Post post) {
        c.b(bug0.d(rsg0.y0(new czk0(post.m, post.n, 0), null, null, 3), context, null, 6).subscribe(new sl30(new zl20(post, 21), 16), new tl30(new dma0(context, 1), 16)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c1c0
    public final void w(Context context, Post post) {
        VideoFile videoFile;
        Post post2 = post.D;
        if (post2 != null) {
            NewsfeedRouter newsfeedRouter = (NewsfeedRouter) k.getValue();
            if (!post2.sc()) {
                NewsfeedRouter.w(newsfeedRouter, context, post2.Bb(), null, c9x0.c.b, null, 48);
                return;
            }
            VideoAttachment i2 = di60.i(post2);
            if (i2 == null || (videoFile = i2.k) == null) {
                return;
            }
            fxc0.B().Y().k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        }
    }

    @Override // xsna.c1c0
    public final void x(Context context, Post post) {
        if (post == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        c.b(bug0.e(g0().u(UiTracker.d(), post), context, null, 6).subscribe(new ksb0(new mu1(27, post, context), 1), new lav(new qm90(5, post, context), 23)));
    }

    @Override // xsna.c1c0
    public final void y(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        f0().getClass();
        ce60.b.getClass();
        p870.f().e(100, myTargetNativeAdEntry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c1c0
    public final void z(Context context, NewsEntry newsEntry, boolean z) {
        if (newsEntry instanceof c6z) {
            k(context, (c6z) newsEntry, z);
        }
    }
}
