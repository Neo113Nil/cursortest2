package defpackage;

/* loaded from: classes2.dex */
public final class g351 {
    public final String a;
    public final d351 b;
    public final e351 c;
    public final f351 d;

    public g351(String str, d351 d351Var, e351 e351Var, f351 f351Var) {
        this.a = str;
        this.b = d351Var;
        this.c = e351Var;
        this.d = f351Var;
    }

    public final d351 a() {
        return this.b;
    }

    public final e351 b() {
        return this.c;
    }

    public final f351 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g351)) {
            return false;
        }
        g351 g351Var = (g351) obj;
        return jl40.l(this.a, g351Var.a) && jl40.l(this.b, g351Var.b) && jl40.l(this.c, g351Var.c) && jl40.l(this.d, g351Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d351 d351Var = this.b;
        int hashCode2 = (hashCode + (d351Var == null ? 0 : d351Var.a.hashCode())) * 31;
        e351 e351Var = this.c;
        int hashCode3 = (hashCode2 + (e351Var == null ? 0 : e351Var.a.hashCode())) * 31;
        f351 f351Var = this.d;
        return hashCode3 + (f351Var != null ? Integer.hashCode(f351Var.a) : 0);
    }

    public final String toString() {
        return "WidgetGroupWidth(__typename=" + this.a + ", onFillWidth=" + this.b + ", onFitWidth=" + this.c + ", onFixWidth=" + this.d + ')';
    }
}
