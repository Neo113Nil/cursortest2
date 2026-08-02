package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h940 implements i940 {
    public final n410 a;

    public h940(n410 n410Var) {
        this.a = n410Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h940) && jl40.l(this.a, ((h940) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlotAction(actionDto=" + this.a + Extension.C_BRAKE;
    }
}
