package xsna;

import java.io.IOException;

/* compiled from: FixedLengthSource.kt */
/* loaded from: classes8.dex */
public final class bnr extends cas {
    public final long b;
    public final boolean c;
    public long d;

    public bnr(agk0 agk0Var, long j, boolean z) {
        super(agk0Var);
        this.b = j;
        this.c = z;
    }

    @Override // xsna.cas, xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        long j2 = this.d;
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
        long read = super.read(vl8Var, j);
        if (read != -1) {
            this.d += read;
        }
        long j5 = this.d;
        if ((j5 >= j3 || read != -1) && j5 <= j3) {
            return read;
        }
        if (read > 0 && j5 > j3) {
            long j6 = vl8Var.c - (j5 - j3);
            vl8 vl8Var2 = new vl8();
            vl8Var2.L2(vl8Var);
            vl8Var.n1(vl8Var2, j6);
            vl8Var2.m();
        }
        StringBuilder b = fp.b(j3, "expected ", " bytes but got ");
        b.append(this.d);
        throw new IOException(b.toString());
    }
}
