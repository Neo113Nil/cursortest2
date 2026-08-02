package xsna;

/* compiled from: DOHConfig.kt */
/* loaded from: classes11.dex */
public final class zrk {
    public static final a b = new a();
    public static final zrk c = new zrk(0);
    public final long a;

    /* compiled from: DOHConfig.kt */
    public static final class a {
    }

    public zrk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrk) && this.a == ((zrk) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("DOHConfig(connectionTimeout="));
    }

    public /* synthetic */ zrk(int i) {
        this(10000L);
    }

    public zrk(long j) {
        this.a = j;
    }
}
