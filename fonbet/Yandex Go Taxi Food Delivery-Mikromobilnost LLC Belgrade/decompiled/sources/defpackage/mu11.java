package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class mu11 {
    public final long a;

    public mu11(long j) {
        this.a = j;
    }

    public final boolean a() {
        return this.a > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu11) && this.a == ((mu11) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "Uid(value=", Extension.C_BRAKE);
    }
}
