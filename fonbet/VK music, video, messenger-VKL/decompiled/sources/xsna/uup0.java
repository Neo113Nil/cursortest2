package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: TypingDrawable.kt */
/* loaded from: classes2.dex */
public final class uup0 extends Drawable implements Animatable {
    public final int b = 3;
    public final Paint c;
    public int d;
    public final Rect e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final a l;
    public boolean m;
    public float n;

    /* compiled from: TypingDrawable.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            uup0 uup0Var = uup0.this;
            if (uup0Var.m) {
                uup0Var.n += 0.08f;
                uup0Var.invalidateSelf();
                uup0Var.scheduleSelf(uup0Var.l, SystemClock.uptimeMillis() + 16);
            }
        }
    }

    public uup0(int i) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = 255;
        this.e = new Rect();
        this.l = new a();
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
            int i3 = this.f;
            int i4 = (i3 * i) + i2;
            Rect rect = this.e;
            rect.left = i4;
            int i5 = bounds.top;
            rect.top = i5;
            rect.right = i4 + i3;
            rect.bottom = i5 + this.g;
            float f = 2;
            float sin = (((float) Math.sin(this.n + ((r2 - i) + 1))) + 1) / f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            float f2 = this.h;
            float f3 = (((this.i - f2) * sin) + f2) / f;
            float f4 = this.j;
            int i6 = (int) ((((this.k - f4) * sin) + f4) * (this.d / 255.0f) * 255);
            Paint paint = this.c;
            paint.setAlpha(i6);
            canvas.drawCircle(exactCenterX, exactCenterY, f3, paint);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d;
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
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.f = bounds.width() / this.b;
        int height = bounds.height();
        this.g = height;
        float min = Math.min(this.f, height);
        this.h = 0.44f * min;
        this.i = min * 0.66f;
        this.j = 0.4f;
        this.k = 1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
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
        if (this.m) {
            return;
        }
        this.m = true;
        scheduleSelf(this.l, SystemClock.uptimeMillis() + 16);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.m) {
            this.m = false;
            unscheduleSelf(this.l);
        }
    }
}
