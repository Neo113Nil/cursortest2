package xsna;

import java.util.List;

/* compiled from: ReactionPickerContent.kt */
/* loaded from: classes2.dex */
public final class xfu {
    public final int a;
    public final List<yaw> b;
    public final boolean c;
    public final int d;

    public xfu(int i, int i2, boolean z, List list) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfu)) {
            return false;
        }
        xfu xfuVar = (xfu) obj;
        return this.a == xfuVar.a && epx.f(this.b, xfuVar.b) && this.c == xfuVar.c && this.d == xfuVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b(fw3.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridMetrics(spanCount=");
        sb.append(this.a);
        sb.append(", displayItems=");
        sb.append(this.b);
        sb.append(", showShowMore=");
        sb.append(this.c);
        sb.append(", centeringStartPaddingPx=");
        return vu5.b(sb, this.d, ')');
    }
}
