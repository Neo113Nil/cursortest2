package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: AnimationProgressDrawable.kt */
/* loaded from: classes17.dex */
public final class cq2 extends c2e0 implements Drawable.Callback {
    public final AnimationDrawable c;
    public final Resources d;
    public int e;

    public cq2(Context context, AnimationDrawable animationDrawable) {
        this.c = animationDrawable;
        Resources resources = context.getResources();
        this.d = resources;
        this.e = (int) (4 * resources.getDisplayMetrics().density);
        animationDrawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // xsna.c2e0
    public final void e(float f) {
        this.c.selectDrawable(an10.b(Math.abs(f) * (r0.getNumberOfFrames() - 1)));
    }

    @Override // xsna.c2e0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    @Override // xsna.c2e0
    public final void h(int i) {
        int i2 = (int) ((i == 0 ? 8 : 4) * this.d.getDisplayMetrics().density);
        this.e = i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        Rect rect = new Rect(bounds);
        rect.inset(i2, i2);
        this.c.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (drawable != this.c || (callback = getCallback()) == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = this.e;
        Rect rect2 = new Rect(rect);
        rect2.inset(i, i);
        this.c.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (drawable != this.c || (callback = getCallback()) == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c.stop();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (drawable != this.c || (callback = getCallback()) == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Override // xsna.c2e0
    public final void b(boolean z) {
    }

    @Override // xsna.c2e0
    public final void c(float f) {
    }

    @Override // xsna.c2e0
    public final void f(float f) {
    }

    @Override // xsna.c2e0
    public final void g(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
