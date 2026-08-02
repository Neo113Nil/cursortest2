package defpackage;

/* loaded from: classes5.dex */
public abstract class jds {
    public static final String a;

    static {
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            bArr[i] = (byte) (te91.c[i] ^ te91.a[i % 8]);
        }
        a = new String(bArr, uza.a);
    }

    public static String a() {
        return a;
    }
}
