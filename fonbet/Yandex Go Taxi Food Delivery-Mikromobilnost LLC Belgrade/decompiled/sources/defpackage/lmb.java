package defpackage;

/* loaded from: classes2.dex */
public final class lmb implements omb {
    public final mjb a;

    public lmb(mjb mjbVar) {
        this.a = mjbVar;
    }

    @Override // defpackage.omb
    public final mjb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmb) && jl40.l(this.a, ((lmb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(checkoutContent=" + this.a + ')';
    }
}
