package defpackage;

/* loaded from: classes2.dex */
public final class mmb implements omb {
    public final mjb a;

    public mmb(mjb mjbVar) {
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
        return (obj instanceof mmb) && jl40.l(this.a, ((mmb) obj).a);
    }

    public final int hashCode() {
        mjb mjbVar = this.a;
        if (mjbVar == null) {
            return 0;
        }
        return mjbVar.hashCode();
    }

    public final String toString() {
        return "Loading(checkoutContent=" + this.a + ')';
    }

    public mmb() {
        this(null);
    }
}
