package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ksa implements lsa {
    public final gra a;
    public final oma b;

    public ksa(gra graVar, oma omaVar) {
        this.a = graVar;
        this.b = omaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksa)) {
            return false;
        }
        ksa ksaVar = (ksa) obj;
        return jl40.l(this.a, ksaVar.a) && jl40.l(this.b, ksaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oma omaVar = this.b;
        return hashCode + (omaVar == null ? 0 : omaVar.hashCode());
    }

    public final String toString() {
        return "Success(result=" + this.a + ", popup=" + this.b + Extension.C_BRAKE;
    }
}
