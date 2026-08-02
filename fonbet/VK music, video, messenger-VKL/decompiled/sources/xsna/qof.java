package xsna;

import com.vk.clips.config.viewers.api.experiments.models.ClipsAutoScrollConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsBannerCompanionConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsFeedRecyclerPoolSettings;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketItemsShowTimeConfig;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;
import xsna.b6e;
import xsna.f0f;
import xsna.f8e;
import xsna.gaf;
import xsna.h4f;
import xsna.haf;
import xsna.iaf;
import xsna.lgd;
import xsna.lle;
import xsna.maf;
import xsna.mle;
import xsna.oje;
import xsna.tke;
import xsna.wme;
import xsna.xof;
import xsna.y6e;

/* compiled from: ClipsViewerExperimentsFullscreen.kt */
/* loaded from: classes.dex */
public final class qof {
    public static final /* synthetic */ qcy<Object>[] S;
    public final g A;
    public final h B;
    public final e18 C;
    public final e18 D;
    public final e18 E;
    public final e18 F;
    public final e18 G;
    public final e18 H;
    public final e18 I;
    public final e18 J;
    public final e18 K;
    public final i L;
    public final j M;
    public final e18 N;
    public final l O;
    public final e18 P;
    public final m Q;
    public final n R;
    public final e18 a;
    public final e18 b;
    public final k c;
    public final o d;
    public final p e;
    public final q f;
    public final e18 g;
    public final r h;
    public final s i;
    public final e18 j;
    public final e18 k;
    public final t l;
    public final u m;
    public final e18 n;
    public final e18 o;
    public final e18 p;
    public final v q;
    public final e18 r;
    public final e18 s;
    public final a t;
    public final b u;
    public final e18 v;
    public final c w;
    public final d x;
    public final e y;
    public final f z;

    /* compiled from: FeatureFactory.kt */
    public static final class a extends enk<ClipsBannerCompanionConfig> {
        @Override // xsna.enk
        public final ClipsBannerCompanionConfig b(b.a aVar) {
            ClipsBannerCompanionConfig clipsBannerCompanionConfig = ClipsBannerCompanionConfig.d;
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return ClipsBannerCompanionConfig.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class b extends enk<ClipsBannerCompanionConfig> {
        @Override // xsna.enk
        public final ClipsBannerCompanionConfig b(b.a aVar) {
            ClipsBannerCompanionConfig clipsBannerCompanionConfig = ClipsBannerCompanionConfig.d;
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return ClipsBannerCompanionConfig.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class c extends enk<xof> {
        @Override // xsna.enk
        public final xof b(b.a aVar) {
            return xof.a.a(aVar != null ? puq.a(aVar) : null);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class d extends enk<maf> {
        @Override // xsna.enk
        public final maf b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return maf.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class e extends enk<lle> {
        @Override // xsna.enk
        public final lle b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? lle.c : lle.a.a(a, puq.c(aVar, 3));
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class f extends enk<mle> {
        @Override // xsna.enk
        public final mle b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? mle.e : mle.a.a(a, puq.c(aVar, 3));
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class g extends enk<wme> {
        @Override // xsna.enk
        public final wme b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? wme.c : wme.a.a(a, puq.c(aVar, 3));
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class h extends enk<f0f> {
        @Override // xsna.enk
        public final f0f b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return f0f.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class i extends enk<haf> {
        @Override // xsna.enk
        public final haf b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return haf.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class j extends enk<iaf> {
        @Override // xsna.enk
        public final iaf b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return iaf.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class k extends enk<lgd> {
        @Override // xsna.enk
        public final lgd b(b.a aVar) {
            JSONObject a;
            if (aVar != null) {
                if (!puq.c(aVar, 3)) {
                    aVar = null;
                }
                if (aVar != null && (a = puq.a(aVar)) != null) {
                    return lgd.a.a(a);
                }
            }
            return lgd.e;
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class l extends enk<gaf> {
        @Override // xsna.enk
        public final gaf b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return gaf.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class m extends enk<ClipsAutoScrollConfig> {
        @Override // xsna.enk
        public final ClipsAutoScrollConfig b(b.a aVar) {
            ClipsAutoScrollConfig.ResetPeriod resetPeriod = ClipsAutoScrollConfig.g;
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return ClipsAutoScrollConfig.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class n extends enk<ClipsMarketAdHeaderClickConfig> {
        @Override // xsna.enk
        public final ClipsMarketAdHeaderClickConfig b(b.a aVar) {
            ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig = ClipsMarketAdHeaderClickConfig.c;
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return ClipsMarketAdHeaderClickConfig.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class o extends enk<tke> {
        @Override // xsna.enk
        public final tke b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? tke.d : tke.a.a(a);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class p extends enk<b6e> {
        @Override // xsna.enk
        public final b6e b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? b6e.c : b6e.a.a(a);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class q extends enk<y6e> {
        @Override // xsna.enk
        public final y6e b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? y6e.c : y6e.a.a(a);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class r extends enk<oje> {
        @Override // xsna.enk
        public final oje b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? oje.b : oje.a.a(a);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class s extends enk<ClipsFeedRecyclerPoolSettings> {
        @Override // xsna.enk
        public final ClipsFeedRecyclerPoolSettings b(b.a aVar) {
            JSONObject a;
            if (aVar == null || (a = puq.a(aVar)) == null) {
                ClipsFeedRecyclerPoolSettings.InflateMode inflateMode = ClipsFeedRecyclerPoolSettings.b;
                return ClipsFeedRecyclerPoolSettings.a.a();
            }
            ClipsFeedRecyclerPoolSettings.InflateMode inflateMode2 = ClipsFeedRecyclerPoolSettings.b;
            return ClipsFeedRecyclerPoolSettings.a.b(a);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class t extends enk<ClipsMarketItemsShowTimeConfig> {
        @Override // xsna.enk
        public final ClipsMarketItemsShowTimeConfig b(b.a aVar) {
            ClipsMarketItemsShowTimeConfig.VisibilityMode visibilityMode = ClipsMarketItemsShowTimeConfig.d;
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return ClipsMarketItemsShowTimeConfig.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class u extends enk<f8e> {
        @Override // xsna.enk
        public final f8e b(b.a aVar) {
            boolean z = false;
            if (aVar != null && puq.c(aVar, 3)) {
                z = true;
            }
            return f8e.a.a(aVar != null ? puq.a(aVar) : null, z);
        }
    }

    /* compiled from: FeatureFactory.kt */
    public static final class v extends enk<h4f> {
        @Override // xsna.enk
        public final h4f b(b.a aVar) {
            JSONObject a;
            return (aVar == null || (a = puq.a(aVar)) == null) ? h4f.c : h4f.a.a(a, puq.c(aVar, 3));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(qof.class, "isClipsBugreportAvailable", "isClipsBugreportAvailable()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        S = new qcy[]{propertyReference1Impl, fp.c(0, qof.class, "clipsLivesTab", "getClipsLivesTab()Z", hpf0Var), ep.a(0, qof.class, "clipsArgumentsPrefetch", "getClipsArgumentsPrefetch()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsArgumentsPrefetchSettings;", hpf0Var), ep.a(0, qof.class, "clipsLivesChatConfig", "getClipsLivesChatConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsLivesChatConfig;", hpf0Var), ep.a(0, qof.class, "clipsFeedChunksSettings", "getClipsFeedChunksSettings()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsFeedChunksSettings;", hpf0Var), ep.a(0, qof.class, "clipsFeedInitialChunkSettings", "getClipsFeedInitialChunkSettings()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsFeedInitialChunkSettings;", hpf0Var), ep.a(0, qof.class, "hideCounters", "getHideCounters()Z", hpf0Var), ep.a(0, qof.class, "linkRefresherTokens", "getLinkRefresherTokens()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsLinkRefresherTokens;", hpf0Var), ep.a(0, qof.class, "clipsFeedRecyclerPoolSettings", "getClipsFeedRecyclerPoolSettings()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsFeedRecyclerPoolSettings;", hpf0Var), ep.a(0, qof.class, "clipsFriendsActivities", "getClipsFriendsActivities()Z", hpf0Var), ep.a(0, qof.class, "clipsFriendsComments", "getClipsFriendsComments()Z", hpf0Var), ep.a(0, qof.class, "isCommunityMainTabEnabled", "isCommunityMainTabEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsMarketItemsShowTimeConfig", "getClipsMarketItemsShowTimeConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsMarketItemsShowTimeConfig;", hpf0Var), ep.a(0, qof.class, "nativeTransitionConfig", "getNativeTransitionConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsFeedNativeTransitionConfig;", hpf0Var), ep.a(0, qof.class, "nativeTransitionDisableLowPerf", "getNativeTransitionDisableLowPerf()Z", hpf0Var), ep.a(0, qof.class, "immediateActionHandler", "getImmediateActionHandler()Z", hpf0Var), ep.a(0, qof.class, "isMarketAdsEnabled", "isMarketAdsEnabled()Z", hpf0Var), ep.a(0, qof.class, "shopsGridBlockConfig", "getShopsGridBlockConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsShopsGridBlockConfig;", hpf0Var), ep.a(0, qof.class, "clipsGetRecom", "getClipsGetRecom()Z", hpf0Var), ep.a(0, qof.class, "clipsFeedEngineEnabled", "getClipsFeedEngineEnabled()Z", hpf0Var), ep.a(0, qof.class, "bannerCompanionConfig", "getBannerCompanionConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsBannerCompanionConfig;", hpf0Var), ep.a(0, qof.class, "bannerCompanionForSellersConfig", "getBannerCompanionForSellersConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsBannerCompanionConfig;", hpf0Var), ep.a(0, qof.class, "clipsMarketAdChoices", "getClipsMarketAdChoices()Z", hpf0Var), ep.a(0, qof.class, "viewerTopBarButtonsConfig", "getViewerTopBarButtonsConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsViewerTopBarButtonsConfig;", hpf0Var), ep.a(0, qof.class, "clipsTrendEngagementGrowthConfig", "getClipsTrendEngagementGrowthConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsTrendEngagementGrowthConfig;", hpf0Var), ep.a(0, qof.class, "clipsMoreShopsButtonConfig", "getClipsMoreShopsButtonConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsMoreShopsConfig;", hpf0Var), ep.a(0, qof.class, "clipsMoreShopsPreloadConfig", "getClipsMoreShopsPreloadConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsMoreShopsPreloadConfig;", hpf0Var), ep.a(0, qof.class, "clipsNewsMonothemeConfig", "getClipsNewsMonothemeConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsNewsMonothemeConfig;", hpf0Var), ep.a(0, qof.class, "clipsRecomEventsConfig", "getClipsRecomEventsConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsRecomEventsConfig;", hpf0Var), ep.a(0, qof.class, "isOpenLiveByAvatarClick", "isOpenLiveByAvatarClick()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkVideoEnabled", "getClipsAdsSdkVideoEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkStaticEnabled", "getClipsAdsSdkStaticEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkCarouselEnabled", "getClipsAdsSdkCarouselEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkPromoEnabled", "getClipsAdsSdkPromoEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkVideoOwnerEnabled", "getClipsAdsSdkVideoOwnerEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAdsSdkLabelToggleEnabled", "getClipsAdsSdkLabelToggleEnabled()Z", hpf0Var), ep.a(0, qof.class, "isLoadNewAdAfterRewatchEnabled", "isLoadNewAdAfterRewatchEnabled()Z", hpf0Var), ep.a(0, qof.class, "isHideFabInAdsEnabled", "isHideFabInAdsEnabled()Z", hpf0Var), ep.a(0, qof.class, "videoClipsTopbarTabsConfig", "getVideoClipsTopbarTabsConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsTopbarTabsConfig;", hpf0Var), ep.a(0, qof.class, "videoClipsTopbarTabsScrollConfig", "getVideoClipsTopbarTabsScrollConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsTopbarTabsScrollConfig;", hpf0Var), ep.a(0, qof.class, "videoClipsTopbarTabsConfigEnabled", "getVideoClipsTopbarTabsConfigEnabled()Z", hpf0Var), ep.a(0, qof.class, "videoClipsTopbarTabsBlocksConfig", "getVideoClipsTopbarTabsBlocksConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsTopbarTabsBlocksConfig;", hpf0Var), ep.a(0, qof.class, "clipsTopbarShopsTabOnboardingEnabled", "getClipsTopbarShopsTabOnboardingEnabled()Z", hpf0Var), ep.a(0, qof.class, "clipsAutoScrollConfig", "getClipsAutoScrollConfig()Lcom/vk/clips/config/viewers/api/experiments/models/ClipsAutoScrollConfig;", hpf0Var), ep.a(0, qof.class, "clipsMarketAdHeaderClickConfig", "getClipsMarketAdHeaderClickConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/ClipsMarketAdHeaderClickConfig;", hpf0Var)};
    }

    public qof(kuq kuqVar) {
        this.a = kuqVar.a(ClipsFeatures.VIDEO_BUGREPORT);
        this.b = kuqVar.a(Features.Type.FEATURE_CLIPS_LIVES_TAB);
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_ARGUMENTS_PREFETCH;
        izs<b.a, b.a> izsVar = kuqVar.c;
        gpf gpfVar = kuqVar.a;
        epf epfVar = kuqVar.b;
        this.c = new k(clipsFeatures, izsVar, gpfVar, false, epfVar);
        this.d = new o(Features.Type.FEATURE_CLIPS_LIVES_CHAT, kuqVar.c, gpfVar, false, epfVar);
        this.e = new p(ClipsFeatures.FEED_CHUNKS_SETTINGS, kuqVar.c, gpfVar, false, epfVar);
        this.f = new q(ClipsFeatures.FEED_CHUNKS_INIT_SIZE, kuqVar.c, gpfVar, false, epfVar);
        this.g = kuqVar.a(ClipsFeatures.CLIPS_HIDE_COUNTERS);
        this.h = new r(Features.Type.FEATURE_CLIPS_LINK_REFRESHER, kuqVar.c, gpfVar, false, epfVar);
        this.i = new s(ClipsFeatures.NON_BLOCKING_PREFETCH, kuqVar.c, gpfVar, false, epfVar);
        this.j = kuqVar.a(ClipsFeatures.CLIPS_FRIENDS_ACTIVITIES);
        this.k = kuqVar.a(ClipsFeatures.CLIPS_FRIENDS_COMMENTS);
        kuqVar.a(ComFeatures.COM_MAIN_TAB);
        this.l = new t(ClipsFeatures.CLIPS_PRODUCT_ITEMS_SHOW_TIME, kuqVar.c, gpfVar, false, epfVar);
        this.m = new u(ClipsFeatures.FEED_NATIVE_TRANSITION, kuqVar.c, gpfVar, false, epfVar);
        this.n = kuqVar.a(ClipsFeatures.FEED_NATIVE_TRANSITION_LOW_PERF);
        this.o = kuqVar.a(ClipsFeatures.IMMEDIATE_ACTION_HANDLER);
        this.p = kuqVar.a(ClipsFeatures.CLIPS_MARKET_AD);
        this.q = new v(SoccomFeatures.CLIPS_SHOPS_GRID, kuqVar.c, gpfVar, false, epfVar);
        this.r = kuqVar.a(ClipsFeatures.CLIPS_GET_RECOM);
        this.s = kuqVar.a(ClipsFeatures.CLIPS_FEED_ENGINE);
        this.t = new a(ClipsFeatures.CLIPS_AD_BANNER_COMPANION, kuqVar.c, gpfVar, false, epfVar);
        this.u = new b(ClipsFeatures.CLIPS_AD_BANNER_COMPANION_FOR_SELLERS, kuqVar.c, gpfVar, false, epfVar);
        this.v = kuqVar.a(ClipsFeatures.CLIPS_MARKET_AD_CHOICES);
        this.w = new c(ClipsFeatures.CLIPS_HEADER_DISABLE_PLUS, kuqVar.c, gpfVar, false, epfVar);
        this.x = new d(ClipsFeatures.CLIPS_TREND_ENGAGEMENT_GROWTH, kuqVar.c, gpfVar, false, epfVar);
        this.y = new e(SoccomFeatures.CLIPS_SHOPS_MORE_BUTTON, kuqVar.c, gpfVar, false, epfVar);
        this.z = new f(SoccomFeatures.CLIPS_SHOPS_MORE_PRELOAD, kuqVar.c, gpfVar, false, epfVar);
        this.A = new g(ClipsFeatures.CLIPS_NEWS_MONOTHEME, kuqVar.c, gpfVar, false, epfVar);
        this.B = new h(ClipsFeatures.CLIPS_RECOM_EVENTS, kuqVar.c, gpfVar, false, epfVar);
        this.C = kuqVar.a(VideoFeatures.VIDEO_OPEN_LIVE_AVATAR_CLCK);
        this.D = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_VIDEO);
        this.E = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_STATIC_AD);
        this.F = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_CAROUSEL);
        this.G = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_PROMO);
        this.H = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_VIDEO_OWNER);
        this.I = kuqVar.a(ClipsFeatures.CLIPS_ADS_SDK_LABEL);
        this.J = kuqVar.a(ClipsFeatures.FEED_END_REWATCH_NEW_AD);
        this.K = kuqVar.a(ClipsFeatures.HIDE_FAB_IN_ADS);
        this.L = new i(ClipsFeatures.CLIPS_TOPBAR_TABS, kuqVar.c, gpfVar, false, epfVar);
        this.M = new j(ClipsFeatures.CLIPS_TOPBAR_TABS_SCROLL, kuqVar.c, gpfVar, false, epfVar);
        this.N = kuqVar.a(ClipsFeatures.CLIPS_TOPBAR_TABS_CONFIG);
        this.O = new l(ClipsFeatures.CLIPS_TOPBAR_TABS_BLOCKS, kuqVar.c, gpfVar, false, epfVar);
        this.P = kuqVar.a(ClipsFeatures.CLIPS_TOPBAR_SHOPS_TAB_ONBOARDING);
        this.Q = new m(ClipsFeatures.CLIPS_AUTO_SCROLL, kuqVar.c, gpfVar, false, epfVar);
        this.R = new n(ClipsFeatures.CLIPS_MARKET_AD_HEADER_CLICKS, kuqVar.c, gpfVar, false, epfVar);
    }
}
