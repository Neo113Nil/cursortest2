package xsna;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: TypefaceSpan.kt */
/* loaded from: classes6.dex */
public final class qup0 extends MetricAffectingSpan {
    public final Integer b;
    public final Typeface c;

    public qup0(Typeface typeface) {
        this.c = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.c;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Integer num = this.b;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.c;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Integer num = this.b;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public qup0(Typeface typeface, int i) {
        this(typeface);
        this.b = Integer.valueOf(i);
    }
}
