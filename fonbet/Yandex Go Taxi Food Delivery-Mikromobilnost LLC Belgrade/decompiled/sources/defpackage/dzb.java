package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class dzb {
    public static final czb Companion = new czb();
    public final v03 a;
    public final ipv0 b;

    public /* synthetic */ dzb(int i, v03 v03Var, ipv0 ipv0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bzb.a.getDescriptor());
            throw null;
        }
        this.a = v03Var;
        this.b = ipv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzb)) {
            return false;
        }
        dzb dzbVar = (dzb) obj;
        return jl40.l(this.a, dzbVar.a) && jl40.l(this.b, dzbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClarifyPointsParams(state=" + this.a + ", summaryState=" + this.b + Extension.C_BRAKE;
    }

    public dzb(v03 v03Var, ipv0 ipv0Var) {
        this.a = v03Var;
        this.b = ipv0Var;
    }
}
