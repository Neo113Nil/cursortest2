package defpackage;

/* loaded from: classes10.dex */
public final class c84 {
    public final long a;
    public final long b;
    public final o34 c;

    public c84(long j, long j2, o34 o34Var) {
        this.a = j;
        this.b = j2;
        this.c = o34Var;
    }

    public static c84 a(long j, long j2, o34 o34Var) {
        d6z.m("duration must be positive value.", j >= 0);
        d6z.m("bytes must be positive value.", j2 >= 0);
        return new c84(j, j2, o34Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        c84 c84Var = (c84) obj;
        return this.a == c84Var.a && this.b == c84Var.b && this.c.equals(c84Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
