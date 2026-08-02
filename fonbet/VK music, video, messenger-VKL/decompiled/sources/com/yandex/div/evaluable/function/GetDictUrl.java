package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDictUrl extends UrlFromDict {
    public static final GetDictUrl INSTANCE = new GetDictUrl();
    private static final String name = "getDictUrl";

    private GetDictUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
