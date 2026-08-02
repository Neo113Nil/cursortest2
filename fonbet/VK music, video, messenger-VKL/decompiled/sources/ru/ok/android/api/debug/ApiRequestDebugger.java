package ru.ok.android.api.debug;

import java.io.IOException;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonReaderJackson;

/* compiled from: ApiRequestDebugger.kt */
/* loaded from: classes11.dex */
public interface ApiRequestDebugger {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ApiRequestDebugger NO_OP = new ApiRequestDebugger() { // from class: ru.ok.android.api.debug.ApiRequestDebugger$Companion$NO_OP$1
    };
    public static final ApiRequestDebugger BUFFER = new ApiRequestDebugger() { // from class: ru.ok.android.api.debug.ApiRequestDebugger$Companion$BUFFER$1
        @Override // ru.ok.android.api.debug.ApiRequestDebugger
        public JsonReader debugApiResponseFail(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
            return debugApiResponseOk(apiClientEngine, apiRequest, jsonReader);
        }

        @Override // ru.ok.android.api.debug.ApiRequestDebugger
        public JsonReader debugApiResponseOk(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
            return JsonReaderJackson.create(jsonReader.jsonValue());
        }
    };

    /* compiled from: ApiRequestDebugger.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    default void debugApiRequest(ApiClientEngine apiClientEngine, ApiRequest apiRequest, ApiConfig apiConfig) throws IOException {
    }

    default JsonReader debugApiResponseFail(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
        return jsonReader;
    }

    default JsonReader debugApiResponseOk(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
        return jsonReader;
    }

    default void debugIoException(ApiClientEngine apiClientEngine, ApiRequest apiRequest, IOException iOException) throws IOException {
    }
}
