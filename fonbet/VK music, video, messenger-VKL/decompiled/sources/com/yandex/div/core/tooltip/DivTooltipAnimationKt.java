package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivTooltipAnimation.kt */
/* loaded from: classes7.dex */
public final class DivTooltipAnimationKt {

    /* compiled from: DivTooltipAnimation.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void clearAnimation(PopupWindow popupWindow) {
        removeTransition(popupWindow);
    }

    private static final TransitionSet defaultTransition(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation(divTooltip.j.evaluate(expressionResolver), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    private static final void removeTransition(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    public static final void setupAnimation(PopupWindow popupWindow, DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        DivAnimation divAnimation = divTooltip.a;
        Expression<DivTooltip.Position> expression = divTooltip.j;
        popupWindow.setEnterTransition(divAnimation != null ? toTransition(divAnimation, expression.evaluate(expressionResolver), true, expressionResolver) : defaultTransition(divTooltip, expressionResolver));
        DivAnimation divAnimation2 = divTooltip.b;
        popupWindow.setExitTransition(divAnimation2 != null ? toTransition(divAnimation2, expression.evaluate(expressionResolver), false, expressionResolver) : defaultTransition(divTooltip, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    private static final Transition toTransition(DivAnimation divAnimation, DivTooltip.Position position, boolean z, ExpressionResolver expressionResolver) {
        ?? fade;
        Transition duration;
        Expression<DivAnimation.Name> expression = divAnimation.e;
        Expression<Double> expression2 = divAnimation.b;
        Expression<Double> expression3 = divAnimation.h;
        switch (WhenMappings.$EnumSwitchMapping$0[expression.evaluate(expressionResolver).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                if (z) {
                    expression2 = expression3;
                }
                fade = new TranslateAnimation(position, expression2 != null ? Float.valueOf((float) expression2.evaluate(expressionResolver).doubleValue()) : null);
                break;
            case 3:
                if (z) {
                    expression2 = expression3;
                }
                fade = new Scale(expression2 != null ? (float) expression2.evaluate(expressionResolver).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List<DivAnimation> list = divAnimation.d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(toTransition((DivAnimation) it.next(), position, z, expressionResolver));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (fade == 0 || (duration = fade.setDuration(divAnimation.a.evaluate(expressionResolver).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation.c.evaluate(expressionResolver)));
    }
}
