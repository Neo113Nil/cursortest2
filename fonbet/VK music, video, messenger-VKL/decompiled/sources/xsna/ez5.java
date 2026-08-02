package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: BadgeSpan.java */
/* loaded from: classes7.dex */
public final class ez5 extends ReplacementSpan {
    public Paint b;
    public RectF c;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = this.b;
        paint2.setColor((Math.round(paint.getAlpha() * 0.16f) << 24) | (paint.getColor() & 16777215));
        RectF rectF = this.c;
        rectF.set(f, i3, Math.round(paint.measureText(charSequence, i, i2)) + f + iah0.a(12), i5);
        float f2 = 2;
        canvas.drawRoundRect(rectF, iah0.a(f2), iah0.a(f2), paint2);
        canvas.drawText(charSequence, i, i2, f + iah0.a(6), i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return iah0.a(12) + Math.round(paint.measureText(charSequence, i, i2));
    }
}
