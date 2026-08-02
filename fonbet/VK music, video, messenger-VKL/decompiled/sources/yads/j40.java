package yads;

import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class j40 {
    public final String a;
    public final String b;
    public final String c;
    public final r40 d;

    public j40(String str, String str2, String str3, r40 r40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return epx.f(this.a, j40Var.a) && epx.f(this.b, j40Var.b) && epx.f(this.c, j40Var.c) && epx.f(this.d, j40Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        r40 r40Var = this.d;
        StringBuilder a = xe9.a("DebugPanelAdUnitFullData(name=", str, ", format=", str2, ", adUnitId=");
        a.append(str3);
        a.append(", mediation=");
        a.append(r40Var);
        a.append(")");
        return a.toString();
    }
}
