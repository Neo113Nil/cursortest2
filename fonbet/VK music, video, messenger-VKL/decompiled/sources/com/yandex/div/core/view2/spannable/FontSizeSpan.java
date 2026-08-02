package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;

/* compiled from: FontSizeSpan.kt */
/* loaded from: classes7.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int fontSize;
    private final int lineHeight;

    public FontSizeSpan(int i, int i2) {
        this.fontSize = i;
        this.lineHeight = i2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(this.fontSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        int i = this.lineHeight;
        if (i == 0) {
            textPaint.setTextSize(this.fontSize);
        } else if (i >= textPaint.getTextSize()) {
            textPaint.setTextScaleX(this.fontSize / textPaint.getTextSize());
        } else {
            textPaint.setTextScaleX(this.fontSize / this.lineHeight);
            textPaint.setTextSize(this.lineHeight);
        }
    }
}
