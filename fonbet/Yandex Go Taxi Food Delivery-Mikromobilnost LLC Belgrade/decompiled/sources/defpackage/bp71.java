package defpackage;

/* loaded from: classes7.dex */
public final class bp71 implements z971 {
    public final hv81 a;
    public final nr41 b;
    public boolean c;

    public bp71(i581 i581Var, i971 i971Var, hv81 hv81Var, i971 i971Var2) {
        nr41 nr41Var = new nr41(8, i971Var);
        this.a = hv81Var;
        this.b = nr41Var;
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        if (this.c || j2 <= 0 || !this.b.h()) {
            return;
        }
        this.c = true;
        this.a.h();
    }
}
