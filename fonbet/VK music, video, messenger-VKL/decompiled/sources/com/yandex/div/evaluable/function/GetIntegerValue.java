package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;

/* compiled from: VariableFunctions.kt */
/* loaded from: classes7.dex */
public final class GetIntegerValue extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetIntegerValue INSTANCE = new GetIntegerValue();
    private static final String name = "getIntegerValue";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.STRING, false, 2, null);
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    private GetIntegerValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        Long l = (Long) list.get(1);
        l.longValue();
        Object obj = evaluationContext.getVariableProvider().get(str);
        Long l2 = obj instanceof Long ? (Long) obj : null;
        return l2 == null ? l : l2;
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
