package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetOptDictFromDict extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetOptDictFromDict INSTANCE = new GetOptDictFromDict();
    private static final String name = "getOptDictFromDict";

    static {
        EvaluableType evaluableType = EvaluableType.DICT;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        resultType = evaluableType;
    }

    private GetOptDictFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        JSONObject jSONObject = new JSONObject();
        Object evaluateSafe = DictFunctionsKt.evaluateSafe(list, jSONObject, true);
        JSONObject jSONObject2 = evaluateSafe instanceof JSONObject ? (JSONObject) evaluateSafe : null;
        return jSONObject2 == null ? jSONObject : jSONObject2;
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
