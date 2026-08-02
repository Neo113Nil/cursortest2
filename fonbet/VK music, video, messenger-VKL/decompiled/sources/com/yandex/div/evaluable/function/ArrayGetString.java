package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetString extends ArrayString {
    public static final ArrayGetString INSTANCE = new ArrayGetString();
    private static final String name = "getString";
    private static final boolean isMethod = true;

    private ArrayGetString() {
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
