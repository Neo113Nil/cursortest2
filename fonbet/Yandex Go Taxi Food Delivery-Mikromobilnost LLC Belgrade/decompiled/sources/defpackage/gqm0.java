package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gqm0 implements hqm0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof gqm0) {
            return this.a.equals(((gqm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Tag(tag=", this.a, Extension.C_BRAKE);
    }
}
