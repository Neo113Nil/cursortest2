package xsna;

import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class qjz0 {
    public final CookieManager a;

    public qjz0(CookieManager cookieManager) {
        this.a = cookieManager;
    }

    public static void b(HttpURLConnection httpURLConnection, Map map) {
        Iterator it = map.entrySet().iterator();
        for (boolean hasNext = it.hasNext(); hasNext; hasNext = it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Iterator it2 = ((List) entry.getValue()).iterator();
            for (boolean hasNext2 = it2.hasNext(); hasNext2; hasNext2 = it2.hasNext()) {
                httpURLConnection.addRequestProperty(str, (String) it2.next());
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        try {
            this.a.put(URI.create(httpURLConnection.getURL().toString()), headerFields);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("MyTargetCookieManager: Unable to set cookies from urlconnection - "), th);
        }
    }

    public final void c(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        try {
            b(httpURLConnection, this.a.get(URI.create(httpURLConnection.getURL().toString()), hashMap));
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("MyTargetCookieManager: Unable to set cookies to urlconnection - "), th);
        }
    }
}
