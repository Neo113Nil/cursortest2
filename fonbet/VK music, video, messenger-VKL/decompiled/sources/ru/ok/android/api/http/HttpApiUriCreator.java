package ru.ok.android.api.http;

import android.net.Uri;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiConfigProvider;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiRequestException;

/* compiled from: HttpApiUriCreator.kt */
/* loaded from: classes9.dex */
public interface HttpApiUriCreator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: HttpApiUriCreator.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final HttpApiUriCreator create(HttpApiUriEngine httpApiUriEngine, ApiConfig apiConfig) {
            return create(httpApiUriEngine, ApiConfigProvider.Companion.wrap(apiConfig));
        }

        public final HttpApiUriCreator create(HttpApiUriEngine httpApiUriEngine, ApiConfigProvider apiConfigProvider) {
            return new HttpApiUriAdapter(httpApiUriEngine, apiConfigProvider);
        }
    }

    static HttpApiUriCreator create(HttpApiUriEngine httpApiUriEngine, ApiConfig apiConfig) {
        return Companion.create(httpApiUriEngine, apiConfig);
    }

    Uri createRequestUri(ApiRequest apiRequest) throws ApiRequestException;

    default String createRequestUrl(ApiRequest apiRequest) throws ApiRequestException {
        return createRequestUri(apiRequest).toString();
    }

    static HttpApiUriCreator create(HttpApiUriEngine httpApiUriEngine, ApiConfigProvider apiConfigProvider) {
        return Companion.create(httpApiUriEngine, apiConfigProvider);
    }
}
