package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class StringSubstring extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final StringSubstring INSTANCE = new StringSubstring();
    private static final String name = "substring";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        FunctionArgument functionArgument = new FunctionArgument(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.INTEGER;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType2, false, 2, null), new FunctionArgument(evaluableType2, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private StringSubstring() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        long longValue2 = ((Long) list.get(2)).longValue();
        if (longValue < 0 || longValue2 > str.length()) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Indexes are out of bounds.", null, 8, null);
            throw new KotlinNothingValueException();
        }
        if (longValue <= longValue2) {
            return str.substring((int) longValue, (int) longValue2);
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Indexes should be in ascending order.", null, 8, null);
        throw new KotlinNothingValueException();
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
