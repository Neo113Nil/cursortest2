package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesScreenOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a36 {
    public final BleVehiclesScreenOpenReason a;
    public final String b;
    public final String c;

    public a36(BleVehiclesScreenOpenReason bleVehiclesScreenOpenReason, String str, String str2) {
        this.a = bleVehiclesScreenOpenReason;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a36)) {
            return false;
        }
        a36 a36Var = (a36) obj;
        return this.a == a36Var.a && jl40.l(this.b, a36Var.b) && jl40.l(this.c, a36Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BleVehiclesAnalyticsContext(source=");
        sb.append(this.a);
        sb.append(", utmSource=");
        sb.append(this.b);
        sb.append(", utmMedium=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
