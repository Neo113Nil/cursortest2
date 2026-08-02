package xsna;

/* compiled from: GalvitaLayoutParams.kt */
/* loaded from: classes17.dex */
public final class a6t {
    public final uzt0 a;
    public final bvj b;

    public a6t() {
        this((uzt0) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6t)) {
            return false;
        }
        a6t a6tVar = (a6t) obj;
        return epx.f(this.a, a6tVar.a) && epx.f(this.b, a6tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GalvitaLayoutParams(viewPosition=" + this.a + ", cornersState=" + this.b + ')';
    }

    public a6t(uzt0 uzt0Var, bvj bvjVar) {
        this.a = uzt0Var;
        this.b = bvjVar;
    }

    public /* synthetic */ a6t(uzt0 uzt0Var, int i) {
        this((i & 1) != 0 ? new uzt0(15) : uzt0Var, new bvj(15));
    }
}
