package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictString extends DictString {
    public static final GetDictString INSTANCE = new GetDictString();
    private static final String name = "getDictString";

    private GetDictString() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
