package defpackage;

/* loaded from: classes10.dex */
public final class ayf0 {
    public final /* synthetic */ int a;
    public final sez0 b;
    public final ef90 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public ayf0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new sez0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new ef90();
                break;
            default:
                this.b = new sez0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new ef90();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(ef90 ef90Var) {
        int i = ef90Var.b;
        if (ef90Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ef90Var.i(0, 9, bArr);
        ef90Var.K(i);
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

    public final void a(c5p c5pVar) {
        int i = this.a;
        ef90 ef90Var = this.c;
        switch (i) {
            case 0:
                byte[] bArr = tw21.c;
                ef90Var.getClass();
                ef90Var.I(bArr.length, bArr);
                this.d = true;
                c5pVar.J();
                break;
            default:
                byte[] bArr2 = tw21.c;
                ef90Var.getClass();
                ef90Var.I(bArr2.length, bArr2);
                this.d = true;
                c5pVar.J();
                break;
        }
    }
}
