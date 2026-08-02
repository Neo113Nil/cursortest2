package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: BaselineShiftSpan.android.kt */
/* loaded from: classes11.dex */
public final class ft6 extends MetricAffectingSpan {
    public final float b;

    public ft6(float f) {
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.b);
    }
}
