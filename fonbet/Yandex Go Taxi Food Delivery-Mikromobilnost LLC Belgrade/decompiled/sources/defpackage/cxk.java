package defpackage;

/* loaded from: classes.dex */
public final class cxk {
    public final m3k a;
    public final rvo b;

    public cxk(m3k m3kVar, rvo rvoVar) {
        this.a = m3kVar;
        this.b = rvoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxk)) {
            return false;
        }
        cxk cxkVar = (cxk) obj;
        return jl40.l(this.a, cxkVar.a) && jl40.l(this.b, cxkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivItemBuilderResult(div=" + this.a + ", expressionResolver=" + this.b + ')';
    }
}
