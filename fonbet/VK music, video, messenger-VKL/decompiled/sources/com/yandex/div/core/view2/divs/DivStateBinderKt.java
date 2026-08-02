package com.yandex.div.core.view2.divs;

import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.VerticalTranslation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import xsna.swe0;
import xsna.vlp0;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes7.dex */
public final class DivStateBinderKt {

    /* compiled from: DivStateBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Float alphaValue(Double d) {
        if (d != null) {
            return Float.valueOf(swe0.f((float) d.doubleValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d) {
        if (d == null) {
            return null;
        }
        float doubleValue = (float) d.doubleValue();
        if (doubleValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            doubleValue = 0.0f;
        }
        return Float.valueOf(doubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vlp0 toTransition(DivAnimation divAnimation, boolean z, ExpressionResolver expressionResolver) {
        Float translateValue;
        Float translateValue2;
        Float scaleValue;
        Float alphaValue;
        Expression<DivAnimation.Name> expression = divAnimation.e;
        Expression<Double> expression2 = divAnimation.b;
        Expression<Double> expression3 = divAnimation.h;
        int i = WhenMappings.$EnumSwitchMapping$0[expression.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            if (z) {
                if (expression3 != null) {
                    translateValue = translateValue(Double.valueOf(expression3.evaluate(expressionResolver).doubleValue()));
                }
                translateValue = null;
            } else {
                if (expression2 != null) {
                    translateValue = translateValue(Double.valueOf(expression2.evaluate(expressionResolver).doubleValue()));
                }
                translateValue = null;
            }
            if (z) {
                translateValue2 = translateValue(expression2 != null ? expression2.evaluate(expressionResolver) : null);
            } else {
                translateValue2 = translateValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
            }
            return new VerticalTranslation(translateValue != null ? translateValue.floatValue() : -1.0f, translateValue2 != null ? translateValue2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i == 2) {
            if (z) {
                scaleValue = scaleValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
            } else {
                scaleValue = scaleValue(expression2 != null ? expression2.evaluate(expressionResolver) : null);
            }
            return new Scale(scaleValue != null ? scaleValue.floatValue() : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, null);
        }
        if (i == 3) {
            return null;
        }
        if (z) {
            alphaValue = alphaValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
        } else {
            alphaValue = alphaValue(expression2 != null ? expression2.evaluate(expressionResolver) : null);
        }
        Fade fade = new Fade(alphaValue != null ? alphaValue.floatValue() : 1.0f);
        fade.setMode(z ? 1 : 2);
        return fade;
    }

    private static final Float translateValue(Double d) {
        if (d != null) {
            return Float.valueOf(swe0.f((float) d.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
