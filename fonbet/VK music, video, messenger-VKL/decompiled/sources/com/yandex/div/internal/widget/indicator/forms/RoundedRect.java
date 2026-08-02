package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;

/* compiled from: RoundedRect.kt */
/* loaded from: classes7.dex */
public final class RoundedRect implements SingleIndicatorDrawer {
    private final Paint paint = new Paint(1);
    private final IndicatorParams$Style params;
    private final RectF rect;
    private final Paint strokePaint;

    public RoundedRect(IndicatorParams$Style indicatorParams$Style) {
        this.params = indicatorParams$Style;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.rect = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(Canvas canvas, float f, float f2, IndicatorParams$ItemSize indicatorParams$ItemSize, int i, float f3, int i2) {
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) indicatorParams$ItemSize;
        this.paint.setColor(i);
        RectF rectF = this.rect;
        rectF.left = f - (roundedRect.getItemWidth() / 2.0f);
        rectF.top = f2 - (roundedRect.getItemHeight() / 2.0f);
        rectF.right = (roundedRect.getItemWidth() / 2.0f) + f;
        float itemHeight = (roundedRect.getItemHeight() / 2.0f) + f2;
        rectF.bottom = itemHeight;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f4 = f3 / 2.0f;
            rectF.left += f4;
            rectF.top += f4;
            rectF.right -= f4;
            rectF.bottom = itemHeight - f4;
        }
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.paint);
        if (i2 == 0 || f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(i2);
        paint.setStrokeWidth(f3);
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.strokePaint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(Canvas canvas, RectF rectF) {
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) this.params.getActiveShape();
        IndicatorParams$ItemSize.RoundedRect itemSize = roundedRect.getItemSize();
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.paint);
        if (roundedRect.getStrokeColor() == 0 || roundedRect.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(roundedRect.getStrokeColor());
        paint.setStrokeWidth(roundedRect.getStrokeWidth());
        canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.strokePaint);
    }
}
