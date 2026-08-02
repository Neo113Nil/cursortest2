package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class GetArrayNumber extends ArrayNumber {
    public static final GetArrayNumber INSTANCE = new GetArrayNumber();
    private static final String name = "getArrayNumber";

    private GetArrayNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
