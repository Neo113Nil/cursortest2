package xsna;

/* compiled from: AutoValue_Resource.java */
/* loaded from: classes8.dex */
public final class qn5 extends gag0 {
    public final String b;
    public final q94 c;

    public qn5(String str, q94 q94Var) {
        this.b = str;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.c = q94Var;
    }

    @Override // xsna.gag0
    public final q94 c() {
        return this.c;
    }

    @Override // xsna.gag0
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gag0)) {
            return false;
        }
        gag0 gag0Var = (gag0) obj;
        String str = this.b;
        if (str == null) {
            if (gag0Var.e() != null) {
                return false;
            }
        } else if (!str.equals(gag0Var.e())) {
            return false;
        }
        return this.c.equals(gag0Var.c());
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.b + ", attributes=" + this.c + "}";
    }
}
