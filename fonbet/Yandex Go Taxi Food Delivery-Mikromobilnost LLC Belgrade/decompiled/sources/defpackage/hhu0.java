package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hhu0 implements ihu0 {
    public final efu0 a;

    public hhu0(efu0 efu0Var) {
        this.a = efu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhu0) && this.a.equals(((hhu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnStopSelected(stop=" + this.a + Extension.C_BRAKE;
    }
}
