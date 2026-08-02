package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public final class ge01 {
    public final CharSequence a;
    public final String b;
    public final VehicleType c;
    public final MtTransportType d;

    public ge01(CharSequence charSequence, String str, VehicleType vehicleType, MtTransportType mtTransportType) {
        this.a = charSequence;
        this.b = str;
        this.c = vehicleType;
        this.d = mtTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge01)) {
            return false;
        }
        ge01 ge01Var = (ge01) obj;
        return jl40.l(this.a, ge01Var.a) && jl40.l(this.b, ge01Var.b) && this.c == ge01Var.c && this.d == ge01Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VehicleType vehicleType = this.c;
        int hashCode3 = (hashCode2 + (vehicleType == null ? 0 : vehicleType.hashCode())) * 31;
        MtTransportType mtTransportType = this.d;
        return hashCode3 + (mtTransportType != null ? mtTransportType.hashCode() : 0);
    }

    public final String toString() {
        return "TrainsTicketsButton(title=" + ((Object) this.a) + ", ticketsUrl=" + this.b + ", vehicleType=" + this.c + ", transportType=" + this.d + Extension.C_BRAKE;
    }
}
