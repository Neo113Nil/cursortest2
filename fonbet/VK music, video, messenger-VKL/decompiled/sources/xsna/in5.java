package xsna;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes12.dex */
public final class in5 extends r000 {
    public final long a;

    public in5(long j) {
        this.a = j;
    }

    @Override // xsna.r000
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof r000) && this.a == ((r000) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return efz.b(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
