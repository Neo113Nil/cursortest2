package xsna;

import java.util.List;

/* compiled from: SizeEntities.kt */
/* loaded from: classes4.dex */
public final class uor {
    public int a;
    public int b;
    public int c;
    public int d;
    public List<s0u0> e;
    public int f;
    public int g;

    public uor(int i, int i2, int i3, int i4, List<s0u0> list, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = list;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uor)) {
            return false;
        }
        uor uorVar = (uor) obj;
        return this.a == uorVar.a && this.b == uorVar.b && this.c == uorVar.c && this.d == uorVar.d && epx.f(this.e, uorVar.e) && this.f == uorVar.f && this.g == uorVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + shy.a(this.f, fw3.a(shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexLayoutArgs(containerWidthMeasureSpec=");
        sb.append(this.a);
        sb.append(", containerHeightMeasureSpec=");
        sb.append(this.b);
        sb.append(", containerMaxWidth=");
        sb.append(this.c);
        sb.append(", containerMaxHeight=");
        sb.append(this.d);
        sb.append(", childrenRequestSizes=");
        sb.append(this.e);
        sb.append(", spacing=");
        sb.append(this.f);
        sb.append(", minSize=");
        return vu5.b(sb, this.g, ')');
    }
}
