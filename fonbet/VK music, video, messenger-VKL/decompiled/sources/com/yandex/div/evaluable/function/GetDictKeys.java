package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictKeys extends GetKeysFromDict {
    public static final GetDictKeys INSTANCE = new GetDictKeys();
    private static final String name = "getDictKeys";

    private GetDictKeys() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
