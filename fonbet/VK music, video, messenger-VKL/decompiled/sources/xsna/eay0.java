package xsna;

/* loaded from: classes9.dex */
public final class eay0 {
    public final z9y0 a;
    public final lay0 b;

    public eay0(z9y0 z9y0Var, lay0 lay0Var, jvy0 jvy0Var) {
        this.a = z9y0Var;
        this.b = lay0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eay0)) {
            return false;
        }
        eay0 eay0Var = (eay0) obj;
        return epx.f(this.a, eay0Var.a) && epx.f(this.b, eay0Var.b) && epx.f(null, null);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 0;
    }

    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ", testPushIPCClient=" + ((Object) null) + ')';
    }
}
