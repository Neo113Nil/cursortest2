package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetString extends DictString {
    public static final GetString INSTANCE = new GetString();
    private static final String name = "getString";
    private static final boolean isMethod = true;

    private GetString() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictString
    public boolean isMethod() {
        return isMethod;
    }
}
