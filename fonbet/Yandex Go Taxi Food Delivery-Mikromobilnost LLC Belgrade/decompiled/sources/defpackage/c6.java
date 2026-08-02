package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c6 implements d6 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof c6) {
            return this.a.equals(((c6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenPolicy(url=", this.a, Extension.C_BRAKE);
    }
}
