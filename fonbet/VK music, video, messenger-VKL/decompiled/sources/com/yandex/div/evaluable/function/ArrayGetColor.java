package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetColor extends ArrayColor {
    public static final ArrayGetColor INSTANCE = new ArrayGetColor();
    private static final String name = "getColor";
    private static final boolean isMethod = true;

    private ArrayGetColor() {
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
