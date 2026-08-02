package defpackage;

import java.io.EOFException;
import yads.aa2;

/* loaded from: classes7.dex */
public final class pu81 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final dl81 g = new dl81(255);

    public final boolean a(w971 w971Var, long j) {
        boolean z;
        w971 w971Var2;
        long j2 = w971Var.w;
        if (j2 != w971Var.y + j2) {
            w511.q();
            return false;
        }
        dl81 dl81Var = this.g;
        dl81Var.i(4);
        while (true) {
            if (j != -1 && w971Var.w + 4 >= j) {
                break;
            }
            try {
                z = w971Var.I(dl81Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            dl81Var.m(0);
            if (dl81Var.t() == 1332176723) {
                w971Var.y = 0;
                return true;
            }
            w971Var.b(1);
        }
        while (true) {
            if (j != -1 && w971Var.w >= j) {
                break;
            }
            int min = Math.min(w971Var.z, 1);
            w971Var.d(min);
            if (min == 0) {
                byte[] bArr = w971Var.a;
                w971Var2 = w971Var;
                min = w971Var2.a(bArr, 0, Math.min(1, bArr.length), 0, true);
            } else {
                w971Var2 = w971Var;
            }
            if (min != -1) {
                w971Var2.w += min;
            }
            if (min == -1) {
                break;
            }
            w971Var = w971Var2;
        }
        return false;
    }

    public final boolean b(w971 w971Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        dl81 dl81Var = this.g;
        dl81Var.i(27);
        try {
            z2 = w971Var.I(dl81Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && dl81Var.t() == 1332176723) {
            if (dl81Var.s() == 0) {
                this.a = dl81Var.s();
                this.b = dl81Var.j();
                dl81Var.l();
                dl81Var.l();
                dl81Var.l();
                int s = dl81Var.s();
                this.c = s;
                this.d = s + 27;
                dl81Var.i(s);
                try {
                    z3 = w971Var.I(dl81Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int s2 = dl81Var.s();
                        this.f[i] = s2;
                        this.e += s2;
                    }
                    return true;
                }
            } else if (!z) {
                throw aa2.a("unsupported bit stream revision");
            }
        }
        return false;
    }
}
