package defpackage;

/* loaded from: classes7.dex */
public final class g471 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final lo61 a = new lo61(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final dl81 b = new dl81();

    public static long a(dl81 dl81Var) {
        int i = dl81Var.b;
        if (dl81Var.c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dl81Var.d(0, 9, bArr);
        dl81Var.m(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
