package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingClient;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.ironsource.C4504q2;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.base.Document;
import com.vk.auth.utils.VkPassportPage;
import com.vk.balance.BalanceFragment;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.group.GroupsCollectionCatalogFragment;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.ui.fragment.audiobook.AudioBookGenreCatalogFragment;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.communities.GroupsRecommendationsFragment;
import com.vk.contacts.ContactsManager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleFragment;
import com.vk.ecomm.checklist.api.di.MarketChecklistComponent;
import com.vk.ecomm.onlinebooking.api.router.BookingSource;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.friends.requests.impl.allrequests.presentation.FriendsRequestFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.money.MoneyTransfersFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.MusicArtistCatalogFragment;
import com.vk.music.fragment.impl.MusicCuratorCatalogFragment;
import com.vk.music.fragment.impl.MusicDownloadsHistoryCatalogFragment;
import com.vk.music.fragment.impl.MusicMyAudiosCatalogFragment;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.fragment.impl.MusicOfflineShowAllFragment;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stats.StatsFragment;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.voip.ui.room.AddRoomToCallActivity;
import com.vk.webapp.fragments.AccountFragment;
import com.vk.webapp.fragments.CommunityCreationFragment;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vk.webapp.fragments.DonutPaymentAppFragment;
import com.vk.webapp.fragments.LkPasskeyFragment;
import com.vk.webapp.fragments.PostStatsFragment;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vk.webapp.fragments.RestoreFragment;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import com.vkontakte.android.fragments.PromocodeFragment;
import com.vkontakte.android.fragments.SettingsAccountFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.vkontakte.android.fragments.SettingsListFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vkontakte.android.fragments.friends.lists.OtherUserFriendsFragment;
import com.vkontakte.android.fragments.videos.VideosFragment;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b0m0;
import xsna.c9x0;
import xsna.cpu;
import xsna.hl10;
import xsna.i5r;
import xsna.i9l;
import xsna.k840;
import xsna.lq60;
import xsna.oap;
import xsna.t450;
import xsna.t5y;
import xsna.xk40;

/* compiled from: AppHttpLinkProcessor.kt */
/* loaded from: classes11.dex */
public final class j53 extends qjv {
    public final rml0 A;
    public final wnr0 B;
    public final xqg C;
    public final w1h D;
    public final er40 E;
    public final shb0 F;
    public final qct G;
    public final zk40 H;
    public final wro I;
    public final ProfileFragmentProviderComponent J;
    public final Object K;
    public final Object L;
    public final LinkedHashSet<iaz> M;
    public final Object N;
    public final Object O;
    public final bpn0 P;
    public final rk8 c;
    public final StoryViewerRouter d;
    public final pga0 e;
    public final lpg0 f;
    public final fy9 g;
    public final ajg0 h;
    public final hy80 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final mh70 o;
    public final zb70 p;
    public final Object q;
    public final j2x0 r;
    public final n9p0 s;
    public final ie7 t;
    public final jwn0 u;
    public final a550 v;
    public final qqm w;
    public final Object x;
    public final Object y;
    public final ivg z;

    /* compiled from: AppHttpLinkProcessor.kt */
    /* loaded from: classes7.dex */
    public static final class a implements w8i {
        public final MarketChecklistComponent b = (MarketChecklistComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketChecklistComponent.class));

        public final MarketChecklistComponent a() {
            return this.b;
        }
    }

    public j53(rk8 rk8Var, StoryViewerRouter storyViewerRouter, pga0 pga0Var, lpg0 lpg0Var, fy9 fy9Var, ajg0 ajg0Var, hy80 hy80Var, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, mh70 mh70Var, zb70 zb70Var, Lazy lazy6, j2x0 j2x0Var, n9p0 n9p0Var, ie7 ie7Var, jwn0 jwn0Var, a550 a550Var, qqm qqmVar, Lazy lazy7, Lazy lazy8, ivg ivgVar, rml0 rml0Var, wnr0 wnr0Var, xqg xqgVar, w1h w1hVar, er40 er40Var, shb0 shb0Var, qct qctVar, wro wroVar, Lazy lazy9, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        zk40 zk40Var = new zk40();
        this.c = rk8Var;
        this.d = storyViewerRouter;
        this.e = pga0Var;
        this.f = lpg0Var;
        this.g = fy9Var;
        this.h = ajg0Var;
        this.i = hy80Var;
        this.j = lazy;
        this.k = lazy2;
        this.l = lazy3;
        this.m = lazy4;
        this.n = lazy5;
        this.o = mh70Var;
        this.p = zb70Var;
        this.q = lazy6;
        this.r = j2x0Var;
        this.s = n9p0Var;
        this.t = ie7Var;
        this.u = jwn0Var;
        this.v = a550Var;
        this.w = qqmVar;
        this.x = lazy7;
        this.y = lazy8;
        this.z = ivgVar;
        this.A = rml0Var;
        this.B = wnr0Var;
        this.C = xqgVar;
        this.D = w1hVar;
        this.E = er40Var;
        this.F = shb0Var;
        this.G = qctVar;
        this.H = zk40Var;
        this.I = wroVar;
        this.J = profileFragmentProviderComponent;
        this.K = lazy9;
        int i = 0;
        d53 d53Var = new d53(i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.L = msy.a(lazyThreadSafetyMode, d53Var);
        this.M = izi0.e(new ofa0(pga0Var, o25.a()), new vou0(), new i53(), ygp.a);
        this.N = msy.a(lazyThreadSafetyMode, new t03(1));
        this.O = msy.a(lazyThreadSafetyMode, new e53(0));
        this.P = new bpn0(new f53(this, i));
    }

    public static void B(Context context, LaunchContext launchContext) {
        ydt0 Y = fxc0.B().Y();
        oap.a a2 = pap.a(Uri.parse("https://vkvideo.ru/lives"));
        Y.A(context, (r27 & 2) != 0 ? null : a2, launchContext.n(), (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : launchContext.g(), (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : launchContext.o(), (r27 & 2048) != 0 ? null : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qz00 m(qz00 qz00Var, Uri uri) {
        CommonMarketStat$TypeMarketContextContent.Type type;
        Object obj;
        String queryParameter = uri.getQueryParameter("parent_content_owner_id");
        CommonMarketStat$TypeMarketContextContent.Type type2 = null;
        Long n = queryParameter != null ? arm0.n(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("parent_content_id");
        Integer m = queryParameter2 != null ? arm0.m(10, queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("parent_content_type");
        if (queryParameter3 != null) {
            Iterator<E> it = CommonMarketStat$TypeMarketContextContent.Type.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((CommonMarketStat$TypeMarketContextContent.Type) obj).name(), queryParameter3)) {
                    break;
                }
            }
            type = (CommonMarketStat$TypeMarketContextContent.Type) obj;
        } else {
            type = null;
        }
        String queryParameter4 = uri.getQueryParameter("content_owner_id");
        Long n2 = queryParameter4 != null ? arm0.n(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("content_id");
        Integer m2 = queryParameter5 != null ? arm0.m(10, queryParameter5) : null;
        String queryParameter6 = uri.getQueryParameter("content_type");
        if (queryParameter6 != null) {
            Iterator<E> it2 = CommonMarketStat$TypeMarketContextContent.Type.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((CommonMarketStat$TypeMarketContextContent.Type) next).name(), queryParameter6)) {
                    type2 = next;
                    break;
                }
            }
            type2 = type2;
        }
        return qz00.a(qz00Var, type2, m2, n2, type, m, n);
    }

    public static void v(Context context, peq0 peq0Var) {
        int i;
        UserId userId = new UserId(peq0Var.c(1));
        String g = peq0Var.g();
        try {
            i = Integer.parseInt(g != null ? g.substring(6) : null);
        } catch (Throwable unused) {
            i = 0;
        }
        if (peq0Var.j("owner_id")) {
            userId = new UserId(peq0Var.u("owner_id"));
        }
        if (peq0Var.j("album_id")) {
            i = peq0Var.t("album_id");
        }
        ClassifiedsCatalogSimpleFragment.a aVar = new ClassifiedsCatalogSimpleFragment.a();
        aVar.F("album");
        aVar.D("market");
        aVar.E(userId);
        aVar.B(i);
        aVar.C(new MarketAnalyticsParams(null, null, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8059, null));
        aVar.k(context);
    }

    public final void A(Context context, peq0 peq0Var) {
        UserId userId = new UserId(peq0Var.c(1));
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        pwd0 ye = this.J.ye(userId, null);
        if (userId.equals(o25.a().c()) || userId.equals(UserId.d)) {
            ye.J().k(context);
        } else {
            ye.k(context);
        }
    }

    @Override // xsna.qjv
    public final boolean a(Context context, Uri uri) {
        peq0 d = qjv.d(context, uri);
        if (jh.h("/call-add", d, null, null, 14) || jh.h("/room/(.+)", d, null, null, 14)) {
            return true;
        }
        return super.a(context, uri);
    }

    @Override // xsna.qjv
    public final rk8 b() {
        return this.c;
    }

    @Override // xsna.qjv
    public final StoryViewerRouter c() {
        return this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x032a, code lost:
    
        if (r4.equals("security_activity_history") == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03cf, code lost:
    
        if (r40.s() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03d3, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03d4, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03c7, code lost:
    
        if (r4.equals("api_change_email") == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x079a, code lost:
    
        if (r4.equals("auto") == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x07a6, code lost:
    
        r4 = new com.vk.search.fragment.DiscoverSearchFragment.a();
        r4.B(r1.s(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_AD_Q, "c_q"));
        r4.C();
        r4.z(r3);
        r4.k(r38);
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x07c3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x07a3, code lost:
    
        if (r4.equals("all") == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0225, code lost:
    
        if (r4 != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:656:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x1019  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x1001 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x10fb  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x110b  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x111f  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x1122  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x1119  */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v270, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v213, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v400, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        boolean m;
        boolean m2;
        boolean m3;
        boolean m4;
        boolean m5;
        boolean m6;
        boolean m7;
        boolean m8;
        boolean m9;
        boolean m10;
        boolean m11;
        boolean m12;
        boolean m13;
        boolean m14;
        boolean m15;
        boolean m16;
        boolean m17;
        boolean m18;
        boolean m19;
        boolean m20;
        boolean m21;
        boolean m22;
        boolean m23;
        boolean m24;
        boolean m25;
        boolean m26;
        boolean m27;
        boolean m28;
        boolean m29;
        boolean m30;
        boolean m31;
        boolean m32;
        boolean m33;
        boolean m34;
        boolean m35;
        boolean m36;
        boolean m37;
        boolean m38;
        boolean m39;
        boolean m40;
        boolean m41;
        boolean m42;
        boolean m43;
        boolean m44;
        boolean m45;
        boolean m46;
        boolean m47;
        boolean m48;
        boolean m49;
        boolean m50;
        boolean m51;
        boolean z;
        boolean m52;
        List<String> b;
        Long k;
        Long k2;
        Integer num;
        boolean B;
        boolean B2;
        String str;
        String y;
        xk40.a b2;
        xk40.a b3;
        xk40.a b4;
        pwd0 ye;
        pwd0 ye2;
        pwd0 ye3;
        Integer m53;
        String str2;
        String r;
        pwd0 ye4;
        Double valueOf;
        String r2;
        Double valueOf2;
        RestoreFragment.a a2;
        hl10 b5;
        Boolean bool;
        hl10 b6;
        List<String> b7;
        String str3;
        boolean B3;
        boolean B4;
        boolean B5;
        Long k3;
        String path;
        Boolean bool2;
        Boolean bool3;
        boolean B6;
        boolean B7;
        boolean m54;
        peq0 peq0Var2 = peq0Var;
        Uri h = peq0Var2.h();
        String r3 = peq0Var2.r(Logger.METHOD_W);
        String n = launchContext.n();
        if (n == null) {
            n = MusicPlaybackLaunchContext.P.t();
        }
        String str4 = n;
        m = peq0Var2.m(0, "/bookmarks_pages");
        if (m) {
            h(context, "bookmarks_pages", false);
            s3q0 s3q0Var = s3q0.a;
            return null;
        }
        if (jh.h("/[0-9a-zA-Z]+/address(-?[0-9]+)_?([0-9]+)?", peq0Var2, null, null, 14)) {
            UserId userId = new UserId(-cqm0.l(peq0Var2.d(1)));
            String d = peq0Var2.d(2);
            xqg.b(this.C, context, userId, null, null, Integer.valueOf(d != null ? Integer.parseInt(d) : 0), false, null, 108);
            s3q0 s3q0Var2 = s3q0.a;
            return null;
        }
        m2 = peq0Var2.m(0, "/market");
        ajg0 ajg0Var = this.h;
        if (m2) {
            String r4 = peq0Var2.r("section");
            if (epx.f(r4 != null ? r4.toLowerCase(Locale.ROOT) : null, "reviews")) {
                ajg0Var.h(context);
                s3q0 s3q0Var3 = s3q0.a;
                return null;
            }
        }
        m3 = peq0Var2.m(0, "/bookmarks");
        if (m3) {
            h(context, peq0Var2.r("type"), false);
            s3q0 s3q0Var4 = s3q0.a;
            return null;
        }
        m4 = peq0Var2.m(0, "/likes");
        if (m4 && jh.h("/([a-z]+)([-0-9]+)_([-0-9]+)", peq0Var2, null, null, 6)) {
            ReactionsFragment.a aVar = new ReactionsFragment.a(new UserId(peq0Var2.c(2)), peq0Var2.b(3));
            aVar.B(peq0Var2.d(1));
            aVar.y();
            aVar.k(context);
            s3q0 s3q0Var5 = s3q0.a;
            return null;
        }
        m5 = peq0Var2.m(0, "/shares");
        if (m5 && jh.h("/([a-z]+)([-0-9]+)_([-0-9]+)", peq0Var2, null, null, 6)) {
            ReactionsFragment.a aVar2 = new ReactionsFragment.a(new UserId(peq0Var2.c(2)), peq0Var2.b(3));
            aVar2.B(peq0Var2.d(1));
            aVar2.A();
            aVar2.k(context);
            s3q0 s3q0Var6 = s3q0.a;
            return null;
        }
        m6 = peq0Var2.m(0, "/friendlikes");
        if (m6 && jh.h("/([a-z]+)([-0-9]+)_([-0-9]+)", peq0Var2, null, null, 6)) {
            ReactionsFragment.a aVar3 = new ReactionsFragment.a(new UserId(peq0Var2.c(2)), peq0Var2.b(3));
            aVar3.B(peq0Var2.d(1));
            aVar3.z();
            aVar3.k(context);
            s3q0 s3q0Var7 = s3q0.a;
            return null;
        }
        m7 = peq0Var2.m(0, "/like");
        if (m7 && peq0Var2.j("object")) {
            com.vk.common.links.c.M(context, peq0Var2.r("object"), peq0Var2.r("tab"));
            s3q0 s3q0Var8 = s3q0.a;
            return null;
        }
        if (peq0Var2.k(naz.d())) {
            return Boolean.FALSE;
        }
        if (peq0.p(peq0Var2, laz.f(), null, null, 14)) {
            m54 = peq0Var2.m(0, "/app" + InternalVkMiniApps.MARKET_ABANDONED_CARTS.h().a);
            if (m54) {
                fy9.a(this.g, context, null, null, null, 14);
                s3q0 s3q0Var9 = s3q0.a;
                return null;
            }
            UserId userId2 = new UserId(cqm0.l(peq0Var2.d(4)));
            StringBuilder sb = new StringBuilder();
            sb.append(peq0Var2.a(2));
            if (fkq0.c(userId2)) {
                sb.append(BundleUtil.UNDERLINE_TAG);
                sb.append(userId2);
            }
            com.vk.common.links.c.S(context, !URLUtil.isNetworkUrl(peq0Var2.h().toString()) ? peq0Var2.h().buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build() : peq0Var2.h(), launchContext, sb.toString(), yp80Var);
            return Boolean.TRUE;
        }
        if (jh.h("/games/(.+)", peq0Var2, null, null, 14)) {
            String a3 = peq0Var2.a(1);
            if (o()) {
                B6 = brm0.B(a3, "tags/", false);
                if (!B6) {
                    B7 = brm0.B(a3, "genres/", false);
                }
                com.vk.common.links.c.h(context, peq0Var2.a(1), launchContext, new defpackage.e(this, 5));
                s3q0 s3q0Var10 = s3q0.a;
                return null;
            }
            com.vk.common.links.c.T(context, peq0Var2.h(), launchContext, a3, yp80Var);
            return null;
        }
        if (jh.h("/games", peq0Var2, null, null, 14)) {
            this.G.b().k(context);
            s3q0 s3q0Var11 = s3q0.a;
            return null;
        }
        m8 = peq0Var2.m(0, "/account");
        LinkedHashSet<iaz> linkedHashSet = this.M;
        if (m8) {
            if (epx.f(peq0Var2.l(), "connected-keys")) {
                int i = LkPasskeyFragment.a0;
                LkPasskeyFragment.b.a(h.toString()).k(context);
                s3q0 s3q0Var12 = s3q0.a;
                return null;
            }
            for (iaz iazVar : linkedHashSet) {
                if (iazVar.a(peq0Var2)) {
                    iazVar.b(context, uri, launchContext, yp80Var, peq0Var2);
                    return null;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        m9 = peq0Var2.m(0, "/settings");
        if (!m9) {
            m10 = peq0Var2.m(0, "/friends_swipe");
            if (m10) {
                UserId userId3 = new UserId(peq0Var2.u("id"));
                String r5 = peq0Var2.r("source");
                boolean z2 = peq0Var2.t("only_recommendations") == 1;
                q0r0.a(userId3, r5);
                UsersDiscoverFragment.a aVar4 = new UsersDiscoverFragment.a();
                aVar4.A(userId3);
                aVar4.z(r5);
                aVar4.y(z2);
                aVar4.k(context);
                s3q0 s3q0Var13 = s3q0.a;
                return null;
            }
            m11 = peq0Var2.m(0, "/friends_cleanup");
            if (m11) {
                new FriendsCleanupFragment.a().k(context);
                s3q0 s3q0Var14 = s3q0.a;
                return null;
            }
            m12 = peq0Var2.m(0, "/friends");
            long j = 0;
            if (m12) {
                if (epx.f(peq0Var2.g(), "all_requests") || epx.f(peq0Var2.g(), "requests")) {
                    new FriendRequestsFragment.a().k(context);
                } else if (epx.f(peq0Var2.g(), "out_requests")) {
                    FriendsRequestFragment.a aVar5 = new FriendsRequestFragment.a();
                    aVar5.y();
                    aVar5.k(context);
                } else if (epx.f(peq0Var2.r("act"), "find") && epx.f(peq0Var2.r("invite"), "1")) {
                    cbj0.a(context, q6r0.f().o());
                } else if (epx.f(peq0Var2.r("act"), "find")) {
                    o19.j(context).b(context, peq0Var2.r("from_ref"));
                } else if (peq0Var2.u("id") != 0) {
                    UserId userId4 = new UserId(peq0Var2.u("id"));
                    if (qr.f(userId4)) {
                        new FriendsCatalogFragment.a().k(context);
                    } else {
                        OtherUserFriendsFragment.a aVar6 = new OtherUserFriendsFragment.a();
                        aVar6.C(userId4);
                        aVar6.k(context);
                    }
                } else if (peq0Var2.m(1, "/calendar") && peq0Var2.i()) {
                    com.vk.common.links.c.q(context);
                } else {
                    new FriendsCatalogFragment.a().k(context);
                }
                s3q0 s3q0Var15 = s3q0.a;
                return null;
            }
            m13 = peq0Var2.m(0, "/onboarding_find_friends");
            if (m13) {
                b7u0 k4 = g2v.c().k();
                mxv c = g2v.c();
                a1w a1wVar = i7o0.f().b;
                a1wVar.getClass();
                new q9(a1wVar, 16).c();
                k4.s(context, c);
                s3q0 s3q0Var16 = s3q0.a;
                return null;
            }
            m14 = peq0Var2.m(0, "/groups_create");
            if (m14) {
                int i2 = CommunityCreationFragment.a0;
                CommunityCreationFragment.d.a(peq0Var2.r("source"), peq0Var2.r("type")).k(context);
                s3q0 s3q0Var17 = s3q0.a;
                return null;
            }
            boolean h2 = jh.h("/groups/collection(/.*)?", peq0Var2, null, null, 14);
            ?? r9 = this.y;
            if (h2) {
                List<String> pathSegments = peq0Var2.h().getPathSegments();
                String str5 = pathSegments != null ? (String) j5g.b0(2, pathSegments) : null;
                if (str5 != null) {
                    new GroupsCollectionCatalogFragment.a(str5).k(context);
                    return null;
                }
                ((gog) r9.getValue()).a(context, jeq0.c(peq0Var2.h()), null, true);
                s3q0 s3q0Var18 = s3q0.a;
                return null;
            }
            if (jh.h("/groups(/.*)?", peq0Var2, null, null, 14)) {
                if (epx.f(peq0Var2.r(Logger.METHOD_W), "groups_create")) {
                    int i3 = CommunityCreationFragment.a0;
                    CommunityCreationFragment.d.a(peq0Var2.r("source"), peq0Var2.r("type")).k(context);
                } else {
                    if (!epx.f(peq0Var2.r("act"), "recommended")) {
                        UserId userId5 = new UserId(peq0Var2.u("id"));
                        if (fkq0.d(userId5)) {
                            bool3 = null;
                            ((gog) r9.getValue()).b(context, userId5, null, true);
                        } else {
                            bool3 = null;
                            ((gog) r9.getValue()).a(context, jeq0.c(peq0Var2.h()), null, true);
                        }
                        s3q0 s3q0Var19 = s3q0.a;
                        return bool3;
                    }
                    String r6 = peq0Var2.r("track_code");
                    GroupsRecommendationsFragment.a aVar7 = new GroupsRecommendationsFragment.a();
                    aVar7.A(r6);
                    aVar7.k(context);
                }
                bool3 = null;
                s3q0 s3q0Var192 = s3q0.a;
                return bool3;
            }
            m15 = peq0Var2.m(0, "/explore");
            if (m15) {
                String r7 = peq0Var2.r("blogger");
                rwi.d().i().a(context, r7 != null ? q9k.a("blogger_id", r7) : new Bundle());
                s3q0 s3q0Var20 = s3q0.a;
                return null;
            }
            m16 = peq0Var2.m(0, "/search");
            zk40 zk40Var = this.H;
            if (m16) {
                peq0 e = peq0Var2.e();
                String r8 = e.r("ad_campaign_source");
                String s = e.s("section", "c_section");
                if (s != null) {
                    switch (s.hashCode()) {
                        case -991808881:
                            if (s.equals("people")) {
                                DiscoverSearchFragment.a aVar8 = new DiscoverSearchFragment.a();
                                aVar8.B(e.s(CampaignEx.JSON_KEY_AD_Q, "c_q"));
                                aVar8.F();
                                aVar8.k(context);
                                s3q0 s3q0Var21 = s3q0.a;
                                return null;
                            }
                            break;
                        case -885478841:
                            if (s.equals("communities")) {
                                DiscoverSearchFragment.a aVar9 = new DiscoverSearchFragment.a();
                                aVar9.D();
                                aVar9.z(r8);
                                aVar9.B(e.s(CampaignEx.JSON_KEY_AD_Q, "c_q"));
                                aVar9.k(context);
                                s3q0 s3q0Var22 = s3q0.a;
                                return null;
                            }
                            break;
                        case 96673:
                            break;
                        case 3005871:
                            break;
                        case 93166550:
                            if (s.equals("audio")) {
                                yk40 builder = zk40Var.builder();
                                builder.F(e.s(CampaignEx.JSON_KEY_AD_Q, "c_q"));
                                builder.B(context);
                                s3q0 s3q0Var23 = s3q0.a;
                                return null;
                            }
                            break;
                        case 112202875:
                            if (s.equals("video")) {
                                new VideosFragment.e().k(context);
                                s3q0 s3q0Var24 = s3q0.a;
                                return null;
                            }
                            break;
                        case 1318692896:
                            if (s.equals("statuses")) {
                                NewsfeedRouter.l(n(), context, e.s(CampaignEx.JSON_KEY_AD_Q, "c_q"), null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                s3q0 s3q0Var25 = s3q0.a;
                                return null;
                            }
                            break;
                    }
                }
                return Boolean.FALSE;
            }
            m17 = peq0Var2.m(0, "/fave");
            if (m17) {
                h(context, peq0Var2.g(), true);
                s3q0 s3q0Var26 = s3q0.a;
                return null;
            }
            m18 = peq0Var2.m(0, "/lives");
            if (m18) {
                B(context, launchContext);
                s3q0 s3q0Var27 = s3q0.a;
                return null;
            }
            m19 = peq0Var2.m(0, "/mail");
            if (m19) {
                long u = peq0Var2.u("peer");
                long u2 = peq0Var2.u("community");
                if (u2 != 0) {
                    return Boolean.valueOf(com.vk.common.links.c.x(u2, u, yp80Var, launchContext));
                }
                if (u != 0) {
                    bool2 = null;
                    com.vk.common.links.c.t(context, null, u, 0, null, null, null, launchContext.e(), false, yp80Var, null, null, null, 7546);
                } else {
                    bool2 = null;
                }
                s3q0 s3q0Var28 = s3q0.a;
                return bool2;
            }
            if (jh.h("/gim(\\d+)", peq0Var2, null, null, 14)) {
                return Boolean.valueOf(com.vk.common.links.c.x(peq0Var2.c(1), peq0Var2.u("sel"), yp80Var, launchContext));
            }
            yp80 yp80Var2 = yp80Var;
            if (jh.h("/stats/?", peq0Var2, null, null, 14)) {
                int i4 = StatsFragment.a0;
                StatsFragment.b.a(4, peq0Var2.j("mid") ? Long.valueOf(cqm0.l(peq0Var2.r("mid"))) : null, peq0Var2.j("gid") ? h.toString() : null).k(context);
                s3q0 s3q0Var29 = s3q0.a;
                return null;
            }
            if (jh.h("/disable_page/?(.*)", peq0Var2, null, null, 14)) {
                com.vk.common.links.c.y(context, peq0Var2);
                s3q0 s3q0Var30 = s3q0.a;
                return null;
            }
            if (jh.h("/biz/admin.*", peq0Var2, null, null, 14)) {
                String l = launchContext.l();
                Uri g = l != null ? jeq0.g(l) : null;
                if (launchContext.s() && g != null && naz.s(g) && (path = g.getPath()) != null && brm0.w(path, "/biz", true)) {
                    return Boolean.FALSE;
                }
                bis.f(new bis(), yv0.c(peq0Var2.h().getQuery()), InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, 10).k(context);
                s3q0 s3q0Var31 = s3q0.a;
                return null;
            }
            if (jh.h("/ads_easy_promote.*", peq0Var2, null, null, 14)) {
                bis.f(new bis(), yv0.c(peq0Var2.h().getQuery()), InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, 10).k(context);
                s3q0 s3q0Var32 = s3q0.a;
                return null;
            }
            if (jh.h("/board_poll([-0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                new PollViewerFragment.a(peq0Var2.b(2), new UserId(peq0Var2.b(1)), "poll", true).k(context);
                s3q0 s3q0Var33 = s3q0.a;
                return null;
            }
            m20 = peq0Var2.m(0, "/new_post");
            if (m20) {
                q860 b8 = rfc0.b();
                String queryParameter = h.getQueryParameter("text");
                String str6 = queryParameter != null ? queryParameter : "";
                boolean f = epx.f(SignalingProtocol.KEY_CAMERA, h.getQueryParameter("attach"));
                String queryParameter2 = h.getQueryParameter("postponed_time");
                if (queryParameter2 != null && (k3 = cqm0.k(queryParameter2)) != null) {
                    j = k3.longValue();
                }
                b8.m(j, str6, f);
                b8.l(context);
                s3q0 s3q0Var34 = s3q0.a;
                return null;
            }
            m21 = peq0Var2.m(0, "/feed/trends");
            if (m21) {
                n().f(context, "discover_category_trends/trends");
                s3q0 s3q0Var35 = s3q0.a;
                return null;
            }
            m22 = peq0Var2.m(0, "/feed");
            if (m22) {
                if (epx.f(peq0Var2.g(), "discover") || epx.f(peq0Var2.g(), "recommended")) {
                    n().t(context);
                } else if (epx.f(peq0Var2.g(), C4504q2.x)) {
                    if (epx.f(peq0Var2.r("list"), BillingClient.FeatureType.SUBSCRIPTIONS)) {
                        n().S(context, peq0Var2.r("title"), peq0Var2.r("ref"), peq0Var2.r("scroll_to"));
                    } else {
                        this.p.a(context);
                    }
                } else if (epx.f(peq0Var2.g(), "search")) {
                    NewsfeedRouter.l(n(), context, peq0Var2.r(CampaignEx.JSON_KEY_AD_Q), null, null, peq0Var2.r("situational_suggest_id"), null, null, 108);
                } else if (epx.f(peq0Var2.g(), "friends")) {
                    n().e(context, lq60.b.a);
                } else if (epx.f(peq0Var2.g(), "photos")) {
                    n().e(context, lq60.c.a);
                } else if (epx.f(peq0Var2.g(), "videos")) {
                    n().e(context, lq60.d.a);
                } else if (epx.f(peq0Var2.g(), "likes")) {
                    ((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0().d0(context, peq0Var2.r("filter"));
                } else if (epx.f(peq0Var2.g(), "custom") && peq0Var2.j("feed_id")) {
                    String valueOf3 = String.valueOf(peq0Var2.r("feed_id"));
                    B3 = brm0.B(valueOf3, "discover_category_trends/trends/", false);
                    if (B3) {
                        NewsfeedRouter.b(n(), context, valueOf3, null, null, null, 60);
                    } else {
                        B4 = brm0.B(valueOf3, "discover_category_trends/dzen/", false);
                        if (B4) {
                            NewsfeedRouter.O(n(), context, valueOf3);
                        } else if (epx.f(valueOf3, "discover_category_trends/trends")) {
                            n().f(context, valueOf3);
                        } else {
                            B5 = brm0.B(valueOf3, "discover_media_similar_news/similar_news/", false);
                            if (B5) {
                                n().F(context, valueOf3);
                            } else {
                                n().c(context, valueOf3);
                            }
                        }
                    }
                } else if (epx.f(peq0Var2.g(), "") || peq0Var2.g() == null) {
                    HomeFragment2.a aVar10 = new HomeFragment2.a();
                    String r10 = peq0Var2.r("access_key");
                    if (r10 != null && r10.length() != 0) {
                        aVar10.y(r10);
                    }
                    aVar10.k(context);
                } else {
                    if (!epx.f(peq0Var2.g(), "comments")) {
                        com.vk.common.links.c.J(context);
                        return Boolean.TRUE;
                    }
                    n().e(context, lq60.a.a);
                }
                s3q0 s3q0Var36 = s3q0.a;
                return null;
            }
            if (jh.h("/feed/([a-zA-Z0-_9]+)", peq0Var2, null, null, 14)) {
                com.vk.common.links.c.J(context);
                return Boolean.TRUE;
            }
            m23 = peq0Var2.m(0, "/settings/general");
            if (m23) {
                String queryParameter3 = h.getQueryParameter("highlight");
                if (epx.f(queryParameter3, "voice-assistant")) {
                    queryParameter3 = "voice_assistant";
                } else if (epx.f(queryParameter3, "kws-voice-assistant")) {
                    queryParameter3 = "enableVoiceAssistantSetting";
                }
                new oz50(SettingsGeneralFragment.class, q9k.a("pref_to_highlight", queryParameter3)).k(context);
                s3q0 s3q0Var37 = s3q0.a;
                return null;
            }
            if (jh.h("/artist/([^/]+).*/(.*)?", peq0Var2, null, null, 14)) {
                String d2 = peq0Var2.d(2);
                String uri2 = (d2 == null || cqm0.a(d2) == null) ? null : h.toString();
                MusicArtistCatalogFragment.a aVar11 = new MusicArtistCatalogFragment.a(peq0Var2.a(1));
                aVar11.C(str4);
                aVar11.D(launchContext.o());
                String k5 = launchContext.k();
                if (k5 == null) {
                    k5 = "";
                }
                aVar11.B(k5);
                aVar11.z(uri2, true);
                aVar11.k(context);
                s3q0 s3q0Var38 = s3q0.a;
                return null;
            }
            if (jh.h("/artist/([^/]+).*", peq0Var2, null, null, 14)) {
                MusicArtistCatalogFragment.a aVar12 = new MusicArtistCatalogFragment.a(peq0Var2.a(1));
                aVar12.C(str4);
                aVar12.D(launchContext.o());
                String k6 = launchContext.k();
                aVar12.B(k6 == null ? "" : k6);
                aVar12.k(context);
                s3q0 s3q0Var39 = s3q0.a;
                return null;
            }
            if (jh.h("/faq(\\d*)", peq0Var2, null, null, 14)) {
                Uri.Builder buildUpon = Uri.parse(naz.b()).buildUpon();
                b6 = new Regex("/faq(\\d+)").b(h.getPath());
                if (b6 != null && (b7 = b6.b()) != null && (str3 = (String) ((hl10.a) b7).get(1)) != null) {
                    buildUpon.appendQueryParameter("act", "article");
                    buildUpon.appendQueryParameter("id", str3);
                }
                com.vk.common.links.c.b0(context, buildUpon.build(), h.getQueryParameter(CommonConstant.KEY_ACCESS_TOKEN), 4);
                return null;
            }
            if (jh.h("/services/?", peq0Var2, null, null, 14)) {
                String r11 = peq0Var2.r("act");
                if (r11 == null || r11.length() == 0) {
                    bool = null;
                    oz50 oz50Var = new oz50(AppsCatalogFragment.class, null, null);
                    oz50Var.v(SuperAppFragment.class);
                    oz50Var.k(context);
                } else {
                    String r12 = peq0Var2.r("act");
                    qjv.i(context, r12 == null ? "" : r12);
                    bool = null;
                }
                s3q0 s3q0Var40 = s3q0.a;
                return bool;
            }
            m24 = peq0Var2.m(0, "/tabsettings");
            if (m24) {
                this.u.c(context, null);
                s3q0 s3q0Var41 = s3q0.a;
                return null;
            }
            if (jh.h("/groups_create/?", peq0Var2, null, null, 14)) {
                int i5 = CommunityCreationFragment.a0;
                CommunityCreationFragment.d.a(peq0Var2.r("source"), peq0Var2.r("type")).k(context);
                s3q0 s3q0Var42 = s3q0.a;
                return null;
            }
            if (jh.h("/promocode/?", peq0Var2, null, null, 14)) {
                int i6 = PromocodeFragment.a0;
                PromocodeFragment.b.a().k(context);
                s3q0 s3q0Var43 = s3q0.a;
                return null;
            }
            if (jh.h("/edit/?", peq0Var2, null, null, 14)) {
                qjv.g(context, h.toString());
                s3q0 s3q0Var44 = s3q0.a;
                return null;
            }
            if (jh.h("/editorprofile/([0-_9]+)", peq0Var2, null, null, 14)) {
                A(context, peq0Var2);
                s3q0 s3q0Var45 = s3q0.a;
                return null;
            }
            if (jh.h("/achievements/?", peq0Var2, null, null, 14)) {
                k8t.b(context, h.toString());
                s3q0 s3q0Var46 = s3q0.a;
                return null;
            }
            if (jh.h("/invite/([a-zA-Z0-_9]+)", peq0Var2, null, null, 14)) {
                s(context, h, peq0Var2.a(1), yp80Var2);
                return Boolean.TRUE;
            }
            if (rwi.d().k().b(peq0Var2)) {
                return rwi.d().k().a(context, launchContext, yp80Var2, peq0Var2);
            }
            LaunchContext launchContext2 = launchContext;
            m25 = peq0Var2.m(0, "/call/new");
            if (m25) {
                com.vk.common.links.c.i0(context);
                s3q0 s3q0Var47 = s3q0.a;
                return null;
            }
            m26 = peq0Var2.m(0, "/call/promo");
            if (m26) {
                g2v.c().b().f(context);
                if (yp80Var2 == null) {
                    return null;
                }
                yp80Var2.onSuccess();
                s3q0 s3q0Var48 = s3q0.a;
                return null;
            }
            if (jh.h("/call/join/(.+)", peq0Var2, null, null, 14)) {
                com.vk.common.links.c.H(context, peq0Var2.h().toString(), launchContext2.b() == LaunchContext.ActivityNextState.FINISH, this.f);
                s3q0 s3q0Var49 = s3q0.a;
                return null;
            }
            if (jh.h("/call/(.+)", peq0Var2, null, null, 14) && (BuildInfo.s() || SakFeatures.Type.VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON.h())) {
                com.vk.common.links.c.L(context, launchContext2.b() == LaunchContext.ActivityNextState.FINISH, (tkw0) this.q.getValue(), peq0Var2.h().toString());
                s3q0 s3q0Var50 = s3q0.a;
                return null;
            }
            m27 = peq0Var2.m(0, "/calls");
            if (m27) {
                g2v.c().j().q(context);
                s3q0 s3q0Var51 = s3q0.a;
                return null;
            }
            if (jh.h("/call-add", peq0Var2, null, null, 14)) {
                int i7 = AddRoomToCallActivity.z;
                context.startActivity(AddRoomToCallActivity.a.a(context, peq0Var2.h().toString()));
                s3q0 s3q0Var52 = s3q0.a;
                return null;
            }
            if (jh.h("/room/(.+)", peq0Var2, null, null, 14)) {
                p(context, peq0Var2.h().toString());
                s3q0 s3q0Var53 = s3q0.a;
                return null;
            }
            if (rwi.d().n().b(peq0Var2)) {
                b5 = new Regex("sferum=true").b(peq0Var2.h().toString());
                if (b5 != null) {
                    for (iaz iazVar2 : linkedHashSet) {
                        if (iazVar2.a(peq0Var2)) {
                            return Boolean.valueOf(iazVar2.b(context, uri, launchContext2, yp80Var2, peq0Var2));
                        }
                        yp80Var2 = yp80Var2;
                        peq0Var2 = peq0Var2;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            if (rwi.d().n().b(peq0Var2)) {
                return rwi.d().n().a(context, launchContext2, yp80Var2, peq0Var2);
            }
            if (jh.h("^/donut/([^/]+)$", peq0Var2, null, null, 14)) {
                com.vk.common.links.c.A(context, n(), peq0Var2.a(1), peq0Var2.r("source"), yp80Var, naz.s(h));
                return Boolean.TRUE;
            }
            if (jh.h("/restore/?(.+)?", peq0Var2, null, null, 14)) {
                Activity h3 = e3m.h(context);
                if (h3 != null) {
                    int i8 = RestoreFragment.a0;
                    a2 = RestoreFragment.b.a(peq0Var2.h().toString(), null, null);
                    a2.s(true);
                    a2.t();
                    h3.startActivityForResult(a2.n(context), 421);
                    return Boolean.TRUE;
                }
            } else {
                if (jh.h("/wall([-0-9]+)", peq0Var2, null, null, 14) && peq0Var2.j(CampaignEx.JSON_KEY_AD_Q)) {
                    NewsfeedRouter.l(n(), context, peq0Var2.r(CampaignEx.JSON_KEY_AD_Q), new UserId(peq0Var2.c(1)), null, null, null, null, 120);
                    s3q0 s3q0Var54 = s3q0.a;
                    return null;
                }
                if (jh.h("/image_status", peq0Var2, null, null, 14)) {
                    UserId userId6 = new UserId(peq0Var2.u("user_id"));
                    int t = peq0Var2.t("status_id");
                    if (userId6.d() != 0 && t != 0) {
                        szk0.b(t, context, userId6);
                    }
                    s3q0 s3q0Var55 = s3q0.a;
                    return null;
                }
                if (jh.h("/geoplace", peq0Var2, null, null, 14)) {
                    int t2 = peq0Var2.t("id");
                    String r13 = peq0Var2.r(O6.s);
                    if (r13 != null) {
                        try {
                            valueOf = Double.valueOf(Double.parseDouble(r13));
                        } catch (Throwable unused) {
                        }
                        r2 = peq0Var2.r("lon");
                        if (r2 != null) {
                            try {
                                valueOf2 = Double.valueOf(Double.parseDouble(r2));
                            } catch (Throwable unused2) {
                            }
                            if (t2 > 0) {
                                new GeoPostsFragment.a(t2).k(context);
                            } else if (valueOf != null && valueOf2 != null) {
                                zl00.a(context, valueOf.doubleValue(), valueOf2.doubleValue());
                            }
                            return Boolean.TRUE;
                        }
                        valueOf2 = null;
                        if (t2 > 0) {
                        }
                        return Boolean.TRUE;
                    }
                    valueOf = null;
                    r2 = peq0Var2.r("lon");
                    if (r2 != null) {
                    }
                    valueOf2 = null;
                    if (t2 > 0) {
                    }
                    return Boolean.TRUE;
                }
                m28 = peq0Var2.m(0, "/payments");
                if (m28) {
                    if (launchContext2.s()) {
                        return Boolean.FALSE;
                    }
                    if (j5g.P(izi0.l("money_transfer", "money_request", "init_money_transfer", "request_history"), peq0Var2.r("act"))) {
                        qjv.l(context, peq0Var2);
                    } else {
                        String r14 = peq0Var2.r("act");
                        if (r14 == null || r14.length() <= 0) {
                            new BalanceFragment.a().k(context);
                        } else {
                            WebViewFragment.c cVar = new WebViewFragment.c(h);
                            cVar.A();
                            cVar.k(context);
                        }
                    }
                    s3q0 s3q0Var56 = s3q0.a;
                    return null;
                }
                boolean h4 = jh.h("/al_page.php", peq0Var2, null, null, 14);
                ProfileFragmentProviderComponent profileFragmentProviderComponent = this.J;
                if (h4 && epx.f(peq0Var2.r("act"), "owner_photo_box")) {
                    ye4 = profileFragmentProviderComponent.ye(new UserId(peq0Var2.u("oid")), null);
                    ye4.K(launchContext2.r()).O().k(context);
                    s3q0 s3q0Var57 = s3q0.a;
                    return null;
                }
                m29 = peq0Var2.m(0, "/popup");
                if (m29) {
                    String r15 = peq0Var2.r("act");
                    if (r15 != null) {
                        int hashCode = r15.hashCode();
                        if (hashCode != -1110313136) {
                            if (hashCode == -179822339) {
                                r = peq0Var2.r("source");
                                if (r == null) {
                                }
                                t450.b.getClass();
                                if (t450.a.a().contains(r)) {
                                }
                                if (!epx.f(peq0Var2.r("act"), "combo_wink_upgrade")) {
                                }
                                com.vk.music.notifications.restriction.a aVar13 = k840.a.d;
                                MusicRestrictionPopupDisplayer.e(aVar13 == null ? aVar13 : null, context, r4, MusicPlaybackLaunchContext.d, null, r0, null, 40);
                                s3q0 s3q0Var58 = s3q0.a;
                                return null;
                            }
                            r = peq0Var2.r("source");
                            if (r == null) {
                                r = "link";
                            }
                            t450.b.getClass();
                            String str7 = t450.a.a().contains(r) ? r : "link";
                            MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType = !epx.f(peq0Var2.r("act"), "combo_wink_upgrade") ? MusicRestrictionPopupDisplayer.SubscriptionPopupType.WINK_UPGRADE : MusicRestrictionPopupDisplayer.SubscriptionPopupType.COMBO_UPGRADE;
                            com.vk.music.notifications.restriction.a aVar132 = k840.a.d;
                            MusicRestrictionPopupDisplayer.e(aVar132 == null ? aVar132 : null, context, str7, MusicPlaybackLaunchContext.d, null, subscriptionPopupType, null, 40);
                            s3q0 s3q0Var582 = s3q0.a;
                            return null;
                        }
                        if (r15.equals("buy_music_subscription")) {
                            Iterator it = e43.l("ref", "source", "utm_source").iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str2 = null;
                                    break;
                                }
                                str2 = cqm0.a(peq0Var2.r((String) it.next()));
                                if (str2 != null) {
                                    break;
                                }
                            }
                            String lowerCase = str2 != null ? str2.toLowerCase(Locale.getDefault()) : "link";
                            t450.b.getClass();
                            String str8 = t450.a.a().contains(lowerCase) ? lowerCase : "link";
                            if (k840.a.e().b()) {
                                cvk.u(R.string.music_subscription_exist, false);
                            } else {
                                String r16 = peq0Var2.r("utm_term");
                                com.vk.music.notifications.restriction.a aVar14 = k840.a.d;
                                MusicRestrictionPopupDisplayer.e(aVar14 != null ? aVar14 : null, context, str8, MusicPlaybackLaunchContext.d, null, null, r16, 24);
                            }
                            s3q0 s3q0Var59 = s3q0.a;
                            return null;
                        }
                    }
                    return Boolean.FALSE;
                }
                if (peq0.p(peq0Var2, laz.a(), null, null, 14)) {
                    if (!epx.f(peq0Var2.r("act"), "doc_preview_link") || launchContext2.d() == null) {
                        vun vunVar = new vun();
                        vunVar.y(new UserId(cqm0.l(peq0Var2.a(1))));
                        vunVar.k(context);
                        s3q0 s3q0Var60 = s3q0.a;
                        return null;
                    }
                    Document d3 = launchContext2.d();
                    String str9 = d3 != null ? d3.l : null;
                    Document d4 = launchContext2.d();
                    gvn.b(context, h, new com.vk.movika.sdk.android.defaultplayer.interactive.a(yp80Var2, 6), str9, d4 != null ? d4.m : null);
                    return Boolean.TRUE;
                }
                if (jh.h("/community-review([-0-9]+)-([-0-9]+)", peq0Var2, null, null, 14)) {
                    r(peq0Var2, context, Integer.valueOf(peq0Var2.b(2)));
                    s3q0 s3q0Var61 = s3q0.a;
                    return null;
                }
                if (jh.h("/community-review([-0-9]+)", peq0Var2, null, null, 14)) {
                    r(peq0Var2, context, null);
                    s3q0 s3q0Var62 = s3q0.a;
                    return null;
                }
                if (jh.h("/reviews([-0-9]+)", peq0Var2, null, null, 14)) {
                    ajg0Var.j(new UserId(peq0Var2.c(1)), null, null, context);
                    s3q0 s3q0Var63 = s3q0.a;
                    return null;
                }
                boolean h5 = jh.h("/products-reviews-order", peq0Var2, null, null, 14);
                hy80 hy80Var = this.i;
                if (!h5) {
                    if (jh.h("/products-reviews-market_main", peq0Var2, null, null, 14)) {
                        hy80Var.c(context, ReviewSuggestion.AllOrders.b);
                        s3q0 s3q0Var64 = s3q0.a;
                        return null;
                    }
                    m30 = peq0Var2.m(0, "/orders");
                    if (m30) {
                        String queryParameter4 = peq0Var2.h().getQueryParameter("owner_id");
                        UserId f2 = queryParameter4 != null ? fkq0.f(cqm0.l(queryParameter4)) : null;
                        String queryParameter5 = peq0Var2.h().getQueryParameter("ref_screen");
                        MobileOfficialAppsCoreNavStat$EventScreen a4 = queryParameter5 != null ? mt00.a(queryParameter5) : null;
                        String queryParameter6 = peq0Var2.h().getQueryParameter("source");
                        CommonMarketStat$TypeMarketOrdersItem.Source b9 = queryParameter6 != null ? mt00.b(queryParameter6) : null;
                        peq0Var2.h().toString();
                        hy80Var.e(context, f2, a4, b9);
                        s3q0 s3q0Var65 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/orders([-0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                        hy80Var.a(context, fkq0.f(peq0Var2.c(1)), peq0Var2.b(2), null);
                        s3q0 s3q0Var66 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/(?:club|event|public)([0-9]+)", peq0Var2, null, null, 14)) {
                        UserId userId7 = new UserId(-peq0Var2.c(1));
                        String r17 = peq0Var2.r("act");
                        if (epx.f(r17, "group_section_admin_tips")) {
                            new a().a().I6().a(context, userId7, peq0Var2.r("tip"));
                        } else if (epx.f(r17, "donut")) {
                            int i9 = CommunityManageFragment.i0;
                            CommunityManageFragment.b.a(fkq0.e(userId7), null, "donut", null, null, false, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE).k(context);
                        } else {
                            ye3 = profileFragmentProviderComponent.ye(userId7, null);
                            String r18 = launchContext2.r();
                            if (r18 == null) {
                                r18 = peq0Var2.r("trackcode");
                            }
                            pwd0 H = ye3.K(r18).H(launchContext2.o());
                            String r19 = peq0Var2.r("join_by_url");
                            if (r19 != null) {
                                H.I(r19);
                            }
                            H.k(context);
                        }
                        s3q0 s3q0Var67 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/board([0-9]+)", peq0Var2, null, null, 14)) {
                        this.s.a(context, new UserId(peq0Var2.c(1)), false);
                        s3q0 s3q0Var68 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/album([-0-9]+)_([-0-9]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.d(context, new UserId(peq0Var2.c(1)), peq0Var2.a(2), yp80Var2, epx.f(peq0Var2.r("rev"), "1"));
                        return Boolean.TRUE;
                    }
                    if (jh.h("/id(\\d[-0-9]+)", peq0Var2, null, null, 14)) {
                        ye2 = profileFragmentProviderComponent.ye(new UserId(peq0Var2.c(1)), null);
                        ye2.K(launchContext2.r()).H(launchContext2.o()).k(context);
                        s3q0 s3q0Var69 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/wall([-0-9]+)", peq0Var2, null, null, 14)) {
                        WallGetMode wallGetMode = epx.f(peq0Var2.r("own"), "1") ? WallGetMode.OWNER : epx.f(peq0Var2.r("donut"), "1") ? WallGetMode.DONUT : epx.f(peq0Var2.r("archive"), "1") ? WallGetMode.ARCHIVED : WallGetMode.ALL;
                        ye = profileFragmentProviderComponent.ye(new UserId(peq0Var2.c(1)), null);
                        ye.N(wallGetMode).K(launchContext2.r()).k(context);
                        s3q0 s3q0Var70 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/mask([-0-9]+_[0-9]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.P(context, peq0Var2.a(1), peq0Var2.r("access_key"), launchContext2.i() ? "push_try_mask" : null, launchContext2.n());
                        s3q0 s3q0Var71 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/topic([-0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                        return Boolean.valueOf(this.s.b(peq0Var2.b(2), peq0Var2.t(SignalingProtocol.KEY_OFFSET), context, new UserId(Math.abs(peq0Var2.c(1))), yp80Var2));
                    }
                    if (jh.h("/note([-0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                        com.vkontakte.android.fragments.h hVar = new com.vkontakte.android.fragments.h();
                        hVar.c(peq0Var2.c(1));
                        hVar.b(peq0Var2.b(2));
                        hVar.a(context);
                        return null;
                    }
                    if (jh.h("/photo([-_0-9]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.Q(context, peq0Var2.a(1), epx.f(peq0Var2.r("display_mode"), "fullscreen"), peq0Var2.r("reply"), peq0Var2.r("access_key"), yp80Var, peq0Var2.t("recognition_tags") == 1, peq0Var2.t("real_tags") == 1, str4);
                        return Boolean.TRUE;
                    }
                    if (jh.h("/wall(([-0-9]+)_([0-9]+))", peq0Var2, null, null, 14)) {
                        String r20 = peq0Var2.r("thread");
                        if (r20 == null || r20.length() == 0) {
                            return Boolean.valueOf(z(context, launchContext2, yp80Var, peq0Var2));
                        }
                        hc60.a(cqm0.h(peq0Var2.a(3)), cqm0.h(peq0Var2.r("thread")), cqm0.h(peq0Var2.r("reply")), context, new UserId(cqm0.l(peq0Var2.a(2))), yp80Var);
                        return Boolean.TRUE;
                    }
                    if (jh.h("/place([-0-9]+)", peq0Var2, null, null, 14)) {
                        n().J(peq0Var2.b(1), context);
                        s3q0 s3q0Var72 = s3q0.a;
                        return null;
                    }
                    m31 = peq0Var2.m(0, "/music");
                    if (m31) {
                        yk40 builder2 = zk40Var.builder();
                        builder2.C(o25.a().c());
                        builder2.E(str4);
                        b4 = builder2.b(h.toString(), false);
                        ((com.vk.music.fragment.impl.a) b4).B(context);
                        s3q0 s3q0Var73 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/curator/landing/(\\d+)_([a-z0-9]+)", peq0Var2, null, null, 14)) {
                        WebViewFragment.c cVar2 = new WebViewFragment.c(h);
                        cVar2.L();
                        cVar2.E();
                        cVar2.k(context);
                        s3q0 s3q0Var74 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/curator/(\\d+)(/[-_a-zA-Z0-9]+)?", peq0Var2, null, null, 14)) {
                        MusicCuratorCatalogFragment.a aVar15 = new MusicCuratorCatalogFragment.a(peq0Var2.a(1));
                        aVar15.C(str4);
                        aVar15.B(launchContext2.o());
                        aVar15.z(h.toString(), false);
                        aVar15.k(context);
                        s3q0 s3q0Var75 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/curator/(\\d+)/([-_a-zA-Z0-9]+)", peq0Var2, null, null, 14)) {
                        MusicCuratorCatalogFragment.a aVar16 = new MusicCuratorCatalogFragment.a(peq0Var2.a(1));
                        aVar16.C(str4);
                        aVar16.B(launchContext2.o());
                        aVar16.z(h.toString(), true);
                        aVar16.k(context);
                        s3q0 s3q0Var76 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/curator/([-_a-zA-Z0-9]+)", peq0Var2, null, null, 14)) {
                        MusicCuratorCatalogFragment.a aVar17 = new MusicCuratorCatalogFragment.a(peq0Var2.a(1));
                        aVar17.C(str4);
                        aVar17.B(launchContext2.o());
                        aVar17.k(context);
                        s3q0 s3q0Var77 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/curator/([-_a-zA-Z0-9]+)/[-_a-zA-Z0-9]+", peq0Var2, null, null, 14)) {
                        MusicCuratorCatalogFragment.a aVar18 = new MusicCuratorCatalogFragment.a(peq0Var2.a(1));
                        aVar18.C(str4);
                        aVar18.B(launchContext2.o());
                        aVar18.z(h.toString(), true);
                        aVar18.k(context);
                        s3q0 s3q0Var78 = s3q0.a;
                        return null;
                    }
                    if (rwi.d().a().b(peq0Var2)) {
                        rwi.d().a().a(context, launchContext2, peq0Var2);
                        return null;
                    }
                    m32 = peq0Var2.m(0, "/audioplayer");
                    if (m32) {
                        if (!k840.a.g().b().m0().i()) {
                            lyd.g().x(context, false);
                        }
                        s3q0 s3q0Var79 = s3q0.a;
                        return null;
                    }
                    m33 = peq0Var2.m(0, "/audio/snippets");
                    if (m33) {
                        lyd.g().n(context);
                        s3q0 s3q0Var80 = s3q0.a;
                        return null;
                    }
                    m34 = peq0Var2.m(0, "/audio");
                    if (m34) {
                        if (peq0Var2.j("popup")) {
                            if (epx.f(peq0Var2.r("popup"), "recoms_onboarding")) {
                                this.E.a(context, peq0Var2.r("scenario"), peq0Var2.r(CommonUrlParts.REQUEST_ID));
                            }
                        } else if (peq0Var2.j(CampaignEx.JSON_KEY_AD_Q)) {
                            yk40 builder3 = zk40Var.builder();
                            builder3.F(peq0Var2.r(CampaignEx.JSON_KEY_AD_Q));
                            builder3.E(str4);
                            builder3.B(context);
                        } else if (peq0Var2.j("catalog")) {
                            if (epx.f(peq0Var2.r("catalog"), "my_audios")) {
                                MusicMyAudiosCatalogFragment.a aVar19 = new MusicMyAudiosCatalogFragment.a();
                                aVar19.D(str4);
                                aVar19.E(peq0Var2.r("catalog"));
                                aVar19.B(launchContext2.o());
                                aVar19.C(h.toString());
                                aVar19.k(context);
                            } else {
                                MusicCollectionType.Companion.getClass();
                                if (j5g.P(MusicCollectionType.a.b(), peq0Var2.r("catalog"))) {
                                    MusicMyAudiosCatalogFragment.a aVar20 = new MusicMyAudiosCatalogFragment.a();
                                    aVar20.D(str4);
                                    aVar20.E(peq0Var2.r("catalog"));
                                    aVar20.B(launchContext2.o());
                                    aVar20.C(h.toString());
                                    aVar20.k(context);
                                } else {
                                    yk40 builder4 = zk40Var.builder();
                                    builder4.b(h.toString(), true);
                                    builder4.E(str4);
                                    builder4.B(context);
                                }
                            }
                        } else if (epx.f(peq0Var2.g(), "download_history")) {
                            MusicDownloadsHistoryCatalogFragment.a aVar21 = new MusicDownloadsHistoryCatalogFragment.a();
                            aVar21.y(h.toString());
                            aVar21.k(context);
                        } else if (peq0Var2.j("section")) {
                            yk40 builder5 = zk40Var.builder();
                            builder5.b(h.toString(), true);
                            builder5.E(str4);
                            builder5.B(context);
                        } else if (!peq0Var2.j("screen")) {
                            b2 = zk40Var.builder().b(h.toString(), false);
                            com.vk.music.fragment.impl.a aVar22 = (com.vk.music.fragment.impl.a) b2;
                            aVar22.E(str4);
                            aVar22.B(context);
                        } else if (epx.f(peq0Var2.r("screen"), "snippets")) {
                            lyd.g().n(context);
                        } else {
                            b3 = zk40Var.builder().b(h.toString(), false);
                            com.vk.music.fragment.impl.a aVar23 = (com.vk.music.fragment.impl.a) b3;
                            aVar23.E(str4);
                            aVar23.B(context);
                        }
                        s3q0 s3q0Var81 = s3q0.a;
                        return null;
                    }
                    m35 = peq0Var2.m(0, "/audio_search");
                    if (m35) {
                        yk40 builder6 = zk40Var.builder();
                        builder6.F("");
                        builder6.B(context);
                        s3q0 s3q0Var82 = s3q0.a;
                        return null;
                    }
                    m36 = peq0Var2.m(0, "/audio_offline");
                    if (m36) {
                        String r21 = peq0Var2.r("section");
                        if (r21 != null) {
                            MusicOfflineShowAllFragment.a aVar24 = new MusicOfflineShowAllFragment.a();
                            aVar24.C(r21);
                            String canonicalName = MusicOfflineCatalogRootVh.class.getCanonicalName();
                            aVar24.B(canonicalName == null ? "" : canonicalName);
                            aVar24.k(context);
                        } else {
                            MusicOfflineCatalogFragment.a aVar25 = new MusicOfflineCatalogFragment.a();
                            MusicOfflineCatalogFragment.a.y(aVar25, h.toString());
                            aVar25.k(context);
                        }
                        s3q0 s3q0Var83 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?", peq0Var2, null, null, 14)) {
                        String d5 = peq0Var2.d(3);
                        if (d5 == null) {
                            String q = peq0Var2.q(1);
                            if (q != null) {
                                y = brm0.y(q, DomExceptionUtils.SEPARATOR, "");
                                str = y;
                            } else {
                                str = null;
                            }
                        } else {
                            str = d5;
                        }
                        UserId f3 = fkq0.f(peq0Var2.c(1));
                        int b10 = peq0Var2.b(2);
                        String k7 = launchContext2.k();
                        a550.b(this.v, context, f3, b10, str, str4, null, k7 == null ? "" : k7, 96);
                        s3q0 s3q0Var84 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audios([-0-9]+)", peq0Var2, null, null, 14)) {
                        String uri3 = h.toString();
                        UserId f4 = fkq0.f(peq0Var2.c(1));
                        String r22 = peq0Var2.r("album_id");
                        int parseInt = r22 != null ? Integer.parseInt(r22) : -1;
                        String k8 = launchContext2.k();
                        this.v.a(context, f4, parseInt, null, str4, uri3, true, k8 == null ? "" : k8);
                        s3q0 s3q0Var85 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/podcasts", peq0Var2, null, null, 14)) {
                        this.F.a(context, str4, peq0Var2.r("category"));
                        s3q0 s3q0Var86 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/podcast([-0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                        PodcastEpisodeFragment.a aVar26 = new PodcastEpisodeFragment.a(new UserId(peq0Var2.c(1)), peq0Var2.b(2));
                        aVar26.B(str4);
                        aVar26.z(launchContext2.k());
                        aVar26.k(context);
                        s3q0 s3q0Var87 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/podcasts([-0-9]+)", peq0Var2, null, null, 14)) {
                        PodcastFragment.a aVar27 = new PodcastFragment.a(new UserId(peq0Var2.c(1)));
                        aVar27.z(str4);
                        aVar27.y(launchContext2.k());
                        aVar27.k(context);
                        s3q0 s3q0Var88 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audiobooks", peq0Var2, null, null, 14) && peq0Var2.j("genre")) {
                        AudioBookGenreCatalogFragment.a aVar28 = new AudioBookGenreCatalogFragment.a(peq0Var2.r("genre"));
                        aVar28.y(str4);
                        aVar28.k(context);
                        s3q0 s3q0Var89 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audiobook([-0-9]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.m(context, str4, peq0Var2.b(1), launchContext2.k());
                        s3q0 s3q0Var90 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audiobook_person([-0-9]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.n(context, str4, peq0Var2.b(1), launchContext2.k());
                        s3q0 s3q0Var91 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/person_audiobooks", peq0Var2, null, null, 14) && peq0Var2.j("genre_id") && peq0Var2.j("person_id")) {
                        com.vk.common.links.c.o(context, str4, peq0Var2.t("genre_id"), peq0Var2.t("person_id"));
                        s3q0 s3q0Var92 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/audio([-0-9]+_[0-9]+_?[0-9a-zA-Z]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.p(context, peq0Var2.a(1), str4, yp80Var);
                        return Boolean.TRUE;
                    }
                    if (jh.h("/music/album/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)", peq0Var2, null, null, 14)) {
                        UserId f5 = fkq0.f(peq0Var2.c(1));
                        int b11 = peq0Var2.b(2);
                        String d6 = peq0Var2.d(3);
                        String k9 = launchContext2.k();
                        a550.b(this.v, context, f5, b11, d6, str4, null, k9 == null ? "" : k9, 96);
                        s3q0 s3q0Var93 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/music/playlist/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)", peq0Var2, null, null, 14)) {
                        UserId f6 = fkq0.f(peq0Var2.c(1));
                        int b12 = peq0Var2.b(2);
                        String d7 = peq0Var2.d(3);
                        String k10 = launchContext2.k();
                        a550.b(this.v, context, f6, b12, d7, str4, null, k10 == null ? "" : k10, 96);
                        s3q0 s3q0Var94 = s3q0.a;
                        return null;
                    }
                    if (peq0.p(peq0Var2, laz.e(), null, null, 14)) {
                        y(context, launchContext2, peq0Var2);
                        s3q0 s3q0Var95 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/product-reviews(-?[0-9]+)_([0-9-]+)", peq0Var2, null, null, 14)) {
                        ajg0Var.p(context, peq0Var2.c(2), new UserId(peq0Var2.c(1)), null, null);
                        s3q0 s3q0Var96 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/product-review(-?[0-9]+)_([0-9-]+)-([0-9-]+)", peq0Var2, null, null, 14)) {
                        this.h.l(context, peq0Var2.c(2), new UserId(peq0Var2.c(1)), Integer.valueOf(peq0Var2.b(3)));
                        s3q0 s3q0Var97 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/product-review(-?[0-9]+)_([0-9-]+)", peq0Var2, null, null, 14)) {
                        this.h.l(context, peq0Var2.c(2), new UserId(peq0Var2.c(1)), null);
                        s3q0 s3q0Var98 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/market(-?[0-9]+)_([0-9]+)", peq0Var2, null, null, 14)) {
                        long c2 = peq0Var2.c(1);
                        long c3 = peq0Var2.c(2);
                        String c4 = launchContext2.c();
                        if (c4 == null) {
                            c4 = peq0Var2.r("adsLabel");
                        }
                        w(c3, c2, context, h, c4);
                        s3q0 s3q0Var99 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/market([-0-9]+)", peq0Var2, null, null, 14)) {
                        if (r3 != null) {
                            B2 = brm0.B(r3, "product", false);
                            if (B2) {
                                String c5 = launchContext2.c();
                                if (c5 == null) {
                                    c5 = peq0Var2.r("adsLabel");
                                }
                                x(context, h, r3, c5);
                                s3q0 s3q0Var100 = s3q0.a;
                                return null;
                            }
                        }
                        String g2 = peq0Var2.g();
                        if (g2 != null && new Regex("album_[-0-9]+").f(g2)) {
                            v(context, peq0Var2);
                        } else if (peq0Var2.j("album_id")) {
                            v(context, peq0Var2);
                        } else {
                            CommonMarketStat$TypeRefSource c6 = mt00.c(launchContext2.e());
                            if (c6 == null) {
                                c6 = CommonMarketStat$TypeRefSource.LINK;
                            }
                            this.A.c(context, new UserId(peq0Var2.c(1)), new MarketAnalyticsParams(null, null, c6, null, null, null, null, false, null, false, false, null, false, 8187, null), epx.f(launchContext2.k(), j6i.a().g().getPackageName()) ? this.w.a() : null, true);
                        }
                        s3q0 s3q0Var1002 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/uslugi([-0-9]+)(.*)?", peq0Var2, null, null, 14)) {
                        UserId userId8 = new UserId(peq0Var2.c(1));
                        String r23 = peq0Var2.r("section");
                        if (r23 != null) {
                            B = brm0.B(r23, "album", false);
                            if (B) {
                                num = Integer.valueOf(cqm0.h(r23.substring(6)));
                                com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) this.k.getValue(), context, userId8, num, peq0Var2.r("section_id"), null, false, null, null, 448);
                                s3q0 s3q0Var101 = s3q0.a;
                                return null;
                            }
                        }
                        num = null;
                        com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) this.k.getValue(), context, userId8, num, peq0Var2.r("section_id"), null, false, null, null, 448);
                        s3q0 s3q0Var1012 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/cart([0-9]*)", peq0Var2, null, null, 14)) {
                        fy9.a(this.g, context, new UserId(peq0Var2.c(1)), null, mt00.c(peq0Var2.r("source")), 4);
                        s3q0 s3q0Var102 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/service-booking([-0-9]+)(.*)?", peq0Var2, null, null, 14)) {
                        UserId userId9 = new UserId(peq0Var2.c(1));
                        String str10 = (String) rl3.O(peq0Var2.f());
                        if (str10 == null) {
                            str10 = "";
                        }
                        String str11 = (String) j5g.k0(drm0.c0(str10, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6));
                        String str12 = str11 == null ? "" : str11;
                        BookingSource.Companion.getClass();
                        ((cp80) this.l.getValue()).a(context, fkq0.e(userId9), h.toString(), str12, BookingSource.a.a(str12));
                        s3q0 s3q0Var103 = s3q0.a;
                        return null;
                    }
                    Context context2 = context;
                    m37 = peq0Var2.m(0, "/calendar");
                    if (m37 && peq0Var2.i()) {
                        com.vk.common.links.c.q(context2);
                        s3q0 s3q0Var104 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/@(-?[a-z0-9._]+)", peq0Var2, null, null, 14)) {
                        com.vk.common.links.c.j(context2, peq0Var2.a(1));
                        s3q0 s3q0Var105 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/@([a-zA-Z0-9_-]+)/([a-zA-Z0-9_/-]+)", peq0Var2, null, null, 14)) {
                        String a5 = peq0Var2.a(1);
                        Uri h6 = peq0Var2.h();
                        UserId.b bVar = UserId.c;
                        com.vk.common.links.c.S(context2, h6, launchContext2, a5, yp80Var);
                        return Boolean.TRUE;
                    }
                    m38 = peq0Var2.m(0, "/camera");
                    if (m38) {
                        Boolean a6 = new xi9(context2, h, launchContext2, yp80Var, peq0Var2).a();
                        if (a6 != null) {
                            return a6;
                        }
                        s3q0 s3q0Var106 = s3q0.a;
                        return null;
                    }
                    peq0 peq0Var3 = peq0Var2;
                    m39 = peq0Var3.m(0, "/camera_settings");
                    if (m39) {
                        sxc0.a().a(context2, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
                        s3q0 s3q0Var107 = s3q0.a;
                        return null;
                    }
                    m40 = peq0Var3.m(0, "/new_story_picker");
                    if (m40) {
                        String queryParameter7 = h.getQueryParameter("section");
                        if (epx.f(queryParameter7 == null ? "" : queryParameter7, "templates")) {
                            spl0 a7 = b6m.a();
                            UiTracker uiTracker = UiTracker.a;
                            a7.o(context2, UiTracker.c(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.LINK);
                        } else {
                            spl0 a8 = b6m.a();
                            UiTracker uiTracker2 = UiTracker.a;
                            a8.m(context2, UiTracker.c(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.LINK);
                        }
                        s3q0 s3q0Var108 = s3q0.a;
                        return null;
                    }
                    m41 = peq0Var3.m(0, "/story_template");
                    if (m41) {
                        new tjm0().b(peq0Var3.t("id"), context2);
                        s3q0 s3q0Var109 = s3q0.a;
                        return null;
                    }
                    m42 = peq0Var3.m(0, "/new_story");
                    if (m42) {
                        Activity h7 = e3m.h(context2);
                        if (h7 == null) {
                            return Boolean.FALSE;
                        }
                        bc6 L = xa4.L(h7);
                        String queryParameter8 = h.getQueryParameter("storybox");
                        if (queryParameter8 == null) {
                            return Boolean.FALSE;
                        }
                        String queryParameter9 = h.getQueryParameter("entry_point");
                        String obj = queryParameter9 != null ? drm0.p0(queryParameter9).toString() : null;
                        io.reactivex.rxjava3.core.q m55 = hg1.m(b0m0.a.a(new oap.b(queryParameter8)), context, 0L, false, 62);
                        asu0.a.getClass();
                        itg0.i(4, m55.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, new defpackage.m(1, L, obj), new g53(0));
                        s3q0 s3q0Var110 = s3q0.a;
                        return null;
                    }
                    m43 = peq0Var3.m(0, "/stories_archive");
                    if (m43) {
                        new StoryArchiveFragment.a().k(context2);
                        s3q0 s3q0Var111 = s3q0.a;
                        return null;
                    }
                    m44 = peq0Var3.m(0, "/story_discover");
                    if (m44) {
                        StoryViewerRouter.d(c(), context2, e43.k(new DiscoverStoriesContainer("", "", false, null, 12, null)), null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_LINK, null, null, null, null, null, 4084);
                        s3q0 s3q0Var112 = s3q0.a;
                        return null;
                    }
                    m45 = peq0Var3.m(0, "/reports");
                    if (m45) {
                        if (jeq0.a(h).isEmpty()) {
                            return Boolean.FALSE;
                        }
                        int i10 = ReportFragment.a0;
                        ReportFragment.a a9 = ReportFragment.b.a();
                        a9.H(jeq0.a(h));
                        a9.k(context2);
                        s3q0 s3q0Var113 = s3q0.a;
                        return null;
                    }
                    m46 = peq0Var3.m(0, "/handle_external_auth");
                    if (m46) {
                        Intent addFlags = new Intent(context2, (Class<?>) MainActivity.class).addFlags(268468224);
                        t5y.a aVar29 = t5y.e;
                        LinkedHashMap a10 = jeq0.a(h);
                        aVar29.getClass();
                        t5y.a.a(a10, addFlags).subscribe(new h53(yp80Var, 0));
                        return Boolean.TRUE;
                    }
                    m47 = peq0Var3.m(0, "/content_attached_products");
                    if (m47) {
                        UserId userId10 = new UserId(peq0Var3.u("content_owner_id"));
                        long u3 = peq0Var3.u("content_id");
                        peq0Var3.r("content_type");
                        ((kkj) this.m.getValue()).a(context2, userId10, u3);
                        s3q0 s3q0Var114 = s3q0.a;
                        return null;
                    }
                    if (r3 != null && new Regex("address.*").f(r3)) {
                        hl10 e2 = new Regex("address(-?[0-9]+)_?([0-9]+)?").e(r3);
                        if ((e2 != null ? e2.b() : null) == null || e2.b().size() < 2) {
                            return Boolean.FALSE;
                        }
                        xqg.b(this.C, context, fkq0.g(new UserId(cqm0.l((String) ((hl10.a) e2.b()).get(1)))), null, null, Integer.valueOf(e2.b().size() > 2 ? cqm0.h((String) ((hl10.a) e2.b()).get(2)) : 0), false, null, 108);
                        s3q0 s3q0Var115 = s3q0.a;
                        return null;
                    }
                    if (r3 != null && new Regex("posts_reach_wall(-?\\d+)_(\\d+)").f(r3)) {
                        hl10 e3 = new Regex("posts_reach_wall(-?\\d+)_(\\d+)").e(r3);
                        if ((e3 != null ? e3.b() : null) == null || e3.b().size() < 2) {
                            return Boolean.FALSE;
                        }
                        UserId userId11 = new UserId(cqm0.l((String) ((hl10.a) e3.b()).get(1)));
                        int h8 = cqm0.h((String) ((hl10.a) e3.b()).get(2));
                        int i11 = PostStatsFragment.a0;
                        PostStatsFragment.b.a(h8, userId11).k(context2);
                        s3q0 s3q0Var116 = s3q0.a;
                        return null;
                    }
                    if (r3 != null && new Regex("actual-news-([-a-zA-Z0-9_]+)").f(r3)) {
                        if (!FeedFeatures.DZEN_CAROUSEL.h()) {
                            com.vk.common.links.c.J(context2);
                            return null;
                        }
                        hl10 e4 = new Regex("actual-news-([-a-zA-Z0-9_]+)").e(r3);
                        if ((e4 != null ? e4.b() : null) == null || e4.b().size() < 2) {
                            return Boolean.FALSE;
                        }
                        this.I.a(context2, (String) ((hl10.a) e4.b()).get(1), "from_feed");
                        s3q0 s3q0Var117 = s3q0.a;
                        return null;
                    }
                    if (r3 != null && new Regex("chats-(\\d+)").f(r3)) {
                        hl10 e5 = new Regex("chats-(\\d+)").e(r3);
                        if (e5 == null) {
                            return Boolean.FALSE;
                        }
                        List<String> b13 = e5.b();
                        if (b13 == null || b13.isEmpty()) {
                            return Boolean.FALSE;
                        }
                        q(context2, cqm0.l((String) ((hl10.a) e5.b()).get(1)), yp80Var);
                        s3q0 s3q0Var118 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/community_manage/?", peq0Var3, null, null, 14)) {
                        int i12 = CommunityManageFragment.i0;
                        CommunityManageFragment.b.a(null, jeq0.c(peq0Var3.h()), null, null, null, false, 125).k(context2);
                        s3q0 s3q0Var119 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/strikes/(-[0-9]+)", peq0Var3, null, null, 14)) {
                        int i13 = CommunityManageFragment.i0;
                        String d8 = peq0Var3.d(1);
                        if (d8 != null && (k2 = cqm0.k(d8)) != null) {
                            j = k2.longValue();
                        }
                        CommunityManageFragment.b.a(new UserId(-j), null, "strike-system", null, null, false, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE).k(context2);
                        s3q0 s3q0Var120 = s3q0.a;
                        return null;
                    }
                    if (jh.h("/donut_settings/(-[0-9]+)", peq0Var3, null, null, 14)) {
                        int i14 = CommunityManageFragment.i0;
                        String d9 = peq0Var3.d(1);
                        if (d9 != null && (k = cqm0.k(d9)) != null) {
                            j = k.longValue();
                        }
                        CommunityManageFragment.b.a(new UserId(-j), null, "donut", null, null, false, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE).k(context2);
                        s3q0 s3q0Var121 = s3q0.a;
                        return null;
                    }
                    if (r3 != null && laz.c().f(r3)) {
                        hl10 e6 = laz.c().e(r3);
                        if (e6 == null || (b = e6.b()) == null) {
                            return Boolean.FALSE;
                        }
                        if (b.size() <= 1) {
                            return Boolean.FALSE;
                        }
                        long l2 = cqm0.l((String) ((hl10.a) b).get(1));
                        boolean f7 = epx.f(peq0Var3.r("enable_unsubscribe"), "1");
                        String r24 = peq0Var3.r("levelId");
                        Integer m56 = r24 != null ? arm0.m(10, r24) : null;
                        int i15 = DonutPaymentAppFragment.a0;
                        DonutPaymentAppFragment.b.a(l2, m56, peq0Var3.r("source"), f7).k(context2);
                        s3q0 s3q0Var122 = s3q0.a;
                        return null;
                    }
                    m48 = peq0Var3.m(0, "/business-ads");
                    if (!m48) {
                        m49 = peq0Var3.m(0, "/biz");
                        if (!m49) {
                            m50 = peq0Var3.m(0, "/adbonus");
                            if (m50) {
                                WebViewFragment.c cVar3 = new WebViewFragment.c(h);
                                cVar3.A();
                                cVar3.F(true, true);
                                cVar3.k(context2);
                                s3q0 s3q0Var123 = s3q0.a;
                                return null;
                            }
                            m51 = peq0Var3.m(0, "/friends_contacts");
                            if (m51) {
                                ContactsManager.R0(com.vk.contacts.d.a(), context, false, null, new h5(yp80Var, 7), new i5(context2, yp80Var), 14);
                                return Boolean.TRUE;
                            }
                            if (bgc.a(peq0Var3)) {
                                bgc.b(context2, launchContext2, peq0Var3);
                                s3q0 s3q0Var124 = s3q0.a;
                                return null;
                            }
                            if (peq0Var3.k(naz.c())) {
                                return Boolean.FALSE;
                            }
                            f1b f1bVar = (f1b) this.N.getValue();
                            if (f1bVar != null && f1bVar.a(peq0Var3)) {
                                return Boolean.valueOf(((f1b) this.N.getValue()).b(context2, peq0Var3, new fju0(context2, yp80Var), new io.reactivex.rxjava3.disposables.b()));
                            }
                            if (peq0.p(peq0Var3, new Regex("/([\\p{L}0-9._]+)/(.+)"), new Regex("^/[\\p{L}0-9._]+/[^/]+$"), null, 12) && launchContext2.t()) {
                                com.vk.common.links.c.z(context2, n(), peq0Var3.a(1), peq0Var3.a(2), yp80Var, naz.s(h));
                                return Boolean.TRUE;
                            }
                            if (peq0Var3.k(naz.e())) {
                                m52 = peq0Var3.m(0, "/vkconnect");
                                if (m52) {
                                    return Boolean.FALSE;
                                }
                            }
                            if (launchContext2.t() && ((jlu0) this.n.getValue()).b(uri.toString())) {
                                while (true) {
                                    z = context2 instanceof FragmentActivity;
                                    if (z || !(context2 instanceof ContextWrapper)) {
                                        break;
                                    }
                                    context2 = ((ContextWrapper) context2).getBaseContext();
                                }
                                FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
                                if (fragmentActivity == null) {
                                    return null;
                                }
                                ((jlu0) this.n.getValue()).h(fragmentActivity, MultiAccountEntryPoint.Deeplink.d);
                                s3q0 s3q0Var125 = s3q0.a;
                                return null;
                            }
                            if (jh.h("/badges(-?[0-9]+)_([0-9]+)_([0-9]+)(_badge([0-9]+))?", peq0Var3, null, null, 14)) {
                                n().m(context2, new UserId(peq0Var3.c(1)), peq0Var3.b(3));
                                return Boolean.TRUE;
                            }
                            for (iaz iazVar3 : linkedHashSet) {
                                if (iazVar3.a(peq0Var3)) {
                                    return Boolean.valueOf(iazVar3.b(context2, uri, launchContext2, yp80Var, peq0Var3));
                                }
                                launchContext2 = launchContext;
                                peq0Var3 = peq0Var;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    WebViewFragment.c cVar4 = new WebViewFragment.c(h);
                    cVar4.L();
                    cVar4.E();
                    cVar4.k(context2);
                    s3q0 s3q0Var126 = s3q0.a;
                    return null;
                }
                String r25 = peq0Var2.r("order_id");
                if (r25 != null && (m53 = arm0.m(10, r25)) != null) {
                    hy80Var.c(context, new ReviewSuggestion.Order(m53.intValue()));
                    s3q0 s3q0Var127 = s3q0.a;
                    return null;
                }
            }
            return null;
        }
        String r26 = peq0Var2.r("act");
        if (r26 == null) {
            new oz50(SettingsListFragment.class, null).k(context);
            s3q0 s3q0Var128 = s3q0.a;
            return null;
        }
        switch (r26.hashCode()) {
            case -1358972681:
                if (r26.equals("music_subscription")) {
                    new MusicSubscriptionControlFragment.a().k(context);
                    s3q0 s3q0Var129 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5 = new WebViewFragment.c(h);
                cVar5.E();
                cVar5.A();
                cVar5.s(true);
                cVar5.t();
                cVar5.k(context);
                s3q0 s3q0Var130 = s3q0.a;
                return null;
            case -1177318867:
                if (r26.equals("account")) {
                    SettingsAccountFragment.a aVar30 = new SettingsAccountFragment.a();
                    aVar30.y(peq0Var2.r("highlight"));
                    aVar30.k(context);
                    s3q0 s3q0Var131 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar52 = new WebViewFragment.c(h);
                cVar52.E();
                cVar52.A();
                cVar52.s(true);
                cVar52.t();
                cVar52.k(context);
                s3q0 s3q0Var1302 = s3q0.a;
                return null;
            case -1039689911:
                if (r26.equals("notify")) {
                    this.o.c(context);
                    s3q0 s3q0Var132 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar522 = new WebViewFragment.c(h);
                cVar522.E();
                cVar522.A();
                cVar522.s(true);
                cVar522.t();
                cVar522.k(context);
                s3q0 s3q0Var13022 = s3q0.a;
                return null;
            case -586477605:
                if (r26.equals("group_verification")) {
                    t(context, peq0Var2);
                    s3q0 s3q0Var133 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5222 = new WebViewFragment.c(h);
                cVar5222.E();
                cVar5222.A();
                cVar5222.s(true);
                cVar5222.t();
                cVar5222.k(context);
                s3q0 s3q0Var130222 = s3q0.a;
                return null;
            case -345300727:
                if (r26.equals("group_notify")) {
                    com.vk.common.links.c.I(peq0Var2.u("gid"), yp80Var);
                    return null;
                }
                WebViewFragment.c cVar52222 = new WebViewFragment.c(h);
                cVar52222.E();
                cVar52222.A();
                cVar52222.s(true);
                cVar52222.t();
                cVar52222.k(context);
                s3q0 s3q0Var1302222 = s3q0.a;
                return null;
            case -339185956:
                if (r26.equals("balance")) {
                    new oz50(BalanceFragment.class, null).k(context);
                    s3q0 s3q0Var134 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar522222 = new WebViewFragment.c(h);
                cVar522222.E();
                cVar522222.A();
                cVar522222.s(true);
                cVar522222.t();
                cVar522222.k(context);
                s3q0 s3q0Var13022222 = s3q0.a;
                return null;
            case -314498168:
                if (r26.equals("privacy")) {
                    int i16 = PrivacyFragment.a0;
                    PrivacyFragment.b.a(false, false, peq0Var2.r("profile_setting"), null, 55).k(context);
                    s3q0 s3q0Var135 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5222222 = new WebViewFragment.c(h);
                cVar5222222.E();
                cVar5222222.A();
                cVar5222222.s(true);
                cVar5222222.t();
                cVar5222222.k(context);
                s3q0 s3q0Var130222222 = s3q0.a;
                return null;
            case -50403246:
                break;
            case 3138974:
                if (r26.equals("feed")) {
                    new NewsfeedSettingsFragment.a().k(context);
                    s3q0 s3q0Var136 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar52222222 = new WebViewFragment.c(h);
                cVar52222222.E();
                cVar52222222.A();
                cVar52222222.s(true);
                cVar52222222.t();
                cVar52222222.k(context);
                s3q0 s3q0Var1302222222 = s3q0.a;
                return null;
            case 192147503:
                if (r26.equals("biometrics_lock")) {
                    ?? r1 = this.x;
                    v57 b14 = ((BiometricsLockComponent) r1.getValue()).b();
                    b87 a11 = ((BiometricsLockComponent) r1.getValue()).a();
                    if (b14.a()) {
                        a11.a(context);
                    } else {
                        a11.b(context);
                    }
                    s3q0 s3q0Var137 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar522222222 = new WebViewFragment.c(h);
                cVar522222222.E();
                cVar522222222.A();
                cVar522222222.s(true);
                cVar522222222.t();
                cVar522222222.k(context);
                s3q0 s3q0Var13022222222 = s3q0.a;
                return null;
            case 236094221:
                if (r26.equals("link_vkbid_profile")) {
                    u(context, peq0Var2);
                    s3q0 s3q0Var138 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5222222222 = new WebViewFragment.c(h);
                cVar5222222222.E();
                cVar5222222222.A();
                cVar5222222222.s(true);
                cVar5222222222.t();
                cVar5222222222.k(context);
                s3q0 s3q0Var130222222222 = s3q0.a;
                return null;
            case 237256269:
                if (r26.equals("change_email")) {
                    qjv.f(context, uri);
                    s3q0 s3q0Var139 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar52222222222 = new WebViewFragment.c(h);
                cVar52222222222.E();
                cVar52222222222.A();
                cVar52222222222.s(true);
                cVar52222222222.t();
                cVar52222222222.k(context);
                s3q0 s3q0Var1302222222222 = s3q0.a;
                return null;
            case 573985132:
                if (r26.equals("unread_counter")) {
                    SettingsAccountFragment.a aVar31 = new SettingsAccountFragment.a();
                    aVar31.y("unread_counter");
                    aVar31.k(context);
                    s3q0 s3q0Var140 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar522222222222 = new WebViewFragment.c(h);
                cVar522222222222.E();
                cVar522222222222.A();
                cVar522222222222.s(true);
                cVar522222222222.t();
                cVar522222222222.k(context);
                s3q0 s3q0Var13022222222222 = s3q0.a;
                return null;
            case 739114636:
                if (r26.equals("chat_bg")) {
                    new ImSettingsDialogThemeFragment.a().k(context);
                    s3q0 s3q0Var141 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5222222222222 = new WebViewFragment.c(h);
                cVar5222222222222.E();
                cVar5222222222222.A();
                cVar5222222222222.s(true);
                cVar5222222222222.t();
                cVar5222222222222.k(context);
                s3q0 s3q0Var130222222222222 = s3q0.a;
                return null;
            case 751260291:
                break;
            case 949122880:
                if (r26.equals("security")) {
                    new AccountFragment.a(VkPassportPage.PAGE_SECURITY.i(), h.toString()).k(context);
                    s3q0 s3q0Var142 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar52222222222222 = new WebViewFragment.c(h);
                cVar52222222222222.E();
                cVar52222222222222.A();
                cVar52222222222222.s(true);
                cVar52222222222222.t();
                cVar52222222222222.k(context);
                s3q0 s3q0Var1302222222222222 = s3q0.a;
                return null;
            case 1333012765:
                if (r26.equals("blacklist")) {
                    this.t.a(context);
                    s3q0 s3q0Var143 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar522222222222222 = new WebViewFragment.c(h);
                cVar522222222222222.E();
                cVar522222222222222.A();
                cVar522222222222222.s(true);
                cVar522222222222222.t();
                cVar522222222222222.k(context);
                s3q0 s3q0Var13022222222222222 = s3q0.a;
                return null;
            case 1382682413:
                if (r26.equals("payments")) {
                    if (epx.f(peq0Var2.r("section"), BillingClient.FeatureType.SUBSCRIPTIONS)) {
                        new PaidSubscriptionsFragment.a().k(context);
                    } else {
                        MoneyTransfersFragment.d dVar = new MoneyTransfersFragment.d();
                        dVar.C();
                        dVar.k(context);
                    }
                    s3q0 s3q0Var144 = s3q0.a;
                    return null;
                }
                WebViewFragment.c cVar5222222222222222 = new WebViewFragment.c(h);
                cVar5222222222222222.E();
                cVar5222222222222222.A();
                cVar5222222222222222.s(true);
                cVar5222222222222222.t();
                cVar5222222222222222.k(context);
                s3q0 s3q0Var130222222222222222 = s3q0.a;
                return null;
            default:
                WebViewFragment.c cVar52222222222222222 = new WebViewFragment.c(h);
                cVar52222222222222222.E();
                cVar52222222222222222.A();
                cVar52222222222222222.s(true);
                cVar52222222222222222.t();
                cVar52222222222222222.k(context);
                s3q0 s3q0Var1302222222222222222 = s3q0.a;
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qjv
    public final boolean k(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        defpackage.g gVar = new defpackage.g(uri, 3);
        if (!((Boolean) this.O.getValue()).booleanValue() || ((Boolean) gVar.invoke()).booleanValue()) {
            return super.k(context, uri, launchContext, yp80Var, peq0Var);
        }
        i9l e = n9l.e((n9l) this.P.getValue(), new hpu0(context, uri, launchContext, yp80Var));
        return e instanceof i9l.c ? super.k(context, uri, launchContext, yp80Var, peq0Var) : e instanceof i9l.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NewsfeedRouter n() {
        return (NewsfeedRouter) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean o() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    public final void p(Context context, String str) {
        xa4.L(context);
        this.r.getClass();
    }

    public final void q(Context context, long j, yp80 yp80Var) {
        this.z.b(context, new UserId(j), new defpackage.r(yp80Var, 6), new j5(yp80Var, 2));
    }

    public final void r(peq0 peq0Var, Context context, Integer num) {
        UserId userId;
        Bundle arguments;
        UserId userId2 = new UserId(peq0Var.c(1));
        String r = peq0Var.r("utm");
        if (fkq0.c(userId2)) {
            ComponentCallbacks2 h = e3m.h(context);
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            androidx.fragment.app.d u = Y != null ? Y.u() : null;
            CommunityProfileFragment communityProfileFragment = u instanceof CommunityProfileFragment ? (CommunityProfileFragment) u : null;
            if (communityProfileFragment == null || (arguments = communityProfileFragment.getArguments()) == null || (userId = (UserId) arguments.getParcelable("id")) == null) {
                userId = UserId.d;
            }
            if (epx.f(userId, userId2)) {
                this.h.n(context, new CreateCommunityReviewArgs(userId2, new CreateCommunityReviewData(null, null, null, num, 7, null), r, null, null, 24, null));
            } else {
                xg5.a().g(context, fkq0.e(userId2), new cpu.a(r, num));
            }
        }
    }

    public final void s(Context context, Uri uri, String str, yp80 yp80Var) {
        this.D.b(context, uri.toString(), str, new ic(yp80Var, 6), new com.vk.movika.sdk.base.observable.p(yp80Var, 8));
    }

    public final void t(Context context, peq0 peq0Var) {
        this.B.c(context, new UserId(peq0Var.u("gid")));
    }

    public final void u(Context context, peq0 peq0Var) {
        this.B.a(context, new UserId(peq0Var.u("gid")));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void w(long j, long j2, Context context, Uri uri, String str) {
        CommonMarketStat$TypeRefSource c = mt00.c(uri.getQueryParameter("ref_source"));
        if (c == null) {
            c = CommonMarketStat$TypeRefSource.LINK;
        }
        ((sz00) this.j.getValue()).d(context, m(new qz00(j, new UserId(j2), c, null, uri.toString(), null, null, null, null, str, null, null, null, 1044344), uri));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void x(Context context, Uri uri, String str, String str2) {
        int P = drm0.P(str, '_', 0, 6);
        long parseLong = Long.parseLong(str.substring(P + 1));
        long parseLong2 = Long.parseLong(brm0.y(str, "product", "").substring(0, P - 7));
        CommonMarketStat$TypeRefSource c = mt00.c(uri.getQueryParameter("ref_source"));
        if (c == null) {
            c = CommonMarketStat$TypeRefSource.LINK;
        }
        ((sz00) this.j.getValue()).d(context, m(new qz00(parseLong, new UserId(parseLong2), c, null, uri.toString(), null, null, null, null, str2, null, null, null, 1044344), uri));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void y(Context context, LaunchContext launchContext, peq0 peq0Var) {
        Uri h = peq0Var.h();
        String queryParameter = h.getQueryParameter("track_code");
        String queryParameter2 = h.getQueryParameter("adsLabel");
        String queryParameter3 = h.getQueryParameter("ref_source");
        if (queryParameter3 == null) {
            queryParameter3 = launchContext.e();
        }
        CommonMarketStat$TypeRefSource c = mt00.c(queryParameter3);
        if (c == null) {
            c = CommonMarketStat$TypeRefSource.LINK;
        }
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = c;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
        ?? r7 = this.j;
        if (commonMarketStat$TypeRefSource == commonMarketStat$TypeRefSource2) {
            UserId userId = new UserId(peq0Var.c(1));
            long c2 = peq0Var.c(2);
            if (queryParameter == null) {
                queryParameter = launchContext.r();
            }
            String str = queryParameter;
            String c3 = launchContext.c();
            ((sz00) r7.getValue()).g(context, m(new qz00(c2, userId, commonMarketStat$TypeRefSource, 0, null, null, null, str, null, c3 == null ? queryParameter2 : c3, null, null, null, 1043440), h));
            return;
        }
        UserId userId2 = new UserId(peq0Var.c(1));
        long c4 = peq0Var.c(2);
        String d = peq0Var.d(3);
        String r = peq0Var.r("_post");
        if (queryParameter == null) {
            queryParameter = launchContext.r();
        }
        String str2 = queryParameter;
        String r2 = peq0Var.r(X3.i.L);
        Integer m = r2 != null ? arm0.m(10, r2) : null;
        String uri = h.toString();
        String c5 = launchContext.c();
        ((sz00) r7.getValue()).d(context, m(new qz00(c4, userId2, commonMarketStat$TypeRefSource, m, uri, d, r, str2, null, c5 == null ? queryParameter2 : c5, null, null, null, 1042544), h));
    }

    public final boolean z(Context context, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        String a2 = peq0Var.a(1);
        String r = peq0Var.r("reply");
        c9x0 a3 = c9x0.a.a(peq0Var.r("act"));
        if (i5r.a.a(launchContext.n(), r, a3, launchContext.m())) {
            FeedFeatures feedFeatures = FeedFeatures.FEED_OPEN_POST_LINK;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                HomeFragment2.a aVar = new HomeFragment2.a();
                aVar.y(a2);
                aVar.k(context);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return true;
            }
        }
        return NewsfeedRouter.w(n(), context, a2, r, a3, yp80Var, 32);
    }
}
