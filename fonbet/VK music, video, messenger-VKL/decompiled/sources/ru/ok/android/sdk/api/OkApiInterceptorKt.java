package ru.ok.android.sdk.api;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiExecutableRequest;

/* compiled from: OkApiInterceptor.kt */
/* loaded from: classes9.dex */
public final class OkApiInterceptorKt {
    public static final <T> T executeWithInterceptors(ApiClientEngine apiClientEngine, ApiExecutableRequest<T> apiExecutableRequest, ApiConfig apiConfig, List<? extends OkApiInterceptor> list) {
        RealChain realChain = new RealChain(apiClientEngine, new OkApiRequest(apiExecutableRequest, apiConfig), list, 0, 8, null);
        return (T) realChain.proceed(realChain.request()).getResponse();
    }

    public static Object executeWithInterceptors$default(ApiClientEngine apiClientEngine, ApiExecutableRequest apiExecutableRequest, ApiConfig apiConfig, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = EmptyList.b;
        }
        return executeWithInterceptors(apiClientEngine, apiExecutableRequest, apiConfig, list);
    }
}
