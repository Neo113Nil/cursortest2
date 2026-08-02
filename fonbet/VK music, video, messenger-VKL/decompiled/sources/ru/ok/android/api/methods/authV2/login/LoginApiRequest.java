package ru.ok.android.api.methods.authV2.login;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: LoginApiRequest.kt */
/* loaded from: classes9.dex */
public final class LoginApiRequest implements ApiExecutableRequest<LoginApiResult> {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "authV2.login";
    public static final Uri URI = ApiUris.methodUri(METHOD_NAME);
    private final String password;
    private final String username;

    /* compiled from: LoginApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LoginApiRequest(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<LoginApiResult> getConfigExtractor2() {
        return LoginApiExtractor.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends LoginApiResult> getOkParser() {
        return LoginApiParser.INSTANCE;
    }

    public final String getPassword$odnoklassniki_android_api_release() {
        return this.password;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return ApiScope.OPT_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return ApiScopeAfter.SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    public final String getUsername$odnoklassniki_android_api_release() {
        return this.username;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        jsonWriter.name(LoginApiConstants.PARAM_NAME_PASSWORD);
        ApiDebug.sensitiveValue(jsonWriter, this.password);
        jsonWriter.name(LoginApiConstants.PARAM_NAME_USERNAME);
        jsonWriter.value(this.username);
    }
}
