package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class nke {
    public final u1m a;
    public final pyp0 b;
    public final pxl c;

    public nke(u1m u1mVar, pyp0 pyp0Var, pxl pxlVar) {
        this.a = u1mVar;
        this.b = pyp0Var;
        this.c = pxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nke)) {
            return false;
        }
        nke nkeVar = (nke) obj;
        return jl40.l(this.a, nkeVar.a) && jl40.l(this.b, nkeVar.b) && this.c.equals(nkeVar.c);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = u1mVar == null ? 0 : u1mVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ContextualSection(query=" + this.a + ", section=" + this.b + ", context=" + this.c + Extension.C_BRAKE;
    }
}
