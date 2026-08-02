package ru.ok.android.externcalls.sdk.api.interceptor;

import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;

/* compiled from: InterceptorUtils.kt */
/* loaded from: classes9.dex */
public final class InterceptorUtilsKt {
    public static final String getMethod(ApiRequest apiRequest) {
        if (apiRequest instanceof BatchApiRequest) {
            return null;
        }
        return ApiUris.parseMethod(apiRequest.getUri());
    }
}
