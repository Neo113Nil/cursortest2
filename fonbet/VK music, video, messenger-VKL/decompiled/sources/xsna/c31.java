package xsna;

import android.animation.Animator;
import com.vk.libvideo.ui.ad.AdvertBannerView;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class c31 implements Animator.AnimatorListener {
    public final /* synthetic */ AdvertBannerView b;

    public c31(AdvertBannerView advertBannerView) {
        this.b = advertBannerView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        bwt0.p0(this.b, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
