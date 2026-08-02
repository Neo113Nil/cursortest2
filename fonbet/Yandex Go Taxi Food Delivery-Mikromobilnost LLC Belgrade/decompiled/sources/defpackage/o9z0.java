package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o9z0 extends q9z0 {
    public final String a;
    public final w9z0 b;
    public final ArrayList c;
    public final saz0 d;
    public final zaz0 e;

    public o9z0(String str, w9z0 w9z0Var, ArrayList arrayList, saz0 saz0Var, zaz0 zaz0Var) {
        this.a = str;
        this.b = w9z0Var;
        this.c = arrayList;
        this.d = saz0Var;
        this.e = zaz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9z0)) {
            return false;
        }
        o9z0 o9z0Var = (o9z0) obj;
        return jl40.l(this.a, o9z0Var.a) && jl40.l(this.b, o9z0Var.b) && this.c.equals(o9z0Var.c) && this.d.equals(o9z0Var.d) && jl40.l(this.e, o9z0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w9z0 w9z0Var = this.b;
        int b = unr0.b(ly3.b((hashCode + (w9z0Var == null ? 0 : w9z0Var.hashCode())) * 31, 31, this.c), 31, this.d.a);
        zaz0 zaz0Var = this.e;
        return b + (zaz0Var != null ? zaz0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DetailTimelineBubbleActionState(title=" + this.a + ", bubble=" + this.b + ", vertical=" + this.c + ", doneButton=" + this.d + ", shareButton=" + this.e + Extension.C_BRAKE;
    }
}
