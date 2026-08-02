package defpackage;

/* loaded from: classes10.dex */
public final class l1u0 extends eas {
    public final /* synthetic */ f7q0 b;
    public final /* synthetic */ qgg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1u0(qgg qggVar, f7q0 f7q0Var, f7q0 f7q0Var2) {
        super(f7q0Var);
        this.c = qggVar;
        this.b = f7q0Var2;
    }

    @Override // defpackage.eas, defpackage.f7q0
    public final e7q0 b(long j) {
        e7q0 b = this.b.b(j);
        h7q0 h7q0Var = b.a;
        long j2 = h7q0Var.a;
        long j3 = h7q0Var.b;
        long j4 = this.c.b;
        h7q0 h7q0Var2 = new h7q0(j2, j3 + j4);
        h7q0 h7q0Var3 = b.b;
        return new e7q0(h7q0Var2, new h7q0(h7q0Var3.a, h7q0Var3.b + j4));
    }
}
