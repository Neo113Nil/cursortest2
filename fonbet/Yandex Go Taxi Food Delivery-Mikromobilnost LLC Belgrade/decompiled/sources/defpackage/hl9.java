package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hl9 {
    public final z8y a;
    public final Long b;

    public hl9(z8y z8yVar, Long l) {
        this.a = z8yVar;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl9)) {
            return false;
        }
        hl9 hl9Var = (hl9) obj;
        return jl40.l(this.a, hl9Var.a) && jl40.l(this.b, hl9Var.b);
    }

    public final int hashCode() {
        z8y z8yVar = this.a;
        int hashCode = (z8yVar == null ? 0 : z8yVar.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "FreeCheckTimerState(order=" + this.a + ", remainingMs=" + this.b + Extension.C_BRAKE;
    }
}
