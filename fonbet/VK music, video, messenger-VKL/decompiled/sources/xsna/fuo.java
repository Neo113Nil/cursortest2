package xsna;

import android.view.animation.Interpolator;

/* compiled from: IndeterminateProgressBarWithLogoView.kt */
/* loaded from: classes.dex */
public final class fuo implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = f;
        if (d < 0.5d) {
            return 4 * ((float) Math.pow(d, 3));
        }
        float f2 = (-2) * f;
        return 1 - (((float) Math.pow(f2 + r6, 3)) / 2);
    }
}
