package xsna;

/* compiled from: BBA0Config.kt */
/* loaded from: classes11.dex */
public final class ru5 {
    public static final a e = new a();
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    /* compiled from: BBA0Config.kt */
    public static final class a {
    }

    public ru5(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru5)) {
            return false;
        }
        ru5 ru5Var = (ru5) obj;
        return this.a == ru5Var.a && this.b == ru5Var.b && this.c == ru5Var.c && this.d == ru5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BBA0Config(reservoirMs=");
        sb.append(this.a);
        sb.append(", cushionMs=");
        sb.append(this.b);
        sb.append(", minBufferedDurationMsForUsing=");
        sb.append(this.c);
        sb.append(", disableSegmentsControl=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
