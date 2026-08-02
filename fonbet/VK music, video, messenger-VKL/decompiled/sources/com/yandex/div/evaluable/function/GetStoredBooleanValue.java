package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;
import xsna.rff;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes7.dex */
public final class GetStoredBooleanValue extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetStoredBooleanValue INSTANCE = new GetStoredBooleanValue();
    private static final String name = "getStoredBooleanValue";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.STRING, false, 2, null);
        EvaluableType evaluableType = EvaluableType.BOOLEAN;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    private GetStoredBooleanValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        Boolean bool = (Boolean) list.get(1);
        bool.booleanValue();
        Object a = ((rff) evaluationContext.getStoredValueProvider()).a(str);
        Boolean bool2 = a instanceof Boolean ? (Boolean) a : null;
        return bool2 == null ? bool : bool2;
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
