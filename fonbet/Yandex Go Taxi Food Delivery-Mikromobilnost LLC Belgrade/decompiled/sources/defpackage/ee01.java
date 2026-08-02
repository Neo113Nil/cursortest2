package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public final class ee01 {
    public final CharSequence a;
    public final fe01 b;
    public final VehicleType c;
    public final MtTransportType d;

    public ee01(CharSequence charSequence, fe01 fe01Var, VehicleType vehicleType, MtTransportType mtTransportType) {
        this.a = charSequence;
        this.b = fe01Var;
        this.c = vehicleType;
        this.d = mtTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee01)) {
            return false;
        }
        ee01 ee01Var = (ee01) obj;
        return jl40.l(this.a, ee01Var.a) && jl40.l(this.b, ee01Var.b) && this.c == ee01Var.c && this.d == ee01Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        VehicleType vehicleType = this.c;
        int hashCode2 = (hashCode + (vehicleType == null ? 0 : vehicleType.hashCode())) * 31;
        MtTransportType mtTransportType = this.d;
        return hashCode2 + (mtTransportType != null ? mtTransportType.hashCode() : 0);
    }

    public final String toString() {
        return "TrainsScheduleButton(title=" + ((Object) this.a) + ", params=" + this.b + ", vehicleType=" + this.c + ", transportType=" + this.d + Extension.C_BRAKE;
    }
}
