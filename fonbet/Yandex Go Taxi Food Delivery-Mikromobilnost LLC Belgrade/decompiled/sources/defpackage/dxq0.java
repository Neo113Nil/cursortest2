package defpackage;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class dxq0 implements gxq0 {
    public final long a;
    public final v180 b;

    public dxq0(long j, v180 v180Var) {
        this.a = j;
        this.b = v180Var;
    }

    public final v180 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxq0)) {
            return false;
        }
        dxq0 dxq0Var = (dxq0) obj;
        return this.a == dxq0Var.a && this.b.equals(dxq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.a;
        StringBuilder sb = new StringBuilder("Foreground(creationTime=");
        sb.append(j);
        sb.append(", notification=");
        sb.append(this.b);
        return g8e.l(uptimeMillis - j, ") created ", " ms ago", sb);
    }
}
