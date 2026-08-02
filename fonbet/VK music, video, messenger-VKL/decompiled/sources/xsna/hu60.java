package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.ads.api.di.AdsComponent;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewAuthors;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.StoryPostInfo;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.DonutAnalytics;
import com.vkontakte.android.data.b;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.gd60;
import xsna.msb0;
import xsna.oqb0;
import xsna.oqb0.a;
import xsna.qs80;

/* compiled from: NewsfeedNavigatorExternal.kt */
/* loaded from: classes4.dex */
public final class hu60 {
    public final bin0<String> a;
    public final bin0<String> b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final bpn0 k;
    public final Object l;
    public final bpn0 m;
    public final bpn0 n;
    public final Lazy o;
    public final bpn0 s;
    public final vmb0 p = new vmb0();
    public final urq q = new urq();
    public final h170 r = new h170();
    public final bpn0 t = new bpn0(new ee4(26));
    public final p4r u = new p4r();

    /* compiled from: NewsfeedNavigatorExternal.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.values().length];
            try {
                iArr[NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hu60(bin0 bin0Var, bin0 bin0Var2, bpn0 bpn0Var, iu60 iu60Var) {
        this.a = bin0Var;
        this.b = bin0Var2;
        this.c = iu60Var.g;
        this.d = iu60Var.b;
        this.e = iu60Var.d;
        this.f = iu60Var.e;
        this.g = bpn0Var;
        this.h = iu60Var.c;
        this.i = iu60Var.a;
        this.j = iu60Var.f;
        this.k = iu60Var.h;
        this.l = iu60Var.i;
        this.m = iu60Var.j;
        this.n = iu60Var.k;
        this.o = iu60Var.m;
        this.s = iu60Var.l;
    }

    public final gd60 a() {
        return ((NewsFeedBridgeComponent) this.i.getValue()).Ad();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final Context context, NewsfeedExternalAction.Navigation navigation) {
        VideoAttachment l;
        NewsEntry.TrackData Cb;
        SourcePhoto sourcePhoto;
        Owner d;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        Long l2;
        Long valueOf;
        VideoFile videoFile;
        String str;
        if (navigation instanceof NewsfeedExternalAction.Navigation.w) {
            a().y1(context);
            return;
        }
        if (navigation instanceof NewsfeedExternalAction.Navigation.a) {
            gd60 a2 = a();
            gd60.a aVar = gd60.a;
            a2.B0(context, null);
            return;
        }
        boolean z = navigation instanceof NewsfeedExternalAction.Navigation.t;
        Lazy lazy = this.c;
        bin0<String> bin0Var = this.b;
        if (z) {
            ((NewsFeedComponent) lazy.getValue()).l0().K(context, ((NewsfeedExternalAction.Navigation.t) navigation).a, bin0Var.get());
            return;
        }
        if (navigation instanceof NewsfeedExternalAction.Navigation.b) {
            NewsfeedExternalAction.Navigation.b bVar = (NewsfeedExternalAction.Navigation.b) navigation;
            boolean z2 = bVar instanceof NewsfeedExternalAction.Navigation.b.a;
            Lazy lazy2 = this.h;
            if (z2) {
                NewsfeedExternalAction.Navigation.b.a aVar2 = (NewsfeedExternalAction.Navigation.b.a) bVar;
                ((mrp) lazy2.getValue()).b(context, aVar2.a, this.a.get(), bin0Var.get(), aVar2.b);
                return;
            } else if (bVar instanceof NewsfeedExternalAction.Navigation.b.C1436b) {
                ((mrp) lazy2.getValue()).c(context, ((NewsfeedExternalAction.Navigation.b.C1436b) bVar).a, bin0Var.get());
                return;
            } else {
                if (!(bVar instanceof NewsfeedExternalAction.Navigation.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                mrp mrpVar = (mrp) lazy2.getValue();
                NewsfeedExternalAction.Navigation.b.c cVar = (NewsfeedExternalAction.Navigation.b.c) bVar;
                NewsEntry newsEntry = cVar.a;
                mrpVar.a().b0(context, newsEntry, ModalPostDestination.REACTIONS_ALL, false, null, null, newsEntry.Cb().b, cVar.b);
                return;
            }
        }
        if (navigation instanceof NewsfeedExternalAction.Navigation.q) {
            a().s0(context, null, null, null);
            return;
        }
        if (navigation instanceof NewsfeedExternalAction.Navigation.c) {
            NewsfeedExternalAction.Navigation.c cVar2 = (NewsfeedExternalAction.Navigation.c) navigation;
            a().r0(context, cVar2.b, cVar2.c, cVar2.d);
            return;
        }
        if (navigation instanceof NewsfeedExternalAction.Navigation.OpenMyTargetAds) {
            final NewsfeedExternalAction.Navigation.OpenMyTargetAds openMyTargetAds = (NewsfeedExternalAction.Navigation.OpenMyTargetAds) navigation;
            MyTargetNativeAdEntry myTargetNativeAdEntry = openMyTargetAds.b;
            NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar3 = openMyTargetAds.c;
            final gjx gjxVar = myTargetNativeAdEntry.B;
            if (gjxVar != null) {
                fkz0 b = ((NewsFeedComponent) lazy.getValue()).ib().b(gjxVar);
                b.m(new weq() { // from class: xsna.eu60
                    @Override // xsna.weq
                    public final boolean c(String str2, List list) {
                        vul vulVar;
                        if (!list.contains("vk") && !list.contains("lead_form") && !list.contains("vk_miniapp")) {
                            return false;
                        }
                        gd60 a3 = hu60.this.a();
                        wjz0 content = gjxVar.getContent();
                        a3.I0(context, (content == null || (vulVar = content.c) == null) ? null : (String) vulVar.c, str2, list, openMyTargetAds.d);
                        return true;
                    }
                });
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element element = aVar3.a;
                String str2 = aVar3.b;
                int i = a.$EnumSwitchMapping$0[element.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wix wixVar = aVar3.d;
                    if (wixVar != null) {
                        b.i(new View(context), wixVar, str2);
                    }
                } else {
                    if (!com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_CLICK_ZONE_FIX)) {
                        b.p(new View(context), str2);
                        return;
                    }
                    int i2 = aVar3.c;
                    if (gjxVar.b().f(i2)) {
                        b.r(i2, new View(context));
                    }
                }
            }
        } else {
            if (navigation instanceof NewsfeedExternalAction.Navigation.n) {
                ((NewsFeedComponent) lazy.getValue()).l0().R(context, ((NewsfeedExternalAction.Navigation.n) navigation).a);
                return;
            }
            if (navigation instanceof NewsfeedExternalAction.Navigation.l) {
                NewsfeedExternalAction.Navigation.l lVar = (NewsfeedExternalAction.Navigation.l) navigation;
                Html5Entry html5Entry = lVar.b;
                String str3 = html5Entry.x;
                String str4 = com.vk.newsfeed.common.util.k.a;
                if (str3 != null) {
                    b.d a3 = io.reactivex.rxjava3.processors.b.a("ads/click_header", "ad_data", str3);
                    xuo0.a.getClass();
                    a3.b(Long.valueOf(xuo0.c()), "at");
                    a3.h();
                }
                di60.w(html5Entry.v, lVar.a, null, null, null, null, 62);
                return;
            }
            boolean z3 = navigation instanceof NewsfeedExternalAction.Navigation.g;
            Lazy lazy3 = this.g;
            if (z3) {
                ((p960) lazy3.getValue()).c(context, null, null, null, null, null, null);
                return;
            }
            if (navigation instanceof NewsfeedExternalAction.Navigation.i) {
                ((DzenArticleComponent) this.f.getValue()).a().a(context, ((NewsfeedExternalAction.Navigation.i) navigation).b, "from_feed");
                return;
            }
            boolean z4 = navigation instanceof NewsfeedExternalAction.Navigation.u;
            bpn0 bpn0Var = this.t;
            if (z4) {
                NewsfeedExternalAction.Navigation.u uVar = (NewsfeedExternalAction.Navigation.u) navigation;
                Context context2 = uVar.a;
                zjt zjtVar = uVar.b;
                NewsEntry newsEntry2 = uVar.c;
                MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.EntryPoint entryPoint = uVar.f;
                EntryHeader d2 = na60.d(newsEntry2);
                if (d2 != null && (sourcePhoto = d2.b) != null && (d = sourcePhoto.d()) != null && context2 != null) {
                    if (e3m.h(context2) == null) {
                        p960.d((p960) lazy3.getValue(), context2, newsEntry2, uVar.d, uVar.e, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME, null, 96);
                        return;
                    }
                    MobileOfficialAppsCoreNavStat$EventScreen[] values = MobileOfficialAppsCoreNavStat$EventScreen.values();
                    int length = values.length;
                    while (true) {
                        if (r10 >= length) {
                            mobileOfficialAppsCoreNavStat$EventScreen = null;
                            break;
                        }
                        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = values[r10];
                        if (brm0.w(mobileOfficialAppsCoreNavStat$EventScreen2.name(), uVar.d, true)) {
                            mobileOfficialAppsCoreNavStat$EventScreen = mobileOfficialAppsCoreNavStat$EventScreen2;
                            break;
                        }
                        r10++;
                    }
                    ((StoryViewerComponent) this.d.getValue()).tb().l(zjtVar, new StoryOwner.Owner(d), MobileOfficialAppsConStoriesStat$ViewEntryPoint.POST_AVATAR, mobileOfficialAppsCoreNavStat$EventScreen, new l8h(this, context2, newsEntry2, uVar, 1));
                    p2r p2rVar = (p2r) bpn0Var.getValue();
                    if (newsEntry2 instanceof Post) {
                        valueOf = Long.valueOf(((Post) newsEntry2).n);
                    } else if (newsEntry2 instanceof PromoPost) {
                        valueOf = Long.valueOf(((PromoPost) newsEntry2).n.n);
                    } else if (newsEntry2 instanceof Photos) {
                        valueOf = Long.valueOf(((Photos) newsEntry2).m);
                    } else {
                        if (!(newsEntry2 instanceof Videos)) {
                            l2 = null;
                            Long valueOf2 = Long.valueOf(k9q0.o(newsEntry2).b);
                            str = newsEntry2.Cb().b;
                            if (str == null) {
                                str = "";
                            }
                            p2rVar.getClass();
                            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l2, valueOf2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick(entryPoint), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b2, uzp0Var.a).q();
                        }
                        VideoAttachment Nb = ((Videos) newsEntry2).Nb();
                        valueOf = Long.valueOf((Nb == null || (videoFile = Nb.k) == null) ? 0L : videoFile.o0());
                    }
                    l2 = valueOf;
                    Long valueOf22 = Long.valueOf(k9q0.o(newsEntry2).b);
                    str = newsEntry2.Cb().b;
                    if (str == null) {
                    }
                    p2rVar.getClass();
                    SchemeStat$TypeClick b22 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l2, valueOf22, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick(entryPoint), 2);
                    UiTracker uiTracker2 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var2 = UiTracker.h;
                    uzp0Var2.getClass();
                    new bjc(c2, b22, uzp0Var2.a).q();
                }
            } else {
                if (!(navigation instanceof NewsfeedExternalAction.Navigation.m)) {
                    if (navigation instanceof NewsfeedExternalAction.Navigation.k) {
                        NewsfeedExternalAction.Navigation.k kVar = (NewsfeedExternalAction.Navigation.k) navigation;
                        u1c0 u1c0Var = kVar.d;
                        NewsEntry newsEntry3 = kVar.b;
                        r10 = u1c0Var != null ? u1c0Var.k : 0;
                        String str5 = (newsEntry3 == null || (Cb = newsEntry3.Cb()) == null) ? null : Cb.b;
                        String Db = newsEntry3 != null ? newsEntry3.Db() : null;
                        String str6 = u1c0Var != null ? u1c0Var.l : null;
                        this.u.getClass();
                        p4r.e(r10, str5, Db, str6);
                        GeoAttachment geoAttachment = kVar.c;
                        if (geoAttachment.k > 0) {
                            ((NewsFeedComponent) lazy.getValue()).l0().J(geoAttachment.k, context);
                            return;
                        } else {
                            a().k1(context, geoAttachment);
                            return;
                        }
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.e) {
                        NewsfeedExternalAction.Navigation.e eVar = (NewsfeedExternalAction.Navigation.e) navigation;
                        ClipsRouter.j(g620.f().a(), context, new ClipGridParams.Data.Music(eVar.a, 0L, null, false, null, eVar.b, null, false, false, 476, null), false, null, null, 60);
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.f) {
                        Post post = ((NewsfeedExternalAction.Navigation.f) navigation).a;
                        NewsfeedCoowners newsfeedCoowners = post.f0;
                        int i3 = post.n;
                        if (newsfeedCoowners != null) {
                            p2r p2rVar2 = (p2r) bpn0Var.getValue();
                            NewsEntry.TrackData trackData = post.L;
                            Long valueOf3 = Long.valueOf(i3);
                            Long valueOf4 = Long.valueOf(post.m.b);
                            String str7 = trackData.b;
                            MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint entryPoint2 = MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_HEADER;
                            p2rVar2.getClass();
                            wxq.a(valueOf3, valueOf4, str7, entryPoint2);
                            Long valueOf5 = Long.valueOf(i3);
                            UserId e = rv60.e(post);
                            ((NewsfeedCoownersComponent) this.e.getValue()).a().a(context, new PostInfoData(valueOf5, e != null ? Long.valueOf(e.b) : null, trackData.b, null, null, null, 56, null), newsfeedCoowners);
                            return;
                        }
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.v) {
                        NewsfeedExternalAction.Navigation.v vVar = (NewsfeedExternalAction.Navigation.v) navigation;
                        Post post2 = vVar.a;
                        Owner owner = post2.o;
                        String str8 = vVar.b;
                        if (str8 == null) {
                            return;
                        }
                        com.vk.storycamera.builder.a aVar4 = new com.vk.storycamera.builder.a(str8, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.REPOST_TO_STORY_ACTIVITY);
                        StoryPostInfo storyPostInfo = new StoryPostInfo(post2);
                        Post post3 = storyPostInfo.b;
                        VideoFile videoFile2 = (post3 == null || (l = k9q0.l(post3)) == null) ? null : l.k;
                        if (videoFile2 != null) {
                            aVar4.r0 = videoFile2;
                        } else {
                            aVar4.z = storyPostInfo;
                        }
                        if (((Boolean) this.r.r.getValue()).booleanValue() && fkq0.b(owner.b) && ((DataRepositoryComponent) this.s.getValue()).D().g0(owner.b)) {
                            String str9 = owner.d;
                            if (str9 == null) {
                                str9 = owner.e;
                            }
                            aVar4.q(owner.b, owner.c, str9);
                        }
                        aVar4.C(context);
                        new Handler(Looper.getMainLooper()).postDelayed(new ja3(7, this, post2), 400L);
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.r) {
                        NewsfeedExternalAction.Navigation.r rVar = (NewsfeedExternalAction.Navigation.r) navigation;
                        PromoPost promoPost = rVar.b;
                        AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK_HEADER;
                        int i4 = rVar.e;
                        Lazy lazy4 = this.j;
                        ((AdsComponent) lazy4.getValue()).j6().b(new gu60(adsintEventTypeDto, promoPost, i4, 0));
                        ((AdsComponent) lazy4.getValue()).j6().b(new gu60(AdsintEventTypeDto.MRC_CLICK, promoPost, i4, 0));
                        p960.d((p960) lazy3.getValue(), rVar.a, rVar.b, rVar.c, rVar.d, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME, null, 96);
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.p) {
                        NewsfeedExternalAction.Navigation.p pVar = (NewsfeedExternalAction.Navigation.p) navigation;
                        u1c0 u1c0Var2 = pVar.a;
                        PollAttachment pollAttachment = pVar.b;
                        this.p.getClass();
                        final oqb0 oqb0Var = new oqb0(context, null, u1c0Var2, pollAttachment);
                        final oqb0.a aVar5 = oqb0Var.new a();
                        ComponentCallbacks2 h = e3m.h(context);
                        if (h instanceof ey50) {
                            ((ey50) h).Y().S(aVar5);
                        }
                        msb0.a aVar6 = new msb0.a(context, pollAttachment, u1c0Var2);
                        aVar6.Z(new DialogInterface.OnDismissListener() { // from class: xsna.nqb0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                oqb0 oqb0Var2 = oqb0.this;
                                ComponentCallbacks2 h2 = e3m.h(oqb0Var2.a);
                                if (h2 instanceof ey50) {
                                    ((ey50) h2).Y().H(aVar5);
                                }
                                oqb0Var2.b = null;
                            }
                        });
                        aVar6.I0(null);
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.h) {
                        NewsfeedExternalAction.Navigation.h hVar = (NewsfeedExternalAction.Navigation.h) navigation;
                        String str10 = hVar.c;
                        UiTracker uiTracker3 = UiTracker.a;
                        String b3 = DonutAnalytics.b(str10, UiTracker.d());
                        DonutAnalytics.d(hVar.a, UiTracker.c(), hVar.b);
                        maz.c(((LinksBridgeComponent) this.k.getValue()).p().e(), context, b3, LaunchContext.A, null, null, 24);
                        return;
                    }
                    if (navigation instanceof NewsfeedExternalAction.Navigation.s) {
                        NewsfeedRouter l0 = ((NewsfeedRouterComponent) this.l.getValue()).l0();
                        ((NewsfeedExternalAction.Navigation.s) navigation).getClass();
                        l0.d0(context, null);
                        return;
                    } else if (navigation instanceof NewsfeedExternalAction.Navigation.j) {
                        FavePage favePage = ((NewsfeedExternalAction.Navigation.j) navigation).a;
                        this.q.getClass();
                        urq.a(context, favePage);
                        return;
                    } else if (navigation instanceof NewsfeedExternalAction.Navigation.o) {
                        fy9.a(((CartComponent) this.m.getValue()).f8(), context, null, null, null, 14);
                        return;
                    } else {
                        if (!(navigation instanceof NewsfeedExternalAction.Navigation.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((ClassifiedsComponent) this.n.getValue()).dc().c(context, new cgc(null, null, false, null, null, 262143));
                        return;
                    }
                }
                final NewsfeedExternalAction.Navigation.m mVar = (NewsfeedExternalAction.Navigation.m) navigation;
                NewsEntry newsEntry4 = mVar.b;
                final UserId o = k9q0.o(newsEntry4);
                if (fkq0.b(o)) {
                    final Context context3 = mVar.a;
                    ((g7s0) this.o.getValue()).Y().q(context3, o, MobileOfficialAppsCoreNavStat$EventScreen.FEED, new izs() { // from class: xsna.fu60
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            if (((qs80) obj) instanceof qs80.a) {
                                gd60 a4 = hu60.this.a();
                                NewsfeedExternalAction.Navigation.m mVar2 = mVar;
                                a4.s0(context3, o, mVar2.c, mVar2.d);
                            }
                            return s3q0.a;
                        }
                    });
                    return;
                }
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.e, new Object[]{"Owner is not group. Can not open live by group. item = " + newsEntry4});
                }
            }
        }
    }
}
