package xsna;

/* compiled from: WebsocketAnalyticsConfig.kt */
/* loaded from: classes5.dex */
public final class qjx0 {
    public static final a c = new a();
    public final boolean a;
    public final long b;

    /* compiled from: WebsocketAnalyticsConfig.kt */
    public static final class a {
    }

    public qjx0(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjx0)) {
            return false;
        }
        qjx0 qjx0Var = (qjx0) obj;
        return this.a == qjx0Var.a && this.b == qjx0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Long.hashCode(this.b) + (r0 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebsocketAnalyticsConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", checkIntervalMs=");
        return vu5.a(')', this.b, sb);
    }
}
