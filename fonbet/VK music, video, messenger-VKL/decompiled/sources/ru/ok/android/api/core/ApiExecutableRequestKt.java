package ru.ok.android.api.core;

import kotlinx.serialization.KSerializer;
import ru.ok.android.api.json.JsonParser;

/* compiled from: ApiExecutableRequestKt.kt */
/* loaded from: classes9.dex */
public interface ApiExecutableRequestKt<T> extends ApiExecutableRequest<T> {
    @Override // ru.ok.android.api.core.ApiExecutableRequest
    default JsonParser<? extends T> getOkParser() {
        throw new IllegalStateException("For ApiExecutableRequestKt must use serializer property");
    }

    KSerializer<T> getSerializer();
}
