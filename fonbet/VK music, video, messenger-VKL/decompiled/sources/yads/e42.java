package yads;

/* loaded from: classes10.dex */
public final class e42 implements a83 {
    public final long a;
    public final /* synthetic */ f42 b;

    public e42(f42 f42Var, long j) {
        this.b = f42Var;
        this.a = j;
    }

    @Override // yads.a83
    public final void a(long j, long j2) {
        uk2 uk2Var = this.b.d;
        if (uk2Var != null) {
            long j3 = this.a;
            uk2Var.a(j3, j3 - j);
        }
    }
}
