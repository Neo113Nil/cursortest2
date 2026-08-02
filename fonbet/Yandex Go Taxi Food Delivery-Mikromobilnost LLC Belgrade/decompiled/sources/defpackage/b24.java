package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b24 {
    public final boolean a;
    public final MoneyEntity b;
    public final MoneyEntity c;
    public final i5r0 d;
    public final String e;

    public b24(boolean z, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, i5r0 i5r0Var, String str) {
        this.a = z;
        this.b = moneyEntity;
        this.c = moneyEntity2;
        this.d = i5r0Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b24)) {
            return false;
        }
        b24 b24Var = (b24) obj;
        return this.a == b24Var.a && this.b.equals(b24Var.b) && this.c.equals(b24Var.c) && this.d.equals(b24Var.d) && jl40.l(this.e, b24Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ly3.d(this.c, ly3.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupStateEntity(enabled=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", threshold=");
        sb.append(this.c);
        sb.append(", bottomSheet=");
        sb.append(this.d);
        sb.append(", unselectedPaymentMethodAction=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
