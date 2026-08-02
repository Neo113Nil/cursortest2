package ru.ok.android.api.methods.authV2.logoutAll;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.api.methods.authV2.login.LoginApiExtractor;
import ru.ok.android.api.methods.authV2.login.LoginApiParser;
import ru.ok.android.api.methods.authV2.login.LoginApiResult;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: LogoutAllApiRequest.kt */
/* loaded from: classes9.dex */
public final class LogoutAllApiRequest implements ApiExecutableRequest<LoginApiResult> {
    public static final Companion Companion = new Companion(null);
    private static final Uri URI = ApiUris.methodUri("authV2.logoutAll");
    private final String password;

    /* compiled from: LogoutAllApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return LogoutAllApiRequest.URI;
        }

        private Companion() {
        }
    }

    public LogoutAllApiRequest(String str) {
        this.password = str;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<LoginApiResult> getConfigExtractor2() {
        return LoginApiExtractor.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends LoginApiResult> getOkParser() {
        return LoginApiParser.Subsequent.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return ApiScope.SESSION;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return ApiScopeAfter.SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        ApiDebug.sensitiveValue(jsonWriter.name(LoginApiConstants.PARAM_NAME_PASSWORD), this.password);
    }
}
