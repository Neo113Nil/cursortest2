package xsna;

/* compiled from: AbstractTransition.kt */
/* loaded from: classes7.dex */
public final class ei {
    public final nmp0 a;
    public final nb30 b;
    public final nb30 c;

    public ei(nmp0 nmp0Var, nb30 nb30Var, nb30 nb30Var2) {
        this.a = nmp0Var;
        this.b = nb30Var;
        this.c = nb30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return epx.f(this.a, eiVar.a) && epx.f(this.b, eiVar.b) && epx.f(this.c, eiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AbstractTransition(id=" + this.a + ", firstStateId=" + this.b + ", secondStateId=" + this.c + ')';
    }
}
