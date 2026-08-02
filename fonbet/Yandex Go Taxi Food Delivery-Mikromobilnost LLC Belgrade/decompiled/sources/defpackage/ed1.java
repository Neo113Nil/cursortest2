package defpackage;

/* loaded from: classes10.dex */
public final class ed1 implements b5p {
    public final fd1 a;
    public final ef90 b;
    public final ef90 c;
    public final df90 d;
    public d5p e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    public ed1(int i) {
        this.a = new fd1(null, 0, "audio/mp4a-latm", true);
        this.b = new ef90(2048);
        this.g = -1L;
        ef90 ef90Var = new ef90(10);
        this.c = ef90Var;
        byte[] bArr = ef90Var.a;
        this.d = new df90(bArr, bArr.length);
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.h = false;
        this.a.d();
        this.f = j2;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.e = d5pVar;
        this.a.h(d5pVar, new xi11(0, 1));
        d5pVar.A();
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        d6z.z(this.e);
        c5pVar.getLength();
        ef90 ef90Var = this.b;
        int read = c5pVar.read(ef90Var.a, 0, 2048);
        boolean z = read == -1;
        if (!this.i) {
            this.e.w(new qb4(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        ef90Var.K(0);
        ef90Var.J(read);
        boolean z2 = this.h;
        fd1 fd1Var = this.a;
        if (!z2) {
            fd1Var.u = this.f;
            this.h = true;
        }
        fd1Var.b(ef90Var);
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        ef90 ef90Var;
        int i = 0;
        while (true) {
            ef90Var = this.c;
            c5pVar.g(0, 10, ef90Var.a);
            ef90Var.K(0);
            if (ef90Var.B() != 4801587) {
                break;
            }
            ef90Var.L(3);
            int x = ef90Var.x();
            i += x + 10;
            c5pVar.N(x);
        }
        c5pVar.J();
        c5pVar.N(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            kbh kbhVar = (kbh) c5pVar;
            kbhVar.H(ef90Var.a, 0, 2, false);
            ef90Var.K(0);
            if ((ef90Var.E() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                kbhVar.H(ef90Var.a, 0, 4, false);
                df90 df90Var = this.d;
                df90Var.m(14);
                int g = df90Var.g(13);
                if (g <= 6) {
                    i4++;
                    kbhVar.y = 0;
                    kbhVar.a(i4, false);
                } else {
                    kbhVar.a(g - 6, false);
                    i3 += g;
                }
            } else {
                i4++;
                kbhVar.y = 0;
                kbhVar.a(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public ed1() {
        this(0);
    }
}
