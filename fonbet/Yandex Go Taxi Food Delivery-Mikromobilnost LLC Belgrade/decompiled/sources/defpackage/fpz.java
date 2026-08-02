package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fpz {
    public final kdc a;
    public final String b;
    public final toz c;

    public fpz(kdc kdcVar, String str, toz tozVar) {
        this.a = kdcVar;
        this.b = str;
        this.c = tozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpz)) {
            return false;
        }
        fpz fpzVar = (fpz) obj;
        return jl40.l(this.a, fpzVar.a) && jl40.l(this.b, fpzVar.b) && this.c.equals(fpzVar.c);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        return this.c.hashCode() + unr0.b((kdcVar == null ? 0 : kdcVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "LootBoxButtonEntity(backgroundColor=" + this.a + ", text=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
