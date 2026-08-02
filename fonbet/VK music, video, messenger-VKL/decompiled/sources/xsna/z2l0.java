package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StickerCommonDelegate.kt */
/* loaded from: classes5.dex */
public final class z2l0 implements oov {
    public final nov a;
    public final u7l0 b = new u7l0();
    public boolean c;
    public final float[] d;
    public final RectF e;
    public final PointF[] f;
    public float g;
    public float h;
    public float i;
    public float j;
    public q500 k;
    public float l;
    public float m;
    public final Matrix n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final Matrix t;

    public z2l0(nov novVar) {
        this.a = novVar;
        new Matrix();
        this.d = new float[8];
        this.e = new RectF();
        this.f = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = new Matrix();
        this.p = true;
        this.q = true;
        this.t = new Matrix();
    }

    @Override // xsna.oov
    public final void a(float f) {
        this.j = f;
    }

    @Override // xsna.oov
    public final float b() {
        return this.i;
    }

    @Override // xsna.oov
    public final float c() {
        return this.l;
    }

    @Override // xsna.oov
    public final boolean d() {
        return this.o;
    }

    @Override // xsna.oov
    public final void e(float f) {
        this.i = f;
    }

    @Override // xsna.oov
    public final float f() {
        return this.j;
    }

    @Override // xsna.oov
    public final void g(float f) {
        this.m = f;
    }

    @Override // xsna.oov
    public final float getBottom() {
        float[] fArr = this.d;
        return Math.max(Math.max(fArr[1], fArr[3]), Math.max(fArr[5], fArr[7]));
    }

    @Override // xsna.oov
    public final float getCenterX() {
        return this.e.centerX();
    }

    @Override // xsna.oov
    public final float getCenterY() {
        return this.e.centerY();
    }

    @Override // xsna.oov
    public final PointF[] getFillPoints() {
        PointF[] pointFArr = this.f;
        PointF pointF = pointFArr[0];
        float[] fArr = this.d;
        pointF.set(fArr[0], fArr[1]);
        pointFArr[1].set(fArr[2], fArr[3]);
        pointFArr[2].set(fArr[4], fArr[5]);
        pointFArr[3].set(fArr[6], fArr[7]);
        return pointFArr;
    }

    @Override // xsna.oov
    public final boolean getInDraggingMode() {
        return this.r;
    }

    @Override // xsna.oov
    public final boolean getInEditMode() {
        return this.s;
    }

    @Override // xsna.oov
    public final float getLeft() {
        float[] fArr = this.d;
        return Math.min(Math.min(fArr[0], fArr[2]), Math.min(fArr[4], fArr[6]));
    }

    @Override // xsna.oov
    public final float getRight() {
        float[] fArr = this.d;
        return Math.max(Math.max(fArr[0], fArr[2]), Math.max(fArr[4], fArr[6]));
    }

    @Override // xsna.oov
    public final float getTop() {
        float[] fArr = this.d;
        return Math.min(Math.min(fArr[1], fArr[3]), Math.min(fArr[5], fArr[7]));
    }

    @Override // xsna.oov
    public final Matrix getTransformMatrix() {
        return this.n;
    }

    @Override // xsna.oov
    public final void h(float f, float f2) {
        nov novVar = this.a;
        RectF rectF = this.e;
        novVar.x0(rectF, f, f2);
        float f3 = rectF.left;
        float[] fArr = this.d;
        fArr[0] = f3;
        float f4 = rectF.top;
        fArr[1] = f4;
        float f5 = rectF.right;
        fArr[2] = f5;
        fArr[3] = f4;
        fArr[4] = f5;
        float f6 = rectF.bottom;
        fArr[5] = f6;
        fArr[6] = f3;
        fArr[7] = f6;
        novVar.getStickerMatrix().mapRect(rectF);
        novVar.getStickerMatrix().mapPoints(fArr);
    }

    @Override // xsna.oov
    public final void i(float f) {
        this.l = f;
    }

    @Override // xsna.oov
    public final boolean isVisible() {
        return this.p;
    }

    @Override // xsna.oov
    public final boolean j(PointF[] pointFArr, float f, float f2) {
        bpn0 bpn0Var = z5l0.a;
        if (pointFArr.length >= 3) {
            PointF pointF = pointFArr[0];
            float f3 = pointF.x;
            PointF pointF2 = pointFArr[2];
            if (f3 != pointF2.x || pointF.y != pointF2.y) {
                int length = pointFArr.length;
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    PointF pointF3 = pointFArr[i];
                    PointF pointF4 = i == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i + 1];
                    float f4 = pointF3.y;
                    boolean z2 = f4 >= f2;
                    float f5 = pointF4.y;
                    if (z2 != (f5 >= f2)) {
                        float f6 = pointF4.x;
                        float f7 = pointF3.x;
                        if (f <= (((f2 - f4) * (f6 - f7)) / (f5 - f4)) + f7) {
                            z = !z;
                        }
                    }
                    i++;
                }
                if (!z) {
                    int length2 = pointFArr.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        PointF pointF5 = pointFArr[i2];
                        PointF pointF6 = i2 == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i2 + 1];
                        float f8 = pointF5.y;
                        float f9 = pointF6.x;
                        float f10 = pointF5.x;
                        if (z5l0.a(Math.abs(((f9 - f10) * (f2 - f8)) - ((pointF6.y - f8) * (f - f10))), 5.0E-4f) <= 0) {
                            float f11 = pointF5.x;
                            float f12 = (pointF6.x - f11) * (f - f11);
                            float f13 = pointF5.y;
                            float b = u11.b(pointF6.y, f13, f2 - f13, f12);
                            if (z5l0.a(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 0) {
                                continue;
                            } else {
                                float f14 = pointF6.x - pointF5.x;
                                float f15 = pointF6.y - pointF5.y;
                                if (z5l0.a(b, (f15 * f15) + (f14 * f14)) <= 0) {
                                    return true;
                                }
                            }
                        }
                        i2++;
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Override // xsna.oov
    public final float k() {
        return this.m;
    }

    @Override // xsna.oov
    public final PointF[] l() {
        PointF[] fillPoints = getFillPoints();
        float b = iah0.b(20.0f);
        if (fillPoints.length != 4) {
            return fillPoints;
        }
        float a = u7l0.a(fillPoints[0].x, fillPoints[2].x, b, true);
        u7l0 u7l0Var = this.b;
        u7l0Var.a = a;
        u7l0Var.e = u7l0.a(fillPoints[0].x, fillPoints[2].x, b, false);
        u7l0Var.c = u7l0.a(fillPoints[1].x, fillPoints[3].x, b, true);
        u7l0Var.g = u7l0.a(fillPoints[1].x, fillPoints[3].x, b, false);
        u7l0Var.b = u7l0.a(fillPoints[0].y, fillPoints[2].y, b, true);
        u7l0Var.f = u7l0.a(fillPoints[0].y, fillPoints[2].y, b, false);
        u7l0Var.d = u7l0.a(fillPoints[1].y, fillPoints[3].y, b, true);
        u7l0Var.h = u7l0.a(fillPoints[1].y, fillPoints[3].y, b, false);
        fillPoints[0].set(u7l0Var.a, u7l0Var.b);
        fillPoints[1].set(u7l0Var.c, u7l0Var.d);
        fillPoints[2].set(u7l0Var.e, u7l0Var.f);
        fillPoints[3].set(u7l0Var.g, u7l0Var.h);
        return fillPoints;
    }

    @Override // xsna.oov
    public final void m(oov oovVar) {
        this.l = oovVar.c();
        z2l0 z2l0Var = oovVar instanceof z2l0 ? (z2l0) oovVar : null;
        if (z2l0Var == null) {
            return;
        }
        this.k = z2l0Var.k;
        this.i = z2l0Var.i;
        this.j = z2l0Var.j;
        this.g = z2l0Var.g;
        this.h = z2l0Var.h;
        this.t.set(z2l0Var.t);
    }

    @Override // xsna.oov
    public final void n(boolean z) {
        this.r = z;
    }

    @Override // xsna.oov
    public final q500 o() {
        return this.k;
    }

    @Override // xsna.oov
    public final void p(q500 q500Var) {
        this.k = q500Var;
    }

    @Override // xsna.oov
    public final void setInEditMode(boolean z) {
        this.s = z;
        this.a.setStickerAlpha(z ? 0 : 255);
    }

    @Override // xsna.oov
    public final void setRemovable(boolean z) {
        this.q = z;
    }

    @Override // xsna.oov
    public final void setStatic(boolean z) {
        this.o = z;
    }

    @Override // xsna.oov
    public final void setVisible(boolean z) {
        this.p = z;
    }

    @Override // xsna.oov
    public final boolean v0() {
        return this.q;
    }

    @Override // xsna.oov
    public final void w0(float f, float f2) {
        float f3 = this.i;
        float f4 = this.j;
        float f5 = f3 * f4;
        nov novVar = this.a;
        if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f * f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float min = Math.min(f / f3, f2 / f4);
            float a = yq.a(f3, min, f, 2.0f);
            float a2 = yq.a(f4, min, f2, 2.0f);
            Matrix stickerMatrix = novVar.getStickerMatrix();
            stickerMatrix.postScale(min, min);
            stickerMatrix.postTranslate(a, a2);
        }
        this.i = f;
        this.j = f2;
        novVar.t0();
    }

    @Override // xsna.oov
    public final void y0(float f, float f2, float f3, boolean z) {
        nov novVar = this.a;
        if (novVar.getCanRotate()) {
            float f4 = this.g;
            boolean z2 = this.c;
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z2 || z) {
                float f6 = f + f4;
                this.g = f6;
                float abs = Math.abs(Math.abs(f6) % 45.0f) % 45.0f;
                if ((44.8f <= abs || abs <= 0.2f) && !z) {
                    this.g = ((float) Math.rint(this.g / 45.0f)) * 45.0f;
                    this.c = true;
                    bpn0 bpn0Var = z5l0.a;
                    bpn0 bpn0Var2 = z5l0.a;
                    if (((Vibrator) bpn0Var2.getValue()).hasVibrator()) {
                        if (gz80.a(26)) {
                            ((Vibrator) bpn0Var2.getValue()).vibrate(VibrationEffect.createOneShot(50L, 75));
                        } else {
                            ((Vibrator) bpn0Var2.getValue()).vibrate(50L);
                        }
                    }
                } else {
                    this.c = false;
                }
            } else {
                float f7 = this.h + f;
                this.h = f7;
                if (Math.abs(f7) > 6.0f) {
                    this.c = false;
                    this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            float f8 = this.g;
            if (f8 != f4) {
                f5 = f8 - f4;
            }
            novVar.getStickerMatrix().postRotate(f5, f2, f3);
            novVar.t0();
        }
    }
}
