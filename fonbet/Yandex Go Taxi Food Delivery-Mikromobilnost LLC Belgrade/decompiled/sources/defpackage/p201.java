package defpackage;

import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p201 {
    public static final p201 l = new p201(0);
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final Double g;
    public final Double h;
    public final zzs i;
    public final Double j;
    public final Date k;

    public p201(boolean z, String str, String str2, int i, String str3, String str4, Double d, Double d2, zzs zzsVar, Double d3, Date date) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = d;
        this.h = d2;
        this.i = zzsVar;
        this.j = d3;
        this.k = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p201)) {
            return false;
        }
        p201 p201Var = (p201) obj;
        return this.a == p201Var.a && jl40.l(this.b, p201Var.b) && jl40.l(this.c, p201Var.c) && this.d == p201Var.d && jl40.l(this.e, p201Var.e) && jl40.l(this.f, p201Var.f) && jl40.l(this.g, p201Var.g) && jl40.l(this.h, p201Var.h) && jl40.l(this.i, p201Var.i) && jl40.l(this.j, p201Var.j) && jl40.l(this.k, p201Var.k);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int b2 = oyr.b(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.g;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.h;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        zzs zzsVar = this.i;
        int hashCode5 = (hashCode4 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        Double d3 = this.j;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Date date = this.k;
        return hashCode6 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("TrackerRemoteDriverInfo(shadeCar=", ", shadeCarTooltipTitle=", this.b, ", shadeCarTooltipText=", this.a);
        b64.A(this.d, this.c, ", accuracyRadius=", ", shadeCarAccessibilityTooltipTitle=", v);
        g8e.D(v, this.e, ", shadeCarAccessibilityTooltipText=", this.f, ", speed=");
        v.append(this.g);
        v.append(", direction=");
        v.append(this.h);
        v.append(", coordinates=");
        v.append(this.i);
        v.append(", distanceLeftInMeters=");
        v.append(this.j);
        v.append(", timestamp=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public p201() {
        this(0);
    }

    public /* synthetic */ p201(int i) {
        this(false, "", null, 0, null, null, null, null, null, null, null);
    }
}
