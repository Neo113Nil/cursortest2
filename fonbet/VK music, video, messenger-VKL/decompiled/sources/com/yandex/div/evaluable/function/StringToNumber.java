package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.j5g;

/* compiled from: ToNumber.kt */
/* loaded from: classes7.dex */
public final class StringToNumber extends Function {
    public static final StringToNumber INSTANCE = new StringToNumber();
    private static final String name = "toNumber";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.NUMBER;
    private static final boolean isPure = true;

    private StringToNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        List<? extends Object> list2;
        NumberFormatException numberFormatException;
        try {
            double parseDouble = Double.parseDouble((String) j5g.Y(list));
            if (parseDouble != Double.POSITIVE_INFINITY && parseDouble != Double.NEGATIVE_INFINITY) {
                try {
                    return Double.valueOf(parseDouble);
                } catch (NumberFormatException e) {
                    numberFormatException = e;
                    list2 = list;
                    EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list2, "Unable to convert value to Number.", numberFormatException);
                    throw new KotlinNothingValueException();
                }
            }
            list2 = list;
            try {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list2, "Unable to convert value to Number.", null, 8, null);
                throw new KotlinNothingValueException();
            } catch (NumberFormatException e2) {
                e = e2;
                numberFormatException = e;
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list2, "Unable to convert value to Number.", numberFormatException);
                throw new KotlinNothingValueException();
            }
        } catch (NumberFormatException e3) {
            e = e3;
            list2 = list;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
