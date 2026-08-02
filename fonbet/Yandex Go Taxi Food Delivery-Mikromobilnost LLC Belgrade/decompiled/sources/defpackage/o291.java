package defpackage;

import com.adjust.sdk.Constants;
import com.monetization.ads.network.core.Header;
import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;

/* loaded from: classes7.dex */
public final class o291 extends c681 {
    public final oa71 a;
    public final ke81 b;
    public final ho71 c;
    public final b481 d;

    public o291(SSLSocketFactory sSLSocketFactory) {
        oa71 oa71Var = new oa71();
        ke81 ke81Var = new ke81();
        ho71 ho71Var = new ho71();
        this.a = oa71Var;
        this.b = ke81Var;
        this.c = ho71Var;
        this.d = new b481(sSLSocketFactory);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpResponse a(Request request, Map map) {
        String str;
        gb81 gb81Var;
        SSLSocketFactory sSLSocketFactory;
        ke81 ke81Var = this.b;
        xp71 xp71Var = ke81Var.b;
        xp71Var.getClass();
        synchronized (xp71.c) {
            str = (String) xp71Var.a.get(request);
            xp71Var.a.remove(request);
        }
        boolean z = false;
        if (str != null) {
            try {
                ke81Var.a.getClass();
                rr41 a = vj71.a(str);
                gb81Var = new gb81(200, ((String) a.c).getBytes(uza.a), (Map) a.b, false);
            } catch (JSONException unused) {
            }
            if (gb81Var == null) {
                this.a.getClass();
                ArrayList arrayList = new ArrayList();
                Map map2 = gb81Var.c;
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                return new HttpResponse(gb81Var.a, arrayList, gb81Var.b);
            }
            b481 b481Var = this.d;
            b481Var.getClass();
            String url = request.getUrl();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.putAll(request.getHeaders());
            URL url2 = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
            httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
            int timeoutMs = request.getTimeoutMs();
            httpURLConnection.setConnectTimeout(timeoutMs);
            httpURLConnection.setReadTimeout(timeoutMs);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            if (Constants.SCHEME.equals(url2.getProtocol()) && (sSLSocketFactory = b481Var.a) != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            try {
                for (String str2 : hashMap.keySet()) {
                    httpURLConnection.setRequestProperty(str2, (String) hashMap.get(str2));
                }
                b481.b(httpURLConnection, request);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                if (request.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                    HttpResponse httpResponse = new HttpResponse(responseCode, b481.a(httpURLConnection.getHeaderFields()));
                    httpURLConnection.disconnect();
                    return httpResponse;
                }
                try {
                    return new HttpResponse(responseCode, b481.a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new n081(httpURLConnection));
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        gb81Var = null;
        if (gb81Var == null) {
        }
    }
}
