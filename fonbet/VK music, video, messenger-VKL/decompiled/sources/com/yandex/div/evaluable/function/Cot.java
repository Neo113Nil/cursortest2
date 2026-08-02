package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import xsna.j5g;

/* compiled from: TrigonometricFunctions.kt */
/* loaded from: classes7.dex */
public final class Cot extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final Cot INSTANCE = new Cot();
    private static final String name = "cot";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private Cot() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateMathResult;
        double doubleValue = ((Double) j5g.Y(list)).doubleValue();
        evaluateMathResult = TrigonometricFunctionsKt.evaluateMathResult(Math.cos(doubleValue) / Math.sin(doubleValue), getName(), doubleValue);
        return evaluateMathResult;
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
