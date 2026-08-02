package defpackage;

import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class afo0 implements bfo0 {
    public final String a;
    public final ScootersPassesPendingPurchaseStatus$PackageType b;

    public afo0(String str, ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType) {
        this.a = str;
        this.b = scootersPassesPendingPurchaseStatus$PackageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo0)) {
            return false;
        }
        afo0 afo0Var = (afo0) obj;
        return jl40.l(this.a, afo0Var.a) && this.b == afo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Purchasing(operationId=" + this.a + ", packageType=" + this.b + Extension.C_BRAKE;
    }
}
