package xsna;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.rlottie.RLottieDrawable;

/* compiled from: SendReactionButtonDelegate.kt */
/* loaded from: classes4.dex */
public final class eii0 implements RLottieDrawable.a {
    public final /* synthetic */ fii0 a;

    public eii0(fii0 fii0Var) {
        this.a = fii0Var;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
        fii0 fii0Var = this.a;
        bwt0.p0(fii0Var.a, true);
        bwt0.p0(fii0Var.b, true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setStartDelay(400L);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.o(fii0Var, 3));
        xo2.h(ofFloat, new da50(fii0Var, 18));
        ofFloat.start();
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        fii0 fii0Var = this.a;
        fii0Var.g = null;
        fii0Var.e = null;
        fii0Var.f = null;
    }
}
