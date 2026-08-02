package xsna;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasOnboardingShimmerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class msv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ msv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = IdeasOnboardingShimmerView.l;
                ((IdeasOnboardingShimmerView) obj).invalidate();
                break;
            default:
                waa0 waa0Var = (waa0) obj;
                waa0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                waa0Var.l = Math.min(Math.max(SystemClock.uptimeMillis() - waa0Var.j, 0L) / waa0Var.k, 1.0f);
                waa0Var.invalidateSelf();
                break;
        }
    }
}
