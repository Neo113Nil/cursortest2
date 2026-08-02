package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CenterVerticalTextSpan.kt */
/* loaded from: classes17.dex */
public final class aqa extends MetricAffectingSpan {
    public static int a(TextPaint textPaint) {
        float ascent = textPaint.ascent() + textPaint.descent();
        float f = 2;
        float f2 = (textPaint.getFontMetrics().bottom + textPaint.getFontMetrics().top) / f;
        return (int) (((Math.abs(ascent / f) / f2) + f2) / 2.0f);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.baselineShift = a(textPaint) + textPaint.baselineShift;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift = a(textPaint) + textPaint.baselineShift;
    }
}
