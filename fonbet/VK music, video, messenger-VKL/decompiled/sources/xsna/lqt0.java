package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.collections.EmptyList;
import xsna.ye0;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final class lqt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ VideoView b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yg5 e;

    public lqt0(VideoView videoView, boolean z, boolean z2, yg5 yg5Var) {
        this.b = videoView;
        this.c = z;
        this.d = z2;
        this.e = yg5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o640 multiTrackOnboarding;
        VideoView videoView = this.b;
        videoView.m0 = null;
        alt0 alt0Var = videoView.h0;
        multiTrackOnboarding = videoView.getMultiTrackOnboarding();
        alt0Var.a(!((Boolean) multiTrackOnboarding.a.invoke()).booleanValue() ? e43.l(TooltipType.MULTITRACK_ONBOARDING, TooltipType.KZ_SUB) : e43.l(TooltipType.MULTI_AUDIO, TooltipType.KZ_SUB), videoView.getAutoPlay());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationStart(Animator animator) {
        boolean z;
        VideoToolbarView videoToolbarView;
        final boolean z2;
        VideoBottomPanelView videoBottomPanelView;
        VideoFullscreenBottomBarView fullscreenBottomBar;
        VideoTopBarView topBar;
        final boolean z3;
        VideoFullscreenBottomBarView fullscreenBottomBar2;
        VideoTopBarView topBar2;
        VideoBottomPanelView videoBottomPanelView2;
        yg5 yg5Var;
        com.vk.libvideo.api.ad.a j;
        VideoFile videoFile;
        VideoFile videoFile2;
        lt00 marketAnalytics;
        final VideoView videoView = this.b;
        boolean z4 = true;
        if (videoView.M) {
            etn doc2DocConfig = videoView.getDoc2DocConfig();
            boolean landscape = videoView.getLandscape();
            VideoFile videoFile3 = videoView.getVideoFile();
            if (doc2DocConfig.j(landscape, videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null)) {
                z = true;
                videoToolbarView = videoView.getViewBinding().H;
                z2 = this.c;
                if (videoToolbarView != null) {
                    videoToolbarView.setVisibility((z2 || z) ? 8 : 0);
                }
                videoView.k0();
                videoView.a0();
                videoBottomPanelView = videoView.getViewBinding().G;
                if (videoBottomPanelView != null) {
                    qcy<Object>[] qcyVarArr = VideoView.T0;
                    videoBottomPanelView.setVisibility((videoView.M0() || videoView.n0() || z2 || videoView.c0) ? 4 : 0);
                }
                fullscreenBottomBar = videoView.getFullscreenBottomBar();
                if (fullscreenBottomBar != null) {
                    fullscreenBottomBar.setVisibility(videoView.J0() ? 4 : 0);
                }
                topBar = videoView.getTopBar();
                if (topBar != null) {
                    topBar.setVisibility(videoView.L0() ? 4 : 0);
                }
                z3 = this.d;
                if (videoView.d1(z3, z2) && (videoFile2 = videoView.getVideoFile()) != null) {
                    marketAnalytics = videoView.getMarketAnalytics();
                    marketAnalytics.g(new zz00(videoFile2.o0(), videoFile2.I0().b, EmptyList.b, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS));
                }
                fullscreenBottomBar2 = videoView.getFullscreenBottomBar();
                if (fullscreenBottomBar2 != null) {
                    fullscreenBottomBar2.post(new a72(videoView, 27));
                }
                topBar2 = videoView.getTopBar();
                if (topBar2 != null) {
                    topBar2.post(new hv2(videoView, 18));
                }
                videoBottomPanelView2 = videoView.getViewBinding().G;
                if (videoBottomPanelView2 != null) {
                    videoBottomPanelView2.post(new Runnable() { // from class: xsna.kqt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoView videoView2 = VideoView.this;
                            VideoBottomPanelView videoBottomPanelView3 = videoView2.getViewBinding().G;
                            boolean z5 = z2;
                            if (videoBottomPanelView3 != null) {
                                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                                videoBottomPanelView3.setVisibility((videoView2.M0() || videoView2.n0() || z5 || videoView2.c0) ? 4 : 0);
                            }
                            videoView2.d1(z3, z5);
                        }
                    });
                }
                yg5Var = this.e;
                if (!yg5Var.B() && !yg5Var.J() && !yg5Var.a()) {
                    je0 N0 = yg5Var.N0();
                    j = N0 != null ? ((ye0.a) N0).j() : null;
                    if (((j instanceof a.AbstractC1195a) || !((a.AbstractC1195a) j).c()) && videoView.getViewBinding().f.getVisibility() != 0 && (((videoFile = videoView.getVideoFile()) == null || !videoFile.Z9()) && !videoView.u0 && !videoView.m0())) {
                        z4 = false;
                    }
                }
                videoView.getViewBinding().w.setVisibility(z4 ? 0 : 8);
                if (videoView.getViewBinding().z.getSkipBackListener() != null) {
                    videoView.getViewBinding().x.setVisibility((videoView.getViewBinding().w.getVisibility() != 0 || z2) ? 8 : 0);
                }
                if (videoView.getViewBinding().z.getSkipForwardListener() == null) {
                    videoView.getViewBinding().y.setVisibility((videoView.getViewBinding().w.getVisibility() != 0 || z2) ? 8 : 0);
                    return;
                }
                return;
            }
        }
        z = false;
        videoToolbarView = videoView.getViewBinding().H;
        z2 = this.c;
        if (videoToolbarView != null) {
        }
        videoView.k0();
        videoView.a0();
        videoBottomPanelView = videoView.getViewBinding().G;
        if (videoBottomPanelView != null) {
        }
        fullscreenBottomBar = videoView.getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
        }
        topBar = videoView.getTopBar();
        if (topBar != null) {
        }
        z3 = this.d;
        if (videoView.d1(z3, z2)) {
            marketAnalytics = videoView.getMarketAnalytics();
            marketAnalytics.g(new zz00(videoFile2.o0(), videoFile2.I0().b, EmptyList.b, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS));
        }
        fullscreenBottomBar2 = videoView.getFullscreenBottomBar();
        if (fullscreenBottomBar2 != null) {
        }
        topBar2 = videoView.getTopBar();
        if (topBar2 != null) {
        }
        videoBottomPanelView2 = videoView.getViewBinding().G;
        if (videoBottomPanelView2 != null) {
        }
        yg5Var = this.e;
        if (!yg5Var.B()) {
            je0 N02 = yg5Var.N0();
            if (N02 != null) {
            }
            if (j instanceof a.AbstractC1195a) {
            }
            z4 = false;
        }
        videoView.getViewBinding().w.setVisibility(z4 ? 0 : 8);
        if (videoView.getViewBinding().z.getSkipBackListener() != null) {
        }
        if (videoView.getViewBinding().z.getSkipForwardListener() == null) {
        }
    }
}
