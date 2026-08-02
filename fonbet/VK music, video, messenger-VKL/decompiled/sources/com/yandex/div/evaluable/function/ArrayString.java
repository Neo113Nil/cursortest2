package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import xsna.s3q0;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayString extends ArrayFunction {
    public ArrayString() {
        super(EvaluableType.STRING);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        String str = evaluateArray instanceof String ? (String) evaluateArray : null;
        if (str != null) {
            return str;
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), evaluateArray, isMethod());
        return s3q0.a;
    }
}
