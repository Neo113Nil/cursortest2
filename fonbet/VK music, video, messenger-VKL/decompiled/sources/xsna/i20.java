package xsna;

import android.animation.ValueAnimator;
import android.util.Size;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.c;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                viewGroup.setLayoutParams(marginLayoutParams);
                return;
            case 1:
                ubg ubgVar = (ubg) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ubgVar.i6().j.setScaleX(floatValue);
                ubgVar.i6().j.setScaleY(floatValue);
                return;
            default:
                m0f0 m0f0Var = (m0f0) this.c;
                m0f0Var.n = (Size) valueAnimator.getAnimatedValue();
                m0f0Var.requestLayout();
                return;
        }
    }
}
