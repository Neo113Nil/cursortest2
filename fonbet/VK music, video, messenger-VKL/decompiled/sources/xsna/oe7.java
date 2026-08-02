package xsna;

import android.graphics.ColorFilter;

/* compiled from: ColorFilter.kt */
/* loaded from: classes11.dex */
public final class oe7 extends d6g {
    public final long b;
    public final int c;

    public oe7(long j, int i, ColorFilter colorFilter) {
        super(colorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe7)) {
            return false;
        }
        oe7 oe7Var = (oe7) obj;
        return l5g.d(this.b, oe7Var.b) && this.c == oe7Var.c;
    }

    public final int hashCode() {
        int i = l5g.l;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        dn.h(this.b, ", blendMode=", sb);
        sb.append((Object) ne7.F(this.c));
        sb.append(')');
        return sb.toString();
    }
}
