package xsna;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ef0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ef0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                jf0 jf0Var = (jf0) this.c;
                jf0Var.I.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                une.c((une) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((TextView) this.c).setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
