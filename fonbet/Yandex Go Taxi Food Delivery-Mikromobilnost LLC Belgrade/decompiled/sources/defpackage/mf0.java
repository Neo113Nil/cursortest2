package defpackage;

import com.yandex.go.payments.payment.AddButtonFlow;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mf0 extends vi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final AddButtonFlow e;
    public final AddPaymentModel$State f;

    public mf0(String str, String str2, String str3, String str4, AddButtonFlow addButtonFlow, AddPaymentModel$State addPaymentModel$State) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = addButtonFlow;
        this.f = addPaymentModel$State;
    }

    public final String a() {
        return this.d;
    }

    public final AddPaymentModel$State b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof mf0) {
                mf0 mf0Var = (mf0) obj;
                String str = mf0Var.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str == null) {
                        equals = true;
                        if (equals && jl40.l(this.b, mf0Var.b) && jl40.l(this.c, mf0Var.c) && jl40.l(this.d, mf0Var.d) && this.e.equals(mf0Var.e) && this.f == mf0Var.f) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (str != null) {
                        equals = str2.equals(str);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder v = b64.v("AddMBankPayment(disabled=", str == null ? "null" : of91.e(str), ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", flow=");
        v.append(this.e);
        v.append(", state=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
