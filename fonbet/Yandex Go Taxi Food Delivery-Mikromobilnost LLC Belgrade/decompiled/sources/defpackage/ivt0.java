package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ivt0 {
    public final tf51 a;
    public final tf51 b;
    public final Boolean c;

    public ivt0(tf51 tf51Var, tf51 tf51Var2, Boolean bool) {
        this.a = tf51Var;
        this.b = tf51Var2;
        this.c = bool;
    }

    public final Boolean a() {
        return this.c;
    }

    public final tf51 b() {
        return this.b;
    }

    public final tf51 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivt0)) {
            return false;
        }
        ivt0 ivt0Var = (ivt0) obj;
        return this.a.equals(ivt0Var.a) && this.b.equals(ivt0Var.b) && jl40.l(this.c, ivt0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfoLimit(total=");
        sb.append(this.a);
        sb.append(", remaining=");
        sb.append(this.b);
        sb.append(", hasActiveSplit=");
        return nzs.d(sb, this.c, Extension.C_BRAKE);
    }
}
