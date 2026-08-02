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
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: OpenJSSEPlatform.kt */
/* loaded from: classes8.dex */
public final class ir80 extends fta0 {
    public static final boolean d;
    public final Provider c = new OpenJSSE();

    /* compiled from: OpenJSSEPlatform.kt */
    public static final class a {
        public static ir80 a() {
            if (ir80.d) {
                return new ir80();
            }
            return null;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, a.class.getClassLoader());
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
        return SSLContext.getInstance("TLSv1.3", this.c);
    }

    @Override // xsna.fta0
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
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
