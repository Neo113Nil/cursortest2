package ru.ok.android.api.methods.auth.anonymLogin;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiExtractor;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiParser;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiResult;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: AnonymLoginApiRequestV1.kt */
/* loaded from: classes9.dex */
public final class AnonymLoginApiRequestV1 implements ApiExecutableRequest<AnonymLoginApiResult> {
    public static final int DEF_VERSION = 2;
    public static final String METHOD_NAME = "auth.anonymLogin";
    private static final String PARAM_NAME_CLIENT_TYPE = "client_type";
    private static final String PARAM_NAME_CLIENT_VERSION = "client_version";
    private static final String PARAM_NAME_GAID = "gaid";
    private static final String PARAM_NAME_MTID = "mtid";
    private static final String PARAM_NAME_OAID = "oaid";
    private static final String PARAM_NAME_SESSION_DATA = "session_data";
    private static final String PARAM_NAME_VERSION = "version";
    private final String deviceId;
    private final String gaid;
    private final String mtid;
    private final String oaid;
    public static final Companion Companion = new Companion(null);
    public static final Uri URI = ApiUris.methodUri("auth.anonymLogin");

    /* compiled from: AnonymLoginApiRequestV1.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AnonymLoginApiRequestV1(String str, String str2, String str3, String str4) {
        this.deviceId = str;
        this.gaid = str2;
        this.oaid = str3;
        this.mtid = str4;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<AnonymLoginApiResult> getConfigExtractor2() {
        return AnonymLoginApiExtractor.INSTANCE;
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
    public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.name(PARAM_NAME_SESSION_DATA);
        jsonWriter.beginObject();
        jsonWriter.name("device_id").value(this.deviceId);
        jsonWriter.name("version").value(2);
        jsonWriter.name("client_version").value("android_8");
        jsonWriter.name("client_type").value("SDK_ANDROID");
        jsonWriter.endObject();
        String str = this.gaid;
        if (str != null) {
            jsonWriter.name("gaid").value(str);
        }
        String str2 = this.oaid;
        if (str2 != null) {
            jsonWriter.name("oaid").value(str2);
        }
        String str3 = this.mtid;
        if (str3 != null) {
            jsonWriter.name(PARAM_NAME_MTID).value(str3);
        }
    }

    public /* synthetic */ AnonymLoginApiRequestV1(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public AnonymLoginApiRequestV1(String str) {
        this(str, null, null, null, 12, null);
    }
}
