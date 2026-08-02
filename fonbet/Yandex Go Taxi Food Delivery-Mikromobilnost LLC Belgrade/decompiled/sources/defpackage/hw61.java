package defpackage;

import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import org.apache.xml.security.utils.Base64;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public final class hw61 implements dw61 {
    public final X509Certificate a;
    public final String b;
    public final String c;

    public hw61(X509Certificate x509Certificate, String str) {
        this.a = x509Certificate;
        this.b = XAdESUtility.findDigestUriByKey(x509Certificate.getPublicKey());
        this.c = str;
    }

    public final String a() {
        X509Certificate x509Certificate = this.a;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XAdESUtility.findDigestNameByKey(x509Certificate.getPublicKey()), this.c);
            messageDigest.update(x509Certificate.getEncoded());
            return Base64.encode(messageDigest.digest());
        } catch (Exception e) {
            throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
        }
    }

    public final byte[] b() {
        try {
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(this.a.getEncoded());
            return new r0x(jc51.m(x509CertificateHolder.a.b.x), x509CertificateHolder.a.b.c.x()).getEncoded();
        } catch (Exception e) {
            throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
        }
    }
}
