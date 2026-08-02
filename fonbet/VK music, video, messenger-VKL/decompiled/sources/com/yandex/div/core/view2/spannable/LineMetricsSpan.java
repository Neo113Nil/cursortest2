package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LineMetricsSpan.kt */
/* loaded from: classes7.dex */
public final class LineMetricsSpan implements LineBackgroundSpan {
    private final Paint linePaint;

    public LineMetricsSpan() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.linePaint = paint;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        this.linePaint.setColor(-16764855);
        float f = i3;
        float f2 = i;
        float f3 = i2;
        canvas.drawLine(f2, f, f3, f, this.linePaint);
        this.linePaint.setColor(-557312);
        this.linePaint.setPathEffect(new DashPathEffect(new float[]{8.0f, 4.0f, 1.0f, 4.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float f4 = ((i5 - i3) / 2.0f) + f;
        canvas.drawLine(f2, f4, f3, f4, this.linePaint);
        this.linePaint.setColor(-2742232);
        this.linePaint.setPathEffect(null);
        float f5 = i4 - 1;
        canvas.drawLine(f2, f5, f3, f5, this.linePaint);
        this.linePaint.setColor(-213175);
        float f6 = i5 - 1;
        canvas.drawLine(f2, f6, f3, f6, this.linePaint);
    }
}
