package com.yandex.div.core.util.text;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ec;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes7.dex */
public final class DivTextRangesBackgroundRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(ec ecVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression = ecVar.a;
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
        return new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx};
    }
}
