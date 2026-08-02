package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.dialogs.AnimationDialog;

/* compiled from: AnimationDialog.kt */
/* loaded from: classes14.dex */
public final class ho2 extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimationDialog b;

    public ho2(AnimationDialog animationDialog) {
        this.b = animationDialog;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimationDialog animationDialog = this.b;
        animationDialog.U = null;
        animationDialog.oo();
        i0q0.d(100L, new ov(animationDialog, 1));
    }
}
