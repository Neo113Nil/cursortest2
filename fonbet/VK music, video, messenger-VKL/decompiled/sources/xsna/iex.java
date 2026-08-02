package xsna;

import android.animation.ValueAnimator;
import com.vk.photo.editor.views.RotatingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class iex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iex(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                kex kexVar = (kex) obj;
                kexVar.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kexVar.setAlpha(valueAnimator.getAnimatedFraction());
                kexVar.requestLayout();
                break;
            case 1:
                b3f0 b3f0Var = (b3f0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (f3r f3rVar : b3f0Var.b.getReactionViews()) {
                    if (f3rVar.getParent() == b3f0Var.a) {
                        f3rVar.setTranslationY(floatValue);
                    }
                }
                b3f0Var.b.setTranslationY(floatValue);
                break;
            default:
                RotatingView rotatingView = (RotatingView) obj;
                int i2 = RotatingView.B;
                rotatingView.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rotatingView.invalidate();
                break;
        }
    }
}
