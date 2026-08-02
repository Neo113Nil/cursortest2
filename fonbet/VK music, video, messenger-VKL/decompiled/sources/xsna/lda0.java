package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PhotoTapAntimationUtils.kt */
/* loaded from: classes4.dex */
public final class lda0 {
    public static final void a(final View view, float f, final boolean z) {
        ViewPropertyAnimator scaleX = view.animate().scaleX(z ? f : 1.0f);
        if (!z) {
            f = 1.0f;
        }
        scaleX.scaleY(f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.kda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float a;
                if (z) {
                    a = cn70.a() * valueAnimator.getAnimatedFraction() * 8;
                } else {
                    a = cn70.a() * (1 - valueAnimator.getAnimatedFraction()) * 8;
                }
                bwt0.d(view, a, (r4 & 2) != 0, (r4 & 4) != 0);
            }
        }).setDuration(150L).start();
    }
}
