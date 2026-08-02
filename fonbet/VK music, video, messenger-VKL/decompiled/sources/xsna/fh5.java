package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.ProgressView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.tooltips.WatchLaterTooltip;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.ad.ux.AdRedirectView;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import one.video.view.subtitles.BaseSubtitleView;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.e3m;
import xsna.epx;
import xsna.j3i0;
import xsna.sox;
import xsna.uoj0;
import xsna.wfk0;
import xsna.xcs0;
import xsna.ye0;
import xsna.zpx;

/* compiled from: AutoPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class fh5 extends uc implements gsx0, po2, hnt0, ebs0 {
    public final View A;
    public BaseAdsDataProvider A0;
    public final View B;
    public bgn B0;
    public final View C;
    public boolean C0;
    public final xb60 D;
    public final w40 D0;
    public final ProgressBar E;
    public io.reactivex.rxjava3.disposables.c E0;
    public final j3i0 F;
    public ActionLink F0;
    public final wfk0 G;
    public final uls0 G0;
    public final ImageView H;
    public final uoj0 H0;
    public final View I;
    public d I0;
    public final InteractiveDurationView J;
    public ch5 J0;
    public final BaseSubtitleView K;
    public final boolean K0;
    public final VideoOverlayView L;
    public final boolean L0;
    public final VideoErrorView M;
    public final SpectatorsCounterView N;
    public final boolean O;
    public final boolean P;
    public final ActionLinkView Q;
    public final VideoAdLayout R;
    public final a1p0 S;
    public final View T;
    public final boolean U;
    public final wqj V;
    public final View W;
    public final y1f X;
    public final io2 Y;
    public final jh5 Z;
    public final View a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public boolean f0;
    public final bpn0 g0;
    public final bpn0 h0;
    public final bpn0 i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Drawable m0;
    public final Context n0;
    public final PorterDuffColorFilter o0;
    public final PorterDuffColorFilter p0;
    public final PorterDuffColorFilter q0;
    public final bpn0 r0;
    public boolean s0;
    public a t0;
    public final sj0 u;
    public a u0;
    public final VideoTextureView v;
    public boolean v0;
    public final ViewGroup w;
    public u12 w0;
    public final float x;
    public boolean x0;
    public final View y;
    public t3h y0;
    public final zpx z;
    public qi6 z0;

    /* compiled from: AutoPlayDelegate.kt */
    public static final class a {
        public String a;
        public int b;
        public AbstractC2870a c;
        public String d;
        public boolean e;
        public boolean f;

        /* compiled from: AutoPlayDelegate.kt */
        /* renamed from: xsna.fh5$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2870a {

            /* compiled from: AutoPlayDelegate.kt */
            /* renamed from: xsna.fh5$a$a$a, reason: collision with other inner class name */
            public static final class C2871a extends AbstractC2870a {
                public static final C2871a a = new C2871a();
            }

            /* compiled from: AutoPlayDelegate.kt */
            /* renamed from: xsna.fh5$a$a$b */
            public static final class b extends AbstractC2870a {
                public final String a;

                public b(String str) {
                    this.a = str;
                }
            }
        }

        public a() {
            AbstractC2870a.C2871a c2871a = AbstractC2870a.C2871a.a;
            this.a = "PREVIEW";
            this.b = 0;
            this.c = c2871a;
            this.d = "";
            this.e = false;
            this.f = false;
        }

        public final boolean a() {
            return epx.f(this.a, "AD");
        }

        public final boolean b() {
            return epx.f(this.a, "COMPLETED");
        }

        public final boolean c() {
            return epx.f(this.a, "ERROR");
        }

        public final boolean d() {
            return epx.f(this.a, "PLAYING");
        }

        public final boolean e() {
            return epx.f(this.a, "PREVIEW");
        }

        public final boolean f() {
            return epx.f(this.a, "PROGRESS");
        }

        public final boolean g() {
            return epx.f(this.a, "RESTRICTED");
        }

        public final boolean h() {
            return epx.f(this.a, "USED_IN_PIP");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append(this.a);
            sb.append(",pos=");
            return vu5.b(sb, this.b, '}');
        }
    }

    /* compiled from: AutoPlayDelegate.kt */
    public interface b {
        void U1(a aVar);

        void i5(a aVar, a aVar2);
    }

    /* compiled from: AutoPlayDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetTarget.values().length];
            try {
                iArr[SnippetTarget.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetTarget.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnippetTarget.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AutoPlayDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ VideoFile $attachedVideoFile;
        final /* synthetic */ com.vk.libvideo.autoplay.a $config;
        final /* synthetic */ gzs<yg5> $createAutoPlay;
        final /* synthetic */ izs<fh5, s3q0> $initBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(VideoFile videoFile, gzs<? extends yg5> gzsVar, com.vk.libvideo.autoplay.a aVar, izs<? super fh5, s3q0> izsVar) {
            super(0, epx.a.class, "bindWithInitBlock", "optimizedBind$bindWithInitBlock(Lcom/vk/libvideo/autoplay/delegate/AutoPlayDelegate;Lcom/vk/dto/common/VideoFile;Lkotlin/jvm/functions/Function0;Lcom/vk/libvideo/autoplay/AutoPlayConfig;Lkotlin/jvm/functions/Function1;)V", 0);
            this.$attachedVideoFile = videoFile;
            this.$createAutoPlay = gzsVar;
            this.$config = aVar;
            this.$initBlock = izsVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            fh5 fh5Var = fh5.this;
            VideoFile videoFile = this.$attachedVideoFile;
            gzs<yg5> gzsVar = this.$createAutoPlay;
            com.vk.libvideo.autoplay.a aVar = this.$config;
            izs<fh5, s3q0> izsVar = this.$initBlock;
            fh5Var.k(videoFile, gzsVar.invoke(), aVar);
            izsVar.invoke(fh5Var);
            fh5Var.I0 = null;
            return s3q0.a;
        }
    }

    public /* synthetic */ fh5(sj0 sj0Var, VideoTextureView videoTextureView, ViewGroup viewGroup, float f, View view, View view2, ProgressView progressView, View view3, ProgressBar progressBar, z3s0 z3s0Var, wfk0.a aVar, ImageView imageView, View view4, DurationView durationView, InteractiveDurationView interactiveDurationView, BaseSubtitleView baseSubtitleView, VideoOverlayView videoOverlayView, VideoErrorView videoErrorView, ViewGroup viewGroup2, SpectatorsCounterView spectatorsCounterView, boolean z, ActionLinkView actionLinkView, VideoAdLayout videoAdLayout, wqj wqjVar, ih5 ih5Var, View view5, y1f y1fVar, dzv dzvVar, jh5 jh5Var, ImageView imageView2, int i, int i2) {
        this(sj0Var, videoTextureView, viewGroup, (i & 8) != 0 ? 0.0f : f, view, (i & 32) != 0 ? zpx.b.a : zpx.a.a, (i & 64) != 0 ? null : view2, (i & 128) != 0 ? null : progressView, (i & 256) != 0 ? null : view3, null, (i & 1024) != 0 ? null : progressBar, (i & 2048) != 0 ? null : z3s0Var, (i & 4096) != 0 ? null : aVar, (i & 8192) != 0 ? null : imageView, (i & 16384) != 0 ? null : view4, (32768 & i) != 0 ? null : durationView, (65536 & i) != 0 ? null : interactiveDurationView, (131072 & i) != 0 ? null : baseSubtitleView, (262144 & i) != 0 ? null : videoOverlayView, (524288 & i) != 0 ? null : videoErrorView, (1048576 & i) != 0 ? null : viewGroup2, (2097152 & i) != 0 ? null : spectatorsCounterView, z, (8388608 & i) != 0, (16777216 & i) != 0 ? null : actionLinkView, (33554432 & i) != 0 ? null : videoAdLayout, null, null, (268435456 & i) == 0, (536870912 & i) != 0 ? new wqj(null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) : wqjVar, (1073741824 & i) != 0 ? new ih5(0) : ih5Var, (i & Integer.MIN_VALUE) != 0 ? null : view5, (i2 & 1) != 0 ? new c2f(false, false) : y1fVar, (i2 & 2) != 0 ? null : dzvVar, (i2 & 8) != 0 ? new jh5(true) : jh5Var, (i2 & 16) != 0 ? null : imageView2);
    }

    public static void k0(fh5 fh5Var, Activity activity, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, VideoFile videoFile, boolean z, boolean z2, int i) {
        VideoFile videoFile2 = (i & 8) != 0 ? fh5Var.o : videoFile;
        boolean z3 = (i & 32) != 0 ? false : z;
        boolean z4 = (i & 64) != 0 ? false : z2;
        fh5Var.C0 = true;
        fxc0.B().Y().i(activity, videoFile2, z3 ? new VideoFeedDialogParams.OfflineVideos(fh5Var.k, fh5Var.l, searchStatsLoggingInfo, null, 8, null) : new VideoFeedDialogParams.Discover(fh5Var.k, fh5Var.l, searchStatsLoggingInfo, true, null, null, 0L, z4, fh5Var.e(), null, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, null));
    }

    public final void A() {
        Trace.beginSection("AutoPlayDelegate.bindDuration");
        try {
            DurationView durationView = this.b;
            ViewGroup viewGroup = this.w;
            if (durationView != null) {
                Context context = viewGroup.getContext();
                yg5 yg5Var = this.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                durationView.setText(X(context, yg5Var));
            }
            InteractiveDurationView interactiveDurationView = this.J;
            if (interactiveDurationView != null) {
                Context context2 = viewGroup.getContext();
                yg5 yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                interactiveDurationView.setDurationText(X(context2, yg5Var2));
            }
            n(this.U, a0());
            yg5 yg5Var3 = this.j;
            if ((yg5Var3 != null ? yg5Var3 : null).v()) {
                boolean z0 = this.o.z0();
                SpectatorsCounterView spectatorsCounterView = this.N;
                if (z0) {
                    if (spectatorsCounterView != null) {
                        spectatorsCounterView.setCurrentViewers(0);
                    }
                } else if (spectatorsCounterView != null) {
                    spectatorsCounterView.setCurrentViewers(this.o.B4());
                }
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void A0() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        rlt0 m0 = yg5Var.m0();
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.f(true);
        yg5 yg5Var2 = this.j;
        (yg5Var2 != null ? yg5Var2 : null).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (m0 != null) {
            m0.i("volume", "off");
        }
    }

    public final void B() {
        String str;
        VideoErrorView.a data;
        Trace.beginSection("AutoPlayDelegate.bindErrorView");
        boolean z = false;
        VideoErrorView videoErrorView = this.M;
        if (videoErrorView != null) {
            try {
                bwt0.p0(videoErrorView, this.U ? this.u0.c() && this.G0.c : this.u0.c());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        a.AbstractC2870a abstractC2870a = this.u0.c;
        if (abstractC2870a instanceof a.AbstractC2870a.b) {
            str = ((a.AbstractC2870a.b) abstractC2870a).a;
        } else {
            if (!(abstractC2870a instanceof a.AbstractC2870a.C2871a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        String str2 = str;
        VideoErrorView.a aVar = (videoErrorView == null || (data = videoErrorView.getData()) == null) ? new VideoErrorView.a(str2, null, z, 62) : new VideoErrorView.a(str2, data.b, data.c, data.d, data.e, data.f);
        if (videoErrorView != null) {
            videoErrorView.a(aVar);
            s3q0 s3q0Var = s3q0.a;
        }
        Trace.endSection();
    }

    public final void B0() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        rlt0 m0 = yg5Var.m0();
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.f(false);
        yg5 yg5Var2 = this.j;
        yg5 yg5Var3 = yg5Var2 != null ? yg5Var2 : null;
        z2s0.b.getClass();
        yg5Var3.setVolume(z2s0.n);
        if (m0 != null) {
            m0.i("volume", "on");
        }
    }

    @Override // xsna.io2
    public final void C() {
        VideoAdLayout videoAdLayout;
        bmp0.a(null);
        io2 io2Var = this.Y;
        if (io2Var != null) {
            io2Var.C();
        }
        this.s0 = false;
        ViewGroup viewGroup = this.w;
        if (!viewGroup.isAttachedToWindow()) {
            viewGroup.setAlpha(1.0f);
            return;
        }
        fjz V = V();
        if (V != null) {
            V.resume();
        }
        d3m.b(viewGroup, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        if (!this.u0.a() || (videoAdLayout = this.R) == null) {
            return;
        }
        d3m.c(videoAdLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(boolean z, boolean z2) {
        boolean z3;
        ActionLinkView actionLinkView;
        ActionLink actionLink;
        boolean z0 = fxc0.B().J().z0();
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        boolean P0 = yg5Var.P0();
        boolean z4 = this.u0.d() || this.u0.f();
        boolean z5 = this.F0 != null;
        boolean z6 = !P0 && z4 && z5 && !g620.f().d(this.o);
        if (!z0 || !z5) {
            ActionLink actionLink2 = this.F0;
            if (!epx.f(actionLink2 != null ? actionLink2.c : null, "video")) {
                z3 = z6;
            } else if (!z6 || !this.x0) {
                z3 = false;
            }
            actionLinkView = this.Q;
            if (actionLinkView != null) {
                bwt0.a(actionLinkView, z3, z, 0L, 92);
            }
            if (z3 || !z2 || (actionLink = this.F0) == null) {
                return;
            }
            yg5 yg5Var2 = this.j;
            rlt0 m0 = (yg5Var2 != null ? yg5Var2 : null).m0();
            if (m0 != null) {
                Bundle b2 = qr.b(CampaignEx.JSON_KEY_LINK_TYPE, actionLink.c, "value", actionLink.e);
                b2.putString(NotificationCompat.CATEGORY_EVENT, "show_link");
                m0.h(b2);
                return;
            }
            return;
        }
        z3 = true;
        actionLinkView = this.Q;
        if (actionLinkView != null) {
        }
        if (z3) {
        }
    }

    public final void D(sh0 sh0Var, eh5 eh5Var) {
        String str;
        View view = this.W;
        AdRedirectView adRedirectView = view instanceof AdRedirectView ? (AdRedirectView) view : null;
        if (adRedirectView != null) {
            String a2 = (sh0Var == null || (str = sh0Var.d) == null) ? null : cqm0.a(str);
            xzr0 xzr0Var = xzr0.a;
            if (a2 == null) {
                xzr0Var.b(adRedirectView);
                adRedirectView.setBtnClickListener(null);
            } else {
                xzr0Var.c(adRedirectView, iah0.a(48));
                adRedirectView.a(sh0Var, AdRedirectView.Type.CATALOG);
                adRedirectView.setBtnClickListener(eh5Var);
            }
        }
    }

    @Override // xsna.io2
    public final void D0() {
        bmp0.a(null);
        io2 io2Var = this.Y;
        if (io2Var != null) {
            io2Var.D0();
        }
        this.s0 = true;
        this.v0 = false;
        if (this.u0.g()) {
            f4m.j(this.y);
            f4m.j(this.v);
            VideoOverlayView videoOverlayView = this.L;
            if (videoOverlayView != null) {
                videoOverlayView.setVisibility(0);
            }
        }
    }

    public final void E0(one.video.player.tracks.b bVar) {
        OneVideoPlayer a2;
        Trace.beginSection("AutoPlayDelegate.updateAutoSubtitlesControlIcon");
        if (bVar == null) {
            try {
                yg5 yg5Var = this.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                d3b0 v0 = yg5Var.v0();
                bVar = (v0 == null || (a2 = v0.a()) == null) ? null : a2.Q();
            } finally {
                Trace.endSection();
            }
        }
        Context context = this.n0;
        boolean z = this.K0;
        wqj wqjVar = this.V;
        View view = this.I;
        if (bVar == null) {
            if (z) {
                if (view != null) {
                    view.setBackground(wqjVar.f);
                }
            } else if (view != null) {
                view.setBackgroundResource(wqjVar.n);
            }
            if (view != null) {
                view.setContentDescription(context.getString(R.string.subtitles_on_content_description));
            }
        } else {
            if (z) {
                if (view != null) {
                    view.setBackground(wqjVar.g);
                }
            } else if (view != null) {
                view.setBackgroundResource(wqjVar.o);
            }
            if (view != null) {
                view.setContentDescription(context.getString(R.string.subtitles_off_content_description));
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        VideoTextureView videoTextureView = this.v;
        videoTextureView.i(videoTextureView.getTransformController().e, false);
        videoTextureView.getMatrixProvider().l(i, i2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void F() {
        VideoOverlayView videoOverlayView = this.L;
        if (videoOverlayView == null) {
            return;
        }
        VideoRestriction O = this.o.O();
        ?? r2 = this.j0;
        if (O != null && fxc0.B().c(this.o)) {
            videoOverlayView.Z4((i1t0) r2.getValue(), new VideoOverlayView.c.i(((a390) this.k0.getValue()).a(O), ((s290) this.l0.getValue()).a(this.o.w2()), false, new s5(this, 5)));
        } else if (this.u0.h()) {
            i1t0 i1t0Var = (i1t0) r2.getValue();
            bpn0 bpn0Var = VideoOverlayView.I;
            videoOverlayView.Z4(i1t0Var, new VideoOverlayView.c.b(videoOverlayView.getContext().getString(R.string.video_pip_overlay), Integer.valueOf(R.drawable.vk_icon_picture_in_picture_56), Integer.valueOf(R.color.vk_gray_900)));
        }
    }

    public final void F0(boolean z) {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        List<one.video.player.tracks.b> O0 = yg5Var.O0();
        View view = this.I;
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        if (this.o.v() || !this.u0.d() || O0.isEmpty() || this.r.m == SubtitlesConfigurationMode.ALWAYS_DISABLED) {
            if (z) {
                d3m.e(this.I, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            } else {
                if (view != null) {
                    f4m.j(view);
                    return;
                }
                return;
            }
        }
        if (z) {
            d3m.c(this.I, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (view != null) {
            view.setAlpha(1.0f);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void G0(boolean z) {
        if (this.u0.d()) {
            return;
        }
        TextView textView = this.V.a;
        d3m.b(textView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        if (z) {
            d3m.e(textView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        } else if (textView != null) {
            f4m.j(textView);
        }
    }

    @Override // xsna.uc, xsna.mnt0
    public final void G2(View view) {
        Trace.beginSection("AutoPlayDelegate.onViewAttached");
        try {
            if (this.K0) {
                view.removeCallbacks(this.J0);
                ch5 ch5Var = new ch5(0, this, view);
                this.J0 = ch5Var;
                view.post(ch5Var);
            } else {
                h0(view);
                s3q0 s3q0Var = s3q0.a;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void H0(int i) {
        if (this.o.C2()) {
            return;
        }
        wqj wqjVar = this.V;
        TextView textView = wqjVar.a;
        if (textView != null) {
            textView.setText(i);
        }
        TextView textView2 = wqjVar.a;
        if (textView2 != null) {
            d3m.c(textView2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void I() {
        long j;
        sox soxVar;
        int i;
        long j2;
        owo0 owo0Var;
        j3i0 j3i0Var = this.F;
        if (j3i0Var == null) {
            return;
        }
        boolean s0 = s0();
        j3i0Var.setVisible(s0);
        if (s0) {
            if (j3i0Var.a() == null) {
                j3i0Var.c(new gh5(this));
            }
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (!yg5Var.isPlaying() || j3i0Var.e()) {
                return;
            }
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            long duration = yg5Var2.getDuration();
            j3i0Var.getState();
            yg5 yg5Var3 = this.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            long position = yg5Var3.getPosition();
            float f = duration;
            yg5 yg5Var4 = this.j;
            if (yg5Var4 == null) {
                yg5Var4 = null;
            }
            long c2 = an10.c((yg5Var4.i0() / 100.0f) * f);
            yg5 yg5Var5 = this.j;
            if (yg5Var5 == null) {
                yg5Var5 = null;
            }
            long millis = TimeUnit.SECONDS.toMillis(yg5Var5.A().getDuration());
            yg5 yg5Var6 = this.j;
            if (yg5Var6 == null) {
                yg5Var6 = null;
            }
            List<VideoEpisode> Y3 = yg5Var6.A().Y3();
            if (Y3.isEmpty()) {
                j = position;
                soxVar = null;
            } else {
                ArrayList arrayList = new ArrayList();
                int size = Y3.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = Y3.get(i2).b;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long j3 = position;
                    long millis2 = timeUnit.toMillis(i3);
                    int i4 = i2 + 1;
                    if (((VideoEpisode) j5g.b0(i4, Y3)) != null) {
                        i = i4;
                        j2 = timeUnit.toMillis(r6.b);
                    } else {
                        i = i4;
                        j2 = millis;
                    }
                    arrayList.add(new sox.a(millis2, j2, Y3.get(i2).c));
                    i2 = i;
                    position = j3;
                }
                j = position;
                soxVar = new sox(arrayList, millis);
            }
            yg5 yg5Var7 = this.j;
            if (yg5Var7 == null) {
                yg5Var7 = null;
            }
            TimelineThumbs B0 = yg5Var7.A().B0();
            if (B0 != null) {
                int i5 = B0.b;
                int i6 = B0.c;
                int i7 = B0.d;
                owo0Var = new owo0(i5, i6, i7, B0.e / i7, B0.f, B0.i);
            } else {
                owo0Var = null;
            }
            j3i0Var.d(new j3i0.b(j, c2, duration, owo0Var, soxVar));
        }
    }

    public final void I0() {
        boolean booleanValue = ((Boolean) this.i0.getValue()).booleanValue();
        boolean z = false;
        xb60 xb60Var = this.D;
        if (!booleanValue && xb60Var != null) {
            xb60Var.G(false);
        }
        boolean z2 = this.u0.d() || this.u0.a();
        if (xb60Var != null) {
            if (!this.o.z0() && this.r.k && z2) {
                z = true;
            }
            xb60Var.G(z);
        }
        if (!this.u0.b() || xb60Var == null) {
            return;
        }
        xb60Var.l4();
    }

    @Override // xsna.io2
    public final void J() {
        yg5 yg5Var = bmp0.a;
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        bmp0.a(yg5Var2);
        io2 io2Var = this.Y;
        if (io2Var != null) {
            io2Var.J();
        }
        if (L()) {
            yg5 yg5Var3 = this.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            if (!yg5Var3.isPlaying()) {
                yg5 yg5Var4 = this.j;
                if (yg5Var4 == null) {
                    yg5Var4 = null;
                }
                yg5Var4.D();
            }
        }
        VideoAdLayout videoAdLayout = this.R;
        if (videoAdLayout != null) {
            bwt0.p0(videoAdLayout, false);
        }
        yg5 yg5Var5 = this.j;
        (yg5Var5 != null ? yg5Var5 : null).a0(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0() {
        boolean z;
        DurationView durationView;
        InteractiveDurationView interactiveDurationView;
        View view;
        SpectatorsCounterView spectatorsCounterView;
        j3i0 j3i0Var;
        boolean W9 = this.o.W9();
        boolean z2 = false;
        if (!this.u0.c() && (!this.u0.b() || this.U)) {
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (!yg5Var.P0() && !gpt0.w(this.o) && !this.u0.g() && !this.u0.h()) {
                VideoPipStateHolder.a.getClass();
                yg5 c2 = VideoPipStateHolder.c();
                yg5 yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                if (!epx.f(c2, yg5Var2) && ((j3i0Var = this.F) == null || !j3i0Var.e())) {
                    z = true;
                    durationView = this.b;
                    if (durationView != null) {
                        bwt0.p0(durationView, z && !W9);
                    }
                    interactiveDurationView = this.J;
                    if (interactiveDurationView != null) {
                        bwt0.p0(interactiveDurationView, z && W9);
                    }
                    boolean z3 = !(durationView == null ? bwt0.K(durationView) : false) && a0();
                    view = this.a0;
                    if (view != null) {
                        awt0.u(view, z3);
                    }
                    spectatorsCounterView = this.N;
                    if (spectatorsCounterView == null) {
                        if (!this.u0.c() && !this.u0.b()) {
                            yg5 yg5Var3 = this.j;
                            if (yg5Var3 == null) {
                                yg5Var3 = null;
                            }
                            if (!yg5Var3.P0()) {
                                yg5 yg5Var4 = this.j;
                                if ((yg5Var4 != null ? yg5Var4 : null).v() && !this.u0.g() && !this.u0.h() && !this.o.z0()) {
                                    z2 = true;
                                }
                            }
                        }
                        bwt0.p0(spectatorsCounterView, z2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        durationView = this.b;
        if (durationView != null) {
        }
        interactiveDurationView = this.J;
        if (interactiveDurationView != null) {
        }
        if (durationView == null ? bwt0.K(durationView) : false) {
        }
        view = this.a0;
        if (view != null) {
        }
        spectatorsCounterView = this.N;
        if (spectatorsCounterView == null) {
        }
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        P0();
    }

    public final void K() {
        xcs0.a data;
        if (d0()) {
            View view = this.C;
            xcs0 xcs0Var = view instanceof xcs0 ? (xcs0) view : null;
            if (xcs0Var == null || (data = xcs0Var.getData()) == null) {
                return;
            }
            uoj0 uoj0Var = this.H0;
            xcs0Var.a(new xcs0.a(data.a, data.b, uoj0Var != null ? uoj0Var.c : null, data.d, data.e));
        }
    }

    public final boolean L() {
        if (!this.C0) {
            return false;
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        return yg5Var.p0() && this.o.T3() && this.r.g && this.w.isAttachedToWindow();
    }

    public final void L0() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        if (!yg5Var.v()) {
            fjz V = V();
            if (V != null) {
                V.a();
                return;
            }
            return;
        }
        fjz V2 = V();
        if (V2 != null) {
            yg5 yg5Var2 = this.j;
            V2.b((yg5Var2 != null ? yg5Var2 : null).p0(), this.D0);
        }
    }

    @Override // xsna.io2
    public final boolean M() {
        return L();
    }

    public final void M0() {
        View b2;
        View b3;
        Trace.beginSection("AutoPlayDelegate.updateSoundControlIcon");
        try {
            boolean b0 = b0();
            Context context = this.n0;
            wfk0 wfk0Var = this.G;
            if (b0) {
                r0(true);
                if (wfk0Var != null && (b3 = wfk0Var.b()) != null) {
                    b3.setContentDescription(context.getString(R.string.video_accessibility_sound_on));
                }
            } else {
                r0(false);
                if (wfk0Var != null && (b2 = wfk0Var.b()) != null) {
                    b2.setContentDescription(context.getString(R.string.video_accessibility_sound_off));
                }
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean N(yg5 yg5Var) {
        if (yg5Var.v() || yg5Var.a() || yg5Var.J() || yg5Var.P0()) {
            return false;
        }
        return (yg5Var.isPlaying() || com.vk.libvideo.autoplay.j.b(this.o) != 0) && !s0();
    }

    public final void N0(boolean z) {
        View b2;
        View b3;
        View b4;
        wfk0 wfk0Var = this.G;
        d3m.b(wfk0Var != null ? wfk0Var.b() : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        boolean z2 = this.u0.d() || this.u0.a();
        if (this.o.z0() || !this.r.k || !z2) {
            if (z) {
                d3m.e(wfk0Var != null ? wfk0Var.b() : null, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            } else {
                if (wfk0Var == null || (b2 = wfk0Var.b()) == null) {
                    return;
                }
                f4m.j(b2);
                return;
            }
        }
        if (z) {
            d3m.c(wfk0Var != null ? wfk0Var.b() : null, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (wfk0Var != null && (b4 = wfk0Var.b()) != null) {
            b4.setAlpha(1.0f);
        }
        if (wfk0Var == null || (b3 = wfk0Var.b()) == null) {
            return;
        }
        b3.setVisibility(0);
    }

    public final void O0(a aVar, boolean z) {
        boolean z2 = aVar.g() || aVar.h();
        VideoOverlayView videoOverlayView = this.L;
        if (videoOverlayView != null) {
            d3m.b(videoOverlayView, z2 ? 1.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        }
        if (videoOverlayView != null) {
            bwt0.a(videoOverlayView, z2, z, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        d3m.b(this.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        bwt0.a(this.v, !z2, z, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0292  */
    /* JADX WARN: Type inference failed for: r1v56, types: [xsna.fh5$b, xsna.qi6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0() {
        a1p0 a1p0Var;
        ?? r1;
        DurationView durationView;
        InteractiveDurationView interactiveDurationView;
        uoj0 uoj0Var;
        ActionLinkSnippet actionLinkSnippet;
        a aVar = this.t0;
        this.t0 = this.u0;
        this.u0 = aVar;
        R();
        boolean d2 = g620.f().d(this.o);
        View view = this.T;
        boolean z = false;
        if (!d2) {
            if (view != null) {
                d3m.b(view, view.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            }
            if (view != null) {
                bwt0.p0(view, false);
            }
        } else if (view != null) {
            bwt0.a(view, this.u0.f(), true, 150L, 80);
        }
        View view2 = this.A;
        if (view2 != null) {
            bwt0.p0(view2, c0());
        }
        View view3 = this.B;
        if (view3 != null) {
            bwt0.p0(view3, this.u0.f());
        }
        boolean d3 = this.t0.d();
        boolean d4 = this.u0.d();
        ProgressBar progressBar = this.E;
        if (d3 != d4) {
            BaseSubtitleView baseSubtitleView = this.K;
            if (baseSubtitleView != null) {
                bwt0.p0(baseSubtitleView, this.u0.d());
            }
            if (progressBar != null) {
                yg5 yg5Var = this.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                bwt0.p0(progressBar, N(yg5Var));
            }
            A();
            I();
            J0();
            M0();
            N0(true);
            I0();
            E0(null);
            F0(true);
            S0(this.o.X());
            V0(true);
            G0(true);
            ActionLink m1 = this.o.m1();
            boolean f = epx.f(m1 != null ? m1.c : null, "video");
            boolean z2 = this.u0.d() && (this.w0 == null) && !this.x0;
            if (f && z2) {
                u12 u12Var = new u12(this, 4);
                this.w0 = u12Var;
                ActionLinkView actionLinkView = this.Q;
                if (actionLinkView != null) {
                    ActionLink actionLink = this.F0;
                    actionLinkView.postDelayed(u12Var, (actionLink == null || (actionLinkSnippet = actionLink.f) == null) ? 0L : actionLinkSnippet.g);
                }
            }
        }
        boolean f2 = epx.f(this.t0.a, "PAUSE");
        boolean f3 = epx.f(this.u0.a, "PAUSE");
        View view4 = this.y;
        if (f2 != f3 || this.t0.d() != this.u0.d() || this.t0.e() != this.u0.e() || this.t0.a() != this.u0.a() || this.t0.g() != this.u0.g() || this.t0.h() != this.u0.h() || !this.r.g) {
            if (view2 != null) {
                bwt0.p0(view2, c0());
            }
            if (view3 != null) {
                bwt0.p0(view3, this.u0.f());
            }
            if (this.u0.d() || epx.f(this.u0.a, "PAUSE") || this.u0.a()) {
                if (bwt0.K(view4) || view4.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    d3m.e(this.y, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            } else if (this.u0.e()) {
                bwt0.p0(view4, true);
                d3m.b(view4, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            } else if ((!bwt0.K(view4) || view4.getAlpha() < 1.0d) && !this.u0.f()) {
                d3m.c(this.y, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        if (this.u0.b()) {
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            if (!yg5Var2.I0()) {
                msx0 msx0Var = view4 instanceof msx0 ? (msx0) view4 : null;
                if (msx0Var != null) {
                    msx0Var.setColorFilter(d0() ? this.p0 : this.C instanceof a1p0 ? null : this.o0);
                }
                J0();
                if (this.t0.g() == this.u0.g() || this.t0.h() != this.u0.h()) {
                    O0(this.u0, true);
                }
                if (this.t0.b() != this.u0.b()) {
                    z();
                }
                if (this.t0.c() != this.u0.c()) {
                    if (progressBar != null) {
                        yg5 yg5Var3 = this.j;
                        if (yg5Var3 == null) {
                            yg5Var3 = null;
                        }
                        bwt0.p0(progressBar, N(yg5Var3));
                    }
                    B();
                }
                if (this.u0.b != this.t0.b && !this.o.x5()) {
                    if (progressBar != null) {
                        yg5 yg5Var4 = this.j;
                        if (yg5Var4 == null) {
                            yg5Var4 = null;
                        }
                        progressBar.setProgress((int) ((yg5Var4.isPlaying() || yg5Var4.getPosition() > 0) ? yg5Var4.getPosition() : com.vk.libvideo.autoplay.j.b(yg5Var4.A())));
                    }
                    I();
                    uoj0Var = this.H0;
                    if (uoj0Var != null) {
                        VideoFile videoFile = this.o;
                        int i = this.u0.b;
                        String str = this.k;
                        String str2 = this.m;
                        yg5 yg5Var5 = this.j;
                        if (yg5Var5 == null) {
                            yg5Var5 = null;
                        }
                        boolean I0 = yg5Var5.I0();
                        uoj0.a aVar2 = new uoj0.a(str, str2, I0);
                        if ((!epx.f(uoj0Var.b, videoFile.a1()) || drm0.N(uoj0Var.b)) && !I0 && videoFile.getDuration() - i <= 10) {
                            uoj0Var.b = videoFile.a1();
                            hg1.b(this.v, rsg0.y0(new dfs0(videoFile.o0(), 10, videoFile.I0(), str, videoFile.r()), null, null, 3).U(new a690(new nyq(27), 6)).subscribe(new m330(new twi0(1, uoj0Var, aVar2), 23), new gl30(new xc50(uoj0Var, 20), 24)));
                        }
                    }
                }
                if (!epx.f(this.u0.d, this.t0.d) && !this.o.x5()) {
                    durationView = this.b;
                    if (durationView != null) {
                        durationView.setText(this.u0.d);
                    }
                    interactiveDurationView = this.J;
                    if (interactiveDurationView != null) {
                        interactiveDurationView.setDurationText(this.u0.d);
                    }
                }
                if (this.t0.a() == this.u0.a() || this.t0.f() != this.u0.f() || this.t0.d() != this.u0.d() || this.t0.g() != this.u0.g() || this.t0.h() != this.u0.h()) {
                    J0();
                    C0(true, true);
                }
                if (g620.f().d(this.o)) {
                    yg5 yg5Var6 = this.j;
                    if (yg5Var6 == null) {
                        yg5Var6 = null;
                    }
                    if (!yg5Var6.P0() && (this.u0.d() || this.u0.e() || this.u0.f() || epx.f(this.u0.a, "PAUSE"))) {
                        z = true;
                    }
                }
                a1p0Var = this.S;
                if (a1p0Var != null) {
                    a1p0Var.G(z);
                }
                if (this.t0.a() != this.u0.a()) {
                    M0();
                    N0(true);
                    I0();
                    E0(null);
                    F0(true);
                    S0(this.o.X());
                    V0(true);
                    G0(true);
                    boolean a2 = this.u0.a();
                    VideoAdLayout videoAdLayout = this.R;
                    if (a2) {
                        if (videoAdLayout != null) {
                            d3m.c(videoAdLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    } else if (videoAdLayout != null) {
                        d3m.e(videoAdLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    }
                }
                r1 = this.z0;
                if (r1 != 0) {
                    r1.i5(this.t0, this.u0);
                }
                y();
            }
        }
        if (this.u0.c()) {
            msx0 msx0Var2 = view4 instanceof msx0 ? (msx0) view4 : null;
            if (msx0Var2 != null) {
                msx0Var2.setColorFilter(this.q0);
            }
            J0();
        } else if (this.t0.c() || this.t0.b()) {
            msx0 msx0Var3 = view4 instanceof msx0 ? (msx0) view4 : null;
            if (msx0Var3 != null) {
                msx0Var3.setColorFilter(null);
            }
        }
        if (this.t0.g() == this.u0.g()) {
        }
        O0(this.u0, true);
        if (this.t0.b() != this.u0.b()) {
        }
        if (this.t0.c() != this.u0.c()) {
        }
        if (this.u0.b != this.t0.b) {
            if (progressBar != null) {
            }
            I();
            uoj0Var = this.H0;
            if (uoj0Var != null) {
            }
        }
        if (!epx.f(this.u0.d, this.t0.d)) {
            durationView = this.b;
            if (durationView != null) {
            }
            interactiveDurationView = this.J;
            if (interactiveDurationView != null) {
            }
        }
        if (this.t0.a() == this.u0.a()) {
        }
        J0();
        C0(true, true);
        if (g620.f().d(this.o)) {
        }
        a1p0Var = this.S;
        if (a1p0Var != null) {
        }
        if (this.t0.a() != this.u0.a()) {
        }
        r1 = this.z0;
        if (r1 != 0) {
        }
        y();
    }

    public final void R() {
        Trace.beginSection("AutoPlayDelegate.computeNewState");
        try {
            this.u0.a = Y();
            this.u0.c = T();
            a aVar = this.u0;
            Context context = this.w.getContext();
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            aVar.d = X(context, yg5Var);
            boolean f = epx.f(this.u0.a, "PREVIEW");
            a aVar2 = this.u0;
            boolean z = false;
            aVar2.e = !f && aVar2.f();
            a aVar3 = this.u0;
            if (!f && aVar3.d()) {
                z = true;
            }
            aVar3.f = z;
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.fh5$b, xsna.qi6] */
    public final void R0() {
        long position;
        View view = this.y;
        Trace.beginSection("AutoPlayDelegate.updateViewStateCompletely");
        try {
            a aVar = this.t0;
            this.t0 = this.u0;
            this.u0 = aVar;
            R();
            F();
            boolean z = this.u0.g() || this.u0.h();
            VideoOverlayView videoOverlayView = this.L;
            if (videoOverlayView != null) {
                bwt0.p0(videoOverlayView, z);
            }
            if (videoOverlayView != null) {
                videoOverlayView.setAlpha(z ? 1.0f : 0.0f);
            }
            d3m.b(view, this.u0.d() ? 0.0f : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (!this.u0.d() && !this.u0.a() && !this.u0.g()) {
                bwt0.p0(view, true);
            } else if (this.u0.g()) {
                this.z.a(view);
            } else {
                bwt0.d0(view, true);
            }
            bwt0.p0(this.v, (this.u0.g() || this.u0.h()) ? false : true);
            View view2 = this.A;
            if (view2 != null) {
                bwt0.p0(view2, c0());
            }
            View view3 = this.B;
            if (view3 != null) {
                bwt0.p0(view3, this.u0.f());
            }
            VideoAdLayout videoAdLayout = this.R;
            if (videoAdLayout != null) {
                bwt0.p0(videoAdLayout, this.u0.a());
            }
            ViewGroup viewGroup = this.w;
            DurationView durationView = this.b;
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (durationView != null) {
                Context context = viewGroup.getContext();
                yg5 yg5Var = this.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                durationView.setText(X(context, yg5Var));
            }
            InteractiveDurationView interactiveDurationView = this.J;
            if (interactiveDurationView != null) {
                Context context2 = viewGroup.getContext();
                yg5 yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                interactiveDurationView.setDurationText(X(context2, yg5Var2));
            }
            BaseSubtitleView baseSubtitleView = this.K;
            if (baseSubtitleView != null) {
                bwt0.p0(baseSubtitleView, this.u0.d());
            }
            z();
            ProgressBar progressBar = this.E;
            if (progressBar != null) {
                yg5 yg5Var3 = this.j;
                if (yg5Var3 == null) {
                    yg5Var3 = null;
                }
                bwt0.p0(progressBar, N(yg5Var3));
            }
            if (progressBar != null) {
                yg5 yg5Var4 = this.j;
                if (yg5Var4 == null) {
                    yg5Var4 = null;
                }
                if (!yg5Var4.isPlaying() && yg5Var4.getPosition() <= 0) {
                    position = com.vk.libvideo.autoplay.j.b(yg5Var4.A());
                    progressBar.setProgress((int) position);
                }
                position = yg5Var4.getPosition();
                progressBar.setProgress((int) position);
            }
            I();
            B();
            a20 a20Var = new a20(this.o, false);
            ActionLinkView actionLinkView = this.Q;
            if (actionLinkView != null) {
                actionLinkView.a(a20Var);
            }
            C0(false, true);
            M0();
            N0(false);
            E0(null);
            F0(false);
            S0(this.o.X());
            V0(false);
            G0(false);
            A();
            J0();
            if (durationView != null) {
                durationView.c();
            }
            if (interactiveDurationView != null) {
                interactiveDurationView.e();
            }
            y();
            msx0 msx0Var = view instanceof msx0 ? (msx0) view : null;
            if (msx0Var != null) {
                yg5 yg5Var5 = this.j;
                if (yg5Var5 == null) {
                    yg5Var5 = null;
                }
                if (!yg5Var5.I0()) {
                    if (this.u0.b() && d0()) {
                        porterDuffColorFilter = this.p0;
                    } else if (!this.u0.b() || !(this.C instanceof a1p0)) {
                        if (this.u0.b()) {
                            porterDuffColorFilter = this.o0;
                        } else if (this.u0.c()) {
                            porterDuffColorFilter = this.q0;
                        }
                    }
                }
                msx0Var.setColorFilter(porterDuffColorFilter);
            }
            ?? r0 = this.z0;
            if (r0 != 0) {
                r0.U1(this.u0);
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void S() {
        fjz V = V();
        if (V != null) {
            V.a();
        }
    }

    public final void S0(boolean z) {
        Drawable c2;
        Context context = this.n0;
        ImageView imageView = this.H;
        if (imageView != null) {
            if (this.K0) {
                wqj wqjVar = this.V;
                c2 = z ? wqjVar.h : wqjVar.i;
            } else {
                int i = z ? R.drawable.vk_icon_done_outline_24 : R.drawable.vk_icon_clock_24;
                e3m.a aVar = e3m.a;
                c2 = enj.c(i, context.getColor(R.color.vk_white), context);
            }
            imageView.setImageDrawable(c2);
        }
        if (imageView != null) {
            imageView.setContentDescription(context.getString(z ? R.string.remove_from_watch_video_later_content_description : R.string.add_to_watch_video_later_content_description));
        }
    }

    public final a.AbstractC2870a T() {
        boolean x5 = this.o.x5();
        Context context = this.n0;
        if (x5) {
            return new a.AbstractC2870a.b(context.getString(R.string.video_err_network));
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        if (!yg5Var.J()) {
            return a.AbstractC2870a.C2871a.a;
        }
        yg5 yg5Var2 = this.j;
        return new a.AbstractC2870a.b(context.getString(gpt0.p((yg5Var2 != null ? yg5Var2 : null).W(), false).a));
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        P0();
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
        E0(bVar);
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
        P0();
    }

    public final fjz V() {
        return (fjz) this.r0.getValue();
    }

    public final void V0(boolean z) {
        ImageView imageView = this.H;
        d3m.b(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        boolean z2 = this.o.J8() && this.o.i9();
        boolean d2 = this.u0.d();
        boolean z3 = (fxc0.B().c(this.o) || epx.f(this.o.I0(), UserId.d) || Z() || !z2) ? false : true;
        if (this.o.C2() || !d2 || !z3) {
            if (z) {
                d3m.e(this.H, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            } else {
                if (imageView != null) {
                    f4m.j(imageView);
                    return;
                }
                return;
            }
        }
        if (z) {
            d3m.c(this.H, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        if (imageView != null) {
            new WatchLaterTooltip(imageView).a(WatchLaterTooltip.Hint.BUTTON);
        }
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        P0();
        c63 c63Var = c63.a;
        if (c63.f) {
            io.reactivex.rxjava3.subjects.d<VideoMinimizableState> a2 = rts0.b.a();
            if ((a2.P0() == null || (a2.P0() instanceof VideoMinimizableState.Hidden)) && rts0.c == null) {
                VideoPlayerMode videoPlayerMode = VideoPlayerMode.PREVIEW;
                if (yg5Var instanceof VideoAutoPlay) {
                    i0q0.j(new tou(5, videoPlayerMode, yg5Var));
                }
            }
        }
    }

    public final String X(Context context, yg5 yg5Var) {
        jly jlyVar = this.B0;
        if (jlyVar == null) {
            jlyVar = this.s;
        }
        return jlyVar.a(context);
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        int max = (int) Math.max(0L, j / 1000);
        a aVar = this.u0;
        if (aVar.b != max) {
            if (!this.Z.a && this.E == null && this.F == null && this.H0 == null && this.b == null && this.J == null) {
                return;
            }
            aVar.b = max;
            P0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0170, code lost:
    
        if (r4 != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0116, code lost:
    
        if (r0.isPaused() != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Y() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        VideoFile A;
        String a1;
        if (Z()) {
            return "AD";
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        boolean z6 = false;
        if ((c2 == null || (A = c2.A()) == null || (a1 = A.a1()) == null) ? false : epx.f(yg5Var.A().a1(), a1)) {
            return "USED_IN_PIP";
        }
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        if (yg5Var2.B() && fxc0.B().c(this.o)) {
            return "RESTRICTED";
        }
        boolean T3 = this.o.T3();
        boolean z7 = this.U;
        if (T3) {
            yg5 yg5Var3 = this.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            if ((yg5Var3.p0() || z7) && this.r.g && !this.o.z0()) {
                yg5 yg5Var4 = this.j;
                if (yg5Var4 == null) {
                    yg5Var4 = null;
                }
                yg5Var4.getClass();
                z = false;
                if (!z) {
                    return "PREVIEW";
                }
                if (!this.s0 && !this.v0) {
                    yg5 yg5Var5 = bmp0.a;
                    yg5 yg5Var6 = this.j;
                    if (yg5Var6 == null) {
                        yg5Var6 = null;
                    }
                    if (!epx.f(bmp0.a, yg5Var6)) {
                        z2 = false;
                        if (!z2) {
                            return this.t0.a;
                        }
                        yg5 yg5Var7 = this.j;
                        if (yg5Var7 == null) {
                            yg5Var7 = null;
                        }
                        if (yg5Var7.J()) {
                            return "ERROR";
                        }
                        yg5 yg5Var8 = this.j;
                        if (yg5Var8 == null) {
                            yg5Var8 = null;
                        }
                        if (yg5Var8.a()) {
                            return "COMPLETED";
                        }
                        if (!this.G0.c && !this.v0) {
                            yg5 yg5Var9 = this.j;
                            if (yg5Var9 == null) {
                                yg5Var9 = null;
                            }
                            if (!yg5Var9.isPlaying()) {
                                yg5 yg5Var10 = bmp0.a;
                                yg5 yg5Var11 = this.j;
                                if (yg5Var11 == null) {
                                    yg5Var11 = null;
                                }
                                if (!epx.f(bmp0.a, yg5Var11)) {
                                    z3 = true;
                                    if (!z3) {
                                        return "PREVIEW";
                                    }
                                    yg5 yg5Var12 = this.j;
                                    if (yg5Var12 == null) {
                                        yg5Var12 = null;
                                    }
                                    if (!yg5Var12.M()) {
                                        yg5 yg5Var13 = this.j;
                                        if (yg5Var13 == null) {
                                            yg5Var13 = null;
                                        }
                                    }
                                    yg5 yg5Var14 = this.j;
                                    if (yg5Var14 == null) {
                                        yg5Var14 = null;
                                    }
                                    if (yg5Var14.p()) {
                                        yg5 yg5Var15 = this.j;
                                        if (yg5Var15 == null) {
                                            yg5Var15 = null;
                                        }
                                        if (!yg5Var15.P0()) {
                                            z4 = true;
                                            if (!z4) {
                                                return "PAUSE";
                                            }
                                            yg5 yg5Var16 = this.j;
                                            if (yg5Var16 == null) {
                                                yg5Var16 = null;
                                            }
                                            if (yg5Var16.d()) {
                                                yg5 yg5Var17 = this.j;
                                                if (yg5Var17 == null) {
                                                    yg5Var17 = null;
                                                }
                                                if (!yg5Var17.M()) {
                                                    z5 = true;
                                                    if (!z5) {
                                                        return "PROGRESS";
                                                    }
                                                    yg5 yg5Var18 = this.j;
                                                    if (yg5Var18 == null) {
                                                        yg5Var18 = null;
                                                    }
                                                    if (!yg5Var18.isPlaying()) {
                                                        yg5 yg5Var19 = this.j;
                                                        if (yg5Var19 == null) {
                                                            yg5Var19 = null;
                                                        }
                                                        if (yg5Var19.J0()) {
                                                        }
                                                        if (!z6) {
                                                            return "PLAYING";
                                                        }
                                                        yg5 yg5Var20 = this.j;
                                                        return (yg5Var20 != null ? yg5Var20 : null).P0() ? "AD" : "PREVIEW";
                                                    }
                                                    yg5 yg5Var21 = this.j;
                                                    if (yg5Var21 == null) {
                                                        yg5Var21 = null;
                                                    }
                                                    if (yg5Var21.j0(this.v)) {
                                                        z6 = true;
                                                    }
                                                    if (!z6) {
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            if (!z5) {
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final boolean Z() {
        boolean h;
        if (((Boolean) this.h0.getValue()).booleanValue()) {
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            AutoPlayMinifiedState R0 = yg5Var.R0();
            R0.getClass();
            h = R0 == AutoPlayMinifiedState.MINIPLAYER;
        } else {
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            h = yg5Var2.R0().h();
        }
        yg5 yg5Var3 = this.j;
        if (yg5Var3 == null) {
            yg5Var3 = null;
        }
        if (yg5Var3.w0() && this.o.T3()) {
            yg5 yg5Var4 = this.j;
            if ((yg5Var4 != null ? yg5Var4 : null).p0() && this.r.g && !h) {
                return true;
            }
        }
        return false;
    }

    public final boolean a0() {
        if (!MusicFeatures.AUDIO_VIDEO_CARD_TRACK_NOTE.h()) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_NOTE_ON_TYPE;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            return this.o.t2();
        }
        Integer a6 = this.o.a6();
        if (a6.intValue() != 0) {
            return a6.intValue() != this.o.o0();
        }
        return false;
    }

    public final boolean b0() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        return yg5Var.getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.r.f() || this.o.k0();
    }

    @Override // xsna.po2
    public final void c() {
        this.v0 = true;
        yg5 yg5Var = bmp0.a;
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        bmp0.a(yg5Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        if (r5.G0.c == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        if (r5.u0.h() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r5.o.z0() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if ((r0 != null ? r0 : null).R0().h() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
    
        if (r5.r.g != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r5.u0.c() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0() {
        boolean p0;
        boolean z;
        boolean z2;
        if (this.U) {
            if (!this.u0.d()) {
                if (!this.u0.f()) {
                }
            }
            z2 = false;
        } else {
            yg5 yg5Var = this.j;
            if ((yg5Var != null ? yg5Var : null) instanceof com.vk.libvideo.autoplay.d) {
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.g()) {
                    VideoMinifiedPlayerStateHolder.a.getClass();
                    if (!VideoMinifiedPlayerStateHolder.a()) {
                        p0 = true;
                    }
                }
                p0 = false;
            } else {
                if (yg5Var == null) {
                    yg5Var = null;
                }
                p0 = yg5Var.p0();
            }
            if (!p0) {
                yg5 yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                if (!yg5Var2.B()) {
                    if (!BuildInfo.s()) {
                        yg5 yg5Var3 = this.j;
                    }
                    if (z) {
                    }
                    z2 = false;
                }
            }
            yg5 yg5Var4 = this.j;
            if (!(yg5Var4 != null ? yg5Var4 : null).M()) {
            }
            z2 = true;
        }
        return z2 && this.f0;
    }

    public final boolean d0() {
        xcs0.c withSimilar;
        View view = this.C;
        xcs0 xcs0Var = view instanceof xcs0 ? (xcs0) view : null;
        return (xcs0Var == null || (withSimilar = xcs0Var.getWithSimilar()) == null || !withSimilar.a) ? false : true;
    }

    @Override // xsna.zmt0
    public final VideoTransitionSource e() {
        if (!fxc0.B().J().s1()) {
            return null;
        }
        View view = this.y;
        View view2 = bwt0.K(view) ? view : null;
        if (view2 == null) {
            view2 = this.v;
        }
        return zjq.f(view2);
    }

    @Override // xsna.io2
    public final void e0() {
        VideoOverlayView videoOverlayView;
        c();
        io2 io2Var = this.Y;
        if (io2Var != null) {
            io2Var.e0();
        }
        ViewGroup viewGroup = this.w;
        if (viewGroup.isAttachedToWindow()) {
            BaseSubtitleView baseSubtitleView = this.K;
            if (baseSubtitleView != null) {
                baseSubtitleView.setRenderItems(null);
                d3m.e(baseSubtitleView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
            if (!com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW)) {
                long j = (long) (BaseAnimationDialog.a0 * 0.5f);
                viewGroup.animate().setStartDelay(j).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).start();
            }
            if (!this.u0.g() || (videoOverlayView = this.L) == null) {
                return;
            }
            d3m.e(videoOverlayView, (r15 & 1) != 0 ? 300L : 50L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        VideoAdLayout videoAdLayout = this.R;
        if (videoAdLayout != null) {
            videoAdLayout.c(((tzr0) this.e0.getValue()).a(aVar, aVar2), (ozr0) this.c0.getValue());
        }
        if (aVar instanceof a.AbstractC1195a) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            Pair pair = new Pair(Integer.valueOf(abstractC1195a.a().getWidth()), Integer.valueOf(abstractC1195a.a().getHeight()));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            VideoTextureView videoTextureView = this.v;
            videoTextureView.i(scaleType, false);
            videoTextureView.getMatrixProvider().l(intValue, intValue2);
        }
        P0();
    }

    @Override // xsna.uc, xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        return VideoTextureView.a.a(this.v.getTransformController().e);
    }

    @Override // xsna.uc, xsna.dnt0
    public final boolean getVideoFocused() {
        return this.G0.c;
    }

    @Override // xsna.uc, xsna.mnt0
    /* renamed from: getVideoView, reason: collision with other method in class */
    public final VideoTextureView mo407getVideoView() {
        return this.v;
    }

    @Override // xsna.hnt0
    public final void h() {
        VideoAdLayout videoAdLayout = this.R;
        if (videoAdLayout != null) {
            VideoAdLayout.g(videoAdLayout);
        }
        if (videoAdLayout != null) {
            videoAdLayout.f();
        }
        D(null, null);
    }

    public final void h0(View view) {
        super.G2(view);
        if (!this.L0) {
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.f0(this);
        }
        hg1.b(view, wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(ayr0.class).subscribe(new is1(new s9(this, 7), 3)));
        L0();
        if (BuildInfo.s()) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.g()) {
                this.E0 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0.b.a.b0(VideoPipStateHolder.State.class), new o40(new dh5(0), 1)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new cp0(new p40(this, 7), 3));
                if (this.t0.h() || this.u0.h()) {
                    R0();
                }
            }
        }
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        P0();
    }

    @Override // xsna.c56, xsna.io2
    public final float i0() {
        return this.x;
    }

    @Override // xsna.hnt0
    public final void j() {
        VideoTextureView videoTextureView = this.v;
        ViewParent parent = videoTextureView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setBackground(this.m0);
        }
        videoTextureView.i(videoTextureView.getTransformController().e, false);
        videoTextureView.getMatrixProvider().l(this.o.getWidth(), this.o.getHeight());
        P0();
        VideoAdLayout videoAdLayout = this.R;
        if (videoAdLayout != null) {
            videoAdLayout.b();
        }
        D(null, null);
    }

    public final void j0(Activity activity) {
        String str;
        ActionLink actionLink = this.F0;
        if (activity.isFinishing() || actionLink == null) {
            return;
        }
        if (!epx.f(actionLink.c, "video")) {
            kz20 kz20Var = new kz20(this);
            kz20Var.g = this.o;
            kz20Var.d(activity);
            return;
        }
        ActionLinkSnippet actionLinkSnippet = actionLink.f;
        SnippetTarget snippetTarget = actionLinkSnippet != null ? actionLinkSnippet.f : null;
        int i = snippetTarget == null ? -1 : c.$EnumSwitchMapping$0[snippetTarget.ordinal()];
        if (i != -1) {
            if (i == 1) {
                String str2 = actionLink.d;
                String C1 = this.o.C1();
                int H = drm0.H(str2);
                while (true) {
                    if (-1 >= H) {
                        str = "";
                        break;
                    } else {
                        if (str2.charAt(H) == '_') {
                            str = str2.substring(0, H + 1);
                            break;
                        }
                        H--;
                    }
                }
                String w0 = erm0.w0(1, str);
                new io.reactivex.rxjava3.internal.operators.single.h(hg1.n(rsg0.w0(new gns0(new UserId(Long.parseLong(w0)), Integer.parseInt(erm0.v0(w0.length() + 1, str2)), C1)), activity, false, null, 60), new bw(new h1(2, this, activity), 7)).subscribe();
                return;
            }
            if (i == 2) {
                String str3 = actionLink.d;
                fxc0.B().Y().A(activity, (r27 & 2) != 0 ? null : null, null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : str3, (r27 & 64) != 0 ? false : str3 != null, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                return;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        String str4 = actionLink.e;
        maz.c(xwk.d().e(), activity, str4, new LaunchContext(false, false, false, null, null, null, null, null, str4, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108607), null, null, 24);
    }

    @Override // xsna.hnt0
    public final void j4(VideoAutoPlay videoAutoPlay) {
        M0();
    }

    @Override // xsna.uc
    public final void k(VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar) {
        VideoTextureView videoTextureView = this.v;
        Trace.beginSection("AutoPlayDelegate.bind");
        try {
            yg5 yg5Var2 = this.j;
            if (!(yg5Var2 != null) || yg5Var2 == null) {
                yg5Var2 = null;
            }
            super.k(videoFile, yg5Var, aVar);
            this.F0 = this.o.m1();
            this.v0 = false;
            this.r = aVar;
            yg5 yg5Var3 = this.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            if (!yg5Var3.P0()) {
                videoTextureView.i(videoTextureView.getTransformController().e, false);
                videoTextureView.getMatrixProvider().l(this.o.getWidth(), this.o.getHeight());
            }
            fjz V = V();
            if (V != null) {
                V.c(this.o);
            }
            if (!yg5Var.equals(yg5Var2)) {
                if (yg5Var2 != null) {
                    yg5Var2.T(this);
                }
                this.x0 = false;
                ActionLinkView actionLinkView = this.Q;
                if (actionLinkView != null) {
                    actionLinkView.removeCallbacks(this.w0);
                }
                this.w0 = null;
                this.s0 = false;
            }
            L0();
            if (this.w.isAttachedToWindow() && (!this.L0 || this.G0.c)) {
                yg5Var.f0(this);
            }
            R0();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void l0(VideoFile videoFile, gzs<? extends yg5> gzsVar, com.vk.libvideo.autoplay.a aVar, izs<? super fh5, s3q0> izsVar) {
        if (this.G0.c) {
            k(videoFile, gzsVar.invoke(), aVar);
            izsVar.invoke(this);
            this.I0 = null;
        } else {
            this.I0 = new d(videoFile, gzsVar, aVar, izsVar);
            k(videoFile, new com.vk.libvideo.autoplay.d(videoFile), aVar);
            izsVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        M0();
        int i = 0;
        VideoAdLayout videoAdLayout = this.R;
        if (videoAdLayout != 0) {
            ?? r2 = this.d0;
            mzr0 mzr0Var = (mzr0) r2.getValue();
            mzr0Var.getClass();
            ofy0 ofy0Var = new ofy0(je0Var, mzr0Var);
            com.vk.libvideo.design.view.ad.data.a c2 = ((mzr0) r2.getValue()).c(aVar);
            mzr0 mzr0Var2 = (mzr0) r2.getValue();
            boolean z = this.n;
            boolean z2 = this.W != null;
            mzr0Var2.getClass();
            lo2 lo2Var = new lo2(this);
            VideoPipStateHolder.a.getClass();
            eg0 eg0Var = new eg0(z, false, false, lo2Var, z2, VideoPipStateHolder.d());
            ozr0 ozr0Var = (ozr0) this.c0.getValue();
            qcy<Object>[] qcyVarArr = VideoAdLayout.d;
            videoAdLayout.a(ofy0Var, c2, eg0Var, null, ozr0Var, this.b0);
        }
        VideoTextureView videoTextureView = this.v;
        ViewParent parent = videoTextureView.getParent();
        sh0 sh0Var = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(g2u0.a(R.color.vk_black, videoTextureView));
        }
        if (aVar instanceof a.AbstractC1195a) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            Pair pair = new Pair(Integer.valueOf(abstractC1195a.a().getWidth()), Integer.valueOf(abstractC1195a.a().getHeight()));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            videoTextureView.i(scaleType, false);
            videoTextureView.getMatrixProvider().l(intValue, intValue2);
            boolean a2 = abstractC1195a.a().a();
            AdBannerData.AdRedirectData b2 = abstractC1195a.a().b();
            String str = b2.b;
            Integer num = b2.c;
            Integer num2 = b2.d;
            String str2 = b2.e;
            String str3 = b2.f;
            sh0 sh0Var2 = new sh0(str, num, num2, str2, str3 != null ? new kiw(str3) : null);
            if (!abstractC1195a.c() && !a2) {
                sh0Var = sh0Var2;
            }
            D(sh0Var, new eh5(i, je0Var, this));
        }
        P0();
    }

    public final void m0() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        VideoPipStateHolder.a.getClass();
        if (!epx.f(yg5Var, VideoPipStateHolder.c())) {
            VideoPipStateHolder.b();
        }
        cnt0 cnt0Var = this.q;
        if (cnt0Var != null) {
            cnt0Var.i(this);
        }
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        toString();
        yg5Var2.z0(this.v, this.r, null);
        yg5 yg5Var3 = this.j;
        (yg5Var3 != null ? yg5Var3 : null).f();
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        P0();
    }

    public final void n0() {
        cnt0 cnt0Var = this.q;
        if (cnt0Var != null) {
            cnt0Var.i(this);
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        toString();
        yg5Var.z0(this.v, this.r, null);
        yg5 yg5Var2 = this.j;
        (yg5Var2 != null ? yg5Var2 : null).S(false);
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        P0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    @Override // xsna.uc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Activity activity, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, boolean z2, String str3) {
        boolean z3;
        yg5 yg5Var;
        yg5 yg5Var2;
        yg5 yg5Var3;
        if (activity.isFinishing()) {
            return;
        }
        boolean d2 = g620.f().d(this.o);
        Object[] objArr = gpt0.c(activity) && fxc0.B().c0() && (z || !this.o.e2()) && (!this.o.W9() || z);
        if (!fxc0.B().J().J1() && ((objArr != false || !this.o.W9()) && !d2)) {
            c();
        }
        if (this.u0.g()) {
            this.z.a(this.y);
            this.v.setVisibility(4);
        }
        if (fxc0.B().J().k0()) {
            yg5 yg5Var4 = this.j;
            if (yg5Var4 == null) {
                yg5Var4 = null;
            }
            if (((yg5Var4.isPlaying() || yg5Var4.getPosition() > 0) ? yg5Var4.getPosition() : com.vk.libvideo.autoplay.j.b(yg5Var4.A())) >= yg5Var4.getDuration()) {
                z3 = true;
                yg5Var = this.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                rlt0 m0 = yg5Var.m0();
                Object[] objArr2 = ((m0 == null && m0.b != null) || this.o.p0() || brm0.w(this.k, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM), false)) ? false : true;
                yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                yg5Var2.x0(ForceLogReason.TAP);
                yg5Var3 = this.j;
                if (yg5Var3 == null) {
                    yg5Var3 = null;
                }
                if (!yg5Var3.v()) {
                    fjz V = V();
                    if (V != null) {
                        V.pause();
                    }
                    if (!this.n && g620.f().d(this.o)) {
                        ClipsRouter.l(g620.f().a(), activity, this.o.I0(), Collections.singletonList(this.o), this, 16);
                        return;
                    }
                    ydt0 Y = fxc0.B().Y();
                    VideoFile videoFile = this.o;
                    yg5 yg5Var5 = this.j;
                    ydt0.p(Y, activity, videoFile, true ^ (yg5Var5 != null ? yg5Var5 : null).p0(), this.O, searchStatsLoggingInfo, this.k, this.m, null, this, 16);
                    return;
                }
                if (!d2) {
                    if (objArr2 == true && objArr == true) {
                        k0(this, activity, searchStatsLoggingInfo, str2, null, z2, z3, 24);
                        return;
                    } else {
                        ydt0.s(fxc0.B().Y(), activity, this.o, this, !fxc0.B().o(), null, null, this.A0, null, this.k, 7872);
                        return;
                    }
                }
                View view = this.C;
                a1p0 a1p0Var = view instanceof a1p0 ? (a1p0) view : null;
                if (a1p0Var != null) {
                    a1p0Var.G(false);
                }
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (!com.vk.libvideo.autoplay.e.c()) {
                    com.vk.libvideo.autoplay.e.e(false);
                }
                this.X.a(activity, str, this.o, this);
                return;
            }
        }
        z3 = false;
        yg5Var = this.j;
        if (yg5Var == null) {
        }
        rlt0 m02 = yg5Var.m0();
        if (m02 == null) {
        }
        yg5Var2 = this.j;
        if (yg5Var2 == null) {
        }
        yg5Var2.x0(ForceLogReason.TAP);
        yg5Var3 = this.j;
        if (yg5Var3 == null) {
        }
        if (!yg5Var3.v()) {
        }
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
        BaseSubtitleView baseSubtitleView;
        if (!this.G0.c || (baseSubtitleView = this.K) == null) {
            return;
        }
        baseSubtitleView.setRenderItems(list);
    }

    public final void q0(boolean z) {
        this.f0 = z;
        View view = this.A;
        if (view != null) {
            bwt0.p0(view, c0());
        }
    }

    public final void r0(boolean z) {
        dko gkoVar;
        wfk0 wfk0Var = this.G;
        boolean z2 = (wfk0Var != null ? wfk0Var.b() : null) instanceof ImageView;
        if (wfk0Var != null) {
            boolean z3 = this.K0;
            wqj wqjVar = this.V;
            if (z3) {
                gkoVar = new eko(z2 ? z ? wqjVar.d : wqjVar.e : z ? wqjVar.b : wqjVar.c);
            } else {
                gkoVar = new gko(z2 ? z ? wqjVar.l : wqjVar.m : z ? wqjVar.j : wqjVar.k);
            }
            wfk0Var.a(gkoVar);
        }
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        P0();
    }

    public final boolean s0() {
        if (this.F == null) {
            return false;
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        if (yg5Var.A().C2()) {
            return false;
        }
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        if (yg5Var2.v()) {
            return false;
        }
        yg5 yg5Var3 = this.j;
        if (yg5Var3 == null) {
            yg5Var3 = null;
        }
        if (yg5Var3.J()) {
            return false;
        }
        yg5 yg5Var4 = this.j;
        if (yg5Var4 == null) {
            yg5Var4 = null;
        }
        if (yg5Var4.a()) {
            return false;
        }
        yg5 yg5Var5 = this.j;
        if (yg5Var5 == null) {
            yg5Var5 = null;
        }
        if (yg5Var5.P0() || !this.G0.c) {
            return false;
        }
        yg5 yg5Var6 = this.j;
        if (yg5Var6 == null) {
            yg5Var6 = null;
        }
        if (yg5Var6.isPlaying()) {
            return true;
        }
        yg5 yg5Var7 = this.j;
        if (yg5Var7 == null) {
            yg5Var7 = null;
        }
        if (yg5Var7.d()) {
            return true;
        }
        yg5 yg5Var8 = this.j;
        return (yg5Var8 != null ? yg5Var8 : null).isPaused();
    }

    @Override // xsna.uc, xsna.dnt0
    public final void setVideoFocused(boolean z) {
        k00 k00Var = new k00(this, 5);
        uls0 uls0Var = this.G0;
        View view = uls0Var.a;
        if (z == uls0Var.c) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(uls0Var.b);
        tls0 tls0Var = null;
        if (!z) {
            uls0Var.b = null;
            uls0Var.c = false;
            k00Var.invoke(Boolean.FALSE);
            return;
        }
        rls0 rls0Var = new rls0(0, uls0Var, k00Var);
        if (view.isShown()) {
            rls0Var.invoke(view);
        } else {
            tls0Var = new tls0(view, rls0Var);
            view.getViewTreeObserver().addOnGlobalLayoutListener(tls0Var);
            view.addOnAttachStateChangeListener(new sls0(view, view, tls0Var));
        }
        uls0Var.b = tls0Var;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AutoPlayDelegate(id="), this.g, ')');
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0.isPlaying() != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0() {
        boolean z;
        yg5 yg5Var;
        boolean z2;
        yg5 yg5Var2;
        VideoRestriction O;
        String str;
        yg5 yg5Var3 = this.j;
        if (yg5Var3 == null) {
            yg5Var3 = null;
        }
        if (!yg5Var3.d()) {
            yg5 yg5Var4 = this.j;
            if (yg5Var4 == null) {
                yg5Var4 = null;
            }
        }
        yg5 yg5Var5 = this.j;
        if (yg5Var5 == null) {
            yg5Var5 = null;
        }
        if (yg5Var5.v0() != null) {
            z = true;
            yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (!yg5Var.P0()) {
                yg5 yg5Var6 = this.j;
                if (yg5Var6 == null) {
                    yg5Var6 = null;
                }
                if (!yg5Var6.w0()) {
                    z2 = false;
                    if (!z || z2) {
                        if (this.o.k0()) {
                            yg5 yg5Var7 = this.j;
                            if (yg5Var7 == null) {
                                yg5Var7 = null;
                            }
                            if (!yg5Var7.P0()) {
                                if (this.o.k0() && (O = this.o.O()) != null && (str = O.j) != null) {
                                    com.vk.music.notifications.inapp.b.f(new qst0(str), null, null, 14);
                                }
                            }
                        }
                        yg5Var2 = this.j;
                        if (yg5Var2 == null) {
                            yg5Var2 = null;
                        }
                        rlt0 m0 = yg5Var2.m0();
                        if (this.r.c) {
                            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                            b.C1208b.a().n();
                        } else {
                            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                            if (com.vk.libvideo.autoplay.e.c()) {
                                com.vk.libvideo.autoplay.e.f(false);
                                yg5 yg5Var8 = this.j;
                                yg5 yg5Var9 = yg5Var8 != null ? yg5Var8 : null;
                                z2s0.b.getClass();
                                yg5Var9.setVolume(z2s0.n);
                                if (m0 != null) {
                                    m0.i("volume", "on");
                                }
                            } else {
                                com.vk.libvideo.autoplay.e.f(true);
                                yg5 yg5Var10 = this.j;
                                (yg5Var10 != null ? yg5Var10 : null).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                if (m0 != null) {
                                    m0.i("volume", "off");
                                }
                            }
                        }
                        M0();
                        H0(b0() ? R.string.video_sound_off : R.string.video_sound_on);
                        return true;
                    }
                    return false;
                }
            }
            z2 = true;
            if (!z) {
            }
            if (this.o.k0()) {
            }
            yg5Var2 = this.j;
            if (yg5Var2 == null) {
            }
            rlt0 m02 = yg5Var2.m0();
            if (this.r.c) {
            }
            M0();
            H0(b0() ? R.string.video_sound_off : R.string.video_sound_on);
            return true;
        }
        z = false;
        yg5Var = this.j;
        if (yg5Var == null) {
        }
        if (!yg5Var.P0()) {
        }
        z2 = true;
        if (!z) {
        }
        if (this.o.k0()) {
        }
        yg5Var2 = this.j;
        if (yg5Var2 == null) {
        }
        rlt0 m022 = yg5Var2.m0();
        if (this.r.c) {
        }
        M0();
        H0(b0() ? R.string.video_sound_off : R.string.video_sound_on);
        return true;
    }

    public final void v0() {
        OneVideoPlayer a2;
        OneVideoPlayer a3;
        yg5 yg5Var = this.j;
        one.video.player.tracks.b bVar = null;
        if (yg5Var == null) {
            yg5Var = null;
        }
        d3b0 v0 = yg5Var.v0();
        if (v0 == null || (a2 = v0.a()) == null) {
            return;
        }
        if (a2.Q() != null) {
            a2.t();
        } else {
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            one.video.player.tracks.b bVar2 = (one.video.player.tracks.b) j5g.a0(yg5Var2.O0());
            if (bVar2 != null) {
                a2.z(bVar2);
            }
        }
        yg5 yg5Var3 = this.j;
        if (yg5Var3 == null) {
            yg5Var3 = null;
        }
        d3b0 v02 = yg5Var3.v0();
        if (v02 != null && (a3 = v02.a()) != null) {
            bVar = a3.Q();
        }
        H0(bVar == null ? R.string.video_subtitles_on : R.string.video_subtitles_off);
    }

    @Override // xsna.uc, xsna.mnt0
    public final void w0(View view) {
        View b2;
        ViewGroup viewGroup = this.w;
        View view2 = this.y;
        VideoTextureView videoTextureView = this.v;
        Trace.beginSection("AutoPlayDelegate.onViewDetached");
        try {
            view.removeCallbacks(this.J0);
            this.J0 = null;
            ViewParent parent = videoTextureView.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(this.m0);
            }
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (yg5Var.j0(videoTextureView)) {
                yg5 yg5Var2 = this.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                if (yg5Var2.getConfig().j) {
                    yg5 yg5Var3 = this.j;
                    if (yg5Var3 == null) {
                        yg5Var3 = null;
                    }
                    yg5Var3.O();
                    yg5 yg5Var4 = this.j;
                    if (yg5Var4 == null) {
                        yg5Var4 = null;
                    }
                    yg5Var4.D();
                }
            }
            yg5 yg5Var5 = this.j;
            if (yg5Var5 == null) {
                yg5Var5 = null;
            }
            boolean z = yg5Var5.getConfig().p == PlayerType.INLINE;
            yg5 yg5Var6 = this.j;
            if (yg5Var6 == null) {
                yg5Var6 = null;
            }
            if ((!yg5Var6.p0() || !this.r.g) && z) {
                yg5 yg5Var7 = this.j;
                if (yg5Var7 == null) {
                    yg5Var7 = null;
                }
                yg5Var7.pause();
            }
            yg5 yg5Var8 = this.j;
            if (yg5Var8 == null) {
                yg5Var8 = null;
            }
            yg5Var8.T(this);
            yg5 yg5Var9 = this.j;
            if (yg5Var9 == null) {
                yg5Var9 = null;
            }
            yg5Var9.b0(videoTextureView);
            int i = 2;
            if (this.s0) {
                ViewGroup viewGroup3 = this.i.get();
                int adapterPosition = this.u.getAdapterPosition();
                if (adapterPosition >= 0 && (viewGroup3 instanceof RecyclerView)) {
                    i0q0.f(new rif((RecyclerView) viewGroup3, adapterPosition, i));
                }
            }
            yg5 yg5Var10 = this.j;
            if (yg5Var10 == null) {
                yg5Var10 = null;
            }
            bwt0.p0(view2, !yg5Var10.B());
            d3m.b(view2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            fjz V = V();
            if (V != null) {
                V.a();
            }
            DurationView durationView = this.b;
            if (durationView != null) {
                durationView.c();
            }
            InteractiveDurationView interactiveDurationView = this.J;
            if (interactiveDurationView != null) {
                interactiveDurationView.e();
            }
            xb60 xb60Var = this.D;
            if (xb60Var != null) {
                xb60Var.G(false);
            }
            wfk0 wfk0Var = this.G;
            d3m.b(wfk0Var != null ? wfk0Var.b() : null, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (wfk0Var != null && (b2 = wfk0Var.b()) != null) {
                f4m.j(b2);
            }
            ImageView imageView = this.H;
            d3m.b(imageView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (imageView != null) {
                f4m.j(imageView);
            }
            View view3 = this.I;
            d3m.b(view3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (view3 != null) {
                f4m.j(view3);
            }
            wqj wqjVar = this.V;
            d3m.b(wqjVar.a, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            TextView textView = wqjVar.a;
            if (textView != null) {
                f4m.j(textView);
            }
            BaseSubtitleView baseSubtitleView = this.K;
            if (baseSubtitleView != null) {
                baseSubtitleView.setRenderItems(null);
            }
            io.reactivex.rxjava3.disposables.c cVar = this.E0;
            if (cVar != null) {
                cVar.dispose();
            }
            O0(this.u0, false);
            d3m.b(viewGroup, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            ActionLinkView actionLinkView = this.Q;
            if (actionLinkView != null) {
                d3m.b(actionLinkView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            }
            C0(false, false);
            if (actionLinkView != null) {
                actionLinkView.removeCallbacks(this.w0);
            }
            fxc0.B().N().getClass();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void x() {
        Context b2 = enj.b(this.w);
        if (b2 == null) {
            b2 = this.n0;
        }
        if (this.o.j0()) {
            bfs0.d(b2, 0, null, new wo1(1, b2, this), 14);
        } else {
            hg1.b(this.v, w1s0.b(b2, this.o, this.k, this.m, new bh5(this, 0)));
        }
    }

    public final void y() {
        boolean isAttachedToWindow = this.w.isAttachedToWindow();
        InteractiveDurationView interactiveDurationView = this.J;
        DurationView durationView = this.b;
        if (!isAttachedToWindow) {
            if (durationView != null) {
                durationView.c();
            }
            if (interactiveDurationView != null) {
                interactiveDurationView.e();
                return;
            }
            return;
        }
        if (a0()) {
            return;
        }
        if (durationView != null) {
            a aVar = this.u0;
            qj80.a(durationView, new moo(durationView, durationView, aVar.e, aVar.f));
        }
        if (interactiveDurationView != null) {
            a aVar2 = this.u0;
            interactiveDurationView.a(aVar2.e, aVar2.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        boolean z;
        View view;
        if (this.u0.b()) {
            yg5 yg5Var = this.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (yg5Var.p0() && this.r.g) {
                z = true;
                boolean z2 = z;
                view = this.C;
                if (view != 0) {
                    return;
                }
                if (view instanceof xcs0) {
                    bwt0.a(view, z2, true, d0() ? 100L : 300L, 88);
                    return;
                } else if (view instanceof a1p0) {
                    ((a1p0) view).G(z2);
                    return;
                } else {
                    bwt0.p0(view, z2);
                    return;
                }
            }
        }
        z = false;
        boolean z22 = z;
        view = this.C;
        if (view != 0) {
        }
    }

    @Override // xsna.jux0
    public final View getVideoView() {
        VideoOverlayView videoOverlayView;
        return (!fxc0.B().c(this.o) || (videoOverlayView = this.L) == null) ? this.v : videoOverlayView;
    }

    public fh5(sj0 sj0Var, VideoTextureView videoTextureView, ViewGroup viewGroup, float f, View view, zpx zpxVar, View view2, View view3, View view4, xb60 xb60Var, ProgressBar progressBar, j3i0 j3i0Var, wfk0 wfk0Var, ImageView imageView, View view5, DurationView durationView, InteractiveDurationView interactiveDurationView, BaseSubtitleView baseSubtitleView, VideoOverlayView videoOverlayView, VideoErrorView videoErrorView, ViewGroup viewGroup2, SpectatorsCounterView spectatorsCounterView, boolean z, boolean z2, ActionLinkView actionLinkView, VideoAdLayout videoAdLayout, a1p0 a1p0Var, View view6, boolean z3, wqj wqjVar, ih5 ih5Var, View view7, y1f y1fVar, io2 io2Var, jh5 jh5Var, View view8) {
        super(durationView, null, ih5Var);
        this.u = sj0Var;
        this.v = videoTextureView;
        this.w = viewGroup;
        this.x = f;
        this.y = view;
        this.z = zpxVar;
        this.A = view2;
        this.B = view3;
        this.C = view4;
        this.D = xb60Var;
        this.E = progressBar;
        this.F = j3i0Var;
        this.G = wfk0Var;
        this.H = imageView;
        this.I = view5;
        this.J = interactiveDurationView;
        this.K = baseSubtitleView;
        this.L = videoOverlayView;
        this.M = videoErrorView;
        this.N = spectatorsCounterView;
        this.O = z;
        this.P = z2;
        this.Q = actionLinkView;
        this.R = videoAdLayout;
        this.S = a1p0Var;
        this.T = view6;
        this.U = z3;
        this.V = wqjVar;
        this.W = view7;
        this.X = y1fVar;
        this.Y = io2Var;
        this.Z = jh5Var;
        this.a0 = view8;
        x5 x5Var = new x5(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b0 = msy.a(lazyThreadSafetyMode, x5Var);
        this.c0 = msy.a(lazyThreadSafetyMode, new d14(1));
        this.d0 = msy.a(lazyThreadSafetyMode, new d2(3));
        this.e0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.v(4));
        this.f0 = true;
        this.g0 = new bpn0(new ek(2));
        this.h0 = new bpn0(new t61(3));
        this.i0 = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 4));
        this.j0 = msy.a(lazyThreadSafetyMode, new pr1(2));
        this.k0 = msy.a(lazyThreadSafetyMode, new i9(3));
        this.l0 = msy.a(lazyThreadSafetyMode, new d1(2));
        ViewParent parent = videoTextureView.getParent();
        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        this.m0 = viewGroup3 != null ? viewGroup3.getBackground() : null;
        Context context = viewGroup.getContext();
        this.n0 = context;
        int argb = Color.argb(153, 0, 0, 0);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        this.o0 = new PorterDuffColorFilter(argb, mode);
        this.p0 = new PorterDuffColorFilter(context.getColor(R.color.vk_gray_850), mode);
        this.q0 = new PorterDuffColorFilter(Color.argb(200, 0, 0, 0), mode);
        this.r0 = new bpn0(new j6(1, viewGroup2, this));
        this.t0 = new a();
        this.u0 = new a();
        this.C0 = true;
        this.D0 = new w40(this, 8);
        this.G0 = new uls0(viewGroup);
        this.H0 = d0() ? new uoj0(new com.vk.movika.sdk.base.hooks.p(this, 10)) : null;
        this.K0 = fxc0.B().J().O();
        this.L0 = fxc0.B().J().B();
    }

    @Override // xsna.hnt0
    public final void E() {
    }

    @Override // xsna.hnt0
    public final void c2() {
    }

    @Override // xsna.hnt0
    public final void t2() {
    }

    @Override // xsna.hnt0
    public final void u() {
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void a(boolean z) {
    }

    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void x0(boolean z) {
    }

    @Override // xsna.hnt0
    public final void H(long j, long j2) {
    }

    @Override // xsna.hnt0
    public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
    }

    @Override // xsna.hnt0
    public final void N3(VideoAutoPlay videoAutoPlay, long j) {
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
    }

    @Override // xsna.hnt0
    public final void z0(VideoAutoPlay videoAutoPlay, int i) {
    }
}
