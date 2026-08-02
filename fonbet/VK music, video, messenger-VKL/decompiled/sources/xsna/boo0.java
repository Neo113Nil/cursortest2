package xsna;

import android.animation.ValueAnimator;

/* compiled from: TextWithChipsHolder.kt */
/* loaded from: classes4.dex */
public final class boo0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yno0 b;

    public boo0(yno0 yno0Var) {
        this.b = yno0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        yno0 yno0Var = this.b;
        yno0Var.G.getLayoutParams().height = intValue;
        yno0Var.G.requestLayout();
    }
}
