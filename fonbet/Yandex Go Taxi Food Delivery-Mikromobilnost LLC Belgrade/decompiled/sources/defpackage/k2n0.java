package defpackage;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k2n0 implements n2n0 {
    public final ScootersPassesType a;

    public final boolean equals(Object obj) {
        if (obj instanceof k2n0) {
            return this.a == ((k2n0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        ScootersPassesType scootersPassesType = this.a;
        if (scootersPassesType == null) {
            return 0;
        }
        return scootersPassesType.hashCode();
    }

    public final String toString() {
        return "PackagePurchasing(passesType=" + this.a + Extension.C_BRAKE;
    }
}
