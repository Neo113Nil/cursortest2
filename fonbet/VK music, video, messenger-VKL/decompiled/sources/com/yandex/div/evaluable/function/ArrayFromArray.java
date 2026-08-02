package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import org.json.JSONArray;
import xsna.s3q0;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayFromArray extends ArrayFunction {
    public ArrayFromArray() {
        super(EvaluableType.ARRAY);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        JSONArray jSONArray = evaluateArray instanceof JSONArray ? (JSONArray) evaluateArray : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), evaluateArray, isMethod());
        return s3q0.a;
    }
}
