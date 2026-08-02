package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ds6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ds6(Object obj, int i) {
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
                ((ViewGroup) this.c).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((b4k0) this.c).g.a = (float) Math.exp(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
