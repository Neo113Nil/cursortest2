package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.json.JSONArray;
import xsna.e43;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class GetOptArrayFromArray extends ArrayOptFunction {
    public static final GetOptArrayFromArray INSTANCE = new GetOptArrayFromArray();
    private static final String name = "getOptArrayFromArray";
    private static final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    private GetOptArrayFromArray() {
        super(EvaluableType.ARRAY);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        JSONArray jSONArray = evaluateSafe instanceof JSONArray ? (JSONArray) evaluateSafe : null;
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
