package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.j5g;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ColorStringComponentGetter extends Function {
    private final ColorComponentGetter componentGetter;
    private final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private final EvaluableType resultType = EvaluableType.NUMBER;
    private final boolean isPure = true;

    public ColorStringComponentGetter(ColorComponentGetter colorComponentGetter) {
        this.componentGetter = colorComponentGetter;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        try {
            return this.componentGetter.m143invokeex6DHhM(evaluationContext, evaluable, Collections.singletonList(Color.m184boximpl(Color.Companion.m194parseC4zCDoM((String) j5g.Y(list)))));
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
