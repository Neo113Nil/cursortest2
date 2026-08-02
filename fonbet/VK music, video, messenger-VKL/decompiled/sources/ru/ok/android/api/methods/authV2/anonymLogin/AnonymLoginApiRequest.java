package ru.ok.android.api.methods.authV2.anonymLogin;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: AnonymLoginApiRequest.kt */
/* loaded from: classes9.dex */
public final class AnonymLoginApiRequest implements ApiExecutableRequest<AnonymLoginApiResult> {
    public static final String PARAM_NAME_CLIENT_TYPE = "client_type";
    public static final String PARAM_NAME_CLIENT_VERSION = "client_version";
    private final String deviceId;
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "authV2.anonymLogin";
    public static final Uri URI = ApiUris.methodUri(METHOD_NAME);

    /* compiled from: AnonymLoginApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AnonymLoginApiRequest(String str) {
        this.deviceId = str;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<AnonymLoginApiResult> getConfigExtractor2() {
        return AnonymLoginApiExtractor.INSTANCE;
    }

    public final String getDeviceId$odnoklassniki_android_api_release() {
        return this.deviceId;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends AnonymLoginApiResult> getOkParser() {
        return AnonymLoginApiParser.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return ApiScope.APPLICATION;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return ApiScopeAfter.ANONYMOUS_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        jsonWriter.name("client_type");
        jsonWriter.value("SDK_ANDROID");
        jsonWriter.name(PARAM_NAME_CLIENT_VERSION);
        jsonWriter.value("android_8");
        jsonWriter.name("device_id");
        jsonWriter.value(this.deviceId);
    }
}
