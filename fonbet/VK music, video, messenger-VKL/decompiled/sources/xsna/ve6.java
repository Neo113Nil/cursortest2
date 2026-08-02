package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ve6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ve6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((BaseIndicatorTabLayout) this.c).lambda$animateToTab$0(valueAnimator);
                break;
            case 1:
                p6f0 p6f0Var = (p6f0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6f0Var.a.b(floatValue);
                p6f0Var.b.setAlpha(floatValue);
                p6f0Var.a.invalidate();
                break;
            default:
                View view = (View) this.c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
