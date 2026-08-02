package defpackage;

/* loaded from: classes14.dex */
public final class hfw {
    public final String a;
    public final v8b1 b;
    public final String c;

    public hfw(String str, v8b1 v8b1Var, String str2) {
        this.a = str;
        this.b = v8b1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfw)) {
            return false;
        }
        hfw hfwVar = (hfw) obj;
        return jl40.l(this.a, hfwVar.a) && jl40.l(this.b, hfwVar.b) && jl40.l(this.c, hfwVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
