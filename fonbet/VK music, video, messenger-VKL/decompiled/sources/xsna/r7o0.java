package xsna;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.HttpHeader;
import ru.ok.android.commons.http.HttpRequest;
import ru.ok.android.commons.http.HttpRequestBody;
import ru.ok.android.commons.http.HttpResponse;
import ru.ok.android.commons.http.HttpResponseBody;
import ru.ok.android.utils.Logger;

/* compiled from: TcpHttpClient.kt */
/* loaded from: classes8.dex */
public final class r7o0 implements HttpClient {
    public final SSLContext a = null;

    /* compiled from: TcpHttpClient.kt */
    public static final class a implements HttpResponseBody {
        public final HttpsURLConnection b;

        public a(HttpsURLConnection httpsURLConnection) {
            this.b = httpsURLConnection;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.b.disconnect();
        }

        @Override // ru.ok.android.commons.http.HttpResponseBody
        public final long getContentLength() {
            return this.b.getContentLengthLong();
        }

        @Override // ru.ok.android.commons.http.HttpResponseBody
        public final InputStream getStream() throws IOException {
            return new BufferedInputStream(this.b.getInputStream());
        }
    }

    public static void a(HttpsURLConnection httpsURLConnection) throws IOException {
        try {
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.connect();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
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

    @Override // ru.ok.android.commons.http.HttpClient
    public final HttpResponse execute(HttpRequest httpRequest) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(httpRequest.getUrl()).openConnection();
        SSLContext sSLContext = this.a;
        if (sSLContext != null) {
            try {
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception e) {
                Logger.e("TcpHttpClient", "Can't set ssl socket factory", e);
            }
        }
        Iterator<HttpHeader> it = httpRequest.getHeaders().iterator();
        while (it.hasNext()) {
            HttpHeader next = it.next();
            httpsURLConnection.setRequestProperty(next.getName(), next.getValue());
        }
        HttpRequestBody body = httpRequest.getBody();
        try {
            httpsURLConnection.setRequestMethod(httpRequest.getMethod());
            if (body != null) {
                httpsURLConnection.setDoOutput(true);
                if (body.getContentLength() >= 0) {
                    httpsURLConnection.setFixedLengthStreamingMode(body.getContentLength());
                } else {
                    httpsURLConnection.setChunkedStreamingMode(0);
                }
            }
            a(httpsURLConnection);
            if (body != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                try {
                    body.writeTo(bufferedOutputStream);
                    s3q0 s3q0Var = s3q0.a;
                    bufferedOutputStream.close();
                } finally {
                }
            }
            HttpResponse.Builder builder = HttpResponse.Companion.builder();
            try {
                builder.statusCode(httpsURLConnection.getResponseCode());
                for (String str : httpsURLConnection.getHeaderFields().keySet()) {
                    if (str != null) {
                        builder.header(str, httpsURLConnection.getHeaderField(str));
                    }
                }
                builder.body(new a(httpsURLConnection));
                return builder.build();
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            httpsURLConnection.disconnect();
            throw e3;
        }
    }
}
