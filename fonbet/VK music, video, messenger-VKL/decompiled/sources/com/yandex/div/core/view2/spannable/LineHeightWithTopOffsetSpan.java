package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import xsna.drm0;

/* compiled from: LineHeightWithTopOffsetSpan.kt */
/* loaded from: classes7.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {
    private boolean fontMetricsSaved;
    private final int lineHeight;
    private final int topOffset;
    private final int topOffsetEnd;
    private final int topOffsetStart;
    private int savedTop = Integer.MAX_VALUE;
    private int savedAscent = Integer.MAX_VALUE;
    private int savedDescent = Integer.MAX_VALUE;
    private int savedBottom = Integer.MAX_VALUE;

    public LineHeightWithTopOffsetSpan(int i, int i2, int i3, int i4) {
        this.topOffset = i;
        this.lineHeight = i2;
        this.topOffsetStart = i3;
        this.topOffsetEnd = i4;
    }

    private final void applyLineHeight(int i, Paint.FontMetricsInt fontMetricsInt) {
        if (i <= 0) {
            return;
        }
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        int i5 = fontMetricsInt.top - i3;
        int i6 = fontMetricsInt.bottom - i2;
        if (i4 >= 0) {
            int i7 = i - i4;
            if (i7 < 0) {
                int i8 = i3 - (i7 / 2);
                if (i8 > 0) {
                    i8 = 0;
                }
                fontMetricsInt.ascent = i8;
                int i9 = i8 + i;
                fontMetricsInt.descent = i9 >= 0 ? i9 : 0;
            } else {
                int i10 = (i7 / 2) + i2;
                if (i10 < 0) {
                    i10 = 0;
                }
                fontMetricsInt.descent = i10;
                int i11 = i10 - i;
                fontMetricsInt.ascent = i11 <= 0 ? i11 : 0;
            }
            fontMetricsInt.top = fontMetricsInt.ascent + i5;
            fontMetricsInt.bottom = fontMetricsInt.descent + i6;
        }
    }

    private final void applyTopOffset(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.topOffset;
        if (i <= 0) {
            return;
        }
        fontMetricsInt.top -= i;
        fontMetricsInt.ascent -= i;
    }

    private final void restoreFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.top = this.savedTop;
        fontMetricsInt.ascent = this.savedAscent;
        fontMetricsInt.descent = this.savedDescent;
        fontMetricsInt.bottom = this.savedBottom;
    }

    private final void saveFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.savedTop = fontMetricsInt.top;
        this.savedAscent = fontMetricsInt.ascent;
        this.savedDescent = fontMetricsInt.descent;
        this.savedBottom = fontMetricsInt.bottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i > spanned.getSpanEnd(this) || spanStart > i2) {
            return;
        }
        if (this.fontMetricsSaved) {
            restoreFontMetrics(fontMetricsInt);
        } else {
            this.fontMetricsSaved = true;
            saveFontMetrics(fontMetricsInt);
        }
        Object[] spans = spanned.getSpans(i, i2, LineHeightWithTopOffsetSpan.class);
        int i5 = this.lineHeight;
        for (Object obj : spans) {
            i5 = Math.max(i5, ((LineHeightWithTopOffsetSpan) obj).lineHeight);
        }
        applyLineHeight(i5, fontMetricsInt);
        int i6 = this.topOffsetStart;
        if (i6 == spanStart && i <= i6 && i6 <= i2) {
            applyTopOffset(fontMetricsInt);
        }
        if (drm0.D(charSequence.subSequence(i, i2).toString(), "\n", false)) {
            this.fontMetricsSaved = false;
        }
    }
}
