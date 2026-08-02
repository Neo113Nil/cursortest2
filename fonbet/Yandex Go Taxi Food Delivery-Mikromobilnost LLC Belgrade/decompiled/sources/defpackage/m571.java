package defpackage;

/* loaded from: classes7.dex */
public final class m571 implements n771 {
    public final dz61 a = new dz61(null, 1);
    public final dl81 b = new dl81(16384);
    public boolean c;

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        dz61 dz61Var = this.a;
        dz61Var.getClass();
        dz61Var.e = "0";
        dz61Var.f = yg71Var.l(0, 1);
        yg71Var.mo495a();
        yg71Var.r(new w471(-9223372036854775807L, 0L));
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        dl81 dl81Var = this.b;
        int v = ((w971) bb71Var).v(0, 16384, dl81Var.a);
        if (v == -1) {
            return -1;
        }
        dl81Var.m(0);
        dl81Var.k(v);
        boolean z = this.c;
        dz61 dz61Var = this.a;
        if (!z) {
            dz61Var.c(4, 0L);
            this.c = true;
        }
        dz61Var.f(dl81Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(bb71 bb71Var) {
        w971 w971Var;
        int i;
        dl81 dl81Var = new dl81(10);
        int i2 = 0;
        while (true) {
            w971Var = (w971) bb71Var;
            w971Var.I(dl81Var.a, 0, 10, false);
            dl81Var.m(0);
            if (dl81Var.u() != 4801587) {
                break;
            }
            dl81Var.m(dl81Var.b + 3);
            int r = dl81Var.r();
            i2 += r + 10;
            w971Var.c(r, false);
        }
        w971Var.y = 0;
        w971Var.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            w971Var.I(dl81Var.a, 0, 7, false);
            dl81Var.m(0);
            int x = dl81Var.x();
            if (x == 44096 || x == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = dl81Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (x == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                w971Var.c(i - 7, false);
            } else {
                w971Var.y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                w971Var.c(i4, false);
                i3 = 0;
            }
        }
    }
}
