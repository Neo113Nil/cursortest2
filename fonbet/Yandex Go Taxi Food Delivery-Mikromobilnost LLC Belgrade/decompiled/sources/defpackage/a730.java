package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a730 {
    public final int a;
    public final MoneyEntity b;

    public a730(int i, MoneyEntity moneyEntity) {
        this.a = i;
        this.b = moneyEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a730)) {
            return false;
        }
        a730 a730Var = (a730) obj;
        return this.a == a730Var.a && this.b.equals(a730Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MonthDayToMoneyEntity(day=" + this.a + ", money=" + this.b + Extension.C_BRAKE;
    }
}
