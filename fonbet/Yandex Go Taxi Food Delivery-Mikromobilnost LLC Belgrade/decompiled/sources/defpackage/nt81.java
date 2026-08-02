package defpackage;

/* loaded from: classes7.dex */
public final class nt81 {
    public final fb81 a;
    public je81 d;
    public w181 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final or71 b = new or71();
    public final dl81 c = new dl81();
    public final dl81 j = new dl81(1);
    public final dl81 k = new dl81();

    public nt81(fb81 fb81Var, je81 je81Var, w181 w181Var) {
        this.a = fb81Var;
        this.d = je81Var;
        this.e = w181Var;
        this.d = je81Var;
        this.e = w181Var;
        fb81Var.k(je81Var.a.f);
        c();
    }

    public final int a(int i, int i2) {
        dl81 dl81Var;
        ro71 b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        or71 or71Var = this.b;
        if (i3 != 0) {
            dl81Var = or71Var.n;
        } else {
            byte[] bArr = b.e;
            int i4 = rf71.a;
            int length = bArr.length;
            dl81 dl81Var2 = this.k;
            dl81Var2.a = bArr;
            dl81Var2.c = length;
            dl81Var2.b = 0;
            i3 = bArr.length;
            dl81Var = dl81Var2;
        }
        boolean z = or71Var.k && or71Var.l[this.f];
        boolean z2 = z || i2 != 0;
        dl81 dl81Var3 = this.j;
        dl81Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        dl81Var3.m(0);
        fb81 fb81Var = this.a;
        fb81Var.a(1, dl81Var3);
        fb81Var.a(i3, dl81Var);
        if (!z2) {
            return i3 + 1;
        }
        dl81 dl81Var4 = this.c;
        if (!z) {
            dl81Var4.i(8);
            byte[] bArr2 = dl81Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            fb81Var.a(8, dl81Var4);
            return i3 + 9;
        }
        dl81 dl81Var5 = or71Var.n;
        int x = dl81Var5.x();
        dl81Var5.m(dl81Var5.b - 2);
        int i5 = (x * 6) + 2;
        if (i2 != 0) {
            dl81Var4.i(i5);
            byte[] bArr3 = dl81Var4.a;
            dl81Var5.d(0, i5, bArr3);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
        } else {
            dl81Var4 = dl81Var5;
        }
        fb81Var.a(i5, dl81Var4);
        return i3 + 1 + i5;
    }

    public final ro71 b() {
        if (!this.l) {
            return null;
        }
        or71 or71Var = this.b;
        w181 w181Var = or71Var.a;
        int i = rf71.a;
        int i2 = w181Var.a;
        ro71 ro71Var = or71Var.m;
        if (ro71Var == null) {
            ro71Var = this.d.a.k[i2];
        }
        if (ro71Var == null || !ro71Var.a) {
            return null;
        }
        return ro71Var;
    }

    public final void c() {
        or71 or71Var = this.b;
        or71Var.d = 0;
        or71Var.p = 0L;
        or71Var.q = false;
        or71Var.k = false;
        or71Var.o = false;
        or71Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
