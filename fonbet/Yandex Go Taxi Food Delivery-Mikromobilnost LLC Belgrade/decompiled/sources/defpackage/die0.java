package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class die0 {
    public final List a;
    public final String b;

    public die0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof die0)) {
            return false;
        }
        die0 die0Var = (die0) obj;
        return jl40.l(this.a, die0Var.a) && jl40.l(this.b, die0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.i("Props(paymentMethods=", ", tariffClass=", this.b, Extension.C_BRAKE, this.a);
    }
}
