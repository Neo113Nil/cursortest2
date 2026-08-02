package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ic71 extends sr71 {
    public final String b;

    public ic71(String str) {
        super("Ad Units");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic71) && jl40.l(this.b, ((ic71) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("AdUnit(unitId=", this.b, Extension.C_BRAKE);
    }
}
