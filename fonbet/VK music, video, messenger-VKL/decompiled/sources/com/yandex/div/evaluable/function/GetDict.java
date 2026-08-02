package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDict extends DictFromDict {
    public static final GetDict INSTANCE = new GetDict();
    private static final String name = "getDict";
    private static final boolean isMethod = true;

    private GetDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
