package xsna;

import android.animation.Animator;
import com.vk.superapp.animation.SuperAppAnimation;

/* compiled from: SuperAppAnimation.kt */
/* loaded from: classes6.dex */
public final class j7n0 implements Animator.AnimatorListener {
    public boolean b;
    public final /* synthetic */ k7n0 c;
    public final /* synthetic */ SuperAppAnimation d;

    public j7n0(k7n0 k7n0Var, SuperAppAnimation superAppAnimation) {
        this.c = k7n0Var;
        this.d = superAppAnimation;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        k7n0 k7n0Var = this.c;
        k7n0Var.f.c.removeListener(this);
        SuperAppAnimation superAppAnimation = this.d;
        if (epx.f(superAppAnimation.e, k7n0Var)) {
            superAppAnimation.e();
        }
        SuperAppAnimation.i = false;
        SuperAppAnimation.j = false;
        gzs<s3q0> gzsVar = superAppAnimation.d;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
