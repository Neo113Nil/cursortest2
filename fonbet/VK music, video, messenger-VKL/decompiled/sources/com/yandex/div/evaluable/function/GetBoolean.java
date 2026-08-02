package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetBoolean extends BooleanFromDict {
    public static final GetBoolean INSTANCE = new GetBoolean();
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    private GetBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.BooleanFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
