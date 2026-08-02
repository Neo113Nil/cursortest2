package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: SkewXSpan.android.kt */
/* loaded from: classes11.dex */
public final class ezj0 extends MetricAffectingSpan {
    public final float b;

    public ezj0(float f) {
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.b);
    }
}
