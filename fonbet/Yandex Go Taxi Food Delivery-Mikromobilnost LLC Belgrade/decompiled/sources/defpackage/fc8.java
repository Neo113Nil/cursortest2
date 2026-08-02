package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fc8 extends kfb1 {
    public final String b;

    public fc8(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc8) && jl40.l(this.b, ((fc8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Classic(checkInTitle=", this.b, Extension.C_BRAKE);
    }
}
