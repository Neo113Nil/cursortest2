package defpackage;

/* loaded from: classes9.dex */
public final class d6x {
    public final v6x a;
    public final s6x b;

    public d6x(v6x v6xVar, s6x s6xVar) {
        this.a = v6xVar;
        this.b = s6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6x)) {
            return false;
        }
        d6x d6xVar = (d6x) obj;
        return jl40.l(this.a, d6xVar.a) && jl40.l(this.b, d6xVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JasonState(\n    value=" + nab1.f(this.a.a) + ",\n    tags=" + qab1.b(this.b) + "\n}";
    }
}
