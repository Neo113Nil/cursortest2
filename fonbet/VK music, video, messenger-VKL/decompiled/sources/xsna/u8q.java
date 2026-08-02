package xsna;

import android.animation.Animator;
import com.vk.core.view.text.SquareExcerptTextView;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class u8q implements Animator.AnimatorListener {
    public final /* synthetic */ r8q b;

    public u8q(r8q r8qVar) {
        this.b = r8qVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r8q r8qVar = this.b;
        r8qVar.g(true);
        r8qVar.d.P2();
        SquareExcerptTextView squareExcerptTextView = r8qVar.c;
        squareExcerptTextView.setIsTextSelectionFullVisibleTextEnabled(true);
        squareExcerptTextView.n();
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
