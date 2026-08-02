package defpackage;

/* loaded from: classes7.dex */
public final class k071 implements a871 {
    public final /* synthetic */ dgh a;

    public k071(dgh dghVar) {
        this.a = dghVar;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return (this.a.w * 1000000) / ((co61) r5.E).i;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        dgh dghVar = this.a;
        long j2 = (((co61) dghVar.E).i * j) / 1000000;
        long j3 = dghVar.a;
        long j4 = dghVar.b;
        int i = rf71.a;
        oe71 oe71Var = new oe71(j, Math.max(j3, Math.min(((((j4 - j3) * j2) / dghVar.w) + j3) - 30000, j4 - 1)));
        return new v171(oe71Var, oe71Var);
    }
}
