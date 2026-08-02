package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.json.JSONObject;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes7.dex */
public final class GetStoredDictValue extends GetStoredComplexValue<JSONObject> {
    public static final GetStoredDictValue INSTANCE = new GetStoredDictValue();
    private static final String name = "getStoredDictValue";
    private static final EvaluableType resultType = EvaluableType.DICT;

    private GetStoredDictValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }
}
