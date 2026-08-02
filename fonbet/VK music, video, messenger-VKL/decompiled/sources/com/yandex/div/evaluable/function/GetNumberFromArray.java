package com.yandex.div.evaluable.function;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public final class GetNumberFromArray extends ArrayNumber {
    public static final GetNumberFromArray INSTANCE = new GetNumberFromArray();
    private static final String name = "getNumberFromArray";

    private GetNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
