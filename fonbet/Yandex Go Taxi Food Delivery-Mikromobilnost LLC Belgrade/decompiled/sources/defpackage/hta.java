package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersSubscriptionSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hta {
    public final ChargersSubscriptionSection a;

    public hta(ChargersSubscriptionSection chargersSubscriptionSection) {
        this.a = chargersSubscriptionSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hta) && this.a == ((hta) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChargersSubscriptionDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
