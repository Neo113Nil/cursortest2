package ru.ok.android.api.core;

import java.io.IOException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.session.ApiConfigStore;
import ru.ok.android.api.session.ApiSessionCallback;
import xsna.ozl;

/* compiled from: ApiClient.kt */
/* loaded from: classes9.dex */
public interface ApiClient {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ApiClient.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ApiClient create(ApiClientEngine apiClientEngine, ApiConfig apiConfig) {
            return create(apiClientEngine, ApiConfigStore.Companion.create(apiConfig), ApiSessionCallback.NOP);
        }

        public final ApiClient create(ApiClientEngine apiClientEngine, ApiConfigStore apiConfigStore) {
            return create(apiClientEngine, apiConfigStore, ApiSessionCallback.NOP);
        }

        public final ApiClient create(ApiClientEngine apiClientEngine, ApiConfig apiConfig, ApiSessionCallback apiSessionCallback) {
            return create(apiClientEngine, ApiConfigStore.Companion.create(apiConfig), apiSessionCallback);
        }

        public final ApiClient create(ApiClientEngine apiClientEngine, ApiConfigStore apiConfigStore, ApiSessionCallback apiSessionCallback) {
            return new ApiClientAdapter(apiClientEngine, apiConfigStore, apiSessionCallback);
        }
    }

    static ApiClient create(ApiClientEngine apiClientEngine, ApiConfig apiConfig) {
        return Companion.create(apiClientEngine, apiConfig);
    }

    <T> T execute(ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException;

    @ozl
    default <T, R extends ApiRequest & JsonParser<T>> T execute(R r) throws IOException, ApiException {
        return (T) execute((ApiExecutableRequest) ApiExecutableRequest.Companion.from(r, (JsonParser) r));
    }

    static ApiClient create(ApiClientEngine apiClientEngine, ApiConfig apiConfig, ApiSessionCallback apiSessionCallback) {
        return Companion.create(apiClientEngine, apiConfig, apiSessionCallback);
    }

    @ozl
    default <T> T execute(ApiRequest apiRequest, JsonParser<T> jsonParser) throws IOException, ApiException {
        return (T) execute((ApiExecutableRequest) ApiExecutableRequest.Companion.from(apiRequest, jsonParser));
    }

    static ApiClient create(ApiClientEngine apiClientEngine, ApiConfigStore apiConfigStore) {
        return Companion.create(apiClientEngine, apiConfigStore);
    }

    static ApiClient create(ApiClientEngine apiClientEngine, ApiConfigStore apiConfigStore, ApiSessionCallback apiSessionCallback) {
        return Companion.create(apiClientEngine, apiConfigStore, apiSessionCallback);
    }
}
