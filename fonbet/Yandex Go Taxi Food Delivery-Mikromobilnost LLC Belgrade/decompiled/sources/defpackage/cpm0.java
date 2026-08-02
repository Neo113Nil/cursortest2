package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cpm0 {
    public final r7p0 a;
    public final String b;
    public final ScootersVehicleType c;
    public final q7p0 d;
    public final LinkedHashMap e;
    public final String f;
    public final zzs g;
    public final Integer h;

    public cpm0(r7p0 r7p0Var, String str, ScootersVehicleType scootersVehicleType, q7p0 q7p0Var, LinkedHashMap linkedHashMap, String str2, zzs zzsVar, Integer num) {
        this.a = r7p0Var;
        this.b = str;
        this.c = scootersVehicleType;
        this.d = q7p0Var;
        this.e = linkedHashMap;
        this.f = str2;
        this.g = zzsVar;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cpm0) {
            cpm0 cpm0Var = (cpm0) obj;
            if (this.a.equals(cpm0Var.a) && jl40.l(this.b, cpm0Var.b) && this.c == cpm0Var.c && this.d == cpm0Var.d && this.e.equals(cpm0Var.e) && jl40.l(this.f, cpm0Var.f) && jl40.l(this.g, cpm0Var.g) && jl40.l(this.h, cpm0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        zzs zzsVar = this.g;
        int hashCode3 = (hashCode2 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        Integer num = this.h;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ScooterOffer(number=" + this.a + ", name=" + this.b + ", vehicleType=" + this.c + ", vehicleHealthState=" + this.d + ", tariffIds=" + this.e + ", image=" + this.f + ", location=" + this.g + ", depositAmount=" + this.h + Extension.C_BRAKE;
    }
}
