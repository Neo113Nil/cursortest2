package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class ArrayGetUrl extends ArrayUrl {
    public static final ArrayGetUrl INSTANCE = new ArrayGetUrl();
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    private ArrayGetUrl() {
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
