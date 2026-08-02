package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class i6i0 {
    public static final wc2 a = new wc2(4);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
