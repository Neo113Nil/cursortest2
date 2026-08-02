package xsna;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: StandardLineHeightSpan.kt */
/* loaded from: classes6.dex */
public final class ipk0 implements LineHeightSpan {
    public final int b;

    public ipk0(int i) {
        this.b = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 <= 0) {
            return;
        }
        int i7 = this.b;
        int b = an10.b(i5 * (i7 / i6));
        fontMetricsInt.descent = b;
        fontMetricsInt.ascent = b - i7;
    }
}
