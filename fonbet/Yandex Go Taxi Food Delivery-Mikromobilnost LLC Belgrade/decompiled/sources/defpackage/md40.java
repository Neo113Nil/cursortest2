package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class md40 implements td40 {
    public final hb40 a;

    public md40(hb40 hb40Var) {
        this.a = hb40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md40) && jl40.l(this.a, ((md40) obj).a);
    }

    public final int hashCode() {
        hb40 hb40Var = this.a;
        if (hb40Var == null) {
            return 0;
        }
        return hb40Var.hashCode();
    }

    public final String toString() {
        return "OnPayClick(paymentInfo=" + this.a + Extension.C_BRAKE;
    }
}
