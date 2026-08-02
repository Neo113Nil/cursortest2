package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Result;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayOptColorWithColorFallback extends ArrayOptFunction {
    public ArrayOptColorWithColorFallback() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object failure;
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Color color = evaluateSafe instanceof Color ? (Color) evaluateSafe : null;
        if (color != null) {
            return color;
        }
        String str = evaluateSafe instanceof String ? (String) evaluateSafe : null;
        if (str != null) {
            try {
                failure = Color.m184boximpl(Color.Companion.m194parseC4zCDoM(str));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r0 = (Color) (failure instanceof Result.Failure ? null : failure);
        }
        return r0 == null ? list.get(2) : r0;
    }
}
