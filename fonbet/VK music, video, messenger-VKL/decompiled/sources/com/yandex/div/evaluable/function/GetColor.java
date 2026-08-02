package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetColor extends ColorFromDict {
    public static final GetColor INSTANCE = new GetColor();
    private static final String name = "getColor";
    private static final boolean isMethod = true;

    private GetColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ColorFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
