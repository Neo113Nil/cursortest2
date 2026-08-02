package xsna;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.widget.Button;

/* compiled from: YandexNativeAdHolder.kt */
/* loaded from: classes4.dex */
public final class c5y0 implements Animator.AnimatorListener {
    public final /* synthetic */ b5y0 b;
    public final /* synthetic */ int c;

    public c5y0(b5y0 b5y0Var, int i) {
        this.b = b5y0Var;
        this.c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b5y0 b5y0Var = this.b;
        Button b7 = b5y0Var.b7();
        int i = this.c;
        b7.setTextColor(i);
        his0.u(b5y0Var.b7(), b5y0Var.H, ColorStateList.valueOf(i));
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
