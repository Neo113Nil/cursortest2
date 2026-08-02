package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import java.util.Collections;
import java.util.List;
import xsna.q4a0;

/* compiled from: VideoGifViewerPage.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class sns0 extends ggs {
    public final PhotoViewer.n d;
    public final q4a0.f e;
    public final ClippingImageView f;
    public final as4 g;
    public final VideoTextureView h;
    public final bpn0 i;
    public final tns0 j;
    public io.reactivex.rxjava3.disposables.c k;

    /* compiled from: VideoGifViewerPage.kt */
    public interface a {
        void a(int i);
    }

    public sns0(Context context, int i, PhotoViewer.n nVar, q4a0.f fVar, ClippingImageView clippingImageView, as4 as4Var) {
        super(context, i, nVar);
        this.d = nVar;
        this.e = fVar;
        this.f = clippingImageView;
        this.g = as4Var;
        int i2 = 0;
        VideoTextureView videoTextureView = new VideoTextureView(context, null, 6, i2);
        videoTextureView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.h = videoTextureView;
        this.i = new bpn0(new cff(context, 2));
        this.j = new tns0(this, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        setOnClickListener(new r4(this, 12));
        s3q0 s3q0Var = s3q0.a;
        addView(videoTextureView, layoutParams);
        awt0.s(this, new rns0(this, i2));
    }

    public static s3q0 e(sns0 sns0Var) {
        sns0Var.removeView(sns0Var.getRestrictionView());
        yg5 autoPlay = sns0Var.getAutoPlay();
        if (autoPlay != null) {
            autoPlay.f0(sns0Var.j);
        }
        sns0Var.f();
        return s3q0.a;
    }

    private final yg5 getAutoPlay() {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d()) {
            return null;
        }
        return this.d.j();
    }

    private final com.vk.libvideo.autoplay.a getAutoPlayConfig() {
        return new com.vk.libvideo.autoplay.a(true, RepeatMode.BY_VIDEO_PARAMS, null, true, false, false, null, null, null, null, PlayerType.FULLSCREEN, null, false, null, 490428);
    }

    private final VideoOverlayView getRestrictionView() {
        return (VideoOverlayView) this.i.getValue();
    }

    @Override // xsna.ggs
    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k = null;
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.pause();
        }
        g(false, true);
    }

    @Override // xsna.ggs
    public final void d() {
        if (getAutoPlay() != null) {
            f();
            return;
        }
        if (getRestrictionView().isAttachedToWindow()) {
            return;
        }
        getRestrictionView().setVisibility(8);
        addView(getRestrictionView(), new FrameLayout.LayoutParams(-1, -1));
        twt0.b(7, 0L, getRestrictionView());
        io.reactivex.rxjava3.core.q<VideoMinifiedPlayerStateHolder.State> c = VideoMinifiedPlayerStateHolder.a.c();
        cyh0 cyh0Var = new cyh0(new b1o0(4), 4);
        c.getClass();
        this.k = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(c, cyh0Var), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new k2s0(new n1g0(10), 2)).a0(asu0.a.d()), new tzq0(this, 2));
    }

    public final void f() {
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.z0(this.h, getAutoPlayConfig(), null);
            autoPlay.play();
            autoPlay.l0();
            if (autoPlay.p()) {
                g(true, false);
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h.setAlpha(z ? 1.0f : 0.0f);
        if (z2) {
            f = 1.0f;
        }
        this.f.setAlpha(f);
    }

    public final a getCallback() {
        return this.e;
    }

    public final PhotoViewer.n getGif() {
        return this.d;
    }

    public final ClippingImageView getPreviewView() {
        return this.f;
    }

    @Override // xsna.ggs
    public List<View> getViewsForTranslate() {
        return Collections.singletonList(this);
    }

    public final void h() {
        if (getRestrictionView().isAttachedToWindow()) {
            twt0.c(getRestrictionView(), 0L, new myd0(this, 21), 3);
        }
    }

    public final void i() {
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k = null;
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.pause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.f0(this.j);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        awt0.s(this, new rns0(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.T(this.j);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        yg5 autoPlay = getAutoPlay();
        if (autoPlay == null) {
            return;
        }
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d() || !((Boolean) this.g.invoke()).booleanValue()) {
            return;
        }
        if (!z) {
            yg5 autoPlay2 = getAutoPlay();
            if (autoPlay2 != null) {
                autoPlay2.pause();
                return;
            }
            return;
        }
        h();
        if (autoPlay.j0(this.h)) {
            autoPlay.play();
        } else {
            autoPlay.f0(this.j);
            f();
        }
    }
}
