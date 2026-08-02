package defpackage;

import android.graphics.BlendModeColorFilter;

/* loaded from: classes10.dex */
public final class c36 extends wec {
    public final long b;
    public final int c;

    public c36(long j, int i) {
        super(new BlendModeColorFilter(rzo.X(j), sta1.b(i)));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c36)) {
            return false;
        }
        c36 c36Var = (c36) obj;
        return ldc.c(this.b, c36Var.b) && this.c == c36Var.c;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        xvz.w(this.b, ", blendMode=", sb);
        sb.append((Object) uh6.U(this.c));
        sb.append(')');
        return sb.toString();
    }
}
