package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.viewer.reactions.StoryMainReactionButton;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;

/* compiled from: StoryReactionViewGroup.kt */
/* loaded from: classes6.dex */
public final class dbm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ StoryReactionViewGroup b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ y0f0 d;
    public final /* synthetic */ l2f0 e;

    public dbm0(StoryReactionViewGroup storyReactionViewGroup, RLottieDrawable rLottieDrawable, y0f0 y0f0Var, l2f0 l2f0Var) {
        this.b = storyReactionViewGroup;
        this.c = rLottieDrawable;
        this.d = y0f0Var;
        this.e = l2f0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        StoryReactionViewGroup storyReactionViewGroup = this.b;
        VkImage vkImage = storyReactionViewGroup.f;
        if (vkImage == null) {
            vkImage = null;
        }
        vkImage.setLayerType(0, null);
        VkImage vkImage2 = storyReactionViewGroup.f;
        if (vkImage2 == null) {
            vkImage2 = null;
        }
        vkImage2.setVisibility(8);
        VkImage vkImage3 = storyReactionViewGroup.f;
        if (vkImage3 == null) {
            vkImage3 = null;
        }
        vkImage3.setImageDrawable(null);
        storyReactionViewGroup.h = false;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.k();
        }
        StoryMainReactionButton storyMainReactionButton = storyReactionViewGroup.c;
        (storyMainReactionButton != null ? storyMainReactionButton : null).b(this.d, true);
        if (rLottieDrawable != null) {
            this.e.a();
        }
    }
}
