package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nrz {
    public final m7v a;
    public final mjy0 b;
    public final wqz c;

    public nrz(h7v h7vVar, mjy0 mjy0Var, wqz wqzVar) {
        this.a = h7vVar;
        this.b = mjy0Var;
        this.c = wqzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrz)) {
            return false;
        }
        nrz nrzVar = (nrz) obj;
        return jl40.l(this.a, nrzVar.a) && this.b.equals(nrzVar.b) && this.c.equals(nrzVar.c);
    }

    public final int hashCode() {
        m7v m7vVar = this.a;
        int hashCode = m7vVar == null ? 0 : m7vVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "Button(icon=" + this.a + ", title=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
