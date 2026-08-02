package ru.ok.android.api.http;

import android.net.Uri;
import android.os.Trace;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.SerializationException;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiExecutableRequestKt;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.core.ApiRequests;
import ru.ok.android.api.core.ApiResponseException;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.AutoApiParam;
import ru.ok.android.api.core.CookieHelper;
import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.http.HttpApiUriEngine;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonReaderJackson;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.KotlinxSerializationUtilsKt;
import ru.ok.android.commons.http.Http;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.HttpRequest;
import ru.ok.android.commons.http.HttpRequestBody;
import ru.ok.android.commons.http.HttpResponse;
import xsna.epx;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: HttpApiClient.kt */
/* loaded from: classes11.dex */
public final class HttpApiClient implements ApiClientEngine {
    private wzs<? super Uri, ? super ApiInvocationException, s3q0> apiRequestFailureReporter;
    private final HttpClient httpClient;
    private volatile String userAgent;
    private final HttpApiUriEngine uriEngine = new HttpApiUriEngine();
    private HttpGeoPosition geoPosition = HttpGeoPosition.NONE;
    private CookieHelper cookieHelper = CookieHelper.Companion.getNONE();
    private ApiRequestDebugger debugger = ApiRequestDebugger.NO_OP;
    private ProtocolSettings protocolSettings = ProtocolSettings.Companion.getDEFAULT();

    /* compiled from: HttpApiClient.kt */
    /* loaded from: classes9.dex */
    public final class HttpRequestBodyAdapter implements HttpRequestBody {
        private final ApiConfig config;
        private final ApiRequest request;
        private final HttpApiUriEngine.SignMode signMode;
        private final boolean useGzip;
        private final boolean useJson;

        public HttpRequestBodyAdapter(ApiRequest apiRequest, ApiConfig apiConfig, HttpApiUriEngine.SignMode signMode, boolean z, boolean z2) {
            this.request = apiRequest;
            this.config = apiConfig;
            this.signMode = signMode;
            this.useGzip = z;
            this.useJson = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream, java.util.zip.DeflaterOutputStream, ru.ok.android.api.http.HttpApiClient$HttpRequestBodyAdapter$writeTo$gzipStream$1] */
        @Override // ru.ok.android.commons.http.HttpRequestBody
        public void writeTo(final OutputStream outputStream) throws IOException {
            if (!this.useGzip) {
                HttpApiClient.this.getUriEngine().writeRequestParams(outputStream, this.request, this.config, this.signMode, this.useJson);
                return;
            }
            ?? r2 = new GZIPOutputStream(outputStream) { // from class: ru.ok.android.api.http.HttpApiClient$HttpRequestBodyAdapter$writeTo$gzipStream$1
                public final void end() {
                    ((GZIPOutputStream) this).def.end();
                }
            };
            HttpApiClient.this.getUriEngine().writeRequestParams(r2, this.request, this.config, this.signMode, this.useJson);
            r2.finish();
            r2.end();
        }
    }

    /* compiled from: HttpApiClient.kt */
    public interface ProtocolSettings {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: HttpApiClient.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ProtocolSettings DEFAULT = new ProtocolSettings() { // from class: ru.ok.android.api.http.HttpApiClient$ProtocolSettings$Companion$DEFAULT$1
            };

            private Companion() {
            }

            public final ProtocolSettings getDEFAULT() {
                return DEFAULT;
            }
        }

        default boolean getShouldJsonByDefault() {
            return false;
        }
    }

    public HttpApiClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    private final String getHttpMethod(ApiRequest apiRequest) {
        return apiRequest.shouldNeverPost() ? "GET" : "POST";
    }

    private final boolean getUseGzip(ApiRequest apiRequest) {
        return !apiRequest.shouldNeverGzip();
    }

    private final boolean getUseJson(ApiRequest apiRequest) {
        return this.protocolSettings.getShouldJsonByDefault() && !apiRequest.shouldNeverJson();
    }

    private final HttpRequest toHttpRequest(ApiExecutableRequest<?> apiExecutableRequest, ApiConfig apiConfig) throws ApiRequestException, IOException {
        HttpApiClient httpApiClient;
        ApiExecutableRequest<?> apiExecutableRequest2;
        HttpRequest.Builder builder = HttpRequest.Companion.builder();
        builder.priority(apiExecutableRequest.getPriority());
        String httpMethod = getHttpMethod(apiExecutableRequest);
        if (epx.f(httpMethod, "POST")) {
            builder.method(httpMethod);
            String createRequestUrlNoParams = this.uriEngine.createRequestUrlNoParams(apiExecutableRequest);
            builder.url(createRequestUrlNoParams);
            boolean useJson = getUseJson(apiExecutableRequest);
            if (useJson) {
                builder.header("Content-Type", "application/json");
            } else {
                builder.header("Content-Type", Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
            }
            boolean useGzip = getUseGzip(apiExecutableRequest);
            if (useGzip) {
                builder.header(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
            }
            httpApiClient = this;
            apiExecutableRequest2 = apiExecutableRequest;
            builder.body(httpApiClient.new HttpRequestBodyAdapter(apiExecutableRequest2, apiConfig, HttpApiUriEngine.SignMode.Companion.valueOfScheme(createRequestUrlNoParams), useGzip, useJson));
        } else {
            httpApiClient = this;
            apiExecutableRequest2 = apiExecutableRequest;
            builder.url(HttpApiUriEngine.createRequestUrl$default(httpApiClient.uriEngine, apiExecutableRequest, apiConfig, null, 4, null));
        }
        builder.logContext(ApiRequests.extractLogTag(apiExecutableRequest2));
        builder.canRepeat(apiExecutableRequest2.canRepeat() && apiExecutableRequest2.getScopeAfter() == ApiScopeAfter.SAME);
        String str = httpApiClient.userAgent;
        if (str != null) {
            builder.header("User-Agent", str);
        }
        if (epx.f(apiExecutableRequest2.getUri().getAuthority(), "api")) {
            String geoPosition = httpApiClient.geoPosition.getGeoPosition();
            if (geoPosition != null) {
                builder.header(Http.Header.GEO_POSITION, geoPosition);
            }
            String cookieString = httpApiClient.cookieHelper.getCookieString();
            if (cookieString != null) {
                builder.header(Http.Header.COOKIE, cookieString);
            }
        }
        builder.header(Http.Header.ACCEPT, "application/json");
        return builder.build();
    }

    public final void addAutoParam(AutoApiParam autoApiParam) {
        this.uriEngine.addAutoParam(autoApiParam);
    }

    @Override // ru.ok.android.api.core.ApiClientEngine
    public <T> T execute(ApiExecutableRequest<T> apiExecutableRequest, ApiConfig apiConfig) throws IOException, ApiException {
        try {
            try {
                Trace.beginSection("HttpApiClient.execute: " + ApiRequests.extractLogTag(apiExecutableRequest));
                this.debugger.debugApiRequest(this, apiExecutableRequest, apiConfig);
                HttpRequest httpRequest = toHttpRequest(apiExecutableRequest, apiConfig);
                HttpResponse execute = this.httpClient.execute(httpRequest);
                try {
                    if (execute.getStatusCode() != 200) {
                        throw new HttpStatusApiException(execute.getStatusCode());
                    }
                    try {
                        JsonReader create = JsonReaderJackson.create(execute.getBody().getStream());
                        if (execute.getHeaders().contains(Http.Header.SET_COOKIE)) {
                            CookieHelper cookieHelper = this.cookieHelper;
                            cookieHelper.setCookieString(CookieHelper.Companion.parse(cookieHelper, execute.getHeaders()));
                        }
                        if (!execute.getHeaders().contains(Http.Header.INVOCATION_ERROR)) {
                            try {
                                if (!execute.getHeaders().contains(Http.Header.WMF_INVOCATION_ERROR)) {
                                    try {
                                        JsonReader debugApiResponseOk = this.debugger.debugApiResponseOk(this, apiExecutableRequest, create);
                                        if (apiExecutableRequest instanceof ApiExecutableRequestKt) {
                                            T t = (T) KotlinxSerializationUtilsKt.DefaultJson().a(((ApiExecutableRequestKt) apiExecutableRequest).getSerializer(), debugApiResponseOk.jsonValue());
                                            execute.close();
                                            return t;
                                        }
                                        T parse = apiExecutableRequest.getOkParser().parse(debugApiResponseOk);
                                        String str = httpRequest.getHeaders().get(Http.Header.GEO_POSITION);
                                        if (str != null) {
                                            this.geoPosition.sentGeoPosition(str);
                                        }
                                        execute.close();
                                        return parse;
                                    } catch (SerializationException e) {
                                        throw new ApiResponseException(e);
                                    } catch (JsonParseException e2) {
                                        throw new ApiResponseException(e2);
                                    } catch (JsonSyntaxException e3) {
                                        throw new ApiResponseException(e3);
                                    }
                                }
                            } finally {
                                String str2 = httpRequest.getHeaders().get(Http.Header.GEO_POSITION);
                                if (str2 != null) {
                                    this.geoPosition.sentGeoPosition(str2);
                                }
                            }
                        }
                        try {
                            try {
                                throw apiExecutableRequest.getFailParser().parse(this.debugger.debugApiResponseFail(this, apiExecutableRequest, create));
                            } catch (JsonParseException e4) {
                                throw new ApiResponseException(e4);
                            }
                        } catch (ApiInvocationException e5) {
                            wzs<? super Uri, ? super ApiInvocationException, s3q0> wzsVar = this.apiRequestFailureReporter;
                            if (wzsVar != null) {
                                wzsVar.invoke(apiExecutableRequest.getUri(), e5);
                            }
                            throw e5;
                        }
                    } catch (JsonSyntaxException e6) {
                        throw new ApiResponseException(e6);
                    }
                } finally {
                }
            } catch (IOException e7) {
                this.debugger.debugIoException(this, apiExecutableRequest, e7);
                throw e7;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final HttpApiUriEngine getUriEngine() {
        return this.uriEngine;
    }

    public final void setCookieHelper(CookieHelper cookieHelper) {
        this.cookieHelper = cookieHelper;
    }

    public final void setEndpointProvider(HttpApiEndpointProvider httpApiEndpointProvider) {
        this.uriEngine.setEndpointProvider(httpApiEndpointProvider);
    }

    public final void setExceptionReporter(wzs<? super Uri, ? super ApiInvocationException, s3q0> wzsVar) {
        this.apiRequestFailureReporter = wzsVar;
    }

    public final void setGeoPosition(HttpGeoPosition httpGeoPosition) {
        this.geoPosition = httpGeoPosition;
    }

    public final void setProtocolSettings(ProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
    }

    public final void setRequestDebugger(ApiRequestDebugger apiRequestDebugger) {
        this.debugger = apiRequestDebugger;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }
}
