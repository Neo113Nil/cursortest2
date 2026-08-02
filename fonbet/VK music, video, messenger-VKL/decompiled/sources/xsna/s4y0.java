package xsna;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import one.video.calls.sdk_private.f;

/* compiled from: CertificateMessage.java */
/* loaded from: classes8.dex */
public final class s4y0 extends bdy0 {
    public byte[] a;
    public X509Certificate b;
    public List<X509Certificate> c;
    public byte[] d;

    @Override // xsna.bdy0
    public final f.d c() {
        return f.d.certificate;
    }

    @Override // xsna.bdy0
    public final byte[] d() {
        return this.d;
    }

    public final void e(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.h {
        int i = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        int i2 = 0;
        while (i > 0) {
            int i3 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            if (i3 > 0) {
                try {
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(bArr));
                    if (i2 == 0) {
                        this.b = x509Certificate;
                    }
                    this.c.add(x509Certificate);
                } catch (CertificateException unused) {
                    throw new one.video.calls.sdk_private.h("could not parse certificate");
                }
            }
            int i4 = i - (i3 + 3);
            i2++;
            int i5 = byteBuffer.getShort() & 65535;
            byteBuffer.get(new byte[i5]);
            i = i4 - (i5 + 2);
        }
    }
}
