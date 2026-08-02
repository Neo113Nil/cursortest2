package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptColorWithStringFallback extends ArrayOptFunction {
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptColorWithStringFallback() {
        super(EvaluableType.COLOR);
        this.declaredArgs = e43.l(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Color safeConvertToColor = ArrayFunctionsKt.safeConvertToColor(evaluateSafe instanceof String ? (String) evaluateSafe : null);
        if (safeConvertToColor != null) {
            return safeConvertToColor;
        }
        Color safeConvertToColor2 = ArrayFunctionsKt.safeConvertToColor((String) list.get(2));
        if (safeConvertToColor2 != null) {
            return safeConvertToColor2;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
