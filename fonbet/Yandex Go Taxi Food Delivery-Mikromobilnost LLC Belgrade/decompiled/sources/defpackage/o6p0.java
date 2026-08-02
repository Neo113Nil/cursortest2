package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes13.dex */
public final class o6p0 {
    public final DebtStatus a;
    public final int b;
    public final fef c;

    public o6p0(DebtStatus debtStatus, int i, fef fefVar) {
        this.a = debtStatus;
        this.b = i;
        this.c = fefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6p0)) {
            return false;
        }
        o6p0 o6p0Var = (o6p0) obj;
        return this.a == o6p0Var.a && this.b == o6p0Var.b && this.c.equals(o6p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Debt(status=" + this.a + ", amount=" + this.b + ", currencyRules=" + this.c + Extension.C_BRAKE;
    }
}
