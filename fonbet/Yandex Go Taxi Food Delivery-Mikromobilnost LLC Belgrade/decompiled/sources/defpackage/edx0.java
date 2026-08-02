package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonView;
import defpackage.edx0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public final class edx0 {
    public final AtomicInteger a;
    public final AtomicBoolean b;
    public final AnimatorSet c;

    public edx0(final TariffCardScrollButtonView tariffCardScrollButtonView, final ddx0 ddx0Var) {
        float w = tje.w(20, tariffCardScrollButtonView.getContext());
        Property property = View.TRANSLATION_Y;
        float f = -w;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tariffCardScrollButtonView, (Property<TariffCardScrollButtonView, Float>) property, 0.0f, f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tariffCardScrollButtonView, (Property<TariffCardScrollButtonView, Float>) property, f, 0.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.a = new AtomicInteger(0);
        this.b = new AtomicBoolean(false);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonJumpAnimator$idleAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (edx0.this.b.get()) {
                    int incrementAndGet = edx0.this.a.incrementAndGet();
                    int i = ddx0Var.a;
                    if (incrementAndGet < i || i == -1) {
                        animatorSet.setStartDelay(r0.b);
                        animatorSet.start();
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonJumpAnimator$idleAnimator$lambda$0$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                tariffCardScrollButtonView.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.c = animatorSet;
    }
}
