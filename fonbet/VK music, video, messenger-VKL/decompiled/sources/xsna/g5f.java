package xsna;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsStickersGuidesDrawer.kt */
/* loaded from: classes5.dex */
public class g5f extends zh {
    public vn00 y;
    public static final float z = iah0.b(30.0f);
    public static final int A = iah0.a(2);

    @Override // xsna.ial0
    public final void draw(Canvas canvas) {
        f5f f5fVar = (f5f) this;
        int i = f5fVar.i.a;
        vn00 vn00Var = f5fVar.y;
        float f = vn00Var.c;
        float f2 = i;
        r7z r7zVar = f5fVar.G;
        r7zVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, f);
        RectF rectF = f5fVar.H;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f);
        f5fVar.y(canvas, f5fVar.B, r7zVar, rectF);
        wah0 wah0Var = f5fVar.i;
        int i2 = wah0Var.a;
        float f3 = wah0Var.b;
        float f4 = f3 - vn00Var.a;
        float f5 = i2;
        r7zVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5, f4);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5, f3);
        f5fVar.y(canvas, f5fVar.C, r7zVar, rectF);
        int i3 = f5fVar.i.b;
        float f6 = vn00Var.b;
        float f7 = i3;
        r7zVar.a(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f7);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f7);
        f5fVar.y(canvas, f5fVar.D, r7zVar, rectF);
        wah0 wah0Var2 = f5fVar.i;
        int i4 = wah0Var2.a;
        int i5 = wah0Var2.b;
        float f8 = i4;
        float f9 = f8 - vn00Var.d;
        float f10 = i5;
        r7zVar.a(f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, f10);
        rectF.set(f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, f10);
        f5fVar.y(canvas, f5fVar.E, r7zVar, rectF);
        i(canvas);
        f5fVar.p.draw(canvas);
    }

    @Override // xsna.ial0
    public final void h(nov novVar, MotionEvent motionEvent) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        x5l0 x5l0Var = this.j;
        x5l0Var.b.set(novVar.getLeft(), novVar.getTop(), novVar.getRight(), novVar.getBottom());
        PointF a = x5l0.a(x5l0Var.b);
        f5f f5fVar = (f5f) this;
        float f7 = a.x;
        float f8 = this.i.c;
        float f9 = zh.x;
        boolean q = zh.q(f7, f8, f9);
        xtx0 xtx0Var = f5fVar.F;
        xtx0Var.b(q);
        RectF rectF = x5l0Var.b;
        vn00 vn00Var = this.y;
        float f10 = vn00Var.b;
        float f11 = vn00Var.a;
        float f12 = vn00Var.c;
        float f13 = vn00Var.d;
        float f14 = rectF.left;
        zh.u.getClass();
        float f15 = f10 + f9;
        float f16 = z;
        utx0 utx0Var = f5fVar.D;
        if (f14 > f15) {
            utx0Var.c(f14 <= f10 + f16);
            utx0Var.b(false);
            utx0Var.e(false);
        } else {
            utx0Var.c(false);
            utx0Var.b(true);
            utx0Var.e(f14 <= f10 - f9);
        }
        float f17 = this.i.a - f13;
        float f18 = rectF.right;
        float f19 = f17 - f9;
        utx0 utx0Var2 = f5fVar.E;
        if (f18 < f19) {
            utx0Var2.c(f18 >= f17 - f16);
            utx0Var2.b(false);
            utx0Var2.e(false);
        } else {
            utx0Var2.c(false);
            utx0Var2.b(true);
            utx0Var2.e(f18 >= f17 + f9);
        }
        xtx0Var.c(zh.q(a.y, this.i.d, f9));
        RectF rectF2 = x5l0Var.b;
        float f20 = rectF2.top;
        float f21 = f12 + f9;
        utx0 utx0Var3 = f5fVar.B;
        if (f20 > f21) {
            utx0Var3.c(f20 <= f12 + f16);
            utx0Var3.b(false);
            utx0Var3.e(false);
        } else {
            utx0Var3.c(false);
            utx0Var3.b(true);
            utx0Var3.e(rectF2.top <= f12 - f9);
        }
        float f22 = this.i.b - f11;
        float f23 = rectF2.bottom;
        float f24 = f22 - f9;
        utx0 utx0Var4 = f5fVar.C;
        if (f23 < f24) {
            utx0Var4.c(f23 >= f22 - f16);
            utx0Var4.b(false);
            utx0Var4.e(false);
            i = 1;
        } else {
            utx0Var4.c(false);
            i = 1;
            utx0Var4.b(true);
            utx0Var4.e(f23 >= f22 + f9);
        }
        VelocityTracker velocityTracker = this.d;
        velocityTracker.addMovement(motionEvent);
        velocityTracker.computeCurrentVelocity(i);
        double xVelocity = velocityTracker.getXVelocity();
        double yVelocity = velocityTracker.getYVelocity();
        int i3 = (StrictMath.sqrt(StrictMath.pow(yVelocity, 2.0d) + StrictMath.pow(xVelocity, 2.0d)) > zh.w ? 1 : (StrictMath.sqrt(StrictMath.pow(yVelocity, 2.0d) + StrictMath.pow(xVelocity, 2.0d)) == zh.w ? 0 : -1));
        if (i3 < 0) {
            boolean r = r();
            int i4 = A;
            kmr0 kmr0Var = this.h;
            if (r) {
                RectF rectF3 = x5l0Var.b;
                RectF rectF4 = x5l0Var.a;
                float f25 = x5l0.a(rectF3).x;
                i2 = i3;
                if (zh.p(this, f25, this.i.c, x5l0.a(rectF4).x)) {
                    float f26 = this.i.c;
                    this.s = f26;
                    f3 = f25 - f26;
                    u(false);
                    w();
                } else {
                    f3 = 0.0f;
                }
                RectF rectF5 = x5l0Var.b;
                float f27 = vn00Var.b;
                float f28 = rectF5.left;
                if (f28 <= f27 + f9) {
                    f4 = f3;
                    if (zh.p(this, f28, f27, rectF4.left)) {
                        this.s = f27;
                        f = rectF5.left - f27;
                        u(false);
                        w();
                        f5 = this.i.a - f13;
                        f6 = rectF5.right;
                        if (f6 >= f5 - f9 && zh.p(this, f6, f5, rectF4.right)) {
                            this.s = f5;
                            f = rectF5.right - f5;
                            u(false);
                            w();
                        }
                    }
                } else {
                    f4 = f3;
                }
                f = f4;
                f5 = this.i.a - f13;
                f6 = rectF5.right;
                if (f6 >= f5 - f9) {
                    this.s = f5;
                    f = rectF5.right - f5;
                    u(false);
                    w();
                }
            } else {
                i2 = i3;
                double d = kmr0Var.a + xVelocity;
                kmr0Var.a = d;
                if (Math.abs(d) > i4) {
                    u(true);
                }
                f = 0.0f;
            }
            if (s()) {
                RectF rectF6 = x5l0Var.b;
                RectF rectF7 = x5l0Var.a;
                PointF a2 = x5l0.a(rectF6);
                if (zh.p(this, a2.y, this.i.d, x5l0.a(rectF7).y)) {
                    float f29 = this.i.d;
                    this.t = f29;
                    f2 = a2.y - f29;
                    v(false);
                    w();
                } else {
                    f2 = 0.0f;
                }
                RectF rectF8 = x5l0Var.b;
                float f30 = this.i.b - f11;
                float f31 = rectF8.top;
                if (f31 <= f12 + f9 && zh.p(this, f31, f12, rectF7.top)) {
                    this.t = f12;
                    w();
                    v(false);
                    f2 = rectF8.top - f12;
                }
                float f32 = rectF8.bottom;
                if (f32 >= f30 - f9 && zh.p(this, f32, f30, rectF7.bottom)) {
                    this.t = f30;
                    w();
                    f2 = rectF8.bottom - f30;
                    v(false);
                }
            } else {
                double d2 = kmr0Var.b + yVelocity;
                kmr0Var.b = d2;
                if (Math.abs(d2) > i4) {
                    v(true);
                }
                f2 = 0.0f;
            }
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                novVar.e(-f, -f2);
            }
        } else {
            i2 = i3;
            u(true);
            v(true);
        }
        int pointerCount = motionEvent.getPointerCount();
        cov covVar = this.p;
        if (pointerCount != 2 || (i2 >= 0 && !covVar.b())) {
            covVar.reset();
        } else {
            covVar.a(novVar);
        }
        x5l0Var.a.set(x5l0Var.b);
    }
}
