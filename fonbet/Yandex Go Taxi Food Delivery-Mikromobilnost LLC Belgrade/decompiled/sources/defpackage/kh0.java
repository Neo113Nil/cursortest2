package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kh0 {
    public final String a;
    public final AddPaymentHomeResponse.ButtonState b;
    public final Boolean c;
    public final Boolean d;

    public kh0(String str, AddPaymentHomeResponse.ButtonState buttonState, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = buttonState;
        this.c = bool;
        this.d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh0)) {
            return false;
        }
        kh0 kh0Var = (kh0) obj;
        return jl40.l(this.a, kh0Var.a) && this.b == kh0Var.b && jl40.l(this.c, kh0Var.c) && jl40.l(this.d, kh0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonConditionState(titleOverride=" + this.a + ", state=" + this.b + ", isRequiredFieldFilled=" + this.c + ", isStartBindingInProgress=" + this.d + Extension.C_BRAKE;
    }
}
