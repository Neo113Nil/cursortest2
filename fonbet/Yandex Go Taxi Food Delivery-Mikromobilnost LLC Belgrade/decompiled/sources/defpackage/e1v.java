package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e1v {
    public final zzs a;
    public final bl00 b;
    public final bl00 c;

    public e1v(zzs zzsVar, bl00 bl00Var, bl00 bl00Var2) {
        this.a = zzsVar;
        this.b = bl00Var;
        this.c = bl00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1v)) {
            return false;
        }
        e1v e1vVar = (e1v) obj;
        return jl40.l(this.a, e1vVar.a) && jl40.l(this.b, e1vVar.b) && jl40.l(this.c, e1vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl00 bl00Var = this.b;
        int hashCode2 = (hashCode + (bl00Var == null ? 0 : bl00Var.hashCode())) * 31;
        bl00 bl00Var2 = this.c;
        return hashCode2 + (bl00Var2 != null ? bl00Var2.hashCode() : 0);
    }

    public final String toString() {
        return "HubPinState(point=" + this.a + ", pinImage=" + this.b + ", bulletImage=" + this.c + Extension.C_BRAKE;
    }
}
