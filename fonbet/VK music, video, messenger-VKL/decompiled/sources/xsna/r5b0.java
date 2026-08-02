package xsna;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;

/* compiled from: PlayingDrawable.java */
/* loaded from: classes17.dex */
public final class r5b0 extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final Canvas i;
    public final Paint j;
    public final RectF k;
    public final Random l;
    public final Paint m;
    public final float[] n;
    public final float[] o;
    public final TimeInterpolator[] p;
    public final DecelerateInterpolator q;
    public final AccelerateInterpolator r;
    public final float[] s;
    public long t = 0;
    public boolean u;

    /* compiled from: PlayingDrawable.java */
    public static class a {

        @NonNull
        public final Context a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public float[] j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

        public a(@NonNull Context context) {
            this.a = context;
            this.b = qq2.d(context);
        }
    }

    /* compiled from: PlayingDrawable.java */
    public static final class b extends a {
        public final a a(int i) {
            this.c = this.a.getResources().getInteger(i);
            return this;
        }

        public final a b(int i) {
            this.g = this.a.getResources().getDimensionPixelSize(i);
            return this;
        }

        public final a c(int i) {
            this.i = this.a.getColor(i);
            return this;
        }

        public final a d(int i) {
            this.h = this.a.getResources().getDimensionPixelSize(i);
            return this;
        }

        public final a e(int i) {
            this.e = this.a.getResources().getDimensionPixelSize(i);
            return this;
        }

        public final a f(int i) {
            this.f = this.a.getResources().getDimensionPixelSize(i);
            return this;
        }

        public final a g(int i) {
            this.d = this.a.getResources().getDimensionPixelSize(i);
            return this;
        }
    }

    public r5b0(a aVar) {
        int i = aVar.c;
        this.a = i;
        int i2 = aVar.d;
        this.b = i2;
        int i3 = aVar.e;
        this.c = i3;
        int i4 = aVar.f;
        this.e = aVar.b;
        this.s = aVar.j;
        if (i4 > i3) {
            throw new IllegalArgumentException(efz.a(i4, i3, "rectMinHeight = ", " must not be greater than rectHeight = "));
        }
        int i5 = aVar.g;
        this.d = i5;
        this.f = aVar.h;
        int i6 = ((i2 + i5) * i) - i5;
        this.g = i6;
        this.h = i3;
        Bitmap d = kd7.d(i6, i3);
        this.i = new Canvas(d);
        this.k = new RectF();
        this.l = new Random();
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setColor(aVar.i);
        Paint paint2 = new Paint(1);
        this.m = paint2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(d, tileMode, tileMode));
        this.n = new float[i];
        this.o = new float[i];
        this.p = new TimeInterpolator[i];
        this.q = new DecelerateInterpolator();
        this.r = new AccelerateInterpolator();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        RectF rectF;
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        Rect bounds = getBounds();
        int width = bounds.width();
        int i = this.g;
        int height = bounds.height();
        int i2 = this.h;
        canvas.translate((width - i) / 2, (height - i2) / 2);
        long j = currentTimeMillis - this.t;
        TimeInterpolator[] timeInterpolatorArr = this.p;
        int i3 = this.a;
        int i4 = this.c;
        float[] fArr = this.o;
        float[] fArr2 = this.n;
        int i5 = 0;
        if (j > 240) {
            this.t = currentTimeMillis;
            for (int i6 = 0; i6 < i3; i6++) {
                fArr2[i6] = fArr[i6];
                if (this.u) {
                    fArr[i6] = (float) (Math.cbrt(this.l.nextInt(1000000)) / 100.0d);
                } else {
                    float[] fArr3 = this.s;
                    fArr[i6] = fArr3[i6 % fArr3.length] / i4;
                }
                timeInterpolatorArr[i6] = fArr[i6] > fArr2[i6] ? this.r : this.q;
            }
        }
        float f = (currentTimeMillis - this.t) / 240.0f;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        Canvas canvas2 = this.i;
        canvas2.drawColor(0, mode);
        while (true) {
            rectF = this.k;
            if (i5 >= i3) {
                break;
            }
            float f2 = fArr2[i5];
            int round = Math.round(((timeInterpolatorArr[i5].getInterpolation(f) * (fArr[i5] - f2)) + f2) * i4);
            int i7 = this.b;
            int max = Math.max(round, i7);
            float f3 = (this.d + i7) * i5;
            float f4 = f;
            rectF.set(f3, i4 - max, i7 + f3, i4);
            int i8 = this.f;
            canvas2.drawRoundRect(rectF, i8, i8, this.j);
            i5++;
            f = f4;
        }
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        canvas.drawRect(rectF, this.m);
        canvas.restore();
        if (this.u) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = this.u;
        this.u = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 16843518) {
                this.u = !this.e;
                break;
            }
            i++;
        }
        invalidateSelf();
        return z == this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
    }
}
