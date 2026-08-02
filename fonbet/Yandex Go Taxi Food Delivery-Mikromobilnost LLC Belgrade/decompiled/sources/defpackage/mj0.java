package defpackage;

import com.yandex.go.payments.payment.AddPaymentModel$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mj0 extends vi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final AddPaymentModel$State e;

    public mj0(String str, String str2, String str3, String str4, AddPaymentModel$State addPaymentModel$State) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = addPaymentModel$State;
    }

    public final boolean equals(Object obj) {
        boolean a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj;
        String str = mj0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                a = true;
            }
            a = false;
        } else {
            if (str != null) {
                a = of91.a(str2, str);
            }
            a = false;
        }
        return a && jl40.l(this.b, mj0Var.b) && jl40.l(this.c, mj0Var.c) && jl40.l(this.d, mj0Var.d) && this.e == mj0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b((str == null ? 0 : of91.b(str)) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder v = b64.v("AddSbpTokenPayment(disabled=", str == null ? "null" : of91.e(str), ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", state=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
