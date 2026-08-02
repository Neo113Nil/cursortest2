package xsna;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: LineHeightSpan.android.kt */
/* loaded from: classes11.dex */
public final class s7z implements LineHeightSpan {
    public final float b;

    public s7z(float f) {
        this.b = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.b));
    }
}
