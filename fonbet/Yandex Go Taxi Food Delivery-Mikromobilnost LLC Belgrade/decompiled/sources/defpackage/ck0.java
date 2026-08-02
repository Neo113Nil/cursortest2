package defpackage;

import com.yandex.go.payments.payment.AddButtonFlow;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ck0 extends vi0 {
    public final String a;
    public final String b;
    public final String c;
    public final AddButtonFlow d;

    public ck0(String str, String str2, String str3, AddButtonFlow addButtonFlow) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = addButtonFlow;
    }

    public final AddButtonFlow a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return jl40.l(this.a, ck0Var.a) && jl40.l(this.b, ck0Var.b) && jl40.l(this.c, ck0Var.c) && this.d.equals(ck0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddTransportExternalPayment(disabled=", "null", ", title=", this.a, ", subtitle=");
        g8e.D(v, this.b, ", iconTag=", this.c, ", flow=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
