package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import defpackage.b64;
import defpackage.g8e;

/* loaded from: classes.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.mStepSize;
        float a = b64.a(min, f2, f, f2);
        float[] fArr2 = this.mValues;
        float f3 = fArr2[min];
        return g8e.b(fArr2[min + 1], f3, a, f3);
    }
}
