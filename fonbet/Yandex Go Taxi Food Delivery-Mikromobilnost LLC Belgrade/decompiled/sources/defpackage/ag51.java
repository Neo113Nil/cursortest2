package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ag51 {
    public final ig51 a;

    public ag51(ig51 ig51Var) {
        this.a = ig51Var;
    }

    public final ig51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag51) && this.a.equals(((ag51) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "YBPlusDataRequest(json=" + this.a + Extension.C_BRAKE;
    }
}
