package xsna;

import android.graphics.PointF;

/* compiled from: RectPoints.kt */
/* loaded from: classes4.dex */
public final class hif0 {
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final float[] e;
    public final PointF[] f;

    public hif0() {
        this(0);
    }

    public static hif0 b(hif0 hif0Var) {
        PointF pointF = hif0Var.a;
        PointF pointF2 = hif0Var.b;
        PointF pointF3 = hif0Var.c;
        PointF pointF4 = hif0Var.d;
        hif0Var.getClass();
        return new hif0(pointF, pointF2, pointF3, pointF4);
    }

    public final float[] a() {
        PointF pointF = this.a;
        float f = pointF.x;
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = pointF.y;
        PointF pointF2 = this.b;
        fArr[2] = pointF2.x;
        fArr[3] = pointF2.y;
        PointF pointF3 = this.c;
        fArr[4] = pointF3.x;
        fArr[5] = pointF3.y;
        PointF pointF4 = this.d;
        fArr[6] = pointF4.x;
        fArr[7] = pointF4.y;
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hif0)) {
            return false;
        }
        hif0 hif0Var = (hif0) obj;
        return epx.f(this.a, hif0Var.a) && epx.f(this.b, hif0Var.b) && epx.f(this.c, hif0Var.c) && epx.f(this.d, hif0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RectPoints(leftTop=" + this.a + ", rightTop=" + this.b + ", rightBottom=" + this.c + ", leftBottom=" + this.d + ")";
    }

    public hif0(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
        this.d = pointF4;
        this.e = new float[9];
        this.f = new PointF[]{pointF, pointF2, pointF3, pointF4};
    }

    public /* synthetic */ hif0(int i) {
        this(new PointF(), new PointF(), new PointF(), new PointF());
    }
}
