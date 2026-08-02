package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictValues extends GetValuesFromDict {
    public static final GetDictValues INSTANCE = new GetDictValues();
    private static final String name = "getDictValues";

    private GetDictValues() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
