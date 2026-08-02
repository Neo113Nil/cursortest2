package yads;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class pa2 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final kc2 g = new kc2(255);

    public final boolean a(ld0 ld0Var, boolean z) {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g.c(27);
        try {
            if (ld0Var.b(this.g.a, 0, 27, z) && this.g.n() == 1332176723) {
                if (this.g.m() != 0) {
                    if (z) {
                        return false;
                    }
                    throw pc2.b("unsupported bit stream revision");
                }
                this.a = this.g.m();
                this.b = this.g.e();
                this.g.g();
                this.g.g();
                this.g.g();
                int m = this.g.m();
                this.c = m;
                this.d = m + 27;
                this.g.c(m);
                try {
                    if (ld0Var.b(this.g.a, 0, this.c, z)) {
                        for (int i = 0; i < this.c; i++) {
                            this.f[i] = this.g.m();
                            this.e += this.f[i];
                        }
                        return true;
                    }
                } catch (EOFException e) {
                    if (!z) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
        }
        return false;
    }

    public final boolean a(ld0 ld0Var, long j) {
        long j2 = ld0Var.d;
        if (j2 == ld0Var.f + j2) {
            this.g.c(4);
            while (true) {
                if (j != -1 && ld0Var.d + 4 >= j) {
                    break;
                }
                try {
                    if (!ld0Var.b(this.g.a, 0, 4, true)) {
                        break;
                    }
                    this.g.e(0);
                    if (this.g.n() == 1332176723) {
                        ld0Var.f = 0;
                        return true;
                    }
                    ld0Var.a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (j != -1 && ld0Var.d >= j) {
                    break;
                }
            } while (ld0Var.c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
