package defpackage;

/* loaded from: classes2.dex */
public final class i1e {
    public final String a;
    public final String b;
    public final String c;
    public final h1e d;
    public final e1e e;
    public final d1e f;

    public i1e(String str, String str2, String str3, h1e h1eVar, e1e e1eVar, d1e d1eVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h1eVar;
        this.e = e1eVar;
        this.f = d1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1e)) {
            return false;
        }
        i1e i1eVar = (i1e) obj;
        return jl40.l(this.a, i1eVar.a) && jl40.l(this.b, i1eVar.b) && jl40.l(this.c, i1eVar.c) && jl40.l(this.d, i1eVar.d) && jl40.l(this.e, i1eVar.e) && jl40.l(this.f, i1eVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h1e h1eVar = this.d;
        int hashCode4 = (hashCode3 + (h1eVar == null ? 0 : h1eVar.hashCode())) * 31;
        e1e e1eVar = this.e;
        int hashCode5 = (hashCode4 + (e1eVar == null ? 0 : e1eVar.hashCode())) * 31;
        d1e d1eVar = this.f;
        return hashCode5 + (d1eVar != null ? d1eVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "ConfigurationOverlayFragment(text=" + this.a + ", shape=" + this.b + ", textColor=" + this.c + ", textColors=" + this.d + ", background=" + this.e + ", attributedText=" + this.f + ')';
    }
}
