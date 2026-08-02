package xsna;

import android.animation.Animator;
import com.vk.core.view.components.spinner.VkScreenSpinner;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class shv0 implements Animator.AnimatorListener {
    public final /* synthetic */ VkScreenSpinner b;

    public shv0(VkScreenSpinner vkScreenSpinner) {
        this.b = vkScreenSpinner;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = VkScreenSpinner.i;
        VkScreenSpinner vkScreenSpinner = this.b;
        vkScreenSpinner.getLayoutParams().width = -2;
        vkScreenSpinner.getLayoutParams().height = -2;
        vkScreenSpinner.e.getLayoutParams().width = -2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
