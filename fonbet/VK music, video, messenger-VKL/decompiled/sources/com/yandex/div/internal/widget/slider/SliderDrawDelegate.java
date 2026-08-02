package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;

/* compiled from: SliderDrawDelegate.kt */
/* loaded from: classes7.dex */
public final class SliderDrawDelegate {
    private int viewportHeight;
    private int viewportWidth;

    private final int calculateBottom(Drawable drawable) {
        return (drawable.getIntrinsicHeight() / 2) + getCenterY();
    }

    private final int calculateTop(Drawable drawable) {
        return getCenterY() - (drawable.getIntrinsicHeight() / 2);
    }

    private final int getCenterY() {
        return this.viewportHeight / 2;
    }

    public final void drawInactiveTrack(Canvas canvas, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, calculateTop(drawable), this.viewportWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawOnPosition(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i - intrinsicWidth, calculateTop(drawable), i + intrinsicWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawThumb(Canvas canvas, int i, Drawable drawable, int i2, TextDrawable textDrawable) {
        drawOnPosition(canvas, drawable, i);
        if (textDrawable != null) {
            textDrawable.setText(String.valueOf(i2));
            drawOnPosition(canvas, textDrawable, i);
        }
    }

    public final void drawTrackPart(Canvas canvas, Drawable drawable, int i, int i2) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, calculateTop(drawable), i2, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        this.viewportWidth = i;
        this.viewportHeight = i2;
    }
}
