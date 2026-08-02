package xsna;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: RecoloredDrawable.java */
/* loaded from: classes17.dex */
public final class baf0 extends Drawable implements Drawable.Callback {
    public final Drawable b;
    public ColorStateList c;
    public int d;
    public int e;

    public baf0(Drawable drawable, ColorStateList colorStateList) {
        this.d = 255;
        this.e = 255;
        Drawable mutate = drawable.mutate();
        this.b = mutate;
        mutate.setCallback(this);
        this.c = colorStateList;
        onStateChange(new int[0]);
    }

    public final void a(int i) {
        this.c = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
        onStateChange(getState());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        this.b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        super.onStateChange(iArr);
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        Drawable drawable = this.b;
        drawable.setColorFilter(colorForState, mode);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 16842913) {
                z = true;
                break;
            }
            i++;
        }
        drawable.setState(iArr);
        drawable.setAlpha(z ? this.d : this.e);
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        this.e = i;
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public baf0(Drawable drawable, int i) {
        this(drawable, new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
    }

    public baf0() {
        this.d = 255;
        this.e = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
