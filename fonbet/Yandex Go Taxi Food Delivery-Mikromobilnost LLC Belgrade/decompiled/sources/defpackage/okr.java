package defpackage;

/* loaded from: classes2.dex */
public final class okr implements p8w {
    public final /* synthetic */ rwo a;

    public okr(rwo rwoVar) {
        this.a = rwoVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        kvj0 b = zci0Var.b(d5j0Var);
        sv90 sv90Var = qv90.a;
        kwu kwuVar = d5j0Var.a;
        String b2 = kwuVar.b();
        String str = kwuVar.d;
        long j = b.F - b.E;
        int i = b.w;
        sv90Var.getClass();
        iho M = sv90.M(j, b2, "", "", str, i);
        ((y22) this.a).a(b.J ? M.d(null) : iho.b(M, null, 3));
        return b;
    }
}
