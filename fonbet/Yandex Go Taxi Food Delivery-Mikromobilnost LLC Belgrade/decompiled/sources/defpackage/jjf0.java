package defpackage;

/* loaded from: classes15.dex */
public final class jjf0 extends gas {
    public final wtq0 b;
    public final /* synthetic */ kjf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjf0(kjf0 kjf0Var, qq6 qq6Var) {
        super(qq6Var);
        this.c = kjf0Var;
        this.b = new wtq0(kjf0Var.b);
    }

    @Override // defpackage.gas, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        long read = this.a.read(yp6Var, j);
        this.b.e(read, this.c.a.contentLength());
        return read;
    }
}
