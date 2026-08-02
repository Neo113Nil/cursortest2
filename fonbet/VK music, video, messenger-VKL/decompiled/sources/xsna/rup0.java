package xsna;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: TypefaceSpan.android.kt */
/* loaded from: classes11.dex */
public final class rup0 extends MetricAffectingSpan {
    public final Typeface b;

    public rup0(Typeface typeface) {
        this.b = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.b);
    }
}
