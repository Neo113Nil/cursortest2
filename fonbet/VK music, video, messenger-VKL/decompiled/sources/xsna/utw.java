package xsna;

import xsna.n3i0;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes12.dex */
public final class utw implements n3i0 {
    public final ouw a;
    public final ouw b;
    public long c;

    public utw(long[] jArr, long[] jArr2, long j) {
        fxc0.p(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new ouw(length);
            this.b = new ouw(length);
        } else {
            int i = length + 1;
            ouw ouwVar = new ouw(i);
            this.a = ouwVar;
            ouw ouwVar2 = new ouw(i);
            this.b = ouwVar2;
            ouwVar.a(0L);
            ouwVar2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.c;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        ouw ouwVar = this.b;
        if (ouwVar.a == 0) {
            p3i0 p3i0Var = p3i0.c;
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int d = y2r0.d(ouwVar, j);
        long c = ouwVar.c(d);
        ouw ouwVar2 = this.a;
        p3i0 p3i0Var2 = new p3i0(c, ouwVar2.c(d));
        if (c == j || d == ouwVar.a - 1) {
            return new n3i0.a(p3i0Var2, p3i0Var2);
        }
        int i = d + 1;
        return new n3i0.a(p3i0Var2, new p3i0(ouwVar.c(i), ouwVar2.c(i)));
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return this.b.a > 0;
    }
}
