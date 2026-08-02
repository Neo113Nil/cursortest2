package ru.ok.android.commons.http;

import android.net.TrafficStats;
import com.ironsource.B5;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import ru.ok.android.commons.http.HttpResponse;
import ru.ok.android.commons.http.TcpHttpClient;
import xsna.brm0;
import xsna.bs80;
import xsna.i94;
import xsna.ohk0;
import xsna.ok3;
import xsna.ozl;
import xsna.qhk0;
import xsna.rdp0;
import xsna.s3q0;
import xsna.sm5;
import xsna.ujl;
import xsna.wdp0;
import xsna.xe9;
import xsna.xfx;
import xsna.zcl;

/* compiled from: TcpHttpClient.kt */
/* loaded from: classes11.dex */
public final class TcpHttpClient implements HttpClient {
    private static final i94<List<String>> ATTR_KEY_HTTP_REQUEST_HEADER_TRACE_PARENT;
    private static final i94<String> ATTR_KEY_HTTP_REQUEST_METHOD;
    private static final i94<Long> ATTR_KEY_HTTP_RESPONSE_STATUS_CODE;
    private static final i94<String> ATTR_KEY_SERVER_ADDRESS;
    private static final i94<Long> ATTR_KEY_SERVER_PORT;
    private static final i94<String> ATTR_KEY_URL_FULL;
    public static final Companion Companion = new Companion(null);
    private static final String HTTP_HEADER_TRACE_PARENT = "traceparent";
    private static final String HTTP_HEADER_TRACE_STATE = "tracestate";
    private static final int NO_SOCKET_TAG = -1;
    private static final String TRACE_PARENT_HEADER_VERSION = "00";
    private int connectTimeout;
    private int readTimeout;
    private int socketTag;
    private wdp0 tracer;

    /* compiled from: TcpHttpClient.kt */
    public static final class Builder {
        private int connectTimeout;
        private int readTimeout;
        private int socketTag = -1;
        private bs80 telemetry = ujl.a;

        public final TcpHttpClient build() {
            return new TcpHttpClient(this, null);
        }

        public final int getConnectTimeout$commons_http_urlconnection_release() {
            return this.connectTimeout;
        }

        public final int getReadTimeout$commons_http_urlconnection_release() {
            return this.readTimeout;
        }

        public final int getSocketTag$commons_http_urlconnection_release() {
            return this.socketTag;
        }

        public final bs80 getTelemetry$commons_http_urlconnection_release() {
            return this.telemetry;
        }

        public final Builder setConnectTimeout(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("connectTimeout < 0");
            }
            this.connectTimeout = i;
            return this;
        }

        public final void setConnectTimeout$commons_http_urlconnection_release(int i) {
            this.connectTimeout = i;
        }

        public final Builder setOpenTelemetry(bs80 bs80Var) {
            this.telemetry = bs80Var;
            return this;
        }

        public final Builder setReadTimeout(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("readTimeout < 0");
            }
            this.readTimeout = i;
            return this;
        }

        public final void setReadTimeout$commons_http_urlconnection_release(int i) {
            this.readTimeout = i;
        }

        public final Builder setSocketTag(int i) {
            this.socketTag = i;
            return this;
        }

        public final void setSocketTag$commons_http_urlconnection_release(int i) {
            this.socketTag = i;
        }

        public final void setTelemetry$commons_http_urlconnection_release(bs80 bs80Var) {
            this.telemetry = bs80Var;
        }
    }

    /* compiled from: TcpHttpClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void connect(HttpURLConnection httpURLConnection, int i, int i2, int i3) throws IOException {
            int threadStatsTag = TrafficStats.getThreadStatsTag();
            if (i != -1) {
                TrafficStats.setThreadStatsTag(i);
            }
            try {
                if (i2 > 0) {
                    try {
                        try {
                            try {
                                httpURLConnection.setConnectTimeout(i2);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    } catch (SecurityException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            throw e3;
                        }
                        String name = cause.getClass().getName();
                        if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                            throw e3;
                        }
                        throw new UnknownHostException();
                    }
                }
                if (i3 > 0) {
                    httpURLConnection.setReadTimeout(i3);
                }
                httpURLConnection.connect();
                if (i != -1) {
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            } catch (Throwable th) {
                if (i != -1) {
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
                throw th;
            }
        }

        public final int getResponseCode(HttpURLConnection httpURLConnection) throws IOException {
            try {
                return httpURLConnection.getResponseCode();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            } catch (NullPointerException e2) {
                String message = e2.getMessage();
                if (message == null || !brm0.B(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                    throw e2;
                }
                throw new IOException(e2);
            }
        }

        private Companion() {
        }

        private static /* synthetic */ void getHTTP_HEADER_TRACE_PARENT$annotations() {
        }

        private static /* synthetic */ void getHTTP_HEADER_TRACE_STATE$annotations() {
        }
    }

    /* compiled from: TcpHttpClient.kt */
    /* loaded from: classes9.dex */
    public static final class HttpResponseBodyAdapter implements HttpResponseBody {
        private final HttpURLConnection conn;

        public HttpResponseBodyAdapter(HttpURLConnection httpURLConnection) {
            this.conn = httpURLConnection;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.conn.disconnect();
        }

        @Override // ru.ok.android.commons.http.HttpResponseBody
        public long getContentLength() {
            return this.conn.getContentLengthLong();
        }

        @Override // ru.ok.android.commons.http.HttpResponseBody
        public InputStream getStream() throws IOException {
            return new BufferedInputStream(this.conn.getInputStream());
        }
    }

    static {
        AttributeType attributeType = AttributeType.STRING;
        ATTR_KEY_HTTP_REQUEST_METHOD = xfx.a(attributeType, "http.request.method");
        ATTR_KEY_SERVER_ADDRESS = xfx.a(attributeType, "server.address");
        AttributeType attributeType2 = AttributeType.LONG;
        ATTR_KEY_SERVER_PORT = xfx.a(attributeType2, "server.port");
        ATTR_KEY_URL_FULL = xfx.a(attributeType, "url.full");
        ATTR_KEY_HTTP_REQUEST_HEADER_TRACE_PARENT = xfx.a(AttributeType.STRING_ARRAY, "http.request.header.traceparent");
        ATTR_KEY_HTTP_RESPONSE_STATUS_CODE = xfx.a(attributeType2, "http.response.status_code");
    }

    public /* synthetic */ TcpHttpClient(Builder builder, zcl zclVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_traceStateHeader_$lambda$4$lambda$3(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append(B5.U);
        sb.append(str2);
    }

    public static final int getResponseCode(HttpURLConnection httpURLConnection) throws IOException {
        return Companion.getResponseCode(httpURLConnection);
    }

    private final String getTraceParentHeader(qhk0 qhk0Var) {
        sm5 sm5Var = (sm5) qhk0Var;
        if (!sm5Var.f) {
            return null;
        }
        String str = sm5Var.b;
        String str2 = sm5Var.c;
        rdp0 rdp0Var = sm5Var.d;
        StringBuilder a = xe9.a("00-", str, "-", str2, "-");
        a.append(rdp0Var);
        return a.toString();
    }

    private final String getTraceStateHeader(qhk0 qhk0Var) {
        sm5 sm5Var = (sm5) qhk0Var;
        if (!sm5Var.f) {
            return null;
        }
        ok3 ok3Var = sm5Var.e;
        if (ok3Var.b().isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        ok3Var.a(new BiConsumer() { // from class: xsna.q7o0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TcpHttpClient._get_traceStateHeader_$lambda$4$lambda$3(sb, (String) obj, (String) obj2);
            }
        });
        return sb.toString();
    }

    @Override // ru.ok.android.commons.http.HttpClient
    public HttpResponse execute(HttpRequest httpRequest) throws IOException {
        ohk0 e = this.tracer.a("GET").d(SpanKind.CLIENT).e();
        URL url = new URL(httpRequest.getUrl());
        String traceParentHeader = getTraceParentHeader(e.i());
        String traceStateHeader = getTraceStateHeader(e.i());
        e.g(httpRequest.getMethod() + " " + url.getPath());
        e.a(ATTR_KEY_URL_FULL, httpRequest.getUrl());
        e.a(ATTR_KEY_HTTP_REQUEST_METHOD, httpRequest.getMethod());
        e.a(ATTR_KEY_SERVER_ADDRESS, url.getHost());
        if (url.getPort() > 0) {
            e.k(ATTR_KEY_SERVER_PORT, url.getPort());
        }
        if (traceParentHeader != null) {
            e.a(ATTR_KEY_HTTP_REQUEST_HEADER_TRACE_PARENT, Collections.singletonList(traceParentHeader));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try {
            try {
                httpURLConnection.setRequestMethod(httpRequest.getMethod());
                Iterator<HttpHeader> it = httpRequest.getHeaders().iterator();
                while (it.hasNext()) {
                    HttpHeader next = it.next();
                    httpURLConnection.setRequestProperty(next.getName(), next.getValue());
                }
                if (traceParentHeader != null) {
                    httpURLConnection.setRequestProperty("traceparent", traceParentHeader);
                }
                if (traceStateHeader != null) {
                    httpURLConnection.setRequestProperty("tracestate", traceStateHeader);
                }
                HttpRequestBody body = httpRequest.getBody();
                if (body != null) {
                    httpURLConnection.setDoOutput(true);
                    if (body.getContentLength() >= 0) {
                        httpURLConnection.setFixedLengthStreamingMode(body.getContentLength());
                    } else {
                        httpURLConnection.setChunkedStreamingMode(0);
                    }
                }
                Companion companion = Companion;
                companion.connect(httpURLConnection, this.socketTag, this.connectTimeout, this.readTimeout);
                if (body != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                    try {
                        body.writeTo(bufferedOutputStream);
                        s3q0 s3q0Var = s3q0.a;
                        bufferedOutputStream.close();
                    } finally {
                    }
                }
                int responseCode = companion.getResponseCode(httpURLConnection);
                e.a(ATTR_KEY_HTTP_RESPONSE_STATUS_CODE, Long.valueOf(responseCode));
                HttpResponse.Builder builder = HttpResponse.Companion.builder();
                builder.statusCode(responseCode);
                for (String str : httpURLConnection.getHeaderFields().keySet()) {
                    if (str != null) {
                        builder.header(str, httpURLConnection.getHeaderField(str));
                    }
                }
                builder.body(new HttpResponseBodyAdapter(httpURLConnection));
                HttpResponse build = builder.build();
                e.end();
                return build;
            } catch (IOException e2) {
                e.e(StatusCode.ERROR, e2.getClass().getName());
                httpURLConnection.disconnect();
                throw e2;
            }
        } catch (Throwable th) {
            e.end();
            throw th;
        }
    }

    @ozl
    public final TcpHttpClient setConnectTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("connectTimeout < 0");
        }
        this.connectTimeout = i;
        return this;
    }

    @ozl
    public final TcpHttpClient setReadTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("readTimeout < 0");
        }
        this.readTimeout = i;
        return this;
    }

    @ozl
    public final TcpHttpClient setSocketTag(int i) {
        this.socketTag = i;
        return this;
    }

    private TcpHttpClient(Builder builder) {
        this.socketTag = builder.getSocketTag$commons_http_urlconnection_release();
        this.connectTimeout = builder.getConnectTimeout$commons_http_urlconnection_release();
        this.readTimeout = builder.getReadTimeout$commons_http_urlconnection_release();
        this.tracer = builder.getTelemetry$commons_http_urlconnection_release().getTracer(BuildConfig.LIBRARY_PACKAGE_NAME, BuildConfig.VERSION_NAME);
    }

    @ozl
    public TcpHttpClient() {
        this(new Builder());
    }
}
