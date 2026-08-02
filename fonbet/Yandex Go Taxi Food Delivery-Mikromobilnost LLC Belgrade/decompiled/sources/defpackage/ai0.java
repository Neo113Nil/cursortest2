package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ai0 {
    public static final ai0 c = new ai0(null, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
    public final String a;
    public final AddPaymentInfo$AddPaymentInfoStatus b;

    public ai0(String str, AddPaymentInfo$AddPaymentInfoStatus addPaymentInfo$AddPaymentInfoStatus) {
        this.a = str;
        this.b = addPaymentInfo$AddPaymentInfoStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0)) {
            return false;
        }
        ai0 ai0Var = (ai0) obj;
        return jl40.l(this.a, ai0Var.a) && this.b == ai0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AddPaymentInfo(title=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
