package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class az0 implements kz0 {
    public final zzs a;
    public final AddressMapPickerPointType b;
    public final i11 c;

    public az0(zzs zzsVar, AddressMapPickerPointType addressMapPickerPointType, i11 i11Var) {
        this.a = zzsVar;
        this.b = addressMapPickerPointType;
        this.c = i11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0Var = (az0) obj;
        return jl40.l(this.a, az0Var.a) && this.b == az0Var.b && jl40.l(this.c, az0Var.c);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = zzsVar == null ? 0 : zzsVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "Init(initialPoint=" + this.a + ", pointType=" + this.b + ", mode=" + this.c + Extension.C_BRAKE;
    }
}
