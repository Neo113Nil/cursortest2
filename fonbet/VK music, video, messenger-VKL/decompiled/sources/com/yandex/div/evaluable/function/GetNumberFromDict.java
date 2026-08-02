package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetNumberFromDict extends DictNumber {
    public static final GetNumberFromDict INSTANCE = new GetNumberFromDict();
    private static final String name = "getNumberFromDict";

    private GetNumberFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
