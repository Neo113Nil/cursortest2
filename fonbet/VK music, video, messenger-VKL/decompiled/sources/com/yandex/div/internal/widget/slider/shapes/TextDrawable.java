package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;

/* compiled from: TextDrawable.kt */
/* loaded from: classes7.dex */
public final class TextDrawable extends Drawable {
    private final RectF rect = new RectF();
    private TextDrawDelegate textDrawDelegate;
    private final SliderTextStyle textStyle;

    public TextDrawable(SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        this.textDrawDelegate = new TextDrawDelegate(sliderTextStyle);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.rect.set(getBounds());
        this.textDrawDelegate.draw(canvas, this.rect.centerX(), this.rect.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (Math.abs(this.textStyle.getOffsetY()) + this.textStyle.getFontSize());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (Math.abs(this.textStyle.getOffsetX()) + this.rect.width());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public final void setText(String str) {
        this.textDrawDelegate.setText(str);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
