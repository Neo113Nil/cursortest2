package defpackage;

import com.ybsdk.api.entities.YBCardDeliveryApplicationStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ef51 {
    public final YBCardDeliveryApplicationStatus a;
    public final String b;

    public ef51(YBCardDeliveryApplicationStatus yBCardDeliveryApplicationStatus, String str) {
        this.a = yBCardDeliveryApplicationStatus;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef51)) {
            return false;
        }
        ef51 ef51Var = (ef51) obj;
        return this.a == ef51Var.a && jl40.l(this.b, ef51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "YBCardDeliveryStatus(applicationStatus=" + this.a + ", deliveryProductType=" + this.b + Extension.C_BRAKE;
    }
}
