package defpackage;

import com.adjust.sdk.Constants;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* loaded from: classes4.dex */
public abstract class i2c {
    public static volatile HttpClient a;

    public static HttpClient a() {
        if (a == null) {
            synchronized (i2c.class) {
                try {
                    if (a == null) {
                        BasicHttpParams basicHttpParams = new BasicHttpParams();
                        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 40000);
                        HttpConnectionParams.setSoTimeout(basicHttpParams, 40000);
                        ConnManagerParams.setTimeout(basicHttpParams, 40000L);
                        SchemeRegistry schemeRegistry = new SchemeRegistry();
                        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                        schemeRegistry.register(new Scheme(Constants.SCHEME, PlainSocketFactory.getSocketFactory(), 443));
                        a = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                        HttpProtocolParams.setUseExpectContinue(a.getParams(), false);
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
