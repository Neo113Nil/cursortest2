package yads;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class rv2 extends X509ExtendedTrustManager implements lx2 {
    public final nx2 a;

    public rv2(u20 u20Var) {
        this.a = new nx2(u20Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        ((X509TrustManager) this.a.b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.a.b.getValue()).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        s3q0 s3q0Var;
        nx2 nx2Var = this.a;
        nx2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) nx2Var.b.getValue();
            if (fa3.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (nx2Var.e) {
                try {
                    nx2Var.a();
                    nx2Var.b();
                    X509TrustManager x509TrustManager2 = nx2Var.d;
                    if (x509TrustManager2 != null) {
                        if (fa3.a()) {
                            yf.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        s3q0Var = s3q0.a;
                    } else {
                        s3q0Var = null;
                    }
                    if (s3q0Var == null) {
                        throw e;
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        nx2 nx2Var = this.a;
        nx2Var.getClass();
        if (fa3.a()) {
            yf.a((X509TrustManager) nx2Var.b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) nx2Var.b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        nx2 nx2Var = this.a;
        nx2Var.getClass();
        if (fa3.a()) {
            yf.a((X509TrustManager) nx2Var.b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) nx2Var.b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        s3q0 s3q0Var;
        nx2 nx2Var = this.a;
        nx2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) nx2Var.b.getValue();
            if (fa3.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (nx2Var.e) {
                try {
                    nx2Var.a();
                    nx2Var.b();
                    X509TrustManager x509TrustManager2 = nx2Var.d;
                    if (x509TrustManager2 != null) {
                        if (fa3.a()) {
                            yf.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        s3q0Var = s3q0.a;
                    } else {
                        s3q0Var = null;
                    }
                    if (s3q0Var != null) {
                        s3q0 s3q0Var2 = s3q0.a;
                        return;
                    }
                    throw e;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
