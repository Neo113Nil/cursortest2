package xsna;

/* compiled from: VideoAppStabilityConfig.kt */
/* loaded from: classes11.dex */
public final class x1s0 {
    public static final a c = new a();
    public final boolean a;
    public final boolean b;

    /* compiled from: VideoAppStabilityConfig.kt */
    public static final class a {
    }

    public x1s0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1s0)) {
            return false;
        }
        x1s0 x1s0Var = (x1s0) obj;
        return this.a == x1s0Var.a && this.b == x1s0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAppStabilityConfig(blockPip=");
        sb.append(this.a);
        sb.append(", blockBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public x1s0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
