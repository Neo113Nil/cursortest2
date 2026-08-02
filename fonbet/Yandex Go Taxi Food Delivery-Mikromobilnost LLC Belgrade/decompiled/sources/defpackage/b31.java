package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b31 implements i31 {
    public final AddressMapPickerPointType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final qb90 h;
    public final String i;
    public final ifp j;
    public final String k;
    public final String l;
    public final boolean m;

    public b31(AddressMapPickerPointType addressMapPickerPointType, String str, String str2, String str3, String str4, String str5, String str6, qb90 qb90Var, String str7, ifp ifpVar, String str8, String str9, boolean z) {
        this.a = addressMapPickerPointType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = qb90Var;
        this.i = str7;
        this.j = ifpVar;
        this.k = str8;
        this.l = str9;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return this.a == b31Var.a && jl40.l(this.b, b31Var.b) && jl40.l(this.c, b31Var.c) && this.d.equals(b31Var.d) && jl40.l(this.e, b31Var.e) && jl40.l(this.f, b31Var.f) && jl40.l(this.g, b31Var.g) && jl40.l(this.h, b31Var.h) && this.i.equals(b31Var.i) && jl40.l(this.j, b31Var.j) && jl40.l(this.k, b31Var.k) && jl40.l(this.l, b31Var.l) && this.m == b31Var.m;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int e = unr0.e(unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, false);
        qb90 qb90Var = this.h;
        int hashCode2 = (this.j.hashCode() + unr0.b((e + (qb90Var == null ? 0 : qb90Var.hashCode())) * 31, 31, this.i)) * 31;
        String str3 = this.k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        return Boolean.hashCode(this.m) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChoosePointOnMap(pointType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", addressTitle=");
        g8e.D(sb, this.c, ", addressSubtitle=", this.d, ", entranceButtonTitle=");
        g8e.D(sb, this.e, ", entranceNumber=", this.f, ", buttonTitle=");
        sb.append(this.g);
        sb.append(", clickableAddress=false, panoramaButtonState=");
        sb.append(this.h);
        sb.append(", panoramaButtonContentDescription=");
        sb.append(this.i);
        sb.append(", favoriteButtonState=");
        sb.append(this.j);
        sb.append(", pickupFromPhotoButtonImageUrl=");
        g8e.D(sb, this.k, ", pickupFromPhotoButtonDescription=", this.l, ", showFavoriteIcon=");
        return x4e.i(sb, this.m, Extension.C_BRAKE);
    }
}
