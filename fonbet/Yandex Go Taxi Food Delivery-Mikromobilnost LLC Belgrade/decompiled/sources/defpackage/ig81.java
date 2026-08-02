package defpackage;

import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public final class ig81 extends X509ExtendedTrustManager implements od81 {
    public final fp71 a;

    public ig81(CustomCertificatesProvider customCertificatesProvider) {
        this.a = new fp71(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        fp71 fp71Var = this.a;
        fp71Var.getClass();
        i3y i3yVar = j971.a;
        cg71.b((X509TrustManager) ((i3y) fp71Var.b).getValue(), x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        zy11 zy11Var;
        fp71 fp71Var = this.a;
        fp71Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) ((i3y) fp71Var.b).getValue();
            i3y i3yVar = j971.a;
            cg71.d(x509TrustManager, x509CertificateArr, str, socket);
        } catch (CertificateException e) {
            synchronized (fp71Var.x) {
                fp71Var.g();
                fp71Var.h();
                X509TrustManager x509TrustManager2 = (X509TrustManager) fp71Var.w;
                if (x509TrustManager2 != null) {
                    i3y i3yVar2 = j971.a;
                    cg71.d(x509TrustManager2, x509CertificateArr, str, socket);
                    zy11Var = zy11.a;
                } else {
                    zy11Var = null;
                }
                if (zy11Var != null) {
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) ((i3y) this.a.b).getValue()).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        fp71 fp71Var = this.a;
        fp71Var.getClass();
        i3y i3yVar = j971.a;
        cg71.c((X509TrustManager) ((i3y) fp71Var.b).getValue(), x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        ((X509TrustManager) ((i3y) this.a.b).getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        zy11 zy11Var;
        fp71 fp71Var = this.a;
        fp71Var.getClass();
        try {
            ((X509TrustManager) ((i3y) fp71Var.b).getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (fp71Var.x) {
                fp71Var.g();
                fp71Var.h();
                X509TrustManager x509TrustManager = (X509TrustManager) fp71Var.w;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    zy11Var = zy11.a;
                } else {
                    zy11Var = null;
                }
                if (zy11Var != null) {
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        zy11 zy11Var;
        fp71 fp71Var = this.a;
        fp71Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) ((i3y) fp71Var.b).getValue();
            i3y i3yVar = j971.a;
            cg71.e(x509TrustManager, x509CertificateArr, str, sSLEngine);
        } catch (CertificateException e) {
            synchronized (fp71Var.x) {
                fp71Var.g();
                fp71Var.h();
                X509TrustManager x509TrustManager2 = (X509TrustManager) fp71Var.w;
                if (x509TrustManager2 != null) {
                    i3y i3yVar2 = j971.a;
                    cg71.e(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                    zy11Var = zy11.a;
                } else {
                    zy11Var = null;
                }
                if (zy11Var != null) {
                } else {
                    throw e;
                }
            }
        }
    }
}
