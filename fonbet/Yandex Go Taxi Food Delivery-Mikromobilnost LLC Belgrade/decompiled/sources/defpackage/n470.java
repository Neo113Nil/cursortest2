package defpackage;

/* loaded from: classes6.dex */
public final class n470 {
    public static final n470 c = new n470("", "");
    public final String a;
    public final String b;

    public n470(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n470)) {
            return false;
        }
        n470 n470Var = (n470) obj;
        return jl40.l(this.a, n470Var.a) && jl40.l(this.b, n470Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
