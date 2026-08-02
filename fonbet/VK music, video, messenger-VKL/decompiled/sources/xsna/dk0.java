package xsna;

/* compiled from: AdaptiveFeedMediaConfig.kt */
/* loaded from: classes11.dex */
public final class dk0 {
    public static final a c = new a();
    public final int a;
    public final int b;

    /* compiled from: AdaptiveFeedMediaConfig.kt */
    public static final class a {
    }

    public dk0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return this.a == dk0Var.a && this.b == dk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdaptiveFeedMediaConfig(window=");
        sb.append(this.a);
        sb.append(", mode=");
        return vu5.b(sb, this.b, ')');
    }
}
