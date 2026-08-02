package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nr3 {
    public final boolean a;
    public final MoneyEntity b;
    public final h5r0 c;
    public final String d;

    public nr3(boolean z, MoneyEntity moneyEntity, h5r0 h5r0Var, String str) {
        this.a = z;
        this.b = moneyEntity;
        this.c = h5r0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr3)) {
            return false;
        }
        nr3 nr3Var = (nr3) obj;
        return this.a == nr3Var.a && this.b.equals(nr3Var.b) && this.c.equals(nr3Var.c) && jl40.l(this.d, nr3Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ly3.d(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AutoFundStateEntity(enabled=" + this.a + ", limit=" + this.b + ", bottomSheet=" + this.c + ", unselectedPaymentMethodAction=" + this.d + Extension.C_BRAKE;
    }
}
