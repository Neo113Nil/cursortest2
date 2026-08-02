package yads;

import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.odj;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class x41 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final s23 e;
    public final boolean f;
    public final String g;

    public x41(int i, int i2, String str, String str2, s23 s23Var, boolean z, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = s23Var;
        this.f = z;
        this.g = str3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x41)) {
            return false;
        }
        x41 x41Var = (x41) obj;
        return this.a == x41Var.a && this.b == x41Var.b && epx.f(this.c, x41Var.c) && epx.f(this.d, x41Var.d) && epx.f(this.e, x41Var.e) && this.f == x41Var.f && epx.f(this.g, x41Var.g);
    }

    public final int hashCode() {
        int a = k4.a(this.c, re3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        s23 s23Var = this.e;
        int b = qoy.b((hashCode + (s23Var == null ? 0 : s23Var.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String str2 = this.d;
        s23 s23Var = this.e;
        boolean z = this.f;
        String str3 = this.g;
        StringBuilder a = odj.a(i, i2, "ImageValue(width=", ", height=", ", url=");
        n6j.b(a, str, ", sizeType=", str2, ", smartCenterSettings=");
        a.append(s23Var);
        a.append(", preload=");
        a.append(z);
        a.append(", preview=");
        return i5s.a(a, str3, ")");
    }
}
