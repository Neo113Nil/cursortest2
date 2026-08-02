package defpackage;

/* loaded from: classes6.dex */
public final class anx0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final zmx0 e;

    public anx0(CharSequence charSequence, CharSequence charSequence2, String str, String str2, zmx0 zmx0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = str2;
        this.e = zmx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anx0)) {
            return false;
        }
        anx0 anx0Var = (anx0) obj;
        return jl40.l(this.a, anx0Var.a) && jl40.l(this.b, anx0Var.b) && jl40.l(this.c, anx0Var.c) && jl40.l(this.d, anx0Var.d) && jl40.l(this.e, anx0Var.e);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zmx0 zmx0Var = this.e;
        return hashCode2 + (zmx0Var != null ? zmx0Var.hashCode() : 0);
    }
}
