package xsna;

/* loaded from: classes9.dex */
public final class jfy0 {
    public final z9y0 a;
    public final lay0 b;

    public jfy0(z9y0 z9y0Var, lay0 lay0Var) {
        this.a = z9y0Var;
        this.b = lay0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfy0)) {
            return false;
        }
        jfy0 jfy0Var = (jfy0) obj;
        return epx.f(this.a, jfy0Var.a) && epx.f(this.b, jfy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ')';
    }
}
