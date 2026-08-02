package ru.ok.android.api.methods.batch.execute;

import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiUris;

/* compiled from: ApiRequestRecord.kt */
/* loaded from: classes9.dex */
public final class ApiRequestRecord<T> {
    public final String condition;
    public final Object handle;
    public final String method;
    public final ApiExecutableRequest<T> request;
    public final boolean skipOnError;

    public ApiRequestRecord(Object obj, ApiExecutableRequest<T> apiExecutableRequest, boolean z, String str) {
        this.handle = obj;
        this.request = apiExecutableRequest;
        this.skipOnError = z;
        this.condition = str;
        this.method = ApiUris.parseMethod(apiExecutableRequest.getUri());
    }
}
