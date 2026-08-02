package defpackage;

/* loaded from: classes.dex */
public final class i84 extends y2u0 {
    public final long a;
    public final long b;
    public final long c;

    public i84(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.y2u0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.y2u0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.y2u0
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y2u0)) {
            return false;
        }
        y2u0 y2u0Var = (y2u0) obj;
        return this.a == y2u0Var.b() && this.b == y2u0Var.a() && this.c == y2u0Var.c();
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return oyr.n(this.c, "}", sb);
    }
}
