package xsna;

import android.animation.ValueAnimator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class es6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ es6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                com.vk.attachpicker.screen.a aVar = (com.vk.attachpicker.screen.a) this.c;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                aVar.H(num != null ? num.intValue() : 0);
                break;
            case 1:
                bm10 bm10Var = (bm10) this.c;
                bm10Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm10Var.j.setAlpha((int) (255.0f * floatValue));
                bm10Var.x = floatValue;
                break;
            default:
                ((rng0) this.c).o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
