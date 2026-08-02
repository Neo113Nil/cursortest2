package yads;

import xsna.epx;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class r90 extends ba0 {
    public final String a;
    public final String b;
    public final String c;

    public r90(String str, String str2, String str3) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return epx.f(this.a, r90Var.a) && epx.f(this.b, r90Var.b) && epx.f(this.c, r90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return i5s.a(xe9.a("AdUnit(name=", str, ", format=", str2, ", id="), this.c, ")");
    }
}
