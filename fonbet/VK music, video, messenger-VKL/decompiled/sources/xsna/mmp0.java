package xsna;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: TransitionFadeDrawable.java */
/* loaded from: classes7.dex */
public final class mmp0 extends Drawable implements Drawable.Callback {
    public final wik0<ColorFilter> c;

    @NonNull
    public final Drawable d;
    public final int e;
    public final ArgbEvaluator b = new ArgbEvaluator();
    public final int g = 255;
    public final int f = -1;

    public mmp0(@NonNull Drawable drawable, int i, @Nullable wik0 wik0Var) {
        this.d = drawable;
        this.e = i;
        this.c = wik0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i = this.g;
        wik0<ColorFilter> wik0Var = this.c;
        ColorFilter g = wik0Var.g(i);
        if (g == null) {
            g = new PorterDuffColorFilter(((Integer) this.b.evaluate(this.g / 255.0f, Integer.valueOf(this.e), Integer.valueOf(this.f))).intValue(), PorterDuff.Mode.SRC_IN);
            wik0Var.h(this.g, g);
        }
        Drawable drawable = this.d;
        drawable.setColorFilter(g);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.d.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
