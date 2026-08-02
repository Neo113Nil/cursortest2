package defpackage;

import com.yandex.go.taxi.experiments.InactiveTariffView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fx1 {
    public final String a;
    public final InactiveTariffView b;

    public fx1(String str, InactiveTariffView inactiveTariffView) {
        this.a = str;
        this.b = inactiveTariffView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx1)) {
            return false;
        }
        fx1 fx1Var = (fx1) obj;
        return this.a.equals(fx1Var.a) && this.b.equals(fx1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativeInactiveTariffView(alternativeType=" + this.a + ", inactiveTariffView=" + this.b + Extension.C_BRAKE;
    }
}
