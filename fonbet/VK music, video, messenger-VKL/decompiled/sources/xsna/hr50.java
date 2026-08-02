package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: MyTargetInternalNativeAdSurveyViewHolder.kt */
/* loaded from: classes4.dex */
public final class hr50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ fr50 b;

    public hr50(fr50 fr50Var) {
        this.b = fr50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        fr50 fr50Var = this.b;
        ViewGroup.LayoutParams layoutParams = fr50Var.E.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
        }
        fr50Var.E.requestLayout();
    }
}
