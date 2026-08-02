package yads;

/* loaded from: classes10.dex */
public final class yk3 extends r63 {
    public final kc2 b;
    public final kc2 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public yk3(q83 q83Var) {
        super(q83Var);
        this.b = new kc2(ez1.a);
        this.c = new kc2(4);
    }

    public final boolean a(kc2 kc2Var) {
        int m = kc2Var.m();
        int i = (m >> 4) & 15;
        int i2 = m & 15;
        if (i2 != 7) {
            throw new q63(nh2.a("Video format not supported: ", i2));
        }
        this.g = i;
        return i != 5;
    }

    public final boolean a(long j, kc2 kc2Var) {
        int m = kc2Var.m();
        byte[] bArr = kc2Var.a;
        int i = kc2Var.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        int i4 = i + 3;
        kc2Var.b = i4;
        long j2 = (((bArr[i2] & 255) | i3) * 1000) + j;
        if (m == 0 && !this.e) {
            byte[] bArr2 = new byte[kc2Var.c - i4];
            kc2 kc2Var2 = new kc2(bArr2);
            kc2Var.a(bArr2, 0, kc2Var.c - kc2Var.b);
            ul a = ul.a(kc2Var2);
            this.d = a.b;
            mx0 mx0Var = new mx0();
            mx0Var.k = "video/avc";
            mx0Var.h = a.f;
            mx0Var.p = a.c;
            mx0Var.q = a.d;
            mx0Var.t = a.e;
            mx0Var.m = a.a;
            this.a.a(new nx0(mx0Var));
            this.e = true;
            return false;
        }
        if (m != 1 || !this.e) {
            return false;
        }
        int i5 = this.g == 1 ? 1 : 0;
        if (!this.f && i5 == 0) {
            return false;
        }
        byte[] bArr3 = this.c.a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i6 = 4 - this.d;
        int i7 = 0;
        while (kc2Var.c - kc2Var.b > 0) {
            kc2Var.a(this.c.a, i6, this.d);
            this.c.e(0);
            int p = this.c.p();
            this.b.e(0);
            this.a.a(4, this.b);
            this.a.a(p, kc2Var);
            i7 = i7 + 4 + p;
        }
        this.a.a(j2, i5, i7, 0, null);
        this.f = true;
        return true;
    }
}
