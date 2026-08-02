package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m9z0 extends aqb1 {
    public final String a;
    public final v9z0 b;
    public final ArrayList c;
    public final raz0 d;
    public final yaz0 e;

    public m9z0(String str, v9z0 v9z0Var, ArrayList arrayList, raz0 raz0Var, yaz0 yaz0Var) {
        this.a = str;
        this.b = v9z0Var;
        this.c = arrayList;
        this.d = raz0Var;
        this.e = yaz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9z0)) {
            return false;
        }
        m9z0 m9z0Var = (m9z0) obj;
        return jl40.l(this.a, m9z0Var.a) && jl40.l(this.b, m9z0Var.b) && this.c.equals(m9z0Var.c) && this.d.equals(m9z0Var.d) && jl40.l(this.e, m9z0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v9z0 v9z0Var = this.b;
        int b = unr0.b(ly3.b((hashCode + (v9z0Var == null ? 0 : v9z0Var.hashCode())) * 31, 31, this.c), 31, this.d.a);
        yaz0 yaz0Var = this.e;
        return b + (yaz0Var != null ? yaz0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DetailTimelineBubbleActionModel(title=" + this.a + ", bubble=" + this.b + ", vertical=" + this.c + ", doneButton=" + this.d + ", shareButton=" + this.e + Extension.C_BRAKE;
    }
}
