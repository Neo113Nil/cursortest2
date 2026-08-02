package xsna;

import android.animation.ValueAnimator;
import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lfe0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PullFromTopLinearLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lfe0(PullFromTopLinearLayout pullFromTopLinearLayout, boolean z) {
        this.b = pullFromTopLinearLayout;
        this.c = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = PullFromTopLinearLayout.d;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        PullFromTopLinearLayout pullFromTopLinearLayout = this.b;
        pullFromTopLinearLayout.getLayoutParams().height = intValue;
        pullFromTopLinearLayout.setAlpha(this.c ? valueAnimator.getAnimatedFraction() : 1.0f - valueAnimator.getAnimatedFraction());
        pullFromTopLinearLayout.requestLayout();
    }
}
