package xsna;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* compiled from: BouncyCastlePlatform.kt */
/* loaded from: classes8.dex */
public final class m98 extends fta0 {
    public static final boolean d;
    public final Provider c = new BouncyCastleJsseProvider();

    /* compiled from: BouncyCastlePlatform.kt */
    public static final class a {
        public static m98 a() {
            if (m98.d) {
                return new m98();
            }
            return null;
        }

        public static boolean b() {
            return m98.d;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }

    @Override // xsna.fta0
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // xsna.fta0
    public final SSLContext l() {
        return SSLContext.getInstance("TLS", this.c);
    }

    @Override // xsna.fta0
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // xsna.fta0
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }
}
