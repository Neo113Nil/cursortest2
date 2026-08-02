package yads;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.j5g;

/* loaded from: classes10.dex */
public abstract class fa3 {
    public static final Lazy a = new bpn0(ea3.b);

    public static final boolean a() {
        return true;
    }

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) j5g.a0(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
