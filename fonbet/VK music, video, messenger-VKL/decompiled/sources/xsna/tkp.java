package xsna;

/* compiled from: EndOverlayBannerAdConfig.kt */
/* loaded from: classes11.dex */
public final class tkp {
    public static final a b = new a();
    public final long a;

    /* compiled from: EndOverlayBannerAdConfig.kt */
    public static final class a {
    }

    public tkp(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkp) && this.a == ((tkp) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("EndOverlayBannerAdConfig(timeToEnd="));
    }
}
