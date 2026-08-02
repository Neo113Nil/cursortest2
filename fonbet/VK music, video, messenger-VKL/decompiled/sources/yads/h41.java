package yads;

/* loaded from: classes10.dex */
public final class h41 implements uq2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ n41 b;

    public h41(n41 n41Var, String str) {
        this.b = n41Var;
        this.a = str;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        n41 n41Var = this.b;
        String str = this.a;
        j41 j41Var = (j41) n41Var.c.remove(str);
        if (j41Var != null) {
            j41Var.c = mn3Var;
            n41Var.d.put(str, j41Var);
            if (n41Var.f == null) {
                i41 i41Var = new i41(n41Var);
                n41Var.f = i41Var;
                n41Var.e.postDelayed(i41Var, 100);
            }
        }
    }
}
