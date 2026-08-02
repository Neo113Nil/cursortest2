package com.yandex.div.internal.spannable;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PositionAwareReplacementSpan.kt */
/* loaded from: classes7.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    public abstract int adjustSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt);

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        updateFontMetrics(i, fontMetricsInt);
        return adjustSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    private final void updateFontMetrics(int i, Paint.FontMetricsInt fontMetricsInt) {
    }
}
