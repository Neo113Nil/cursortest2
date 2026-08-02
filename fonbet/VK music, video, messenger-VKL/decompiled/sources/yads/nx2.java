package yads;

import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.i7o0;
import xsna.jw5;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class nx2 {
    public final u20 a;
    public KeyStore c;
    public X509TrustManager d;
    public final Lazy b = new bpn0(mx2.b);
    public final Object e = new Object();

    public nx2(u20 u20Var) {
        this.a = u20Var;
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        s3q0 s3q0Var;
        try {
            ((X509TrustManager) this.b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (this.e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
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

    public final void b() {
        if (!Thread.holdsLock(this.e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.c == null) {
            Lazy lazy = fa3.a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore != null) {
                ou2 ou2Var = (ou2) this.a;
                ou2Var.getClass();
                try {
                    InputStream openRawResource = ou2Var.b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] h = i7o0.h(openRawResource);
                        openRawResource.close();
                        try {
                            openRawResource = ou2Var.a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] h2 = i7o0.h(openRawResource);
                                openRawResource.close();
                                byte[][] bArr = (byte[][]) jw5.z(new byte[][]{h2}, new byte[][]{h});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    Lazy lazy2 = fa3.a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) fa3.a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } finally {
                            }
                        } catch (IOException e) {
                            throw new IllegalStateException("Failed to create cert", e);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Failed to create cert", e2);
                }
            }
            this.c = keyStore2;
        }
        b();
        if (this.d == null) {
            b();
            if (this.c != null) {
                b();
                this.d = fa3.a(this.c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException unused) {
        }
    }
}
