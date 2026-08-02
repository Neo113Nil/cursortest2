package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p8t {
    public final o1b0 a;
    public final r3z b;

    public p8t(o1b0 o1b0Var, r3z r3zVar) {
        this.a = o1b0Var;
        this.b = r3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8t)) {
            return false;
        }
        p8t p8tVar = (p8t) obj;
        return this.a.equals(p8tVar.a) && jl40.l(this.b, p8tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LastMessageResult(chat=" + this.a + ", localMessage=" + this.b + Extension.C_BRAKE;
    }
}
