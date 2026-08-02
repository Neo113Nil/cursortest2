package defpackage;

/* loaded from: classes10.dex */
public final class frv implements f7q0 {
    public final nlz a;
    public final nlz b;
    public long c;

    public frv(long j, long[] jArr, long[] jArr2) {
        d6z.l(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new nlz(length);
            this.b = new nlz(length);
        } else {
            int i = length + 1;
            nlz nlzVar = new nlz(i);
            this.a = nlzVar;
            nlz nlzVar2 = new nlz(i);
            this.b = nlzVar2;
            nlzVar.a(0L);
            nlzVar2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        nlz nlzVar = this.b;
        if (nlzVar.a == 0) {
            h7q0 h7q0Var = h7q0.c;
            return new e7q0(h7q0Var, h7q0Var);
        }
        int b = tw21.b(nlzVar, j);
        long c = nlzVar.c(b);
        nlz nlzVar2 = this.a;
        h7q0 h7q0Var2 = new h7q0(c, nlzVar2.c(b));
        if (c == j || b == nlzVar.a - 1) {
            return new e7q0(h7q0Var2, h7q0Var2);
        }
        int i = b + 1;
        return new e7q0(h7q0Var2, new h7q0(nlzVar.c(i), nlzVar2.c(i)));
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return this.b.a > 0;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.c;
    }
}
