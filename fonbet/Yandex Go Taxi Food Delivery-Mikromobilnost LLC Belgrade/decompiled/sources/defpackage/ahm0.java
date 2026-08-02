package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ahm0 extends mi91 {
    public final String a;

    public ahm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahm0) && this.a.equals(((ahm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SbpImageForMethod(methodIconUrl=", this.a, Extension.C_BRAKE);
    }
}
