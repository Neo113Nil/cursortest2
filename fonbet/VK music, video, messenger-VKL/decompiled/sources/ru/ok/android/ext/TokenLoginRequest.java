package ru.ok.android.ext;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiParser;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiRequest;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiResult;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.e9e0;

/* loaded from: classes9.dex */
public class TokenLoginRequest implements ApiExecutableRequest<AnonymLoginApiResult> {

    @NonNull
    private final String deviceId;

    @NonNull
    private final e9e0<String> tokenProvider;

    public TokenLoginRequest(@NonNull String str, @NonNull e9e0<String> e9e0Var) {
        this.deviceId = str;
        this.tokenProvider = e9e0Var;
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
        return ApiUris.methodUri("auth.anonymLogin");
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("session_data");
        jsonWriter.beginObject();
        String str = this.tokenProvider.get();
        if (str != null) {
            jsonWriter.name(LoginApiConstants.RESULT_NAME_AUTH_TOKEN).value(str);
        }
        jsonWriter.name("version").value(3);
        jsonWriter.name("device_id").value(this.deviceId);
        jsonWriter.name(AnonymLoginApiRequest.PARAM_NAME_CLIENT_VERSION).value(1);
        jsonWriter.name("client_type").value("SDK_ANDROID");
        jsonWriter.endObject();
    }
}
