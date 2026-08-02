package xsna;

import android.annotation.SuppressLint;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ProxyTrustManager.kt */
/* loaded from: classes.dex */
public final class qae0 extends z560 {
    public final X509Certificate[] e;

    public qae0(mqa mqaVar) {
        super(mqaVar);
        this.e = new X509Certificate[0];
    }

    @Override // xsna.xyg0, javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // xsna.xyg0, javax.net.ssl.X509TrustManager
    @SuppressLint({"TrustAllX509TrustManager"})
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // xsna.xyg0, javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.e;
    }

    @Override // xsna.xyg0
    public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        return x509CertificateArr != null ? e43.l(Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)) : EmptyList.b;
    }
}
