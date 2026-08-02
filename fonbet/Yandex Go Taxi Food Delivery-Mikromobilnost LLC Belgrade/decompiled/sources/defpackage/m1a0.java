package defpackage;

import com.yandex.go.payments.payment.PaymentInfo$PaymentInfoTitle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class m1a0 {
    public static final m1a0 h;
    public final String a;
    public final String b;
    public final t0a0 c;
    public final t0a0 d;
    public final String e;
    public final boolean f;
    public final PaymentInfo$PaymentInfoTitle g;

    static {
        o0a0 o0a0Var = o0a0.c;
        h = new m1a0("", "", o0a0Var, o0a0Var, null, false, null);
    }

    public m1a0(String str, String str2, t0a0 t0a0Var, t0a0 t0a0Var2, String str3, boolean z, PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle) {
        this.a = str;
        this.b = str2;
        this.c = t0a0Var;
        this.d = t0a0Var2;
        this.e = str3;
        this.f = z;
        this.g = paymentInfo$PaymentInfoTitle;
    }

    public final String a() {
        String str = this.e;
        return (str == null || evu0.J(str)) ? this.a : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1a0)) {
            return false;
        }
        m1a0 m1a0Var = (m1a0) obj;
        return jl40.l(this.a, m1a0Var.a) && jl40.l(this.b, m1a0Var.b) && jl40.l(this.c, m1a0Var.c) && jl40.l(this.d, m1a0Var.d) && jl40.l(this.e, m1a0Var.e) && this.f == m1a0Var.f && jl40.l(this.g, m1a0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle = this.g;
        return e + (paymentInfo$PaymentInfoTitle != null ? paymentInfo$PaymentInfoTitle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentInfo(title=", this.a, ", subtitle=", this.b, ", paymentOptionInfo=");
        v.append(this.c);
        v.append(", complementaryPaymentOptionInfo=");
        v.append(this.d);
        v.append(", nullableLongTitle=");
        tse0.y(this.e, ", isComposite=", ", paymentInfoTitle=", v, this.f);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
