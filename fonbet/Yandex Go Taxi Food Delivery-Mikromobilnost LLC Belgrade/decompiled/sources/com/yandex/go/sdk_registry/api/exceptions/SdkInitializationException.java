package com.yandex.go.sdk_registry.api.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/sdk_registry/api/exceptions/SdkInitializationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lvnp0;", "tag", "Ljava/lang/String;", "getTag-xBVwNPo", "()Ljava/lang/String;", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkInitializationException extends RuntimeException {
    private final String tag;

    public SdkInitializationException(String str, Throwable th) {
        super("SDK component failed to initialize: ".concat(str), th);
        this.tag = str;
    }
}
