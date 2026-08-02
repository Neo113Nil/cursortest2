package xsna;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidCertificateChainCleaner.kt */
/* loaded from: classes11.dex */
public final class f52 extends fqa {
    public final X509TrustManager c;
    public final X509TrustManagerExtensions d;

    public f52(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.c = x509TrustManager;
        this.d = x509TrustManagerExtensions;
    }

    @Override // xsna.fqa
    public final List d(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.d.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f52) && ((f52) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
}
