package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class blg {
    public final String a;
    public final alg b;
    public final xkg c;
    public final jbv d;
    public final ykg e;
    public final rbv f;

    public blg(String str, alg algVar, xkg xkgVar, jbv jbvVar, ykg ykgVar, jbv jbvVar2) {
        this.a = str;
        this.b = algVar;
        this.c = xkgVar;
        this.d = jbvVar;
        this.e = ykgVar;
        this.f = jbvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blg)) {
            return false;
        }
        blg blgVar = (blg) obj;
        return jl40.l(this.a, blgVar.a) && this.b.equals(blgVar.b) && this.c.equals(blgVar.c) && this.d.equals(blgVar.d) && this.e.equals(blgVar.e) && jl40.l(this.f, blgVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        rbv rbvVar = this.f;
        return hashCode + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        return "DashboardProductRemoteConfig(productId=" + this.a + ", title=" + this.b + ", background=" + this.c + ", titleLogo=" + this.d + ", balance=" + this.e + ", iconAfterTitle=" + this.f + Extension.C_BRAKE;
    }
}
