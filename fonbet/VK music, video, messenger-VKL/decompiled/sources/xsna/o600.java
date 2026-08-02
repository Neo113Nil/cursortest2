package xsna;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class o600 implements Interpolator {
    public final float[] a;
    public final float b;

    public o600(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float a = yq.a(min, f2, f, f2);
        float f3 = fArr[min];
        return u11.b(fArr[min + 1], f3, a, f3);
    }
}
