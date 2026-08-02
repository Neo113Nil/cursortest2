package xsna;

import java.security.SecureRandom;

/* compiled from: Random.java */
/* loaded from: classes.dex */
public final class ewe0 {
    public static final a a = new a();

    /* compiled from: Random.java */
    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
