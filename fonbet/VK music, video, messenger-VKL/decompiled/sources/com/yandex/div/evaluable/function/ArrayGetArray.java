package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetArray extends ArrayFromArray {
    public static final ArrayGetArray INSTANCE = new ArrayGetArray();
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    private ArrayGetArray() {
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
