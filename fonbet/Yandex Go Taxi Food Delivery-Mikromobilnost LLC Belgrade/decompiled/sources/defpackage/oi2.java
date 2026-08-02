package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes6.dex */
public final class oi2 {
    public final LottieAnimationView a;
    public final adv b;
    public boolean c;

    public oi2(LottieAnimationView lottieAnimationView, b7z0 b7z0Var, final you0 you0Var) {
        this.a = lottieAnimationView;
        this.b = new adv(lottieAnimationView, new ni2(b7z0Var), you0Var);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.stories.presentation.story.AnimationPlaybackController$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                you0Var.run();
            }
        });
    }
}
