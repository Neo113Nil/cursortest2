package defpackage;

/* loaded from: classes14.dex */
public final class gaw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final faw e;
    public final String f;

    public gaw(String str, String str2, String str3, String str4, faw fawVar, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = fawVar;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaw)) {
            return false;
        }
        gaw gawVar = (gaw) obj;
        return jl40.l(this.a, gawVar.a) && this.b.equals(gawVar.b) && this.c.equals(gawVar.c) && this.d.equals(gawVar.d) && this.e.equals(gawVar.e) && jl40.l(this.f, gawVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
