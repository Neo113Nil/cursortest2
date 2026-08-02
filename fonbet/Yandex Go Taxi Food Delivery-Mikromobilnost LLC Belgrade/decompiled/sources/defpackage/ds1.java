package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ds1 {
    public final String a;
    public final String b;
    public final String c;
    public final seu d;
    public final boolean e;
    public final odj f;
    public final whi0 g;

    public ds1(String str, String str2, String str3, seu seuVar, boolean z, odj odjVar, whi0 whi0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = seuVar;
        this.e = z;
        this.f = odjVar;
        this.g = whi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds1)) {
            return false;
        }
        ds1 ds1Var = (ds1) obj;
        return jl40.l(this.a, ds1Var.a) && jl40.l(this.b, ds1Var.b) && jl40.l(this.c, ds1Var.c) && jl40.l(this.d, ds1Var.d) && this.e == ds1Var.e && jl40.l(this.f, ds1Var.f) && jl40.l(this.g, ds1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.e(unr0.e(unr0.e((this.d.hashCode() + unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, this.c)) * 31, 31, false), 31, false), 31, this.e)) * 31;
        this.g.getClass();
        return hashCode + 1045364792;
    }

    public final String toString() {
        StringBuilder v = b64.v("AliceConfigInternal(appId=", this.a, ", speechkitApiKey=", this.b, ", enableSpotters=false, uuid=");
        v.append(this.c);
        v.append(", responseMode=");
        v.append(this.d);
        v.append(", vocalizerEnabled=false, requireAuthorization=false, requireMetricaUuid=");
        v.append(this.e);
        v.append(", defaultDialogContext=");
        v.append(this.f);
        v.append(", recognizerModel=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
