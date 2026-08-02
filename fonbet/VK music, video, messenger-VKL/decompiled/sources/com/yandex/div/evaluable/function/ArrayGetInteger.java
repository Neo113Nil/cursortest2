package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetInteger extends ArrayInteger {
    public static final ArrayGetInteger INSTANCE = new ArrayGetInteger();
    private static final String name = "getInteger";
    private static final boolean isMethod = true;

    private ArrayGetInteger() {
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
