package ru.ok.android.api.methods.users.changePassword;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: ChangePasswordApiRequestV1.kt */
/* loaded from: classes9.dex */
public final class ChangePasswordApiRequestV1 implements ApiExecutableRequest<ChangePasswordApiResultV1> {
    public static final String PARAM_NAME_LOGOUT_ALL = "logout";
    private final boolean isLogoutAll;
    private final String newPassword;
    private final String oldPassword;
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "users.changePassword";
    private static final Uri URI = ApiUris.methodUri(METHOD_NAME);

    /* compiled from: ChangePasswordApiRequestV1.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return ChangePasswordApiRequestV1.URI;
        }

        private Companion() {
        }
    }

    public ChangePasswordApiRequestV1(String str, String str2, boolean z) {
        this.oldPassword = str;
        this.newPassword = str2;
        this.isLogoutAll = z;
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
    public void writeParams(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(PARAM_NAME_LOGOUT_ALL).value(this.isLogoutAll);
        ApiDebug.sensitiveValue(jsonWriter.name(LoginApiConstants.PARAM_NAME_OLD_PASSWORD), this.oldPassword);
        ApiDebug.sensitiveValue(jsonWriter.name(LoginApiConstants.PARAM_NAME_PASSWORD), this.newPassword);
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor, reason: merged with bridge method [inline-methods] */
    public ApiConfigExtractor<ChangePasswordApiResultV1> getConfigExtractor2() {
        return ChangePasswordApiExtractorV1.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends ChangePasswordApiResultV1> getOkParser() {
        return ChangePasswordApiParserV1.INSTANCE;
    }
}
