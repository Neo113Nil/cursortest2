package defpackage;

/* loaded from: classes2.dex */
public final class gfz implements bwg {
    public final String a;
    public final String b;
    public final ffz c;

    public gfz(String str, String str2, ffz ffzVar) {
        this.a = str;
        this.b = str2;
        this.c = ffzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfz)) {
            return false;
        }
        gfz gfzVar = (gfz) obj;
        return jl40.l(this.a, gfzVar.a) && jl40.l(this.b, gfzVar.b) && this.c.equals(gfzVar.c);
    }

    @Override // defpackage.bwg
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LogModel(id=" + this.a + ", title=" + this.b + ", details=" + this.c + ')';
    }
}
