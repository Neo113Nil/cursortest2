package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: LetterSpacingSpanEm.android.kt */
/* loaded from: classes11.dex */
public final class k2z extends MetricAffectingSpan {
    public final float b;

    public k2z(float f) {
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.b);
    }
}
