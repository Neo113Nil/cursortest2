package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.stories.design.view.viewer.AnimatedReactionsView;
import java.util.Objects;

/* compiled from: AnimatedReactionsView.kt */
/* loaded from: classes6.dex */
public final class fl2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public fl2(com.google.android.gms.cast.framework.internal.featurehighlight.c cVar, Runnable runnable) {
        this.c = runnable;
        Objects.requireNonNull(cVar);
        this.d = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationEnd(animator);
                VkAvatar vkAvatar = (VkAvatar) this.c;
                vkAvatar.clearAnimation();
                ((AnimatedReactionsView) this.d).removeView(vkAvatar);
                break;
            default:
                com.google.android.gms.cast.framework.internal.featurehighlight.c cVar = (com.google.android.gms.cast.framework.internal.featurehighlight.c) this.d;
                cVar.setVisibility(8);
                cVar.h = null;
                ((Runnable) this.c).run();
                break;
        }
    }

    public fl2(VkAvatar vkAvatar, AnimatedReactionsView animatedReactionsView) {
        this.c = vkAvatar;
        this.d = animatedReactionsView;
    }
}
