package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n3q0 implements e6v {
    public static final n3q0 d = new n3q0("", 0, EmptyList.a);
    public final String a;
    public final int b;
    public final List c;

    public n3q0(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3q0)) {
            return false;
        }
        n3q0 n3q0Var = (n3q0) obj;
        return this.a.equals(n3q0Var.a) && this.b == n3q0Var.b && jl40.l(this.c, n3q0Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ly3.s(b64.u(this.b, "SectionScrollableModel(id=", this.a, ", size=", ", models="), this.c, Extension.C_BRAKE);
    }
}
