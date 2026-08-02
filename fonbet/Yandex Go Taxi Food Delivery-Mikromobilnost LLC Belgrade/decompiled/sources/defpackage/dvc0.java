package defpackage;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public class dvc0 {
    public static volatile d72 a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : pa2.b.entrySet()) {
                pa2.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException unused) {
            System.err.getClass();
        } catch (UnsatisfiedLinkError unused2) {
            System.err.getClass();
        }
        a = new d72();
        b = Logger.getLogger(OkHttpClient.class.getName());
    }

    public i79 a(X509TrustManager x509TrustManager) {
        return new ud5(b(x509TrustManager));
    }

    public cg11 b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new af5((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public Object c() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void d(Object obj, String str) {
        kva1.d();
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
