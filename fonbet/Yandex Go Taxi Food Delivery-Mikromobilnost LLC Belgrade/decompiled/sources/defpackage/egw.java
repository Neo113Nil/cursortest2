package defpackage;

/* loaded from: classes14.dex */
public final class egw {
    public final String a;
    public final v8b1 b;
    public final rnw c;
    public final String d;

    public egw(String str, v8b1 v8b1Var, rnw rnwVar, String str2) {
        this.a = str;
        this.b = v8b1Var;
        this.c = rnwVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egw)) {
            return false;
        }
        egw egwVar = (egw) obj;
        return jl40.l(this.a, egwVar.a) && this.b.equals(egwVar.b) && this.c.equals(egwVar.c) && jl40.l(this.d, egwVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
