package yads;

import xsna.epx;
import xsna.h5s;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class m50 {
    public static final l50 Companion = new l50();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ m50(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, k50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return epx.f(this.a, m50Var.a) && epx.f(this.b, m50Var.b) && epx.f(this.c, m50Var.c) && epx.f(this.d, m50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return h5s.d(xe9.a("DebugPanelAppData(appId=", str, ", appVersion=", str2, ", system="), this.c, ", androidApiLevel=", this.d, ")");
    }

    public m50(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
