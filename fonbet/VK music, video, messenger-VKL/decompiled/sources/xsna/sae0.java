package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: PsDurationReader.java */
/* loaded from: classes12.dex */
public final class sae0 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final txo0 a = new txo0(0);
    public long f = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public final xi90 b = new xi90();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(xi90 xi90Var) {
        int i = xi90Var.b;
        if (xi90Var.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        xi90Var.n(bArr, 0, 9);
        xi90Var.P(i);
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
        return C.TIME_UNSET;
    }

    public final void a(qgq qgqVar) {
        byte[] bArr = y2r0.b;
        xi90 xi90Var = this.b;
        xi90Var.getClass();
        xi90Var.N(bArr, bArr.length);
        this.c = true;
        qgqVar.resetPeekPosition();
    }
}
