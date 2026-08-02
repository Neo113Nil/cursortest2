package xsna;

import android.animation.Animator;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;

/* compiled from: Animator.kt */
/* loaded from: classes18.dex */
public final class iav0 implements Animator.AnimatorListener {
    public final /* synthetic */ VkOverlayCircleButton b;
    public final /* synthetic */ VkOverlayCircleButton.b c;
    public final /* synthetic */ rka0 d;

    public iav0(VkOverlayCircleButton vkOverlayCircleButton, VkOverlayCircleButton.b bVar, rka0 rka0Var) {
        this.b = vkOverlayCircleButton;
        this.c = bVar;
        this.d = rka0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.d.getLayoutParams().width = -2;
        VkOverlayCircleButton.b bVar = this.c;
        bVar.a(null);
        bVar.c = null;
        this.d.invoke();
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
