package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetArray extends ArrayFromDict {
    public static final GetArray INSTANCE = new GetArray();
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    private GetArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
