package xsna;

import android.animation.Animator;
import com.vk.newsfeed.common.views.header.NewsfeedHeaderDescriptionLayout;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class qk60 implements Animator.AnimatorListener {
    public final /* synthetic */ NewsfeedHeaderDescriptionLayout b;

    public qk60(NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout) {
        this.b = newsfeedHeaderDescriptionLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout = this.b;
        if (!newsfeedHeaderDescriptionLayout.isAttachedToWindow() || newsfeedHeaderDescriptionLayout.getMeasuredHeight() == 0 || (i = newsfeedHeaderDescriptionLayout.d) <= 1) {
            return;
        }
        newsfeedHeaderDescriptionLayout.b = (newsfeedHeaderDescriptionLayout.b + 1) % i;
        animator.start();
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
