package xsna;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class f0z0 {
    public static void a(KeyStore keyStore, CertificateFactory certificateFactory, String str, byte[] bArr) {
        Certificate certificate;
        try {
            certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            gu8.f(null, "CertManager: exception: " + gu8.b(e));
            certificate = null;
        }
        if (certificate != null) {
            try {
                keyStore.setCertificateEntry(str, certificate);
            } catch (KeyStoreException e2) {
                gu8.f(null, "CertManager: exception: " + gu8.b(e2));
            }
        }
    }

    public static SSLContext b() {
        String[] strArr = Build.VERSION.SDK_INT >= 29 ? new String[]{"TLSv1.3", "TLSv1.2", "TLS"} : new String[]{"TLSv1.2", "TLS"};
        for (int i = 0; i < strArr.length; i++) {
            try {
                return SSLContext.getInstance(strArr[i]);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return SSLContext.getInstance("SSL");
    }
}
