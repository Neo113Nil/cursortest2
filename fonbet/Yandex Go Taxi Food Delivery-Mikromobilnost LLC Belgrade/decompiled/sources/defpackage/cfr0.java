package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cfr0 extends efr0 {
    public final q6b a;

    public cfr0(q6b q6bVar) {
        this.a = q6bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfr0) && this.a.equals(((cfr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenTimeline(args=" + this.a + Extension.C_BRAKE;
    }
}
