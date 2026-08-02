package yads;

/* loaded from: classes10.dex */
public final class am2 extends tp {
    public am2(c83 c83Var, long j, long j2) {
        super(new op(), new zl2(c83Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
