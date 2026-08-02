package defpackage;

/* loaded from: classes7.dex */
public final class c371 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(bb71 bb71Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        bb71Var.s(0, 10, bArr);
        bb71Var.c();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r1 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.b = true;
    }

    public final void b(fb81 fb81Var, long j, int i, int i2, int i3, v781 v781Var) {
        if (!(this.g <= i2 + i3)) {
            ny61.r("TrueHD chunk samples must be contiguous in the sample queue.");
            return;
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            int i6 = this.f + i2;
            this.f = i6;
            this.g = i3;
            if (i5 < 16 || i5 <= 0) {
                return;
            }
            fb81Var.b(this.d, this.e, i6, i3, v781Var);
            this.c = 0;
        }
    }
}
