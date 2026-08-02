package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class pbv implements rbv {
    public final String a;
    public final dcv b;
    public final tev c;
    public final dcv d;
    public final vfv e;
    public final boolean f;

    public /* synthetic */ pbv(String str, ccv ccvVar, tev tevVar, dcv dcvVar, vfv vfvVar, int i) {
        this((i & 2) != 0 ? null : ccvVar, (i & 8) != 0 ? null : dcvVar, tevVar, (i & 16) != 0 ? null : vfvVar, str, (i & 32) == 0);
    }

    public static pbv a(pbv pbvVar, tev tevVar) {
        return new pbv(pbvVar.b, pbvVar.d, tevVar, pbvVar.e, pbvVar.a, pbvVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbv)) {
            return false;
        }
        pbv pbvVar = (pbv) obj;
        return jl40.l(this.a, pbvVar.a) && jl40.l(this.b, pbvVar.b) && jl40.l(this.c, pbvVar.c) && jl40.l(this.d, pbvVar.d) && jl40.l(this.e, pbvVar.e) && this.f == pbvVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dcv dcvVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (dcvVar == null ? 0 : dcvVar.hashCode())) * 31)) * 31;
        dcv dcvVar2 = this.d;
        int hashCode3 = (hashCode2 + (dcvVar2 == null ? 0 : dcvVar2.hashCode())) * 31;
        vfv vfvVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode3 + (vfvVar != null ? vfvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Url(url=" + this.a + ", placeholder=" + this.b + ", imageSize=" + this.c + ", error=" + this.d + ", transformation=" + this.e + ", shouldApplySdkDefaults=" + this.f + Extension.C_BRAKE;
    }

    public pbv(dcv dcvVar, dcv dcvVar2, tev tevVar, vfv vfvVar, String str, boolean z) {
        this.a = str;
        this.b = dcvVar;
        this.c = tevVar;
        this.d = dcvVar2;
        this.e = vfvVar;
        this.f = z;
    }
}
