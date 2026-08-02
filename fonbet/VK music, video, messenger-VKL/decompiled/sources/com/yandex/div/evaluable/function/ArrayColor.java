package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import xsna.s3q0;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayColor extends ArrayFunction {
    public ArrayColor() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object failure;
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        if (evaluateArray instanceof Color) {
            return evaluateArray;
        }
        if (!(evaluateArray instanceof String)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), evaluateArray, isMethod());
            return s3q0.a;
        }
        try {
            failure = Color.m184boximpl(Color.Companion.m194parseC4zCDoM((String) evaluateArray));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
        throw new KotlinNothingValueException();
    }
}
