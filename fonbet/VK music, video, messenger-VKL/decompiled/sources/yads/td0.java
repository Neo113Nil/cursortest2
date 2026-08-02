package yads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import ru.ok.android.commons.http.Http;
import xsna.go9;

/* loaded from: classes10.dex */
public class td0 extends eo {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final v11 i;
    public final v11 j;
    public final boolean k;
    public final ph2 l;
    public HttpURLConnection m;
    public InputStream n;
    public boolean o;
    public int p;
    public long q;
    public long r;

    public td0(String str, int i, int i2, boolean z, v11 v11Var) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = v11Var;
        this.l = null;
        this.j = new v11();
        this.k = false;
    }

    public final URL a(URL url, String str) {
        if (str == null) {
            throw new s11("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new s11(go9.b("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new s11("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new s11(e, 2001, 1);
        }
    }

    public final HttpURLConnection c(u30 u30Var) {
        HttpURLConnection a;
        URL url = new URL(u30Var.a.toString());
        int i = u30Var.c;
        byte[] bArr = u30Var.d;
        long j = u30Var.f;
        long j2 = u30Var.g;
        int i2 = 1;
        int i3 = 0;
        boolean z = (u30Var.i & 1) == 1;
        if (!this.e && !this.k) {
            return a(url, i, bArr, j, j2, z, true, u30Var.e);
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new s11(new NoRouteToHostException(nh2.a("Too many redirects: ", i4)), 2001, 1);
            }
            a = a(url, i, bArr, j, j2, z, false, u30Var.e);
            int responseCode = a.getResponseCode();
            String headerField = a.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                a.disconnect();
                url = a(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                a.disconnect();
                if (!this.k || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = a(url, headerField);
            }
            i3 = i4;
            i2 = 1;
        }
        return a;
    }

    @Override // yads.p30
    public final void close() {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j = this.q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.r;
                }
                a(this.m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = mc3.a;
                    throw new s11(e, 2000, 3);
                }
            }
        } finally {
            this.n = null;
            f();
            if (this.o) {
                this.o = false;
                d();
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ji1.b("DefaultHttpDataSource", ji1.a("Unexpected error while disconnecting", e));
            }
            this.m = null;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection == null ? yn2.h : new rd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.p30
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.q;
            if (j != -1) {
                long j2 = j - this.r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.n;
            int i3 = mc3.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.r += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = mc3.a;
            throw s11.a(e, 2);
        }
    }

    public final HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        Map map2;
        HttpURLConnection a = a(url);
        a.setConnectTimeout(this.f);
        a.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        v11 v11Var = this.i;
        if (v11Var != null) {
            synchronized (v11Var) {
                try {
                    if (v11Var.b == null) {
                        v11Var.b = Collections.unmodifiableMap(new HashMap(v11Var.a));
                    }
                    map2 = v11Var.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashMap.putAll(map2);
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = d21.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder b = xsna.fp.b(j, "bytes=", "-");
            if (j2 != -1) {
                b.append((j + j2) - 1);
            }
            sb = b.toString();
        }
        if (sb != null) {
            a.setRequestProperty(Command.HTTP_HEADER_RANGE, sb);
        }
        String str2 = this.h;
        if (str2 != null) {
            a.setRequestProperty("User-Agent", str2);
        }
        a.setRequestProperty("Accept-Encoding", z ? Http.ContentEncoding.GZIP : "identity");
        a.setInstanceFollowRedirects(z2);
        a.setDoOutput(bArr != null);
        int i2 = u30.k;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        a.setRequestMethod(str);
        if (bArr != null) {
            a.setFixedLengthStreamingMode(bArr.length);
            a.connect();
            OutputStream outputStream = a.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return a;
        }
        a.connect();
        return a;
    }

    public static void a(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = mc3.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r11 != 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134 A[Catch: IOException -> 0x013f, TRY_LEAVE, TryCatch #4 {IOException -> 0x013f, blocks: (B:26:0x012c, B:28:0x0134), top: B:25:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a1  */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(u30 u30Var) {
        boolean z;
        long parseLong;
        long j;
        HttpURLConnection httpURLConnection;
        long j2;
        this.r = 0L;
        this.q = 0L;
        e();
        try {
            HttpURLConnection c = c(u30Var);
            this.m = c;
            this.p = c.getResponseCode();
            c.getResponseMessage();
            int i = this.p;
            long j3 = -1;
            if (i >= 200 && i <= 299) {
                String contentType = c.getContentType();
                ph2 ph2Var = this.l;
                if (ph2Var != null && !ph2Var.apply(contentType)) {
                    f();
                    throw new t11(contentType);
                }
                if (this.p == 200) {
                    j = u30Var.f;
                }
                j = 0;
                boolean equalsIgnoreCase = Http.ContentEncoding.GZIP.equalsIgnoreCase(c.getHeaderField(Http.Header.CONTENT_ENCODING));
                if (!equalsIgnoreCase) {
                    long j4 = u30Var.g;
                    if (j4 != -1) {
                        this.q = j4;
                        httpURLConnection = c;
                    } else {
                        String headerField = c.getHeaderField(Http.Header.CONTENT_LENGTH);
                        String headerField2 = c.getHeaderField(Http.Header.CONTENT_RANGE);
                        Pattern pattern = d21.a;
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                j2 = -1;
                                j3 = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                ji1.b("HttpUtil", "Unexpected Content-Length [" + headerField + X3.j.e);
                            }
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = d21.a.matcher(headerField2);
                                if (matcher.matches()) {
                                    try {
                                        String group = matcher.group(2);
                                        group.getClass();
                                        long parseLong2 = Long.parseLong(group);
                                        String group2 = matcher.group(1);
                                        group2.getClass();
                                        httpURLConnection = c;
                                        long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                                        if (j3 < 0) {
                                            j3 = parseLong3;
                                        } else if (j3 != parseLong3) {
                                            try {
                                                ji1.d("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + X3.j.e);
                                                j3 = Math.max(j3, parseLong3);
                                            } catch (NumberFormatException unused2) {
                                                ji1.b("HttpUtil", "Unexpected Content-Range [" + headerField2 + X3.j.e);
                                                this.q = j3 == j2 ? j3 - j : j2;
                                                this.n = httpURLConnection.getInputStream();
                                                if (equalsIgnoreCase) {
                                                }
                                                this.o = true;
                                                b(u30Var);
                                                a(j);
                                                return this.q;
                                            }
                                        }
                                    } catch (NumberFormatException unused3) {
                                        httpURLConnection = c;
                                    }
                                    this.q = j3 == j2 ? j3 - j : j2;
                                }
                            }
                            httpURLConnection = c;
                            this.q = j3 == j2 ? j3 - j : j2;
                        }
                        j2 = -1;
                        if (!TextUtils.isEmpty(headerField2)) {
                        }
                        httpURLConnection = c;
                        this.q = j3 == j2 ? j3 - j : j2;
                    }
                } else {
                    httpURLConnection = c;
                    this.q = u30Var.g;
                }
                try {
                    this.n = httpURLConnection.getInputStream();
                    if (equalsIgnoreCase) {
                        this.n = new GZIPInputStream(this.n);
                    }
                    this.o = true;
                    b(u30Var);
                    try {
                        a(j);
                        return this.q;
                    } catch (IOException e) {
                        f();
                        if (e instanceof s11) {
                            throw ((s11) e);
                        }
                        throw new s11(e, 2000, 1);
                    }
                } catch (IOException e2) {
                    f();
                    throw new s11(e2, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = c.getHeaderFields();
            if (this.p == 416) {
                String headerField3 = c.getHeaderField(Http.Header.CONTENT_RANGE);
                Pattern pattern2 = d21.a;
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = d21.b.matcher(headerField3);
                    if (matcher2.matches()) {
                        z = true;
                        String group3 = matcher2.group(1);
                        group3.getClass();
                        parseLong = Long.parseLong(group3);
                        if (u30Var.f == parseLong) {
                            this.o = z;
                            b(u30Var);
                            long j5 = u30Var.g;
                            if (j5 != -1) {
                                return j5;
                            }
                            return 0L;
                        }
                    }
                }
                z = true;
                parseLong = -1;
                if (u30Var.f == parseLong) {
                }
            }
            InputStream errorStream = c.getErrorStream();
            try {
                if (errorStream != null) {
                    int i2 = mc3.a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i3 = mc3.a;
                }
            } catch (IOException unused4) {
                int i4 = mc3.a;
            }
            f();
            throw new u11(this.p, this.p == 416 ? new q30(2008) : null, headerFields);
        } catch (IOException e3) {
            f();
            throw s11.a(e3, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.n;
            int i = mc3.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new s11(new InterruptedIOException(), 2000, 1);
            }
            if (read != -1) {
                j -= read;
                c(read);
            } else {
                throw new s11();
            }
        }
    }
}
