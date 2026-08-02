package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class li51 extends gu91 {
    public final String f;

    public li51(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li51) && jl40.l(this.f, ((li51) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Support(supportUrl=", this.f, Extension.C_BRAKE);
    }
}
