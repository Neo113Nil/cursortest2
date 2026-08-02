package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mr3 {
    public final MoneyEntity a;

    public mr3(MoneyEntity moneyEntity) {
        this.a = moneyEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr3) && jl40.l(this.a, ((mr3) obj).a);
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        if (moneyEntity == null) {
            return 0;
        }
        return moneyEntity.hashCode();
    }

    public final String toString() {
        return "AutoFundPrefillEntity(limit=" + this.a + Extension.C_BRAKE;
    }
}
