package defpackage;

/* loaded from: classes2.dex */
public final class l0f implements m0f {
    public final rze a;

    public l0f(rze rzeVar) {
        this.a = rzeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0f) && jl40.l(this.a, ((l0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Offers(content=" + this.a + ')';
    }
}
