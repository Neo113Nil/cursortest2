package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import xsna.jfk;
import xsna.sot;

/* compiled from: CropController.kt */
/* loaded from: classes4.dex */
public final class jfk implements sot.a {
    public final efk b;
    public final hfk c;
    public final c5p d;
    public a i;
    public final tnt j;
    public final fs20 e = new fs20();
    public final hs20 f = new hs20();
    public final Matrix g = new Matrix();
    public final Matrix h = new Matrix();
    public final float[] k = new float[8];
    public final PointF[] l = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final PointF[] m = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* compiled from: CropController.kt */
    public static final class a implements Runnable {
        public final ValueAnimator b;
        public float c;
        public float d;
        public final float e;
        public final float f;

        /* compiled from: CropController.kt */
        /* renamed from: xsna.jfk$a$a, reason: collision with other inner class name */
        public static final class C3118a extends AnimatorListenerAdapter {
            public final /* synthetic */ jfk b;
            public final /* synthetic */ gzs<s3q0> c;

            public C3118a(jfk jfkVar, gzs<s3q0> gzsVar) {
                this.b = jfkVar;
                this.c = gzsVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                onAnimationEnd(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.b.getClass();
                this.c.invoke();
            }
        }

        public a(final jfk jfkVar, float f, final float f2, final float f3, gzs<s3q0> gzsVar) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.b = ofFloat;
            float f4 = jfkVar.j.g;
            this.e = f4;
            this.f = f * f4;
            ofFloat.setDuration(600L);
            ofFloat.setInterpolator(new DecelerateInterpolator(3.0f));
            ofFloat.addListener(new C3118a(jfkVar, gzsVar));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ifk
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    jfk.a aVar = jfk.a.this;
                    float f5 = aVar.e;
                    float f6 = aVar.f;
                    float b = u11.b(f6, f5, animatedFraction, f5);
                    jfk jfkVar2 = jfkVar;
                    tnt tntVar = jfkVar2.j;
                    float f7 = b / tntVar.g;
                    hfk hfkVar = jfkVar2.c;
                    tntVar.a(f7, hfkVar.getCenterX(), hfkVar.getCenterY());
                    float f8 = f2 * animatedFraction;
                    float f9 = animatedFraction * f3;
                    float f10 = f8 - aVar.c;
                    float f11 = f9 - aVar.d;
                    tnt tntVar2 = jfkVar2.j;
                    float f12 = tntVar2.g;
                    tntVar2.c((f10 * f12) / f6, (f11 * f12) / f6);
                    aVar.c = f8;
                    aVar.d = f9;
                    jfkVar2.i();
                }
            });
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.start();
        }
    }

    public jfk(efk efkVar, hfk hfkVar, float f, float f2, c5p c5pVar) {
        this.b = efkVar;
        this.c = hfkVar;
        this.d = c5pVar;
        this.j = new tnt(f, f2);
    }

    public static float d(jfk jfkVar, float f, int i) {
        if ((i & 1) != 0) {
            f = jfkVar.j.h;
        }
        float f2 = f;
        tnt tntVar = jfkVar.j;
        float f3 = tntVar.i;
        hfk hfkVar = jfkVar.c;
        return jfkVar.e.a(f2, tntVar.a, tntVar.b, hfkVar.getCropWidth(), hfkVar.getCropHeight(), !(f3 % ((float) 180) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    @Override // xsna.sot.a
    public final void a(float f, float f2) {
        this.d.b(CropStatEvent.f.a);
        boolean f3 = f(1.0f);
        tnt tntVar = this.j;
        if (f3) {
            tntVar.c(f, f2);
        } else {
            hfk hfkVar = this.c;
            float cropWidth = hfkVar.getCropWidth();
            float abs = ((Math.abs(f) * 0.43f) * cropWidth) / ((Math.abs(f) * 0.43f) + cropWidth);
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                abs = -abs;
            }
            float cropHeight = hfkVar.getCropHeight();
            float abs2 = ((Math.abs(f2) * 0.43f) * cropHeight) / ((Math.abs(f2) * 0.43f) + cropHeight);
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                abs2 = -abs2;
            }
            tntVar.c(abs, abs2);
        }
        i();
    }

    @Override // xsna.sot.a
    public final void b() {
        h(true, new se0(17));
    }

    @Override // xsna.sot.a
    public final void c() {
        e();
    }

    public final void e() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.b.cancel();
        }
        this.i = null;
    }

    public final boolean f(float f) {
        tnt tntVar = this.j;
        if (tntVar.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        float[] fArr = this.k;
        jw5.q(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hfk hfkVar = this.c;
        float fullWidth = hfkVar.getFullWidth();
        float f2 = tntVar.a;
        float f3 = tntVar.b;
        fArr[0] = (fullWidth - f2) / 2.0f;
        fArr[1] = (hfkVar.getFullHeight() - f3) / 2.0f;
        fArr[2] = (hfkVar.getFullWidth() + f2) / 2.0f;
        fArr[3] = (hfkVar.getFullHeight() - f3) / 2.0f;
        fArr[4] = (hfkVar.getFullWidth() + f2) / 2.0f;
        fArr[5] = (hfkVar.getFullHeight() + f3) / 2.0f;
        fArr[6] = (hfkVar.getFullWidth() - f2) / 2.0f;
        fArr[7] = (hfkVar.getFullHeight() + f3) / 2.0f;
        Matrix matrix = tntVar.o;
        Matrix matrix2 = this.h;
        matrix2.set(matrix);
        matrix2.postScale(f, f, hfkVar.getCenterX(), hfkVar.getCenterY());
        matrix2.mapPoints(fArr);
        PointF[] pointFArr = this.m;
        PointF pointF = pointFArr[0];
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        PointF pointF2 = pointFArr[1];
        pointF2.x = fArr[2];
        pointF2.y = fArr[3];
        PointF pointF3 = pointFArr[2];
        pointF3.x = fArr[4];
        pointF3.y = fArr[5];
        PointF pointF4 = pointFArr[3];
        pointF4.x = fArr[6];
        pointF4.y = fArr[7];
        PointF[] pointFArr2 = this.l;
        pointFArr2[0].set(hfkVar.getX0(), hfkVar.getY0());
        pointFArr2[1].set(hfkVar.getX1(), hfkVar.getY0());
        pointFArr2[2].set(hfkVar.getX1(), hfkVar.getY1());
        pointFArr2[3].set(hfkVar.getX0(), hfkVar.getY1());
        return ine0.k(pointFArr, pointFArr2);
    }

    public final void g() {
        efk efkVar = this.b;
        int measuredHeight = efkVar.getMeasuredHeight();
        int measuredWidth = efkVar.getMeasuredWidth();
        tnt tntVar = this.j;
        float f = tntVar.b;
        float f2 = tntVar.a;
        Matrix matrix = tntVar.o;
        matrix.reset();
        float f3 = 0;
        tntVar.i = f3;
        tntVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        tntVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        tntVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hfk hfkVar = this.c;
        matrix.postRotate(f3, hfkVar.getCenterX(), hfkVar.getCenterY());
        tntVar.m = measuredWidth;
        tntVar.l = measuredHeight;
        float f4 = tntVar.a;
        float f5 = tntVar.b;
        float cropWidth = hfkVar.getCropWidth();
        float cropHeight = hfkVar.getCropHeight();
        fs20 fs20Var = this.e;
        tntVar.g = fs20Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5, cropWidth, cropHeight, false);
        float a2 = fs20Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tntVar.a, tntVar.b, hfkVar.getFullWidth(), hfkVar.getFullHeight(), false) * 2.0f;
        if (5.0f >= a2) {
            a2 = 5.0f;
        }
        tntVar.f = a2;
        float f6 = tntVar.g;
        tntVar.n = f6;
        matrix.postScale(f6, f6, hfkVar.getCenterX(), hfkVar.getCenterY());
        tntVar.e = f2 / f;
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z, gzs<s3q0> gzsVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float abs;
        float f5;
        PointF pointF;
        hfk hfkVar = this.c;
        float cropAspectRatio = hfkVar.getCropAspectRatio();
        tnt tntVar = this.j;
        tntVar.e = cropAspectRatio;
        float a2 = this.e.a(tntVar.h, tntVar.a, tntVar.b, hfkVar.getCropWidth(), hfkVar.getCropHeight(), !(tntVar.i % ((float) 180) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (tntVar.j == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && tntVar.k == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = tntVar.g;
        } else {
            f = tntVar.g;
            if (f >= a2) {
                a2 = tntVar.f;
                if (f <= a2) {
                    f2 = 1.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                    while (!f(f2) && Math.abs(f3) < 0.001f && Math.abs(f4) < 0.001f) {
                        float cropWidth = hfkVar.getCropWidth();
                        float cropHeight = hfkVar.getCropHeight();
                        float x0 = hfkVar.getX0();
                        float y0 = hfkVar.getY0();
                        float f6 = tntVar.h;
                        hs20 hs20Var = this.f;
                        float[] fArr = hs20Var.c;
                        float[] fArr2 = hs20Var.e;
                        RectF rectF = hs20Var.a;
                        Matrix matrix = hs20Var.b;
                        PointF pointF2 = hs20Var.d;
                        pointF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        abs = Math.abs(f6);
                        PointF[] pointFArr = this.m;
                        if (abs >= 0.001f) {
                            hs20.a(pointFArr, cropWidth, cropHeight, x0, y0, pointF2);
                            f5 = 0.001f;
                            pointF = pointF2;
                        } else {
                            f5 = 0.001f;
                            rectF.set(x0, y0, cropWidth + x0, y0 + cropHeight);
                            matrix.reset();
                            matrix.postRotate(-f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            PointF pointF3 = pointFArr[0];
                            fArr[0] = pointF3.x;
                            fArr[1] = pointF3.y;
                            PointF pointF4 = pointFArr[1];
                            fArr[2] = pointF4.x;
                            fArr[3] = pointF4.y;
                            PointF pointF5 = pointFArr[2];
                            fArr[4] = pointF5.x;
                            fArr[5] = pointF5.y;
                            PointF pointF6 = pointFArr[3];
                            fArr[6] = pointF6.x;
                            fArr[7] = pointF6.y;
                            matrix.mapPoints(fArr);
                            PointF pointF7 = pointFArr[0];
                            pointF7.x = fArr[0];
                            pointF7.y = fArr[1];
                            PointF pointF8 = pointFArr[1];
                            pointF8.x = fArr[2];
                            pointF8.y = fArr[3];
                            PointF pointF9 = pointFArr[2];
                            pointF9.x = fArr[4];
                            pointF9.y = fArr[5];
                            PointF pointF10 = pointFArr[3];
                            pointF10.x = fArr[6];
                            pointF10.y = fArr[7];
                            matrix.mapRect(rectF);
                            hs20.a(pointFArr, rectF.width(), rectF.height(), rectF.left, rectF.top, pointF2);
                            pointF = pointF2;
                            fArr2[0] = pointF.x;
                            fArr2[1] = pointF.y;
                            matrix.postRotate(2 * f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            matrix.mapPoints(fArr2);
                            pointF.x = fArr2[0];
                            pointF.y = fArr2[1];
                        }
                        f3 = pointF.x;
                        f4 = pointF.y;
                        if (Math.abs(f3) < f5 && Math.abs(f4) < f5) {
                            f2 *= 1.01f;
                        }
                    }
                    if (f2 != 1.0f && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i();
                        gzsVar.invoke();
                        return;
                    } else if (!z) {
                        a aVar = new a(this, f2, -f3, -f4, gzsVar);
                        this.i = aVar;
                        this.b.post(aVar);
                        return;
                    } else {
                        tntVar.a(f2, hfkVar.getCenterX(), hfkVar.getCenterY());
                        tntVar.c(-f3, -f4);
                        i();
                        gzsVar.invoke();
                        return;
                    }
                }
            }
        }
        f2 = a2 / f;
        f3 = 0.0f;
        f4 = 0.0f;
        while (!f(f2)) {
            float cropWidth2 = hfkVar.getCropWidth();
            float cropHeight2 = hfkVar.getCropHeight();
            float x02 = hfkVar.getX0();
            float y02 = hfkVar.getY0();
            float f62 = tntVar.h;
            hs20 hs20Var2 = this.f;
            float[] fArr3 = hs20Var2.c;
            float[] fArr22 = hs20Var2.e;
            RectF rectF2 = hs20Var2.a;
            Matrix matrix2 = hs20Var2.b;
            PointF pointF22 = hs20Var2.d;
            pointF22.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            abs = Math.abs(f62);
            PointF[] pointFArr2 = this.m;
            if (abs >= 0.001f) {
            }
            f3 = pointF.x;
            f4 = pointF.y;
            if (Math.abs(f3) < f5) {
                f2 *= 1.01f;
            }
        }
        if (f2 != 1.0f) {
        }
        if (!z) {
        }
    }

    public final void i() {
        Matrix matrix = this.j.o;
        Matrix matrix2 = this.g;
        matrix2.set(matrix);
        this.b.setContentMatrix(matrix2);
    }

    @Override // xsna.sot.a
    public final void onScale(float f, float f2, float f3) {
        c5p c5pVar = this.d;
        if (f >= 1.0f) {
            c5pVar.b(CropStatEvent.l.a);
        } else {
            c5pVar.b(CropStatEvent.k.a);
        }
        this.j.a(f, f2, f3);
        i();
    }
}
