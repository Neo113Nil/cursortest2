package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;

/* loaded from: classes12.dex */
public final /* synthetic */ class d1w0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppMainOnboardingView b;

    public /* synthetic */ d1w0(SuperAppMainOnboardingView superAppMainOnboardingView, int i) {
        this.a = i;
        this.b = superAppMainOnboardingView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SuperAppMainOnboardingView superAppMainOnboardingView = this.b;
        switch (i) {
            case 0:
                SuperAppMainOnboardingView.showOnboarding$lambda$1$0(superAppMainOnboardingView, valueAnimator);
                break;
            default:
                superAppMainOnboardingView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
