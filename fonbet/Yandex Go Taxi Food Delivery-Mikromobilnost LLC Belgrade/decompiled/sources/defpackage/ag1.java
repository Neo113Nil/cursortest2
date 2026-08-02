package defpackage;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.reprov.x509.NetscapeCertTypeExtension;
import ru.CryptoPro.ssl.pc_10.cl_6;

/* loaded from: classes4.dex */
public final class ag1 {
    public static final ag1 c;
    public static final ag1 d;
    public static final ag1 e;
    public static final ag1 f;
    public static final ag1 g;
    public static final ag1 h;
    public static final ag1 i;
    public static final ag1 j;
    public static final ag1 k;
    public static final ag1 l;
    public static final ag1 m;
    public static final ag1 n;
    public static final ag1 o;
    public static final ag1 p;
    public static final ag1 q;
    public static final ag1 r;
    public static final ag1 s;
    public static final ag1 t;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new ag1(JCP.DIGEST_SHA1, i2);
        d = new ag1(JCP.DIGEST_SHA224, i2);
        e = new ag1(JCP.DIGEST_SHA256, i2);
        f = new ag1(JCP.DIGEST_SHA384, i2);
        g = new ag1(JCP.DIGEST_SHA512, i2);
        int i3 = 1;
        h = new ag1("TINK", i3);
        i = new ag1("CRUNCHY", i3);
        j = new ag1("NO_PREFIX", i3);
        int i4 = 2;
        k = new ag1("VERTICAL", i4);
        l = new ag1("HORIZONTAL", i4);
        int i5 = 3;
        m = new ag1(JCP.DIGEST_SHA1, i5);
        n = new ag1(JCP.DIGEST_SHA224, i5);
        o = new ag1(JCP.DIGEST_SHA256, i5);
        p = new ag1(JCP.DIGEST_SHA384, i5);
        q = new ag1(JCP.DIGEST_SHA512, i5);
        int i6 = 4;
        r = new ag1("TINK", i6);
        s = new ag1("CRUNCHY", i6);
        t = new ag1("NO_PREFIX", i6);
    }

    public ag1(String str) {
        this.a = 7;
        this.b = str.concat("_");
    }

    public static ag1 a(dl81 dl81Var) {
        String str;
        dl81Var.m(dl81Var.b + 2);
        int s2 = dl81Var.s();
        int i2 = s2 >> 1;
        int s3 = ((dl81Var.s() >> 3) & 31) | ((s2 & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        return new ag1(unr0.m(s3, s3 >= 10 ? Extension.DOT_CHAR : ".0", sb), 11);
    }

    public static void c(Set set) {
        set.remove("2.5.29.19");
        set.remove("2.5.29.17");
        if (set.isEmpty()) {
            return;
        }
        throw new CertificateException("Certificate contains unsupported critical extensions: " + set);
    }

    public static boolean d(String str, X509Certificate x509Certificate) {
        List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        return extendedKeyUsage == null || extendedKeyUsage.contains(str) || extendedKeyUsage.contains("2.5.29.37.0");
    }

    public static mf1 f() {
        return new mf1(19);
    }

    public void b(X509Certificate x509Certificate, Set set) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && (keyUsage.length <= 0 || !keyUsage[0])) {
            throw new cl_6("KeyUsage does not allow digital signatures", "End entity certificate extension check failed", x509Certificate);
        }
        if (!d(KeyUsage.STR_OID_PKIX_CODE_SIGNING, x509Certificate)) {
            throw new cl_6("Extended key usage does not permit use for code signing", "End entity certificate extension check failed", x509Certificate);
        }
        if (!this.b.equals("jce signing")) {
            if (!dv61.d(NetscapeCertTypeExtension.OBJECT_SIGNING, x509Certificate)) {
                throw new cl_6("Netscape cert type does not permit use for code signing", "End entity certificate extension check failed", x509Certificate);
            }
            set.remove("2.16.840.1.113730.1.1");
        }
        set.remove(AdESUtility.KEY_USAGE);
        set.remove(AdESUtility.EXTENDED_KEY_USAGE);
        c(set);
    }

    public String e(Object obj) {
        String obj2 = obj.toString();
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i2 = 0;
            while (i2 < length) {
                int codePointAt = obj2.codePointAt(i2);
                if (Character.isLetterOrDigit(codePointAt)) {
                    i2 += Character.charCount(codePointAt);
                }
            }
            return this.b + obj;
        }
        ny61.g(g8e.o("Invalid key: ", obj2));
        return null;
    }

    public String g() {
        return this.b;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ag1(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public /* synthetic */ ag1(mf1 mf1Var) {
        this.a = 8;
        this.b = mf1Var.b;
    }

    public ag1(gff gffVar) {
        this.a = 9;
        this.b = gffVar.f;
    }
}
