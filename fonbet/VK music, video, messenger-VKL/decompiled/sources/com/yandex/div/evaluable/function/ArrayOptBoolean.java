package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptBoolean extends ArrayOptFunction {
    public ArrayOptBoolean() {
        super(EvaluableType.BOOLEAN);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Boolean bool = evaluateSafe instanceof Boolean ? (Boolean) evaluateSafe : null;
        return bool == null ? list.get(2) : bool;
    }
}
