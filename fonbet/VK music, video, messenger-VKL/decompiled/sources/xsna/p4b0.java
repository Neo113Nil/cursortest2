package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: PlayerStateMeta.kt */
/* loaded from: classes3.dex */
public final class p4b0 {
    public static final Object e = msy.a(LazyThreadSafetyMode.NONE, new d4(29));
    public final boolean a;
    public final q4b0 b;
    public final n4b0 c;
    public final long d;

    public p4b0(boolean z, q4b0 q4b0Var, n4b0 n4b0Var, long j) {
        this.a = z;
        this.b = q4b0Var;
        this.c = n4b0Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p4b0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p4b0 p4b0Var = (p4b0) obj;
        return this.a == p4b0Var.a && epx.f(this.b, p4b0Var.b) && epx.f(this.c, p4b0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerStateMeta(isAds=");
        sb.append(this.a);
        sb.append(", playableMeta=");
        sb.append(this.b);
        sb.append(", adsMeta=");
        sb.append(this.c);
        sb.append(", playingStartedTimestampMs=");
        return vu5.a(')', this.d, sb);
    }
}
