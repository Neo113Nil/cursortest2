package yads;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import xsna.epx;

/* loaded from: classes10.dex */
public abstract class ct2 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        if (!epx.f(certificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            certificateFactory.getType();
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState != null && (byteArray = saveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (generateCertificate instanceof X509Certificate) {
                    return (X509Certificate) generateCertificate;
                }
            } catch (CertificateException unused) {
            }
        }
        return null;
    }
}
