package xsna;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CubicBezierInterpolator.java */
/* loaded from: classes.dex */
public final class pkk implements Interpolator {
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;

    public pkk(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF(f, f2);
        PointF pointF2 = new PointF(f3, f4);
        this.c = new PointF();
        this.d = new PointF();
        this.e = new PointF();
        float f5 = pointF.x;
        if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f5 > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f6 = pointF2.x;
        if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f6 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.a = pointF;
        this.b = pointF2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i = 1;
        float f2 = f;
        while (true) {
            pointF = this.b;
            pointF2 = this.a;
            pointF3 = this.c;
            pointF4 = this.d;
            pointF5 = this.e;
            if (i >= 14) {
                break;
            }
            float f3 = pointF2.x * 3.0f;
            pointF5.x = f3;
            float f4 = ((pointF.x - pointF2.x) * 3.0f) - f3;
            pointF4.x = f4;
            float f5 = (1.0f - pointF5.x) - f4;
            pointF3.x = f5;
            float f6 = (((((f5 * f2) + pointF4.x) * f2) + pointF5.x) * f2) - f;
            if (Math.abs(f6) < 0.001d) {
                break;
            }
            f2 -= f6 / (((((pointF3.x * 3.0f) * f2) + (pointF4.x * 2.0f)) * f2) + pointF5.x);
            i++;
        }
        float f7 = pointF2.y * 3.0f;
        pointF5.y = f7;
        float f8 = ((pointF.y - pointF2.y) * 3.0f) - f7;
        pointF4.y = f8;
        float f9 = (1.0f - pointF5.y) - f8;
        pointF3.y = f9;
        return ((((f9 * f2) + pointF4.y) * f2) + pointF5.y) * f2;
    }

    public pkk(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }
}
