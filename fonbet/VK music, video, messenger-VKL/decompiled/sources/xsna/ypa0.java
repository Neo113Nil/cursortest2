package xsna;

import android.animation.Animator;
import com.vk.photo.editor.markup.view.tools.PipetteView;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class ypa0 implements Animator.AnimatorListener {
    public final /* synthetic */ PipetteView b;

    public ypa0(PipetteView pipetteView) {
        this.b = pipetteView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PipetteView pipetteView = this.b;
        float f = -1;
        pipetteView.q *= f;
        pipetteView.p *= f;
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
