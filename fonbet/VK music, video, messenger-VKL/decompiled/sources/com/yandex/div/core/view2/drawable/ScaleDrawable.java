package com.yandex.div.core.view2.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import xsna.an10;

/* compiled from: ScaleDrawable.kt */
/* loaded from: classes7.dex */
public final class ScaleDrawable extends Drawable implements Animatable {
    private final Drawable child;
    private final float scaleX;
    private final float scaleY;

    public ScaleDrawable(Drawable drawable, float f, float f2) {
        this.child = drawable;
        this.scaleX = f;
        this.scaleY = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.scale(this.scaleX, this.scaleY);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.child.getIntrinsicHeight() == -1) {
            return -1;
        }
        return an10.b(this.child.getIntrinsicHeight() * this.scaleY);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.child.getIntrinsicWidth() == -1) {
            return -1;
        }
        return an10.b(this.child.getIntrinsicWidth() * this.scaleX);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.child.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.child.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    public ScaleDrawable(Drawable drawable, float f) {
        this(drawable, f, f);
    }
}
