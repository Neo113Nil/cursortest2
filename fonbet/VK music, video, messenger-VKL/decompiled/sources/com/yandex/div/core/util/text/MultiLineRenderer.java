package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ec;
import com.yandex.div2.zb;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes7.dex */
public final class MultiLineRenderer extends DivTextRangesBackgroundRenderer {
    private final ExpressionResolver resolver;
    private final View view;

    public MultiLineRenderer(View view, ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, ec ecVar, zb zbVar) {
        int paragraphDirection = layout.getParagraphDirection(i);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i) : layout.getLineRight(i);
        int lineBottom = getLineBottom(layout, i);
        int lineTop = getLineTop(layout, i);
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), ecVar, zbVar, canvas, this.resolver);
        backgroundDrawer.drawBackgroundStart(i3, lineTop, (int) lineLeft, lineBottom);
        for (int i5 = i + 1; i5 < i2; i5++) {
            backgroundDrawer.drawBackgroundMiddle((int) layout.getLineLeft(i5), getLineTop(layout, i5), (int) layout.getLineRight(i5), getLineBottom(layout, i5));
        }
        backgroundDrawer.drawBackgroundEnd((int) (paragraphDirection == -1 ? layout.getLineRight(i) : layout.getLineLeft(i)), getLineTop(layout, i2), i4, getLineBottom(layout, i2));
    }
}
