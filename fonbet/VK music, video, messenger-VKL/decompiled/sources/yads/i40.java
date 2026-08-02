package yads;

import xsna.epx;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class i40 {
    public final String a;
    public final String b;
    public final String c;

    public i40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return epx.f(this.a, i40Var.a) && epx.f(this.b, i40Var.b) && epx.f(this.c, i40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return i5s.a(xe9.a("DebugPanelAdUnitData(name=", str, ", format=", str2, ", adUnitId="), this.c, ")");
    }
}
