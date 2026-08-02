package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ImageSpan;

/* compiled from: CenteredImageSpan.kt */
/* loaded from: classes18.dex */
public final class cqa extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int save = canvas.save();
        canvas.translate(f, (((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4) - (getDrawable().getBounds().height() / 2.0f));
        try {
            getDrawable().draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return getDrawable().getBounds().width();
    }
}
