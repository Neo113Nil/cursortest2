package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.widget.slider.SliderTextStyle;

/* compiled from: TextDrawDelegate.kt */
/* loaded from: classes7.dex */
public final class TextDrawDelegate {
    private float halfTextHeight;
    private float halfTextWidth;
    private String text;
    private final Paint textPaint;
    private final Rect textRect = new Rect();
    private final SliderTextStyle textStyle;

    public TextDrawDelegate(SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        Paint paint = new Paint(1);
        paint.setTextSize(sliderTextStyle.getFontSize());
        paint.setLetterSpacing(sliderTextStyle.getSpacing());
        paint.setColor(sliderTextStyle.getTextColor());
        paint.setTypeface(sliderTextStyle.getFontWeight());
        paint.setStyle(Paint.Style.FILL);
        if (TextViewExtensionsKt.getSupportFontVariations()) {
            paint.setFontVariationSettings(sliderTextStyle.getFontVariations());
        }
        this.textPaint = paint;
    }

    public final void draw(Canvas canvas, float f, float f2) {
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, this.textStyle.getOffsetX() + (f - this.halfTextWidth), this.textStyle.getOffsetY() + f2 + this.halfTextHeight, this.textPaint);
        }
    }

    public final void setText(String str) {
        this.text = str;
        this.textPaint.getTextBounds(str, 0, str != null ? str.length() : 0, this.textRect);
        this.halfTextWidth = this.textPaint.measureText(this.text) / 2.0f;
        this.halfTextHeight = this.textRect.height() / 2.0f;
    }
}
