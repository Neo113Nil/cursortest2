package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: ShopsMoreBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class ifj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ LinearLayout b;

    public ifj0(LinearLayout linearLayout) {
        this.b = linearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LinearLayout linearLayout = this.b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        layoutParams.width = num != null ? num.intValue() : 0;
        linearLayout.setLayoutParams(layoutParams);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        linearLayout.setScaleX(animatedFraction);
        linearLayout.setScaleY(animatedFraction);
        linearLayout.setAlpha(animatedFraction);
    }
}
