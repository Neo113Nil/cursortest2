package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f31 implements i31 {
    public final AddressMapPickerPointType a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;
    public final String g;

    public f31(AddressMapPickerPointType addressMapPickerPointType, String str, String str2, String str3, ArrayList arrayList, String str4, String str5) {
        this.a = addressMapPickerPointType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f31)) {
            return false;
        }
        f31 f31Var = (f31) obj;
        return this.a == f31Var.a && this.b.equals(f31Var.b) && jl40.l(this.c, f31Var.c) && this.d.equals(f31Var.d) && this.e.equals(f31Var.e) && jl40.l(this.f, f31Var.f) && jl40.l(this.g, f31Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b2 = ly3.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Drums(pointType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", buttonTitle=", this.d, ", items=");
        sb.append(this.e);
        sb.append(", pickupFromPhotoButtonImageUrl=");
        sb.append(this.f);
        sb.append(", pickupFromPhotoButtonDescription=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
