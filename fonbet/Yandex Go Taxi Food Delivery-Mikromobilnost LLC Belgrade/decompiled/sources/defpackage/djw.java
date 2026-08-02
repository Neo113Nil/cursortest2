package defpackage;

/* loaded from: classes14.dex */
public final class djw extends hjw {
    public final String a;
    public final String b;
    public final boolean c;
    public final xy40 d;
    public final hz40 e;

    static {
        Object[] objArr = np60.a;
        long[] jArr = cmm0.a;
    }

    public djw(String str, String str2, boolean z, xy40 xy40Var, hz40 hz40Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = xy40Var;
        this.e = hz40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djw)) {
            return false;
        }
        djw djwVar = (djw) obj;
        return jl40.l(this.a, djwVar.a) && jl40.l(this.b, djwVar.b) && this.c == djwVar.c && this.d.equals(djwVar.d) && this.e.equals(djwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
