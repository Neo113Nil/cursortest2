package ru.ok.android.api.methods.users.changePasswordV2;

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

/* compiled from: ChangePasswordApiRequest.kt */
/* loaded from: classes9.dex */
public final class ChangePasswordApiRequest implements ApiExecutableRequest<LoginApiResult> {
    private static final String PARAM_NAME_LOGOUT = "logout";
    private final boolean logoutAll;
    private final String oldPassword;
    private final String password;
    public static final Companion Companion = new Companion(null);
    private static final Uri URI = ApiUris.methodUri("users.changePasswordV2");

    /* compiled from: ChangePasswordApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return ChangePasswordApiRequest.URI;
        }

        private Companion() {
        }
    }

    public ChangePasswordApiRequest(String str, String str2, boolean z) {
        this.oldPassword = str;
        this.password = str2;
        this.logoutAll = z;
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
        jsonWriter.name("logout").value(this.logoutAll);
        ApiDebug.sensitiveValue(jsonWriter.name(LoginApiConstants.PARAM_NAME_OLD_PASSWORD), this.oldPassword);
        ApiDebug.sensitiveValue(jsonWriter.name(LoginApiConstants.PARAM_NAME_PASSWORD), this.password);
    }
}
