package xsna;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: VerticalSwipeStrategy.kt */
/* loaded from: classes17.dex */
public abstract class dpr0 extends bp6 {
    @Override // xsna.bp6
    public final long c() {
        return 250L;
    }

    @Override // xsna.bp6
    public final float d(View view) {
        return view.getTranslationY();
    }

    @Override // xsna.bp6
    public final void e(View view, ValueAnimator valueAnimator) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
