package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import defpackage.evu0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJA\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/spannable/LineHeightWithTopOffsetSpan;", "Landroid/text/style/LineHeightSpan;", "", "topOffset", "lineHeight", "topOffsetStart", "topOffsetEnd", "<init>", "(IIII)V", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Lzy11;", "applyLineHeight", "(ILandroid/graphics/Paint$FontMetricsInt;)V", "applyTopOffset", "(Landroid/graphics/Paint$FontMetricsInt;)V", "saveFontMetrics", "restoreFontMetrics", "", "text", "start", "end", "spanstartv", "lh", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", CA20Status.STATUS_USER_I, "", "fontMetricsSaved", "Z", "savedTop", "savedAscent", "savedDescent", "savedBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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

    private final void applyLineHeight(int lineHeight, Paint.FontMetricsInt fm) {
        if (lineHeight <= 0) {
            return;
        }
        int i = fm.descent;
        int i2 = fm.ascent;
        int i3 = i - i2;
        int i4 = fm.top - i2;
        int i5 = fm.bottom - i;
        if (i3 >= 0) {
            int i6 = lineHeight - i3;
            if (i6 < 0) {
                int i7 = i2 - (i6 / 2);
                if (i7 > 0) {
                    i7 = 0;
                }
                fm.ascent = i7;
                int i8 = i7 + lineHeight;
                fm.descent = i8 >= 0 ? i8 : 0;
            } else {
                int i9 = (i6 / 2) + i;
                if (i9 < 0) {
                    i9 = 0;
                }
                fm.descent = i9;
                int i10 = i9 - lineHeight;
                fm.ascent = i10 <= 0 ? i10 : 0;
            }
            fm.top = fm.ascent + i4;
            fm.bottom = fm.descent + i5;
        }
    }

    private final void applyTopOffset(Paint.FontMetricsInt fm) {
        int i = this.topOffset;
        if (i <= 0) {
            return;
        }
        fm.top -= i;
        fm.ascent -= i;
    }

    private final void restoreFontMetrics(Paint.FontMetricsInt fm) {
        fm.top = this.savedTop;
        fm.ascent = this.savedAscent;
        fm.descent = this.savedDescent;
        fm.bottom = this.savedBottom;
    }

    private final void saveFontMetrics(Paint.FontMetricsInt fm) {
        this.savedTop = fm.top;
        this.savedAscent = fm.ascent;
        this.savedDescent = fm.descent;
        this.savedBottom = fm.bottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lh, Paint.FontMetricsInt fm) {
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (start > spanned.getSpanEnd(this) || spanStart > end) {
            return;
        }
        if (this.fontMetricsSaved) {
            restoreFontMetrics(fm);
        } else {
            this.fontMetricsSaved = true;
            saveFontMetrics(fm);
        }
        Object[] spans = spanned.getSpans(start, end, LineHeightWithTopOffsetSpan.class);
        int i = this.lineHeight;
        for (Object obj : spans) {
            i = Math.max(i, ((LineHeightWithTopOffsetSpan) obj).lineHeight);
        }
        applyLineHeight(i, fm);
        int i2 = this.topOffsetStart;
        if (i2 == spanStart && start <= i2 && i2 <= end) {
            applyTopOffset(fm);
        }
        if (evu0.y(text.subSequence(start, end).toString(), "\n", false)) {
            this.fontMetricsSaved = false;
        }
    }
}
