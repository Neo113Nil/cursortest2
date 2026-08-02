package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pnm0 extends mza1 {
    public final v5z0 a;

    public pnm0(v5z0 v5z0Var) {
        this.a = v5z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnm0) && this.a.equals(((pnm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedTime(time=" + this.a + Extension.C_BRAKE;
    }
}
