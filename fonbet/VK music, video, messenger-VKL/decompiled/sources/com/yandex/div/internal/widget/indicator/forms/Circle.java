package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;

/* compiled from: Circle.kt */
/* loaded from: classes7.dex */
public final class Circle implements SingleIndicatorDrawer {
    private final IndicatorParams$Style params;
    private final Paint paint = new Paint();
    private final RectF rect = new RectF();

    public Circle(IndicatorParams$Style indicatorParams$Style) {
        this.params = indicatorParams$Style;
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(Canvas canvas, float f, float f2, IndicatorParams$ItemSize indicatorParams$ItemSize, int i, float f3, int i2) {
        IndicatorParams$ItemSize.Circle circle = (IndicatorParams$ItemSize.Circle) indicatorParams$ItemSize;
        this.paint.setColor(i);
        RectF rectF = this.rect;
        rectF.left = f - circle.getRadius();
        rectF.top = f2 - circle.getRadius();
        rectF.right = circle.getRadius() + f;
        rectF.bottom = circle.getRadius() + f2;
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(Canvas canvas, RectF rectF) {
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.paint);
    }
}
