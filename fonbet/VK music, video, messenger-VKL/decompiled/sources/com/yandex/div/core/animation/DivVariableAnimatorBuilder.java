package com.yandex.div.core.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.b3;
import com.yandex.div2.g;
import com.yandex.div2.s2;
import com.yandex.div2.w0;
import com.yandex.div2.z6;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hkn;
import xsna.ho8;
import xsna.kqn;

/* compiled from: DivVariableAnimatorBuilder.kt */
/* loaded from: classes7.dex */
public final class DivVariableAnimatorBuilder {
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    private final Animator buildColorAnimator(Div2View div2View, s2 s2Var, g gVar, ExpressionResolver expressionResolver) {
        Integer colorIntValue;
        Integer colorIntValue2;
        String str = s2Var.k;
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Integer num = null;
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(str) : null;
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(ho8.a(new StringBuilder("Unable to find color variable with name '"), s2Var.k, '\''), null, 2, null));
            return null;
        }
        kqn kqnVar = gVar.h;
        if (kqnVar == null || (colorIntValue2 = DivActionTypedUtilsKt.colorIntValue(kqnVar, expressionResolver)) == null) {
            Expression<Integer> expression = s2Var.j;
            if (expression != null) {
                num = expression.evaluate(expressionResolver);
            }
        } else {
            num = colorIntValue2;
        }
        kqn kqnVar2 = gVar.d;
        int intValue = (kqnVar2 == null || (colorIntValue = DivActionTypedUtilsKt.colorIntValue(kqnVar2, expressionResolver)) == null) ? s2Var.e.evaluate(expressionResolver).intValue() : colorIntValue.intValue();
        if (num != null) {
            colorVariable.setValueDirectly(Color.m184boximpl(Color.m185constructorimpl(num.intValue())));
        }
        return configure(ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, intValue), div2View, s2Var, gVar, expressionResolver);
    }

    private final Animator buildDoubleAnimator(Div2View div2View, z6 z6Var, g gVar, ExpressionResolver expressionResolver, Variable.DoubleVariable doubleVariable) {
        Double evaluate;
        Double doubleValue;
        kqn kqnVar = gVar.h;
        if (kqnVar == null || (evaluate = DivActionTypedUtilsKt.doubleValue(kqnVar, expressionResolver)) == null) {
            Expression<Double> expression = z6Var.j;
            evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        kqn kqnVar2 = gVar.d;
        double doubleValue2 = (kqnVar2 == null || (doubleValue = DivActionTypedUtilsKt.doubleValue(kqnVar2, expressionResolver)) == null) ? z6Var.e.evaluate(expressionResolver).doubleValue() : doubleValue.doubleValue();
        if (evaluate != null) {
            doubleVariable.setValueDirectly(evaluate);
        }
        return configure(ObjectAnimator.ofFloat(doubleVariable, NumberValueProperty.INSTANCE, (float) doubleValue2), div2View, z6Var, gVar, expressionResolver);
    }

    private final Animator buildIntegerAnimator(Div2View div2View, z6 z6Var, g gVar, ExpressionResolver expressionResolver, Variable.IntegerVariable integerVariable) {
        Object evaluate;
        Number evaluate2;
        kqn kqnVar = gVar.h;
        if (kqnVar == null || (evaluate = DivActionTypedUtilsKt.longValue(kqnVar, expressionResolver)) == null) {
            Expression<Double> expression = z6Var.j;
            evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        kqn kqnVar2 = gVar.d;
        if (kqnVar2 == null || (evaluate2 = DivActionTypedUtilsKt.longValue(kqnVar2, expressionResolver)) == null) {
            evaluate2 = z6Var.e.evaluate(expressionResolver);
        }
        if (evaluate != null) {
            integerVariable.setValueDirectly(evaluate);
        }
        return configure(ObjectAnimator.ofInt(integerVariable, IntegerValueProperty.INSTANCE, evaluate2.intValue()), div2View, z6Var, gVar, expressionResolver);
    }

    private final Animator buildNumberAnimator(Div2View div2View, z6 z6Var, g gVar, ExpressionResolver expressionResolver) {
        String str = z6Var.k;
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Object mutableVariable = variableController != null ? variableController.getMutableVariable(str) : null;
        if (mutableVariable == null) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(div2View, z6Var, gVar, expressionResolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(div2View, z6Var, gVar, expressionResolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(ho8.a(new StringBuilder("Unable to find number variable with name '"), z6Var.k, '\''), null, 2, null));
        return null;
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, hkn hknVar, g gVar, final ExpressionResolver expressionResolver) {
        DivAnimationDirection evaluate;
        DivAnimationInterpolator evaluate2;
        int i;
        Expression<DivAnimationDirection> expression = gVar.b;
        if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
            evaluate = hknVar.b().evaluate(expressionResolver);
        }
        Expression<Long> expression2 = gVar.c;
        if (expression2 == null) {
            expression2 = hknVar.getDuration();
        }
        objectAnimator.setDuration(expression2.evaluate(expressionResolver).longValue());
        Expression<Long> expression3 = gVar.g;
        if (expression3 == null) {
            expression3 = hknVar.g();
        }
        objectAnimator.setStartDelay(expression3.evaluate(expressionResolver).longValue());
        Expression<DivAnimationInterpolator> expression4 = gVar.e;
        if (expression4 == null || (evaluate2 = expression4.evaluate(expressionResolver)) == null) {
            evaluate2 = hknVar.e().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(evaluate2, DivUtilKt.isReversed(evaluate)));
        b3 b3Var = gVar.f;
        if (b3Var == null) {
            b3Var = hknVar.d();
        }
        if (b3Var instanceof b3.a) {
            i = ((int) ((b3.a) b3Var).b.a.evaluate(expressionResolver).longValue()) - 1;
            if (i < 0) {
                i = 0;
            }
        } else {
            if (!(b3Var instanceof b3.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        objectAnimator.setRepeatCount(i);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(evaluate) ? 2 : 1);
        final List<DivAction> f = hknVar.f();
        if (f != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_end", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        final List<DivAction> c = hknVar.c();
        if (c != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_cancel", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        return objectAnimator;
    }

    public final Animator build(Div2View div2View, w0 w0Var, g gVar, ExpressionResolver expressionResolver) {
        if (w0Var instanceof w0.b) {
            return buildNumberAnimator(div2View, ((w0.b) w0Var).b, gVar, expressionResolver);
        }
        if (w0Var instanceof w0.a) {
            return buildColorAnimator(div2View, ((w0.a) w0Var).b, gVar, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
