package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.viewer.StoryViewHeader;

/* compiled from: OpenAnimationStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class tp80 {
    public final q7r a;
    public final jz8 b;

    public tp80(q7r q7rVar, jz8 jz8Var) {
        this.a = q7rVar;
        this.b = jz8Var;
    }

    public final AnimatorSet a(float f) {
        StoryAvatarView avatarView;
        StoryViewHeader storyViewHeader = this.a.P;
        if (storyViewHeader == null || (avatarView = storyViewHeader.getAvatarView()) == null) {
            return null;
        }
        avatarView.setScaleX(f);
        avatarView.setScaleY(f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(avatarView, (Property<StoryAvatarView, Float>) View.SCALE_X, f, 1.0f), ObjectAnimator.ofFloat(avatarView, (Property<StoryAvatarView, Float>) View.SCALE_Y, f, 1.0f));
        return animatorSet;
    }
}
