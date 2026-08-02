package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class o6z {
    public final jpt0 a;
    public final jpt0 b;
    public final td2 c;
    public final td2 d;

    public o6z(jpt0 jpt0Var, jpt0 jpt0Var2, td2 td2Var, td2 td2Var2) {
        this.a = jpt0Var;
        this.b = jpt0Var2;
        this.c = td2Var;
        this.d = td2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6z)) {
            return false;
        }
        o6z o6zVar = (o6z) obj;
        return jl40.l(this.a, o6zVar.a) && jl40.l(this.b, o6zVar.b) && jl40.l(this.c, o6zVar.c) && jl40.l(this.d, o6zVar.d);
    }

    public final int hashCode() {
        jpt0 jpt0Var = this.a;
        int hashCode = (jpt0Var == null ? 0 : Double.hashCode(jpt0Var.a)) * 31;
        jpt0 jpt0Var2 = this.b;
        int hashCode2 = (hashCode + (jpt0Var2 == null ? 0 : Double.hashCode(jpt0Var2.a))) * 31;
        td2 td2Var = this.c;
        int hashCode3 = (hashCode2 + (td2Var == null ? 0 : Double.hashCode(td2Var.a))) * 31;
        td2 td2Var2 = this.d;
        return hashCode3 + (td2Var2 != null ? Double.hashCode(td2Var2.a) : 0);
    }

    public final String toString() {
        return "Movement(speed=" + this.a + ", speedAccuracy=" + this.b + ", bearing=" + this.c + ", bearingAccuracy=" + this.d + Extension.C_BRAKE;
    }
}
