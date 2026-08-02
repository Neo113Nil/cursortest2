package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.a;
import yads.f73;

/* loaded from: classes4.dex */
public abstract class j971 {
    public static final i3y a = a.a(f73.w);

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
            return (X509TrustManager) kotlin.collections.a.R(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
