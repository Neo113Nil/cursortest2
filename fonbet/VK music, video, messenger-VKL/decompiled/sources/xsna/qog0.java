package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: RoundedColorDrawable.java */
/* loaded from: classes.dex */
public class qog0 extends Drawable implements jog0 {
    public final float[] b;
    public final float[] c;
    public float[] d;
    public final Paint e;
    public boolean f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public final Path l;
    public final Path m;
    public int n;
    public final RectF o;
    public int p;

    public qog0(int i) {
        this.b = new float[8];
        this.c = new float[8];
        this.e = new Paint(1);
        this.f = false;
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.l = new Path();
        this.m = new Path();
        this.n = 0;
        this.o = new RectF();
        this.p = 255;
        if (this.n != i) {
            this.n = i;
            invalidateSelf();
        }
    }

    @Override // xsna.jog0
    public final void a(float f, int i) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
        if (this.g != f) {
            this.g = f;
            b();
            invalidateSelf();
        }
    }

    public final void b() {
        float[] fArr;
        float[] fArr2;
        Path path = this.l;
        path.reset();
        Path path2 = this.m;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.o;
        rectF.set(bounds);
        float f = this.g;
        rectF.inset(f / 2.0f, f / 2.0f);
        boolean z = this.f;
        int i = 0;
        float[] fArr3 = this.b;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.c;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (fArr3[i2] + this.h) - (this.g / 2.0f);
                i2++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = this.g;
        rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.h + (this.j ? this.g : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        rectF.inset(f3, f3);
        if (this.f) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else if (this.j) {
            if (this.d == null) {
                this.d = new float[8];
            }
            while (true) {
                fArr2 = this.d;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = fArr3[i] - this.g;
                i++;
            }
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int b = sko.b(this.n, this.p);
        Paint paint = this.e;
        paint.setColor(b);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.k);
        canvas.drawPath(this.l, paint);
        if (this.g != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            paint.setColor(sko.b(this.i, this.p));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.g);
            canvas.drawPath(this.m, paint);
        }
    }

    @Override // xsna.jog0
    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidateSelf();
        }
    }

    @Override // xsna.jog0
    public final void f(boolean z) {
        this.f = z;
        b();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void g(float f) {
        if (this.h != f) {
            this.h = f;
            b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int b = sko.b(this.n, this.p) >>> 24;
        if (b != 0) {
            return b != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // xsna.jog0
    public final void i(float[] fArr) {
        float[] fArr2 = this.b;
        if (fArr == null) {
            Arrays.fill(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            sex0.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        b();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void j(float f) {
        sex0.b("radius should be non negative", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.b, f);
        b();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void n(boolean z) {
        if (this.j != z) {
            this.j = z;
            b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    public qog0(float f, int i) {
        this(i);
        j(f);
    }

    @Override // xsna.jog0
    public final void k() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
