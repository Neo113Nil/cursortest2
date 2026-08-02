package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class ler extends gas {
    public final long b;
    public final boolean c;
    public long w;

    public ler(y9t0 y9t0Var, long j, boolean z) {
        super(y9t0Var);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.gas, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        long j2 = this.w;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = this.a.read(yp6Var, j);
        if (read != -1) {
            this.w += read;
        }
        long j5 = this.w;
        if ((j5 >= j3 || read != -1) && j5 <= j3) {
            return read;
        }
        if (read > 0 && j5 > j3) {
            long j6 = yp6Var.b - (j5 - j3);
            yp6 yp6Var2 = new yp6();
            yp6Var2.N1(yp6Var);
            yp6Var.write(yp6Var2, j6);
            yp6Var2.clear();
        }
        StringBuilder w = unr0.w(j3, "expected ", " bytes but got ");
        w.append(this.w);
        throw new IOException(w.toString());
    }
}
