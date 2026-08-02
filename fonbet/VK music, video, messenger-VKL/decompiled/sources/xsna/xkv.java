package xsna;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.commons.http.Http;
import xsna.i360;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes12.dex */
public final class xkv extends oi6 {
    public final int a;
    public final ExecutorService b;
    public final RealtimeSinceBootClock c;

    /* compiled from: HttpUrlConnectionNetworkFetcher.java */
    public static class a extends u6r {
        public long d;
        public long e;
        public long f;

        public a() {
            throw null;
        }
    }

    public xkv(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.b = Executors.newFixedThreadPool(3);
        this.c = realtimeSinceBootClock;
        this.a = i;
    }

    @Override // xsna.oi6
    public final u6r a(l7j l7jVar, uhd0 uhd0Var) {
        return new a(l7jVar, uhd0Var);
    }

    @Override // xsna.oi6
    public final void b(u6r u6rVar, i360.a aVar) {
        a aVar2 = (a) u6rVar;
        aVar2.d = this.c.now();
        aVar2.b.p(new wkv(this.b.submit(new vkv(this, aVar2, aVar)), aVar));
    }

    @Override // xsna.oi6
    public final Map c(u6r u6rVar, int i) {
        a aVar = (a) u6rVar;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.e - aVar.d));
        hashMap.put("fetch_time", Long.toString(aVar.f - aVar.e));
        hashMap.put("total_time", Long.toString(aVar.f - aVar.d));
        hashMap.put(CampaignEx.JSON_KEY_IMAGE_SIZE, Integer.toString(i));
        return hashMap;
    }

    @Override // xsna.oi6
    public final void d(u6r u6rVar) {
        ((a) u6rVar).f = this.c.now();
    }

    public final HttpURLConnection g(int i, Uri uri) throws IOException {
        URL url;
        String format;
        Uri uri2 = meq0.a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.a);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case Http.StatusCode.SEE_OTHER /* 303 */:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri parse = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i > 0 && parse != null && !cq70.a(parse.getScheme(), scheme)) {
            return g(i - 1, parse);
        }
        if (i == 0) {
            String uri3 = uri.toString();
            Locale.getDefault();
            format = "URL " + uri3 + " follows too many redirects";
        } else {
            format = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(format);
    }
}
