package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictInteger extends Function {
    private final boolean isMethod;
    private final boolean isPure;
    private final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private final EvaluableType resultType = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        long longValue;
        Object evaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        if (evaluate instanceof Integer) {
            longValue = ((Number) evaluate).intValue();
        } else {
            if (!(evaluate instanceof Long)) {
                if (evaluate instanceof BigInteger) {
                    DictFunctionsKt.throwException(getName(), list, "Integer overflow.", isMethod());
                    throw new KotlinNothingValueException();
                }
                if (evaluate instanceof BigDecimal) {
                    DictFunctionsKt.throwException(getName(), list, "Cannot convert value to integer.", isMethod());
                    throw new KotlinNothingValueException();
                }
                if (!(evaluate instanceof Double)) {
                    DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), evaluate, isMethod());
                    throw new KotlinNothingValueException();
                }
                Number number = (Number) evaluate;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    DictFunctionsKt.throwException(getName(), list, "Integer overflow.", isMethod());
                    throw new KotlinNothingValueException();
                }
                long c = an10.c(number.doubleValue());
                if (number.doubleValue() - c == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    return Long.valueOf(c);
                }
                DictFunctionsKt.throwException(getName(), list, "Cannot convert value to integer.", isMethod());
                throw new KotlinNothingValueException();
            }
            longValue = ((Number) evaluate).longValue();
        }
        return Long.valueOf(longValue);
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
