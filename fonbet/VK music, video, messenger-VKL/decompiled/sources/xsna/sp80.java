package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;

/* compiled from: OpenAnimationStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class sp80 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ ViewGroup d;

    public sp80(ViewGroup viewGroup, ImageView imageView, ViewGroup viewGroup2) {
        this.b = viewGroup;
        this.c = imageView;
        this.d = viewGroup2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ebm0 ebm0Var;
        this.b.removeView(this.c);
        ViewGroup viewGroup = this.d;
        viewGroup.setVisibility(0);
        if (!(viewGroup instanceof StoryBottomViewGroup) || (ebm0Var = ((StoryBottomViewGroup) viewGroup).B.m) == null) {
            return;
        }
        StoryReactionViewGroup storyReactionViewGroup = ebm0Var.h;
        if (ebm0Var.j) {
            storyReactionViewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            storyReactionViewGroup.setVisibility(0);
            storyReactionViewGroup.animate().alpha(1.0f).setDuration(150L).start();
        }
    }
}
