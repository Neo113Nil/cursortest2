package yads;

import xsna.epx;
import xsna.h5s;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class ex0 {
    public static final dx0 Companion = new dx0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ex0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, cx0.a.getDescriptor());
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
        if (!(obj instanceof ex0)) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return epx.f(this.a, ex0Var.a) && epx.f(this.b, ex0Var.b) && epx.f(this.c, ex0Var.c) && epx.f(this.d, ex0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return h5s.d(xe9.a("FontUrls(regular=", str, ", bold=", str2, ", light="), this.c, ", medium=", this.d, ")");
    }
}
