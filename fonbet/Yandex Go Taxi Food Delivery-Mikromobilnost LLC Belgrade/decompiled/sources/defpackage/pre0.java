package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pre0 implements rre0 {
    public final String a;

    public pre0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pre0) && jl40.l(this.a, ((pre0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TaxiMainScreenWithReset(reason=", this.a, Extension.C_BRAKE);
    }
}
