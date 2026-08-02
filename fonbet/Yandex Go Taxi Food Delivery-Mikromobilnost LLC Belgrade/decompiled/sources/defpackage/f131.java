package defpackage;

/* loaded from: classes10.dex */
public final class f131 {
    public final String a;
    public final Object b;

    public f131(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f131)) {
            return false;
        }
        f131 f131Var = (f131) obj;
        return this.a.equals(f131Var.a) && jl40.l(this.b, f131Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.r(sb, this.b, ')');
    }
}
