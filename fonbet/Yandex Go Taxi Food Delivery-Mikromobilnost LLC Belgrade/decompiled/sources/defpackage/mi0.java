package defpackage;

import com.yandex.go.deeplinks.generated.add_payment_method.AddPaymentMethodType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mi0 {
    public final AddPaymentMethodType a;
    public final String b;

    public mi0(AddPaymentMethodType addPaymentMethodType, String str) {
        this.a = addPaymentMethodType;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final AddPaymentMethodType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj;
        return this.a == mi0Var.a && jl40.l(this.b, mi0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AddPaymentMethodDeeplink(type=" + this.a + ", service=" + this.b + Extension.C_BRAKE;
    }
}
