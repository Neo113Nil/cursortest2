package xsna;

import android.animation.Animator;
import com.vk.core.view.text.SquareExcerptTextView;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class s8q implements Animator.AnimatorListener {
    public final /* synthetic */ r8q b;

    public s8q(r8q r8qVar) {
        this.b = r8qVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        r8q r8qVar = this.b;
        SquareExcerptTextView squareExcerptTextView = r8qVar.c;
        r8qVar.g(false);
        gzs<s3q0> r3 = r8qVar.d.r3();
        if (r3 != null) {
            r3.invoke();
        }
        squareExcerptTextView.setIsTextSelectionFullVisibleTextEnabled(false);
        squareExcerptTextView.setTextIsSelectable(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
