package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes13.dex */
public final class oce0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Address f;
    public final zzs g;
    public final RoutePointType h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public oce0(String str, String str2, String str3, String str4, String str5, Address address, zzs zzsVar, RoutePointType routePointType, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = address;
        this.g = zzsVar;
        this.h = routePointType;
        this.i = i;
        this.j = z;
        this.k = z2;
    }

    public final boolean a() {
        zzs B = this.f.B();
        uzs uzsVar = zzs.Companion;
        return !this.g.a(B, 1.0E-6d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oce0)) {
            return false;
        }
        oce0 oce0Var = (oce0) obj;
        return jl40.l(this.a, oce0Var.a) && jl40.l(this.b, oce0Var.b) && jl40.l(this.c, oce0Var.c) && jl40.l(this.d, oce0Var.d) && jl40.l(this.e, oce0Var.e) && jl40.l(this.f, oce0Var.f) && jl40.l(this.g, oce0Var.g) && this.h == oce0Var.h && this.i == oce0Var.i && this.j == oce0Var.j && this.k == oce0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + unr0.e(oyr.b(this.i, (this.h.hashCode() + nnm.b(this.g, (this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31)) * 31, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder v = b64.v("PositionAlertParam(alertId=", this.a, ", title=", this.b, ", message=");
        g8e.D(v, this.c, ", buttonText=", this.d, ", pinZoneId=");
        v.append(this.e);
        v.append(", addressToMoveTo=");
        v.append(this.f);
        v.append(", originalGeoPoint=");
        v.append(this.g);
        v.append(", pointType=");
        v.append(this.h);
        v.append(", showCount=");
        tse0.z(v, this.i, ", forcePickSrcPoint=", this.j, ", shouldRestoreSummaryOnDismiss=");
        return x4e.i(v, this.k, Extension.C_BRAKE);
    }
}
