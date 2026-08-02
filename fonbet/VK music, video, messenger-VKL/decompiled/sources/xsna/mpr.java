package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: SizeEntities.kt */
/* loaded from: classes18.dex */
public final class mpr {
    public int a;
    public int b;
    public final List<v0u0> c;
    public final int[] d = new int[4];

    public mpr(int i, int i2, List<v0u0> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final mpr a() {
        mpr mprVar = new mpr(this.a, this.b, rli0.B(new ulp0(new i5g(this.c), new f57(23))));
        jw5.i(0, 0, 14, this.d, mprVar.d);
        return mprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mpr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mpr mprVar = (mpr) obj;
        return this.a == mprVar.a && this.b == mprVar.b && epx.f(this.c, mprVar.c) && Arrays.equals(this.d, mprVar.d);
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
