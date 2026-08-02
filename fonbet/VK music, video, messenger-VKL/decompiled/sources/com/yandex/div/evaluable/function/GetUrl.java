package com.yandex.div.evaluable.function;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public final class GetUrl extends UrlFromDict {
    public static final GetUrl INSTANCE = new GetUrl();
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    private GetUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.UrlFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
