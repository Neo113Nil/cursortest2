package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.common.view.DotsIndicatorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hm7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hm7(View view, float f) {
        this.b = 3;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                uwt0.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((km7) this.c).o);
                break;
            case 1:
                DotsIndicatorView dotsIndicatorView = (DotsIndicatorView) this.c;
                dotsIndicatorView.n.setColor(n8g.d(valueAnimator.getAnimatedFraction(), dotsIndicatorView.u, dotsIndicatorView.g));
                dotsIndicatorView.invalidate();
                break;
            case 2:
                rqb0 rqb0Var = (rqb0) this.c;
                rqb0Var.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
                rqb0Var.invalidateSelf();
                break;
            case 3:
                View view = (View) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setScaleY(floatValue);
                view.setScaleX(floatValue);
                break;
            default:
                ((hx3) this.c).invoke((Float) valueAnimator.getAnimatedValue());
                break;
        }
    }

    public /* synthetic */ hm7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
