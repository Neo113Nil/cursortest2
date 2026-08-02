package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n1j {
    public final wb6 a;
    public final rw30 b;
    public final String c;

    public n1j(wb6 wb6Var, rw30 rw30Var, String str) {
        this.a = wb6Var;
        this.b = rw30Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1j)) {
            return false;
        }
        n1j n1jVar = (n1j) obj;
        return jl40.l(this.a, n1jVar.a) && jl40.l(this.b, n1jVar.b) && this.c.equals(n1jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailRouteState(bottomButtons=");
        sb.append(this.a);
        sb.append(", routeState=");
        sb.append(this.b);
        sb.append(", sharingText=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
