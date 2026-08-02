package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class be9 {
    public final String a;
    public final String b;
    public final boolean c;

    public be9(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be9)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        return jl40.l(this.a, be9Var.a) && jl40.l(this.b, be9Var.b) && this.c == be9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ChangePaymentSuggest(paymentMethodId=", this.a, ", paymentMethodType=", this.b, ", shouldShowSuggest="), this.c, Extension.C_BRAKE);
    }
}
