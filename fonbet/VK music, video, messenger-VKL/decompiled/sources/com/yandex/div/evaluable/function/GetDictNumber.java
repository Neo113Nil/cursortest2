package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictNumber extends DictNumber {
    public static final GetDictNumber INSTANCE = new GetDictNumber();
    private static final String name = "getDictNumber";

    private GetDictNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
