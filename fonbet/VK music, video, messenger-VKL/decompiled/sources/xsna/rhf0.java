package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: RecordingDrawable.kt */
/* loaded from: classes2.dex */
public final class rhf0 extends Drawable implements Animatable {
    public final int b = 3;
    public final int c = iah0.a(3);
    public final Paint d;
    public int e;
    public final float f;
    public final RectF g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final a n;
    public boolean o;
    public float p;

    /* compiled from: RecordingDrawable.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            rhf0 rhf0Var = rhf0.this;
            if (rhf0Var.o) {
                rhf0Var.p += 0.15f;
                rhf0Var.invalidateSelf();
                rhf0Var.scheduleSelf(rhf0Var.n, SystemClock.uptimeMillis() + 16);
            }
        }
    }

    public rhf0(int i) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = 255;
        this.f = iah0.a(1.5f);
        this.g = new RectF();
        this.n = new a();
        paint.setColor(i);
        setAlpha(Color.alpha(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = 0;
        while (true) {
            if (i >= this.b) {
                return;
            }
            int i2 = bounds.left;
            int i3 = this.h;
            float f = ((this.c + i3) * i) + i2;
            RectF rectF = this.g;
            rectF.left = f;
            float f2 = bounds.top;
            rectF.top = f2;
            rectF.right = f + i3;
            rectF.bottom = f2 + this.i;
            float f3 = 2;
            float sin = (((float) Math.sin(this.p + ((r2 - i) + 1))) + 1) / f3;
            float height = rectF.height();
            float f4 = this.j;
            float b = u11.b(this.k, f4, sin, f4);
            float a2 = wq.a(height, b, f3, rectF.top);
            rectF.top = a2;
            rectF.bottom = a2 + b;
            float f5 = this.l;
            int i4 = (int) ((((this.m - f5) * sin) + f5) * (this.e / 255.0f) * 255);
            Paint paint = this.d;
            paint.setAlpha(i4);
            float f6 = this.f;
            canvas.drawRoundRect(rectF, f6, f6, paint);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.h = iah0.a(3);
        int height = bounds.height();
        this.i = height;
        float f = height;
        this.j = 0.45f * f;
        this.k = f * 1.0f;
        this.l = 0.4f;
        this.m = 1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.o) {
            return;
        }
        this.o = true;
        scheduleSelf(this.n, SystemClock.uptimeMillis() + 16);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.o) {
            this.o = false;
            unscheduleSelf(this.n);
        }
    }
}
