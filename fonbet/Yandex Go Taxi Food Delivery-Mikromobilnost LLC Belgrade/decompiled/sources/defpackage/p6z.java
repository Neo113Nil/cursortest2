package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class p6z {
    public final yzs a;
    public final u1k b;

    public p6z(yzs yzsVar, u1k u1kVar) {
        this.a = yzsVar;
        this.b = u1kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6z)) {
            return false;
        }
        p6z p6zVar = (p6z) obj;
        return this.a.equals(p6zVar.a) && jl40.l(this.b, p6zVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u1k u1kVar = this.b;
        return hashCode + (u1kVar == null ? 0 : Double.hashCode(u1kVar.a));
    }

    public final String toString() {
        return "Position(geoPoint=" + this.a + ", accuracy=" + this.b + Extension.C_BRAKE;
    }
}
