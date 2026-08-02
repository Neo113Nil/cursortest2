package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewState$PhoneMode;

/* loaded from: classes11.dex */
public final class feb0 {
    public final View a;
    public final View b;
    public final View c;
    public AnimatorSet d;
    public PhoneConfirmationViewState$PhoneMode e;
    public Integer f;

    public feb0(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    public static ObjectAnimator a(long j, final View view, final boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, CaretView.ALPHA_PROPERTY, z ? 1.0f : 0.0f);
        ofFloat.setDuration(j);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$PhoneModeAnimator$createVisibilityChangingAnimator$lambda$8$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z) {
                    view.setVisibility(0);
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$PhoneModeAnimator$createVisibilityChangingAnimator$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setVisibility(!z ? 4 : 0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    public final void b() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        this.d = null;
        this.e = null;
    }
}
