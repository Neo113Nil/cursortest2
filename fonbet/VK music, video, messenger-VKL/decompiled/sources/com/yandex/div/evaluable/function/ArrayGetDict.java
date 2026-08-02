package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetDict extends ArrayDict {
    public static final ArrayGetDict INSTANCE = new ArrayGetDict();
    private static final String name = "getDict";
    private static final boolean isMethod = true;

    private ArrayGetDict() {
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
