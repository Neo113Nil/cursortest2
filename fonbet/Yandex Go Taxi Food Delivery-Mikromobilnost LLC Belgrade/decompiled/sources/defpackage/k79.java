package defpackage;

/* loaded from: classes4.dex */
public final class k79 extends glp0 {
    public final Exception a;

    public k79(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k79) && jl40.l(this.a, ((k79) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Certificate could not be encoded with: ".concat(kca1.g(this.a));
    }
}
