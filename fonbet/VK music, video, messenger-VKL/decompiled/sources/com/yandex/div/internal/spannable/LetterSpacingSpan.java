package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: LetterSpacingSpan.kt */
/* loaded from: classes7.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpan(float f) {
        this.letterSpacing = f;
    }

    private final void apply(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
