package yads;

import xsna.epx;
import xsna.rzl;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class uc1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public uc1(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc1)) {
            return false;
        }
        uc1 uc1Var = (uc1) obj;
        return epx.f(this.a, uc1Var.a) && epx.f(this.b, uc1Var.b) && this.c == uc1Var.c && this.d == uc1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + re3.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rzl.a(this.c, this.d, ", width=", ")", xe9.a("InteractiveCreativeFile(html=", this.a, ", mimeType=", this.b, ", height="));
    }
}
