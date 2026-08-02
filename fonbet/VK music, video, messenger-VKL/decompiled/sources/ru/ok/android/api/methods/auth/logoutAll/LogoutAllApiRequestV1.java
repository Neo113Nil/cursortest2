package ru.ok.android.api.methods.auth.logoutAll;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: LogoutAllApiRequestV1.kt */
/* loaded from: classes9.dex */
public final class LogoutAllApiRequestV1 implements ApiExecutableRequest<LogoutAllApiResultV1> {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "auth.logoutAll";
    private static final Uri URI = ApiUris.methodUri(METHOD_NAME);
    private final String password;

    /* compiled from: LogoutAllApiRequestV1.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return LogoutAllApiRequestV1.URI;
        }

        private Companion() {
        }
    }

    public LogoutAllApiRequestV1(String str) {
        this.password = str;
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

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<LogoutAllApiResultV1> getConfigExtractor2() {
        return LogoutAllApiExtractorV1.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends LogoutAllApiResultV1> getOkParser() {
        return LogoutAllApiParserV1.INSTANCE;
    }
}
