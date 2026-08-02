package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.toggle.features.VideoFeatures;
import one.video.controls.views.PlayerControlsView;
import xsna.b5b0;
import xsna.q1b0;

/* compiled from: VideoDiscoveryPlayerView.kt */
@ozl
/* loaded from: classes7.dex */
public final class hgs0 extends VideoView {
    public a U0;
    public final a5b0 V0;

    /* compiled from: VideoDiscoveryPlayerView.kt */
    public static final class a {
        public final gzs<Boolean> a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            gzs<Boolean> gzsVar = this.a;
            if (gzsVar == null) {
                return 0;
            }
            return gzsVar.hashCode();
        }

        public final String toString() {
            return uf3.d(new StringBuilder("Settings(isInFullscreenMode="), this.a, ')');
        }

        public a(m3g m3gVar) {
            this.a = m3gVar;
        }
    }

    public hgs0(Context context) {
        super(context, null, 0);
        FrameLayout frameLayout;
        this.U0 = new a(null);
        rrn0 rrn0Var = new rrn0(this, 15);
        f7m f7mVar = new f7m(1, this, hgs0.class, "setUIVisibility", "setUIVisibility(ZZ)V", 0);
        kcj0 kcj0Var = new kcj0(this, 17);
        q1b0.b bVar = new q1b0.b(this, rrn0Var, f7mVar, kcj0Var, new l6n0(this, 12));
        b5b0.b bVar2 = new b5b0.b(new w2j0(this, 16), new gkc0(this, 20), new a34(0, getViewBinding().c, VideoTextureView.class, "isInZoomMode", "isInZoomMode()Z", 0, 6));
        if (fxc0.B().J().S0()) {
            frameLayout = getViewBinding().M;
            if (frameLayout == null) {
                frameLayout = getViewBinding().c;
            }
        } else {
            frameLayout = getViewBinding().c;
        }
        FrameLayout frameLayout2 = frameLayout;
        Context context2 = getContext();
        b5b0 b5b0Var = new b5b0(kcj0Var);
        a5b0 a5b0Var = new a5b0(context2, frameLayout2, b5b0Var, new vex(bVar, 19), new d410(bVar, 17), new da50(bVar, 10));
        b5b0Var.b = bVar2;
        this.V0 = a5b0Var;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            setClipChildren(false);
            setClipToPadding(false);
        }
    }

    @Override // com.vk.libvideo.design.view.video.VideoView
    public final void a1(VideoFile videoFile) {
        gzs<Boolean> gzsVar = this.U0.a;
        if (gzsVar == null) {
            super.a1(videoFile);
            return;
        }
        PlayerControlsView playerControlsView = getViewBinding().z;
        playerControlsView.getPlayerButtons().setFullScreenMode(gzsVar.invoke().booleanValue());
    }

    public final a getPlayerViewSettings() {
        return this.U0;
    }

    @Override // com.vk.libvideo.design.view.video.VideoView, xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        super.m4(videoAutoPlay);
        if (getVideoFile() != null) {
            VideoEndView videoEndView = getViewBinding().a;
            boolean z = getViewBinding().z.getSkipBackListener() != null;
            videoEndView.x = z;
            videoEndView.g.setVisibility(!z ? 4 : 0);
            VideoEndView videoEndView2 = getViewBinding().a;
            boolean z2 = getViewBinding().z.getSkipForwardListener() != null;
            videoEndView2.w = z2;
            videoEndView2.h.setVisibility(z2 ? 0 : 4);
            bwt0.p0(getViewBinding().a.d, false);
            bwt0.p0(getViewBinding().a.e, false);
        }
    }

    @Override // com.vk.libvideo.design.view.video.VideoView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a5b0 a5b0Var = this.V0;
        if (a5b0Var != null) {
            a5b0Var.b(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setPlayerViewSettings(a aVar) {
        this.U0 = aVar;
    }
}
