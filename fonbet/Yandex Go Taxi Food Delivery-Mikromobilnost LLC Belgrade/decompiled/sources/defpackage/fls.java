package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class fls {
    public final String a;
    public final String b;
    public final boolean c;
    public final els d;
    public final String e;
    public final dls f;
    public final int g;
    public final boolean h;
    public final als i;
    public final String j;
    public final zks k;

    public fls(String str, String str2, boolean z, els elsVar, String str3, dls dlsVar, int i, boolean z2, als alsVar, String str4, zks zksVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = elsVar;
        this.e = str3;
        this.f = dlsVar;
        this.g = i;
        this.h = z2;
        this.i = alsVar;
        this.j = str4;
        this.k = zksVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fls)) {
            return false;
        }
        fls flsVar = (fls) obj;
        return jl40.l(this.a, flsVar.a) && jl40.l(this.b, flsVar.b) && this.c == flsVar.c && jl40.l(this.d, flsVar.d) && jl40.l(this.e, flsVar.e) && this.f.equals(flsVar.f) && this.g == flsVar.g && this.h == flsVar.h && jl40.l(this.i, flsVar.i) && jl40.l(this.j, flsVar.j) && jl40.l(this.k, flsVar.k);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        els elsVar = this.d;
        int e2 = unr0.e(oyr.b(this.g, (this.f.hashCode() + unr0.b((e + (elsVar == null ? 0 : elsVar.hashCode())) * 31, 31, this.e)) * 31, 31), 31, this.h);
        als alsVar = this.i;
        int hashCode = (e2 + (alsVar == null ? 0 : alsVar.hashCode())) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        zks zksVar = this.k;
        return hashCode2 + (zksVar != null ? zksVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("UiState(sourceTitle=", this.a, ", sourceSubtitle=", this.b, ", isShimmeringSubtitle=");
        v.append(this.c);
        v.append(", nextButton=");
        v.append(this.d);
        v.append(", destinationInputHint=");
        v.append(this.e);
        v.append(", destinationInputIcon=");
        v.append(this.f);
        v.append(", scroll=");
        tse0.z(v, this.g, ", isLoading=", this.h, ", floatingTrailButton=");
        v.append(this.i);
        v.append(", floatingInputMapIconUrl=");
        v.append(this.j);
        v.append(", cartButton=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
