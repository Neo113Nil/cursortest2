package defpackage;

import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public abstract class cg71 {
    public static final od81 a(CustomCertificatesProvider customCertificatesProvider) throws CertificateException {
        return new ig81(customCertificatesProvider);
    }

    public static final void b(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void c(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void d(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public static final void e(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }
}
