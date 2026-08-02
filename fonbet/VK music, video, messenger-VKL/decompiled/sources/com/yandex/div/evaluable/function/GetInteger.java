package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetInteger extends DictInteger {
    public static final GetInteger INSTANCE = new GetInteger();
    private static final String name = "getInteger";
    private static final boolean isMethod = true;

    private GetInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictInteger
    public boolean isMethod() {
        return isMethod;
    }
}
