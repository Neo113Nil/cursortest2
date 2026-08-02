package xsna;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes13.dex */
public final class ppm0 implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            x509Certificate.getSubjectDN().getName();
            n34.b("");
            vey0.a(str, x509Certificate);
            yiy0.a();
            return true;
        } catch (SSLException e) {
            n34.e("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
