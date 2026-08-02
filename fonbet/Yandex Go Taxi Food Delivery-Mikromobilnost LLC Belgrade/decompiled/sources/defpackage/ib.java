package defpackage;

/* loaded from: classes10.dex */
public final class ib implements b5p {
    public final gb a = new gb(null, 0, "audio/ac4", 1);
    public final ef90 b = new ef90(16384);
    public boolean c;

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.a.h(d5pVar, new xi11(0, 1));
        d5pVar.A();
        d5pVar.w(new qb4(-9223372036854775807L));
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        ef90 ef90Var = this.b;
        int read = c5pVar.read(ef90Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        ef90Var.K(0);
        ef90Var.J(read);
        boolean z = this.c;
        gb gbVar = this.a;
        if (!z) {
            gbVar.o = 0L;
            this.c = true;
        }
        gbVar.b(ef90Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(c5p c5pVar) {
        kbh kbhVar;
        int i;
        ef90 ef90Var = new ef90(10);
        int i2 = 0;
        while (true) {
            kbhVar = (kbh) c5pVar;
            kbhVar.H(ef90Var.a, 0, 10, false);
            ef90Var.K(0);
            if (ef90Var.B() != 4801587) {
                break;
            }
            ef90Var.L(3);
            int x = ef90Var.x();
            i2 += x + 10;
            kbhVar.a(x, false);
        }
        kbhVar.y = 0;
        kbhVar.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            kbhVar.H(ef90Var.a, 0, 7, false);
            ef90Var.K(0);
            int E = ef90Var.E();
            if (E == 44096 || E == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = ef90Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (E == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                kbhVar.a(i - 7, false);
            } else {
                kbhVar.y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                kbhVar.a(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
