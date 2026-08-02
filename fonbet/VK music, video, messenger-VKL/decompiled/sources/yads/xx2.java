package yads;

import com.ironsource.X3;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class xx2 {
    public final by2 a;
    public final by2 b;

    public xx2(by2 by2Var) {
        this(by2Var, by2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xx2.class == obj.getClass()) {
            xx2 xx2Var = (xx2) obj;
            if (this.a.equals(xx2Var.a) && this.b.equals(xx2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.a);
        if (this.a.equals(this.b)) {
            str = "";
        } else {
            str = ", " + this.b;
        }
        return i5s.a(sb, str, X3.j.e);
    }

    public xx2(by2 by2Var, by2 by2Var2) {
        this.a = (by2) ni.a(by2Var);
        this.b = (by2) ni.a(by2Var2);
    }
}
