package xsna;

import android.animation.Animator;
import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;

/* compiled from: Animator.kt */
/* loaded from: classes5.dex */
public final class mfe0 implements Animator.AnimatorListener {
    public final /* synthetic */ PullFromTopLinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public mfe0(PullFromTopLinearLayout pullFromTopLinearLayout, int i, boolean z) {
        this.b = pullFromTopLinearLayout;
        this.c = i;
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PullFromTopLinearLayout pullFromTopLinearLayout = this.b;
        pullFromTopLinearLayout.getLayoutParams().height = this.c;
        pullFromTopLinearLayout.setVisibility(this.d ? 0 : 8);
        pullFromTopLinearLayout.setAlpha(1.0f);
        pullFromTopLinearLayout.requestLayout();
        pullFromTopLinearLayout.b = null;
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
