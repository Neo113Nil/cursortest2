package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: ExpandableTextBinder.kt */
/* loaded from: classes4.dex */
public final class t8q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ r8q b;

    public t8q(r8q r8qVar) {
        this.b = r8qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        r8q r8qVar = this.b;
        ViewGroup.LayoutParams layoutParams = r8qVar.b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
        }
        r8qVar.b.requestLayout();
    }
}
