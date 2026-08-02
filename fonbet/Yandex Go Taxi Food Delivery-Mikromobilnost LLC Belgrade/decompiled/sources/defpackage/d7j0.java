package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d7j0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof d7j0) {
            return this.a.equals(((d7j0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RequestIdEntity(value=", this.a, Extension.C_BRAKE);
    }
}
