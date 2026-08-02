package yads;

import com.ironsource.X3;
import xsna.efz;

/* loaded from: classes10.dex */
public final class by2 {
    public static final by2 c = new by2(0, 0);
    public final long a;
    public final long b;

    public by2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && by2.class == obj.getClass()) {
            by2 by2Var = (by2) obj;
            if (this.a == by2Var.a && this.b == by2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return efz.b(this.b, X3.j.e, sb);
    }
}
