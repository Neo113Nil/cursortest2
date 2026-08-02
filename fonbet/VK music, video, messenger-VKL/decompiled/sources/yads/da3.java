package yads;

/* loaded from: classes10.dex */
public final class da3 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(q83 q83Var, long j, int i, int i2, int i3, p83 p83Var) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
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
            q83Var.a(this.d, this.e, i6, i3, p83Var);
            this.c = 0;
        }
    }

    public final void a(oq0 oq0Var) {
        if (this.b) {
            return;
        }
        oq0Var.a(this.a, 0, 10);
        oq0Var.b();
        byte[] bArr = this.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.b = true;
        }
    }
}
