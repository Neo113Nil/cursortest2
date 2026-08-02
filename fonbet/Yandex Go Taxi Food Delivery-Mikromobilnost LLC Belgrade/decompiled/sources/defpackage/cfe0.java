package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cfe0 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public cfe0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfe0)) {
            return false;
        }
        cfe0 cfe0Var = (cfe0) obj;
        return jl40.l(this.a, cfe0Var.a) && this.b.equals(cfe0Var.b) && jl40.l(this.c, cfe0Var.c);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(x4e.m("RoutePointLayout(iconTag=", this.a, ", fields=", ", metricaLabel=", this.b), this.c, Extension.C_BRAKE);
    }
}
