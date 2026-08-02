package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ColorStringComponentSetter extends Function {
    private final ColorComponentSetter componentSetter;
    private final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
    private final EvaluableType resultType = EvaluableType.COLOR;
    private final boolean isPure = true;

    public ColorStringComponentSetter(ColorComponentSetter colorComponentSetter) {
        this.componentSetter = colorComponentSetter;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        try {
            return this.componentSetter.m143invokeex6DHhM(evaluationContext, evaluable, e43.l(Color.m184boximpl(Color.Companion.m194parseC4zCDoM((String) list.get(0))), list.get(1)));
        } catch (IllegalArgumentException e) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
