package xsna;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes.dex */
public final class vn5 extends frk0 {
    public final long a;
    public final long b;
    public final long c;

    public vn5(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // xsna.frk0
    public final long a() {
        return this.b;
    }

    @Override // xsna.frk0
    public final long b() {
        return this.a;
    }

    @Override // xsna.frk0
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof frk0)) {
            return false;
        }
        frk0 frk0Var = (frk0) obj;
        return this.a == frk0Var.b() && this.b == frk0Var.a() && this.c == frk0Var.c();
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return efz.b(this.c, "}", sb);
    }
}
