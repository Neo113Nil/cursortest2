package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ii51 extends gu91 {
    public final String f;

    public ii51(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii51) && jl40.l(this.f, ((ii51) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return oyr.p("Error(errorType=", this.f, Extension.C_BRAKE);
    }
}
