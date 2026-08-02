package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class d1m implements peo {
    public final u1m a;
    public final ywl b;

    public d1m(ywl ywlVar, u1m u1mVar) {
        this.a = u1mVar;
        this.b = ywlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d1m d1mVar = (d1m) obj;
        return jl40.l(this.a, d1mVar.a) && jl40.l(this.b, d1mVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        return hashCode + (ywlVar != null ? ywlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Started(query=" + this.a + ", preview=" + this.b + Extension.C_BRAKE;
    }
}
