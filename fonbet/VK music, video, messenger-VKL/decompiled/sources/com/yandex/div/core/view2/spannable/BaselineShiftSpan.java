package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;

/* compiled from: BaselineShiftSpan.kt */
/* loaded from: classes7.dex */
public final class BaselineShiftSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int baselineShift;
    private final int lineHeight;

    public BaselineShiftSpan(int i, int i2) {
        this.baselineShift = i;
        this.lineHeight = i2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift -= this.baselineShift;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        if (this.lineHeight == 0) {
            textPaint.baselineShift -= this.baselineShift;
        }
    }
}
