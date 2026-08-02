package yads;

/* loaded from: classes10.dex */
public final class sx0 {
    public final q83 a;
    public r83 d;
    public re0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final k83 b = new k83();
    public final kc2 c = new kc2();
    public final kc2 j = new kc2(1);
    public final kc2 k = new kc2();

    public sx0(q83 q83Var, r83 r83Var, re0 re0Var) {
        this.a = q83Var;
        this.d = r83Var;
        this.e = re0Var;
        a(r83Var, re0Var);
    }

    public final j83 a() {
        if (!this.l) {
            return null;
        }
        k83 k83Var = this.b;
        re0 re0Var = k83Var.a;
        int i = mc3.a;
        int i2 = re0Var.a;
        j83 j83Var = k83Var.m;
        if (j83Var == null) {
            j83[] j83VarArr = this.d.a.k;
            j83Var = j83VarArr == null ? null : j83VarArr[i2];
        }
        if (j83Var == null || !j83Var.a) {
            return null;
        }
        return j83Var;
    }

    public final void b() {
        k83 k83Var = this.b;
        k83Var.d = 0;
        k83Var.p = 0L;
        k83Var.q = false;
        k83Var.k = false;
        k83Var.o = false;
        k83Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final int a(int i, int i2) {
        kc2 kc2Var;
        j83 a = a();
        if (a == null) {
            return 0;
        }
        int i3 = a.d;
        if (i3 != 0) {
            kc2Var = this.b.n;
        } else {
            byte[] bArr = a.e;
            int i4 = mc3.a;
            kc2 kc2Var2 = this.k;
            int length = bArr.length;
            kc2Var2.a = bArr;
            kc2Var2.c = length;
            kc2Var2.b = 0;
            i3 = bArr.length;
            kc2Var = kc2Var2;
        }
        k83 k83Var = this.b;
        boolean z = k83Var.k && k83Var.l[this.f];
        boolean z2 = z || i2 != 0;
        kc2 kc2Var3 = this.j;
        kc2Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        kc2Var3.e(0);
        this.a.a(1, this.j);
        this.a.a(i3, kc2Var);
        if (!z2) {
            return i3 + 1;
        }
        if (!z) {
            this.c.c(8);
            kc2 kc2Var4 = this.c;
            byte[] bArr2 = kc2Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            this.a.a(8, kc2Var4);
            return i3 + 9;
        }
        kc2 kc2Var5 = this.b.n;
        int r = kc2Var5.r();
        kc2Var5.e(kc2Var5.b - 2);
        int i5 = (r * 6) + 2;
        if (i2 != 0) {
            this.c.c(i5);
            byte[] bArr3 = this.c.a;
            kc2Var5.a(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            kc2Var5 = this.c;
        }
        this.a.a(i5, kc2Var5);
        return i3 + 1 + i5;
    }

    public final void a(r83 r83Var, re0 re0Var) {
        this.d = r83Var;
        this.e = re0Var;
        this.a.a(r83Var.a.f);
        b();
    }
}
