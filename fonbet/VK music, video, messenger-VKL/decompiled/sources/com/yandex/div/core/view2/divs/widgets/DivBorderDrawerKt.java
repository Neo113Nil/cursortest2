package com.yandex.div.core.view2.divs.widgets;

import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.va;

/* compiled from: DivBorderDrawer.kt */
/* loaded from: classes7.dex */
public final class DivBorderDrawerKt {

    /* compiled from: DivBorderDrawer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float widthPx(va vaVar, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        Expression<Double> expression;
        Expression<DivSizeUnit> expression2;
        DivSizeUnit evaluate = (vaVar == null || (expression2 = vaVar.c) == null) ? null : expression2.evaluate(expressionResolver);
        int i = evaluate == null ? -1 : WhenMappings.$EnumSwitchMapping$0[evaluate.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? (vaVar == null || (expression = vaVar.d) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) expression.evaluate(expressionResolver).doubleValue() : (float) vaVar.d.evaluate(expressionResolver).doubleValue() : BaseDivViewExtensionsKt.spToPxF(vaVar.d.evaluate(expressionResolver), displayMetrics) : BaseDivViewExtensionsKt.dpToPxF(vaVar.d.evaluate(expressionResolver), displayMetrics);
    }
}
