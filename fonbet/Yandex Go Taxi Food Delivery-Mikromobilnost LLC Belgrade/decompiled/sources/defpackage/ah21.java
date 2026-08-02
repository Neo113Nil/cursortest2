package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ah21 {
    public final String a;
    public final tev b;
    public final dcv c;
    public final dcv d;
    public final vfv e;
    public final boolean f;

    public ah21(dcv dcvVar, dcv dcvVar2, tev tevVar, vfv vfvVar, String str, boolean z) {
        this.a = str;
        this.b = tevVar;
        this.c = dcvVar;
        this.d = dcvVar2;
        this.e = vfvVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah21)) {
            return false;
        }
        ah21 ah21Var = (ah21) obj;
        return jl40.l(this.a, ah21Var.a) && jl40.l(this.b, ah21Var.b) && jl40.l(this.c, ah21Var.c) && jl40.l(this.d, ah21Var.d) && jl40.l(this.e, ah21Var.e) && this.f == ah21Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        dcv dcvVar = this.c;
        int hashCode2 = (hashCode + (dcvVar == null ? 0 : dcvVar.hashCode())) * 31;
        dcv dcvVar2 = this.d;
        int hashCode3 = (hashCode2 + (dcvVar2 == null ? 0 : dcvVar2.hashCode())) * 31;
        vfv vfvVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode3 + (vfvVar != null ? vfvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UrlImageStableKey(url=" + this.a + ", imageSize=" + this.b + ", placeholder=" + this.c + ", error=" + this.d + ", transformation=" + this.e + ", shouldApplySdkDefaults=" + this.f + Extension.C_BRAKE;
    }
}
