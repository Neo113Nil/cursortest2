package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictInteger extends DictInteger {
    public static final GetDictInteger INSTANCE = new GetDictInteger();
    private static final String name = "getDictInteger";

    private GetDictInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
