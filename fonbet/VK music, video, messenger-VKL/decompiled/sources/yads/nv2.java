package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public final class nv2 extends td0 {
    public final SSLSocketFactory s;

    public nv2(String str, int i, int i2, boolean z, v11 v11Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i, i2, z, v11Var);
        this.s = sSLSocketFactory;
    }

    @Override // yads.td0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
