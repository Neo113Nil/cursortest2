package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class lp3 extends Lambda implements gzs {
    public static final lp3 b = new lp3();

    public lp3() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
    }
}
