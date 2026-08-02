package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cyv {
    public final na2 a;
    public final na2 b;
    public final na2 c;
    public final na2 d;
    public final zy11 e;
    public final zy11 f;

    public cyv(na2 na2Var, na2 na2Var2, na2 na2Var3, na2 na2Var4, zy11 zy11Var, zy11 zy11Var2) {
        this.a = na2Var;
        this.b = na2Var2;
        this.c = na2Var3;
        this.d = na2Var4;
        this.e = zy11Var;
        this.f = zy11Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyv)) {
            return false;
        }
        cyv cyvVar = (cyv) obj;
        return jl40.l(this.a, cyvVar.a) && jl40.l(this.b, cyvVar.b) && jl40.l(this.c, cyvVar.c) && jl40.l(this.d, cyvVar.d) && jl40.l(this.e, cyvVar.e) && jl40.l(this.f, cyvVar.f);
    }

    public final int hashCode() {
        na2 na2Var = this.a;
        int hashCode = (na2Var == null ? 0 : na2Var.hashCode()) * 31;
        na2 na2Var2 = this.b;
        int hashCode2 = (hashCode + (na2Var2 == null ? 0 : na2Var2.hashCode())) * 31;
        na2 na2Var3 = this.c;
        int hashCode3 = (hashCode2 + (na2Var3 == null ? 0 : na2Var3.hashCode())) * 31;
        na2 na2Var4 = this.d;
        int hashCode4 = (hashCode3 + (na2Var4 == null ? 0 : na2Var4.hashCode())) * 31;
        zy11 zy11Var = this.e;
        int hashCode5 = (hashCode4 + (zy11Var == null ? 0 : zy11Var.hashCode())) * 31;
        zy11 zy11Var2 = this.f;
        return hashCode5 + (zy11Var2 != null ? zy11Var2.hashCode() : 0);
    }

    public final String toString() {
        return "InputConfig(gps=" + this.a + ", network=" + this.b + ", fused=" + this.c + ", passive=" + this.d + ", mapkit=" + this.e + ", lbs=" + this.f + Extension.C_BRAKE;
    }

    public cyv() {
        this(null, null, null, null, null, null);
    }
}
