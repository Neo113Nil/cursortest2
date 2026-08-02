package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cus0 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof cus0) {
            return this.a == ((cus0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("SlotPosition(positions=", s5w.b(this.a), Extension.C_BRAKE);
    }
}
