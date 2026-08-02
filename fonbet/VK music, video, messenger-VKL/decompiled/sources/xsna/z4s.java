package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: FontFeatureSpan.android.kt */
/* loaded from: classes11.dex */
public final class z4s extends MetricAffectingSpan {
    public final String b;

    public z4s(String str) {
        this.b = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.b);
    }
}
