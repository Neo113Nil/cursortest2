package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class koq extends loq {
    public final u1m a;
    public final ywl b;

    public koq(ywl ywlVar, u1m u1mVar) {
        this.a = u1mVar;
        this.b = ywlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koq)) {
            return false;
        }
        koq koqVar = (koq) obj;
        return jl40.l(this.a, koqVar.a) && jl40.l(this.b, koqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Query(query=" + this.a + ", preview=" + this.b + Extension.C_BRAKE;
    }
}
