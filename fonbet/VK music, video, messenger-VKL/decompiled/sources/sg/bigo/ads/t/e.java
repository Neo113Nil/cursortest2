package sg.bigo.ads.t;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes9.dex */
public final class e extends d {
    private VideoController.VideoLifeCallback g;
    private boolean h;
    private boolean i;

    public e(@NonNull Activity activity, sg.bigo.ads.s.a aVar, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.y.b bVar, int i, View view, boolean z) {
        super(activity, aVar, roundedFrameLayout, bVar, i, view, z);
        this.i = true;
        ((sg.bigo.ads.cp.a) bVar.f()).bA();
    }

    @Override // sg.bigo.ads.t.d, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        this.g = null;
    }

    @Override // sg.bigo.ads.t.d
    public final void b() {
        super.b();
        if (((d) this).b instanceof sg.bigo.ads.y.c) {
            if (this.g == null) {
                this.g = new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.t.e.1
                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoEnd() {
                        if (e.this.h) {
                            return;
                        }
                        e.b(e.this);
                        e.this.a();
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoPause() {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoPlay() {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoStart() {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onMuteChange(boolean z) {
                    }
                };
            }
            VideoController videoController = ((d) this).b.getVideoController();
            if (videoController != null) {
                videoController.setNeedPauseWhenVisiblePercentEqual(false);
                videoController.setVideoLifeCallback(this.g);
            }
        }
    }

    @Override // sg.bigo.ads.t.d, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        VideoController videoController = ((d) this).b.getVideoController();
        if (videoController != null && videoController.isPaused() && this.i) {
            videoController.play();
            this.i = false;
        }
    }

    @Override // sg.bigo.ads.t.d, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        VideoController videoController = ((d) this).b.getVideoController();
        boolean z = videoController != null && videoController.isPlaying();
        this.i = z;
        if (z) {
            videoController.pause();
        }
    }

    public static /* synthetic */ boolean b(e eVar) {
        eVar.h = true;
        return true;
    }

    @Override // sg.bigo.ads.t.d, sg.bigo.ads.ad.interstitial.i
    public final void h(int i) {
        super.h(i);
    }
}
