package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.ActionLinkSnippetIcon;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.clip.overlay.api.TooltipType;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsButtonToVideoConfig;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.adapters.GeoPlaceWrapper;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.clips.viewer.impl.feed.view.subs.selector.b;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.clipproductattaches.models.GoodBadge;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.StatsArguments;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import xsna.bgj0;
import xsna.dw20;
import xsna.dz80;
import xsna.e3d;
import xsna.fdg0;
import xsna.g5p0;
import xsna.g8d;
import xsna.gm50;
import xsna.gxp0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.ile;
import xsna.j0d;
import xsna.l0d;
import xsna.m5s0;
import xsna.mk50;
import xsna.o0r0;
import xsna.o8e;
import xsna.p16;
import xsna.qzb0;
import xsna.r2d;
import xsna.rxp;
import xsna.s1d;
import xsna.smc;
import xsna.t0d;
import xsna.t1d;
import xsna.u4f;
import xsna.vrv0;
import xsna.wkh0;
import xsna.x0d;
import xsna.x0d.a;
import xsna.x1d;
import xsna.x6d;
import xsna.xn50;
import xsna.xp50;
import xsna.z9z;

/* compiled from: ClipItemMviView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class o1d extends MviLazyViewContainer<com.vk.clips.sdk.shared.item.clip.a, y6d, ClipItemAction> implements w8i {
    public final boolean A;
    public final k0d A0;
    public final yjc B;
    public final k930 B0;
    public final lxc C;
    public final q6q0 C0;
    public final nxc D;
    public final Object D0;
    public final com.vk.movika.sdk.base.observable.p E;
    public final Object E0;
    public final h5 F;
    public final Object F0;
    public final s16 G;
    public final Object G0;
    public final p16 H;
    public final ycg0 H0;
    public final p8e I;
    public final v7k0 I0;
    public final nkh0 J;
    public final gym0 J0;
    public final q0s0 K;
    public final dz80 K0;
    public final xlq0 L;
    public final j1n0 L0;
    public final m900<String, List<SdkClipVideoFile>> M;
    public final uws M0;
    public final wie N;
    public final Object N0;
    public final qnd O;
    public final Object O0;
    public final v5e P;
    public final Object P0;
    public final kaf Q;
    public final Object Q0;
    public final gzs<Integer> R;
    public final Object R0;
    public List<? extends View> S;
    public List<? extends View> T;
    public List<? extends View> U;
    public final Object V;
    public boolean W;
    public wp50 a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final r0d g;
    public final Object g0;
    public final pih0 h;
    public final Object h0;
    public final z0q i;
    public final Object i0;
    public final ClipsScreenPerformanceReporter j;
    public final Object j0;
    public final h3d k;
    public final Object k0;
    public final lyc l;
    public final Object l0;
    public final int m;
    public final Object m0;
    public final ClipsViewersSdkComponentImpl n;
    public final Object n0;
    public final njd o;
    public final Object o0;
    public final gxp0 p;
    public final Object p0;
    public final yux q;
    public final Object q0;
    public final e5 r;
    public boolean r0;
    public final r1d s;
    public g5p0 s0;
    public final mh5 t;
    public l0d t0;
    public final BridgeComponent u;
    public final ArrayList u0;
    public final zof v;
    public final Object v0;
    public final xod w;
    public final i3i0 w0;
    public final RecyclerView.u x;
    public final j1d x0;
    public final sz00 y;
    public final f3d y0;
    public final ntd0 z;
    public final k1d z0;

    /* compiled from: ClipItemMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipFeedTab.SingleClipFromBlock.SourceBlockType.values().length];
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.SHOPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipFeedTab.ClipsFromShopsSource.SourceType.values().length];
            try {
                iArr2[ClipFeedTab.ClipsFromShopsSource.SourceType.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipFeedTab.ClipsFromShopsSource.SourceType.SHOPS_MORE_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipFeedTab.ClipsFromShopsSource.SourceType.SHOPS_GRID_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipFeedTab.ClipsFromShopsSource.SourceType.TAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.k1d] */
    public o1d(Context context, r0d r0dVar, pih0 pih0Var, z0q z0qVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, h3d h3dVar, lyc lycVar, int i, ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl, njd njdVar, kxc kxcVar, gxp0 gxp0Var, yux yuxVar, e5 e5Var, q1d q1dVar, r1d r1dVar, BridgeComponent bridgeComponent, zof zofVar, xod xodVar, RecyclerView.u uVar, sz00 sz00Var, ntd0 ntd0Var, pb pbVar, boolean z, yjc yjcVar, lxc lxcVar, nxc nxcVar, com.vk.movika.sdk.base.observable.p pVar, h5 h5Var, s16 s16Var, p16 p16Var, enf enfVar, ptc0 ptc0Var, p8e p8eVar, nkh0 nkh0Var, q0s0 q0s0Var, xlq0 xlq0Var, m900 m900Var, wie wieVar, qnd qndVar, v5e v5eVar, gzs gzsVar) {
        super(context);
        this.g = r0dVar;
        this.h = pih0Var;
        this.i = z0qVar;
        this.j = clipsScreenPerformanceReporter;
        this.k = h3dVar;
        this.l = lycVar;
        this.m = i;
        this.n = clipsViewersSdkComponentImpl;
        this.o = njdVar;
        this.p = gxp0Var;
        this.q = yuxVar;
        this.r = e5Var;
        this.s = r1dVar;
        this.t = mh5.a;
        this.u = bridgeComponent;
        this.v = zofVar;
        this.w = xodVar;
        this.x = uVar;
        this.y = sz00Var;
        this.z = ntd0Var;
        this.A = z;
        this.B = yjcVar;
        this.C = lxcVar;
        this.D = nxcVar;
        this.E = pVar;
        this.F = h5Var;
        this.G = s16Var;
        this.H = p16Var;
        this.I = p8eVar;
        this.J = nkh0Var;
        this.K = q0s0Var;
        this.L = xlq0Var;
        this.M = m900Var;
        this.N = wieVar;
        this.O = qndVar;
        this.P = v5eVar;
        this.Q = kaf.a;
        this.R = gzsVar;
        EmptyList emptyList = EmptyList.b;
        this.S = emptyList;
        this.T = emptyList;
        this.U = emptyList;
        com.vk.movika.sdk.base.model.e eVar = new com.vk.movika.sdk.base.model.e(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.V = msy.a(lazyThreadSafetyMode, eVar);
        this.b0 = msy.a(lazyThreadSafetyMode, new cb(this, 15));
        this.c0 = msy.a(lazyThreadSafetyMode, new m4(this, 17));
        this.d0 = msy.a(lazyThreadSafetyMode, new in0(this, 19));
        this.e0 = msy.a(lazyThreadSafetyMode, new z4(this, 22));
        this.f0 = msy.a(lazyThreadSafetyMode, new defpackage.e(this, 18));
        this.g0 = msy.a(lazyThreadSafetyMode, new defpackage.f(this, 12));
        this.h0 = msy.a(lazyThreadSafetyMode, new defpackage.g(this, 21));
        this.i0 = msy.a(lazyThreadSafetyMode, new defpackage.h(this, 15));
        int i2 = 19;
        this.j0 = msy.a(lazyThreadSafetyMode, new defpackage.i(this, i2));
        this.k0 = msy.a(lazyThreadSafetyMode, new yg(this, i2));
        this.l0 = msy.a(lazyThreadSafetyMode, new mh(this, 21));
        this.m0 = msy.a(lazyThreadSafetyMode, new g5(this, 14));
        this.n0 = msy.a(lazyThreadSafetyMode, new grb(this, q1dVar, ptc0Var, 1));
        this.o0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.i(8, this, context));
        this.p0 = msy.a(lazyThreadSafetyMode, new px0(this, 16));
        this.q0 = msy.a(lazyThreadSafetyMode, new d2(6));
        this.r0 = !z;
        this.u0 = new ArrayList();
        this.v0 = msy.a(lazyThreadSafetyMode, new qg1(5, this, pbVar));
        i3i0 i3i0Var = new i3i0(kxcVar, new wl0(this, 16));
        this.w0 = i3i0Var;
        j1d j1dVar = new j1d(this, context);
        this.x0 = j1dVar;
        this.y0 = new f3d(lycVar.a, zofVar, j1dVar, i3i0Var.c, enfVar, z0qVar);
        this.z0 = new gxp0.a() { // from class: xsna.k1d
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                o1d.this.x0.a(new ClipItemViewEvent.j(ixp0Var));
            }
        };
        this.A0 = new k0d(j1dVar, r0dVar.a(), zofVar.c(), new eb(this, 15));
        ClipFeedTab clipFeedTab = lycVar.a;
        this.B0 = new k930(new g8d(new g8d.a.C2925a(clipFeedTab), lycVar.b, new p1d(this), pih0Var), getClipsInterestsComponent(), new e4(this, 12), 4);
        this.C0 = new q6q0(context, new com.vk.im.ui.fragments.b(this, 25));
        this.D0 = msy.a(lazyThreadSafetyMode, new g4(8, context, this));
        this.E0 = msy.a(lazyThreadSafetyMode, new eu1(this, 17));
        this.F0 = msy.a(lazyThreadSafetyMode, new q(this, 16));
        this.G0 = msy.a(lazyThreadSafetyMode, new r(8));
        this.H0 = new ycg0(new gdg0() { // from class: xsna.l1d
            @Override // xsna.gdg0
            public final void a(fdg0 fdg0Var) {
                j1d j1dVar2 = o1d.this.x0;
                if (!(fdg0Var instanceof fdg0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                j1dVar2.a(ClipItemViewEvent.n.b);
            }
        });
        nu0 nu0Var = new nu0(this, 9);
        this.I0 = new v7k0(pbVar, nu0Var, h3dVar, zofVar);
        o0r0 usersBridge = getUsersBridge();
        ClipFeedTab.Discover.b.getClass();
        this.J0 = new gym0(new jym0(new dym0(usersBridge, ClipFeedTab.Eb(clipFeedTab)), nu0Var));
        this.K0 = new dz80();
        this.L0 = new j1n0();
        this.M0 = new uws();
        this.N0 = msy.a(lazyThreadSafetyMode, new pu(this, 22));
        this.O0 = msy.a(lazyThreadSafetyMode, new hh1(this, 12));
        this.P0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.container.e(6, this, context));
        this.Q0 = msy.a(lazyThreadSafetyMode, new k75(1, this, context));
        this.R0 = msy.a(lazyThreadSafetyMode, new ji0(this, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m5f A(o1d o1dVar) {
        nwy nwyVar = o1dVar.getClipsViewerComponentInternal().M;
        qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[25];
        n5f n5fVar = (n5f) nwyVar.c();
        j1n0 j1n0Var = o1dVar.L0;
        lyc lycVar = o1dVar.l;
        j1n0Var.getClass();
        return new m5f(n5fVar.a, new vt5(j1n0Var), new qs9(lycVar));
    }

    public static ClipsViewerComponentImpl B(o1d o1dVar) {
        return (ClipsViewerComponentImpl) o1dVar.getClipsViewerComponent();
    }

    public static q0d C(o1d o1dVar, Context context) {
        return new q0d(o1dVar.o, o1dVar.getSdkAttachmentsUserLinksRenderer(), o1dVar.l.a, o1dVar.getClipsViewerComponent().Y(), o1dVar.v, new lf00(new vr0(9), e3m.a(R.dimen.clip_owner_avatar_height, context)), o1dVar.O);
    }

    public static x6d D(o1d o1dVar) {
        return new x6d(o1dVar, o1dVar.m, o1dVar.x, o1dVar.v, (!o1dVar.A || o1dVar.r0) ? R.id.fullscreen_clip_container : R.id.fullscreen_clip_controls_container, o1dVar.getProductAttachesHolder(), o1dVar.getViewOwner(), new x6d.a(o1dVar.x0, o1dVar.h, o1dVar.k, o1dVar.I, o1dVar.A0, o1dVar.g.a()));
    }

    public static j5s0 E(o1d o1dVar) {
        return new j5s0(o1dVar.getVideoBaseViewsContainer(), o1dVar.w0);
    }

    public static s2d F(o1d o1dVar, pb pbVar) {
        return new s2d(o1dVar.x0, o1dVar.getVideoBaseViewsContainer(), pbVar);
    }

    public static e2d G(o1d o1dVar, Lazy lazy) {
        return new e2d(lazy, o1dVar.x0, o1dVar.getSdkComponent().Df(), o1dVar.w0, o1dVar.getSdkComponent().o(), o1dVar.q, o1dVar.Q, o1dVar.A, o1dVar.v.b(), o1dVar.getVideoBaseViewsContainer().e());
    }

    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [T, com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet, xsna.kq6] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    public static s3q0 H(o1d o1dVar, t1d t1dVar) {
        ClipVideoFile z;
        ActionLink actionLink;
        d3b0 v0;
        ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting clipsAutoSubsSetting;
        FragmentManager supportFragmentManager;
        h3d h3dVar = o1dVar.k;
        k930 k930Var = o1dVar.B0;
        if (t1dVar instanceof t1d.j) {
            SdkClipVideoFile sdkClipVideoFile = ((t1d.j) t1dVar).a;
            Activity c = g2u0.c(o1dVar);
            if (c != null) {
                FragmentActivity fragmentActivity = c instanceof FragmentActivity ? (FragmentActivity) c : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                    o1dVar.getFavoritesLauncher().a(new ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo(dhr0.a.c(o1dVar.getContext()), o1dVar.getAuthBridge().c(), k15.z(sdkClipVideoFile)), supportFragmentManager);
                }
            }
        } else if (t1dVar instanceof t1d.n) {
            SdkClipVideoFile sdkClipVideoFile2 = ((t1d.n) t1dVar).a;
            Activity c2 = g2u0.c(o1dVar);
            if (c2 != null) {
                k930Var.b(sdkClipVideoFile2, c2);
            }
        } else {
            int i = 16;
            if (t1dVar instanceof t1d.c) {
                t1d.c cVar = (t1d.c) t1dVar;
                SdkClipVideoFile sdkClipVideoFile3 = cVar.a;
                kih0 kih0Var = cVar.b;
                y0r y0rVar = cVar.c;
                Activity c3 = g2u0.c(o1dVar);
                if (c3 != null) {
                    ile ileVar = new ile(fzc.b(o1dVar.l.a));
                    com.vk.clips.viewer.impl.feed.view.subs.selector.b bVar = new com.vk.clips.viewer.impl.feed.view.subs.selector.b(c3);
                    m1d m1dVar = new m1d(ileVar, sdkClipVideoFile3, o1dVar, y0rVar, kih0Var, 0);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    int i2 = b.a.$EnumSwitchMapping$0[((l5f) bVar.b.getValue()).a().ordinal()];
                    if (i2 == 1) {
                        clipsAutoSubsSetting = ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.DISABLED;
                    } else if (i2 == 2) {
                        clipsAutoSubsSetting = ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.ENABLED;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        clipsAutoSubsSetting = ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.MUTE_ONLY;
                    }
                    ?? clipsAutoSubtitlesBottomSheet = new ClipsAutoSubtitlesBottomSheet(c3, clipsAutoSubsSetting, new an6(bVar, m1dVar), rdi.p(c3, new ac(ref$ObjectRef, i)));
                    clipsAutoSubtitlesBottomSheet.c();
                    ref$ObjectRef.element = clipsAutoSubtitlesBottomSheet;
                }
            } else if (t1dVar instanceof t1d.e0) {
                SdkClipVideoFile sdkClipVideoFile4 = ((t1d.e0) t1dVar).a;
                Activity c4 = g2u0.c(o1dVar);
                if (c4 != null) {
                    k930Var.c(sdkClipVideoFile4, c4);
                }
            } else if (t1dVar instanceof t1d.g0) {
                kih0 kih0Var2 = ((t1d.g0) t1dVar).a;
                Activity c5 = g2u0.c(o1dVar);
                FragmentActivity fragmentActivity2 = c5 instanceof FragmentActivity ? (FragmentActivity) c5 : null;
                if (fragmentActivity2 != null && (v0 = d370.R(kih0Var2).v0()) != null) {
                    kz20 kz20Var = (kz20) k930Var.d.getValue();
                    sr10 sr10Var = dy2.a;
                    vlt0 vlt0Var = new vlt0(fragmentActivity2, v0, kz20Var.i, kz20Var.e, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE));
                    kz20Var.a = new WeakReference<>(vlt0Var);
                    vlt0Var.c();
                }
            } else if (t1dVar instanceof t1d.h0) {
                izs<SdkClipVideoFile, s3q0> izsVar = ((t1d.h0) t1dVar).a;
                if (g2u0.c(o1dVar) != null) {
                    o1dVar.C0.a(izsVar);
                }
            } else {
                int i3 = 0;
                if (t1dVar instanceof t1d.r) {
                    SdkClipVideoFile sdkClipVideoFile5 = ((t1d.r) t1dVar).a;
                    UserId b = dgd.b(sdkClipVideoFile5);
                    if (b != null) {
                        o1dVar.h.o2(new SdkClipViewerClick.b(sdkClipVideoFile5, false));
                        ((a1r) o1dVar.g.b.getValue()).d(o1dVar.getContext(), b, true);
                    }
                } else if (t1dVar instanceof t1d.a) {
                    h3dVar.Z4(((t1d.a) t1dVar).a);
                } else if (t1dVar instanceof t1d.v) {
                    o1dVar.getUsersBridge().m(o1dVar.getContext(), ((t1d.v) t1dVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, true, false, null, null, null, 64511));
                } else if (t1dVar instanceof t1d.u) {
                    o1dVar.getUsersBridge().m(o1dVar.getContext(), ((t1d.u) t1dVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (t1dVar instanceof t1d.h) {
                    SdkClipVideoFile sdkClipVideoFile6 = ((t1d.h) t1dVar).a;
                    tyf coauthorsHelper = o1dVar.getCoauthorsHelper();
                    coauthorsHelper.c.e().d(o1dVar.getContext(), k15.z(sdkClipVideoFile6), true, coauthorsHelper.f);
                } else if (t1dVar instanceof t1d.l) {
                    ClipsRouter.j(o1dVar.getClipsBridge().a(), o1dVar.getContext(), new ClipGridParams.OnlyId.Hashtag(((t1d.l) t1dVar).a), false, null, null, 60);
                } else if (t1dVar instanceof t1d.t) {
                    o1dVar.y.e(o1dVar.getContext(), new rz00(com.vk.clips.viewer.impl.adapters.b.a(null), CommonMarketStat$TypeRefSource.CLIPS_SNIPPET, null, null, null, null, null, null, null, null, null, null, CommonMarketStat$TypeMarketContextContent.Type.CLIP, null, null, null, 34812));
                } else if (t1dVar instanceof t1d.m) {
                    String str = ((t1d.m) t1dVar).a;
                    Activity c6 = g2u0.c(o1dVar);
                    if (c6 != null) {
                        maz.c(o1dVar.getLinksBridge().e(), c6, str, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
                    }
                } else if (t1dVar instanceof t1d.x) {
                    String str2 = ((t1d.x) t1dVar).a;
                    Activity c7 = g2u0.c(o1dVar);
                    if (c7 != null) {
                        maz.c(o1dVar.getLinksBridge().e(), c7, str2, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), cqm0.m("CLIPS_VIEWER_TREND"), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108839), null, null, 24);
                    }
                } else if (t1dVar instanceof t1d.y) {
                    SdkClipVideoFile sdkClipVideoFile7 = ((t1d.y) t1dVar).a;
                    Activity c8 = g2u0.c(o1dVar);
                    if (c8 != null && (actionLink = (z = k15.z(sdkClipVideoFile7)).Y) != null) {
                        o1dVar.getUserLinksClickController().a(c8, z, actionLink);
                    }
                } else if (t1dVar instanceof t1d.a0) {
                    h3dVar.s5();
                } else if (t1dVar instanceof t1d.s) {
                    SdkClipVideoFile sdkClipVideoFile8 = ((t1d.s) t1dVar).a;
                    kz5 badgesHelper = o1dVar.getBadgesHelper();
                    ClipVideoFile z2 = k15.z(sdkClipVideoFile8);
                    badgesHelper.getClass();
                    Activity c9 = g2u0.c(o1dVar);
                    if (c9 != null) {
                        qwe privacy = g620.f().getPrivacy();
                        dhr0.a.getClass();
                        privacy.j(new l7s(c9, dhr0.u().c), o1dVar, z2, new jt(i));
                    }
                } else if (t1dVar instanceof t1d.k) {
                    SdkGeoPlace sdkGeoPlace = ((t1d.k) t1dVar).a;
                    GeoPlaceWrapper geoPlaceWrapper = sdkGeoPlace instanceof GeoPlaceWrapper ? (GeoPlaceWrapper) sdkGeoPlace : null;
                    if (geoPlaceWrapper == null) {
                        throw new IllegalStateException("SdkGeoPlace is not a GeoPlaceWrapper");
                    }
                    GeoPlace geoPlace = geoPlaceWrapper.b;
                    kz5 badgesHelper2 = o1dVar.getBadgesHelper();
                    Context context = o1dVar.getContext();
                    badgesHelper2.getClass();
                    ClipsRouter.j(g620.f().a(), context, new ClipGridParams.Data.GeoPlace(geoPlace, 0L), false, null, null, 60);
                } else if (t1dVar instanceof t1d.i) {
                    Parcelable parcelable = ((t1d.i) t1dVar).a.c;
                    Compilation compilation = parcelable instanceof Compilation ? (Compilation) parcelable : null;
                    if (compilation == null) {
                        throw new IllegalStateException("SdkCompilation.extendedModel isn't Compilation model");
                    }
                    kz5 badgesHelper3 = o1dVar.getBadgesHelper();
                    Context context2 = o1dVar.getContext();
                    badgesHelper3.getClass();
                    ClipsRouter.j(g620.f().a(), context2, new ClipGridParams.Data.ClipCompilation(compilation), false, null, null, 60);
                } else if (t1dVar instanceof t1d.f) {
                    SdkClipVideoFile sdkClipVideoFile9 = ((t1d.f) t1dVar).a;
                    kz5 badgesHelper4 = o1dVar.getBadgesHelper();
                    ClipVideoFile z3 = k15.z(sdkClipVideoFile9);
                    d9f d9fVar = badgesHelper4.a;
                    ClipAudioTemplate clipAudioTemplate = z3.L1;
                    if (clipAudioTemplate != null) {
                        d9fVar.e("BadgesHelper");
                        itg0.b(o1dVar, hg1.h(d9fVar.d(TemplatesFlowScreen.CLIP_FEED).a0(asu0.a.d()), new jz5(o1dVar, i3)));
                        badgesHelper4.b.b(o1dVar, new m7f(z3, clipAudioTemplate.b, null));
                    }
                } else if (t1dVar instanceof t1d.d) {
                    Mask s = ine0.s(((t1d.d) t1dVar).a);
                    kz5 badgesHelper5 = o1dVar.getBadgesHelper();
                    Context context3 = o1dVar.getContext();
                    badgesHelper5.getClass();
                    ClipsRouter.j(g620.f().a(), context3, new ClipGridParams.Data.CameraMask(s, 0L), false, null, null, 60);
                } else if (t1dVar instanceof t1d.d0) {
                    Mask s2 = ine0.s(((t1d.d0) t1dVar).a);
                    Activity c10 = g2u0.c(o1dVar);
                    if (c10 != null) {
                        nqc.b(s2, c10);
                    }
                } else if (t1dVar instanceof t1d.e) {
                    h3dVar.Ef(o1dVar.getContext(), ((t1d.e) t1dVar).a);
                } else if (t1dVar instanceof t1d.b0) {
                    List<mih0> list = ((t1d.b0) t1dVar).a;
                    Activity c11 = g2u0.c(o1dVar);
                    if (c11 != null) {
                        kz5 badgesHelper6 = o1dVar.getBadgesHelper();
                        badgesHelper6.getClass();
                        e520 e520Var = nqc.a;
                        nqc.a(list, c11, badgesHelper6.c);
                    }
                } else if (t1dVar instanceof t1d.o) {
                    t1d.o oVar = (t1d.o) t1dVar;
                    SdkMusicTrack sdkMusicTrack = oVar.a;
                    SdkClipAudioTemplate sdkClipAudioTemplate = oVar.b;
                    Activity c12 = g2u0.c(o1dVar);
                    if (c12 != null) {
                        o1dVar.getBadgesHelper().getClass();
                        ClipsRouter a2 = g620.f().a();
                        Parcelable parcelable2 = sdkMusicTrack.l;
                        MusicTrack musicTrack = parcelable2 instanceof MusicTrack ? (MusicTrack) parcelable2 : null;
                        if (musicTrack == null) {
                            throw new IllegalStateException("SdkMusicTrack.extendedModel isn't MusicTrack model");
                        }
                        ClipsRouter.j(a2, c12, new ClipGridParams.Data.Music(musicTrack, 0L, null, false, null, sdkClipAudioTemplate != null ? new ClipAudioTemplate(sdkClipAudioTemplate.b) : null, null, false, false, 476, null), false, null, null, 60);
                    }
                } else if (t1dVar instanceof t1d.q) {
                    SdkOriginalSoundStatus sdkOriginalSoundStatus = ((t1d.q) t1dVar).a;
                    final dz80 dz80Var = o1dVar.K0;
                    Context context4 = o1dVar.getContext();
                    dw20 dw20Var = dz80Var.a;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    dw20.b bVar2 = new dw20.b(context4, null);
                    bVar2.M(R.drawable.vk_icon_lock_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent));
                    bVar2.L0();
                    int i4 = dz80.a.$EnumSwitchMapping$0[sdkOriginalSoundStatus.ordinal()];
                    if (i4 == 1) {
                        bVar2.w0(context4.getString(R.string.clips_original_track_moderating_title));
                        bVar2.s0(context4.getString(R.string.clips_original_track_moderating_subtitle));
                    } else if (i4 != 2) {
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        bVar2.w0(context4.getString(R.string.clips_original_track_denied_title));
                        bVar2.s0(context4.getString(R.string.clips_original_track_denied_subtitle));
                    }
                    bVar2.F(enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, context4), null);
                    bVar2.b0(new qz40(dz80Var, 7));
                    bVar2.a0(new dj60(dz80Var, 5));
                    bVar2.i0(R.string.ok, new hz20() { // from class: xsna.cz80
                        @Override // xsna.hz20
                        public final void a(int i5) {
                            dw20 dw20Var2 = dz80.this.a;
                            if (dw20Var2 != null) {
                                dw20Var2.dismiss();
                            }
                        }
                    });
                    dz80Var.a = bVar2.I0(null);
                } else if (t1dVar instanceof t1d.g) {
                    o1dVar.getCoauthorsComponent().e().a(o1dVar.getContext(), k15.z(((t1d.g) t1dVar).a));
                } else if (t1dVar instanceof t1d.f0) {
                    o1dVar.H0.a(o1dVar.getContext(), ((t1d.f0) t1dVar).a);
                } else if (t1dVar instanceof t1d.c0) {
                    SdkVideoRestriction sdkVideoRestriction = ((t1d.c0) t1dVar).a;
                    uws uwsVar = o1dVar.M0;
                    Context context5 = o1dVar.getContext();
                    uwsVar.getClass();
                    int i5 = h7u0.p;
                    h7u0.a c13 = h7u0.b.c(context5);
                    c13.h0(sdkVideoRestriction.c);
                    String str3 = sdkVideoRestriction.d;
                    if (str3 != null && str3.length() > 0) {
                        c13.a.f = str3;
                    }
                    c13.c0(R.string.clips_full_video_restricted_dialog_understand, null);
                    c13.m();
                } else if (t1dVar instanceof t1d.z) {
                    fxc0.B().Y().k(o1dVar.getContext(), k15.A(((t1d.z) t1dVar).a), (r43 & 4) != 0 ? null : "from_attached_clip", (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                } else {
                    if (t1dVar instanceof t1d.b) {
                        new ArrayList(c5g.u(null, 10));
                        throw null;
                    }
                    if (t1dVar instanceof t1d.w) {
                        t1d.w wVar = (t1d.w) t1dVar;
                        SdkClipVideoFile sdkClipVideoFile10 = wVar.a;
                        SdkClipVideoFile sdkClipVideoFile11 = wVar.b;
                        ClipsRouter.c(o1dVar.getClipsBridge().a(), o1dVar.getContext(), Collections.singletonList(sdkClipVideoFile11 != null ? new ClipFeedTab.ClipsFromShopsSource.WithVideo(sdkClipVideoFile11, ClipFeedTab.ClipsFromShopsSource.SourceType.SHOPS_MORE_BUTTON) : new ClipFeedTab.ClipsFromShopsSource.WithVideoTrackCode(sdkClipVideoFile10.r(), sdkClipVideoFile10.a1(), ClipFeedTab.ClipsFromShopsSource.SourceType.SHOPS_MORE_BUTTON)), null, null, null, null, null, false, null, 2044);
                    } else {
                        if (!(t1dVar instanceof t1d.p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t1d.p pVar = (t1d.p) t1dVar;
                        ClipsRouter.c(o1dVar.getClipsBridge().a(), o1dVar.getContext(), Collections.singletonList(new ClipFeedTab.NewsMonotheme(pVar.a, pVar.b, null, null, 12, null)), null, null, null, null, null, false, null, 2044);
                    }
                }
            }
        }
        return s3q0.a;
    }

    public static s3q0 I(o1d o1dVar, boolean z) {
        o1dVar.getOverlayRenderLayer().getRenderer().getValue().b(z);
        return s3q0.a;
    }

    public static kz5 J(o1d o1dVar) {
        return new kz5(o1dVar.getTemplatesNavigator(), o1dVar.getTemplatesEditorProvider(), o1dVar.A0);
    }

    private final b25 getAuthBridge() {
        return this.u.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kz5 getBadgesHelper() {
        return (kz5) this.E0.getValue();
    }

    private final pkd getClipsBridge() {
        return this.u.x();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsInterestsComponent getClipsInterestsComponent() {
        return (ClipsInterestsComponent) this.e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsViewerComponent getClipsViewerComponent() {
        return (ClipsViewerComponent) this.b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsViewerComponentImpl getClipsViewerComponentInternal() {
        return (ClipsViewerComponentImpl) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsCoauthorsComponent getCoauthorsComponent() {
        return (ClipsCoauthorsComponent) this.l0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final tyf getCoauthorsHelper() {
        return (tyf) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsFavoritesComponent getFavoritesComponent() {
        return (ClipsFavoritesComponent) this.d0.getValue();
    }

    private final j5e getFavoritesLauncher() {
        return getFavoritesComponent().e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final w0d getGestureDetector() {
        return (w0d) this.D0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x0d getImmediatelyViewEventHandler() {
        return (x0d) this.N0.getValue();
    }

    private final qdz getLinksBridge() {
        return this.u.p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ModerationComponent getModerationComponent() {
        return (ModerationComponent) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h2d getOverlayRenderLayer() {
        return (h2d) this.R0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final mid0 getProductAttachesHolder() {
        return (mid0) this.o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final s2d getRenderEventsHandler() {
        return (s2d) this.v0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h2d getRenderLayerDefault() {
        return (h2d) this.P0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h2d getRenderLayerRedesign() {
        return (h2d) this.Q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j5s0 getRenderer() {
        return (j5s0) this.p0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final jlh0 getSdkAttachmentsUserLinksRenderer() {
        return (jlh0) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsViewersSdkComponentImpl getSdkComponent() {
        return (ClipsViewersSdkComponentImpl) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final m5f getSubtitlesState() {
        return (m5f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final v8f getTemplatesEditorProvider() {
        return (v8f) this.k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final d9f getTemplatesNavigator() {
        return (d9f) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final jnp0 getTransitioningHelper() {
        return (jnp0) this.q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final nkq0 getUserLinksClickController() {
        return (nkq0) this.h0.getValue();
    }

    private final o0r0 getUsersBridge() {
        return this.u.F();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final o5s0 getVideoBaseViewsContainer() {
        return (o5s0) this.n0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final abs0 getVideoChannelsApiHelper() {
        return (abs0) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.video.ui.share.api.a getVideoShareLauncher() {
        return (com.vk.video.ui.share.api.a) this.m0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.clips.sdk.shared.item.clip.events.a getViewEventVideoBaseImmediateHandler() {
        return (com.vk.clips.sdk.shared.item.clip.events.a) this.O0.getValue();
    }

    public static s3q0 k(o1d o1dVar, j0d j0dVar) {
        y1d value = o1dVar.getOverlayRenderLayer().c().getValue();
        if (j0dVar instanceof j0d.g) {
            value.b();
        } else if (j0dVar instanceof j0d.f) {
            value.l(((j0d.f) j0dVar).a);
        } else if (j0dVar instanceof j0d.e) {
            value.h(((j0d.e) j0dVar).a);
        } else if (j0dVar instanceof j0d.a) {
            value.k();
        } else if (j0dVar instanceof j0d.c) {
            value.d();
        } else if (j0dVar instanceof j0d.d) {
            value.c();
        } else {
            if (!(j0dVar instanceof j0d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            value.e();
        }
        return s3q0.a;
    }

    public static com.vk.libvideo.autoplay.a l(o1d o1dVar, y0r y0rVar) {
        r1d r1dVar = o1dVar.s;
        SdkSubtitlesConfigurationMode a2 = o1dVar.getSubtitlesState().a();
        r1dVar.getClass();
        int i = s1d.v;
        return s1d.a.a(y0rVar, a2);
    }

    public static com.vk.clips.sdk.shared.item.clip.events.a m(o1d o1dVar) {
        ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = o1dVar.j;
        di5 di5Var = new di5(o1dVar.getVideoTextureViewAdapter(), o1dVar.t);
        i3i0 i3i0Var = o1dVar.w0;
        jz5 jz5Var = new jz5(o1dVar, 1);
        j5s0 renderer = o1dVar.getRenderer();
        jnp0 transitioningHelper = o1dVar.getTransitioningHelper();
        ah5 ah5Var = new ah5(o1dVar, o1dVar.getVideoBaseViewsContainer().d(), z9z.a.a.getSTUB(), new kz0(9));
        zof zofVar = o1dVar.v;
        return new com.vk.clips.sdk.shared.item.clip.events.a(clipsScreenPerformanceReporter, di5Var, i3i0Var, jz5Var, renderer, transitioningHelper, ah5Var, zofVar.U(), zofVar.F());
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x05a1, code lost:
    
        if (r14 == null) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05d1  */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 n(o1d o1dVar, t0d t0dVar) {
        zu50 zu50Var;
        OneVideoPlayer a2;
        float f;
        boolean z;
        xjc xjcVar;
        boolean z2;
        v7k0 v7k0Var = o1dVar.I0;
        gxp0 gxp0Var = o1dVar.p;
        gym0 gym0Var = o1dVar.J0;
        pih0 pih0Var = o1dVar.h;
        if (t0dVar instanceof t0d.p) {
            t0d.p pVar = (t0d.p) t0dVar;
            kih0 kih0Var = pVar.a;
            y0r y0rVar = pVar.b;
            yg5 R = d370.R(kih0Var);
            if (R.isPlaying()) {
                R.c();
                rlt0 m0 = R.m0();
                if (m0 != null) {
                    m0.i("pause", "pause");
                }
                o1dVar.getFeature().y.b(j0d.c.a);
            } else {
                R.D();
                rlt0 m02 = R.m0();
                if (m02 != null) {
                    m02.i("pause", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
                }
                VideoTextureViewAdapter.a.a(o1dVar.getVideoBaseViewsContainer().getVideoTextureViewAdapter(), kih0Var, "ClipItemMviView.togglePlay", null, y0rVar, o1dVar.getSubtitlesState().a(), 4);
                R.f();
                o1dVar.getFeature().y.b(j0d.d.a);
            }
        } else if (t0dVar instanceof t0d.o) {
            t0d.o oVar = (t0d.o) t0dVar;
            o1dVar.t.H();
            pih0Var.ai(new ClipViewerAnalyticsEvent.a.b(oVar.a));
            r1d r1dVar = o1dVar.s;
            y0r y0rVar2 = oVar.c;
            SdkSubtitlesConfigurationMode a3 = o1dVar.getSubtitlesState().a();
            r1dVar.getClass();
            int i = s1d.v;
            d370.R(oVar.b).a0(s1d.a.a(y0rVar2, a3));
        } else {
            int i2 = 13;
            int i3 = 19;
            int i4 = 3;
            SdkClipVideoFile sdkClipVideoFile = null;
            boolean z3 = true;
            z3 = true;
            if (t0dVar instanceof t0d.m) {
                Context context = o1dVar.getContext();
                t0d.m mVar = (t0d.m) t0dVar;
                jym0 jym0Var = gym0Var.a;
                if (mVar instanceof t0d.m.b) {
                    jym0Var.a.a(context, ((t0d.m.b) mVar).a, wkh0.b.C3939b.a, null, new hfm0(new xim0(mVar, z3 ? 1 : 0), i4));
                } else if (mVar instanceof t0d.m.c) {
                    jym0Var.a.a(context, ((t0d.m.c) mVar).a, wkh0.b.a.a, null, new ggb0(jym0Var, i3));
                } else {
                    if (!(mVar instanceof t0d.m.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t0d.m.a aVar = (t0d.m.a) mVar;
                    jym0Var.a.c(context, aVar.b, aVar.a.k(), wkh0.b.C3939b.a, new wug0(aVar.c, i2));
                }
            } else {
                int i5 = 2;
                if (t0dVar instanceof t0d.q) {
                    Context context2 = o1dVar.getContext();
                    t0d.q qVar = (t0d.q) t0dVar;
                    jym0 jym0Var2 = gym0Var.a;
                    if (qVar instanceof t0d.q.b) {
                        jym0Var2.a.d(context2, ((t0d.q.b) qVar).a, wkh0.b.C3939b.a, new twb(new whg0(qVar, i2), i5));
                    } else {
                        if (!(qVar instanceof t0d.q.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t0d.q.a aVar2 = (t0d.q.a) qVar;
                        jym0Var2.a.b(context2, aVar2.b, aVar2.a.k(), wkh0.b.C3939b.a, new rzl0(aVar2.c, 5));
                    }
                } else if (t0dVar instanceof t0d.n) {
                    t0d.n nVar = (t0d.n) t0dVar;
                    boolean z4 = nVar.a;
                    SdkClipVideoFile sdkClipVideoFile2 = nVar.b;
                    pih0Var.ai(z4 ? new ClipViewerAnalyticsEvent.b.C0642b(sdkClipVideoFile2) : new ClipViewerAnalyticsEvent.b.a(sdkClipVideoFile2));
                    gxp0Var.f(z4);
                } else if (t0dVar instanceof t0d.j) {
                    kih0 kih0Var2 = ((t0d.j) t0dVar).a;
                    kih0Var2.I();
                    kih0Var2.play();
                } else if (t0dVar instanceof t0d.l) {
                    o1dVar.getOverlayRenderLayer().c().getValue().i();
                } else if (t0dVar instanceof t0d.e) {
                    SdkClipVideoFile sdkClipVideoFile3 = ((t0d.e) t0dVar).a;
                    if (!o1dVar.getAuthBridge().b()) {
                        g2v.c().getClass();
                        Context context3 = o1dVar.getContext();
                        String a4 = fss0.a(k15.z(sdkClipVideoFile3));
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", a4);
                        Intent createChooser = Intent.createChooser(intent, context3.getString(R.string.share));
                        createChooser.addFlags(268435456);
                        context3.startActivity(createChooser);
                    } else if (fxc0.B().J().m(true)) {
                        o1dVar.getVideoShareLauncher().a(o1dVar.getContext(), new VideoShareArguments(fss0.a(k15.z(sdkClipVideoFile3)), 0, dhr0.a.c(o1dVar.getContext()), new StatsArguments(ShareItemType.CLIP, sdkClipVideoFile3.I0().b, sdkClipVideoFile3.o0(), sdkClipVideoFile3.r(), null, null, 48, null), 2, null), k15.z(sdkClipVideoFile3));
                    } else {
                        w1s0.k(xa4.L(o1dVar.getContext()), k15.z(sdkClipVideoFile3), dhr0.a.c(o1dVar.getContext()));
                    }
                } else {
                    z16 z16Var = null;
                    z16Var = null;
                    if (t0dVar instanceof t0d.b) {
                        o1dVar.getFavoritesComponent().b().d(o1dVar.getAuthBridge().c(), k15.z(((t0d.b) t0dVar).a), null);
                    } else {
                        int i6 = 0;
                        if (t0dVar instanceof t0d.c) {
                            SdkClipVideoFile sdkClipVideoFile4 = ((t0d.c) t0dVar).a;
                            j1n0 j1n0Var = o1dVar.L0;
                            j1n0Var.getClass();
                            j1n0Var.a = sdkClipVideoFile4.k0();
                            j1n0Var.b = sdkClipVideoFile4.A0();
                            f3d f3dVar = o1dVar.y0;
                            f3dVar.c.i(sdkClipVideoFile4);
                            x1d x1dVar = f3dVar.e;
                            x1d.c cVar = x1dVar.d;
                            if (cVar instanceof x1d.a) {
                                x1d.a aVar3 = (x1d.a) cVar;
                                yof yofVar = aVar3.b;
                                if (!epx.f(aVar3.d.r1(), sdkClipVideoFile4.r1())) {
                                    we7.l(sdkClipVideoFile4, 0L, yofVar.J().a ? Long.valueOf(yofVar.J().c) : null);
                                    we7.k(sdkClipVideoFile4, 0L);
                                    we7.j(sdkClipVideoFile4, 0L);
                                    new qzb0.e();
                                    qzb0.c cVar2 = new qzb0.c();
                                    if (sdkClipVideoFile4.d3() == null || !(!r9.b.isEmpty())) {
                                        SdkClipsAdsFeaturesParams d3 = sdkClipVideoFile4.d3();
                                        if ((d3 != null ? d3.d : null) == null) {
                                            z3 = false;
                                        }
                                    }
                                    qzb0.b bVar = new qzb0.b(false, false, z3);
                                    aVar3.i = new qzb0.d(false, false);
                                    aVar3.h = cVar2;
                                    aVar3.j = bVar;
                                    aVar3.e = new lfj0(aVar3.a, yofVar, sdkClipVideoFile4);
                                }
                                aVar3.d = sdkClipVideoFile4;
                            } else if (cVar instanceof x1d.b) {
                                x1d.b bVar2 = (x1d.b) cVar;
                                ClipFeedTab clipFeedTab = x1dVar.a;
                                yof yofVar2 = x1dVar.b;
                                j1d j1dVar = x1dVar.c;
                                bVar2.getClass();
                                x1d.a aVar4 = new x1d.a(clipFeedTab, yofVar2, j1dVar, sdkClipVideoFile4);
                                Long l = bVar2.a;
                                Long l2 = bVar2.b;
                                if (l != null && l2 != null) {
                                    aVar4.a(l.longValue(), l2.longValue());
                                }
                                x1dVar.d = aVar4;
                            }
                            f3dVar.f = sdkClipVideoFile4;
                            f3dVar.d.b(new rxp.c(sdkClipVideoFile4));
                            g5p0 g5p0Var = o1dVar.s0;
                            if (g5p0Var != null) {
                                g5p0Var.a(k15.z(sdkClipVideoFile4));
                            } else {
                                o1dVar.u0.add(new ClipItemTooltipEvent.c(sdkClipVideoFile4));
                            }
                        } else {
                            int i7 = 6;
                            boolean z5 = false;
                            if (t0dVar instanceof t0d.k) {
                                t0d.k kVar = (t0d.k) t0dVar;
                                Context context4 = o1dVar.getContext();
                                if (kVar instanceof t0d.k.a) {
                                    Window a5 = v7k0Var.b.a.a();
                                    if (a5 != null) {
                                        ikv0.a aVar5 = new ikv0.a(bwt0.u(context4));
                                        aVar5.u = new ikv0.d(context4.getString(R.string.clips_controls_hidden_toast), (String) null, (ikv0.d.a) null, 6);
                                        aVar5.b = true;
                                        aVar5.e = 1500L;
                                        aVar5.d = true;
                                        aVar5.p(a5);
                                    }
                                } else {
                                    boolean z6 = kVar instanceof t0d.k.e;
                                    int i8 = R.string.clips_disabled_menu_edit_privacy_message;
                                    if (z6) {
                                        mfd0 mfd0Var = v7k0Var.c;
                                        t0d.k.e eVar = (t0d.k.e) kVar;
                                        boolean z7 = eVar instanceof t0d.k.e.a;
                                        if (!z7) {
                                            if (!(eVar instanceof t0d.k.e.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i8 = R.string.error;
                                        }
                                        if (z7) {
                                            sdkClipVideoFile = ((t0d.k.e.a) eVar).a;
                                        } else if (!(eVar instanceof t0d.k.e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        mfd0Var.a.o4(i8, sdkClipVideoFile);
                                    } else if (kVar instanceof t0d.k.c) {
                                        Window a6 = v7k0Var.d.a.a();
                                        if (a6 != null) {
                                            String string = context4.getString(R.string.clips_full_video_snackbar_error_title);
                                            ikv0.a aVar6 = new ikv0.a(context4);
                                            aVar6.t = ikv0.c.b.a;
                                            aVar6.u = new ikv0.d(new ikv0.d.c(string), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                                            aVar6.d = true;
                                            aVar6.p(a6);
                                        }
                                    } else if (kVar instanceof t0d.k.b) {
                                        t0d.k.b bVar3 = (t0d.k.b) kVar;
                                        Window a7 = v7k0Var.e.a.a();
                                        if (a7 != null) {
                                            if (bVar3 instanceof t0d.k.b.a) {
                                                i8 = R.string.clips_disabled_menu_edit_message;
                                            } else if (!(bVar3 instanceof t0d.k.b.C3712b)) {
                                                boolean z8 = bVar3 instanceof t0d.k.b.c;
                                                i8 = R.string.clips_disabled_menu_remove_message;
                                                if (!z8 && !(bVar3 instanceof t0d.k.b.d)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            ikv0.a aVar7 = new ikv0.a(context4);
                                            aVar7.u = new ikv0.d(new ikv0.d.c(context4.getString(i8)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                                            aVar7.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context4.getString(R.string.clips_feed_promo_snackbar_button), new o9(i3, context4, bVar3));
                                            aVar7.e = 1500L;
                                            aVar7.d = true;
                                            aVar7.p(a7);
                                        }
                                    } else if (kVar instanceof t0d.k.f) {
                                        v7k0Var.f.a(context4, ((t0d.k.f) kVar).a);
                                    } else {
                                        if (!(kVar instanceof t0d.k.d)) {
                                            v7k0Var.getClass();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Window a8 = v7k0Var.a.a();
                                        if (a8 != null) {
                                            i560 i560Var = i560.d;
                                            n1 n1Var = new n1(26);
                                            i560Var.getClass();
                                            xd40 xd40Var = new xd40(a8, 4);
                                            ((com.vk.video.kidsprofile.restricteduseractions.a) i560Var.b.getValue()).getClass();
                                            i0q0.j(new h560(i560Var, xd40Var, context4, z5, n1Var));
                                        }
                                    }
                                }
                            } else {
                                boolean z9 = false;
                                if (t0dVar instanceof t0d.g) {
                                    v7k0Var.getClass();
                                    if (!(((t0d.g) t0dVar) instanceof t0d.g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i560.d.a();
                                } else if (t0dVar instanceof t0d.f) {
                                    t0d.f fVar = (t0d.f) t0dVar;
                                    kih0 kih0Var3 = fVar.c;
                                    l0d l0dVar = o1dVar.t0;
                                    if (l0dVar != null) {
                                        MotionEvent motionEvent = fVar.b;
                                        ClipVideoFile z10 = k15.z(fVar.a);
                                        yg5 R2 = d370.R(kih0Var3);
                                        o1d o1dVar2 = l0dVar.a;
                                        if ((R2.isPaused() || R2.isPlaying() || R2.d()) && !R2.J()) {
                                            ClickableStickers clickableStickers = z10.C1;
                                            if (clickableStickers == null) {
                                                z2 = true;
                                                if (z9 == z2) {
                                                    z = z2;
                                                    if (!z) {
                                                        xn50.a.c(o1dVar, new ClipItemAction.l0.a(kih0Var3, fVar.d));
                                                    }
                                                }
                                            } else {
                                                xjc xjcVar2 = l0dVar.c;
                                                if (xjcVar2 == null) {
                                                    xjc a9 = l0dVar.b.a(Collections.singletonList(clickableStickers), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o1dVar2.getMeasuredWidth(), o1dVar2.getMeasuredHeight()), new fj1(i7), new hs1(l0dVar, o1dVar2, z10, i4), null, null, new g6(i4, l0dVar, o1dVar2), null, null, null);
                                                    if (a9 != null) {
                                                        l0dVar.c = a9;
                                                        xjcVar = a9;
                                                    } else {
                                                        xjcVar = null;
                                                    }
                                                } else {
                                                    xjcVar = xjcVar2;
                                                }
                                                if (xjcVar != null) {
                                                    l0d.a aVar8 = l0dVar.d;
                                                    if (aVar8 != null) {
                                                        if (!aVar8.b.equals(o1dVar2) || !aVar8.c.equals(R2)) {
                                                            aVar8 = null;
                                                        }
                                                    }
                                                    aVar8 = new l0d.a(o1dVar2, R2);
                                                    l0dVar.d = aVar8;
                                                    z9 = xjcVar.d(aVar8, clickableStickers, motionEvent.getX(), motionEvent.getY(), Long.valueOf(R2.getPosition()));
                                                    z2 = true;
                                                    if (z9 == z2) {
                                                    }
                                                }
                                            }
                                        }
                                        z9 = false;
                                        z2 = true;
                                        if (z9 == z2) {
                                        }
                                    }
                                    z = false;
                                    if (!z) {
                                    }
                                } else if (t0dVar instanceof t0d.d) {
                                    t0d.d dVar = (t0d.d) t0dVar;
                                    d3b0 v0 = d370.R(dVar.j()).v0();
                                    if (v0 != null && (a2 = v0.a()) != null) {
                                        if (dVar instanceof t0d.d.a) {
                                            gxp0Var.c.setValue(gxp0Var, gxp0.i[2], Boolean.FALSE);
                                            f = 1.0f;
                                        } else {
                                            if (!(dVar instanceof t0d.d.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            o1dVar.performHapticFeedback(0);
                                            u4f u4fVar = o1dVar.C.c.N1;
                                            if (u4fVar != null) {
                                                u4fVar.a(u4f.c.a(u4fVar.c, null, null, o1dVar.getSubtitlesState().a() == SdkSubtitlesConfigurationMode.ALWAYS_ENABLED, 3));
                                            }
                                            gxp0Var.c.setValue(gxp0Var, gxp0.i[2], Boolean.TRUE);
                                            f = 2.0f;
                                        }
                                        a2.setPlaybackSpeed(f);
                                    }
                                } else if (t0dVar instanceof t0d.i) {
                                    t0d.i iVar = (t0d.i) t0dVar;
                                    p16 p16Var = o1dVar.H;
                                    if (iVar instanceof t0d.i.c) {
                                        String str = ((t0d.i.c) iVar).a;
                                        ConstraintLayout f2 = o1dVar.getOverlayRenderLayer().c().getValue().f();
                                        FrameLayout j = o1dVar.getOverlayRenderLayer().c().getValue().j();
                                        n1d n1dVar = new n1d(o1dVar, i6);
                                        p16Var.getClass();
                                        if (j.getChildCount() != 0) {
                                            View childAt = j.getChildAt(0);
                                            if (childAt instanceof z16) {
                                                z16Var = (z16) childAt;
                                            }
                                        }
                                        p16Var.g = z16Var;
                                        if (z16Var == null) {
                                            tv4.b("BannerCompanionView is null after restore", com.vk.metrics.eventtracking.b.a);
                                        } else {
                                            zu50 zu50Var2 = p16Var.b.get(str);
                                            if (zu50Var2 != null) {
                                                p16Var.d = zu50Var2;
                                            }
                                            p16Var.c = n1dVar;
                                            p16Var.f = new p16.b(f2, z16Var);
                                            p16Var.a();
                                            z16Var.setOnLickListener(new q16(p16Var));
                                        }
                                    } else if (iVar instanceof t0d.i.d) {
                                        String str2 = ((t0d.i.d) iVar).a;
                                        HashMap<String, zu50> hashMap = p16Var.b;
                                        if (!hashMap.containsKey(str2) && (zu50Var = p16Var.d) != null) {
                                            hashMap.put(str2, zu50Var);
                                        }
                                    } else if (iVar instanceof t0d.i.b) {
                                        p16Var.b.remove(((t0d.i.b) iVar).a);
                                    } else {
                                        if (!(iVar instanceof t0d.i.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        p16Var.b.clear();
                                    }
                                } else if (t0dVar instanceof t0d.a) {
                                    t0d.a aVar9 = (t0d.a) t0dVar;
                                    h3d h3dVar = o1dVar.k;
                                    if (aVar9 instanceof t0d.a.b) {
                                        h3dVar.pj(((t0d.a.b) aVar9).a);
                                    } else {
                                        if (!(aVar9 instanceof t0d.a.C3711a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t0d.a.C3711a c3711a = (t0d.a.C3711a) aVar9;
                                        h3dVar.g9(Integer.valueOf(c3711a.b), c3711a.c, new g3d(c3711a.a));
                                    }
                                } else {
                                    if (!(t0dVar instanceof t0d.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Activity c = g2u0.c(o1dVar);
                                    if (c != null) {
                                        o1dVar.g.a().b(c, new v40(o1dVar, 16));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }

    public static jlh0 o(o1d o1dVar) {
        return o1dVar.getSdkComponent().Df();
    }

    public static q0d p(o1d o1dVar, Context context) {
        return new q0d(o1dVar.o, o1dVar.getSdkAttachmentsUserLinksRenderer(), o1dVar.l.a, o1dVar.getClipsViewerComponent().Y(), o1dVar.v, new lf00(new ur0(5), e3m.a(R.dimen.clip_owner_avatar_height, context)), o1dVar.O);
    }

    public static s3q0 q(ile ileVar, SdkClipVideoFile sdkClipVideoFile, o1d o1dVar, y0r y0rVar, kih0 kih0Var, ClipsSubsSetting clipsSubsSetting) {
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType objectType;
        int i = ile.a.$EnumSwitchMapping$0[clipsSubsSetting.ordinal()];
        if (i == 1) {
            objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.DISABLE;
        } else if (i == 2) {
            objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.ENABLE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.ENABLE_WHEN_SOUND_IS_OFF;
        }
        ile.b(sdkClipVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.SUBTITLE, ileVar.a, objectType);
        r1d r1dVar = o1dVar.s;
        SdkSubtitlesConfigurationMode a2 = o1dVar.getSubtitlesState().a();
        r1dVar.getClass();
        int i2 = s1d.v;
        d370.R(kih0Var).a0(s1d.a.a(y0rVar, a2));
        return s3q0.a;
    }

    public static h2d r(o1d o1dVar) {
        return o1dVar.getRenderLayerDefault();
    }

    public static s3q0 s(o1d o1dVar, e3d e3dVar) {
        VideoFile A;
        UserId userId;
        VideoFile A2;
        UserId userId2;
        io.reactivex.rxjava3.disposables.c g;
        p8e p8eVar;
        if (e3dVar instanceof e3d.c) {
            z0q z0qVar = o1dVar.i;
            SdkClipVideoFile sdkClipVideoFile = ((e3d.c) e3dVar).a;
            z0qVar.b(new rxp.a(sdkClipVideoFile, !sdkClipVideoFile.J()));
            if (!sdkClipVideoFile.w1() && (p8eVar = o1dVar.I) != null) {
                p8eVar.a(new o8e(sdkClipVideoFile.I0(), sdkClipVideoFile.o0(), o8e.a.b.a));
            }
            o1dVar.k.C5(sdkClipVideoFile);
        } else if (e3dVar instanceof e3d.b) {
            ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) o1dVar.g.a.c;
            io.reactivex.rxjava3.disposables.b bVar = clipFeedListFragment.r1;
            g = hg1.g(clipFeedListFragment.Hl(null), new ek(29));
            hg1.e(bVar, g);
        } else if (e3dVar instanceof e3d.d) {
            Parcelable parcelable = ((e3d.d) e3dVar).a;
            VideoFileAdapter videoFileAdapter = parcelable instanceof VideoFileAdapter ? (VideoFileAdapter) parcelable : null;
            if (videoFileAdapter != null && (A2 = k15.A(videoFileAdapter)) != null) {
                abs0 videoChannelsApiHelper = o1dVar.getVideoChannelsApiHelper();
                Context context = o1dVar.getContext();
                SdkOwner s = ((VideoFileAdapter) parcelable).s();
                UserId L = (s == null || (userId2 = s.b) == null) ? o1dVar.getAuthBridge().L() : fkq0.a(userId2);
                j6 j6Var = new j6(2, o1dVar, parcelable);
                pd pdVar = new pd(o1dVar, 25);
                videoChannelsApiHelper.getClass();
                UserId I0 = A2.I0();
                int o0 = A2.o0();
                tfx tfxVar = new tfx("videoChannels.pinShortVideo", new g7r0(1), new bbs0(0));
                tfx.n(tfxVar, "owner_id", I0, 0L, 0L, 12);
                tfx.l(tfxVar, "video_id", o0, 1, 0, 8);
                if (L != null) {
                    tfx.n(tfxVar, "group_id", L, 1L, 0L, 8);
                }
                o1dVar.getFeature().e.b(hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), context, 0L, false, 62).subscribe(new fv70(new waf0(j6Var, videoChannelsApiHelper, context), 25), new u0o0(new gda0(pdVar, videoChannelsApiHelper, context), 4)));
            }
        } else if (e3dVar instanceof e3d.e) {
            Parcelable parcelable2 = ((e3d.e) e3dVar).a;
            VideoFileAdapter videoFileAdapter2 = parcelable2 instanceof VideoFileAdapter ? (VideoFileAdapter) parcelable2 : null;
            if (videoFileAdapter2 != null && (A = k15.A(videoFileAdapter2)) != null) {
                abs0 videoChannelsApiHelper2 = o1dVar.getVideoChannelsApiHelper();
                Context context2 = o1dVar.getContext();
                SdkOwner s2 = ((VideoFileAdapter) parcelable2).s();
                UserId L2 = (s2 == null || (userId = s2.b) == null) ? o1dVar.getAuthBridge().L() : fkq0.a(userId);
                com.vk.movika.sdk.base.ui.l lVar = new com.vk.movika.sdk.base.ui.l(4, o1dVar, parcelable2);
                t40 t40Var = new t40(o1dVar, 17);
                videoChannelsApiHelper2.getClass();
                UserId I02 = A.I0();
                int o02 = A.o0();
                tfx tfxVar2 = new tfx("videoChannels.unpinShortVideo", new qq(28), new k2s0(1));
                tfx.n(tfxVar2, "owner_id", I02, 0L, 0L, 12);
                tfx.l(tfxVar2, "video_id", o02, 1, 0, 8);
                if (L2 != null) {
                    tfx.n(tfxVar2, "group_id", L2, 1L, 0L, 8);
                }
                o1dVar.getFeature().e.b(hg1.m(rsg0.y0(yfb.x(tfxVar2), null, null, 3), context2, 0L, false, 62).subscribe(new wx00(new k7l0(lVar, videoChannelsApiHelper2, context2), 27), new c7q0(new c3k0(t40Var, videoChannelsApiHelper2, context2), 3)));
            }
        } else {
            if (!(e3dVar instanceof e3d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            e3d.a aVar = (e3d.a) e3dVar;
            SdkClipVideoFile sdkClipVideoFile2 = aVar.a;
            kih0 kih0Var = aVar.b;
            fxc0.B().d(k15.z(sdkClipVideoFile2));
            kih0Var.play();
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:449:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(o1d o1dVar, Context context, ClipItemViewEvent clipItemViewEvent) {
        wp50 wp50Var;
        wp50 wp50Var2;
        z16 z16Var;
        int intValue;
        zu50 zu50Var;
        izs<? super ClipItemAction.e, s3q0> izsVar;
        zu50 zu50Var2;
        zu50 zu50Var3;
        qnk qnkVar;
        qnk qnkVar2;
        zu50 zu50Var4;
        qnk qnkVar3;
        qnk qnkVar4;
        com.vk.clips.sdk.shared.item.clip.events.a viewEventVideoBaseImmediateHandler = o1dVar.getViewEventVideoBaseImmediateHandler();
        agj0 agj0Var = viewEventVideoBaseImmediateHandler.b;
        g5s0 g5s0Var = viewEventVideoBaseImmediateHandler.a;
        boolean z = clipItemViewEvent instanceof ClipItemViewEvent.a;
        if (z) {
            if (g5s0Var != null) {
                ClipItemViewEvent.a aVar = (ClipItemViewEvent.a) clipItemViewEvent;
                SdkClipVideoFile sdkClipVideoFile = aVar.b;
                FeedItem.f fVar = aVar.c;
                kih0 kih0Var = fVar.h;
                g5s0Var.a(sdkClipVideoFile, kih0Var, aVar.d, new e3i0(fVar.e, kih0Var, true));
            }
            if (agj0Var != null) {
                FeedItem.f fVar2 = ((ClipItemViewEvent.a) clipItemViewEvent).c;
                agj0Var.a(fVar2.h, fVar2.j);
            }
        } else if (clipItemViewEvent instanceof k6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((k6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof o6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(null);
            }
        } else if (clipItemViewEvent instanceof j6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((j6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof f6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((f6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof m6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((m6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof h6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((h6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof e6d) {
            if (g5s0Var != null) {
                g5s0Var.a.a(((e6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof g6d) {
            if (g5s0Var != null) {
                g5s0Var.f(((g6d) clipItemViewEvent).b);
            }
        } else if (clipItemViewEvent instanceof r6d) {
            if (g5s0Var != null) {
                rlh0 rlh0Var = ((r6d) clipItemViewEvent).b;
                i5s0 i5s0Var = g5s0Var.a;
                m5s0 m5s0Var = i5s0Var.b;
                if (m5s0Var instanceof m5s0.a) {
                    i5s0Var.b(m5s0.a.a((m5s0.a) m5s0Var, null, rlh0Var, false, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                }
            }
        } else if (clipItemViewEvent instanceof p6d) {
            if (g5s0Var != null) {
                g5s0Var.g();
            }
        } else if (clipItemViewEvent instanceof ClipItemViewEvent.OnVideoFocusChanged) {
            if (g5s0Var != null) {
                g5s0Var.e(clipItemViewEvent == ClipItemViewEvent.OnVideoFocusChanged.FOCUSED);
            }
        } else if (clipItemViewEvent instanceof ClipItemViewEvent.e) {
            if (g5s0Var != null) {
                g5s0Var.d();
            }
            if (agj0Var != null) {
                bgj0 bgj0Var = agj0Var.a.b;
                if ((bgj0Var instanceof bgj0.a) && (wp50Var2 = ((bgj0.a) bgj0Var).b) != null) {
                    wp50Var2.f(xp50.l.a);
                }
            }
        } else if (clipItemViewEvent instanceof ClipItemViewEvent.g) {
            if (g5s0Var != null) {
                m5s0 m5s0Var2 = g5s0Var.a.b;
                if (m5s0Var2 instanceof m5s0.a) {
                    ((m5s0.a) m5s0Var2).b.D();
                    g5s0Var.f.c(g5s0Var);
                }
            }
            if (agj0Var != null) {
                bgj0 bgj0Var2 = agj0Var.a.b;
                if ((bgj0Var2 instanceof bgj0.a) && (wp50Var = ((bgj0.a) bgj0Var2).b) != null) {
                    wp50Var.f(xp50.n.a);
                }
            }
        } else if (clipItemViewEvent instanceof ClipItemViewEvent.l) {
            if (agj0Var != null) {
                agj0Var.a.a(bgj0.b.a);
            }
        } else if ((clipItemViewEvent instanceof ClipItemViewEvent.FeedEnterTransitionAnimation) && g5s0Var != null) {
            g5s0Var.b(clipItemViewEvent == ClipItemViewEvent.FeedEnterTransitionAnimation.START);
        }
        if (!o1dVar.v.U()) {
            o1dVar.getImmediatelyViewEventHandler().c.a(clipItemViewEvent);
        }
        if (z) {
            ClipItemViewEvent.a aVar2 = (ClipItemViewEvent.a) clipItemViewEvent;
            FeedItem.f fVar3 = aVar2.c;
            o1dVar.a0 = fVar3.j;
            xn50.a.c(o1dVar, new ClipItemAction.f.a(aVar2.b, fVar3, aVar2.e, aVar2.d, o1dVar.p.c(), aVar2.f));
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.l) {
            o1dVar.a0 = null;
            xn50.a.c(o1dVar, ClipItemAction.f.b.b);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnVideoFocusChanged.FOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnVideoFocusChanged.FOCUSED);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnVideoFocusChanged.UNFOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnVideoFocusChanged.UNFOCUSED);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnSnapFocusChanged.FOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnSnapFocusChanged.FOCUSED);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnSnapFocusChanged.UNFOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnSnapFocusChanged.UNFOCUSED);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnItemViewFocusChanged.FOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnItemViewFocusChanged.FOCUSED);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OnItemViewFocusChanged.UNFOCUSED) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOnItemViewFocusChanged.UNFOCUSED);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.c) {
            xn50.a.c(o1dVar, new ClipItemAction.o(((ClipItemViewEvent.c) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OwnerClicked.CONTAINER) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOwnerClicked.CONTAINER);
            return;
        }
        if (clipItemViewEvent == ClipItemViewEvent.OwnerClicked.AVATAR) {
            xn50.a.c(o1dVar, ClipItemAction.HandleOwnerClicked.AVATAR);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.d) {
            xn50.a.c(o1dVar, ClipItemAction.p.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.m) {
            xn50.a.c(o1dVar, ClipItemAction.w.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.n) {
            xn50.a.c(o1dVar, ClipItemAction.x.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.h) {
            xn50.a.c(o1dVar, new ClipItemAction.s(((ClipItemViewEvent.h) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.j) {
            xn50.a.c(o1dVar, new ClipItemAction.u(((ClipItemViewEvent.j) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.e) {
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.g) {
            xn50.a.c(o1dVar, ClipItemAction.r.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.i) {
            xn50.a.c(o1dVar, ClipItemAction.t.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.f) {
            xn50.a.c(o1dVar, ClipItemAction.q.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.o) {
            xn50.a.c(o1dVar, ClipItemAction.y.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.b) {
            xn50.a.c(o1dVar, ClipItemAction.j.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.FeedEnterTransitionAnimation) {
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.p) {
            xn50.a.c(o1dVar, new ClipItemAction.z(((ClipItemViewEvent.p) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof i5d) {
            xn50.a.c(o1dVar, ClipItemAction.h.a.b);
            return;
        }
        if (clipItemViewEvent instanceof ClipItemViewEvent.k) {
            xn50.a.c(o1dVar, ClipItemAction.a0.b);
            return;
        }
        if (clipItemViewEvent instanceof l5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.a.b);
            return;
        }
        if (clipItemViewEvent instanceof x5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.b.b);
            return;
        }
        if (clipItemViewEvent instanceof j5d) {
            xn50.a.c(o1dVar, ClipItemAction.c.b);
            return;
        }
        if (clipItemViewEvent instanceof w5d) {
            xn50.a.c(o1dVar, ClipItemAction.d0.b);
            return;
        }
        if (clipItemViewEvent instanceof v5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.e.b);
            return;
        }
        if (clipItemViewEvent instanceof k5d) {
            xn50.a.c(o1dVar, ClipItemAction.m.b);
            return;
        }
        if (clipItemViewEvent instanceof m5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.a.b);
            return;
        }
        if (clipItemViewEvent instanceof r5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.C0657c.b);
            return;
        }
        if (clipItemViewEvent instanceof n5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.b.a.b);
            return;
        }
        if (clipItemViewEvent instanceof o5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.b.C0655b.b);
            return;
        }
        if (clipItemViewEvent instanceof p5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.b.C0656c.b);
            return;
        }
        if (clipItemViewEvent instanceof q5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.b.d.b);
            return;
        }
        if (clipItemViewEvent instanceof t5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.d.b);
            return;
        }
        if (clipItemViewEvent instanceof s5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.f.b);
            return;
        }
        if (clipItemViewEvent instanceof u5d) {
            xn50.a.c(o1dVar, ClipItemAction.h0.c.g.b);
            return;
        }
        if (clipItemViewEvent instanceof k6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.g(((k6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof o6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.k());
            return;
        }
        if (clipItemViewEvent instanceof j6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.f(((j6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof f6d) {
            f6d f6dVar = (f6d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.m0.b(f6dVar.b, f6dVar.c, f6dVar.d));
            return;
        }
        if (clipItemViewEvent instanceof m6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.i(((m6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof g6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.c(((g6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof s6d) {
            xn50.a.c(o1dVar, ClipItemAction.m0.n.b);
            return;
        }
        if (clipItemViewEvent instanceof l6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.h(((l6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof p6d) {
            xn50.a.c(o1dVar, ClipItemAction.m0.l.b);
            return;
        }
        if (clipItemViewEvent instanceof r6d) {
            return;
        }
        if (clipItemViewEvent instanceof h6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.d(((h6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof e6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.a(((e6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof q6d) {
            xn50.a.c(o1dVar, new ClipItemAction.m0.m(((q6d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof i6d) {
            xn50.a.c(o1dVar, ClipItemAction.m0.e.b);
            return;
        }
        if (clipItemViewEvent instanceof n6d) {
            xn50.a.c(o1dVar, ClipItemAction.m0.j.b);
            return;
        }
        if (clipItemViewEvent instanceof t6d) {
            t6d t6dVar = (t6d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.m0.o(t6dVar.b, t6dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof u4d) {
            xn50.a.c(o1dVar, ClipItemAction.g.b.b);
            return;
        }
        if (clipItemViewEvent instanceof t4d) {
            xn50.a.c(o1dVar, ClipItemAction.g.a.b);
            return;
        }
        if (clipItemViewEvent instanceof v4d) {
            xn50.a.c(o1dVar, new ClipItemAction.g.c(((v4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof x4d) {
            xn50.a.c(o1dVar, new ClipItemAction.g.e(((x4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof w4d) {
            xn50.a.c(o1dVar, new ClipItemAction.g.d(((w4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof b5d) {
            xn50.a.c(o1dVar, new ClipItemAction.i.d(((b5d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof z4d) {
            xn50.a.c(o1dVar, new ClipItemAction.i.b(((z4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof a5d) {
            a5d a5dVar = (a5d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.i.c(a5dVar.b, a5dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof c5d) {
            xn50.a.c(o1dVar, ClipItemAction.i.e.b);
            return;
        }
        if (clipItemViewEvent instanceof y4d) {
            xn50.a.c(o1dVar, ClipItemAction.i.a.b);
            return;
        }
        if (clipItemViewEvent instanceof g5d) {
            xn50.a.c(o1dVar, new ClipItemAction.g0.a(new com.vk.movika.sdk.base.observable.w(o1dVar, 22)));
            return;
        }
        if (clipItemViewEvent instanceof h5d) {
            xn50.a.c(o1dVar, new ClipItemAction.g0.b(new pz(o1dVar, 16)));
            return;
        }
        if (clipItemViewEvent instanceof j3d) {
            xn50.a.c(o1dVar, new ClipItemAction.a.c(((j3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof k3d) {
            xn50.a.c(o1dVar, new ClipItemAction.a.e(((k3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof l3d) {
            xn50.a.c(o1dVar, ClipItemAction.a.b.b);
            return;
        }
        if (clipItemViewEvent instanceof i3d) {
            xn50.a.c(o1dVar, ClipItemAction.a.C0651a.b);
            return;
        }
        if (clipItemViewEvent instanceof m3d) {
            xn50.a.c(o1dVar, ClipItemAction.a.d.b);
            return;
        }
        if (clipItemViewEvent instanceof f4d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.q(((f4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof g4d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.u(((g4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof j4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.r.b);
            return;
        }
        if (clipItemViewEvent instanceof u3d) {
            xn50.a.c(o1dVar, ClipItemAction.d.C0653d.b);
            return;
        }
        if (clipItemViewEvent instanceof s3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.b(((s3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof b4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.k.b);
            return;
        }
        if (clipItemViewEvent instanceof x3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.g(((x3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof y3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.h(((y3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof r3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.a(((r3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof t3d) {
            xn50.a.c(o1dVar, ClipItemAction.d.c.b);
            return;
        }
        if (clipItemViewEvent instanceof z3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.i(((z3d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof i4d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.p(((i4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof h4d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.o(((h4d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof v3d) {
            v3d v3dVar = (v3d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.d.e(v3dVar.b, v3dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof a4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.j.b);
            return;
        }
        if (clipItemViewEvent instanceof k4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.s.b);
            return;
        }
        if (clipItemViewEvent instanceof l4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.t.b);
            return;
        }
        if (clipItemViewEvent instanceof m4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.v.b);
            return;
        }
        if (clipItemViewEvent instanceof o4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.x.b);
            return;
        }
        if (clipItemViewEvent instanceof n4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.w.b);
            return;
        }
        if (clipItemViewEvent instanceof w3d) {
            xn50.a.c(o1dVar, new ClipItemAction.d.f(((w3d) clipItemViewEvent).b.e().a(context)));
            return;
        }
        if (clipItemViewEvent instanceof d4d) {
            d4d d4dVar = (d4d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.d.m(d4dVar.b, d4dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof e4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.n.b);
            return;
        }
        if (clipItemViewEvent instanceof c4d) {
            xn50.a.c(o1dVar, ClipItemAction.d.l.b);
            return;
        }
        if (clipItemViewEvent instanceof d6d) {
            xn50.a.c(o1dVar, ClipItemAction.Tooltip.c.b);
            return;
        }
        if (clipItemViewEvent instanceof a6d) {
            xn50.a.c(o1dVar, ClipItemAction.Tooltip.a.b);
            return;
        }
        if (clipItemViewEvent instanceof c6d) {
            xn50.a.c(o1dVar, ClipItemAction.Tooltip.Hide.DELAYED_WITH_ANIMATION);
            return;
        }
        if (clipItemViewEvent instanceof b6d) {
            xn50.a.c(o1dVar, ClipItemAction.Tooltip.Hide.ANIMATED);
            return;
        }
        if (clipItemViewEvent instanceof r4d) {
            r4d r4dVar = (r4d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.k(r4dVar.b, r4dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof s4d) {
            s4d s4dVar = (s4d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.l(s4dVar.b, s4dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof q4d) {
            q4d q4dVar = (q4d) clipItemViewEvent;
            xn50.a.c(o1dVar, new ClipItemAction.e0(q4dVar.b, q4dVar.c));
            return;
        }
        if (clipItemViewEvent instanceof y5d) {
            xn50.a.c(o1dVar, ClipItemAction.k0.a.b);
            return;
        }
        if (clipItemViewEvent instanceof f5d) {
            xn50.a.c(o1dVar, new ClipItemAction.Nps.b(((f5d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof d5d) {
            xn50.a.c(o1dVar, new ClipItemAction.Nps.b(((d5d) clipItemViewEvent).b));
            return;
        }
        if (clipItemViewEvent instanceof e5d) {
            xn50.a.c(o1dVar, ClipItemAction.Nps.c.b);
            return;
        }
        if (!(clipItemViewEvent instanceof p4d)) {
            if (clipItemViewEvent instanceof z5d) {
                xn50.a.c(o1dVar, ClipItemAction.k0.b.b);
                return;
            }
            if (clipItemViewEvent instanceof q3d) {
                xn50.a.c(o1dVar, ClipItemAction.b.d.b);
                return;
            }
            if (clipItemViewEvent instanceof p3d) {
                xn50.a.c(o1dVar, ClipItemAction.b.c.b);
                return;
            }
            if (clipItemViewEvent instanceof o3d) {
                xn50.a.c(o1dVar, ClipItemAction.b.C0652b.b);
                return;
            } else {
                if (!(clipItemViewEvent instanceof n3d)) {
                    throw new NoWhenBranchMatchedException();
                }
                n3d n3dVar = (n3d) clipItemViewEvent;
                xn50.a.c(o1dVar, new ClipItemAction.b.a(n3dVar.b, n3dVar.c, n3dVar.d));
                return;
            }
        }
        p16 p16Var = o1dVar.H;
        ConstraintLayout f = o1dVar.getOverlayRenderLayer().c().getValue().f();
        FrameLayout j = o1dVar.getOverlayRenderLayer().c().getValue().j();
        p4d p4dVar = (p4d) clipItemViewEvent;
        int i = p4dVar.b;
        Integer num = p4dVar.e;
        UserId userId = p4dVar.f;
        List<String> list = p4dVar.c;
        String str = p4dVar.d;
        h5 h5Var = new h5(o1dVar, 27);
        p16Var.getClass();
        if (j.getChildCount() != 0) {
            View childAt = j.getChildAt(0);
            if (childAt instanceof z16) {
                z16Var = (z16) childAt;
                p16Var.g = z16Var;
                if (z16Var != null) {
                    p16Var.c = h5Var;
                    zu50 zu50Var5 = new zu50(i, (bp50) p16Var.h.getValue(), z16Var.getContext());
                    u6z0 u6z0Var = zu50Var5.a;
                    u6z0Var.a.i(String.valueOf(p16Var.a.c().b));
                    if (dmx0.c()) {
                        u6z0Var.a.g("is_whitelist_internet", "1");
                    }
                    zu50Var5.i = (p16.d) p16Var.k.getValue();
                    zu50Var5.l = (p16.c) p16Var.i.getValue();
                    p16Var.f = new p16.b(f, z16Var);
                    p16Var.d = zu50Var5;
                    z16Var.setOnLickListener(new q16(p16Var));
                }
                if (list != null) {
                    List<String> list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        String g0 = j5g.g0(list2, StringUtils.COMMA, null, null, 0, null, 62);
                        zu50 zu50Var6 = p16Var.d;
                        if (zu50Var6 != null && (qnkVar4 = zu50Var6.a.a) != null) {
                            qnkVar4.g("wb_item_id", g0);
                        }
                    }
                }
                if (str != null && (zu50Var4 = p16Var.d) != null && (qnkVar3 = zu50Var4.a.a) != null) {
                    qnkVar3.g("articles", str);
                }
                intValue = num.intValue();
                zu50Var = p16Var.d;
                if (zu50Var != null && (qnkVar2 = zu50Var.a.a) != null) {
                    qnkVar2.g("clip_id", String.valueOf(intValue));
                }
                if (userId != null && (zu50Var3 = p16Var.d) != null && (qnkVar = zu50Var3.a.a) != null) {
                    qnkVar.g("owner_id", String.valueOf(userId.b));
                }
                izsVar = p16Var.c;
                if (izsVar != null) {
                    izsVar.invoke(ClipItemAction.e.c.b);
                }
                zu50Var2 = p16Var.d;
                if (zu50Var2 == null) {
                    zu50Var2.g();
                    return;
                }
                return;
            }
        }
        z16Var = null;
        p16Var.g = z16Var;
        if (z16Var != null) {
        }
        if (list != null) {
        }
        if (str != null) {
            qnkVar3.g("articles", str);
        }
        intValue = num.intValue();
        zu50Var = p16Var.d;
        if (zu50Var != null) {
            qnkVar2.g("clip_id", String.valueOf(intValue));
        }
        if (userId != null) {
            qnkVar.g("owner_id", String.valueOf(userId.b));
        }
        izsVar = p16Var.c;
        if (izsVar != null) {
        }
        zu50Var2 = p16Var.d;
        if (zu50Var2 == null) {
        }
    }

    public static s3q0 u(o1d o1dVar, wch0 wch0Var) {
        o1dVar.getRenderEventsHandler().a(new r2d.a(wch0Var));
        return s3q0.a;
    }

    public static w6d v(o1d o1dVar) {
        int i = (!o1dVar.A || o1dVar.r0) ? R.id.fullscreen_clip_container : R.id.fullscreen_clip_controls_container;
        return new w6d(o1dVar, o1dVar.m, o1dVar.x, o1dVar.v, i, o1dVar.getProductAttachesHolder(), o1dVar.getViewOwner(), o1dVar.x0, o1dVar.h, o1dVar.k, o1dVar.I, o1dVar.A0, o1dVar.g.a());
    }

    public static b2d w(o1d o1dVar, Lazy lazy) {
        return new b2d(lazy, o1dVar.x0, o1dVar.getSdkComponent().Df(), o1dVar.w0, o1dVar.getSdkComponent().o(), o1dVar.q, o1dVar.Q, o1dVar.A);
    }

    public static s3q0 x(o1d o1dVar, j2d j2dVar) {
        o1dVar.getOverlayRenderLayer().getRenderer().getValue().c(j2dVar);
        return s3q0.a;
    }

    public static tyf y(o1d o1dVar) {
        return new tyf(o1dVar.x0, o1dVar.v, o1dVar.getCoauthorsComponent(), o1dVar.g.a(), new j70(o1dVar, 20));
    }

    public static s3q0 z(o1d o1dVar, String str) {
        o1dVar.getRenderEventsHandler().a(new r2d.b(str));
        return s3q0.a;
    }

    @Override // xsna.xn50
    @SuppressLint({"WrongThread"})
    public final mk50 Fl() {
        if (this.A) {
            return new mk50.b(R.layout.fullscreen_clip_item_lite);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fullscreen_clip_item, (ViewGroup) null, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fullscreen_clip_item_controls_stub);
        viewStub.setLayoutResource(getOverlayRenderLayer().b());
        viewStub.inflate();
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        y6d y6dVar = (y6d) ao50Var;
        if (!this.A || this.r0) {
            P();
        } else {
            this.S = rl3.I(new View[]{getVideoBaseViewsContainer().getVideoTextureViewAdapter().getView(), getVideoBaseViewsContainer().c(), getVideoBaseViewsContainer().b().getView()});
            this.T = Collections.singletonList(getVideoBaseViewsContainer().m());
            this.U = EmptyList.b;
        }
        if (!this.v.U()) {
            x0d immediatelyViewEventHandler = getImmediatelyViewEventHandler();
            o5s0 videoBaseViewsContainer = getVideoBaseViewsContainer();
            Lazy<i2d> renderer = getOverlayRenderLayer().getRenderer();
            x0d.c cVar = immediatelyViewEventHandler.c;
            if (cVar instanceof x0d.b) {
                x0d.b bVar = (x0d.b) cVar;
                x0d.a aVar = x0d.this.new a(videoBaseViewsContainer, this.w0, renderer);
                Iterator it = bVar.a.iterator();
                while (it.hasNext()) {
                    aVar.a((ClipItemViewEvent) it.next());
                }
                immediatelyViewEventHandler.c = aVar;
            }
        }
        gm50.a.b(this, y6dVar.a, new w5(this, 19));
        gm50.a.b(this, y6dVar.b, new on(this, 18));
        gm50.a.b(this, y6dVar.c, new k00(this, 25));
        this.W = true;
    }

    public final void K() {
        mid0 productAttachesHolder = getProductAttachesHolder();
        if (productAttachesHolder != null) {
            productAttachesHolder.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02f3, code lost:
    
        if (r4.length() > 0) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(FeedItem.f fVar, int i) {
        Long l;
        boolean z;
        ArrayList<oih0> Ma;
        ?? r2;
        ArrayList w6;
        Iterable iterable;
        EmptyList emptyList;
        Collection collection;
        mid0 productAttachesHolder;
        boolean z2;
        smc smcVar;
        smc smcVar2;
        l20 l20Var;
        String str;
        Iterator it;
        Iterable iterable2;
        c5u c5uVar;
        boolean z3;
        p7u p7uVar;
        d5u d5uVar;
        j5u j5uVar;
        ArrayList arrayList;
        Iterator it2;
        UserId userId;
        int i2;
        dly dlyVar;
        boolean z4;
        SdkClipVideoFile sdkClipVideoFile = fVar.e;
        kih0 kih0Var = fVar.h;
        long position = kih0Var.getPosition();
        if (position < 0) {
            position = 0;
        }
        zof zofVar = this.v;
        maf J = zofVar.J();
        Integer num = null;
        if (!J.a) {
            J = null;
        }
        lyc lycVar = this.l;
        if (J != null) {
            ClipFeedTab.Discover discover = ClipFeedTab.Discover.b;
            ClipFeedTab clipFeedTab = lycVar.a;
            discover.getClass();
            l = Long.valueOf(ClipFeedTab.Ab(clipFeedTab) ? 0L : J.c);
        } else {
            l = null;
        }
        qzb0.a aVar = new qzb0.a(we7.l(sdkClipVideoFile, position, l), we7.k(sdkClipVideoFile, position), we7.j(sdkClipVideoFile, position));
        qzb0.e eVar = new qzb0.e();
        qzb0.c cVar = new qzb0.c();
        if (sdkClipVideoFile.d3() == null || !(!r4.b.isEmpty())) {
            SdkClipsAdsFeaturesParams d3 = sdkClipVideoFile.d3();
            if ((d3 != null ? d3.d : null) == null) {
                z = false;
                qzb0 qzb0Var = new qzb0(aVar, eVar, cVar, new qzb0.b(false, false, z), new qzb0.d(false, false));
                ClipVideoFileAdapter copy = sdkClipVideoFile.copy();
                ClipVideoFile clipVideoFile = copy.m;
                clipVideoFile.U1 = sdkClipVideoFile.U6();
                clipVideoFile.V1 = sdkClipVideoFile.L5();
                clipVideoFile.W1 = sdkClipVideoFile.S6();
                this.x0.a(new ClipItemViewEvent.a(copy, fVar, new j4b0(kih0Var), i, qzb0Var));
                if (sdkClipVideoFile.K3() != null && (!r1.isEmpty())) {
                    com.vk.toggle.b.A.o(ClipsFeatures.CLIPS_PRODUCT_ITEMS_SHOW_TIME);
                }
                Ma = sdkClipVideoFile.Ma();
                if (Ma == null) {
                    r2 = new ArrayList(c5g.u(Ma, 10));
                    for (oih0 oih0Var : Ma) {
                        r2.add(new vrv0(oih0Var.a(), oih0Var.getTitle(), oih0Var.getImage(), oih0Var.getUrl(), new vrv0.a(oih0Var.b().a, oih0Var.b().b, oih0Var.b().c, oih0Var.b().d)));
                    }
                } else {
                    r2 = EmptyList.b;
                }
                w6 = sdkClipVideoFile.w6();
                if (w6 == null) {
                    ?? arrayList2 = new ArrayList();
                    Iterator it3 = w6.iterator();
                    Iterable iterable3 = r2;
                    while (it3.hasNext()) {
                        nih0 nih0Var = (nih0) it3.next();
                        SdkGood b = nih0Var.b();
                        if (b != null) {
                            Good a2 = com.vk.clips.viewer.impl.adapters.b.a(b);
                            Price price = a2.h;
                            long j = a2.b;
                            UserId userId2 = a2.c;
                            String str2 = a2.d;
                            int i3 = price.g;
                            it = it3;
                            boolean z5 = a2.V;
                            Image image = a2.n;
                            c530 b2 = e530.b(a2, num);
                            String a3 = nih0Var.a();
                            d5u d5uVar2 = new d5u(price.e, price.f, price.i);
                            boolean z6 = a2.J;
                            MarketRejectInfo marketRejectInfo = a2.e0;
                            boolean z7 = marketRejectInfo != null ? marketRejectInfo.g : false;
                            boolean Bb = a2.Bb();
                            MarketItemRating marketItemRating = a2.t;
                            if (marketItemRating != null) {
                                z3 = z6;
                                p7uVar = new p7u(marketItemRating.b, marketItemRating.d);
                            } else {
                                z3 = z6;
                                p7uVar = null;
                            }
                            Owner owner = a2.M;
                            if (owner != null) {
                                UserId userId3 = owner.b;
                                iterable2 = iterable3;
                                String str3 = owner.c;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                VerifyInfo verifyInfo = owner.f;
                                if (verifyInfo != null) {
                                    d5uVar = d5uVar2;
                                    if (verifyInfo.b) {
                                        z4 = true;
                                        j5uVar = new j5u(userId3, str3, z4);
                                    }
                                } else {
                                    d5uVar = d5uVar2;
                                }
                                z4 = false;
                                j5uVar = new j5u(userId3, str3, z4);
                            } else {
                                iterable2 = iterable3;
                                d5uVar = d5uVar2;
                                j5uVar = null;
                            }
                            List<GoodBadge> list = a2.O;
                            if (list != null) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    GoodBadge goodBadge = (GoodBadge) it4.next();
                                    GoodBadge.BadgeType.a aVar2 = GoodBadge.BadgeType.Companion;
                                    GoodBadge.BadgeType badgeType = goodBadge.c;
                                    Integer valueOf = badgeType != null ? Integer.valueOf(badgeType.i()) : null;
                                    aVar2.getClass();
                                    GoodBadge.BadgeType a4 = GoodBadge.BadgeType.a.a(valueOf);
                                    String str4 = goodBadge.b;
                                    List<BaseImageDto> list2 = goodBadge.h;
                                    if (list2 != null) {
                                        Serializer.c<com.vk.dto.market.GoodBadge> cVar2 = com.vk.dto.market.GoodBadge.CREATOR;
                                        it2 = it4;
                                        userId = userId2;
                                        i2 = i3;
                                        dlyVar = new dly(GoodBadge.a.c(list2), GoodBadge.a.a(list2), GoodBadge.a.d(list2), GoodBadge.a.b(list2));
                                    } else {
                                        it2 = it4;
                                        userId = userId2;
                                        i2 = i3;
                                        dlyVar = null;
                                    }
                                    arrayList3.add(new com.vk.ecomm.clipproductattaches.models.GoodBadge(a4, str4, dlyVar));
                                    it4 = it2;
                                    userId2 = userId;
                                    i3 = i2;
                                }
                                arrayList = arrayList3;
                            } else {
                                arrayList = null;
                            }
                            c5uVar = new c5u(j, userId2, str2, d5uVar, i3, z5, image, b2, a3, z3, z7, Bb, p7uVar, j5uVar, arrayList);
                        } else {
                            it = it3;
                            iterable2 = iterable3;
                            c5uVar = null;
                        }
                        c5u c5uVar2 = c5uVar != null ? c5uVar : null;
                        if (c5uVar2 != null) {
                            arrayList2.add(c5uVar2);
                        }
                        it3 = it;
                        iterable3 = iterable2;
                        num = null;
                    }
                    iterable = iterable3;
                    emptyList = arrayList2;
                } else {
                    iterable = r2;
                    emptyList = EmptyList.b;
                }
                if (zofVar.P().a != ClipsButtonToVideoConfig.Variant.NONE || zofVar.P().a()) {
                    collection = EmptyList.b;
                } else {
                    SdkActionLink m1 = sdkClipVideoFile.m1();
                    if (m1 == null || !m1.e.equals("video")) {
                        m1 = null;
                    }
                    ActionLinkSnippet actionLinkSnippet = m1 != null ? m1.g : null;
                    if (actionLinkSnippet != null) {
                        String a5 = actionLinkSnippet.h.a(300);
                        Image image2 = a5 != null ? new Image((List<ImageSize>) Collections.singletonList(new ImageSize(a5, 300, 300, null, (char) 0, false, 56, null))) : null;
                        if (image2 != null && actionLinkSnippet.b.length() != 0 && m1.f.length() != 0) {
                            if (zofVar.P().a == ClipsButtonToVideoConfig.Variant.EXPANDED_CAROUSEL) {
                                String str5 = actionLinkSnippet.e;
                                if (str5.length() <= 0) {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str5 = m1.d;
                                }
                                str = str5;
                                String str6 = m1.b;
                                String str7 = actionLinkSnippet.b;
                                String str8 = actionLinkSnippet.c;
                                String str9 = m1.f;
                                ActionLinkSnippetIcon actionLinkSnippetIcon = actionLinkSnippet.l;
                                l20Var = new l20(str6, image2, str7, str8, str, str9, actionLinkSnippetIcon == null ? actionLinkSnippetIcon.i() : null);
                                collection = e43.m(l20Var);
                            }
                            str = null;
                            String str62 = m1.b;
                            String str72 = actionLinkSnippet.b;
                            String str82 = actionLinkSnippet.c;
                            String str92 = m1.f;
                            ActionLinkSnippetIcon actionLinkSnippetIcon2 = actionLinkSnippet.l;
                            l20Var = new l20(str62, image2, str72, str82, str, str92, actionLinkSnippetIcon2 == null ? actionLinkSnippetIcon2.i() : null);
                            collection = e43.m(l20Var);
                        }
                    }
                    l20Var = null;
                    collection = e43.m(l20Var);
                }
                productAttachesHolder = getProductAttachesHolder();
                if (productAttachesHolder == null) {
                    ArrayList u0 = j5g.u0(emptyList, j5g.u0(iterable, collection));
                    int o0 = sdkClipVideoFile.o0();
                    UserId I0 = sdkClipVideoFile.I0();
                    ClipFeedTab clipFeedTab2 = lycVar.a;
                    if (clipFeedTab2 instanceof ClipFeedTab.SingleClipFromBlock) {
                        int i4 = a.$EnumSwitchMapping$0[((ClipFeedTab.SingleClipFromBlock) clipFeedTab2).d.ordinal()];
                        smcVar2 = i4 != 1 ? i4 != 2 ? smc.a.a : smc.f.a : smc.b.a;
                        z2 = true;
                    } else {
                        if (clipFeedTab2 instanceof ClipFeedTab.ClipsFromShopsSource) {
                            int i5 = a.$EnumSwitchMapping$1[((ClipFeedTab.ClipsFromShopsSource) clipFeedTab2).Fb().ordinal()];
                            z2 = true;
                            if (i5 == 1) {
                                smcVar = smc.d.a;
                            } else if (i5 == 2) {
                                smcVar = smc.e.a;
                            } else if (i5 == 3) {
                                smcVar = smc.c.a;
                            } else {
                                if (i5 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                smcVar = smc.g.a;
                            }
                        } else {
                            z2 = true;
                            smcVar = smc.a.a;
                        }
                        smcVar2 = smcVar;
                    }
                    productAttachesHolder.d(u0, new tmc(o0, I0, smcVar2, true, false, new k64(16, 12), zofVar.P().a == ClipsButtonToVideoConfig.Variant.COMPACT_CAROUSEL ? z2 : false), new v53(5, this, sdkClipVideoFile));
                    return;
                }
                return;
            }
        }
        z = true;
        qzb0 qzb0Var2 = new qzb0(aVar, eVar, cVar, new qzb0.b(false, false, z), new qzb0.d(false, false));
        ClipVideoFileAdapter copy2 = sdkClipVideoFile.copy();
        ClipVideoFile clipVideoFile2 = copy2.m;
        clipVideoFile2.U1 = sdkClipVideoFile.U6();
        clipVideoFile2.V1 = sdkClipVideoFile.L5();
        clipVideoFile2.W1 = sdkClipVideoFile.S6();
        this.x0.a(new ClipItemViewEvent.a(copy2, fVar, new j4b0(kih0Var), i, qzb0Var2));
        if (sdkClipVideoFile.K3() != null) {
            com.vk.toggle.b.A.o(ClipsFeatures.CLIPS_PRODUCT_ITEMS_SHOW_TIME);
        }
        Ma = sdkClipVideoFile.Ma();
        if (Ma == null) {
        }
        w6 = sdkClipVideoFile.w6();
        if (w6 == null) {
        }
        if (zofVar.P().a != ClipsButtonToVideoConfig.Variant.NONE) {
        }
        collection = EmptyList.b;
        productAttachesHolder = getProductAttachesHolder();
        if (productAttachesHolder == null) {
        }
    }

    public final void M() {
        mid0 productAttachesHolder = getProductAttachesHolder();
        if (productAttachesHolder != null) {
            productAttachesHolder.c();
        }
    }

    public final void N(ClipItemTooltipEvent clipItemTooltipEvent) {
        if (clipItemTooltipEvent instanceof ClipItemTooltipEvent.c) {
            g5p0 g5p0Var = this.s0;
            if (g5p0Var != null) {
                g5p0Var.a(k15.z(((ClipItemTooltipEvent.c) clipItemTooltipEvent).b));
                return;
            }
            return;
        }
        if (clipItemTooltipEvent instanceof ClipItemTooltipEvent.e) {
            g5p0 g5p0Var2 = this.s0;
            if (g5p0Var2 != null) {
                h3d h3dVar = g5p0Var2.c;
                qzb0.e eVar = ((ClipItemTooltipEvent.e) clipItemTooltipEvent).b;
                if (!g5p0Var2.i && eVar.a) {
                    g5p0Var2.i = true;
                    g5p0Var2.b();
                }
                if (g5p0Var2.j || !eVar.b) {
                    return;
                }
                g5p0Var2.j = true;
                ClipVideoFile clipVideoFile = g5p0Var2.d;
                if (clipVideoFile == null) {
                    return;
                }
                ClipVideoFileAdapter clipVideoFileAdapter = new ClipVideoFileAdapter(clipVideoFile);
                ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType = ClipFeedTooltip$ClipFeedTooltipType.DOUBLE_TAP_ONBOARDING;
                if (h3dVar.Ue(clipVideoFileAdapter, clipFeedTooltip$ClipFeedTooltipType).a) {
                    h3dVar.X6(new ClipVideoFileAdapter(clipVideoFile), clipFeedTooltip$ClipFeedTooltipType, null);
                    h3dVar.El();
                    g5p0Var2.b.a(d6d.b);
                    return;
                }
                return;
            }
            return;
        }
        if (clipItemTooltipEvent instanceof ClipItemTooltipEvent.f) {
            g5p0 g5p0Var3 = this.s0;
            if (g5p0Var3 == null || g5p0Var3.h) {
                return;
            }
            g5p0Var3.h = true;
            g5p0Var3.b();
            return;
        }
        if (clipItemTooltipEvent instanceof ClipItemTooltipEvent.d) {
            g5p0 g5p0Var4 = this.s0;
            if (g5p0Var4 == null || g5p0Var4.g) {
                return;
            }
            g5p0Var4.g = true;
            g5p0Var4.b();
            return;
        }
        if (!(clipItemTooltipEvent instanceof ClipItemTooltipEvent.a)) {
            if (!(clipItemTooltipEvent instanceof ClipItemTooltipEvent.HideTooltip)) {
                if (!(clipItemTooltipEvent instanceof ClipItemTooltipEvent.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.k.Qe(getResources().getString(R.string.clip_restriction_text));
                return;
            } else {
                g5p0 g5p0Var5 = this.s0;
                if (g5p0Var5 != null) {
                    g5p0Var5.a.g(clipItemTooltipEvent == ClipItemTooltipEvent.HideTooltip.ANIMATED);
                    return;
                }
                return;
            }
        }
        g5p0 g5p0Var6 = this.s0;
        if (g5p0Var6 != null) {
            y1d y1dVar = g5p0Var6.a;
            ClipVideoFile clipVideoFile2 = g5p0Var6.d;
            if (clipVideoFile2 != null && g5p0Var6.c.Ue(new ClipVideoFileAdapter(clipVideoFile2), ClipFeedTooltip$ClipFeedTooltipType.SOUND_CANNOT_BE_USED).a) {
                int i = g5p0.a.$EnumSwitchMapping$0[clipVideoFile2.I1.ordinal()];
                if (i == 1 || i == 2) {
                    y1dVar.m(TooltipType.UNAVAILABLE_SOUND);
                } else {
                    if (i != 3) {
                        return;
                    }
                    y1dVar.m(TooltipType.SOUND_MODERATION_NOT_PASSED);
                }
            }
        }
    }

    public final void P() {
        y1d value = getOverlayRenderLayer().c().getValue();
        this.S = e43.l(getVideoBaseViewsContainer().getVideoTextureViewAdapter().getView(), getVideoBaseViewsContainer().c(), getVideoBaseViewsContainer().b().getView());
        this.T = j5g.u0(value.getFadeTransitionViews(), Collections.singletonList(getVideoBaseViewsContainer().m()));
        this.U = value.getFastFadeViews();
        getOverlayRenderLayer().c().getValue().a();
        g5p0 g5p0Var = new g5p0(getOverlayRenderLayer().c().getValue(), this.x0, this.k);
        ArrayList arrayList = this.u0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N((ClipItemTooltipEvent) it.next());
        }
        arrayList.clear();
        this.s0 = g5p0Var;
        this.t0 = new l0d(this, this.B);
    }

    public final void Q() {
        getVideoBaseViewsContainer().getVideoTextureViewAdapter().c();
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.clips.sdk.shared.item.clip.a aVar = (com.vk.clips.sdk.shared.item.clip.a) vk50Var;
        int i = 27;
        getFeature().y.a(new p1(this, i), getViewOwner());
        getFeature().A.a(new p40(this, i), getViewOwner());
        aVar.B.a(new k9(this, i), getViewOwner());
        aVar.C.a(new v5(this, 20), getViewOwner());
        getFeature().z.a(new qm1(this, 24), getViewOwner());
    }

    public final k0d getBadgeEventHandler() {
        return this.A0;
    }

    public final List<View> getFadeTransitionViews() {
        return this.T;
    }

    public final List<View> getFastFadeViews() {
        return this.U;
    }

    public final wp50 getMyTargetFacade() {
        return this.a0;
    }

    public final List<View> getTranslationTransitionViews() {
        return this.S;
    }

    public final gxp0.a getUiVisibilityConfigChangedListener() {
        return this.z0;
    }

    public final VideoTextureViewAdapter getVideoTextureViewAdapter() {
        return getVideoBaseViewsContainer().getVideoTextureViewAdapter();
    }

    public final f3d getVideoUIEventListener() {
        return this.y0;
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.a(ClipItemViewEvent.e.b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r0) {
            cleanupLayoutState(getOverlayRenderLayer().c().getValue().getRootContainer());
            cleanupLayoutState(getOverlayRenderLayer().c().getValue().f());
        }
        w2d w2dVar = (w2d) getRenderEventsHandler().c.getValue();
        Window a2 = w2dVar.c.a();
        View decorView = a2 != null ? a2.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.post(new ic3(w2dVar, 2));
        }
        this.x0.a(ClipItemViewEvent.g.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getGestureDetector().onTouchEvent(motionEvent);
        return true;
    }

    public final void setControlsView(View view) {
        if (this.r0) {
            return;
        }
        addView(view);
        if (this.W) {
            P();
        }
        this.r0 = true;
        getOverlayRenderLayer().getRenderer().getValue().a();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        zn50 zn50Var = new zn50(getAuthBridge());
        com.vk.clips.sdk.shared.item.clip.b bVar = new com.vk.clips.sdk.shared.item.clip.b(this.v, this.P, getOverlayRenderLayer().a().getValue());
        su suVar = new su(this.n.h());
        n0d n0dVar = new n0d(getContext(), new z6e(this.o), new e0a(getSdkComponent().h()), new s0d(this.w), this.v);
        ClipFeedTab clipFeedTab = this.l.a;
        xne Y = getClipsViewerComponent().Y();
        m0x Hf = getClipsViewerComponentInternal().Hf();
        getModerationComponent().uf();
        v7x v7xVar = new v7x(getModerationComponent().bd(), 4);
        nwy nwyVar = getClipsViewerComponentInternal().V;
        qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
        qcy<Object> qcyVar = qcyVarArr[34];
        bd80 bd80Var = (bd80) nwyVar.c();
        ojh0 h = getSdkComponent().h();
        y1e K0 = getClipsViewerComponent().K0();
        nwy nwyVar2 = getSdkComponent().g;
        qcy<Object> qcyVar2 = ClipsViewersSdkComponentImpl.l[4];
        plh0 plh0Var = (plh0) nwyVar2.c();
        b0d J6 = getClipsViewerComponent().J6();
        nwy nwyVar3 = getClipsViewerComponentInternal().G;
        qcy<Object> qcyVar3 = qcyVarArr[19];
        return new com.vk.clips.sdk.shared.item.clip.a(bVar, suVar, this.h, this.r, n0dVar, clipFeedTab, this.v, Y, Hf, this.G, v7xVar, bd80Var, h, zn50Var, K0, J6, plh0Var, this.D, this.E, this.F, (vdd) nwyVar3.c(), this.I, new yas0(fxc0.B().J().y0()), new zrx0(new tnj0(this.J, this.K, this.L), this.M, this.N));
    }

    private static /* synthetic */ void getRenderLayerRedesign$annotations() {
    }
}
