package xsna;

/* compiled from: VideoStuckConfig.kt */
/* loaded from: classes11.dex */
public final class tit0 {
    public static final a c = new a();
    public final int a;
    public final int b;

    /* compiled from: VideoStuckConfig.kt */
    public static final class a {
    }

    public tit0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tit0)) {
            return false;
        }
        tit0 tit0Var = (tit0) obj;
        return this.a == tit0Var.a && this.b == tit0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStuckConfig(bufferingDetectionTimeoutMs=");
        sb.append(this.a);
        sb.append(", suppressedDetectionTimeoutMs=");
        return vu5.b(sb, this.b, ')');
    }
}
