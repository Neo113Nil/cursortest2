package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.rff;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes7.dex */
public abstract class GetStoredComplexValue<T> extends Function {
    private final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private final boolean isPure;

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object a = ((rff) evaluationContext.getStoredValueProvider()).a((String) list.get(0));
        if (a != null) {
            return a;
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Missing value.", null, 8, null);
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
