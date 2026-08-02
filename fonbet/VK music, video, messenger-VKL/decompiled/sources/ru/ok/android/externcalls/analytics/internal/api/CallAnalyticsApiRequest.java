package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import xsna.zcl;

/* compiled from: CallAnalyticsApiRequest.kt */
/* loaded from: classes9.dex */
public abstract class CallAnalyticsApiRequest implements ApiExecutableRequest<Void> {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_APPLICATION = "application";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_COLLECTOR = "collector";
    public static final String KEY_DATA = "data";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_PLATFORM = "platform";
    public static final String KEY_SDK_TYPE = "sdk_type";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_VERSION = "version";
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final BoxedApiValue items;
    private final CallAnalyticsLogger logger;

    /* compiled from: CallAnalyticsApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CallAnalyticsApiRequest(String str, BoxedApiValue boxedApiValue, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.items = boxedApiValue;
        this.logger = callAnalyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void _get_okParser_$lambda$0(CallAnalyticsApiRequest callAnalyticsApiRequest, JsonReader jsonReader) {
        try {
        } catch (IOException e) {
            callAnalyticsApiRequest.logger.e(LOG_TAG, "Can't parse response", e);
        }
        if (jsonReader.peek() == 0) {
            callAnalyticsApiRequest.logger.d(LOG_TAG, "Got empty response");
            return null;
        }
        callAnalyticsApiRequest.logger.d(LOG_TAG, "Got response: " + jsonReader.stringValue());
        return null;
    }

    public static /* synthetic */ void writeString$default(CallAnalyticsApiRequest callAnalyticsApiRequest, JsonWriter jsonWriter, String str, String str2, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeString");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        callAnalyticsApiRequest.writeString(jsonWriter, str, str2, z);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    public final BoxedApiValue getItems() {
        return this.items;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends Void> getOkParser() {
        return new JsonParser() { // from class: xsna.f19
            @Override // ru.ok.android.api.json.JsonParser
            public final Object parse(JsonReader jsonReader) {
                Void _get_okParser_$lambda$0;
                _get_okParser_$lambda$0 = CallAnalyticsApiRequest._get_okParser_$lambda$0(CallAnalyticsApiRequest.this, jsonReader);
                return _get_okParser_$lambda$0;
            }
        };
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        return 2;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return ApiScope.OPT_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return ApiUris.methodUri(this.apiMethod);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldGzip() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return false;
    }

    public final void writeString(JsonWriter jsonWriter, String str, String str2, boolean z) throws IOException {
        if (str2 != null) {
            if (z && str2.length() == 0) {
                return;
            }
            jsonWriter.name(str);
            jsonWriter.value(str2);
        }
    }
}
