package xsna;

import android.animation.Animator;
import android.widget.FrameLayout;

/* compiled from: PosterPostingView.kt */
/* loaded from: classes4.dex */
public final class vac0 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uac0 c;
    public final /* synthetic */ gzs<s3q0> d;

    public vac0(boolean z, uac0 uac0Var, gzs<s3q0> gzsVar) {
        this.b = z;
        this.c = uac0Var;
        this.d = gzsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrameLayout frameLayout;
        if (!this.b && (frameLayout = this.c.d) != null) {
            bwt0.p0(frameLayout, false);
        }
        gzs<s3q0> gzsVar = this.d;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrameLayout frameLayout;
        if (!this.b || (frameLayout = this.c.d) == null) {
            return;
        }
        bwt0.p0(frameLayout, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
