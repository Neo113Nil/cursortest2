package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class k7h implements s87 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public k7h() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.c = hashMap3;
        a(a150.B, JCP.DIGEST_SHA224, "DSA");
        a(a150.C, JCP.DIGEST_SHA256, "DSA");
        a(a150.D, JCP.DIGEST_SHA384, "DSA");
        a(a150.E, JCP.DIGEST_SHA512, "DSA");
        a(a150.F, JCP.DIGEST_SHA3_224, "DSA");
        a(a150.G, JCP.DIGEST_SHA3_256, "DSA");
        a(a150.H, JCP.DIGEST_SHA3_384, "DSA");
        a(a150.I, JCP.DIGEST_SHA3_512, "DSA");
        u2 u2Var = a150.N;
        a(u2Var, JCP.DIGEST_SHA3_224, "RSA");
        u2 u2Var2 = a150.O;
        a(u2Var2, JCP.DIGEST_SHA3_256, "RSA");
        u2 u2Var3 = a150.P;
        a(u2Var3, JCP.DIGEST_SHA3_384, "RSA");
        u2 u2Var4 = a150.Q;
        a(u2Var4, JCP.DIGEST_SHA3_512, "RSA");
        a(a150.J, JCP.DIGEST_SHA3_224, JCP.ECDSA_NAME);
        a(a150.K, JCP.DIGEST_SHA3_256, JCP.ECDSA_NAME);
        a(a150.L, JCP.DIGEST_SHA3_384, JCP.ECDSA_NAME);
        a(a150.M, JCP.DIGEST_SHA3_512, JCP.ECDSA_NAME);
        a(zo60.f, JCP.DIGEST_SHA1, "DSA");
        a(zo60.a, "MD4", "RSA");
        a(zo60.c, "MD4", "RSA");
        a(zo60.b, "MD5", "RSA");
        a(zo60.g, JCP.DIGEST_SHA1, "RSA");
        a(b490.U2, "MD2", "RSA");
        a(b490.W2, "MD4", "RSA");
        a(b490.Y2, "MD5", "RSA");
        a(b490.Z2, JCP.DIGEST_SHA1, "RSA");
        a(b490.g3, JCP.DIGEST_SHA224, "RSA");
        a(b490.d3, JCP.DIGEST_SHA256, "RSA");
        a(b490.e3, JCP.DIGEST_SHA384, "RSA");
        a(b490.f3, JCP.DIGEST_SHA512, "RSA");
        a(b490.h3, "SHA512(224)", "RSA");
        a(b490.i3, "SHA512(256)", "RSA");
        a(u2Var, JCP.DIGEST_SHA3_224, "RSA");
        a(u2Var2, JCP.DIGEST_SHA3_256, "RSA");
        a(u2Var3, JCP.DIGEST_SHA3_384, "RSA");
        a(u2Var4, JCP.DIGEST_SHA3_512, "RSA");
        a(p87.d1, "SHAKE128", "RSAPSS");
        a(p87.e1, "SHAKE256", "RSAPSS");
        a(cdy0.f, "RIPEMD128", "RSA");
        a(cdy0.e, "RIPEMD160", "RSA");
        a(cdy0.g, "RIPEMD256", "RSA");
        a(xc51.a, JCP.DIGEST_SHA1, JCP.ECDSA_NAME);
        a(xc51.c, JCP.DIGEST_SHA224, JCP.ECDSA_NAME);
        a(xc51.d, JCP.DIGEST_SHA256, JCP.ECDSA_NAME);
        a(xc51.e, JCP.DIGEST_SHA384, JCP.ECDSA_NAME);
        a(xc51.f, JCP.DIGEST_SHA512, JCP.ECDSA_NAME);
        a(p87.f1, "SHAKE128", JCP.ECDSA_NAME);
        a(p87.g1, "SHAKE256", JCP.ECDSA_NAME);
        a(xc51.h, JCP.DIGEST_SHA1, "DSA");
        a(han.e, JCP.DIGEST_SHA1, JCP.ECDSA_NAME);
        a(han.f, JCP.DIGEST_SHA224, JCP.ECDSA_NAME);
        a(han.g, JCP.DIGEST_SHA256, JCP.ECDSA_NAME);
        a(han.h, JCP.DIGEST_SHA384, JCP.ECDSA_NAME);
        a(han.i, JCP.DIGEST_SHA512, JCP.ECDSA_NAME);
        a(han.a, JCP.DIGEST_SHA1, "RSA");
        a(han.b, JCP.DIGEST_SHA256, "RSA");
        a(han.c, JCP.DIGEST_SHA1, "RSAandMGF1");
        a(han.d, JCP.DIGEST_SHA256, "RSAandMGF1");
        a(yd4.a, JCP.DIGEST_SHA1, "PLAIN-ECDSA");
        a(yd4.b, JCP.DIGEST_SHA224, "PLAIN-ECDSA");
        a(yd4.c, JCP.DIGEST_SHA256, "PLAIN-ECDSA");
        a(yd4.d, JCP.DIGEST_SHA384, "PLAIN-ECDSA");
        a(yd4.e, JCP.DIGEST_SHA512, "PLAIN-ECDSA");
        a(yd4.f, "RIPEMD160", "PLAIN-ECDSA");
        a(yd4.g, JCP.DIGEST_SHA3_224, "PLAIN-ECDSA");
        a(yd4.h, JCP.DIGEST_SHA3_256, "PLAIN-ECDSA");
        a(yd4.i, JCP.DIGEST_SHA3_384, "PLAIN-ECDSA");
        a(yd4.j, JCP.DIGEST_SHA3_512, "PLAIN-ECDSA");
        a(frs.c, JCP.DIGEST_SHA256, "SM2");
        a(frs.b, "SM3", "SM2");
        a(vc4.a, JCP.DIGEST_SHA512, "SPHINCS256");
        a(vc4.b, JCP.DIGEST_SHA3_512, "SPHINCS256");
        a(vc4.x0, "SHAKE256", "Picnic");
        a(vc4.w0, JCP.DIGEST_SHA512, "Picnic");
        a(vc4.y0, JCP.DIGEST_SHA3_512, "Picnic");
        hashMap.put(xc51.g, "DSA");
        hashMap.put(b490.S2, "RSA");
        hashMap.put(cdy0.d, "RSA");
        hashMap.put(uc51.J4, "RSA");
        hashMap.put(b490.c3, "RSAandMGF1");
        hashMap.put(bdf.e, "GOST3410");
        hashMap.put(bdf.f, "ECGOST3410");
        hashMap.put(new u2("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        hashMap.put(new u2("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        hashMap.put(pwk0.c, "ECGOST3410-2012-256");
        hashMap.put(pwk0.d, "ECGOST3410-2012-512");
        hashMap.put(bdf.h, "ECGOST3410");
        hashMap.put(bdf.g, "GOST3410");
        hashMap.put(pwk0.e, "ECGOST3410-2012-256");
        hashMap.put(pwk0.f, "ECGOST3410-2012-512");
        hashMap.put(xc51.b, JCP.ECDSA_NAME);
        hashMap2.put(b490.l3, "MD2");
        hashMap2.put(b490.m3, "MD4");
        hashMap2.put(b490.n3, "MD5");
        hashMap2.put(zo60.e, JCP.DIGEST_SHA1);
        hashMap2.put(a150.d, JCP.DIGEST_SHA224);
        hashMap2.put(a150.a, JCP.DIGEST_SHA256);
        hashMap2.put(a150.b, JCP.DIGEST_SHA384);
        hashMap2.put(a150.c, JCP.DIGEST_SHA512);
        hashMap2.put(a150.e, "SHA512(224)");
        hashMap2.put(a150.f, "SHA512(256)");
        hashMap2.put(a150.k, "SHAKE128");
        hashMap2.put(a150.l, "SHAKE256");
        hashMap2.put(a150.g, JCP.DIGEST_SHA3_224);
        hashMap2.put(a150.h, JCP.DIGEST_SHA3_256);
        hashMap2.put(a150.i, JCP.DIGEST_SHA3_384);
        hashMap2.put(a150.j, JCP.DIGEST_SHA3_512);
        hashMap2.put(cdy0.b, "RIPEMD128");
        hashMap2.put(cdy0.a, "RIPEMD160");
        hashMap2.put(cdy0.c, "RIPEMD256");
        hashMap2.put(bdf.a, JCP.GOST_DIGEST_NAME);
        hashMap2.put(new u2("1.3.6.1.4.1.5849.1.2.1"), JCP.GOST_DIGEST_NAME);
        hashMap2.put(pwk0.a, "GOST3411-2012-256");
        hashMap2.put(pwk0.b, "GOST3411-2012-512");
        hashMap2.put(frs.a, "SM3");
        hashMap3.put(ekn.a, "Ed25519");
        hashMap3.put(ekn.b, "Ed448");
        hashMap3.put(b490.F3, "LMS");
        hashMap3.put(si20.d, "COMPOSITE");
        hashMap3.put(vc4.A0, "Falcon-512");
        hashMap3.put(vc4.B0, "Falcon-1024");
        u2 u2Var5 = vc4.D0;
        hashMap3.put(u2Var5, "Dilithium2");
        u2 u2Var6 = vc4.E0;
        hashMap3.put(u2Var6, "Dilithium3");
        u2 u2Var7 = vc4.F0;
        hashMap3.put(u2Var7, "Dilithium5");
        hashMap3.put(vc4.k0, "SPHINCS+-SHA2-128s");
        hashMap3.put(vc4.j0, "SPHINCS+-SHA2-128f");
        hashMap3.put(vc4.m0, "SPHINCS+-SHA2-192s");
        hashMap3.put(vc4.l0, "SPHINCS+-SHA2-192f");
        hashMap3.put(vc4.o0, "SPHINCS+-SHA2-256s");
        hashMap3.put(vc4.n0, "SPHINCS+-SHA2-256f");
        hashMap3.put(vc4.q0, "SPHINCS+-SHAKE-128s");
        hashMap3.put(vc4.p0, "SPHINCS+-SHAKE-128f");
        hashMap3.put(vc4.s0, "SPHINCS+-SHAKE-192s");
        hashMap3.put(vc4.r0, "SPHINCS+-SHAKE-192f");
        hashMap3.put(vc4.u0, "SPHINCS+-SHAKE-256s");
        hashMap3.put(vc4.t0, "SPHINCS+-SHAKE-256f");
        hashMap3.put(u2Var5, "Dilithium2");
        hashMap3.put(u2Var6, "Dilithium3");
        hashMap3.put(u2Var7, "Dilithium5");
        hashMap3.put(vc4.v0, "Picnic");
    }

    public final void a(u2 u2Var, String str, String str2) {
        this.b.put(u2Var, str);
        this.a.put(u2Var, str2);
    }

    @Override // defpackage.s87
    public final String getSignatureName(xr1 xr1Var, xr1 xr1Var2) {
        u2 u2Var = xr1Var2.a;
        String str = (String) this.c.get(u2Var);
        if (str != null) {
            return str;
        }
        u2 u2Var2 = vc4.y;
        String str2 = u2Var.a;
        String str3 = u2Var.a;
        String str4 = u2Var2.a;
        if (str2.length() > str4.length() && str2.charAt(str4.length()) == '.' && str2.startsWith(str4)) {
            return "SPHINCSPlus";
        }
        HashMap hashMap = this.b;
        String str5 = (String) hashMap.get(u2Var);
        if (str5 == null) {
            str5 = str3;
        }
        boolean equals = str5.equals(str3);
        HashMap hashMap2 = this.a;
        if (!equals) {
            StringBuilder v = oyr.v(str5, "with");
            String str6 = (String) hashMap2.get(u2Var);
            if (str6 != null) {
                str3 = str6;
            }
            v.append(str3);
            return v.toString();
        }
        StringBuilder sb = new StringBuilder();
        u2 u2Var3 = xr1Var.a;
        String str7 = (String) hashMap.get(u2Var3);
        if (str7 == null) {
            str7 = u2Var3.a;
        }
        sb.append(str7);
        sb.append("with");
        String str8 = (String) hashMap2.get(u2Var);
        if (str8 != null) {
            str3 = str8;
        }
        sb.append(str3);
        return sb.toString();
    }
}
