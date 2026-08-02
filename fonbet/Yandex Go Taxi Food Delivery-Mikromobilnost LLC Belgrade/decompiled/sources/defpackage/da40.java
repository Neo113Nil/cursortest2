package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lda40;", "", "Companion", "ba40", "ca40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class da40 {
    public static final ca40 Companion = new ca40();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new e540(5)), null};
    public final VehicleTypeType a;
    public final String b;

    public /* synthetic */ da40(int i, VehicleTypeType vehicleTypeType, String str) {
        this.a = (i & 1) == 0 ? VehicleTypeType.BUS : vehicleTypeType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da40)) {
            return false;
        }
        da40 da40Var = (da40) obj;
        return this.a == da40Var.a && jl40.l(this.b, da40Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MtTrainCheckoutAnalyticInfoDto(vehicleType=" + this.a + ", tariffType=" + this.b + Extension.C_BRAKE;
    }

    public da40() {
        this(0);
    }

    public da40(int i) {
        this.a = VehicleTypeType.BUS;
        this.b = null;
    }
}
