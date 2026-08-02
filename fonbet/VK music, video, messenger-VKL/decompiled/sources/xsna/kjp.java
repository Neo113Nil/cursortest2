package xsna;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* loaded from: classes13.dex */
public final class kjp {
    public static boolean a = true;

    public static SecureRandom a() {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            c2f0.b("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            secureRandom = null;
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                c2f0.b("EncryptUtil", "NoSuchAlgorithmException");
                return secureRandom;
            } catch (Throwable th) {
                if (a) {
                    c2f0.b("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                    a = false;
                }
                return secureRandom;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    public static byte[] b(int i) {
        SecureRandom a2 = a();
        if (a2 == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[i];
            a2.nextBytes(bArr);
            return bArr;
        } catch (NullPointerException e) {
            c2f0.b("EncryptUtil", "secureRandom nextBytes error is : " + e.getMessage());
            return new byte[0];
        }
    }

    public static String c(int i) {
        return zq70.l(b(i));
    }
}
