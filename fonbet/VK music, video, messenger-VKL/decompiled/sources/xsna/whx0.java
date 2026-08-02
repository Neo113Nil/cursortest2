package xsna;

/* compiled from: WebSocketRateLimitConfig.kt */
/* loaded from: classes11.dex */
public final class whx0 {
    public static final a d = new a();
    public static final whx0 e = new whx0(0);
    public final boolean a;
    public final int b;
    public final long c;

    /* compiled from: WebSocketRateLimitConfig.kt */
    public static final class a {
    }

    public whx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whx0)) {
            return false;
        }
        whx0 whx0Var = (whx0) obj;
        return this.a == whx0Var.a && this.b == whx0Var.b && this.c == whx0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketRateLimitConfig(rateLimitEnabled=");
        sb.append(this.a);
        sb.append(", rateLimitMaxRequests=");
        sb.append(this.b);
        sb.append(", rateLimitWindowMs=");
        return vu5.a(')', this.c, sb);
    }

    public /* synthetic */ whx0(int i) {
        this(30, 3000L, false);
    }

    public whx0(int i, long j, boolean z) {
        this.a = z;
        this.b = i;
        this.c = j;
    }
}
