package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes12.dex */
public final class odc extends Drawable implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final ilq i = new ilq();
    public static final int[] j = {-16777216};
    public final a b;
    public float c;
    public final Resources d;
    public final ValueAnimator e;
    public float f;
    public boolean g;

    /* compiled from: CircularProgressDrawable.java */
    public static class a {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public a() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i) {
            this.j = i;
            this.u = this.i[i];
        }
    }

    public odc(@NonNull Context context) {
        context.getClass();
        this.d = context.getResources();
        a aVar = new a();
        this.b = aVar;
        aVar.i = j;
        aVar.a(0);
        aVar.h = 2.5f;
        aVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new mdc(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new ndc(this, aVar));
        this.e = ofFloat;
    }

    public static void i(float f, a aVar) {
        if (f <= 0.75f) {
            aVar.u = aVar.i[aVar.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = aVar.i;
        int i2 = aVar.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        aVar.u = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r1) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r3) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r4) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r2))));
    }

    public final void a(float f, a aVar, boolean z) {
        float interpolation;
        float f2;
        if (this.g) {
            i(f, aVar);
            float floor = (float) (Math.floor(aVar.m / 0.8f) + 1.0d);
            float f3 = aVar.k;
            float f4 = aVar.l;
            aVar.e = (((f4 - 0.01f) - f3) * f) + f3;
            aVar.f = f4;
            float f5 = aVar.m;
            aVar.g = u11.b(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = aVar.m;
            ilq ilqVar = i;
            if (f < 0.5f) {
                interpolation = aVar.k;
                f2 = (ilqVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = aVar.k + 0.79f;
                interpolation = f7 - (((1.0f - ilqVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f7;
            }
            float f8 = (0.20999998f * f) + f6;
            float f9 = (f + this.f) * 216.0f;
            aVar.e = interpolation;
            aVar.f = f2;
            aVar.g = f8;
            this.c = f9;
        }
    }

    public final void b(boolean z) {
        a aVar = this.b;
        if (aVar.n != z) {
            aVar.n = z;
        }
        invalidateSelf();
    }

    public final void c(float f) {
        a aVar = this.b;
        if (f != aVar.p) {
            aVar.p = f;
        }
        invalidateSelf();
    }

    public final void d(@NonNull int... iArr) {
        a aVar = this.b;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.b;
        Paint paint = aVar.b;
        RectF rectF = aVar.a;
        float f = aVar.q;
        float f2 = (aVar.h / 2.0f) + f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.r * aVar.p) / 2.0f, aVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = aVar.e;
        float f4 = aVar.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((aVar.f + f4) * 360.0f) - f5;
        paint.setColor(aVar.u);
        paint.setAlpha(aVar.t);
        float f7 = aVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = aVar.c;
        if (aVar.n) {
            Path path = aVar.o;
            if (path == null) {
                Path path2 = new Path();
                aVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (aVar.r * aVar.p) / 2.0f;
            aVar.o.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            aVar.o.lineTo(aVar.r * aVar.p, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path3 = aVar.o;
            float f10 = aVar.r;
            float f11 = aVar.p;
            path3.lineTo((f10 * f11) / 2.0f, aVar.s * f11);
            aVar.o.offset((rectF.centerX() + min) - f9, (aVar.h / 2.0f) + rectF.centerY());
            aVar.o.close();
            paint2.setColor(aVar.u);
            paint2.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void e(float f) {
        this.b.g = f;
        invalidateSelf();
    }

    public final void f(float f, float f2, float f3, float f4) {
        float f5 = this.d.getDisplayMetrics().density;
        float f6 = f2 * f5;
        a aVar = this.b;
        aVar.h = f6;
        aVar.b.setStrokeWidth(f6);
        aVar.q = f * f5;
        aVar.a(0);
        aVar.r = (int) (f3 * f5);
        aVar.s = (int) (f4 * f5);
    }

    public final void g(float f) {
        a aVar = this.b;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i2) {
        if (i2 == 0) {
            f(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            f(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.b.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.e.cancel();
        a aVar = this.b;
        float f = aVar.e;
        aVar.k = f;
        float f2 = aVar.f;
        aVar.l = f2;
        aVar.m = aVar.g;
        if (f2 != f) {
            this.g = true;
            this.e.setDuration(666L);
            this.e.start();
            return;
        }
        aVar.a(0);
        aVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e.setDuration(1332L);
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.cancel();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a aVar = this.b;
        if (aVar.n) {
            aVar.n = false;
        }
        aVar.a(0);
        aVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
    }
}
