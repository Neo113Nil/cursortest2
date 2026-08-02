package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div2.DivTextAlignmentVertical;

/* loaded from: classes11.dex */
public abstract class phl {
    public final TextPaint a = new TextPaint();

    public abstract void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, DivBackgroundSpan divBackgroundSpan);

    public final ohl b(Layout layout, int i, DivBackgroundSpan divBackgroundSpan, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int lineBaseline = layout.getLineBaseline(i);
        int lineAscent = layout.getLineAscent(i);
        int lineDescent = layout.getLineDescent(i);
        if (divBackgroundSpan.getFontSize() != null) {
            float intValue = divBackgroundSpan.getFontSize().intValue();
            TextPaint textPaint = this.a;
            textPaint.setTextSize(intValue);
            textPaint.setTypeface(divBackgroundSpan.getTypeface());
            textPaint.setFontFeatureSettings(divBackgroundSpan.getFontFeatureSettings());
            textPaint.setFontVariationSettings(divBackgroundSpan.getFontVariationSettings());
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            i3 = fontMetricsInt.ascent;
            i2 = fontMetricsInt.descent;
        } else {
            i2 = lineDescent;
            i3 = lineAscent;
        }
        if (divBackgroundSpan.getLineHeight() != null) {
            int intValue2 = divBackgroundSpan.getLineHeight().intValue() - (i2 - i3);
            int i7 = intValue2 / 2;
            int i8 = intValue2 - i7;
            i5 = i3 - i7;
            i4 = i8 + i2;
        } else {
            i4 = i2;
            i5 = i3;
        }
        if (divBackgroundSpan.getBaselineOffset() != 0) {
            i6 = -divBackgroundSpan.getBaselineOffset();
        } else {
            if (divBackgroundSpan.getAlignmentVertical() != DivTextAlignmentVertical.TOP) {
                if (divBackgroundSpan.getAlignmentVertical() == DivTextAlignmentVertical.CENTER) {
                    lineAscent = (lineAscent + lineDescent) / 2;
                    i3 = (i3 + i2) / 2;
                } else {
                    i6 = divBackgroundSpan.getAlignmentVertical() == DivTextAlignmentVertical.BOTTOM ? lineDescent - i2 : 0;
                }
            }
            i6 = lineAscent - i3;
        }
        if (z) {
            Integer topOffset = divBackgroundSpan.getTopOffset();
            r5 = -(topOffset != null ? topOffset.intValue() : 0);
        }
        return new ohl(x4e.D(lineBaseline, i5, i6, r5), lineBaseline + i4 + i6);
    }
}
