package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptUrlWithStringFallback extends ArrayOptFunction {
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptUrlWithStringFallback() {
        super(EvaluableType.URL);
        this.declaredArgs = e43.l(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        String safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(evaluateSafe instanceof String ? (String) evaluateSafe : null);
        if (safeConvertToUrl != null) {
            return Url.m195boximpl(safeConvertToUrl);
        }
        String safeConvertToUrl2 = ArrayFunctionsKt.safeConvertToUrl((String) list.get(2));
        if (safeConvertToUrl2 != null) {
            return Url.m195boximpl(safeConvertToUrl2);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Unable to convert value to Url.", false, 8, null);
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
