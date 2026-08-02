package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptString extends ArrayOptFunction {
    public ArrayOptString() {
        super(EvaluableType.STRING);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        String str = evaluateSafe instanceof String ? (String) evaluateSafe : null;
        return str == null ? list.get(2) : str;
    }
}
