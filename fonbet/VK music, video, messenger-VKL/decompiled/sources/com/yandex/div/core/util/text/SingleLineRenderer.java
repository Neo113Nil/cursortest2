package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ec;
import com.yandex.div2.zb;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes7.dex */
public final class SingleLineRenderer extends DivTextRangesBackgroundRenderer {
    private final ExpressionResolver resolver;
    private final View view;

    public SingleLineRenderer(View view, ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, ec ecVar, zb zbVar) {
        new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), ecVar, zbVar, canvas, this.resolver).drawBackground(Math.min(i3, i4), getLineTop(layout, i), Math.max(i3, i4), getLineBottom(layout, i));
    }
}
