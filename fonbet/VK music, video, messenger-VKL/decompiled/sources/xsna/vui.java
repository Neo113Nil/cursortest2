package xsna;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: CompositeTrustManager.kt */
/* loaded from: classes.dex */
public final class vui implements X509TrustManager {
    public final dev0 a;
    public final z560 b;
    public final qae0 c;
    public final uui d = new uui(this);

    public vui(dev0 dev0Var, z560 z560Var, qae0 qae0Var) {
        this.a = dev0Var;
        this.b = z560Var;
        this.c = qae0Var;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (this.a.isEnabled()) {
            this.c.checkClientTrusted(x509CertificateArr, str);
            throw null;
        }
        this.b.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (this.a.isEnabled()) {
            return;
        }
        this.b.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.isEnabled() ? this.c.e : this.b.getAcceptedIssuers();
    }
}
