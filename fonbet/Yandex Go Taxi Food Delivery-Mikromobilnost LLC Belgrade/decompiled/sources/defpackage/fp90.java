package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class fp90 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof fp90) {
            return this.a.equals(((fp90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PassportToken(value=", this.a, Extension.C_BRAKE);
    }
}
