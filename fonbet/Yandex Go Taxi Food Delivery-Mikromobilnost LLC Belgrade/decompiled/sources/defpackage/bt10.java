package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class bt10 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap.put(b490.l3, "MD2");
        hashMap.put(b490.m3, "MD4");
        hashMap.put(b490.n3, "MD5");
        u2 u2Var = zo60.e;
        hashMap.put(u2Var, "SHA-1");
        u2 u2Var2 = a150.d;
        hashMap.put(u2Var2, JCP.DIGEST_SHA_224);
        u2 u2Var3 = a150.a;
        hashMap.put(u2Var3, JCP.DIGEST_SHA_256);
        u2 u2Var4 = a150.b;
        hashMap.put(u2Var4, JCP.DIGEST_SHA_384);
        u2 u2Var5 = a150.c;
        hashMap.put(u2Var5, JCP.DIGEST_SHA_512);
        hashMap.put(a150.e, "SHA-512(224)");
        hashMap.put(a150.f, "SHA-512(256)");
        hashMap.put(cdy0.b, "RIPEMD-128");
        hashMap.put(cdy0.a, "RIPEMD-160");
        hashMap.put(cdy0.c, "RIPEMD-128");
        hashMap.put(w3v.b, "RIPEMD-128");
        hashMap.put(w3v.a, "RIPEMD-160");
        hashMap.put(bdf.a, JCP.GOST_DIGEST_NAME);
        hashMap.put(grs.a, "Tiger");
        hashMap.put(w3v.c, "Whirlpool");
        u2 u2Var6 = a150.g;
        hashMap.put(u2Var6, JCP.DIGEST_SHA3_224);
        u2 u2Var7 = a150.h;
        hashMap.put(u2Var7, JCP.DIGEST_SHA3_256);
        u2 u2Var8 = a150.i;
        hashMap.put(u2Var8, JCP.DIGEST_SHA3_384);
        u2 u2Var9 = a150.j;
        hashMap.put(u2Var9, JCP.DIGEST_SHA3_512);
        hashMap.put(a150.k, "SHAKE128");
        hashMap.put(a150.l, "SHAKE256");
        hashMap.put(frs.a, "SM3");
        u2 u2Var10 = si20.c;
        hashMap.put(u2Var10, "BLAKE3-256");
        hashMap2.put("SHA-1", new xr1(u2Var, zpf.b));
        hashMap2.put(JCP.DIGEST_SHA_224, new xr1(u2Var2));
        hashMap2.put(JCP.DIGEST_SHA224, new xr1(u2Var2));
        hashMap2.put(JCP.DIGEST_SHA_256, new xr1(u2Var3));
        hashMap2.put(JCP.DIGEST_SHA256, new xr1(u2Var3));
        hashMap2.put(JCP.DIGEST_SHA_384, new xr1(u2Var4));
        hashMap2.put(JCP.DIGEST_SHA384, new xr1(u2Var4));
        hashMap2.put(JCP.DIGEST_SHA_512, new xr1(u2Var5));
        hashMap2.put(JCP.DIGEST_SHA512, new xr1(u2Var5));
        hashMap2.put(JCP.DIGEST_SHA3_224, new xr1(u2Var6));
        hashMap2.put(JCP.DIGEST_SHA3_256, new xr1(u2Var7));
        hashMap2.put(JCP.DIGEST_SHA3_384, new xr1(u2Var8));
        hashMap2.put(JCP.DIGEST_SHA3_512, new xr1(u2Var9));
        hashMap2.put("BLAKE3-256", new xr1(u2Var10));
    }
}
