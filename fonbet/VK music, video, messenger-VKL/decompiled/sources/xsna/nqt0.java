package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import one.video.controls.models.UIPlayerSeek;
import xsna.xwp0;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final class nqt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ VideoView b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public nqt0(VideoView videoView, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = videoView;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qcy<Object>[] qcyVarArr = VideoView.T0;
        final VideoView videoView = this.b;
        videoView.k0();
        videoView.a0();
        VideoToolbarView videoToolbarView = videoView.getViewBinding().H;
        if (videoToolbarView != null) {
            f4m.j(videoToolbarView);
        }
        if (this.c) {
            videoView.getViewBinding().w.setVisibility(4);
            if (videoView.getViewBinding().z.getSkipBackListener() != null) {
                videoView.getViewBinding().x.setVisibility(4);
            }
            if (videoView.getViewBinding().z.getSkipForwardListener() != null) {
                videoView.getViewBinding().y.setVisibility(4);
            }
        }
        VideoBottomPanelView videoBottomPanelView = videoView.getViewBinding().G;
        if (videoBottomPanelView != null) {
            final boolean z = this.e;
            final boolean z2 = this.f;
            videoBottomPanelView.post(new Runnable() { // from class: xsna.mqt0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView videoView2 = VideoView.this;
                    VideoBottomPanelView videoBottomPanelView2 = videoView2.getViewBinding().G;
                    if (videoBottomPanelView2 != null) {
                        videoBottomPanelView2.setVisibility(4);
                    }
                    videoView2.d1(z, z2);
                }
            });
        }
        VideoFullscreenBottomBarView fullscreenBottomBar = videoView.getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            fullscreenBottomBar.post(new cs2(videoView, 20));
        }
        VideoTopBarView topBar = videoView.getTopBar();
        if (topBar != null) {
            topBar.post(new yh9(videoView, 14));
        }
        videoView.m0 = null;
        if (videoView.n0() || !this.d) {
            return;
        }
        videoView.getViewBinding().r.U1(new UIPlayerSeek.c(false, false));
        videoView.getViewBinding().u.P4(new xwp0.a(false, false));
    }
}
