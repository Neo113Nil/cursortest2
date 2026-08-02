package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nk0 extends vi0 {
    public final List a;

    public nk0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk0) && jl40.l(this.a, ((nk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.h("AddYbWalletPayment(disabled=", "null", ", paymentTags=", Extension.C_BRAKE, this.a);
    }
}
