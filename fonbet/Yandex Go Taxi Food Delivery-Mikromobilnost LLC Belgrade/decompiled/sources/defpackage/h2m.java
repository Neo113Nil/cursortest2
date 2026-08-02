package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class h2m implements b8u {
    public final ywl a;
    public final u1m b;
    public final cnr0 c;

    public h2m(ywl ywlVar, u1m u1mVar) {
        this.a = ywlVar;
        this.b = u1mVar;
        this.c = ywlVar.c;
    }

    @Override // defpackage.b8u
    public final cnr0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h2m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h2m h2mVar = (h2m) obj;
        return jl40.l(this.a, h2mVar.a) && jl40.l(this.b, h2mVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u1m u1mVar = this.b;
        return hashCode + (u1mVar != null ? u1mVar.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentResponse(document=" + this.a + ", redirect=" + this.b + Extension.C_BRAKE;
    }
}
