package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f21 {
    public final AddressMapPickerPointType a;
    public final k91 b;
    public final pv0 c;
    public final ifp d;
    public final String e;
    public final String f;

    public /* synthetic */ f21(AddressMapPickerPointType addressMapPickerPointType, String str, String str2, int i) {
        this(addressMapPickerPointType, f91.a, null, gfp.a, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }

    public static f21 a(f21 f21Var, k91 k91Var, pv0 pv0Var, ifp ifpVar, String str, String str2, int i) {
        pv0 pv0Var2 = pv0Var;
        AddressMapPickerPointType addressMapPickerPointType = f21Var.a;
        if ((i & 4) != 0) {
            pv0Var2 = f21Var.c;
        }
        if ((i & 8) != 0) {
            ifpVar = f21Var.d;
        }
        if ((i & 16) != 0) {
            str = f21Var.e;
        }
        if ((i & 32) != 0) {
            str2 = f21Var.f;
        }
        String str3 = str2;
        f21Var.getClass();
        String str4 = str;
        return new f21(addressMapPickerPointType, k91Var, pv0Var2, ifpVar, str4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f21)) {
            return false;
        }
        f21 f21Var = (f21) obj;
        return this.a == f21Var.a && jl40.l(this.b, f21Var.b) && jl40.l(this.c, f21Var.c) && jl40.l(this.d, f21Var.d) && jl40.l(this.e, f21Var.e) && jl40.l(this.f, f21Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pv0 pv0Var = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (pv0Var == null ? 0 : pv0Var.hashCode())) * 31)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressMapPickerState(pointType=");
        sb.append(this.a);
        sb.append(", addressViewType=");
        sb.append(this.b);
        sb.append(", addressInfo=");
        sb.append(this.c);
        sb.append(", favoriteButtonState=");
        sb.append(this.d);
        sb.append(", pickupFromPhotoButtonImageUrl=");
        return g8e.r(sb, this.e, ", pickupFromPhotoButtonDescription=", this.f, Extension.C_BRAKE);
    }

    public f21(AddressMapPickerPointType addressMapPickerPointType, k91 k91Var, pv0 pv0Var, ifp ifpVar, String str, String str2) {
        this.a = addressMapPickerPointType;
        this.b = k91Var;
        this.c = pv0Var;
        this.d = ifpVar;
        this.e = str;
        this.f = str2;
    }
}
