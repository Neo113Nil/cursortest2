package defpackage;

/* loaded from: classes11.dex */
public final class j231 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j231(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j231)) {
            return false;
        }
        j231 j231Var = (j231) obj;
        return jl40.l(this.a, j231Var.a) && jl40.l(this.b, j231Var.b) && this.c.equals(j231Var.c) && jl40.l(this.d, j231Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariableModel(name=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", value=");
        return b64.p(sb, this.d, ')');
    }
}
