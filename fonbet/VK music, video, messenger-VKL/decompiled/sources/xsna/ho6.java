package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import xsna.dhr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ho6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ho6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((d98) this.c).g.W(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
                break;
            case 2:
                j9k j9kVar = (j9k) this.c;
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                j9kVar.invoke(f);
                break;
            case 3:
                i5 i5Var = ((s820) this.c).h;
                if (i5Var != null) {
                    i5Var.invoke();
                    break;
                }
                break;
            case 4:
                dhr0.b bVar = (dhr0.b) this.c;
                bVar.d = (dhr0.d.a) valueAnimator.getAnimatedValue();
                bVar.postInvalidateOnAnimation();
                break;
            default:
                ((fft0) this.c).e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
