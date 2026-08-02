package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: MatrixPositionAnimator.kt */
/* loaded from: classes3.dex */
public final class on10 extends AnimatorListenerAdapter {
    public VideoResizer.VideoFitType b;
    public final /* synthetic */ tn10 c;
    public final /* synthetic */ rn10 d;

    public on10(tn10 tn10Var, rn10 rn10Var) {
        this.c = tn10Var;
        this.d = rn10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW)) {
            VideoResizer.VideoFitType videoFitType = this.b;
            if (videoFitType != null) {
                this.c.setContentScaleType(videoFitType);
            }
            this.b = null;
        }
        this.d.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW)) {
            return;
        }
        tn10 tn10Var = this.c;
        this.b = tn10Var.getContentScaleType();
        tn10Var.setContentScaleType(VideoResizer.VideoFitType.FIT);
        tn10Var.b().setClipToOutline(true);
    }
}
