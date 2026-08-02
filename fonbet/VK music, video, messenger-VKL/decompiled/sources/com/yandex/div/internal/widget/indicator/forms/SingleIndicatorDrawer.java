package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;

/* compiled from: SingleIndicatorDrawer.kt */
/* loaded from: classes7.dex */
public interface SingleIndicatorDrawer {
    void draw(Canvas canvas, float f, float f2, IndicatorParams$ItemSize indicatorParams$ItemSize, int i, float f3, int i2);

    void drawSelected(Canvas canvas, RectF rectF);
}
