package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/spannable/LineMetricsSpan;", "Landroid/text/style/LineBackgroundSpan;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "left", "right", "top", "baseline", "bottom", "", "text", "start", "end", "lineNumber", "Lzy11;", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;III)V", "linePaint", "Landroid/graphics/Paint;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LineMetricsSpan implements LineBackgroundSpan {
    private final Paint linePaint;

    public LineMetricsSpan() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(0.0f);
        this.linePaint = paint;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int left, int right, int top, int baseline, int bottom, CharSequence text, int start, int end, int lineNumber) {
        this.linePaint.setColor(-16764855);
        float f = top;
        float f2 = left;
        float f3 = right;
        canvas.drawLine(f2, f, f3, f, this.linePaint);
        this.linePaint.setColor(-557312);
        this.linePaint.setPathEffect(new DashPathEffect(new float[]{8.0f, 4.0f, 1.0f, 4.0f}, 0.0f));
        float f4 = ((bottom - top) / 2.0f) + f;
        canvas.drawLine(f2, f4, f3, f4, this.linePaint);
        this.linePaint.setColor(-2742232);
        this.linePaint.setPathEffect(null);
        float f5 = baseline - 1;
        canvas.drawLine(f2, f5, f3, f5, this.linePaint);
        this.linePaint.setColor(-213175);
        float f6 = bottom - 1;
        canvas.drawLine(f2, f6, f3, f6, this.linePaint);
    }
}
