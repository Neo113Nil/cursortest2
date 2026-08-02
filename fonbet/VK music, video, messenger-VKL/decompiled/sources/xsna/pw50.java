package xsna;

import android.animation.ValueAnimator;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes13.dex */
public final class pw50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float b;
    public final /* synthetic */ ow50 c;

    public pw50(ow50 ow50Var, float f) {
        this.c = ow50Var;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b);
    }
}
