package defpackage;

import java.io.EOFException;

/* loaded from: classes7.dex */
public final class pr81 {
    public final pu81 a = new pu81();
    public final dl81 b = new dl81(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(w971 w971Var) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        if (w971Var == null) {
            ny61.k();
            return false;
        }
        boolean z = this.e;
        dl81 dl81Var = this.b;
        if (z) {
            this.e = false;
            dl81Var.i(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i4 = this.c;
            pu81 pu81Var = this.a;
            if (i4 < 0) {
                if (!pu81Var.a(w971Var, -1L) || !pu81Var.b(w971Var, true)) {
                    break;
                }
                int i5 = pu81Var.d;
                if ((pu81Var.a & 1) == 1 && dl81Var.c == 0) {
                    this.d = 0;
                    int i6 = 0;
                    do {
                        int i7 = this.d;
                        if (i7 >= pu81Var.c) {
                            break;
                        }
                        int[] iArr2 = pu81Var.f;
                        this.d = i7 + 1;
                        i3 = iArr2[i7];
                        i6 += i3;
                    } while (i3 == 255);
                    i5 += i6;
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                try {
                    w971Var.b(i5);
                    this.c = i2;
                } catch (EOFException unused) {
                }
            }
            int i8 = this.c;
            this.d = 0;
            int i9 = 0;
            do {
                int i10 = this.d;
                int i11 = i8 + i10;
                int i12 = pu81Var.c;
                iArr = pu81Var.f;
                if (i11 >= i12) {
                    break;
                }
                this.d = i10 + 1;
                i = iArr[i11];
                i9 += i;
            } while (i == 255);
            int i13 = this.c + this.d;
            if (i9 > 0) {
                dl81Var.c(dl81Var.c + i9);
                try {
                    w971Var.E(dl81Var.a, dl81Var.c, i9, false);
                    dl81Var.k(dl81Var.c + i9);
                    this.e = iArr[i13 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == pu81Var.c) {
                i13 = -1;
            }
            this.c = i13;
        }
        return false;
    }
}
