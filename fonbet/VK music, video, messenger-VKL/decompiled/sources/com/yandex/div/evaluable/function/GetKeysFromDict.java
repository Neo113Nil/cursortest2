package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class GetKeysFromDict extends Function {
    private final boolean isPure;
    private final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.DICT, false, 2, null));
    private final EvaluableType resultType = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        JSONObject jSONObject = (JSONObject) list.get(0);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            jSONArray.put(keys.next());
        }
        return jSONArray;
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
