package xsna;

/* compiled from: StuckConfig.kt */
/* loaded from: classes8.dex */
public final class psm0 {
    public final int a;
    public final int b;

    public psm0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psm0)) {
            return false;
        }
        psm0 psm0Var = (psm0) obj;
        return this.a == psm0Var.a && this.b == psm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sl9.c(this.a, this.b, "StuckConfig(bufferingDetectionTimeoutMs=", ", suppressedDetectionTimeoutMs=", ")");
    }

    public /* synthetic */ psm0(int i) {
        this(600000, 600000);
    }

    public psm0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
