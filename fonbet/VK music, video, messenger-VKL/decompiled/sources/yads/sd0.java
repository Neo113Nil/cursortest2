package yads;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import ru.ok.android.commons.http.Http;
import xsna.ahn;
import xsna.blv;
import xsna.evk;
import xsna.gc6;
import xsna.go9;
import xsna.jxc0;
import xsna.ku8;
import xsna.xiv;
import xsna.y2r0;

/* loaded from: classes10.dex */
public abstract class sd0 extends gc6 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final xiv f;
    public final xiv g;
    public final jxc0 h;
    public final boolean i;
    public evk j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;

    public sd0(String str, int i, int i2, boolean z, boolean z2, xiv xivVar) {
        super(true);
        this.e = str;
        this.c = i;
        this.d = i2;
        this.a = z;
        this.b = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f = xivVar;
        this.h = null;
        this.g = new xiv();
        this.i = false;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ahn.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.a
    public final void close() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    evk evkVar = this.j;
                    String str = y2r0.a;
                    throw new HttpDataSource$HttpDataSourceException(e, evkVar, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            a();
            if (this.m) {
                this.m = false;
                transferEnded();
            }
            this.k = null;
            this.j = null;
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? com.google.common.collect.h.h : new qd0(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.a
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        evk evkVar = this.j;
        if (evkVar != null) {
            return evkVar.a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long open(final evk evkVar) {
        byte[] bArr;
        this.j = evkVar;
        long j = 0;
        this.p = 0L;
        this.o = 0L;
        transferInitializing(evkVar);
        try {
            HttpURLConnection a = a(evkVar);
            this.k = a;
            this.n = a.getResponseCode();
            String responseMessage = a.getResponseMessage();
            int i = this.n;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = a.getHeaderFields();
                if (this.n == 416) {
                    if (evkVar.g == blv.c(a.getHeaderField(Http.Header.CONTENT_RANGE))) {
                        this.m = true;
                        transferStarted(evkVar);
                        long j2 = evkVar.h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = a.getErrorStream();
                try {
                    bArr = errorStream != null ? ku8.b(errorStream) : y2r0.b;
                } catch (IOException unused) {
                    bArr = y2r0.b;
                }
                byte[] bArr2 = bArr;
                a();
                throw new HttpDataSource$InvalidResponseCodeException(this.n, responseMessage, this.n == 416 ? new DataSourceException(2008) : null, headerFields, evkVar, bArr2);
            }
            final String contentType = a.getContentType();
            jxc0 jxc0Var = this.h;
            if (jxc0Var != null && !jxc0Var.apply(contentType)) {
                a();
                throw new HttpDataSource$HttpDataSourceException(contentType, evkVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super(go9.b("Invalid content type: ", contentType), evkVar, 2003);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.n == 200) {
                long j3 = evkVar.g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean equalsIgnoreCase = Http.ContentEncoding.GZIP.equalsIgnoreCase(a.getHeaderField(Http.Header.CONTENT_ENCODING));
            if (equalsIgnoreCase) {
                this.o = evkVar.h;
            } else {
                long j4 = evkVar.h;
                if (j4 != -1) {
                    this.o = j4;
                } else {
                    long b = blv.b(a.getHeaderField(Http.Header.CONTENT_LENGTH), a.getHeaderField(Http.Header.CONTENT_RANGE));
                    this.o = b != -1 ? b - j : -1L;
                }
            }
            try {
                this.l = a.getInputStream();
                if (equalsIgnoreCase) {
                    this.l = new GZIPInputStream(this.l);
                }
                this.m = true;
                transferStarted(evkVar);
                try {
                    a(j, evkVar);
                    return this.o;
                } catch (IOException e) {
                    a();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, evkVar, 2000, 1);
                }
            } catch (IOException e2) {
                a();
                throw new HttpDataSource$HttpDataSourceException(e2, evkVar, 2000, 1);
            }
        } catch (IOException e3) {
            a();
            throw HttpDataSource$HttpDataSourceException.a(e3, evkVar, 1);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            if (j != -1) {
                long j2 = j - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.l;
            String str = y2r0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.p += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            evk evkVar = this.j;
            String str2 = y2r0.a;
            throw HttpDataSource$HttpDataSourceException.a(e, evkVar, 2);
        }
    }

    public final URL a(URL url, String str, evk evkVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource$HttpDataSourceException(go9.b("Unsupported protocol redirect: ", protocol), evkVar, 2001);
                }
                if (this.a || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                if (this.b) {
                    try {
                        return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                    } catch (MalformedURLException e) {
                        throw new HttpDataSource$HttpDataSourceException(e, evkVar, 2001, 1);
                    }
                }
                throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", evkVar, 2001);
            } catch (MalformedURLException e2) {
                throw new HttpDataSource$HttpDataSourceException(e2, evkVar, 2001, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Null location redirect", evkVar, 2001);
    }

    public final HttpURLConnection a(evk evkVar) {
        HttpURLConnection a;
        URL url = new URL(evkVar.a.toString());
        int i = evkVar.c;
        byte[] bArr = evkVar.d;
        long j = evkVar.g;
        long j2 = evkVar.h;
        int i2 = 1;
        boolean c = evkVar.c(1);
        if (!this.a && !this.b && !this.i) {
            return a(url, i, bArr, j, j2, c, true, evkVar.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                a = a(url, i, bArr, j, j2, c, false, evkVar.e);
                int responseCode = a.getResponseCode();
                String headerField = a.getHeaderField("Location");
                if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a.disconnect();
                    url = a(url, headerField, evkVar);
                } else {
                    if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    a.disconnect();
                    if (!this.i || responseCode != 302) {
                        bArr = null;
                        i = 1;
                    }
                    url = a(url, headerField, evkVar);
                }
                i3 = i4;
                i2 = 1;
            } else {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(nh2.a("Too many redirects: ", i4)), evkVar, 2001, 1);
            }
        }
        return a;
    }

    public final HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = ((mv2) this).q;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        httpURLConnection.setConnectTimeout(this.c);
        httpURLConnection.setReadTimeout(this.d);
        HashMap hashMap = new HashMap();
        xiv xivVar = this.f;
        if (xivVar != null) {
            hashMap.putAll(xivVar.a());
        }
        hashMap.putAll(this.g.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = blv.a(j, j2);
        if (a != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, a);
        }
        String str = this.e;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? Http.ContentEncoding.GZIP : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(evk.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final void a(long j, evk evkVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.l;
            String str = y2r0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), evkVar, 2000, 1);
            }
            if (read != -1) {
                j -= read;
                bytesTransferred(read);
            } else {
                throw new HttpDataSource$HttpDataSourceException(evkVar, 2008);
            }
        }
    }
}
