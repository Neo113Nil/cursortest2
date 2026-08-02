package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ejv0 implements ijv0 {
    public final igu0 a;

    public ejv0(igu0 igu0Var) {
        this.a = igu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejv0) && this.a.equals(((ejv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopModal(stopModel=" + this.a + Extension.C_BRAKE;
    }
}
