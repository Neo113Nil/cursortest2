package defpackage;

/* loaded from: classes7.dex */
public final class aa81 implements gz71 {
    public final dl81 a;
    public final nd81 b;
    public final String c;
    public fb81 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public aa81(String str) {
        dl81 dl81Var = new dl81(4);
        this.a = dl81Var;
        dl81Var.a[0] = -1;
        this.b = new nd81();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.e = xi11Var.e;
        xi11Var.b();
        this.d = yg71Var.l(xi11Var.d, 1);
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.gz71
    public final void f(dl81 dl81Var) {
        if (this.d == null) {
            ny61.k();
            return;
        }
        while (true) {
            int i = dl81Var.c;
            int i2 = dl81Var.b;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f;
            dl81 dl81Var2 = this.a;
            if (i4 == 0) {
                byte[] bArr = dl81Var.a;
                while (true) {
                    if (i2 >= i) {
                        dl81Var.m(i);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        dl81Var.m(i2 + 1);
                        this.i = false;
                        dl81Var2.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int min = Math.min(i3, 4 - this.g);
                dl81Var.d(this.g, min, dl81Var2.a);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    dl81Var2.m(0);
                    int a = dl81Var2.a();
                    nd81 nd81Var = this.b;
                    if (nd81Var.a(a)) {
                        this.k = nd81Var.c;
                        if (!this.h) {
                            int i6 = nd81Var.d;
                            this.j = (nd81Var.g * 1000000) / i6;
                            da81 da81Var = new da81();
                            da81Var.a = this.e;
                            da81Var.k = nd81Var.b;
                            da81Var.l = 4096;
                            da81Var.x = nd81Var.e;
                            da81Var.y = i6;
                            da81Var.c = this.c;
                            this.d.k(new qd81(da81Var));
                            this.h = true;
                        }
                        dl81Var2.m(0);
                        this.d.a(4, dl81Var2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    ny61.k();
                    return;
                }
                int min2 = Math.min(i3, this.k - this.g);
                this.d.a(min2, dl81Var);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.b(j, 1, i8, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
