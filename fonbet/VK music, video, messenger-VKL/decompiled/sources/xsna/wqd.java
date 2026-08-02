package xsna;

/* compiled from: ClipsDiskCacheLoadConfig.kt */
/* loaded from: classes11.dex */
public final class wqd {
    public static final a d = new a();
    public static final wqd e = new wqd(3000, 104857600, 94371840);
    public final long a;
    public final long b;
    public final long c;

    /* compiled from: ClipsDiskCacheLoadConfig.kt */
    public static final class a {
    }

    public wqd(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqd)) {
            return false;
        }
        wqd wqdVar = (wqd) obj;
        return this.a == wqdVar.a && this.b == wqdVar.b && this.c == wqdVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDiskCacheLoadConfig(endPositionMs=");
        sb.append(this.a);
        sb.append(", maxCacheSizeBytes=");
        sb.append(this.b);
        sb.append(", targetLruEnforceBytes=");
        return vu5.a(')', this.c, sb);
    }
}
