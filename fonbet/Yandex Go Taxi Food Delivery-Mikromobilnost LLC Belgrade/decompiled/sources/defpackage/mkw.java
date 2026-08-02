package defpackage;

/* loaded from: classes14.dex */
public final class mkw implements nkw {
    public final CharSequence a;
    public final String b;

    public mkw(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkw)) {
            return false;
        }
        mkw mkwVar = (mkw) obj;
        return jl40.l(this.a, mkwVar.a) && jl40.l(this.b, mkwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
