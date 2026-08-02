package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetBoolean extends ArrayBoolean {
    public static final ArrayGetBoolean INSTANCE = new ArrayGetBoolean();
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    private ArrayGetBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }
}
