package ru.ok.android.onelog.uv;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.PlainJsonWriter;
import ru.ok.android.commons.http.Http;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.HttpRequest;
import ru.ok.android.commons.http.HttpRequestBody;
import ru.ok.android.commons.http.HttpResponse;
import ru.ok.android.commons.http.HttpResponseBody;
import ru.ok.android.commons.io.OutputStreamWriter;
import ru.ok.android.onelog.uv.token.UVTokenProvider;
import ru.ok.android.utils.Logger;
import xsna.emb;
import xsna.ro;
import xsna.s3q0;
import xsna.tgw;
import xsna.zcl;

/* compiled from: UVApiClientImpl.kt */
/* loaded from: classes9.dex */
public final class UVApiClientImpl implements UVApiClient {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "UVApiClientImpl";
    private final HttpClient httpClient;
    private final UVTokenProvider tokenProvider;
    private final boolean useGzip;

    /* compiled from: UVApiClientImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: UVApiClientImpl.kt */
    public static final class UVRequestBody implements HttpRequestBody {
        private final ApiExecutableRequest<?> request;
        private final boolean useGzip;

        public UVRequestBody(ApiExecutableRequest<?> apiExecutableRequest, boolean z) {
            this.request = apiExecutableRequest;
            this.useGzip = z;
        }

        private final void writeParamsTo(OutputStream outputStream) {
            PlainJsonWriter plainJsonWriter = new PlainJsonWriter(new OutputStreamWriter(outputStream));
            plainJsonWriter.beginObject();
            try {
                this.request.writeParams(plainJsonWriter);
                plainJsonWriter.endObject();
                plainJsonWriter.flush();
            } catch (JsonSerializeException e) {
                throw new IOException(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream, java.util.zip.DeflaterOutputStream, ru.ok.android.onelog.uv.UVApiClientImpl$UVRequestBody$writeTo$gzipStream$1] */
        @Override // ru.ok.android.commons.http.HttpRequestBody
        public void writeTo(final OutputStream outputStream) {
            if (!this.useGzip) {
                writeParamsTo(outputStream);
                return;
            }
            ?? r0 = new GZIPOutputStream(outputStream) { // from class: ru.ok.android.onelog.uv.UVApiClientImpl$UVRequestBody$writeTo$gzipStream$1
                public final void end() {
                    ((GZIPOutputStream) this).def.end();
                }
            };
            writeParamsTo(r0);
            r0.finish();
            r0.end();
        }
    }

    public UVApiClientImpl(HttpClient httpClient, UVTokenProvider uVTokenProvider, boolean z) {
        this.httpClient = httpClient;
        this.tokenProvider = uVTokenProvider;
        this.useGzip = z;
    }

    private final void executeRequestWithAuth(ApiExecutableRequest<?> apiExecutableRequest) {
        String token = this.tokenProvider.getToken();
        HttpRequest.Builder header = HttpRequest.Companion.builder().method("POST").url(apiExecutableRequest.getUri().toString()).header("Content-Type", "application/json").header(Http.Header.AUTHORIZATION, "Bearer " + token);
        if (this.useGzip) {
            header.header(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
        }
        HttpResponse execute = this.httpClient.execute(header.body(new UVRequestBody(apiExecutableRequest, this.useGzip)).logContext("uv-api").build());
        try {
            if (execute.getStatusCode() != 200) {
                logErrorResponse(execute);
                throw new ApiInvocationException(execute.getStatusCode(), null);
            }
            s3q0 s3q0Var = s3q0.a;
            ro.e(execute, null);
        } finally {
        }
    }

    private final void logErrorResponse(HttpResponse httpResponse) {
        try {
            HttpResponseBody body = httpResponse.getBody();
            byte[] bytes = body != null ? body.getBytes() : null;
            if (bytes == null) {
                Logger.e(TAG, "UV API error: status=" + httpResponse.getStatusCode() + ", body=null");
                return;
            }
            Logger.e(TAG, "UV API error: status=" + httpResponse.getStatusCode() + ", body=" + new String(bytes, emb.b));
        } catch (Exception e) {
            Logger.e(TAG, tgw.b(httpResponse.getStatusCode(), "UV API error: status=", ", failed to read body."), e);
        }
    }

    @Override // ru.ok.android.onelog.uv.UVApiClient
    public void execute(ApiExecutableRequest<?> apiExecutableRequest) {
        try {
            executeRequestWithAuth(apiExecutableRequest);
        } catch (ApiInvocationException e) {
            if (e.getErrorCode() != 401) {
                throw e;
            }
            this.tokenProvider.refreshToken();
            executeRequestWithAuth(apiExecutableRequest);
        }
    }

    public /* synthetic */ UVApiClientImpl(HttpClient httpClient, UVTokenProvider uVTokenProvider, boolean z, int i, zcl zclVar) {
        this(httpClient, uVTokenProvider, (i & 4) != 0 ? true : z);
    }
}
