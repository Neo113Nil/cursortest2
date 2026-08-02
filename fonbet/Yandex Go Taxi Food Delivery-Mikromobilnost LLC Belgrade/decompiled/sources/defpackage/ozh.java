package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class ozh implements uhx0, e6v {
    public final String a;
    public final TariffOrderFlow b;

    public ozh(String str, TariffOrderFlow tariffOrderFlow) {
        this.a = str;
        this.b = tariffOrderFlow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozh)) {
            return false;
        }
        ozh ozhVar = (ozh) obj;
        return jl40.l(this.a, ozhVar.a) && this.b == ozhVar.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "DeliveryCommentRequirement";
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TariffOrderFlow tariffOrderFlow = this.b;
        return hashCode + (tariffOrderFlow != null ? tariffOrderFlow.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryCommentRequirementContentItem(tariffClass=" + this.a + ", orderFlow=" + this.b + Extension.C_BRAKE;
    }
}
