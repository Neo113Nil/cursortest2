package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nfy {
    public final MoneyEntity a;
    public final MoneyEntity b;

    public nfy(MoneyEntity moneyEntity, MoneyEntity moneyEntity2) {
        this.a = moneyEntity;
        this.b = moneyEntity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfy)) {
            return false;
        }
        nfy nfyVar = (nfy) obj;
        return this.a.equals(nfyVar.a) && jl40.l(this.b, nfyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MoneyEntity moneyEntity = this.b;
        return hashCode + (moneyEntity == null ? 0 : moneyEntity.hashCode());
    }

    public final String toString() {
        return "Condition(lowerLimit=" + this.a + ", upperLimit=" + this.b + Extension.C_BRAKE;
    }
}
