package defpackage;

/* loaded from: classes3.dex */
public abstract class mju0 {
    public static final String a;

    static {
        byte[] bArr = sb2.o;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ sb2.b[i % 8]);
        }
        a = new String(bArr2, uza.a);
    }

    public static final String a() {
        return a;
    }
}
