package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetBooleanFromDict extends BooleanFromDict {
    public static final GetBooleanFromDict INSTANCE = new GetBooleanFromDict();
    private static final String name = "getBooleanFromDict";

    private GetBooleanFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
