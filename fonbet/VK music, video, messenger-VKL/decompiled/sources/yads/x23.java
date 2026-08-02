package yads;

/* loaded from: classes10.dex */
public final class x23 {
    public final kc2 a = new kc2(8);
    public int b;

    public final long a(ld0 ld0Var) {
        int i = 0;
        ld0Var.b(this.a.a, 0, 1, false);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ld0Var.b(this.a.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
