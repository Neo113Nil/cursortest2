package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ar9 {
    public final String a;

    public ar9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar9) && jl40.l(this.a, ((ar9) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenDvizhInPlus(offerTariffName=", this.a, Extension.C_BRAKE);
    }

    public ar9() {
        this(null);
    }
}
