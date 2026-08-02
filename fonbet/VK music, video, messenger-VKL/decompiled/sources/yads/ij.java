package yads;

/* loaded from: classes10.dex */
public final class ij {
    public final e00 a;
    public final String b;
    public final r2 c;
    public final y9 d;
    public j32 e;

    public /* synthetic */ ij(o5 o5Var, e00 e00Var, String str) {
        this(e00Var, str, o5Var.a(), o5Var.b());
    }

    public final gp2 a() {
        gp2 a = this.d.a();
        a.b(this.a.b, "ad_type");
        a.a(this.b, "ad_id");
        a.a.putAll(this.c.a());
        j32 j32Var = this.e;
        return j32Var != null ? hp2.a(a, j32Var.a()) : a;
    }

    public ij(e00 e00Var, String str, r2 r2Var, y9 y9Var) {
        this.a = e00Var;
        this.b = str;
        this.c = r2Var;
        this.d = y9Var;
    }
}
