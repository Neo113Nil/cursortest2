package xsna;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: MusicRecommendationScreenDelegate.kt */
/* loaded from: classes3.dex */
public final class n350 implements Animator.AnimatorListener {
    public final /* synthetic */ LottieAnimationView b;
    public final /* synthetic */ i700 c;
    public final /* synthetic */ LottieAnimationView d;

    public n350(LottieAnimationView lottieAnimationView, i700 i700Var, LottieAnimationView lottieAnimationView2) {
        this.b = lottieAnimationView;
        this.c = i700Var;
        this.d = lottieAnimationView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f.c.removeListener(this);
        LottieAnimationView lottieAnimationView = this.d;
        lottieAnimationView.setComposition(this.c);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.m0();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
