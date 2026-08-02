package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class owz0 implements pwz0 {
    public final kw11 a;

    public owz0(kw11 kw11Var) {
        this.a = kw11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owz0) && jl40.l(this.a, ((owz0) obj).a);
    }

    public final int hashCode() {
        kw11 kw11Var = this.a;
        if (kw11Var == null) {
            return 0;
        }
        return kw11Var.hashCode();
    }

    public final String toString() {
        return "UnsupportedAddress(unavailabilityReason=" + this.a + Extension.C_BRAKE;
    }
}
