package ru.ok.android.api.http;

import android.net.Uri;
import ru.ok.android.api.core.ApiConfigProvider;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiRequestException;

/* compiled from: HttpApiUriAdapter.kt */
/* loaded from: classes9.dex */
public final class HttpApiUriAdapter implements HttpApiUriCreator {
    private final ApiConfigProvider configProvider;
    private final HttpApiUriEngine engine;

    public HttpApiUriAdapter(HttpApiUriEngine httpApiUriEngine, ApiConfigProvider apiConfigProvider) {
        this.engine = httpApiUriEngine;
        this.configProvider = apiConfigProvider;
    }

    @Override // ru.ok.android.api.http.HttpApiUriCreator
    public Uri createRequestUri(ApiRequest apiRequest) throws ApiRequestException {
        return HttpApiUriEngine.createRequestUri$default(this.engine, apiRequest, this.configProvider.getApiConfig(), null, 4, null);
    }

    @Override // ru.ok.android.api.http.HttpApiUriCreator
    public String createRequestUrl(ApiRequest apiRequest) throws ApiRequestException {
        return HttpApiUriEngine.createRequestUrl$default(this.engine, apiRequest, this.configProvider.getApiConfig(), null, 4, null);
    }
}
