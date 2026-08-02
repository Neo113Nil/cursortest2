package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;

/* loaded from: classes14.dex */
public final class mct0 {
    public static final mct0 m = new lct0().a();
    public final String a;
    public final String b;
    public final SourceTrailMode c;
    public final String d;
    public final String e;
    public final DestinationTrailMode f;
    public final CharSequence g;
    public final String h;
    public final String i;
    public final String j;
    public final pqk0 k;
    public final int l;

    public mct0(String str, String str2, SourceTrailMode sourceTrailMode, String str3, String str4, DestinationTrailMode destinationTrailMode, CharSequence charSequence, String str5, String str6, String str7, pqk0 pqk0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = sourceTrailMode;
        this.d = str3;
        this.e = str4;
        this.f = destinationTrailMode;
        this.g = charSequence;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = pqk0Var;
        this.l = i;
    }

    public static mct0 a(mct0 mct0Var, String str, String str2, String str3, String str4, pqk0 pqk0Var, int i, int i2) {
        String str5 = (i2 & 1) != 0 ? mct0Var.a : str;
        String str6 = mct0Var.b;
        SourceTrailMode sourceTrailMode = mct0Var.c;
        String str7 = (i2 & 8) != 0 ? mct0Var.d : str2;
        String str8 = (i2 & 16) != 0 ? mct0Var.e : str3;
        DestinationTrailMode destinationTrailMode = mct0Var.f;
        CharSequence charSequence = mct0Var.g;
        String str9 = mct0Var.h;
        String str10 = (i2 & 256) != 0 ? mct0Var.i : str4;
        String str11 = mct0Var.j;
        pqk0 pqk0Var2 = (i2 & 1024) != 0 ? mct0Var.k : pqk0Var;
        int i3 = (i2 & 2048) != 0 ? mct0Var.l : i;
        mct0Var.getClass();
        return new mct0(str5, str6, sourceTrailMode, str7, str8, destinationTrailMode, charSequence, str9, str10, str11, pqk0Var2, i3);
    }

    public final lct0 b() {
        lct0 lct0Var = new lct0();
        lct0Var.a = this.a;
        lct0Var.b = this.b;
        lct0Var.c = this.c;
        lct0Var.f = this.f;
        lct0Var.g = this.g;
        lct0Var.h = this.h;
        lct0Var.i = this.i;
        lct0Var.d = this.d;
        lct0Var.l = this.l;
        return lct0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mct0)) {
            return false;
        }
        mct0 mct0Var = (mct0) obj;
        return jl40.l(this.a, mct0Var.a) && jl40.l(this.b, mct0Var.b) && this.c == mct0Var.c && jl40.l(this.d, mct0Var.d) && jl40.l(this.e, mct0Var.e) && this.f == mct0Var.f && jl40.l(this.g, mct0Var.g) && jl40.l(this.h, mct0Var.h) && jl40.l(this.i, mct0Var.i) && jl40.l(this.j, mct0Var.j) && jl40.l(this.k, mct0Var.k) && this.l == mct0Var.l;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int b = smw0.b((this.f.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.g);
        String str5 = this.h;
        int hashCode4 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        pqk0 pqk0Var = this.k;
        return Integer.hashCode(this.l) + ((hashCode6 + (pqk0Var != null ? pqk0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SourceDestinationModel(sourceAddress=", this.a, ", sourceAddressSubtitle=", this.b, ", sourceTrailMode=");
        v.append(this.c);
        v.append(", destinationAddress=");
        v.append(this.d);
        v.append(", destinationAddressSubtitle=");
        v.append(this.e);
        v.append(", destinationTrailMode=");
        v.append(this.f);
        v.append(", destinationHint=");
        v.append((Object) this.g);
        v.append(", pickupTime=");
        v.append(this.h);
        v.append(", routeTime=");
        g8e.D(v, this.i, ", rideTimeIconTag=", this.j, ", rideTimeAppearance=");
        v.append(this.k);
        v.append(", numberOfDestinationPoints=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
