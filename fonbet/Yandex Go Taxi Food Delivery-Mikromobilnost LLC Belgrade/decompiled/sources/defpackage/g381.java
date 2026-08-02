package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public final class g381 extends v181 {
    public final SSLSocketFactory I;

    public g381(String str, k571 k571Var, SSLSocketFactory sSLSocketFactory) {
        super(str, 8000, 8000, k571Var);
        this.I = sSLSocketFactory;
    }

    @Override // defpackage.v181
    public final HttpURLConnection i(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.I;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
