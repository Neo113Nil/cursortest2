package xsna;

/* compiled from: FeedApplovinPreloadConfig.kt */
/* loaded from: classes11.dex */
public final class owq {
    public static final a b = new a();
    public static final owq c = new owq(0);
    public final int a;

    /* compiled from: FeedApplovinPreloadConfig.kt */
    public static final class a {
    }

    public owq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owq) && this.a == ((owq) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FeedApplovinPreloadConfig(count="), this.a, ')');
    }
}
