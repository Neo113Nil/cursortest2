package ru.ok.tracer.base.http;

import android.content.Context;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import ru.ok.android.commons.http.Http;
import ru.ok.tracer.base.cert.TrustManagerUtils;
import xsna.brm0;
import xsna.i7o0;
import xsna.j5g;
import xsna.ro;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: HttpUrlConnectionHttpClient.kt */
/* loaded from: classes9.dex */
public final class HttpUrlConnectionHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_TRAFFIC_STATS_TAG = -1;
    private final int connectTimeout;
    private final Context context;
    private final int readTimeout;
    private final int trafficStatsTag;
    private final String userAgent;

    /* compiled from: HttpUrlConnectionHttpClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public HttpUrlConnectionHttpClient(Context context, String str, int i, int i2, int i3) {
        this.context = context;
        this.userAgent = str;
        this.trafficStatsTag = i;
        this.connectTimeout = i2;
        this.readTimeout = i3;
    }

    private final void connect(HttpURLConnection httpURLConnection, int i, int i2, int i3) throws IOException {
        int i4;
        if (i != -1) {
            i4 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            i4 = -1;
        }
        try {
            if (i2 > 0) {
                try {
                    try {
                        try {
                            httpURLConnection.setConnectTimeout(i2);
                        } catch (SecurityException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            String name = cause.getClass().getName();
                            if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                                throw e;
                            }
                            throw new UnknownHostException();
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e3) {
                    throw e3;
                }
            }
            if (i3 > 0) {
                httpURLConnection.setReadTimeout(i3);
            }
            httpURLConnection.connect();
            if (i4 != -1) {
                TrafficStats.setThreadStatsTag(i4);
            }
        } catch (Throwable th) {
            if (i4 != -1) {
                TrafficStats.setThreadStatsTag(i4);
            }
            throw th;
        }
    }

    private final int getResponseCode(HttpURLConnection httpURLConnection) throws IOException {
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

    @Override // ru.ok.tracer.base.http.HttpClient
    public HttpResponse execute(HttpRequest httpRequest) throws IOException {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] h;
        String method = httpRequest.getMethod();
        String url = httpRequest.getUrl();
        HttpRequestBody body = httpRequest.getBody();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(TrustManagerUtils.createSSLSocketFactory(TrustManagerUtils.createTracerTrustManager(this.context)));
        }
        try {
            httpURLConnection.setRequestMethod(method);
            String str2 = this.userAgent;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            if (body != null) {
                httpURLConnection.setRequestProperty("Content-Type", body.getContentType());
                httpURLConnection.setDoOutput(true);
                if (body.getContentLength() >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(body.getContentLength());
                } else {
                    httpURLConnection.setChunkedStreamingMode(4096);
                }
            }
            connect(httpURLConnection, this.trafficStatsTag, this.connectTimeout, this.readTimeout);
            if (body != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    body.writeTo(outputStream);
                    s3q0 s3q0Var = s3q0.a;
                    ro.e(outputStream, null);
                } finally {
                }
            }
            int responseCode = getResponseCode(httpURLConnection);
            String responseMessage = httpURLConnection.getResponseMessage();
            List<String> list = httpURLConnection.getHeaderFields().get("Content-Type");
            if (list == null || (str = (String) j5g.a0(list)) == null) {
                str = Http.ContentType.APPLICATION_OCTET_STREAM;
            }
            if (responseCode < 400) {
                InputStream inputStream = httpURLConnection.getInputStream();
                bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                try {
                    h = i7o0.h(bufferedInputStream);
                    bufferedInputStream.close();
                } finally {
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                try {
                    h = i7o0.h(bufferedInputStream);
                    bufferedInputStream.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            return new HttpResponse(responseCode, responseMessage, new HttpByteArrayBody(str, h));
        } catch (IOException e) {
            httpURLConnection.disconnect();
            throw e;
        }
    }

    public /* synthetic */ HttpUrlConnectionHttpClient(Context context, String str, int i, int i2, int i3, int i4, zcl zclVar) {
        this(context, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
