package defpackage;

import com.ybsdk.rconfig.b;

/* loaded from: classes9.dex */
public final class a910 {
    public static final String b;
    public final b a;

    static {
        byte[] bArr = tje.b2;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        b = new String(bArr2, uza.a);
    }

    public a910(b bVar) {
        this.a = bVar;
    }
}
