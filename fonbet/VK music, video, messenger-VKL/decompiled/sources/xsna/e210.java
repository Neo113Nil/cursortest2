package xsna;

/* compiled from: RepliesAdditionalInfo.kt */
/* loaded from: classes18.dex */
public final class e210 implements b2g0 {
    public final long a;

    public e210(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e210) && this.a == ((e210) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("MarketItemRepliesAdditionalInfo(productId="));
    }
}
