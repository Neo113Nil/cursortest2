package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hxl extends nxl {
    public final u1m a;
    public final ywl b;

    public hxl(ywl ywlVar, u1m u1mVar) {
        this.a = u1mVar;
        this.b = ywlVar;
    }

    public final ywl a() {
        return this.b;
    }

    public final u1m b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxl)) {
            return false;
        }
        hxl hxlVar = (hxl) obj;
        return jl40.l(this.a, hxlVar.a) && jl40.l(this.b, hxlVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        return hashCode + (ywlVar != null ? ywlVar.hashCode() : 0);
    }

    public final String toString() {
        return "LoadDocument(query=" + this.a + ", preview=" + this.b + Extension.C_BRAKE;
    }
}
