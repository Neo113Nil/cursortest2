package xsna;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class qyy0 {
    public final SSLContext a;
    public final TrustManagerFactory b;

    public qyy0(X509TrustManager x509TrustManager, SSLContext sSLContext, TrustManagerFactory trustManagerFactory) {
        this.a = sSLContext;
        this.b = trustManagerFactory;
    }
}
