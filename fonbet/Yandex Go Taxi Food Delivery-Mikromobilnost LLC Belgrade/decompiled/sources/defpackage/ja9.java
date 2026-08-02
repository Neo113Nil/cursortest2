package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ja9 {
    public final String a;
    public final ArrayList b;

    public ja9(String str, ArrayList arrayList) {
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
        if (!(obj instanceof ja9)) {
            return false;
        }
        ja9 ja9Var = (ja9) obj;
        return jl40.l(this.a, ja9Var.a) && this.b.equals(ja9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("ChangeDateTimeOption(date=", this.a, ", timeslots=", Extension.C_BRAKE, this.b);
    }
}
