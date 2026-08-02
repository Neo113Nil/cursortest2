package defpackage;

/* loaded from: classes6.dex */
public final class p7z0 {
    public final String a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final boolean f;
    public final String g;
    public final String h;
    public final n7z0 i;
    public final v3k j;
    public final int k;

    public p7z0(String str, String str2, String str3, float f, float f2, boolean z, String str4, String str5, n7z0 n7z0Var, v3k v3kVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = str4;
        this.h = str5;
        this.i = n7z0Var;
        this.j = v3kVar;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7z0)) {
            return false;
        }
        p7z0 p7z0Var = (p7z0) obj;
        return this.a.equals(p7z0Var.a) && jl40.l(this.b, p7z0Var.b) && jl40.l(this.c, p7z0Var.c) && Float.compare(this.d, p7z0Var.d) == 0 && Float.compare(this.e, p7z0Var.e) == 0 && this.f == p7z0Var.f && jl40.l(this.g, p7z0Var.g) && jl40.l(this.h, p7z0Var.h) && jl40.l(this.i, p7z0Var.i) && jl40.l(this.j, p7z0Var.j) && this.k == p7z0Var.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int e = unr0.e(g8e.c(this.e, g8e.c(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f);
        String str3 = this.g;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        n7z0 n7z0Var = this.i;
        int hashCode5 = (hashCode4 + (n7z0Var == null ? 0 : n7z0Var.hashCode())) * 31;
        v3k v3kVar = this.j;
        return Integer.hashCode(this.k) + ((hashCode5 + (v3kVar != null ? v3kVar.hashCode() : 0)) * 31);
    }
}
