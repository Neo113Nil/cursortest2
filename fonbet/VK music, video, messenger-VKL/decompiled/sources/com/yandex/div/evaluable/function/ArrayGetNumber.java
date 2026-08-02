package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetNumber extends ArrayNumber {
    public static final ArrayGetNumber INSTANCE = new ArrayGetNumber();
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    private ArrayGetNumber() {
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
