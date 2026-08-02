package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import xsna.s3q0;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayUrl extends ArrayFunction {
    public ArrayUrl() {
        super(EvaluableType.URL);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String safeConvertToUrl;
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        String str = evaluateArray instanceof String ? (String) evaluateArray : null;
        if (str != null && (safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m195boximpl(safeConvertToUrl);
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), evaluateArray, isMethod());
        return s3q0.a;
    }
}
