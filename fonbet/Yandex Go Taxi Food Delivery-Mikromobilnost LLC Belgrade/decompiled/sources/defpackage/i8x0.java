package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i8x0 implements r9x0 {
    public final vu0 a;
    public final d51 b;
    public final Integer c;

    public i8x0(vu0 vu0Var, d51 d51Var, Integer num) {
        this.a = vu0Var;
        this.b = d51Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8x0)) {
            return false;
        }
        i8x0 i8x0Var = (i8x0) obj;
        return jl40.l(this.a, i8x0Var.a) && this.b.equals(i8x0Var.b) && jl40.l(this.c, i8x0Var.c);
    }

    public final int hashCode() {
        vu0 vu0Var = this.a;
        int hashCode = (this.b.hashCode() + ((vu0Var == null ? 0 : vu0Var.hashCode()) * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddDestinationAction(addressFlow=");
        sb.append(this.a);
        sb.append(", routeType=");
        sb.append(this.b);
        sb.append(", pointIndex=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
