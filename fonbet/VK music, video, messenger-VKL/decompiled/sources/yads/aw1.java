package yads;

import xsna.epx;
import xsna.imi0;
import xsna.n6j;

@imi0
/* loaded from: classes10.dex */
public final class aw1 {
    public static final zv1 Companion = new zv1();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ aw1(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, yv1.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        return this.a == aw1Var.a && epx.f(this.b, aw1Var.b) && epx.f(this.c, aw1Var.c) && epx.f(this.d, aw1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k4.a(this.c, k4.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        StringBuilder sb = new StringBuilder("MobileAdsSdkLog(timestamp=");
        sb.append(j);
        sb.append(", type=");
        sb.append(str);
        n6j.b(sb, ", tag=", str2, ", text=", str3);
        sb.append(")");
        return sb.toString();
    }

    public aw1(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
