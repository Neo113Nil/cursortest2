package com.yandex.div.internal.spannable;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "", "start", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Lzy11;", "updateFontMetrics", "(ILandroid/graphics/Paint$FontMetricsInt;)V", "Landroid/graphics/Paint;", "paint", "", "text", "end", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "adjustSize", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    private final void updateFontMetrics(int start, Paint.FontMetricsInt fm) {
    }

    public abstract int adjustSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm);

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        updateFontMetrics(start, fm);
        return adjustSize(paint, text, start, end, fm);
    }
}
