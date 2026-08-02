package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetNumber extends DictNumber {
    public static final GetNumber INSTANCE = new GetNumber();
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    private GetNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictNumber
    public boolean isMethod() {
        return isMethod;
    }
}
