package ru.ok.android.api.http;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.common.StringAutoApiParam;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.core.AutoApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.PlainJsonWriter;
import xsna.asp;
import xsna.brm0;
import xsna.drm0;
import xsna.epx;
import xsna.g5g;
import xsna.jw5;
import xsna.pzl;
import xsna.qoy;
import xsna.s3q0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: HttpApiUriEngine.kt */
/* loaded from: classes11.dex */
public final class HttpApiUriEngine {
    public static final Companion Companion = new Companion(null);
    private static final String URL_PREFIX_SECURE = "https:";
    private static StringAutoApiParam applicationKeyParam;
    private static StringAutoApiParam sessionKeyParam;
    private volatile HttpApiEndpointProvider endpointProvider = HttpApiEndpointProvider.DEFAULT;
    private final List<AutoApiParam> autoParams = new ArrayList();

    /* compiled from: HttpApiUriEngine.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StringAutoApiParam applicationKeyParam(String str) {
            StringAutoApiParam stringAutoApiParam = HttpApiUriEngine.applicationKeyParam;
            if (stringAutoApiParam != null && epx.f(stringAutoApiParam.getValue(), str)) {
                return stringAutoApiParam;
            }
            StringAutoApiParam stringAutoApiParam2 = new StringAutoApiParam("application_key", str);
            HttpApiUriEngine.applicationKeyParam = stringAutoApiParam2;
            return stringAutoApiParam2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String combinedPath(String str, String str2) {
            if (str != null) {
                if (str.length() == 0) {
                    return str2;
                }
                if (!str.equals(DomExceptionUtils.SEPARATOR)) {
                    if (str2 == null) {
                        return str;
                    }
                    if (str2.length() == 0) {
                        return str;
                    }
                    if (str2.equals(DomExceptionUtils.SEPARATOR)) {
                        return str;
                    }
                    if (str.charAt(str.length() - 1) == '/') {
                        str = qoy.c(1, 0, str);
                    }
                    return str.concat(str2);
                }
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String combinedQuery(String str, String str2) {
            return str != null ? str.length() == 0 ? str2 : str2 != null ? str.length() == 0 ? str : pzl.b(str, "&", str2) : str : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StringAutoApiParam sessionKeyParam(String str) {
            StringAutoApiParam stringAutoApiParam = HttpApiUriEngine.sessionKeyParam;
            if (stringAutoApiParam != null && epx.f(stringAutoApiParam.getValue(), str)) {
                return stringAutoApiParam;
            }
            StringAutoApiParam stringAutoApiParam2 = new StringAutoApiParam("session_key", str);
            HttpApiUriEngine.sessionKeyParam = stringAutoApiParam2;
            return stringAutoApiParam2;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpApiUriEngine.kt */
    /* loaded from: classes9.dex */
    public static final class SignMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SignMode[] $VALUES;
        public static final Companion Companion;
        public static final SignMode ALWAYS = new SignMode("ALWAYS", 0);
        public static final SignMode NEVER = new SignMode("NEVER", 1);
        public static final SignMode AUTO = new SignMode("AUTO", 2);

        /* compiled from: HttpApiUriEngine.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final SignMode valueOfScheme(String str) {
                return (str.equals(HttpRequest.DEFAULT_SCHEME) || brm0.B(str, HttpApiUriEngine.URL_PREFIX_SECURE, false)) ? SignMode.NEVER : SignMode.ALWAYS;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ SignMode[] $values() {
            return new SignMode[]{ALWAYS, NEVER, AUTO};
        }

        static {
            SignMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
            Companion = new Companion(null);
        }

        private SignMode(String str, int i) {
        }

        public static zrp<SignMode> getEntries() {
            return $ENTRIES;
        }

        public static SignMode valueOf(String str) {
            return (SignMode) Enum.valueOf(SignMode.class, str);
        }

        public static SignMode[] values() {
            return (SignMode[]) $VALUES.clone();
        }
    }

    /* compiled from: HttpApiUriEngine.kt */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SignMode.values().length];
            try {
                iArr[SignMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignMode.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignMode.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiScope.values().length];
            try {
                iArr2[ApiScope.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiScope.OPT_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiScope.APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ Uri createRequestUri$default(HttpApiUriEngine httpApiUriEngine, ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode, int i, Object obj) throws ApiRequestException {
        if ((i & 4) != 0) {
            signMode = SignMode.AUTO;
        }
        return httpApiUriEngine.createRequestUri(apiRequest, apiConfig, signMode);
    }

    public static /* synthetic */ String createRequestUrl$default(HttpApiUriEngine httpApiUriEngine, ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode, int i, Object obj) throws ApiRequestException {
        if ((i & 4) != 0) {
            signMode = SignMode.AUTO;
        }
        return httpApiUriEngine.createRequestUrl(apiRequest, apiConfig, signMode);
    }

    public static /* synthetic */ void writeRequestParams$default(HttpApiUriEngine httpApiUriEngine, OutputStream outputStream, ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode, boolean z, int i, Object obj) throws IOException, ApiRequestException {
        if ((i & 8) != 0) {
            signMode = SignMode.AUTO;
        }
        SignMode signMode2 = signMode;
        if ((i & 16) != 0) {
            z = false;
        }
        httpApiUriEngine.writeRequestParams(outputStream, apiRequest, apiConfig, signMode2, z);
    }

    public final void addAutoParam(AutoApiParam autoApiParam) {
        this.autoParams.add(autoApiParam);
    }

    public final Uri createRequestUri(ApiRequest apiRequest, ApiConfig apiConfig) throws ApiRequestException {
        return createRequestUri$default(this, apiRequest, apiConfig, null, 4, null);
    }

    public final Uri createRequestUriNoParams(ApiRequest apiRequest) throws ApiRequestException {
        Uri uri = apiRequest.getUri();
        if (!epx.f(uri.getScheme(), ApiUris.SCHEME_OK)) {
            return uri;
        }
        Uri apiEndpoint = this.endpointProvider.getApiEndpoint(uri.getAuthority());
        Uri.Builder encodedAuthority = uri.buildUpon().scheme(apiEndpoint.getScheme()).encodedAuthority(apiEndpoint.getEncodedAuthority());
        Companion companion = Companion;
        return encodedAuthority.encodedPath(companion.combinedPath(apiEndpoint.getEncodedPath(), uri.getEncodedPath())).encodedQuery(companion.combinedQuery(apiEndpoint.getEncodedQuery(), uri.getEncodedQuery())).build();
    }

    public final String createRequestUrl(ApiRequest apiRequest, ApiConfig apiConfig) throws ApiRequestException {
        return createRequestUrl$default(this, apiRequest, apiConfig, null, 4, null);
    }

    public final String createRequestUrlNoParams(ApiRequest apiRequest) throws ApiRequestException {
        return createRequestUriNoParams(apiRequest).toString();
    }

    public final void setEndpointProvider(HttpApiEndpointProvider httpApiEndpointProvider) {
        this.endpointProvider = httpApiEndpointProvider;
    }

    public final void writeRequestParams(OutputStream outputStream, ApiRequest apiRequest, ApiConfig apiConfig) throws IOException, ApiRequestException {
        writeRequestParams$default(this, outputStream, apiRequest, apiConfig, null, false, 24, null);
    }

    public final Uri createRequestUri(ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode) throws ApiRequestException {
        return Uri.parse(createRequestUrl(apiRequest, apiConfig, signMode));
    }

    public final String createRequestUrl(ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode) throws ApiRequestException {
        String uri = createRequestUriNoParams(apiRequest).toString();
        if (WhenMappings.$EnumSwitchMapping$0[signMode.ordinal()] == 1) {
            signMode = SignMode.Companion.valueOfScheme(uri);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeRequestParams$default(this, byteArrayOutputStream, apiRequest, apiConfig, signMode, false, 16, null);
        if (byteArrayOutputStream.size() == 0) {
            return uri;
        }
        return pzl.b(uri, drm0.L(uri, '?', 0, 6) < 0 ? "?" : "&", byteArrayOutputStream.toString(C.UTF8_NAME));
    }

    public final void writeRequestParams(OutputStream outputStream, ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode) throws IOException, ApiRequestException {
        writeRequestParams$default(this, outputStream, apiRequest, apiConfig, signMode, false, 16, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c4, code lost:
    
        if (xsna.epx.f(r10.endpointProvider.getApiEndpoint(r1).getScheme(), com.unity3d.services.core.network.model.HttpRequest.DEFAULT_SCHEME) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeRequestParams(OutputStream outputStream, ApiRequest apiRequest, ApiConfig apiConfig, SignMode signMode, boolean z) throws IOException, ApiRequestException {
        String applicationKey;
        String sessionKey;
        ApiScope scope = apiRequest.getScope();
        String authority = apiRequest.getUri().getAuthority();
        ArrayList arrayList = new ArrayList(this.autoParams.size() + 2);
        for (AutoApiParam autoApiParam : this.autoParams) {
            if (autoApiParam.isSuitable(authority)) {
                arrayList.add(autoApiParam);
            }
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[scope.ordinal()];
        String str = null;
        if (i == 1 || i == 2 || i == 3) {
            applicationKey = apiConfig.getApplicationKey();
            if (applicationKey == null) {
                throw new ApiScopeException("No app key");
            }
        } else {
            applicationKey = null;
        }
        if (applicationKey != null) {
            arrayList.add(Companion.applicationKeyParam(applicationKey));
        }
        int i2 = iArr[scope.ordinal()];
        if (i2 == 1 || i2 == 2) {
            sessionKey = apiConfig.getSessionKey();
            if (sessionKey == null) {
                throw new ApiScopeException("No session key");
            }
        } else {
            sessionKey = null;
        }
        int i3 = iArr[scope.ordinal()];
        String sessionSecret = (i3 == 1 || i3 == 2) ? apiConfig.getSessionSecret() : null;
        if (iArr[scope.ordinal()] == 1) {
            if (apiConfig.getUserId() == null) {
                throw new ApiScopeException("No user");
            }
        } else {
            s3q0 s3q0Var = s3q0.a;
        }
        if (sessionKey != null) {
            arrayList.add(Companion.sessionKeyParam(sessionKey));
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[signMode.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            str = sessionSecret;
        }
        if (str != null && arrayList.size() > 1) {
            g5g.L(arrayList, new Comparator() { // from class: ru.ok.android.api.http.HttpApiUriEngine$writeRequestParams$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return jw5.b(((AutoApiParam) t).getName(), ((AutoApiParam) t2).getName());
                }
            });
        }
        if (str == null && z) {
            JsonWriter plainJsonWriter = new PlainJsonWriter(outputStream);
            plainJsonWriter.beginObject();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AutoApiParam) it.next()).write(plainJsonWriter);
                }
                apiRequest.writeParams(plainJsonWriter);
                plainJsonWriter.endObject();
                return;
            } catch (JsonSerializeException e) {
                throw new ApiRequestException(e);
            }
        }
        HttpParamWriter httpParamWriter = new HttpParamWriter(outputStream, arrayList, str);
        httpParamWriter.beginParams();
        try {
            apiRequest.writeParams(httpParamWriter);
            httpParamWriter.endParams();
        } catch (JsonSerializeException e2) {
            throw new ApiRequestException(e2);
        }
    }
}
