package xsna;

/* compiled from: CronetExecutorConfig.kt */
/* loaded from: classes11.dex */
public final class kek {
    public static final a c = new a();
    public static final kek d = new kek(0);
    public final long a;
    public final long b;

    /* compiled from: CronetExecutorConfig.kt */
    public static final class a {
    }

    public kek() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kek)) {
            return false;
        }
        kek kekVar = (kek) obj;
        return this.a == kekVar.a && this.b == kekVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CronetExecutorConfig(executorRecyclerAliveTimeMs=");
        sb.append(this.a);
        sb.append(", executorAliveTimeMs=");
        return vu5.a(')', this.b, sb);
    }

    public /* synthetic */ kek(int i) {
        this(100L, 1000L);
    }

    public kek(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
