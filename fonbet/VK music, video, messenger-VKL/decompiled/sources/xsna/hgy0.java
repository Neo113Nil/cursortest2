package xsna;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: QuicClientConnectionImpl.java */
/* loaded from: classes8.dex */
public final class hgy0 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }
}
