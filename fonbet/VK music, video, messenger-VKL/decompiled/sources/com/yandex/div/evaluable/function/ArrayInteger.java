package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.s3q0;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        if (evaluateArray instanceof Integer) {
            return Long.valueOf(((Number) evaluateArray).intValue());
        }
        if (evaluateArray instanceof Long) {
            return evaluateArray;
        }
        if (evaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (evaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (!(evaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), evaluateArray, isMethod());
            return s3q0.a;
        }
        Number number = (Number) evaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        long c = an10.c(number.doubleValue());
        if (number.doubleValue() - c == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return Long.valueOf(c);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
        throw new KotlinNothingValueException();
    }
}
