package defpackage;

/* loaded from: classes12.dex */
public final class e2n {
    public final d2n a;
    public final b2n b;
    public final c2n c;
    public final a2n d;

    public e2n(d2n d2nVar, b2n b2nVar, c2n c2nVar, a2n a2nVar) {
        this.a = d2nVar;
        this.b = b2nVar;
        this.c = c2nVar;
        this.d = a2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2n)) {
            return false;
        }
        e2n e2nVar = (e2n) obj;
        return jl40.l(this.a, e2nVar.a) && this.b.equals(e2nVar.b) && jl40.l(this.c, e2nVar.c) && this.d.equals(e2nVar.d);
    }

    public final int hashCode() {
        d2n d2nVar = this.a;
        int hashCode = (this.b.hashCode() + ((d2nVar == null ? 0 : d2nVar.hashCode()) * 31)) * 31;
        c2n c2nVar = this.c;
        return this.d.hashCode() + ((hashCode + (c2nVar != null ? c2nVar.hashCode() : 0)) * 31);
    }
}
