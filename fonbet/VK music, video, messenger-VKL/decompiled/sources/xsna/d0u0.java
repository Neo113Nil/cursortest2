package xsna;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;

/* compiled from: ViewPropertyAnimatorExt.kt */
/* loaded from: classes4.dex */
public final class d0u0 {
    public static final ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, gzs<s3q0> gzsVar) {
        return viewPropertyAnimator.setListener(new a(gzsVar));
    }

    /* compiled from: ViewPropertyAnimatorExt.kt */
    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
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
}
