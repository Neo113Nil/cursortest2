package xsna;

import android.view.animation.Interpolator;

/* compiled from: BetterBounceInterpolator.kt */
/* loaded from: classes17.dex */
public final class by6 implements Interpolator {
    public final double a = 1.5d;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((((-(((1 - f) * 2.0d * f * this.a) + (f * f))) + 1) * (-Math.abs(Math.cos(((10.0f * f) * 2) / 3.141592653589793d)))) + 1.0d);
    }
}
