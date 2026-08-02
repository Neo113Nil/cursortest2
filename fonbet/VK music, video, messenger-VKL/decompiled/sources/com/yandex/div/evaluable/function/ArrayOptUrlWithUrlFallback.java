package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Url;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptUrlWithUrlFallback extends ArrayOptFunction {
    public ArrayOptUrlWithUrlFallback() {
        super(EvaluableType.URL);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        String safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(evaluateSafe instanceof String ? (String) evaluateSafe : null);
        return safeConvertToUrl != null ? Url.m195boximpl(safeConvertToUrl) : list.get(2);
    }
}
