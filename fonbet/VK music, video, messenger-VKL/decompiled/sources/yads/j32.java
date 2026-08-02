package yads;

/* loaded from: classes10.dex */
public final class j32 {
    public final d4 a;
    public final String b;
    public final v9 c;
    public final e22 d;
    public final u32 e;
    public r32 f;

    public /* synthetic */ j32(d4 d4Var, String str, v9 v9Var, e22 e22Var, u32 u32Var) {
        this(d4Var, str, v9Var, e22Var, u32Var, null);
    }

    public final gp2 a() {
        gp2 a = this.e.a(this.c, this.a, this.d);
        r32 r32Var = this.f;
        if (r32Var != null) {
            a.b(r32Var.b, "bind_type");
        }
        a.a(this.b, "native_ad_type");
        e13 e13Var = this.a.d.a;
        if (e13Var != null) {
            a.b(e13Var.b().b, "size_type");
            a.b(Integer.valueOf(e13Var.getWidth()), "width");
            a.b(Integer.valueOf(e13Var.getHeight()), "height");
        }
        a.b = this.c.i;
        return a;
    }

    public j32(d4 d4Var, String str, v9 v9Var, e22 e22Var, u32 u32Var, r32 r32Var) {
        this.a = d4Var;
        this.b = str;
        this.c = v9Var;
        this.d = e22Var;
        this.e = u32Var;
        this.f = r32Var;
    }
}
