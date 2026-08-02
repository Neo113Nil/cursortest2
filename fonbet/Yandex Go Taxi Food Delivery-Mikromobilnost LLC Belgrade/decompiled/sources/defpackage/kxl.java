package defpackage;

/* loaded from: classes4.dex */
public final class kxl extends nxl {
    public final ywl a;

    public kxl(ywl ywlVar) {
        this.a = ywlVar;
    }

    public final ywl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kxl) {
            return jl40.l(this.a, ((kxl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ShowDocument(document=" + this.a + ", targetQuery=null)";
    }
}
