package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class mc71 implements qf71 {
    public final String a;

    public mc71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc71) && jl40.l(this.a, ((mc71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnWarningButtonClick(waring=", this.a, Extension.C_BRAKE);
    }
}
