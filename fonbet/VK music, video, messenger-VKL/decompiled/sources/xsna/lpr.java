package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: SizeEntities.kt */
/* loaded from: classes4.dex */
public final class lpr {
    public int a;
    public int b;
    public final List<u0u0> c;
    public final int[] d = new int[4];

    public lpr(int i, int i2, List<u0u0> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final lpr a() {
        lpr lprVar = new lpr(this.a, this.b, rli0.B(new ulp0(new i5g(this.c), new kpr(0))));
        jw5.i(0, 0, 14, this.d, lprVar.d);
        return lprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lpr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lpr lprVar = (lpr) obj;
        return this.a == lprVar.a && this.b == lprVar.b && epx.f(this.c, lprVar.c) && Arrays.equals(this.d, lprVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + fw3.a(((this.a * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexLayoutResult(containerWidth=");
        sb.append(this.a);
        sb.append(", containerHeight=");
        sb.append(this.b);
        sb.append(", childrenCoordinates=");
        return ms9.a(')', sb, this.c);
    }
}
