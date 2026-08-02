package yads;

import xsna.epx;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class e40 {
    public static final d40 Companion = new d40();
    public final String a;
    public final String b;
    public final String c;
    public final m40 d;

    public /* synthetic */ e40(int i, String str, String str2, String str3, m40 m40Var) {
        if (7 != (i & 7)) {
            xsna.sp.x(i, 7, c40.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = m40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return epx.f(this.a, e40Var.a) && epx.f(this.b, e40Var.b) && epx.f(this.c, e40Var.c) && epx.f(this.d, e40Var.d);
    }

    public final int hashCode() {
        int a = k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
        m40 m40Var = this.d;
        return a + (m40Var == null ? 0 : m40Var.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        m40 m40Var = this.d;
        StringBuilder a = xe9.a("DebugPanelAdUnit(name=", str, ", format=", str2, ", adUnitId=");
        a.append(str3);
        a.append(", mediation=");
        a.append(m40Var);
        a.append(")");
        return a.toString();
    }
}
