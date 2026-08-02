package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ax30 {
    public final String a;
    public final ArrayList b;

    public ax30(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax30)) {
            return false;
        }
        ax30 ax30Var = (ax30) obj;
        return jl40.l(this.a, ax30Var.a) && this.b.equals(ax30Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return n.k("RouteParams(id=", this.a, ", vehicles=", Extension.C_BRAKE, this.b);
    }
}
