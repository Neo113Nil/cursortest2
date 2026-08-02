package ru.ok.android.api.methods.authV2.logout;

import android.net.Uri;
import ru.ok.android.api.common.AbstractApiRequest;
import ru.ok.android.api.common.ApiParamList;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiExtractor;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiParser;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiResult;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.zcl;

/* compiled from: LogoutApiRequest.kt */
/* loaded from: classes9.dex */
public final class LogoutApiRequest extends AbstractApiRequest implements ApiExecutableRequest<AnonymLoginApiResult> {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "authV2.logout";
    private static final Uri URI = ApiUris.methodUri(METHOD_NAME);

    /* compiled from: LogoutApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Uri getURI() {
            return LogoutApiRequest.URI;
        }

        private Companion() {
        }
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<AnonymLoginApiResult> getConfigExtractor2() {
        return AnonymLoginApiExtractor.INSTANCE;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends AnonymLoginApiResult> getOkParser() {
        return AnonymLoginApiParser.INSTANCE;
    }

    @Override // ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(ApiParamList apiParamList) {
    }
}
