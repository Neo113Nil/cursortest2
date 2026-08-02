package defpackage;

/* loaded from: classes4.dex */
public final class bom extends un91 {
    public final String b;
    public final Long c;
    public final ldc d;

    public bom(String str, Long l, ldc ldcVar, int i) {
        l = (i & 2) != 0 ? null : l;
        ldcVar = (i & 4) != 0 ? null : ldcVar;
        this.b = str;
        this.c = l;
        this.d = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bom)) {
            return false;
        }
        bom bomVar = (bom) obj;
        return this.b.equals(bomVar.b) && jl40.l(this.c, bomVar.c) && jl40.l(this.d, bomVar.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ldc ldcVar = this.d;
        return (hashCode2 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0)) * 31;
    }

    public final String toString() {
        return "OnlyName(name=" + this.b + ", uid=" + this.c + ", color=" + this.d + ", textColor=null)";
    }
}
