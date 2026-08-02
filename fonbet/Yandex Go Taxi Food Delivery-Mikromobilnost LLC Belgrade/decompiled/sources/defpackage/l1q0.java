package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class l1q0 extends o1q0 {
    public final String a;
    public final ArrayList b;

    public l1q0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1q0)) {
            return false;
        }
        l1q0 l1q0Var = (l1q0) obj;
        return jl40.l(this.a, l1q0Var.a) && this.b.equals(l1q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("Accordion(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
