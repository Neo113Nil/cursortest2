package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jw51 implements nw51 {
    public final mv51 a;
    public final ArrayList b;
    public final ArrayList c;

    public jw51(mv51 mv51Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = mv51Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw51)) {
            return false;
        }
        jw51 jw51Var = (jw51) obj;
        return jl40.l(this.a, jw51Var.a) && this.b.equals(jw51Var.b) && this.c.equals(jw51Var.c);
    }

    public final int hashCode() {
        mv51 mv51Var = this.a;
        return this.c.hashCode() + ly3.b((mv51Var == null ? 0 : mv51Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Normal(balance=");
        sb.append(this.a);
        sb.append(", transactions=");
        sb.append(this.b);
        sb.append(", cards=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
