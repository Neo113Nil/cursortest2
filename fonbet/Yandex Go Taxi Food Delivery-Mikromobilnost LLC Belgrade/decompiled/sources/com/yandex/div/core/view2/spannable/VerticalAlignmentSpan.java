package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import defpackage.m810;
import defpackage.ta31;
import defpackage.yvf0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/spannable/VerticalAlignmentSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "fontSize", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "alignment", "Lyvf0;", "Landroid/text/Layout;", "layoutProvider", "<init>", "(ILcom/yandex/div/core/view2/spannable/TextVerticalAlignment;Lyvf0;)V", "Landroid/text/TextPaint;", "paint", "Lzy11;", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", CA20Status.STATUS_USER_I, "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "Lyvf0;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalAlignmentSpan extends MetricAffectingSpan {
    private final TextVerticalAlignment alignment;
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();
    private final int fontSize;
    private final yvf0 layoutProvider;

    public VerticalAlignmentSpan(int i, TextVerticalAlignment textVerticalAlignment, yvf0 yvf0Var) {
        this.fontSize = i;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = yvf0Var;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Layout layout = (Layout) this.layoutProvider.get();
        if (layout == null) {
            return;
        }
        CharSequence text = layout.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (spanStart < 0 || spanEnd < 0 || spanStart >= spanEnd) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        int lineBaseline = layout.getLineBaseline(lineForOffset);
        int i = lineTop - lineBaseline;
        int b = (lineBottom - lineBaseline) - (lineForOffset == layout.getLineCount() - 1 ? 0 : m810.b(layout.getSpacingAdd()));
        int i2 = this.fontSize;
        if (i2 > 0) {
            paint.setTextSize(i2);
        }
        paint.getFontMetricsInt(this.fontMetrics);
        int i3 = ta31.a[this.alignment.ordinal()];
        if (i3 == 1) {
            paint.baselineShift = (i - this.fontMetrics.ascent) + paint.baselineShift;
            return;
        }
        if (i3 == 2) {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            paint.baselineShift = (((i + b) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2)) + paint.baselineShift;
        } else {
            if (i3 != 4) {
                return;
            }
            paint.baselineShift = (b - this.fontMetrics.descent) + paint.baselineShift;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        updateDrawState(paint);
    }
}
