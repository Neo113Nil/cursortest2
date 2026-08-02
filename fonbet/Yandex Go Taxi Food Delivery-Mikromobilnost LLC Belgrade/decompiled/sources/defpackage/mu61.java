package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.util.cpSSLConfig;
import ru.CryptoPro.sspiSSL.gost.GostConstants;

/* loaded from: classes4.dex */
public final class mu61 implements Comparable {
    public static final HashMap A;
    public static final HashMap B;
    public final String a;
    public final String b;
    public final int c;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;

    static {
        GetProperty.getBooleanProperty("com.sun.net.ssl.enableECC", true);
        A = new HashMap();
        B = new HashMap();
        b("SSL_NULL_WITH_NULL_NULL", 0, 1, false, 65535, 0);
        int i = or61.z.a;
        int i2 = or61.B.a;
        int i3 = or61.C.a;
        b(GostConstants.TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_L, 49411, 599, true, i3, i3);
        b(GostConstants.TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_S, 49413, 598, true, i3, i3);
        b(GostConstants.TLS_GOSTR341112_256_WITH_MAGMA_MGM_L, 49412, 597, true, i3, i3);
        b(GostConstants.TLS_GOSTR341112_256_WITH_MAGMA_MGM_S, 49414, 596, true, i3, i3);
        b("TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC", 49408, 595, true, i2, i2);
        b("TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC", 49409, 594, true, i2, i2);
        b("TLS_CIPHER_2012_IANA", 49410, 593, true, i2, i2);
        b("TLS_CIPHER_2012", 65413, 592, true, i2, 0);
        int i4 = 591;
        b("TLS_CIPHER_2001", HProv.PP_SECURITY_LEVEL, 591, true, i2, 0);
        if (cpSSLConfig.isUseForeignTLS()) {
            b(GostConstants.TLS_AES_128_GCM_SHA256, 4865, 590, true, i3, i3);
            b(GostConstants.TLS_AES_256_GCM_SHA384, 4866, 589, true, i3, i3);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, 49196, 588, true, i2, i2);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, 49195, 587, true, i2, i2);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, 49188, 586, true, i2, i2);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, 49187, 585, true, i2, i2);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, 49162, 584, true, i2, 0);
            b(GostConstants.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, 49161, 583, true, i2, 0);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, 49200, 582, true, i2, i2);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, 49199, 581, true, i2, i2);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, 49192, 580, true, i2, i2);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, 49191, 579, true, i2, i2);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, 49172, 578, true, i2, 0);
            b(GostConstants.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, 49171, 577, true, i2, 0);
            b(GostConstants.TLS_RSA_WITH_AES_256_GCM_SHA384, 157, 576, true, i2, i2);
            b(GostConstants.TLS_RSA_WITH_AES_128_GCM_SHA256, 156, 575, true, i2, i2);
            b(GostConstants.TLS_RSA_WITH_AES_256_CBC_SHA256, 61, 574, true, i2, i2);
            b(GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA256, 60, 573, true, i2, i2);
            b(GostConstants.TLS_RSA_WITH_AES_256_CBC_SHA, 53, 572, true, i2, 0);
            b(GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA, 47, 571, true, i2, 0);
            i4 = 570;
            b(GostConstants.TLS_RSA_WITH_3DES_EDE_CBC_SHA, 10, 570, true, i2, 0);
        }
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255, i4 - 1, true, 65535, 0);
        a(0);
        a(255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r3.equals(ru.CryptoPro.sspiSSL.gost.GostConstants.TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_L) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mu61(String str, int i) {
        String str2;
        this.a = str;
        this.c = i;
        char c = 0;
        this.x = false;
        this.w = 0;
        this.y = 65535;
        this.z = 0;
        switch (str.hashCode()) {
            case -2056274553:
                break;
            case -2056274546:
                if (str.equals(GostConstants.TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_S)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1652724141:
                if (str.equals(GostConstants.TLS_GOSTR341112_256_WITH_MAGMA_MGM_L)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1652724134:
                if (str.equals(GostConstants.TLS_GOSTR341112_256_WITH_MAGMA_MGM_S)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1173416689:
                if (str.equals("TLS_CIPHER_2001")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1173416657:
                if (str.equals("TLS_CIPHER_2012")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -808942569:
                if (str.equals("TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -252080181:
                if (str.equals("TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1655092699:
                if (str.equals("TLS_CIPHER_2012_IANA")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 6:
                str2 = "GR3410_2012_256_KUZN";
                break;
            case 2:
            case 3:
            case 7:
                str2 = "GR3410_2012_256_MAGMA";
                break;
            case 4:
                str2 = "GR3410";
                break;
            case 5:
            case '\b':
                str2 = "GR3410_2012_256";
                break;
            default:
                str2 = "NULL";
                break;
        }
        this.b = str2;
    }

    public static void a(int i) {
        int i2 = i & 255;
        if (((mu61) A.get(Integer.valueOf(i2))) == null) {
            String num = Integer.toString(0, 16);
            String num2 = Integer.toString(i2, 16);
            StringBuilder sb = new StringBuilder("Unknown 0x");
            sb.append(num);
            sb.append(":0x");
            sb.append(num2);
        }
    }

    public static void b(String str, int i, int i2, boolean z, int i3, int i4) {
        mu61 mu61Var = new mu61(str, i, i2, z, i3, i4);
        if (A.put(Integer.valueOf(i), mu61Var) != null || (z && B.put(str, mu61Var) != null)) {
            kbs.g(oyr.k(i, "Duplicate ciphersuite definition: ", Extension.FIX_SPACE, str));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((mu61) obj).w - this.w;
    }

    public final String toString() {
        return this.a;
    }

    public mu61(String str, int i, int i2, boolean z, int i3, int i4) {
        String str2;
        this.a = str;
        this.c = i;
        this.w = i2;
        this.x = z;
        this.y = i3;
        this.z = i4;
        switch (str) {
            case "TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_L":
            case "TLS_GOSTR341112_256_WITH_KUZNYECHIK_MGM_S":
            case "TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC":
                str2 = "GR3410_2012_256_KUZN";
                break;
            case "TLS_GOSTR341112_256_WITH_MAGMA_MGM_L":
            case "TLS_GOSTR341112_256_WITH_MAGMA_MGM_S":
            case "TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC":
                str2 = "GR3410_2012_256_MAGMA";
                break;
            case "TLS_CIPHER_2001":
                str2 = "GR3410";
                break;
            case "TLS_CIPHER_2012":
            case "TLS_CIPHER_2012_IANA":
                str2 = "GR3410_2012_256";
                break;
            default:
                str2 = "NULL";
                break;
        }
        this.b = str2;
    }
}
