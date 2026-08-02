package xsna;

import android.animation.ValueAnimator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tlc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tlc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((ulc) this.c).G.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                f4m.x(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((com.vk.music.onboarding.impl.b) this.c).B);
                break;
            default:
                q8u0 q8u0Var = (q8u0) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q8u0Var.d.setColor(intValue);
                q8u0Var.f = intValue;
                break;
        }
    }
}
