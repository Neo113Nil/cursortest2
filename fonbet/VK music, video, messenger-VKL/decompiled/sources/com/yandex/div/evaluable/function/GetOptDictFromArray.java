package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class GetOptDictFromArray extends ArrayFunction {
    public static final GetOptDictFromArray INSTANCE = new GetOptDictFromArray();
    private static final String name = "getOptDictFromArray";
    private static final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    private GetOptDictFromArray() {
        super(EvaluableType.DICT);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluateArray$default = ArrayFunctionsKt.evaluateArray$default(getName(), list, false, 4, null);
        JSONObject jSONObject = evaluateArray$default instanceof JSONObject ? (JSONObject) evaluateArray$default : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
