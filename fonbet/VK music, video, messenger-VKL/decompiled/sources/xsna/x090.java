package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.text.style.UpdateAppearance;

/* compiled from: OutlinedSpan.kt */
/* loaded from: classes2.dex */
public final class x090 extends ReplacementSpan implements UpdateAppearance {
    public final int b;
    public final int c;
    public final float d;

    public x090(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        float abs = Math.abs(paint.getFontMetrics().ascent);
        paint.setColor(this.c);
        float f2 = this.d;
        float f3 = i3 + abs;
        canvas.drawText(charSequence, i, i2, f + (-f2), f3 - f2, paint);
        canvas.drawText(charSequence, i, i2, f + f2, f3 - f2, paint);
        canvas.drawText(charSequence, i, i2, f + f2, f3 + f2, paint);
        canvas.drawText(charSequence, i, i2, f + (-f2), f3 + f2, paint);
        paint.setColor(this.b);
        canvas.drawText(charSequence, i, i2, f, f3, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return an10.b(paint.measureText(charSequence, i, i2));
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setAntiAlias(true);
        }
    }
}
