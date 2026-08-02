package ru.ok.android.api.methods.auth.expireSession;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: ExpireSessionApiRequestV1.kt */
/* loaded from: classes9.dex */
public final class ExpireSessionApiRequestV1 implements ApiExecutableRequest<Object> {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "auth.expireSession";
    private static final Uri URI = ApiUris.methodUri(METHOD_NAME);

    /* compiled from: ExpireSessionApiRequestV1.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return ExpireSessionApiRequestV1.URI;
        }

        private Companion() {
        }
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<Object> getConfigExtractor2() {
        return ExpireSessionApiExtractorV1.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends Object> getOkParser() {
        return JsonParsers.voidParser();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return ApiScope.OPT_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return ApiScopeAfter.NO_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteParams() {
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
    }
}
