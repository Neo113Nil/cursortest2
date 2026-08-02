package ru.ok.android.api.core;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.ozl;

/* compiled from: ApiExecutableRequest.kt */
@ozl
/* loaded from: classes9.dex */
public interface ApiExecutableRequest<T> extends ApiRequest {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ApiExecutableRequest.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T> ApiExecutableRequest<T> from(ApiRequest apiRequest, JsonParser<? extends T> jsonParser) {
            return new ApiExecutableRequestAdapter(apiRequest, jsonParser, null, 4, null);
        }

        public final <T> ApiExecutableRequest<T> from(ApiRequest apiRequest, JsonParser<? extends T> jsonParser, JsonParser<? extends ApiInvocationException> jsonParser2) {
            return new ApiExecutableRequestAdapter(apiRequest, jsonParser, jsonParser2);
        }
    }

    static <T> ApiExecutableRequest<T> from(ApiRequest apiRequest, JsonParser<? extends T> jsonParser) {
        return Companion.from(apiRequest, jsonParser);
    }

    default ApiConfigExtractor<T> getConfigExtractor() {
        return (ApiConfigExtractor<T>) ApiConfigExtractor.NO_OP;
    }

    default JsonParser<? extends ApiInvocationException> getFailParser() {
        return ApiInvocationExceptionParser.INSTANCE;
    }

    JsonParser<? extends T> getOkParser();

    default ApiScopeAfter getScopeAfter() {
        return ApiScopeAfter.SAME;
    }

    static <T> ApiExecutableRequest<T> from(ApiRequest apiRequest, JsonParser<? extends T> jsonParser, JsonParser<? extends ApiInvocationException> jsonParser2) {
        return Companion.from(apiRequest, jsonParser, jsonParser2);
    }
}
