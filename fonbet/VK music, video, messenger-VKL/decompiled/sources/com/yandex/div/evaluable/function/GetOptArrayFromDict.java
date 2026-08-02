package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.json.JSONArray;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetOptArrayFromDict extends Function {
    private static final boolean isPure = false;
    public static final GetOptArrayFromDict INSTANCE = new GetOptArrayFromDict();
    private static final String name = "getOptArrayFromDict";
    private static final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    private GetOptArrayFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        JSONArray jSONArray = new JSONArray();
        Object evaluateSafe = DictFunctionsKt.evaluateSafe(list, jSONArray, true);
        JSONArray jSONArray2 = evaluateSafe instanceof JSONArray ? (JSONArray) evaluateSafe : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
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
