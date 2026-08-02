package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class ea3 extends Lambda implements gzs {
    public static final ea3 b = new ea3();

    public ea3() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            return null;
        }
    }
}
