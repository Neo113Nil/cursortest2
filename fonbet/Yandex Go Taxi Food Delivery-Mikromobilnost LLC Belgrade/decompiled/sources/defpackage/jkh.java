package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class jkh {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(b490.c3, "RSASSA-PSS");
        hashMap.put(ekn.a, "ED25519");
        hashMap.put(ekn.b, "ED448");
        hashMap.put(new u2("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(b490.g3, "SHA224WITHRSA");
        hashMap.put(b490.d3, "SHA256WITHRSA");
        hashMap.put(b490.e3, "SHA384WITHRSA");
        hashMap.put(b490.f3, "SHA512WITHRSA");
        hashMap.put(p87.d1, "SHAKE128WITHRSAPSS");
        hashMap.put(p87.e1, "SHAKE256WITHRSAPSS");
        hashMap.put(bdf.g, "GOST3411WITHGOST3410");
        hashMap.put(bdf.h, "GOST3411WITHECGOST3410");
        hashMap.put(pwk0.e, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(pwk0.f, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(yd4.a, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(yd4.b, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(yd4.c, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(yd4.d, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(yd4.e, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(yd4.g, "SHA3-224WITHPLAIN-ECDSA");
        hashMap.put(yd4.h, "SHA3-256WITHPLAIN-ECDSA");
        hashMap.put(yd4.i, "SHA3-384WITHPLAIN-ECDSA");
        hashMap.put(yd4.j, "SHA3-512WITHPLAIN-ECDSA");
        hashMap.put(yd4.f, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(han.e, "SHA1WITHCVC-ECDSA");
        hashMap.put(han.f, "SHA224WITHCVC-ECDSA");
        hashMap.put(han.g, "SHA256WITHCVC-ECDSA");
        hashMap.put(han.h, "SHA384WITHCVC-ECDSA");
        hashMap.put(han.i, "SHA512WITHCVC-ECDSA");
        hashMap.put(jzw.a, "XMSS");
        hashMap.put(jzw.b, "XMSSMT");
        hashMap.put(cdy0.f, "RIPEMD128WITHRSA");
        hashMap.put(cdy0.e, "RIPEMD160WITHRSA");
        hashMap.put(cdy0.g, "RIPEMD256WITHRSA");
        hashMap.put(new u2("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new u2("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new u2("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(xc51.a, "SHA1WITHECDSA");
        hashMap.put(xc51.c, "SHA224WITHECDSA");
        hashMap.put(xc51.d, "SHA256WITHECDSA");
        hashMap.put(xc51.e, "SHA384WITHECDSA");
        hashMap.put(xc51.f, "SHA512WITHECDSA");
        hashMap.put(p87.f1, "SHAKE128WITHECDSA");
        hashMap.put(p87.g1, "SHAKE256WITHECDSA");
        hashMap.put(zo60.g, "SHA1WITHRSA");
        hashMap.put(zo60.f, "SHA1WITHDSA");
        hashMap.put(a150.B, "SHA224WITHDSA");
        hashMap.put(a150.C, "SHA256WITHDSA");
        hashMap2.put(zo60.e, JCP.DIGEST_SHA1);
        hashMap2.put(a150.d, JCP.DIGEST_SHA224);
        hashMap2.put(a150.a, JCP.DIGEST_SHA256);
        hashMap2.put(a150.b, JCP.DIGEST_SHA384);
        hashMap2.put(a150.c, JCP.DIGEST_SHA512);
        hashMap2.put(a150.g, JCP.DIGEST_SHA3_224);
        hashMap2.put(a150.h, JCP.DIGEST_SHA3_256);
        hashMap2.put(a150.i, JCP.DIGEST_SHA3_384);
        hashMap2.put(a150.j, JCP.DIGEST_SHA3_512);
        hashMap2.put(cdy0.b, "RIPEMD128");
        hashMap2.put(cdy0.a, "RIPEMD160");
        hashMap2.put(cdy0.c, "RIPEMD256");
    }

    public static String a(u2 u2Var) {
        String str = (String) b.get(u2Var);
        return str != null ? str : u2Var.a;
    }
}
