package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class exu {
    public final zzs a;
    public final gk00 b;
    public final bl00 c;

    public exu(zzs zzsVar, gk00 gk00Var, bl00 bl00Var) {
        this.a = zzsVar;
        this.b = gk00Var;
        this.c = bl00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof exu) {
            exu exuVar = (exu) obj;
            return jl40.l(this.a, exuVar.a) && jl40.l(this.b, exuVar.b) && this.c == exuVar.c;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gk00 gk00Var = this.b;
        return this.c.hashCode() + ((hashCode + (gk00Var == null ? 0 : gk00Var.hashCode())) * 31);
    }

    public final String toString() {
        return "HubAnimatedPinState(point=" + this.a + ", pinImage=" + this.b + ", bulletImage=" + this.c + Extension.C_BRAKE;
    }
}
