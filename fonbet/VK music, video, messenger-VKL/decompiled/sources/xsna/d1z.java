package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.SubsShowBlocker;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.a;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.controls.views.PlayButton;
import one.video.controls.views.PlayerControlsView;
import one.video.controls.views.SkipBackButton;
import one.video.controls.views.SkipForwardButton;
import one.video.controls.views.VideoShortActions;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.smartcast.api.ConnectionState;
import one.video.transform.TransformController;
import xsna.fys;
import xsna.ir20;
import xsna.t5t0;
import xsna.ye0;
import xsna.yks0;

/* compiled from: LegacyMiniPlayerViewWrapper.kt */
@ozl
/* loaded from: classes7.dex */
public final class d1z implements ir20, owa0 {
    public final Context b;
    public final ViewGroup c;
    public final i8z d;
    public final i8z e;
    public final com.vk.video.ui.discovery.minimizable.j f;
    public final ir20.a g;
    public final boolean h;
    public v49 i;
    public final boolean j;
    public final hgs0 k;
    public final Object l;
    public final hgs0 m;
    public final Object n;
    public final AppCompatActivity o;
    public final a p;
    public final etn q;
    public yg5 r;
    public xnt0 s;
    public boolean t;
    public boolean u;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1z(Context context, ViewGroup viewGroup, i8z i8zVar, i8z i8zVar2, com.vk.video.ui.discovery.minimizable.j jVar, ir20.a aVar, boolean z) {
        boolean z2;
        this.b = context;
        this.c = viewGroup;
        this.d = i8zVar;
        this.e = i8zVar2;
        this.f = jVar;
        this.g = aVar;
        this.h = z;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures)) {
            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
            videoFeatures2.getClass();
            if (bVar.a(videoFeatures2)) {
                z2 = true;
                this.j = z2;
                hgs0 hgs0Var = new hgs0(context);
                if (z2) {
                    hgs0Var.getViewBinding().r.g2(viewGroup.findViewById(R.id.touchable_seek_zone));
                }
                this.k = hgs0Var;
                f20 f20Var = new f20(19);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.l = msy.a(lazyThreadSafetyMode, f20Var);
                this.m = hgs0Var;
                this.n = msy.a(lazyThreadSafetyMode, new bfm(this, 14));
                bpn0 bpn0Var = enj.a;
                this.o = (AppCompatActivity) e3m.h(context);
                this.p = new a();
                this.q = gsi0.b();
                hgs0Var.getViewBinding().z.setControlsListener(new c1z(this));
                hgs0Var.getViewBinding().z.findViewById(R.id.enter_pip).setContentDescription(context.getString(R.string.video_accessibility_collapse_to_miniplayer));
                hgs0Var.setHideControlsAfterFastSeek(true);
            }
        }
        z2 = false;
        this.j = z2;
        hgs0 hgs0Var2 = new hgs0(context);
        if (z2) {
        }
        this.k = hgs0Var2;
        f20 f20Var2 = new f20(19);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode2, f20Var2);
        this.m = hgs0Var2;
        this.n = msy.a(lazyThreadSafetyMode2, new bfm(this, 14));
        bpn0 bpn0Var2 = enj.a;
        this.o = (AppCompatActivity) e3m.h(context);
        this.p = new a();
        this.q = gsi0.b();
        hgs0Var2.getViewBinding().z.setControlsListener(new c1z(this));
        hgs0Var2.getViewBinding().z.findViewById(R.id.enter_pip).setContentDescription(context.getString(R.string.video_accessibility_collapse_to_miniplayer));
        hgs0Var2.setHideControlsAfterFastSeek(true);
    }

    public static boolean h(VideoFile videoFile, boolean z) {
        boolean z2;
        if (videoFile != null && fxc0.B().s().k(videoFile)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                z2 = true;
                return (z || z2) ? false : true;
            }
        }
        z2 = false;
        if (z) {
        }
    }

    @Override // xsna.ir20
    public final yks0.a Gc() {
        return this.k;
    }

    @Override // xsna.ir20
    public final boolean H4() {
        return this.r != null;
    }

    @Override // xsna.ir20
    public final void L2(lat0 lat0Var) {
        b1z b1zVar = new b1z(this, 0);
        tbg tbgVar = new tbg(this, 27);
        if (!lat0Var.a) {
            b1zVar = null;
        }
        hgs0 hgs0Var = this.k;
        hgs0Var.setSkipBackListener(b1zVar);
        if (!lat0Var.b) {
            tbgVar = null;
        }
        hgs0Var.setSkipForwardListener(tbgVar);
    }

    @Override // xsna.ir20
    public final void Q(VideoMinimizableState videoMinimizableState) {
        yg5 yg5Var;
        yg5 yg5Var2;
        boolean z = this.h;
        hgs0 hgs0Var = this.k;
        if (!z) {
            yg5 yg5Var3 = this.r;
            if (yg5Var3 != null) {
                yg5Var3.T(hgs0Var);
            }
            yg5 yg5Var4 = this.r;
            if (yg5Var4 != null) {
                yg5Var4.f0(hgs0Var);
            }
        }
        fys fysVar = ((MiniPlayerControllersWrapper) this.g.e.c).o;
        if (!(fysVar instanceof fys.b) && !(fysVar instanceof fys.c)) {
            boolean z2 = videoMinimizableState instanceof VideoMinimizableState.Animating;
            boolean z3 = z2 && com.vk.libvideo.api.minimizable.a.c((VideoMinimizableState.Animating) videoMinimizableState, new Class[]{VideoMinimizableState.Expanded.class}, new Class[]{VideoMinimizableState.FullscreenHorizontal.class, VideoMinimizableState.FullscreenVertical.class});
            boolean z4 = z2 && com.vk.libvideo.api.minimizable.a.b((VideoMinimizableState.Animating) videoMinimizableState, VideoMinimizableState.Expanded.Compact.class, VideoMinimizableState.Expanded.MatchRatio.class);
            boolean d = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures.getClass();
            hgs0Var.G0(!com.vk.toggle.b.A.a(videoFeatures) ? !(((yg5Var = this.r) == null || !yg5Var.isPlaying()) && !z3 && (d || z4)) : !(((yg5Var2 = this.r) == null || !yg5Var2.isPlaying()) && !z3 && (d || z4)), videoMinimizableState instanceof VideoMinimizableState.Pip);
        }
        if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
            yum0.a(hgs0Var.getSubsVisibilityController(), SubsShowBlocker.MINIMIZABLE_STATE);
        } else {
            yum0 subsVisibilityController = hgs0Var.getSubsVisibilityController();
            subsVisibilityController.b.add(SubsShowBlocker.MINIMIZABLE_STATE);
            subsVisibilityController.b(false);
        }
        hgs0Var.Y(300L);
        if (this.j) {
            hgs0Var.getViewBinding().r.setSeekBarAlwaysVisible(com.vk.libvideo.api.minimizable.a.e(videoMinimizableState) && hgs0Var.r0());
            if (hgs0Var.getViewBinding().r.K3() && (videoMinimizableState instanceof VideoMinimizableState.Animating)) {
                hgs0Var.getViewBinding().r.p1(false);
            }
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
            return;
        }
        hgs0Var.getViewBinding().c.h();
        VideoFile videoFile = hgs0Var.getVideoFile();
        if (videoFile != null && videoFile.e2()) {
            hgs0Var.getViewBinding().c.getTransformController().f(TransformController.ScaleType.FIT, false);
        }
        hgs0Var.j0(TransformController.ScaleType.FIT);
    }

    @Override // xsna.ir20
    public final void Sf(boolean z) {
        hgs0 hgs0Var = this.k;
        hgs0Var.setFullscreenLocked(z);
        hgs0Var.Y(300L);
        if (z && this.j) {
            hgs0Var.getViewBinding().r.p1(false);
        }
    }

    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return this.s;
    }

    @Override // xsna.ir20
    public final void Z0(PlayerRemoteController.Properties properties) {
        boolean z = properties.b;
        this.t = z;
        this.u = properties.c;
        hgs0 hgs0Var = this.k;
        hgs0Var.setShowPlaylist(z);
        VideoFullscreenBottomBarView fullscreenBottomBar = hgs0Var.getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            fullscreenBottomBar.setShowPlaylistButton(this.t);
        }
        hgs0Var.setShowFeedbackButton(h(hgs0Var.getVideoFile(), this.u));
    }

    @Override // xsna.i2b0
    public final boolean a() {
        return false;
    }

    @Override // xsna.i2b0
    public final Boolean b() {
        return Boolean.valueOf(this.k.getViewBinding().c.g());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ir20
    public final void b7() {
        OneVideoPlayer a2;
        yg5 yg5Var = this.r;
        hgs0 hgs0Var = this.k;
        if (yg5Var != null) {
            yg5Var.T(hgs0Var);
            yg5Var.T(this.p);
            yg5Var.T(((MiniPlayerControllersWrapper) this.g.a.c).v);
            d3b0 v0 = yg5Var.v0();
            if (v0 != null && (a2 = v0.a()) != null) {
                a2.setPlaybackSpeed(1.0f);
            }
            super.jg(yg5Var);
        }
        g(null);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((c4k0) this.n.getValue()).getClass();
        }
        hgs0Var.setOnClickListener(null);
        hgs0Var.setOrientationListener(null);
        hgs0Var.setVideoFileController(null);
        hgs0Var.setVideoClickActionCallback(null);
        yg5 autoPlay = hgs0Var.getAutoPlay();
        if (autoPlay != null) {
            autoPlay.k0();
        }
        hgs0Var.setAutoPlay(null);
        hgs0Var.setVideoFile(null);
    }

    public final void c(boolean z) {
        hgs0 hgs0Var = this.k;
        yg5 autoPlay = hgs0Var.getAutoPlay();
        if (autoPlay == null) {
            return;
        }
        hgs0Var.l0();
        com.vk.libvideo.autoplay.a videoConfig = hgs0Var.getVideoConfig();
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.d(z);
        autoPlay.a0(videoConfig);
        autoPlay.l0();
        hgs0Var.getViewBinding().v.setAutoplayEnabled(z);
        VideoToolbarView videoToolbarView = hgs0Var.getViewBinding().H;
        if (videoToolbarView != null) {
            videoToolbarView.setAutoPlayEnabled(z);
        }
    }

    @Override // xsna.ir20
    public final int c2() {
        yg5 yg5Var = this.r;
        if (yg5Var != null) {
            return (int) (((yg5Var.isPlaying() || yg5Var.getPosition() > 0) ? yg5Var.getPosition() : com.vk.libvideo.autoplay.j.b(yg5Var.A())) / 1000);
        }
        return 0;
    }

    @Override // xsna.ir20
    public final void d() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            this.i = new v49(this.b, (owa0) this);
        }
        this.s = new xnt0(this.c, this.k, null, 4);
    }

    @Override // xsna.ir20
    public final void dg(yks0 yks0Var) {
        yg5 autoPlay = this.k.getAutoPlay();
        if (autoPlay == null || yks0Var == null) {
            return;
        }
        yks0Var.d(autoPlay);
    }

    public final yg5 e(ir20.b bVar, izs<? super String, s3q0> izsVar) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        MiniPlayerControllersWrapper.VideoInfo videoInfo = bVar.a;
        yg5 e = a2.e(videoInfo.b, null);
        boolean z = videoInfo.f;
        long j = videoInfo.h;
        if (!z && e.M()) {
            e.D();
        }
        yg5.o0(e, videoInfo.d, null, videoInfo.b.r(), false, 2);
        e.f0(this.p);
        ir20.a aVar = this.g;
        e.f0(((MiniPlayerControllersWrapper) aVar.a.c).v);
        ((MiniPlayerControllersWrapper) aVar.a.c).v.c(new a.c.b(e));
        int duration = e.A().getDuration();
        if (0 <= j && j <= duration) {
            long j2 = 1000 * j;
            yg5 yg5Var = this.r;
            if (yg5Var != null) {
                yg5Var.seek(j2);
            }
            bpn0 bpn0Var2 = t5t0.e;
            t5t0.a.a().b(TimeUnit.SECONDS.toMillis(j), e.A().r1());
            this.f.v();
        }
        if (fxc0.B().J().k0() && videoInfo.i) {
            e.S(false);
        }
        g(e);
        izsVar.invoke(e.q());
        return e;
    }

    @Override // xsna.ir20
    public final void e7(ir20.d dVar) {
        VideoFullscreenBottomBarView fullscreenBottomBar;
        VideoTopBarView topBar;
        VideoToolbarView videoToolbarView;
        rlt0 m0;
        boolean z = dVar instanceof ir20.d.e;
        hgs0 hgs0Var = this.k;
        if (z) {
            hgs0Var.l0();
            return;
        }
        if (dVar instanceof ir20.d.b) {
            yg5 yg5Var = this.r;
            if (yg5Var == null || yg5Var.a()) {
                return;
            }
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d()) {
                return;
            }
            yg5Var.z0(hgs0Var.getViewBinding().c, hgs0Var.getVideoConfig(), null);
            yg5Var.l0();
            yg5Var.play();
            return;
        }
        if (dVar instanceof ir20.d.f) {
            yg5 yg5Var2 = this.r;
            if (yg5Var2 != null && (m0 = yg5Var2.m0()) != null) {
                m0.m(FullscreenTransition.TAP);
            }
            yg5 yg5Var3 = this.r;
            if (yg5Var3 != null) {
                yg5Var3.x0(ForceLogReason.FULLSCREEN);
                return;
            }
            return;
        }
        if (!(dVar instanceof ir20.d.a)) {
            if (dVar instanceof ir20.d.c) {
                return;
            }
            if (dVar instanceof ir20.d.C3076d) {
                if (hgs0Var.r0) {
                    hgs0Var.S0();
                    return;
                }
                return;
            } else if (dVar.equals(ir20.d.h.a)) {
                if (hgs0Var.r0) {
                    return;
                }
                hgs0Var.S0();
                return;
            } else {
                if (!(dVar instanceof ir20.d.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoTopBarView topBar2 = hgs0Var.getTopBar();
                if (topBar2 != null) {
                    topBar2.setScreenState(((ir20.d.g) dVar).a);
                    return;
                }
                return;
            }
        }
        ir20.d.a aVar = (ir20.d.a) dVar;
        VideoFile videoFile = aVar.a;
        DonutVideoUiModel donutVideoUiModel = aVar.b;
        boolean z2 = aVar.c;
        boolean z3 = aVar.d;
        Boolean valueOf = Boolean.valueOf(videoFile.T1());
        etn etnVar = this.q;
        boolean z4 = etnVar.j(z2, valueOf) && hgs0Var.M;
        boolean z5 = etnVar.f(z2, Boolean.valueOf(videoFile.T1())) && hgs0Var.M;
        if (!z4 && (videoToolbarView = hgs0Var.getViewBinding().H) != null) {
            videoToolbarView.d(null, videoFile, z3, z2, this.t);
            z2 = z2;
        }
        if (z4 && (topBar = hgs0Var.getTopBar()) != null) {
            boolean z6 = hgs0Var.M;
            boolean U = videoFile.U();
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            boolean a2 = com.vk.libvideo.autoplay.e.a();
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                qu5.c().getClass();
            }
            q8p0 q8p0Var = new q8p0(z2, z6, videoFile, donutVideoUiModel, z3, U, a2, false, ControlsState.CastStatus.UNAVAILABLE);
            videoFile = videoFile;
            topBar.a(q8p0Var);
        }
        VideoToolbarView videoToolbarView2 = hgs0Var.getViewBinding().H;
        if (videoToolbarView2 != null) {
            videoToolbarView2.setVisibility(!z4 ? 0 : 8);
        }
        VideoTopBarView topBar3 = hgs0Var.getTopBar();
        if (topBar3 != null) {
            topBar3.setVisibility(z4 ? 0 : 8);
        }
        hgs0Var.getViewBinding().z.getPlayerButtons().setFullScreenMode(true);
        if (!z5) {
            VideoBottomPanelView videoBottomPanelView = hgs0Var.getViewBinding().G;
            if (videoBottomPanelView != null) {
                videoBottomPanelView.setShowPlaylist(this.t);
            }
            VideoBottomPanelView videoBottomPanelView2 = hgs0Var.getViewBinding().G;
            if (videoBottomPanelView2 != null) {
                videoBottomPanelView2.P4(videoFile, true);
            }
        }
        if (!z5 || (fullscreenBottomBar = hgs0Var.getFullscreenBottomBar()) == null) {
            return;
        }
        VideoFile videoFile2 = videoFile;
        fullscreenBottomBar.a(new vxs(z2, hgs0Var.M, hgs0Var.getSimilarVideosPreviews(), videoFile2, this.t, videoFile2.J8()));
    }

    public final void f(yg5 yg5Var) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        hgs0 hgs0Var = this.k;
        a2.b(new xh5(yg5Var, hgs0Var.getVideoConfig(), hgs0Var.getViewBinding().c, null, null));
        yg5Var.z0(hgs0Var.getViewBinding().c, hgs0Var.getVideoConfig(), null);
    }

    public final void g(yg5 yg5Var) {
        d3b0 v0;
        yg5 yg5Var2 = this.r;
        if (yg5Var2 != null) {
            yg5Var2.C(true);
        }
        yg5 yg5Var3 = this.r;
        if (yg5Var3 != null && (v0 = yg5Var3.v0()) != null) {
            v0.C(false);
        }
        this.r = yg5Var;
        rts0.b.b(yg5Var);
    }

    @Override // xsna.ir20
    public final View getPlayerView() {
        return this.m;
    }

    @Override // xsna.owa0
    public final yg5 j() {
        return this.r;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ir20
    public final void j8(ir20.b bVar, yks0 yks0Var, dxh dxhVar) {
        yg5 e = e(bVar, dxhVar);
        hgs0 hgs0Var = this.k;
        hgs0Var.O0();
        MiniPlayerControllersWrapper.VideoInfo videoInfo = bVar.a;
        PlayerRemoteController.Properties properties = videoInfo.g;
        VideoFile videoFile = videoInfo.b;
        this.t = properties.b;
        this.u = properties.c;
        hgs0Var.setVideoFileController(yks0Var);
        hgs0Var.setDoc2DocConfig(fxc0.B().J().f1());
        VideoTextureView videoTextureView = hgs0Var.getViewBinding().c;
        TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        hgs0Var.getViewBinding().d.setContentScaleType(VideoResizer.VideoFitType.FIT);
        VideoMinimizableState videoMinimizableState = bVar.d;
        hgs0Var.setFullscreenContext(com.vk.libvideo.api.minimizable.a.j(videoMinimizableState));
        VideoFile videoFile2 = hgs0Var.getVideoFile();
        hgs0Var.setShortActionsButtonsVisibility((((Boolean) this.l.getValue()).booleanValue() || (videoFile2 != null ? videoFile2.T1() : false) || !com.vk.libvideo.api.minimizable.a.e(videoMinimizableState)) ? false : true);
        hgs0Var.getViewBinding().z.setShortActionsButtonsVisibility(false);
        PlayerControlsView playerControlsView = hgs0Var.getViewBinding().z;
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        playerControlsView.setShortActionsAutoplayEnabled(com.vk.libvideo.autoplay.e.a());
        hgs0Var.getViewBinding().z.setShortActionsEnterPipVisibility(true);
        hgs0Var.setShowPlaylist(this.t);
        hgs0Var.setShowFeedbackButton(h(videoFile, this.u));
        hgs0Var.setAnimationDialogCallbackProvider(this.d);
        hgs0Var.setVideoClickActionCallback(this.e);
        hgs0Var.G0(false, false);
        hgs0Var.He(EmptyList.b, videoFile);
        hgs0Var.setPipButtonVisible(true);
        f(e);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((c4k0) this.n.getValue()).getClass();
            qu5.c().getClass();
            hgs0Var.W0(ConnectionState.DISCONNECTED);
        }
        cty ctyVar = this.g.a;
        boolean d = com.vk.video.ui.discovery.minimizable.player.b.d(((MiniPlayerControllersWrapper) ctyVar.c).v.g.b);
        boolean z = ((MiniPlayerControllersWrapper) ctyVar.c).v.g.b instanceof VideoPlayerStatus.Completed;
        boolean T1 = e.A().T1();
        if (d || z || T1) {
            if (!videoInfo.f || e.isPlaying()) {
                e.f();
            }
        }
    }

    @Override // xsna.ir20
    public final void ji(ir20.b bVar, vfk vfkVar) {
        SkipForwardButton skipForwardButton;
        SkipBackButton skipBackButton;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = bVar.a;
        hgs0 hgs0Var = this.k;
        PlayerControlsView playerControlsView = hgs0Var.getViewBinding().z;
        playerControlsView.getClass();
        PlayButton playButton = playerControlsView.x;
        if (playButton != null) {
            playButton.setVisibility(8);
        }
        if (playerControlsView.getSkipBackListener() != null && (skipBackButton = playerControlsView.z) != null) {
            skipBackButton.setVisibility(8);
        }
        if (playerControlsView.getSkipForwardListener() != null && (skipForwardButton = playerControlsView.A) != null) {
            skipForwardButton.setVisibility(8);
        }
        hgs0Var.G0(false, false);
        yg5 yg5Var = this.r;
        if (yg5Var != null) {
            yg5Var.T(this.p);
            super.jg(yg5Var);
        }
        e(bVar, vfkVar);
        hgs0Var.setEndMenuVisible(false);
        hgs0Var.He(EmptyList.b, videoInfo.b);
        hgs0Var.getViewBinding().r.p1(false);
        hgs0Var.O0();
        yg5 yg5Var2 = this.r;
        if (yg5Var2 != null) {
            f(yg5Var2);
            if (!videoInfo.f || yg5Var2.isPlaying()) {
                yg5Var2.f();
            }
        }
    }

    @Override // xsna.ir20
    public final void nm(boolean z) {
        if (this.q.f) {
            this.k.setModalDialogOpen(z);
        }
    }

    @Override // xsna.ir20
    public final boolean o8() {
        yg5 yg5Var = this.r;
        return yg5Var != null && yg5Var.isPlaying();
    }

    @Override // xsna.ir20
    public final void of(ArrayList arrayList) {
        if (this.r != null) {
            this.k.setSimilarVideosPreviews(arrayList);
        }
    }

    @Override // xsna.ir20
    public final void onConfigurationChanged(Configuration configuration) {
        this.k.V(configuration);
    }

    @Override // xsna.ir20
    public final void onPause() {
        yg5 yg5Var;
        hgs0 hgs0Var = this.k;
        hgs0Var.U = false;
        yg5 yg5Var2 = hgs0Var.I;
        if (yg5Var2 != null) {
            yg5Var2.pause();
        }
        hgs0Var.T();
        if (this.o.isInPictureInPictureMode() || (yg5Var = this.r) == null) {
            return;
        }
        yg5Var.pause();
    }

    @Override // xsna.ir20
    public final void onResume() {
        fbr0 fbr0Var;
        v49 v49Var = this.i;
        if (v49Var != null && (fbr0Var = (fbr0) ((c0a) v49Var.c).c) != null) {
            fbr0Var.d();
        }
        this.k.w0(this.g.d.invoke().booleanValue());
    }

    @Override // xsna.ir20
    public final void t() {
        this.s = null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ir20
    public final void t5(ir20.c cVar) {
        if (cVar instanceof ir20.c.C3075c) {
            yg5 yg5Var = this.r;
            if (yg5Var != null) {
                yg5Var.pause();
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.d) {
            yg5 yg5Var2 = this.r;
            if (yg5Var2 != null) {
                yg5Var2.c();
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.e) {
            ((ir20.c.e) cVar).getClass();
            yg5 yg5Var3 = this.r;
            if (yg5Var3 != null) {
                yg5Var3.C(true);
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.j) {
            long j = ((ir20.c.j) cVar).a;
            yg5 yg5Var4 = this.r;
            if (yg5Var4 != null) {
                yg5Var4.seek(j);
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.f) {
            yg5 yg5Var5 = this.r;
            if (yg5Var5 != null) {
                yg5Var5.f();
                return;
            }
            return;
        }
        boolean z = cVar instanceof ir20.c.g;
        hgs0 hgs0Var = this.k;
        if (z) {
            hgs0Var.y0(true);
            return;
        }
        if (cVar instanceof ir20.c.h) {
            hgs0Var.C0();
            return;
        }
        boolean z2 = cVar instanceof ir20.c.b;
        com.vk.video.ui.discovery.minimizable.j jVar = this.f;
        if (z2) {
            boolean z3 = ((ir20.c.b) cVar).a;
            c(z3);
            jVar.l(z3, DiscoveryAction.EventSource.BUTTON);
            return;
        }
        if (!(cVar instanceof ir20.c.a)) {
            if (!(cVar instanceof ir20.c.i)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        boolean z4 = ((ir20.c.a) cVar).a;
        c(z4);
        jVar.l(z4, DiscoveryAction.EventSource.SETTINGS_MENU);
        if (!hgs0Var.M && !((Boolean) this.l.getValue()).booleanValue()) {
            VideoShortActions videoShortActions = hgs0Var.getViewBinding().z.C;
            if (videoShortActions != null) {
                videoShortActions.P4(z4);
                return;
            }
            return;
        }
        VideoTopBarView topBar = hgs0Var.getTopBar();
        if (topBar == null || !f4m.h(topBar)) {
            VideoToolbarView videoToolbarView = hgs0Var.getViewBinding().H;
            if (videoToolbarView != null) {
                videoToolbarView.c(z4);
                return;
            }
            return;
        }
        VideoTopBarView topBar2 = hgs0Var.getTopBar();
        if (topBar2 != null) {
            topBar2.setIsPlayNextEnabled(z4);
        }
    }

    /* compiled from: LegacyMiniPlayerViewWrapper.kt */
    public final class a implements hnt0 {
        public a() {
        }

        @Override // xsna.hnt0
        public final void j() {
            d1z.this.f.e();
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            d1z.this.f.g();
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            d1z d1zVar = d1z.this;
            d1zVar.k.N0();
            ir20.a aVar = d1zVar.g;
            if (((Boolean) aVar.b.invoke()).booleanValue() && aVar.c.invoke().booleanValue()) {
                d1zVar.f.m();
            }
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
            d1z.this.f.f(z);
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
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
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
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
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }

    @Override // xsna.ir20
    public final void a2(VideoAnnounceState videoAnnounceState) {
    }
}
