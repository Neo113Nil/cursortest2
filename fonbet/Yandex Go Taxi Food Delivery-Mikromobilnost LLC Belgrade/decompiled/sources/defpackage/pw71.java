package defpackage;

import android.os.SystemClock;
import com.monetization.ads.network.core.Header;
import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import yads.cw2;
import yads.dv;
import yads.jk3;
import yads.kk;
import yads.n72;
import yads.p62;
import yads.y43;

/* loaded from: classes7.dex */
public final class pw71 {
    public final eu71 a;
    public final gd81 b;

    public pw71(eu71 eu71Var) {
        gd81 gd81Var = new gd81();
        this.a = eu71Var;
        this.b = gd81Var;
    }

    public final gb81 a(Request request) {
        IOException e;
        byte[] bArr;
        a441 a441Var;
        gb81 gb81Var;
        String str;
        int timeoutMs;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            try {
                et81 cacheEntry = request.getCacheEntry();
                if (cacheEntry == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = cacheEntry.b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j = cacheEntry.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
                HttpResponse a = this.a.a(request, map);
                try {
                    int statusCode = a.getStatusCode();
                    List<Header> headers = a.getHeaders();
                    if (statusCode == 304) {
                        SystemClock.elapsedRealtime();
                        return e7a1.d(request, headers);
                    }
                    InputStream content = a.getContent();
                    byte[] e2 = content != null ? e7a1.e(content, a.getContentLength(), this.b) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (ew71.a || elapsedRealtime2 > 3000) {
                        int i = ((nv71) request.getRetryPolicy()).b;
                    }
                    if (statusCode < 200 || statusCode > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new gb81(statusCode, e2, false, (List) headers);
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    httpResponse = a;
                    int i2 = 11;
                    if (e instanceof SocketTimeoutException) {
                        a441Var = new a441(i2, "socket", new y43());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + request.getUrl(), e);
                        }
                        if (httpResponse != null) {
                            int statusCode2 = httpResponse.getStatusCode();
                            request.getUrl();
                            boolean z = ew71.a;
                            if (bArr != null) {
                                List<Header> headers2 = httpResponse.getHeaders();
                                SystemClock.elapsedRealtime();
                                gb81Var = new gb81(statusCode2, bArr, false, (List) headers2);
                                if (statusCode2 == 401 || statusCode2 == 403) {
                                    a441Var = new a441(i2, "auth", new kk(gb81Var));
                                } else {
                                    if (statusCode2 >= 400 && statusCode2 <= 499) {
                                        throw new dv(gb81Var);
                                    }
                                    if (statusCode2 < 500 || statusCode2 > 599 || !request.shouldRetryServerErrors()) {
                                        throw new cw2(gb81Var);
                                    }
                                    a441Var = new a441(i2, "server", new cw2(gb81Var));
                                }
                            } else {
                                a441Var = new a441(i2, "network", new p62());
                            }
                        } else {
                            if (!request.shouldRetryConnectionErrors()) {
                                throw new n72(e);
                            }
                            a441Var = new a441(i2, "connection", new n72());
                        }
                    }
                    str = (String) a441Var.b;
                    ab71 retryPolicy = request.getRetryPolicy();
                    timeoutMs = request.getTimeoutMs();
                    try {
                        jk3 jk3Var = (jk3) a441Var.c;
                        nv71 nv71Var = (nv71) retryPolicy;
                        int i3 = nv71Var.b + 1;
                        nv71Var.b = i3;
                        int i4 = nv71Var.a;
                        nv71Var.a = i4 + ((int) (i4 * nv71Var.d));
                        if (i3 > nv71Var.c) {
                            throw jk3Var;
                        }
                        request.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                    } catch (jk3 e4) {
                        request.addMarker(str + "-timeout-giveup [timeout=" + timeoutMs + "]");
                        throw e4;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                bArr = null;
            }
            request.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
        }
        throw new cw2(gb81Var);
    }
}
