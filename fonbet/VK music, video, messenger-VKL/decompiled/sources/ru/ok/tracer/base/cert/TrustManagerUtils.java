package ru.ok.tracer.base.cert;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ru.ok.tracer.base.R;
import xsna.rl3;
import xsna.ro;

/* compiled from: TrustManagerUtils.kt */
/* loaded from: classes9.dex */
public final class TrustManagerUtils {
    private static final X509TrustManager createDefaultTrustManager() {
        return createTrustManager((KeyStore) null);
    }

    private static final KeyStore createKeyStoreFromResource(Context context, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(openRawResource);
            ro.e(openRawResource, null);
            String resourceEntryName = resources.getResourceEntryName(i);
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) generateCertificate);
            return keyStore;
        } finally {
        }
    }

    public static final SSLSocketFactory createSSLSocketFactory(TrustManager trustManager) {
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        return sSLContext.getSocketFactory();
    }

    public static final X509TrustManager createTracerTrustManager(Context context) {
        return createTrustManager(createDefaultTrustManager(), createTrustManager(createKeyStoreFromResource(context, R.raw.rootca_ssl_rsa2022)));
    }

    private static final X509TrustManager createTrustManager(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return (X509TrustManager) rl3.L(trustManagerFactory.getTrustManagers());
    }

    private static final X509TrustManager createTrustManager(X509TrustManager... x509TrustManagerArr) {
        return new CompositeX509TrustManager(x509TrustManagerArr);
    }
}
