package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q05 implements t05 {
    public final rr51 a;
    public final List b;
    public final stz0 c;

    public q05(rr51 rr51Var, List list, stz0 stz0Var) {
        this.a = rr51Var;
        this.b = list;
        this.c = stz0Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final stz0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q05)) {
            return false;
        }
        q05 q05Var = (q05) obj;
        return jl40.l(this.a, q05Var.a) && jl40.l(this.b, q05Var.b) && this.c.equals(q05Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(divData=" + this.a + ", localVariables=" + this.b + ", toolbarState=" + this.c + Extension.C_BRAKE;
    }
}
