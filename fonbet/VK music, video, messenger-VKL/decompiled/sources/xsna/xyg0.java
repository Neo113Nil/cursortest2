package xsna;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.EmptyList;

/* compiled from: SSLTrustManager.kt */
/* loaded from: classes11.dex */
public class xyg0 implements X509TrustManager {
    public final SSLSocketFactory a;
    public final X509TrustManager b;
    public final TrustManager[] c;
    public final X509TrustManagerExtensions d;

    public xyg0(ryg0 ryg0Var) {
        KeyStore keyStore;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            if (ryg0Var.a) {
                uyg0 c = ryg0Var.c();
                c.f.get();
                keyStore = c.e.get();
            } else {
                keyStore = null;
            }
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            this.c = trustManagers;
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    this.b = x509TrustManager;
                    this.d = new X509TrustManagerExtensions(x509TrustManager);
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{this}, null);
                        sSLContext.getClientSessionContext().setSessionCacheSize(0);
                        sSLContext.getClientSessionContext().setSessionTimeout(900);
                        this.a = sSLContext.getSocketFactory();
                        this.d = x509TrustManager != null ? new X509TrustManagerExtensions(x509TrustManager) : null;
                        return;
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(this.c));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.b;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.b;
        if (x509TrustManager != null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509TrustManager x509TrustManager = this.b;
        if (x509TrustManager != null) {
            return x509TrustManager.getAcceptedIssuers();
        }
        return null;
    }

    public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        List<X509Certificate> checkServerTrusted;
        X509TrustManagerExtensions x509TrustManagerExtensions = this.d;
        return (x509TrustManagerExtensions == null || (checkServerTrusted = x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2)) == null) ? x509CertificateArr != null ? rl3.u0(x509CertificateArr) : EmptyList.b : checkServerTrusted;
    }
}
