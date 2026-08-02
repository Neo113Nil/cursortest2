package xsna;

import android.animation.Animator;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;

/* compiled from: Animator.kt */
/* loaded from: classes18.dex */
public final class ruu0 implements Animator.AnimatorListener {
    public final /* synthetic */ VkFeedNewsfeedHeaderDescriptionLayout b;

    public ruu0(VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout) {
        this.b = vkFeedNewsfeedHeaderDescriptionLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = this.b;
        if (!vkFeedNewsfeedHeaderDescriptionLayout.isAttachedToWindow() || vkFeedNewsfeedHeaderDescriptionLayout.getMeasuredHeight() == 0 || vkFeedNewsfeedHeaderDescriptionLayout.d <= 1 || qq2.d(vkFeedNewsfeedHeaderDescriptionLayout.getContext())) {
            return;
        }
        vkFeedNewsfeedHeaderDescriptionLayout.b = (vkFeedNewsfeedHeaderDescriptionLayout.b + 1) % vkFeedNewsfeedHeaderDescriptionLayout.d;
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
