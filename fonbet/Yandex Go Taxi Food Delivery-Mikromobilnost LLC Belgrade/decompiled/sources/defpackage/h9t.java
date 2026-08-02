package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class h9t {
    public final o1b0 a;
    public final r3z b;

    public h9t(o1b0 o1b0Var, r3z r3zVar) {
        this.a = o1b0Var;
        this.b = r3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9t)) {
            return false;
        }
        h9t h9tVar = (h9t) obj;
        return this.a.equals(h9tVar.a) && jl40.l(this.b, h9tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TargetMessageResult(chat=" + this.a + ", localMessage=" + this.b + Extension.C_BRAKE;
    }
}
