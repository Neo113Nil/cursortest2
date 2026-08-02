package xsna;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: CubicBezierInterpolator.java */
/* loaded from: classes3.dex */
public final class okk implements Interpolator {
    public PointF a;
    public PointF b;
    public PointF c;
    public PointF d;
    public PointF e;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        PointF pointF = this.b;
        PointF pointF2 = this.a;
        PointF pointF3 = this.c;
        PointF pointF4 = this.d;
        PointF pointF5 = this.e;
        float f2 = f;
        for (int i = 1; i < 14; i++) {
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
        }
        float f7 = pointF2.y * 3.0f;
        pointF5.y = f7;
        float f8 = ((pointF.y - pointF2.y) * 3.0f) - f7;
        pointF4.y = f8;
        float f9 = (1.0f - pointF5.y) - f8;
        pointF3.y = f9;
        return ((((f9 * f2) + pointF4.y) * f2) + pointF5.y) * f2;
    }
}
