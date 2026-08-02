package defpackage;

import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class fb implements b5p {
    public final gb a = new gb("audio/ac3");
    public final ef90 b = new ef90(2786);
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
        int read = c5pVar.read(ef90Var.a, 0, 2786);
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

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        kbh kbhVar;
        int d;
        ef90 ef90Var = new ef90(10);
        int i = 0;
        while (true) {
            kbhVar = (kbh) c5pVar;
            kbhVar.H(ef90Var.a, 0, 10, false);
            ef90Var.K(0);
            if (ef90Var.B() != 4801587) {
                break;
            }
            ef90Var.L(3);
            int x = ef90Var.x();
            i += x + 10;
            kbhVar.a(x, false);
        }
        kbhVar.y = 0;
        kbhVar.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            kbhVar.H(ef90Var.a, 0, 6, false);
            ef90Var.K(0);
            if (ef90Var.E() != 2935) {
                kbhVar.y = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                kbhVar.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = ef90Var.a;
                if (bArr.length < 6) {
                    d = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    d = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    d = m83.d((b & DerValue.TAG_PRIVATE) >> 6, b & 63);
                }
                if (d == -1) {
                    break;
                }
                kbhVar.a(d - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
