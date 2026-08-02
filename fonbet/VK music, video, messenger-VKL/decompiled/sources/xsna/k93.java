package xsna;

/* compiled from: AppStartReporterDataCallback.kt */
/* loaded from: classes11.dex */
public final class k93 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public k93(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k93)) {
            return false;
        }
        k93 k93Var = (k93) obj;
        return this.a == k93Var.a && this.b == k93Var.b && this.c == k93Var.c && this.d == k93Var.d && this.e == k93Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageSize(internalSizeMb=");
        sb.append(this.a);
        sb.append(", externalSizeMb=");
        sb.append(this.b);
        sb.append(", videoDownloadsSizeMb=");
        sb.append(this.c);
        sb.append(", offlineMusicInternalSizeMb=");
        sb.append(this.d);
        sb.append(", offlineMusicExternalSizeMb=");
        return vu5.a(')', this.e, sb);
    }
}
