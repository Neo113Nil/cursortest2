package xsna;

import java.util.List;

/* compiled from: SizeEntities.kt */
/* loaded from: classes18.dex */
public final class vor {
    public int a;
    public int b;
    public int c;
    public int d;
    public List<t0u0> e;
    public int f;
    public int g;
    public int h;

    public vor() {
        throw null;
    }

    public vor(int i, int i2, int i3, int i4, List list, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = list;
        this.f = i5;
        this.g = i6;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vor)) {
            return false;
        }
        vor vorVar = (vor) obj;
        return this.a == vorVar.a && this.b == vorVar.b && this.c == vorVar.c && this.d == vorVar.d && epx.f(this.e, vorVar.e) && this.f == vorVar.f && this.g == vorVar.g && this.h == vorVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, fw3.a(shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31);
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
        sb.append(this.g);
        sb.append(", preferredHeight=");
        return vu5.b(sb, this.h, ')');
    }
}
